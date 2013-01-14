package v2.Adaptor.Impl;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSlider;

import v2.Adaptor.Molette;

public class MoletteImpl extends JSlider implements Molette {

	private int tempo;

	public MoletteImpl() {
		super();
		this.setName("Tempo");
		this.setMaximum(300);
		this.setMinimum(20);
		this.setValue(120);

		tempo = 120;

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				tempo = getValue();
			}
		});
	}

	@Override
	public float position() {
		return tempo;
	}

}
