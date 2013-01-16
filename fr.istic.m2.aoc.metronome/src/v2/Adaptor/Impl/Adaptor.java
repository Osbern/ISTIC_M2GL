package v2.Adaptor.Impl;

import v2.Adaptor.Clavier;
import v2.Adaptor.Materiel;
import v2.Command.Command;
import v2.Impl.Controller;
import v2.Impl.UI.Led;

/**
 * Cette classe décrit l'adaptateur entre le Controleur et le Matériel. <br />
 * Elle implémente Command car la méthode execute est appelée à intervale
 * régulier pour vérifier l'état du Matériel.
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
	 * Méthode appelée depuis le Controleur pour notifier le passage d'un temps au Matériel
	 */
	public void notifyTemps() {
		mat.getAfficheur().allumerLed(Led.LEDTEMPS);
		mat.getEmetteurSonore().emettreClic();
	}

	/**
	 * Méthode appelée depuis le Controleur pour notifier le passage d'une mesure au Matériel
	 */
	public void notifyMesure() {
		mat.getAfficheur().allumerLed(Led.LEDMESURE);
	}
}
