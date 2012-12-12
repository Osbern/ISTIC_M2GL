package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JPanel;

import controller.CTasDeCartes;
import controller.ICTasDeCartes;

public class PTasDeCartes extends JPanel implements Transferable {

	private ICTasDeCartes cTas;
	private int dx = 0;
	private int dy = 0;
	private int xc, yc;

	public PTasDeCartes(ICTasDeCartes cTas) {
		this.cTas = cTas;
		this.setLayout(null);

	
		this.setSize(77, 100);
		this.setPreferredSize(getSize());
		
		
		// this.setBackground(Color.GRAY);
		
		this.setVisible(true);
	}
	
	public void initialiser(){
		int size = cTas.getSize();
		int x = 77;
		int y = 100 + (size * 15);
		this.setSize(x, y);
		this.setPreferredSize(getSize());
		this.setBackground(Color.GRAY);
	}
	
	public ICTasDeCartes getControle() {
		return cTas;
	}
	
	public void setDelta(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}

	public void empiler(PCarte pc) {
		this.add(pc, 0);
		pc.setLocation(xc, yc);
		xc += dx;
		yc += dy;
		this.setSize(new Dimension(getWidth() + dx, getHeight() + dy));
		this.setPreferredSize(getSize());
	}

	public void depiler(PCarte pc) {
		this.remove(pc);
		xc -= dx;
		yc -= dy;
		this.setSize(new Dimension(getWidth() - dx, getHeight() - dy));
		this.setPreferredSize(getSize());
		validate();
		repaint();
	}

	@Override
	public DataFlavor[] getTransferDataFlavors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getTransferData(DataFlavor flavor)
			throws UnsupportedFlavorException, IOException {
		return this;
	}
}
