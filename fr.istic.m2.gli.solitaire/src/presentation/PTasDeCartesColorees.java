package presentation;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTargetDropEvent;
import java.io.IOException;

import controller.CTasDeCartes;
import controller.CTasDeCartesColorees;
import controller.ICTasDeCartes;

public class PTasDeCartesColorees extends PTasDeCartes {
	
	private CTasDeCartesColorees ctdcc;
	private DropTargetDropEvent finalEv;
	
	public PTasDeCartesColorees(ICTasDeCartes cTas) {
		super(cTas);
		ctdcc = (CTasDeCartesColorees) cTas;
	}
	
	public void drop(DropTargetDropEvent dtde) {
		finalEv = dtde;
		try {
			ctdcc.p2c_drop((CTasDeCartes) ((PTasDeCartes) dtde.getTransferable().getTransferData(new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType))).getControle());
		} catch (UnsupportedFlavorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void c2p_showNeutre() {
		repaint();
	}

	public void c2p_finDnDOK() {
		finalEv.acceptDrop(DnDConstants.ACTION_MOVE);
		finalEv.dropComplete(true);
	}

	public void c2p_finDnDKO() {
		finalEv.rejectDrop();
	}

}
