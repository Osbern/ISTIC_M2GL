package presentation;

//import solitaire.controle.* ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.CCarte;

/**
 * Composant Présentation d'une carte
 */
public class PCarte extends JPanel {

	protected CCarte controle; // contrôleur associé
	protected JLabel face, dos;
	protected ImageIcon icone; // image de la face
	protected static ImageIcon iconeDos; // image du dos
	public static int largeur, hauteur;

	/**
	 * initialiser une carte
	 * 
	 * @param chaine
	 *            : nom de la carte (exemple "3H" = 3 Heart)
	 */
	public PCarte(final String chaine, final CCarte controle) {
		this.controle = controle;

		// image de la face
		icone = new ImageIcon(ClassLoader.getSystemResource("images/"
				+ chaine + ".gif"));
		face = new JLabel(icone);
		add(face);
		face.setLocation(0, 0);
		face.setSize(largeur, hauteur);

		// image du dos
		dos = new JLabel(iconeDos);
		add(dos);
		dos.setLocation(0, 0);
		dos.setSize(largeur, hauteur);

		// le JPanel
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		setSize(face.getSize());
		setPreferredSize(getSize());
		setFaceVisible(false);
	} // constructeur

	/**
	 * changer la visibilité de la carte
	 * 
	 * @param faceVisible
	 *            : vrai si la face est visible, faux sinon
	 */
	public void setFaceVisible(boolean faceVisible) {
		face.setVisible(faceVisible);
		dos.setVisible(!faceVisible);
	}

	public final CCarte getControle() {
		return (controle);
	}

	public ImageIcon getIcone() {
		return icone;
	}

	/**
	 * initialiser l'image du dos et les dimensions d'une PCarte
	 */
	static {
		iconeDos = new ImageIcon(
				ClassLoader.getSystemResource("images/dos.jpg"));
		largeur = iconeDos.getIconWidth() + 4;
		hauteur = iconeDos.getIconHeight() + 4;
	}

	/**
	 * programme de test : à déplacer dans une classe dédiée aux tests
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		JFrame f = new JFrame("Test PCarte");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout()); // au lieu de BorderLayout par défaut
		f.getContentPane().setBackground(new Color(143, 143, 195)); // violet
																	// pâle

		// une carte visible
		PCarte pc = new PCarte("QH", null);
		pc.setFaceVisible(true);
		f.getContentPane().add(pc);

		// une carte cachée
		pc = new PCarte("1D", null);
		pc.setFaceVisible(false);
		f.getContentPane().add(pc);

		f.pack(); // dimensionner le cadre
		f.setLocation(200, 100); // le positionner
		f.setVisible(true); // et le rendre visible
	} // main

} // PCarte
