package v1.Impl.UI;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Afficheur extends JLabel {

	private static final long serialVersionUID = 1615754008384780977L;

	public Afficheur(IHM ihm) {
		super("", SwingConstants.CENTER);
		Font font = new Font("Arial", Font.BOLD, 25);
		this.setFont(font);
	}

}
