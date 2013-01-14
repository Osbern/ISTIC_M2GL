package v1.Impl;

import v1.Impl.UI.IHM;
import v2.Adaptor.Materiel;


/**
 * @(#) Controller.java
 */

public class Controller {
	
	public static int LED_MESURE = 0;
	public static int LED_TEMPS = 1;
	
	//private IHM ihm;
	private Moteur mot;
	private Materiel mat;
	
	
	public Controller() {
	}
	
	public void setMoteur(Moteur mot) {
		this.mot = mot;
	}
	
	public void setMateriel(Materiel mat) {
		this.mat = mat;
	}
	
//	public void setIHM(IHM ihm) {
//		this.ihm = ihm;
//	}
	
	public void tocMesure() {
		// ihm.notifyMesure();
		mat.getAfficheur().allumerLed(LED_MESURE);
	}
	
	public void tocTemps() {
		// ihm.notifyTemps();
		mat.getAfficheur().allumerLed(LED_TEMPS);
		mat.getEmetteurSonore().emettreClic();
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
//		ihm.activerDec();
//		if(mot.getMesure() >= 7){
//			ihm.desactiverInc();
//		}
	}
	
	public void dec() {
//		ihm.activerInc();
		mot.setMesure(mot.getMesure() - 1);
//		if(mot.getMesure()<=2){
//			ihm.desactiverDec();
//		}
	}

	public void setTempo(int tempo) {
		mot.setTempo(tempo);
	}

	public int getMesure() {
		return mot.getMesure();
	}
}
