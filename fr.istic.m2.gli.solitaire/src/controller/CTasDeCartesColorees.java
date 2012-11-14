package controller;

import presentation.PTasDeCartes;
import presentation.PTasDeCartesColorees;
import solitaire.application.Carte;
import solitaire.application.TasDeCartesColorees;
import solitaire.application.Usine;

public class CTasDeCartesColorees extends TasDeCartesColorees implements ICTasDeCartes {
	
	private PTasDeCartesColorees p;

	public CTasDeCartesColorees(String name, int couleur, Usine u) {
		super(name, couleur, u);
		p = new PTasDeCartesColorees(this);
	}

	public PTasDeCartesColorees getPresentation() {
		return p;
	}

	@Override
	public void empiler(Carte c) {
		if (isEmpilable(c)) {
			super.empiler(c);
			p.empiler(((CCarte) c).getPresentation());
		}
	}

	@Override
	public void depiler() throws Exception {
		p.depiler(((CCarte) getSommet()).getPresentation());
		super.depiler();
	}

}
