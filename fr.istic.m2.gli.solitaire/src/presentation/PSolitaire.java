package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import solitaire.application.Solitaire;

import controller.CColonne;
import controller.CSabot;
import controller.CSolitaire;
import controller.CTasDeCartesColorees;
import controller.CUsine;

public class PSolitaire extends JFrame {
	public static void main(String[] args) {

		CUsine u = new CUsine();
		CSolitaire jeu = new CSolitaire("Solitaire", u);
		jeu.initialiser();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CSolitaire csolitaire;

	/**
	 * Create the frame.
	 */
	public PSolitaire(CSolitaire s) {
		this.csolitaire = s;
		JFrame board = new JFrame();
		board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		board.setTitle("Solitaire - Destouches Lacroix");

		board.setLayout(new BorderLayout());

		CSabot sabot = csolitaire.getSabot();

		JPanel north = new JPanel();
		FlowLayout nfl = new FlowLayout(FlowLayout.LEADING);
		north.setLayout(nfl);
		north.add(sabot.getPresentation());

		CTasDeCartesColorees[] piles = csolitaire.getPiles();
		for (CTasDeCartesColorees t : piles) {
			t.getPresentation().setVisible(true);
			north.add(t.getPresentation());
		}
		north.setSize(sabot.getPresentation().getWidth()
				+ (4 * piles[0].getPresentation().getWidth() + 50), 150);
		north.setPreferredSize(north.getSize());

		JPanel center = new JPanel();
		center.setLayout(null);
		CColonne[] cols = csolitaire.getCols();
		int n = 0, dx = 20 + 80, dy = 10 + 100;
		for (CColonne c : cols) {
			PColonne p = c.getPresentation();
			p.setLocation(center.getX() + (n * dx), center.getY() + (n * dy));
			p.setVisible(true);
			center.add(p);
			n++;
		}

		center.setSize(7 * 90, (7 * 25) + (12 * 25) + 100);

		board.add(north, BorderLayout.NORTH, 0);

		board.add(center, BorderLayout.SOUTH, 0);

		board.setSize(Math.max(center.getWidth(), north.getWidth()),
				center.getHeight() + 5 + north.getHeight());
		board.setPreferredSize(board.getSize());
		board.setBackground(Color.RED);
		board.setVisible(true);
		validate();
	}

}
