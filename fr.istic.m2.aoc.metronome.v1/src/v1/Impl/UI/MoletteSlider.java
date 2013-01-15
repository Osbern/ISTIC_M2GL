package v1.Impl.UI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		
		this.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseReleased(e);
			ihm.tempoHasChanged(getValue());

			
		}
		});
		
		this.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				ihm.tempoHasChanging(getValue());
			}
		});
	}

}
