package v1.Impl.UI;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @(#) MoletteSlider.java
 */

public class MoletteSlider extends JSlider {

	public MoletteSlider(final IHM ihm){
		super();
		this.setName("Tempo");
		this.setMaximum(300);
		this.setMinimum(20);
		this.setValue(120);
		
		this.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ihm.tempoHasChanged(getValue());
			}
		});
	}

}
