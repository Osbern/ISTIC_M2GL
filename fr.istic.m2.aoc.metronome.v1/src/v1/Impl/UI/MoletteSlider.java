package v1.Impl.UI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MoletteSlider extends JSlider {

	private static final long serialVersionUID = 6659565017126617191L;

	public MoletteSlider(final IHM ihm){
		super();
		this.setName("Tempo");
		this.setMaximum(300);
		this.setMinimum(20);
		this.setValue(120);
		
		this.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseReleased(MouseEvent e) {
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
