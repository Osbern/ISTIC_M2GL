package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StopButton extends JButton {

	private static final long serialVersionUID = -8067106469400038413L;

	public StopButton(final IHM ihm){
		super("Stop");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.stop();
				
			}
		});
	}

}
