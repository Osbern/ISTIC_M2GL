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
	
	public void tocMesure() {
		System.out.print(" ");
	}
	
	public void tocTemps() {
		System.out.print("|");
	}

	@Override
	public void update(Subject s) {
		
	}

}
