package v2.Adaptor;

import v2.Command.Command;

public interface Horloge {
	
	public void activerPeriodiquement(Command cmd, float delay);
	public void activerApresDelai(Command cmd, float delay);
	public void desactiver();
	
}
