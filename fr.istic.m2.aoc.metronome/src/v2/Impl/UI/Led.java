package v2.Impl.UI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import v2.Adaptor.Horloge;
import v2.Adaptor.Impl.HorlogeImpl;
import v2.Impl.EteindreLed;

public class Led extends JPanel {
	
	public static final int LEDTEMPS = 0;
	public static final int LEDMESURE = 1;
	
	private Horloge h;
	private Color c;

	public Color getC() {
		return c;
	}

	public void setC(Color c) {
		this.c = c;
	}

	public Led(Color c, Horloge h) {
		super();
		this.h = h;
		this.c = c;
		Dimension dimension = new Dimension(50, 50);
		this.setPreferredSize(dimension);
		this.setSize(dimension);
		this.setVisible(true);
		this.setBackground(Color.LIGHT_GRAY);
	}
	
	public void update(int i) {
		if (i == LEDTEMPS)
			h.desactiver();
		this.setBackground(c);
		h.activerApresDelai(new EteindreLed(this), 150);
	}
}
