package controller;

import solitaire.application.TasDeCartes;
import solitaire.application.TasDeCartesAlternees;
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
}
