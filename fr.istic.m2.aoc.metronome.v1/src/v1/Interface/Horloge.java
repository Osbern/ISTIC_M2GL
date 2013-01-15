package v1.Interface;

import v1.Interface.Command;

public interface Horloge {
	
	public void activerPeriodiquement(Command cmd, float delay);
	public void activerApresDelai(Command cmd, float delay);
	public void desactiver();
	
}
