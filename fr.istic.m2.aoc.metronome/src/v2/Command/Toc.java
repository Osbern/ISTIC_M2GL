package v2.Command;

import v2.Impl.Moteur;

public class Toc implements Command {
	
	private Moteur mot;
	
	public Toc(Moteur mot) {
		this.mot = mot;
	}

	@Override
	public void execute() {
		mot.toc();
	}

}
