package v1.Impl;

import v1.Interface.Command;
import v1.Interface.Horloge;

/**
 * @(#) Moteur.java
 */

public class Moteur {
	
	private Controller ctl;
	private Horloge timer;
	private Command tocTemps, tocMesure;
	private boolean enMarche;
	private int mesure, t;
	private int tempo;

	
	public Moteur() {
		timer = new HorlogeImpl();
		
		enMarche = false;
		mesure = 4;
		t = 0;
	}
	
	public void setController(Controller ctl) {
		this.ctl = ctl;
	}
	
	public void setTocTemps(Command tocTemps) {
		this.tocTemps = tocTemps;
	}
	
	public void setTocMesure(Command tocMesure) {
		this.tocMesure = tocMesure;
	}
	
	public void toc() {
		t++;
		calcMesure();
	}
	
	private void calcMesure() {
		tocTemps.execute();
		if (t >= mesure) {
			tocMesure.execute();
			t = 0;
		}
	}

	public void setEnMarche(boolean actif) {
		enMarche = actif;
		
		if (enMarche) {
			int delay = 1000 / (((int) tempo) / 60);
			timer.activerPeriodiquement(new Toc(this), delay);
		}
	}

	public void inc() {
		if (mesure < Metronome.MESURE_MAX)
			mesure++;
	}

	public void dec() {
		if (mesure > Metronome.MESURE_MIN)
			mesure--;
	}

	public void setTempo(float tempo) {
		this.tempo = (int) tempo;
	}

	public float getTempo() {
		return tempo;
	}
}
