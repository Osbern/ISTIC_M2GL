package v1.Impl;

import v1.Interface.Command;

/**
 * @(#) TocTemps.java
 */

public class TocTemps implements Command {
	private Controller ctl;
	
	public TocTemps(Controller ctl) {
		this.ctl = ctl;
	}

	@Override
	public void execute() {
		ctl.tocTemps();
	}

}
