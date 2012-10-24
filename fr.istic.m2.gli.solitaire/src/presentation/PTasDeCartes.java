package presentation;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import controller.CTasDeCartes;

public class PTasDeCartes extends JPanel {

	private CTasDeCartes cTas;
	private int dx = 0;
	private int dy = 0;
	private int xc, yc;

	public PTasDeCartes(CTasDeCartes cTas) {
		this.cTas = cTas;
		this.setLayout(null);

		this.setSize(new Dimension(80, 100));
		this.setPreferredSize(getSize());
		this.setVisible(true);
	}
	
	public void setDelta(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		this.setSize(new Dimension(80 + 26 * dx, 100 + 21 * dy));
		this.setPreferredSize(getSize());
	}

	public void empiler(PCarte pc) {
		this.add(pc, 0);
		xc += dx;
		yc += dy;
		pc.setLocation(xc, yc);
	}

	public void depiler(PCarte pc) {
		this.remove(pc);
		xc -= dx;
		yc -= dy;
		validate();
		repaint();
	}
}
