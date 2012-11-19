package v2.Adaptor;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (Materiel.getHorloge() != null) 
			System.out.println("NOT NULL");
		else
			System.out.println("NULL");
	}

}
