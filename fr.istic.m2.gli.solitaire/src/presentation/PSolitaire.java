package presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

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
		// jeu.jouer();

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
	private JFrame f;

	Container con = null;
	JPanel panelBgImg;

	/**
	 * Create the frame.
	 */
	public PSolitaire(CSolitaire s) {
		this.csolitaire = s;
		f = new JFrame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setTitle("Solitaire - Destouches Lacroix");
		
		JLabel board = new JLabel(new ImageIcon("W:\\ISTIC_M2GL\\fr.istic.m2.gli.solitaire\\bin\\backgroundImage\\back.png"));
		
		


		board.setLayout(new BorderLayout());

		north = new JPanel();
		FlowLayout nfl = new FlowLayout(FlowLayout.LEADING);
		north.setLayout(nfl);
		north.setOpaque(false);

		center = new JPanel();
		center.setLayout(new FlowLayout());
		center.setOpaque(false);
		board.add(north, BorderLayout.NORTH);

		board.add(center, BorderLayout.CENTER);
		board.setVisible(true);
		board.setOpaque(true);
		f.add(board);
		f.setVisible(true);

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
		center.setSize((7 * (80 + 10)), (20 + (7 * 7) + (13 * 15)));
		center.setPreferredSize(center.getSize());

		f.setSize(1024, 768);
		f.setMaximumSize(f.getSize());
		f.setMinimumSize(f.getSize());
		f.setPreferredSize(f.getSize());
		f.setResizable(false);
	}

}
