package presentation;

import java.awt.FlowLayout;
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
		this.add(cachees);
		this.add(visibles);
		this.setSize(80+(20*26),120);
		this.setPreferredSize(this.getSize());
		this.setLayout(new FlowLayout(FlowLayout.LEADING));
		
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
