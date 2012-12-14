package presentation;

import java.awt.Color;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DragSourceMotionListener;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;

import javax.swing.SwingUtilities;

import controller.CCarte;
import controller.CTasDeCartes;
import controller.CTasDeCartesColorees;
import controller.ICTasDeCartes;

public class PTasDeCartesColorees extends PTasDeCartes {

	private CTasDeCartesColorees ctdcc;

	// DRAG
	private DragGestureListener dgl;
	private DragGestureEvent initialEvent;
	private DragSource ds;
	private DragSourceListener dsl;
	private DragSourceMotionListener dsml;
	private PTasDeCartes transfer;

	// DROP
	private DropTarget dt;
	private DropTargetListener dtl;
	private DropTargetDropEvent finalEv;

	public PTasDeCartesColorees(ICTasDeCartes cTas) {
		super(cTas);
		ctdcc = (CTasDeCartesColorees) cTas;
		this.setOpaque(false);

		// DRAG
		dgl = new DragGestureListener() {
			@Override
			public void dragGestureRecognized(DragGestureEvent dge) {
				CCarte cc = null;
				PCarte pc = null;
				try {
					initialEvent = dge;
					pc = (PCarte) getComponentAt(dge.getDragOrigin());
					cc = pc.getControle();
					ctdcc.p2c_debutDnD(cc);
				} catch (Exception e) {
				}
			}
		};

		ds = new DragSource();
		dsl = new DragSourceAdapter() {
			@Override
			public void dragDropEnd(DragSourceDropEvent dsde) {
				super.dragDropEnd(dsde);
				try {
					try {
						ctdcc.p2c_dragDropEnd(
								dsde.getDropSuccess(),
								(PTasDeCartes) dsde
										.getDragSourceContext()
										.getTransferable()
										.getTransferData(
												new DataFlavor(
														DataFlavor.javaJVMLocalObjectMimeType)));
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (UnsupportedFlavorException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};

		dsml = new DragSourceMotionListener() {
			@Override
			public void dragMouseMoved(DragSourceDragEvent dsde) {
				int x = dsde.getLocation().x - initialEvent.getDragOrigin().x - 5 - getWindowX();
				int y = dsde.getLocation().y - initialEvent.getDragOrigin().y - 30 - getWindowY();
				transfer.setLocation(x, y);
				repaint();
			}
		};

		ds.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_MOVE,
				dgl);
		ds.addDragSourceMotionListener(dsml);

		// DROP
		dtl = new DropTargetAdapter() {

			private PTasDeCartes transfer;

			@Override
			public void dragEnter(DropTargetDragEvent dtde) {
				try {
					transfer = (PTasDeCartes) dtde
							.getTransferable()
							.getTransferData(
									new DataFlavor(
											DataFlavor.javaJVMLocalObjectMimeType));
					ctdcc.p2c_dragEnter((CTasDeCartes) transfer.getControle());
				} catch (UnsupportedFlavorException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}

			@Override
			public void dragExit(DropTargetEvent dte) {
				ctdcc.p2c_dragExit((CTasDeCartes) transfer.getControle());
			}

			@Override
			public void drop(DropTargetDropEvent dtde) {
				finalEv = dtde;
				try {
					ctdcc.p2c_drop((CTasDeCartes) ((PTasDeCartes) dtde
							.getTransferable()
							.getTransferData(
									new DataFlavor(
											DataFlavor.javaJVMLocalObjectMimeType)))
							.getControle());
				} catch (UnsupportedFlavorException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		};
		dt = new DropTarget(this, dtl);
	}
	
	private int getWindowX() {
		return SwingUtilities.getWindowAncestor(this).getX();
	}
	
	private int getWindowY() {
		return SwingUtilities.getWindowAncestor(this).getY();
	}

	// DRAG
	public void c2p_debutDnDOK(PTasDeCartes transfer) {
		if (transfer != null) {
			this.transfer = transfer;
			getParent().getParent().add(transfer, 0);
			ds.startDrag(initialEvent, ds.DefaultMoveDrop, transfer, dsl);
			repaint();
		}
	}

	public void c2p_debutDnDNull() {

	}

	// DROP
	public void c2p_showNeutre() {
		if (!ctdcc.isVide()) {
			try {
				((CCarte) ctdcc.getSommet()).getPresentation().setBackground(Color.LIGHT_GRAY);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			setBackground(Color.GRAY);
		}
	}

	public void c2p_finDnDOK() {
		finalEv.acceptDrop(DnDConstants.ACTION_MOVE);
		finalEv.getDropTargetContext().dropComplete(true);
		repaint();
	}

	public void c2p_finDnDKO() {
		finalEv.rejectDrop();
	}

	public void c2p_showEmpilable() {
		if (!ctdcc.isVide()) {
			try {
				((CCarte) ctdcc.getSommet()).getPresentation().setBackground(Color.GREEN);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			setBackground(Color.GREEN);
		}
	}

	public void c2p_showNotEmpilable() {
		if (!ctdcc.isVide()) {
			try {
				((CCarte) ctdcc.getSommet()).getPresentation().setBackground(Color.RED);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			setBackground(Color.RED);
		}
	}

}
