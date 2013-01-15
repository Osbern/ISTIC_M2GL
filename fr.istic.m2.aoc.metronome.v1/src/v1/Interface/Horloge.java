package v1.Interface;

import v1.Interface.Command;

/**
 * Cette interface décrit une horloge exécutant des Command périodiquement
 */
public interface Horloge {
	
	/**
	 * Active la Command cmd toutes les delay ms
	 * @param cmd (Command)
	 * @param delay (float) : delay en ms
	 */
	public void activerPeriodiquement(Command cmd, float delay);
	
	/**
	 * Active la Command cmd après les delay ms
	 * @param cmd (Command)
	 * @param delay (float) : delay en ms
	 */
	public void activerApresDelai(Command cmd, float delay);
	
	/**
	 * Désactiver les commandes exécuter par l'Horloge
	 */
	public void desactiver();
	
}
