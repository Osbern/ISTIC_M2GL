package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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
		//jeu.jouer();
		
		while (!jeu.termine()) {
		}
		System.out.println("GAGNE !");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CSolitaire csolitaire;
	CColonne[] cols;
	CSabot sabot;
	CTasDeCartesColorees[] piles;
	private JPanel north;
	private JPanel center;
	private JFrame board;

	/**
	 * Create the frame.
	 */
	public PSolitaire(CSolitaire s) {
		this.csolitaire = s;
		board = new JFrame();
		board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		board.setTitle("Solitaire - Destouches Lacroix");

		board.setLayout(new BorderLayout());

		north = new JPanel();
		FlowLayout nfl = new FlowLayout(FlowLayout.LEADING);
		north.setLayout(nfl);

		center = new JPanel();
		center.setLayout(new FlowLayout());

		board.add(north, BorderLayout.NORTH);

		board.add(center, BorderLayout.CENTER);

		board.setBackground(Color.RED);
		board.setVisible(true);
		validate();
	}

	public void initialiser() {
		cols = csolitaire.getCols();
		sabot = csolitaire.getSabot();
		piles = csolitaire.getPiles();

		north.add(sabot.getPresentation());

		for (CTasDeCartesColorees t : piles) {
			PTasDeCartesColorees p = t.getPresentation();
			p.setBackground(Color.GRAY);
			p.setVisible(true);
			north.add(p);
		}
		north.setSize(sabot.getPresentation().getWidth()
				+ (4 * piles[0].getPresentation().getWidth() + 50), 150);
		north.setPreferredSize(north.getSize());

		int n = 0, dx = 20 + 80, dy = 10 + 100;
		for (CColonne c : cols) {
			PColonne p = c.getPresentation();
			p.setLocation(center.getX() + (n * dx), center.getY() + (n * dy));
			p.setVisible(true);
			p.initCachees();
			center.add(p);
			n++;
		}
		center.setSize((7*(80+10)),(20+(7*7)+(13*15)));
		center.setPreferredSize(center.getSize());
		
		board.setSize(1024, 768);
		board.setPreferredSize(board.getSize());
	}

}
