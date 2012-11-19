package v1.Impl.UI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import v1.Impl.EteindreLed;
import v1.Impl.HorlogeImpl;
import v2.Adaptor.Horloge;

public class Led extends JPanel {
	
	public static final int LEDTEMPS = 0;
	public static final int LEDMESURE = 1;
	
	private Horloge h;

	public Led(Color c, Horloge h) {
		super();
		this.h = h;
		Dimension dimension = new Dimension(50, 50);
		this.setPreferredSize(dimension);
		this.setSize(dimension);
		this.setBackground(c);
		this.setVisible(false);
	}
	
	public void update(int i) {
		if (i == LEDTEMPS)
			h.desactiver();
		this.setVisible(true);
		this.repaint();
		h.activerApresDelai(new EteindreLed(this), 100);
	}
}
