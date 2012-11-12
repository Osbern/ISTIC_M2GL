package v1.Impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import v1.Interface.Horloge;

public class Led extends JPanel {
	
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
	
	public void update() {
		h.desactiver();
		this.setVisible(true);
		this.repaint();
		h.activerApresDelai(new EteindreLed(this), 100);
	}

}
