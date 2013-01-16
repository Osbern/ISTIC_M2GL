package v2.Adaptor;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import v2.Adaptor.Impl.AfficheurImpl;
import v2.Adaptor.Impl.ClavierImpl;
import v2.Adaptor.Impl.EmetteurSonoreImpl;
import v2.Adaptor.Impl.HorlogeImpl;
import v2.Adaptor.Impl.MoletteImpl;

/**
 * Cette classe simule le Matériel définit selon les interfaces de v2.Adaptor
 *
 */
public class Materiel extends JFrame {
	
	private static final long serialVersionUID = -5192156375496015580L;

	public static final int DEC = 0, INC = 1, START = 2, STOP = 3;

	private static Horloge horloge;
	private static Clavier clavier;
	private static Molette molette;
	private static EmetteurSonore emetteurSonore;
	private static Afficheur afficheur;
	
	public Materiel() {
		horloge = new HorlogeImpl();
		clavier = new ClavierImpl();
		molette = new MoletteImpl();
		emetteurSonore = new EmetteurSonoreImpl();
		afficheur = new AfficheurImpl(this);
		
		this.setPreferredSize(new Dimension(400, 150));
		this.setSize(getPreferredSize());

		this.setVisible(true);
		this.setLayout(new BorderLayout());
		
		this.add((Component) clavier, BorderLayout.SOUTH);
		this.add((Component) afficheur, BorderLayout.CENTER);
		this.add((Component) molette, BorderLayout.NORTH);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});

		this.pack();
	}
	
	public Horloge getHorloge() {
		return horloge;
	}

	public Clavier getClavier() {
		return clavier;
	}

	public Molette getMolette() {
		return molette;
	}

	public EmetteurSonore getEmetteurSonore() {
		return emetteurSonore;
	}

	public Afficheur getAfficheur() {
		return afficheur;
	}
}
