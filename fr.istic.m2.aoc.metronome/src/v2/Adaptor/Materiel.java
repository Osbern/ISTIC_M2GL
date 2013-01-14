package v2.Adaptor;

import v1.Impl.HorlogeImpl;
import v1.Impl.UI.IHM;
import v2.Adaptor.Impl.AfficheurImpl;
import v2.Adaptor.Impl.ClavierImpl;

public class Materiel {

	private static Horloge horloge = new HorlogeImpl();
	private static Clavier clavier;
	private static Molette molette;
	private static EmetteurSonore emetteurSonore;
	private static Afficheur afficheur;
	
	public Materiel() {
		IHM ihm = new IHM();
		clavier = new ClavierImpl(ihm.getDecBtn(), ihm.getIncBtn(), ihm.getStartBtn(), ihm.getStopBtn());
		afficheur = new AfficheurImpl(ihm.getLedTemps(), ihm.getLedMesure());
	}
	
	public static Horloge getHorloge() {
		return horloge;
	}

	public static Clavier getClavier() {
		return clavier;
	}

	public static Molette getMolette() {
		return molette;
	}

	public static EmetteurSonore getEmetteurSonore() {
		return emetteurSonore;
	}

	public static Afficheur getAfficheur() {
		return afficheur;
	}	
	
}
