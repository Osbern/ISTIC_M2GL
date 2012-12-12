package presentation;

import java.awt.Color;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;

import controller.CTasDeCartes;
import controller.CTasDeCartesColorees;
import controller.ICTasDeCartes;

public class PTasDeCartesColorees extends PTasDeCartes {

	private CTasDeCartesColorees ctdcc;

	private DropTarget dt;
	private DropTargetListener dtl;
	private DropTargetDropEvent finalEv;

	public PTasDeCartesColorees(ICTasDeCartes cTas) {
		super(cTas);
		ctdcc = (CTasDeCartesColorees) cTas;

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

	public void c2p_showNeutre() {
		setBackground(Color.GREEN);
	}

	public void c2p_finDnDOK() {
		finalEv.acceptDrop(DnDConstants.ACTION_MOVE);
		finalEv.getDropTargetContext().dropComplete(true);
		System.out.println("OK");
	}

	public void c2p_finDnDKO() {
		finalEv.rejectDrop();
		System.out.println("KO");
	}

	public void c2p_showEmpilable() {
		setBackground(Color.GREEN);
	}

	public void c2p_showNotEmpilable() {
		setBackground(Color.RED);
	}

}
