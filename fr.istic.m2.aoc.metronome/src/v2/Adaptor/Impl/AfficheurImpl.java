package v2.Adaptor.Impl;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import v2.Adaptor.Afficheur;
import v2.Adaptor.Materiel;
import v2.Impl.UI.Led;

public class AfficheurImpl extends JPanel implements Afficheur {
	
	private static final long serialVersionUID = -5772820268148350176L;
	
	private JLabel tempo;
	private Led ledTemps, ledMesure;
	
	public AfficheurImpl(Materiel mat) {
		tempo = new JLabel("120 bpm", SwingConstants.CENTER);
		ledTemps = new Led(Color.GREEN, mat.getHorloge());
		ledMesure = new Led(Color.RED, mat.getHorloge());
		
		this.setLayout(new BorderLayout());
		this.add(ledTemps,BorderLayout.WEST);
		this.add(tempo ,BorderLayout.CENTER);
		this.add(ledMesure, BorderLayout.EAST);
	}

	@Override
	public void allumerLed(int numLED) {
		if (numLED == Led.LEDMESURE)
			ledMesure.update(numLED);
		else
			ledTemps.update(numLED);
	}

	@Override
	public void eteindreLed(int numLED) {
	}

	@Override
	public void afficherTempo(int valeurTempo) {
		tempo.setText(valeurTempo + " bpm");
	}

}
