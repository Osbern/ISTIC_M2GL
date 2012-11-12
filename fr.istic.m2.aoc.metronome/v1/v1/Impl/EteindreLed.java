package v1.Impl;

import v1.Interface.Command;

public class EteindreLed implements Command {
	
	private Led led;
	
	public EteindreLed(Led led) {
		this.led = led;
	}

	@Override
	public void execute() {
		led.setVisible(false);
		led.repaint();
	}

}
