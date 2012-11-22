package controller;

import presentation.PTasDeCartes;
import presentation.PTasDeCartesColorees;
import solitaire.application.Carte;
import solitaire.application.TasDeCartesColorees;
import solitaire.application.Usine;

public class CTasDeCartesColorees extends TasDeCartesColorees implements
		ICTasDeCartes {

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
