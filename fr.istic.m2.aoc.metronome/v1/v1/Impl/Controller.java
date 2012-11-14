package v1.Impl;

import v1.Impl.UI.IHM;


/**
 * @(#) Controller.java
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
	
	public void tocMesure() {
		ihm.notifyMesure();
	}
	
	public void tocTemps() {
		ihm.notifyTemps();
	}
	
	public void start() {
		if (!mot.getEtatMarche()) {
			mot.setEnMarche(true);
		}
	}
	
	public void stop() {
		if (mot.getEtatMarche()) {
			mot.setEnMarche(false);
		}
	}
	
	public void inc() {
		mot.setMesure(mot.getMesure() + 1);
	}
	
	public void dec() {
		mot.setMesure(mot.getMesure() - 1);
	}

	public void setTempo(int tempo) {
		mot.setTempo(tempo);
	}
}
