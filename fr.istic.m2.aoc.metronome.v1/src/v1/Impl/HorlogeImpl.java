package v1.Impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import v1.Interface.Command;
import v1.Interface.Horloge;

public class HorlogeImpl implements Horloge {
	
	private Timer timer;
	
	public HorlogeImpl() {
		timer = new Timer(0, null);
		timer.stop();
	}
	
	public void activerPeriodiquement(Command cmd, float delay) {
		timer.setDelay((int) delay);
		timer.addActionListener(new TimerListener(cmd, true));
		timer.start();
	}
	
	public void activerApresDelai(Command cmd, float delay) {
		timer.setInitialDelay((int) delay);
		timer.addActionListener(new TimerListener(cmd, false));
		timer.start();
	}
	
	public void desactiver() {
		timer.stop();
		for (ActionListener al : timer.getActionListeners()) {
			timer.removeActionListener(al);
		}
	}
	
	private class TimerListener implements ActionListener {
		
		private Command cmd;
		private boolean loop;
		
		public TimerListener(Command cmd, boolean loop) {
			this.cmd = cmd;
			this.loop = loop;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			cmd.execute();
			if (!loop)
				timer.removeActionListener(this);
		}
	}

}
