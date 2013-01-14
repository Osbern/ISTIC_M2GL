package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @(#) IncButton.java
 */

public class IncButton extends JButton {

	public IncButton(final IHM ihm){
		super("Inc");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.incMesure();
			}
		});
	}
}
