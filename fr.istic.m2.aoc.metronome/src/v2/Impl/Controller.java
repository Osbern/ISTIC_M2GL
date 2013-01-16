package v2.Impl;

import v2.Adaptor.Impl.Adaptor;

/**
 * Cette classe décrit le controleur de l'application; <br />
 * il s'agit ici de mettre en oeuvre la liaison
 * <b>Moteur</b><--><b>Adaptateur</b>
 */

public class Controller {

	private Adaptor adapt;
	private Moteur mot;

	public Controller() {
	}

	public void setMoteur(Moteur mot) {
		this.mot = mot;
	}

	public void setAdaptor(Adaptor adapt) {
		this.adapt = adapt;
	}

	/**
	 * Informe de la fin d'une mesure
	 */
	public void tocMesure() {
		adapt.notifyMesure();
	}

	/**
	 * Informe qu'un temps est passé
	 */
	public void tocTemps() {
		adapt.notifyTemps();
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
	 * Arrete le moteur
	 */
	public void stop() {
		if (mot.getEtatMarche()) {
			mot.setEnMarche(false);
		}
	}

	/**
	 * Augmente la mesure
	 */
	public void inc() {
		mot.setMesure(mot.getMesure() + 1);
	}
	/**
	 * Diminue la mesure
	 */
	public void dec() {
		mot.setMesure(mot.getMesure() - 1);
	}

	public void setTempo(int tempo) {
		mot.setTempo(tempo);
	}

	public int getMesure() {
		return mot.getMesure();
	}
}
