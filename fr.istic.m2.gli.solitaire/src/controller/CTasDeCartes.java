package controller;

import presentation.PTasDeCartes;
import solitaire.application.Carte;
import solitaire.application.TasDeCartes;
import solitaire.application.Usine;

public class CTasDeCartes extends TasDeCartes {
	
	private PTasDeCartes p;

	public CTasDeCartes(String nom, Usine u) {
		super(nom, u);
		p = new PTasDeCartes(this);
	}

	public PTasDeCartes getPresentation() {
		return p;
	}
	
	@Override
	public void empiler(Carte c) {
		super.empiler(c);
		p.empiler(((CCarte) c).getPresentation());
	}
	
	/* (non-Javadoc)
	 * @see solitaire.application.TasDeCartes#depiler()
	 * On appelle cette méthode uniquement lorsque l'on est <b>sûr</b> de dépiler
	 */
	@Override
	public void depiler() throws Exception {
		p.depiler(((CCarte) getSommet()).getPresentation()); 
		super.depiler();
	}
}
