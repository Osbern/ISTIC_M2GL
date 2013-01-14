package v1.Impl;

import v1.Interface.Command;
import v2.Adaptor.Materiel;
import v2.Adaptor.Impl.Adaptor;

public class Metronome {
	
	public static void main(String[] args) {
		Controller ctl = new Controller();
		Moteur mot = new Moteur();
		Materiel mat = new Materiel();
		Adaptor adapt = new Adaptor(mat, ctl);
		
		ctl.setMoteur(mot);
		ctl.setAdaptor(adapt);
		
		Command tocTemps = new TocTemps(ctl);
		Command tocMesure = new TocMesure(ctl);
		
		mot.setController(ctl);
		mot.setTocTemps(tocTemps);
		mot.setTocMesure(tocMesure);
		mot.setTempo(120);
		mot.setMesure(4);
		mot.setEnMarche(false);
		
		(new HorlogeImpl()).activerPeriodiquement(adapt, 100);
	}

}
