package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @(#) DecButton.java
 */

public class DecButton extends JButton {

	private IHM ihm;
	private boolean etat;

	public DecButton(){
		super("Dec");
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
