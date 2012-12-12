package controller;

import presentation.PColonne;
import presentation.PTasDeCartes;
import presentation.PTasDeCartesAlternees;
import solitaire.application.Colonne;
import solitaire.application.Usine;

public class CColonne extends Colonne {

	private PColonne p;
	private Usine u;

	public CColonne(String name, Usine u) {
		super(name, u);
		this.u = u;
		PTasDeCartes pCachees = ((CTasDeCartes) cachees).getPresentation();
		PTasDeCartesAlternees pVisibles = ((CTasDeCartesAlternees) visibles)
				.getPresentation();
		pCachees.setDelta(0, 7);
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
		else
			try {
				retournerCarte();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	// DROP
	public void p2c_dragEnter(CTasDeCartes transfer) {
		if (transfer.getNombre() == 1) {
		try {
			if (isEmpilable(transfer.getSommet())) {
				p.c2p_showEmpilable();
			} else {
				p.c2p_showNotEmpilable();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		} else {
			p.c2p_showNotEmpilable();
		}
	}

	public void p2c_dragExit(CTasDeCartes transfer) {
		p.c2p_showNeutre();
	}

	public void p2c_drop(CTasDeCartes transfer) {
		if (transfer.getNombre() == 1) {
			try {
				if (isEmpilable(transfer.getSommet())) {
					empiler(transfer);
					p.c2p_showNeutre();
					p.c2p_finDnDOK();
				} else {
					p.c2p_showNeutre();
					p.c2p_finDnDKO();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
