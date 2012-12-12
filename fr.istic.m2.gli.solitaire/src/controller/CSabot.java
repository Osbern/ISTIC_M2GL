package controller;

import presentation.PSabot;
import presentation.PTasDeCartes;
import solitaire.application.Sabot;
import solitaire.application.Tas;
import solitaire.application.Usine;

public class CSabot extends Sabot {
	
	private PSabot p;
	private Usine u;

	public CSabot(String nom, Usine u) {
		super(nom, u);
		this.u = u;
		PTasDeCartes pCachees = ((CTasDeCartes) cachees).getPresentation();
		PTasDeCartes pVisibles = ((CTasDeCartes) visibles).getPresentation();
		pCachees.setDelta(0, 0);
		pVisibles.setDelta(17, 0); // Affichage tas horizontal
		
		p = new PSabot(this, pCachees, pVisibles);
	}
	
	@Override
	public void setReserve(Tas t) {
		super.setReserve(t);
		if (isCarteRetournable())
			p.activerRetournerCarte();
	}
	
	@Override
	public void retournerCarte() {
		try {
			super.retournerCarte();
			if (isRetournable()) {
				p.desactiverRetournerCarte();
				p.activerRetournerSabot();
			}
		} catch (Exception e) {
			//TODO
			e.printStackTrace();
		}
		
	}
	
	public void retourner3Carte() {
		try {
			retournerCarte();
			retournerCarte();
			retournerCarte();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public PSabot getPresentation() {
		return p;
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
			if (!success)
				empiler(ctdc);
		}

}
