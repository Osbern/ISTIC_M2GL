package controller;

import java.awt.Color;

import presentation.PColonne;
import presentation.PTasDeCartes;
import presentation.PTasDeCartesAlternees;
import solitaire.application.Colonne;
import solitaire.application.Tas;
import solitaire.application.Usine;

public class CColonne extends Colonne {

	private PColonne p;
	private static CColonne src, dest;
	private Usine u;

	public CColonne(String name, Usine u) {
		super(name, u);
		this.u = u;
		PTasDeCartes pCachees = ((CTasDeCartes) cachees).getPresentation();
		PTasDeCartesAlternees pVisibles = ((CTasDeCartesAlternees) visibles)
				.getPresentation();
		pCachees.setDelta(0, 15);
		pVisibles.setDelta(0, 15);
		p = new PColonne(this, pCachees, pVisibles);
	}

	public PColonne getPresentation() {
		return p;
	}

	public void setPresentation(PColonne p) {
		this.p = p;
	}

	// DRAG
	public void p2c_debutDnD(CCarte cc) throws Exception {
		if (cc != null) {
			CTasDeCartes transfer = new CTasDeCartes("Transfer", u);
			transfer.getPresentation().setDelta(0, 25);
			if (cc == getSommet()) {
				depiler();
				transfer.empiler(cc);
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
			}
			dest = null;
			src = this;
			transfer.getPresentation().setOpaque(false);
			p.c2p_debutDnDOK(transfer.getPresentation());
		} else {
			p.c2p_debutDnDNull();
		}
	}

	public void p2c_dragDropEnd(boolean success, PTasDeCartes ptdc) {
		CTasDeCartes ctdc = (CTasDeCartes) ptdc.getControle();
		if (!success) {
			empiler(ctdc);
		}
		else {
			if (!cachees.isVide() && ((dest != null && dest != src && src != null) || (visibles.isVide() && dest == null && src != null))) {
				PTasDeCartesAlternees ptas = ((CTasDeCartesAlternees) visibles).getPresentation();
				ptas.setLocation(ptas.getX(), ptas.getY() - 15);
			}
			try {
				retournerCarte();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		src = null;
	}

	// DROP
	public void p2c_dragEnter(CTasDeCartes transfer) {
		try {
			if (isEmpilable(transfer.getBase())) {
				p.c2p_showEmpilable();
			} else {
				p.c2p_showNotEmpilable();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void p2c_dragExit(CTasDeCartes transfer) {
		p.c2p_showNeutre();
	}

	public void p2c_drop(CTasDeCartes transfer) {
		try {
			p.c2p_showNeutre();
			if (isEmpilable(transfer.getBase())) {
				empiler(transfer);
				dest = this;
				p.c2p_finDnDOK();
			} else {
				p.c2p_finDnDKO();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
