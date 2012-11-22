package controller;

import java.awt.Color;

import presentation.PColonne;
import presentation.PTasDeCartes;
import presentation.PTasDeCartesAlternees;
import solitaire.application.Carte;
import solitaire.application.Colonne;
import solitaire.application.Tas;
import solitaire.application.Usine;

public class CColonne extends Colonne {

	private PColonne p;
	private Usine u;

	public CColonne(String name, Usine u) {
		super(name, u);
		this.u = u;
		PTasDeCartes pCachees = ((CTasDeCartes) cachees).getPresentation();
		PTasDeCartesAlternees pVisibles = ((CTasDeCartesAlternees) visibles).getPresentation();
		pCachees.setDelta(0, 25);
		pVisibles.setDelta(0, 25);
		p = new PColonne(this, pCachees, pVisibles);
	}

	public PColonne getPresentation() {
		return p;
	}

	public void p2c_debutDnD(CCarte cc) throws Exception {
		if (cc != null) {
			CTasDeCartes transfer = new CTasDeCartes("Transfer", u);
			transfer.getPresentation().setDelta(0, 25);
			if (cc == getSommet()) {
				depiler();
				transfer.empiler(cc);
				
				System.out.println("SOMMET");
			} else {
				CCarte tmp;
				CTasDeCartes tasTmp = new CTasDeCartes("Transfer", u);
				int size = 1;
				while ((tmp = (CCarte) getSommet()) != cc) {
					depiler();
					tasTmp.empiler(tmp);
					size++;
				}
				depiler();
				tasTmp.empiler(tmp);
				
				for (int i = 0; i < size; i++) {
					CCarte c = (CCarte) tasTmp.getSommet();
					tasTmp.depiler();
					transfer.empiler(c);
				}
				
				System.out.println("PAS SOMMET: " + size);
			}
			transfer.getPresentation().setOpaque(false);
			p.c2p_debutDnDOK(transfer.getPresentation());
		} else {
			p.c2p_debutDnDNull();
		}
	}

	public void p2c_dragDropEnd(boolean success, PTasDeCartes ptdc) {
		CTasDeCartes ctdc = (CTasDeCartes) ptdc.getControle();
		if (!success)
			empiler(ctdc);
	}
}
