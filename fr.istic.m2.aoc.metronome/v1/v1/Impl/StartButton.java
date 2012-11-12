package v1.Impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import v1.Interface.Observer;
import v1.Interface.Subject;

/**
 * @(#) StartButton.java
 */

public class StartButton extends JButton implements Subject {

	private IHM ihm;
	
	public StartButton(final IHM ihm) {
		super("Start");
		this.ihm = ihm;
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.start();
			}
		});
	}

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObs() {
		// TODO Auto-generated method stub
		
	}

}
