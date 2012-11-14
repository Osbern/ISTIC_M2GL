package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @(#) StopButton.java
 */

public class StopButton extends JButton {

	public StopButton(final IHM ihm){
		super("Stop");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.stop();
			}
		});
	}

}
