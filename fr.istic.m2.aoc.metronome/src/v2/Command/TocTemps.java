package v2.Command;

import v2.Impl.Controller;

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
