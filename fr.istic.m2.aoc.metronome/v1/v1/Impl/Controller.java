package v1.Impl;

import v1.Interface.Observer;
import v1.Interface.Subject;

/**
 * @(#) Controller.java
 */

public class Controller implements Observer {
	
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

	@Override
	public void update(Subject s) {
		
	}
	
	public void start() {
		if (!mot.getEtatMarche()) {
			mot.setEnMarche(true);
		}
	}
}
