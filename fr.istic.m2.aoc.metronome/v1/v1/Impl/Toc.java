package v1.Impl;

import v1.Interface.Command;

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
