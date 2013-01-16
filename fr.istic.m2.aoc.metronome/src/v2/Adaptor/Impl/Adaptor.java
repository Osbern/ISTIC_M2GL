package v2.Adaptor.Impl;

import v2.Adaptor.Clavier;
import v2.Adaptor.Materiel;
import v2.Command.Command;
import v2.Impl.Controller;
import v2.Impl.UI.Led;

/**
 * Cette classe d�crit l'adaptateur entre le Controleur et le Mat�riel. <br />
 * Elle impl�mente Command car la m�thode execute est appel�e � intervale
 * r�gulier pour v�rifier l'�tat du Mat�riel.
 * 
 */
public class Adaptor implements Command {

	private Materiel mat;
	private Controller ctl;
	private int oldTempo;

	public Adaptor(Materiel mat, Controller ctl) {
		this.mat = mat;
		this.ctl = ctl;
		oldTempo = 120;
	}

	@Override
	public void execute() {
		Clavier cl = mat.getClavier();
		if (cl.touchePressee(Materiel.DEC))
			ctl.dec();
		if (cl.touchePressee(Materiel.INC))
			ctl.inc();
		if (cl.touchePressee(Materiel.START))
			ctl.start();
		if (cl.touchePressee(Materiel.STOP))
			ctl.stop();

		int newTempo = (int) mat.getMolette().position();
		if (oldTempo != newTempo) {
			ctl.setTempo(newTempo);
			mat.getAfficheur().afficherTempo(newTempo);
			oldTempo = newTempo;
		}
	}

	/**
	 * M�thode appel�e depuis le Controleur pour notifier le passage d'un temps au Mat�riel
	 */
	public void notifyTemps() {
		mat.getAfficheur().allumerLed(Led.LEDTEMPS);
		mat.getEmetteurSonore().emettreClic();
	}

	/**
	 * M�thode appel�e depuis le Controleur pour notifier le passage d'une mesure au Mat�riel
	 */
	public void notifyMesure() {
		mat.getAfficheur().allumerLed(Led.LEDMESURE);
	}
}
