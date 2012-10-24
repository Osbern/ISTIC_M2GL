package controller;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout()); // au lieu de BorderLayout par défaut
		
		CUsine u = new CUsine();
		CSabot cs = new CSabot("Sabot", u);
		
		CTasDeCartes ctdc = new CTasDeCartes("toto", u);
		for (int c = 1; c < 14; c++) {
			CCarte cc = new CCarte(c, 1);
			ctdc.empiler(cc);
		}
		ctdc.getPresentation().setDelta(0, 25);
		cs.setReserve(ctdc);
		
		frame.add(cs.getPresentation());

		/*
		 * test des PTasDeCartes on affiche un tas horizontal
		 */
//		CTasDeCartes ctdc = new CTasDeCartes("toto", u);
//		ctdc.getPresentation().setDelta(25, 0);
//
//		for (int c = 1; c < 4; c++) {
//			CCarte cc = new CCarte(5, c);
//			cc.setFaceVisible(true);
//			ctdc.empiler(cc);
//		}
//		frame.add(ctdc.getPresentation());
		
		/*
		 * tests de PCarte on affiche toutes les cartes dont certaines face cachée!
		 */
//		CCarte pc;
//		for (int c = 1; c < 5; c++) {
//			for (int i = 1; i < 14; i++) {
//				pc = new CCarte(i, c);
//				pc.setFaceVisible(true);
//				pc.getPresentation().setLocation(i, c);
//				frame.add(pc.getPresentation());
//				if ((i%4) == 0)
//					pc.setFaceVisible(false);
//			}
//		}

		frame.setVisible(true);
		frame.pack();
	}

}
