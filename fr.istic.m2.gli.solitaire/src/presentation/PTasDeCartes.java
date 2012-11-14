package presentation;

import java.awt.Dimension;

import javax.swing.JPanel;

import controller.ICTasDeCartes;

public class PTasDeCartes extends JPanel {

	private ICTasDeCartes cTas;
	private int dx = 0;
	private int dy = 0;
	private int xc, yc;

	public PTasDeCartes(ICTasDeCartes cTas) {
		this.cTas = cTas;
		this.setLayout(null);

		this.setSize(new Dimension(80, 100));
		this.setPreferredSize(getSize());
		this.setVisible(true);
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
}
