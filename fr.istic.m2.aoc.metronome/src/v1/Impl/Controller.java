package v1.Impl;

import v2.Adaptor.Impl.Adaptor;


/**
 * @(#) Controller.java
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
	
	public void tocMesure() {
		adapt.notifyMesure();
	}
	
	public void tocTemps() {
		adapt.notifyTemps();
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

	public int getMesure() {
		return mot.getMesure();
	}
}
