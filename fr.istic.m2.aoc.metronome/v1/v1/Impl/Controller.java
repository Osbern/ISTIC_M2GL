package v1.Impl;


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
}
