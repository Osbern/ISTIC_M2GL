package controller;

import presentation.PTasDeCartes;
import presentation.PTasDeCartesColorees;
import solitaire.application.Carte;
import solitaire.application.TasDeCartesColorees;
import solitaire.application.Usine;

public class CTasDeCartesColorees extends TasDeCartesColorees implements
		ICTasDeCartes {

	private PTasDeCartesColorees p;
	private Usine u;

	public CTasDeCartesColorees(String name, int couleur, Usine u) {
		super(name, couleur, u);
		this.u = u;
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
				p.c2p_showNeutre();
				if (isEmpilable(transfer.getSommet())) {
					empiler(transfer);
					// CHECK WIN
					p.c2p_finDnDOK();
				} else {
					p.c2p_finDnDKO();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			p.c2p_showNeutre();
		}
	}

	@Override
	public int getSize() {
		return this.getNombre();
	}

}
