package controller;

import solitaire.application.TasDeCartes;
import solitaire.application.Usine;

public class CUsine extends Usine {

	@Override
	public TasDeCartes newTasDeCartes(String nom, Usine u) {
		return new CTasDeCartes(nom, u);
	}
}
