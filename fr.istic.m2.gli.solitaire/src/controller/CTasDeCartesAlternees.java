package controller;

import presentation.PTasDeCartesAlternees;
import solitaire.application.Carte;
import solitaire.application.TasDeCartesAlternees;
import solitaire.application.Usine;

public class CTasDeCartesAlternees extends TasDeCartesAlternees implements
		ICTasDeCartes {

	private PTasDeCartesAlternees p;

	public CTasDeCartesAlternees(String name, Usine u) {
		super(name, u);
		p = new PTasDeCartesAlternees(this);
	}

	public PTasDeCartesAlternees getPresentation() {
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
