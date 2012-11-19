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
		ihm.activerDec();
		if(mot.getMesure() >= 7){
			ihm.desactiverInc();
		}
	}
	
	public void dec() {
		ihm.activerInc();
		mot.setMesure(mot.getMesure() - 1);
		if(mot.getMesure()<=2){
			ihm.desactiverDec();
		}
	}

	public void setTempo(int tempo) {
		mot.setTempo(tempo);
	}
}
