package v2.Impl;

import java.awt.Color;

import v2.Command.Command;
import v2.Impl.UI.Led;

public class EteindreLed implements Command {
	
	private Led led;
	
	public EteindreLed(Led led) {
		this.led = led;
	}

	@Override
	public void execute() {
		led.setBackground(Color.LIGHT_GRAY);
	}

}
