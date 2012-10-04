package v1.Interface;

public interface Horloge {
	
	public void activerPeriodiquement(Command cmd, float delay);
	public void activerApresDelai(Command cmd, float delay);
	public void desactiver();
	
}
