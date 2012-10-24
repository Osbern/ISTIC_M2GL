package controller;

import presentation.PCarte;
import solitaire.application.Carte;

public class CCarte extends Carte {
	
	private PCarte p;
	
	public CCarte(int valeur, int couleur) {
		super(valeur, couleur);
		p = new PCarte(valeurs[getValeur() - 1] + couleurs[getCouleur() - 1], this);
		p.setFaceVisible(isFaceVisible());
	}
	
	public void setFaceVisible(boolean visible) {
		super.setFaceVisible(visible);
		p.setFaceVisible(isFaceVisible());
	}

	public PCarte getPresentation() {
		return p;
	}
}
