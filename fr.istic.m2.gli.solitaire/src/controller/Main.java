package controller;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CUsine u = new CUsine();
		CSolitaire jeu = new CSolitaire("Solitaire", u);
		jeu.initialiser();
		jeu.jouer();

		while (!jeu.termine()) {
		}
		JOptionPane.showMessageDialog(jeu.getPS(), new String("Bien joué Bob !"), "Gagné !", 1);
		System.exit(0);
	}
}
