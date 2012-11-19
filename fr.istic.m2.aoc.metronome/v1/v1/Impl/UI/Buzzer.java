package v1.Impl.UI;

import java.awt.Toolkit;


/**
 * @(#) Buzzer.java
 */

public class Buzzer {
	
	public Buzzer() {

	}

	public void update() {
		Toolkit.getDefaultToolkit().beep();
	}
}
