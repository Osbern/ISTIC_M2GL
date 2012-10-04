package v1.Impl;

import javax.swing.JButton;

import v1.Interface.Observer;
import v1.Interface.Subject;

/**
 * @(#) DecButton.java
 */

public class DecButton extends JButton implements Subject {

	private IHM ihm;
	
	public DecButton(){
		super("Dec");
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
