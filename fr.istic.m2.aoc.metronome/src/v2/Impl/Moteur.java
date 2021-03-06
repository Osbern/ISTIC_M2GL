package v2.Impl;

import v2.Adaptor.Horloge;
import v2.Adaptor.Impl.HorlogeImpl;
import v2.Command.Command;
import v2.Command.Toc;

public class Moteur {

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
	 * D�marre ou arr�te le Moteur et calcul le delai en ms selon le tempo
	 * 
	 * @param actif
	 *            : Etat du Moteur
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
	 * Incr�mente la mesure de 1
	 */
	public void inc() {
		if (mesure < Constantes.MAX_MESURE)
			mesure++;
	}

	/**
	 * D�cr�mente la mesure de 1
	 */
	public void dec() {
		if (mesure > Constantes.MIN_MESURE)
			mesure--;
	}

	/**
	 * Change le tempo actif du Moteur si celui-ci est en marche
	 * 
	 * @param tempo
	 *            (float) : nouvelle valeur du tempo
	 */
	public void setTempo(float tempo) {
		this.tempo = tempo;
		if (enMarche) {
			timer.desactiver();
			float delay = 1000 / (tempo / 60);
			timer.activerPeriodiquement(new Toc(this), delay);
		}
	}

	/**
	 * Change la valeur de la mesure actif par la nouvelle
	 * 
	 * @param mesure
	 *            (int) : nouvelle valeur de la mesure
	 */
	public float getTempo() {
		return tempo;
	}

	public void setMesure(int mesure) {
		if (mesure >= Constantes.MIN_MESURE && mesure <= Constantes.MAX_MESURE)
			this.mesure = mesure;
	}

	public int getMesure() {
		return mesure;
	}
}
