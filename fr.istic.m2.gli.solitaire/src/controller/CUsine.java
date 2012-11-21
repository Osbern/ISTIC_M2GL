package controller;

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
	public Carte newCarte(int arg0, int arg1) {
		return new CCarte(arg0, arg1);
	}

	@Override
	public Colonne newColonne(String arg0, Usine arg1) {
		return new CColonne(arg0, arg1);
	}

	@Override
	public Sabot newSabot(String arg0, Usine arg1) {
		// TODO Auto-generated method stub
		return new CSabot(arg0, arg1);
	}

	@Override
	public TasDeCartesColorees newTasDeCartesColorees(String arg0, int arg1,
			Usine arg2) {

		return new CTasDeCartesColorees(arg0, arg1, arg2);
	}

}
