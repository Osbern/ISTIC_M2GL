package v1.Impl;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Led extends JPanel {

	public Led(Color c) {
		super();
		this.setPreferredSize(new Dimension(50, 50));
		this.setBackground(c);
	}

}
