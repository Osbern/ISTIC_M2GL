package controller;

import presentation.PColonne;
import presentation.PTasDeCartes;
import presentation.PTasDeCartesAlternees;
import solitaire.application.Carte;
import solitaire.application.Colonne;
import solitaire.application.Tas;
import solitaire.application.Usine;

public class CColonne extends Colonne {

	private PColonne p;

	public CColonne(String name, Usine u) {
		super(name, u);
		PTasDeCartes pCachees = ((CTasDeCartes) cachees).getPresentation();
		PTasDeCartesAlternees pVisibles = ((CTasDeCartesAlternees) visibles).getPresentation();
		pCachees.setDelta(0, 25);
		pVisibles.setDelta(0, 25);
		p = new PColonne(this, pCachees, pVisibles);
	}

	public PColonne getPresentation() {
		return p;
	}
}
