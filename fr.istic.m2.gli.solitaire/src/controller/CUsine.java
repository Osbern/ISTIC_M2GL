package controller;

import presentation.PSolitaire;
import solitaire.application.Carte;
import solitaire.application.Colonne;
import solitaire.application.DoubleTas;
import solitaire.application.Sabot;
import solitaire.application.Solitaire;
import solitaire.application.Tas;
import solitaire.application.TasDeCartes;
import solitaire.application.TasDeCartesAlternees;
import solitaire.application.TasDeCartesColorees;
import solitaire.application.Usine;

public class CUsine extends Usine {

	@Override
	public TasDeCartes newTasDeCartes(String nom, Usine u) {
		return new CTasDeCartes(nom, u);
	}

	@Override
	public TasDeCartesAlternees newTasDeCartesAlternees(String nom, Usine u) {
		return new CTasDeCartesAlternees(nom, u);
	}

	@Override
	public Carte newCarte(int nom, int usine) {
		return new CCarte(nom, usine);
	}

	@Override
	public Colonne newColonne(String nom, Usine usine) {
		return new CColonne(nom, usine);
	}

	@Override
	public Sabot newSabot(String nom, Usine usine) {
		return new CSabot(nom, usine);
	}

	@Override
	public TasDeCartesColorees newTasDeCartesColorees(String nom, int couleur,
			Usine u) {

		return new CTasDeCartesColorees(nom, couleur, u);
	}
	
	@Override
	public Solitaire newSolitaire(String nom, Usine usine) {
		CSolitaire res = new CSolitaire(nom, usine);
		return res;
	}

}
