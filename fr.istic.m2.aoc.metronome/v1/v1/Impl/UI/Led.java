package v1.Impl.UI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import v1.Impl.EteindreLed;
import v1.Impl.HorlogeImpl;
import v1.Interface.Horloge;

public class Led extends JPanel {
	
	private Horloge h;

	public Led(Color c) {
		super();
		h = new HorlogeImpl();
		Dimension dimension = new Dimension(50, 50);
		this.setPreferredSize(dimension);
		this.setSize(dimension);
		this.setBackground(c);
		this.setVisible(false);
	}
	
	public void update() {
		h.desactiver();
		this.setVisible(true);
		this.repaint();
		h.activerApresDelai(new EteindreLed(this), 100);
	}

}
