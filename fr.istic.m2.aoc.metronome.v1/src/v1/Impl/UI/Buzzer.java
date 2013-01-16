package v1.Impl.UI;

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
