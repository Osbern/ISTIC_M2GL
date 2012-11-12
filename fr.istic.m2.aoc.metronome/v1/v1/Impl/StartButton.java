package v1.Impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @(#) StartButton.java
 */

public class StartButton extends JButton {

	public StartButton(final IHM ihm) {
		super("Start");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.start();
			}
		});
	}
}
