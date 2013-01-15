package v2.Command;

import v2.Impl.Controller;

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
