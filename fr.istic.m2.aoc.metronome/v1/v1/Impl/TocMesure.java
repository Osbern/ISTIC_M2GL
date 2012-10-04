package v1.Impl;

import v1.Interface.Command;

/**
 * @(#) TocMesure.java
 */

public class TocMesure implements Command {
	private Controller ctl;
	
	public TocMesure(Controller ctl) {
		this.ctl = ctl;
	}

	@Override
	public void execute() {
		ctl.tocMesure();
	}

}
