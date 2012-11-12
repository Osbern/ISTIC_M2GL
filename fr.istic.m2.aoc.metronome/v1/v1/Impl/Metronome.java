package v1.Impl;

import javax.swing.JFrame;

import v1.Interface.Command;

public class Metronome {
	
	public static final int MESURE_MAX = 7;
	public static final int MESURE_MIN = 2;
	
	
	public static void main(String[] args) {
		Controller ctl = new Controller();
		Moteur mot = new Moteur();
		
		IHM ihm = new IHM(ctl);
		Command tocTemps = new TocTemps(ctl);
		Command tocMesure = new TocMesure(ctl);
		
		ctl.setMoteur(mot);
		ctl.setIHM(ihm);
		
		mot.setController(ctl);
		mot.setTocTemps(tocTemps);
		mot.setTocMesure(tocMesure);
		mot.setTempo(120);

		mot.setEnMarche(false);
	}

}
