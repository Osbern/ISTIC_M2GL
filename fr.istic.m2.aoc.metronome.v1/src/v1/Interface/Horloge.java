package v1.Interface;

import v1.Interface.Command;

/**
 * Cette interface d�crit une horloge ex�cutant des Command p�riodiquement
 */
public interface Horloge {
	
	/**
	 * Active la Command cmd toutes les delay ms
	 * @param cmd (Command)
	 * @param delay (float) : delay en ms
	 */
	public void activerPeriodiquement(Command cmd, float delay);
	
	/**
	 * Active la Command cmd apr�s les delay ms
	 * @param cmd (Command)
	 * @param delay (float) : delay en ms
	 */
	public void activerApresDelai(Command cmd, float delay);
	
	/**
	 * D�sactiver les commandes ex�cuter par l'Horloge
	 */
	public void desactiver();
	
}
