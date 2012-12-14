package presentation;

import java.awt.FlowLayout;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JPanel;

import controller.CCarte;
import controller.CSabot;

public class PSabot extends JPanel {
	
	private CSabot cs;
	private PTasDeCartes cachees, visibles;
	private SabotListener sl;
	
	// DRAG
	private DragGestureListener dgl;
	private DragGestureEvent initialEvent;
	private DragSource ds;
	private DragSourceListener dsl;
	private DragSourceMotionListener dsml;
	private PTasDeCartes transfer;

	public PSabot(final CSabot cs, PTasDeCartes cachees, final PTasDeCartes visibles) {
		this.cs = cs;
		this.cachees = cachees;
		this.visibles = visibles;
		this.add(cachees);
		this.add(visibles);
		this.setSize(80+(20*26),120);
		this.setPreferredSize(this.getSize());
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setOpaque(false);

		sl = new SabotListener();
		setVisible(true);
		
		// DRAG
				dgl = new DragGestureListener() {
					@Override
					public void dragGestureRecognized(DragGestureEvent dge) {
						CCarte cc = null;
						PCarte pc = null;
						try {
							initialEvent = dge;
							pc = (PCarte) visibles.getComponentAt(dge.getDragOrigin());
							cc = pc.getControle();
							cs.p2c_debutDnD(cc);
						}  catch (Exception e) { 
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
								cs.p2c_dragDropEnd(dsde.getDropSuccess(), (PTasDeCartes) dsde.getDragSourceContext().getTransferable().getTransferData(new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType)));
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
						int x = dsde.getLocation().x - 45;
						int y = dsde.getLocation().y - 80;
						transfer.setLocation(x , y);
						repaint();
					}
				};
				
				ds.createDefaultDragGestureRecognizer(visibles, DnDConstants.ACTION_MOVE, dgl);
				ds.addDragSourceMotionListener(dsml);
	}

	public void activerRetournerCarte() {
		cachees.addMouseListener(sl);
	}

	public void desactiverRetournerCarte() {
		cachees.removeMouseListener(sl);
	}

	public void activerRetournerSabot() {
		cachees.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				try {
					desactiverRetournerCarte();
					cs.retourner();
					activerRetournerCarte();
					cachees.removeMouseListener(this);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});	
	}
	
	private class SabotListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			cs.retourner3Carte();
		}
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
		// TODO Auto-generated method stub
		
	}

}
