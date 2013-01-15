package v1.Impl.UI;

import java.awt.Toolkit;


/**
 * @(#) Buzzer.java
 */
public class Buzzer {
	
	private PlayNotes pn;
	
	public Buzzer() {
		pn = new PlayNotes();
	}

	public void update() {
		//Toolkit.getDefaultToolkit().beep();
		pn.play(440.0);
	}
}
