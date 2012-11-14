package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @(#) DecButton.java
 */

public class DecButton extends JButton {

	private IHM ihm;
	
	public DecButton(final IHM ihm){
		super("Dec");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.decMesure();
			}
		});
	}

}
