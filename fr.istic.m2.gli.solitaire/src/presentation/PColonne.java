package presentation;

import java.awt.Dimension;

import javax.swing.JPanel;

import controller.CColonne;

public class PColonne extends JPanel {
	
	private CColonne c;
	private PTasDeCartes cachees, visibles;

	
	public PColonne(CColonne c, PTasDeCartes cachees, PTasDeCartes visibles) {
		this.c = c;
		this.cachees = cachees;
		this.visibles = visibles;
		
		setLayout(null);
		
		add(visibles);
		add(cachees);
		
		visibles.setLocation(cachees.getX(), cachees.getHeight() - 25);
		
//		cachees.setSize(new Dimension(80, 1000));
//		visibles.setSize(cachees.getHeight(), cachees.getHeight() + 25);
		setVisible(true);
	}
	
	public void empiler(PCarte pc) {
		visibles.empiler(pc);
	}

	public void depiler(PCarte pc) {
		visibles.depiler(pc);
	}

}
