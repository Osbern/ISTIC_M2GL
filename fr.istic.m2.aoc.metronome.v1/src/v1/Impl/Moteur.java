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
	private float tempo;

	
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
	
	/**
	 * Appel TocTemps et calcul si le moteur doit appeler la Command TocMesure
	 */
	private void calcMesure() {
		tocTemps.execute();
		if (t >= mesure) {
			tocMesure.execute();
			t = 0;
		}
	}
	
	public boolean getEtatMarche() {
		return enMarche;
	}

	/**
	 * Démarre ou arrète le Moteur et calcul le delay en ms selon le tempo
	 * @param actif : Etat du Moteur
	 */
	public void setEnMarche(boolean actif) {
		enMarche = actif;
		
		if (enMarche) {
			float delay = 1000 / (tempo / 60);
			timer.activerPeriodiquement(new Toc(this), delay);
		} else {
			timer.desactiver();
			t = 0;
		}
	}

	/**
	 * Incrémente la mesure de 1
	 */
	public void inc() {
		if (mesure < Constantes.MAX_MESURE)
			mesure++;
	}

	/**
	 * Décrémente la mesure de 1
	 */
	public void dec() {
		if (mesure > Constantes.MIN_MESURE)
			mesure--;
	}

	/**
	 * Change le tempo actif du Moteur si selui-ci est en marche
	 * @param tempo (float) : nouvelle valeur du tempo
	 */
	public void setTempo(float tempo) {
		this.tempo = tempo;
		if (enMarche) {
			timer.desactiver();
			float delay = 1000 / (tempo / 60);
			timer.activerPeriodiquement(new Toc(this), delay);
		}
	}

	public float getTempo() {
		return tempo;
	}
	
	/**
	 * Change la valeur de la mesure actif par la nouvelle
	 * @param mesure (int) : nouvelle valeur de la mesure
	 */
	public void setMesure(int mesure) {
		if (mesure >= Constantes.MIN_MESURE && mesure <= Constantes.MAX_MESURE)
			this.mesure = mesure;
	}
	
	public int getMesure() {
		return mesure;
	}
}
