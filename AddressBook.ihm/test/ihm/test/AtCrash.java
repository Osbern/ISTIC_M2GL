package ihm.test;

import com.windowtester.runtime.swing.UITestCaseSwing;

public class AtCrash extends UITestCaseSwing {

	/*
	 * ce test �choue obligatoirement; il n'est en effet pas possible de
	 * reproduire le bug de fa�on automatique. la saisie d'un @ dans un chaine
	 * de caract�re Java n'entrainant pas de crash
	 */
	public void testAtCrash() throws Exception {
		fail("not testable but enter an '@' in a field make the app crash");

	}

}