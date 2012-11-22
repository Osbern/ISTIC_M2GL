package controller;

import java.awt.Dimension;

import presentation.PSabot;
import presentation.PTasDeCartes;
import solitaire.application.Sabot;
import solitaire.application.Tas;
import solitaire.application.Usine;

public class CSabot extends Sabot {
	
	private PSabot p;

	public CSabot(String nom, Usine u) {
		super(nom, u);
		PTasDeCartes pCachees = ((CTasDeCartes) cachees).getPresentation();
		PTasDeCartes pVisibles = ((CTasDeCartes) visibles).getPresentation();
		pCachees.setDelta(0, 0);
		pVisibles.setDelta(17, 0); // Affichage tas horizontal
		
		p = new PSabot(this, pCachees, pVisibles);
	}
	
	@Override
	public void setReserve(Tas t) {
		super.setReserve(t);
		if (isCarteRetournable())
			p.activerRetournerCarte();
	}
	
	@Override
	public void retournerCarte() {
		try {
			super.retournerCarte();
			if (isRetournable()) {
				p.desactiverRetournerCarte();
				p.activerRetournerSabot();
			}
		} catch (Exception e) {
			//TODO
			e.printStackTrace();
		}
		
	}
	
	public void retourner3Carte() {
		try {
			retournerCarte();
			retournerCarte();
			retournerCarte();
		} catch (Exception e) {
			System.err.println("retourner3Cartes");
			e.printStackTrace();
		}
	}
	
	public PSabot getPresentation() {
		return p;
	}

}
