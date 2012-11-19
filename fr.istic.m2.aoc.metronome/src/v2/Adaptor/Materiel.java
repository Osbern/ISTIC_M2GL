package v2.Adaptor;

import v1.Impl.HorlogeImpl;

public class Materiel {

	private static Horloge horloge = new HorlogeImpl();
	private static Clavier clavier;
	private static Molette molette;
	private static EmetteurSonore emetteurSonore;
	private static Afficheur afficheur;
	
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
