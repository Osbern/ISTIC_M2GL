package v1.Impl;

import javax.swing.JButton;
import javax.swing.JSlider;

import v1.Interface.Observer;
import v1.Interface.Subject;

/**
 * @(#) MoletteSlider.java
 */

public class MoletteSlider extends JSlider implements Subject {

	private IHM ihm;
	
	public MoletteSlider(){
		super();
		this.setName("Tempo");
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
