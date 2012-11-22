package controller;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import presentation.PSolitaire;

import solitaire.application.Solitaire;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CUsine u = new CUsine();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// frame.setLayout(new FlowLayout()); // au lieu de BorderLayout par
		// d�faut

		CSabot cs = new CSabot("Sabot", u);

		CTasDeCartes ctdc = new CTasDeCartes("toto", u);
		for (int c = 1; c < 14; c++) {
			CCarte cc = new CCarte(c, 1);
			ctdc.empiler(cc);
		}
		ctdc.getPresentation().setDelta(0, 25);
		cs.setReserve(ctdc);

		// frame.add(cs.getPresentation());

		/*
		 * test des PTasDeCartes on affiche un tas alternees vertical
		 */
		CTasDeCartesAlternees tas = new CTasDeCartesAlternees("toto", u);
		tas.getPresentation().setDelta(0, 25);

		CCarte c = new CCarte(13, 4);
		tas.empiler(c);
		c = new CCarte(12, 3);
		tas.empiler(c);
		c = new CCarte(11, 2);
		tas.empiler(c);

		// frame.add(tas.getPresentation());

		/*
		 * test des PTasDeCartes on affiche un tas colorees vertical
		 */
		CTasDeCartesColorees tasc = new CTasDeCartesColorees("toto", 4, u);
		tasc.getPresentation().setDelta(0, 4);

		c = new CCarte(1, 4);
		tasc.empiler(c);
		c = new CCarte(2, 4);
		tasc.empiler(c);
		c = new CCarte(3, 4);
		tasc.empiler(c);

		// frame.add(tasc.getPresentation());

		/*
		 * test des PColonne
		 */
		CTasDeCartes pastas = new CTasDeCartes("toto", u);
		pastas.getPresentation().setDelta(0, 25);

		c = new CCarte(13, 4);
		pastas.empiler(c);
		c = new CCarte(12, 3);
		pastas.empiler(c);
		c = new CCarte(11, 2);
		pastas.empiler(c);

		CColonne col = new CColonne("toto", u);
		col.setReserve(pastas);
		col.empiler(new CCarte(13, 1));
		col.empiler(new CCarte(12, 4));
		col.empiler(new CCarte(11, 3));

		frame.add(col.getPresentation());

		/*
		 * tests de PCarte on affiche toutes les cartes dont certaines face
		 * cach�e!
		 */
		// CCarte pc;
		// for (int c = 1; c < 5; c++) {
		// for (int i = 1; i < 14; i++) {
		// pc = new CCarte(i, c);
		// pc.setFaceVisible(true);
		// pc.getPresentation().setLocation(i, c);
		// frame.add(pc.getPresentation());
		// if ((i%4) == 0)
		// pc.setFaceVisible(false);
		// }
		// }

		frame.setVisible(true);
		frame.pack();
	}

}
