package v1.Impl;

import v1.Impl.UI.Led;
import v1.Interface.Command;

public class EteindreLed implements Command {
	
	private Led led;
	
	public EteindreLed(Led led2) {
		this.led = led2;
	}

	@Override
	public void execute() {
		led.setVisible(false);
		led.repaint();
	}

}
