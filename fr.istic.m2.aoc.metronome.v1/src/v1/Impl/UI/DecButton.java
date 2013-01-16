package v1.Impl.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DecButton extends JButton {

	private static final long serialVersionUID = 1829252068920158548L;
	
	public DecButton(final IHM ihm){
		super("Dec");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ihm.decMesure();
			}
		});
	}

}
