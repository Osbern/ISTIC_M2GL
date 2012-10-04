package v1.Impl;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * @(#) Afficheur.java
 */

public class Afficheur extends JLabel {
	private IHM ihm;

	public Afficheur() {
		super("", SwingConstants.CENTER);
		Font font = new Font("Arial", Font.BOLD, 25);
		this.setFont(font);

		this.setText("120 bpm");
	}

}
