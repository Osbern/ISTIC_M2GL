package v1.Impl;

import v1.Impl.UI.IHM;

/**
 * Cette classe décrit le controleur de l'application; <br />
 * il s'agit ici de mettre en oeuvre la liaison <b>Moteur</b><--><b>IHM</b>
 */

public class Controller {

	private IHM ihm;
	private Moteur mot;

	public Controller() {
	}

	public void setMoteur(Moteur mot) {
		this.mot = mot;
	}

	public void setIHM(IHM ihm) {
		this.ihm = ihm;
	}

	/**
	 * Informe l'ihm de la fin d'une mesure
	 */
	public void tocMesure() {
		ihm.notifyMesure();
	}

	/**
	 * Informe l'IHM qu'un temps est passé
	 */
	public void tocTemps() {
		ihm.notifyTemps();
	}

	/**
	 * Mettre en route le moteur
	 */
	public void start() {
		if (!mot.getEtatMarche()) {
			mot.setEnMarche(true);
		}
	}

	/**
	 * Arreter le moteur
	 */
	public void stop() {
		if (mot.getEtatMarche()) {
			mot.setEnMarche(false);
		}
	}

	/**
	 * Augmente la mesure sur le moeur et sur l'ihm
	 */
	public void inc() {
		mot.setMesure(mot.getMesure() + 1);
		ihm.activerDec();
		if (mot.getMesure() >= 7) {
			ihm.desactiverInc();
		}
	}

	/**
	 * Diminue la mesure sur le moteur et sur l'ihm
	 */
	public void dec() {
		ihm.activerInc();
		mot.setMesure(mot.getMesure() - 1);
		if (mot.getMesure() <= 2) {
			ihm.desactiverDec();
		}
	}

	public void setTempo(int tempo) {
		mot.setTempo(tempo);
	}

	public int getMesure() {
		return mot.getMesure();
	}
}
