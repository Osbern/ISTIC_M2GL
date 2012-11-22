package controller;

import solitaire.application.Solitaire;
import solitaire.application.Usine;

public class CSolitaire extends Solitaire {

	public CSolitaire(String arg0, Usine arg1) {
		super(arg0, arg1);

	}

	public String getNom() {
		return super.nom;
	}

	public CSabot getSabot() {
		return (CSabot) super.sabot;
	}

	public CTasDeCartesColorees[] getPiles() {
		CTasDeCartesColorees[] res = new CTasDeCartesColorees[super.pilesColorees.length];

		for (int i = 0; i < super.pilesColorees.length; i++) {
			res[i] = (CTasDeCartesColorees) super.pilesColorees[i];
		}

		return res;
	}

	public CColonne[] getCols() {
		CColonne[] res = new CColonne[super.pilesAlternees.length];

		for (int i = 0; i < super.pilesAlternees.length; i++) {
			res[i] = (CColonne) super.pilesAlternees[i];
		}

		return res;
	}

	@Override
	public void initialiser() {
		super.initialiser();
	

	}
}