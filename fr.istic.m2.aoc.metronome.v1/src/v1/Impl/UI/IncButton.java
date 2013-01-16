package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class IncButton extends JButton {

	private static final long serialVersionUID = 8503568033048939954L;

	public IncButton(final IHM ihm){
		super("Inc");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.incMesure();
			}
		});
	}
}
