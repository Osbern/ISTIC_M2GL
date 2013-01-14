package v2.Adaptor.Impl;

import v1.Impl.UI.Led;
import v2.Adaptor.Afficheur;

public class AfficheurImpl implements Afficheur {
	
	private Led ledTemps, ledMesure;
	
	public AfficheurImpl(Led ledTemps, Led ledMesure) {
		this.ledTemps = ledTemps;
		this.ledMesure = ledMesure;
	}

	@Override
	public void allumerLed(int numLED) {
		if (numLED == Led.LED_TEMPS) {
			ledTemps.update(numLED);
		} else {
			ledMesure.update(numLED);
		}
	}

	@Override
	public void eteindreLed(int numLED) {
	}

	@Override
	public void afficherTempo(int valeurTempo) {
		
	}

}
