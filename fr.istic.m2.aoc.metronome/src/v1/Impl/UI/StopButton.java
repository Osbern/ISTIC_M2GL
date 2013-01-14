package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @(#) StopButton.java
 */

public class StopButton extends JButton {
	
	private boolean etat;

	public StopButton(){
		super("Stop");
		etat = false;
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				etat = true;
			}
		});
	}
	
	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

}
