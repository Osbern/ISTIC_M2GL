package v1.Impl.IHM;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * @(#) Afficheur.java
 */

public class Afficheur extends JLabel {

	public Afficheur(IHM ihm) {
		super("", SwingConstants.CENTER);
		Font font = new Font("Arial", Font.BOLD, 25);
		this.setFont(font);
	}

}
