package v1.Impl;

import java.awt.Color;

import v1.Impl.UI.Led;
import v1.Interface.Command;

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
