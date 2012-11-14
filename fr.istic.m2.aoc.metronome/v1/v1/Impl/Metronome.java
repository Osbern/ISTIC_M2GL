package v1.Impl;

import v1.Impl.UI.IHM;
import v1.Interface.Command;

public class Metronome {
	
	public static final int MESURE_MAX = 7;
	public static final int MESURE_MIN = 2;
	
	
	public static void main(String[] args) {
		Controller ctl = new Controller();
		Moteur mot = new Moteur();
		
		ctl.setMoteur(mot);
		
		Command tocTemps = new TocTemps(ctl);
		Command tocMesure = new TocMesure(ctl);
		
		mot.setController(ctl);
		mot.setTocTemps(tocTemps);
		mot.setTocMesure(tocMesure);
		mot.setTempo(120);
		mot.setMesure(4);
		mot.setEnMarche(false);
		
		IHM ihm = new IHM(ctl);
		ctl.setIHM(ihm);
	}

}
