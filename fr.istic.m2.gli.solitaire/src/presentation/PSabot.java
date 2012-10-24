package presentation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import controller.CSabot;

public class PSabot extends JPanel {
	
	private CSabot cs;
	private PTasDeCartes cachees, visibles;
	private SabotListener sl;

	public PSabot(CSabot cs, PTasDeCartes cachees, PTasDeCartes visibles) {
		this.cs = cs;
		this.cachees = cachees;
		this.visibles = visibles;
		add(cachees);
		add(visibles);
		
		sl = new SabotListener();
		setVisible(true);
	}

	public void activerRetournerCarte() {
		cachees.addMouseListener(sl);
	}

	public void desactiverRetournerCarte() {
		cachees.removeMouseListener(sl);
	}

	public void activerRetournerSabot() {
		cachees.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				try {
					desactiverRetournerCarte();
					cs.retourner();
					activerRetournerCarte();
					cachees.removeMouseListener(this);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});	
	}
	
	private class SabotListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			cs.retourner3Carte();
		}
	}

}
