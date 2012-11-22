package presentation;

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
import java.io.IOException;

import javax.swing.JPanel;

import controller.CCarte;
import controller.CColonne;

public class PColonne extends JPanel {
	
	private CColonne c;
	private PTasDeCartes cachees, visibles;
	
	private DragGestureListener dgl;
	private DragGestureEvent initialEvent;
	private DragSource ds;
	private DragSourceListener dsl;
	private DragSourceMotionListener dsml;
	private PTasDeCartes transfer;
	
	public PColonne(CColonne _c, PTasDeCartes _cachees, PTasDeCartes _visibles) {
		this.c = _c;
		this.cachees = _cachees;
		this.visibles = _visibles;
		
		setLayout(null);
		
		add(visibles);
		add(cachees);
		
		visibles.setLocation(cachees.getX(), cachees.getHeight() - 25);
		
//		cachees.setSize(new Dimension(80, 1000));
//		visibles.setSize(cachees.getHeight(), cachees.getHeight() + 25);
		setVisible(true);
		
		
		dgl = new DragGestureListener() {
			@Override
			public void dragGestureRecognized(DragGestureEvent dge) {
				CCarte cc = null;
				PCarte pc = null;
				try {
					initialEvent = dge;
					pc = (PCarte) visibles.getComponentAt(dge.getDragOrigin());
					cc = pc.getControle();
					c.p2c_debutDnD(cc);
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
					c.p2c_dragDropEnd(dsde.getDropSuccess(), (PTasDeCartes) dsde.getDragSourceContext().getTransferable().getTransferData(null));
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
				int x = dsde.getLocation().x - initialEvent.getDragOrigin().x;
				int y = dsde.getLocation().y - initialEvent.getDragOrigin().y;
				transfer.setLocation(x , y);
				repaint();
			}
		};
		
		ds.createDefaultDragGestureRecognizer(visibles, DnDConstants.ACTION_MOVE, dgl);
		ds.addDragSourceMotionListener(dsml);
	}
	
	public void empiler(PCarte pc) {
		visibles.empiler(pc);
	}

	public void depiler(PCarte pc) {
		visibles.depiler(pc);
	}

	public void c2p_debutDnDOK(PTasDeCartes transfer) {
		if (transfer != null) {
			this.transfer = transfer;
			add(transfer, 0);
			ds.startDrag(initialEvent, ds.DefaultMoveDrop, transfer, dsl);
			repaint();
		}
	}

	public void c2p_debutDnDNull() {
		// TODO Auto-generated method stub
		
	}

}
