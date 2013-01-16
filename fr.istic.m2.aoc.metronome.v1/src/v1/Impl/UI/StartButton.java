package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StartButton extends JButton {

	private static final long serialVersionUID = -1806096107641327562L;

	public StartButton(final IHM ihm) {
		super("Start");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.start();
			}
		});
	}
}
