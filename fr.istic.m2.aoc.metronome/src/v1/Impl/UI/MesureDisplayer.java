package v1.Impl.UI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import v1.Impl.Constantes;

public class MesureDisplayer extends JPanel {

	private IHM ihm;
	private int mesure, cpt;
	private JButton[] btns;

	public MesureDisplayer(IHM ihm, int mesure) {
		super();
		this.ihm = ihm;
		this.mesure = mesure-1;
		this.cpt = 0;
		btns = new JButton[Constantes.MAX_MESURE];
		this.setLayout(new FlowLayout());
		for (int i = 0; i < btns.length; i++) {
			JButton res = new JButton();
			res.setEnabled(false);
			res.setVisible(i < mesure);
			btns[i] = res;
			this.add(res);
		}

	}

	public void temps() {
		if (cpt == 0) {
			for (int i = 0; i < btns.length; i++) {
				btns[i].setEnabled(false);
			}
		}
		btns[cpt].setEnabled(true);
		cpt++;
	}

	public void mesure() {
		btns[mesure].setEnabled(true);
		cpt = 0;
	}

	public void inc() {
		mesure++;
		btns[mesure].setVisible(true);
	}

	public void dec() {
		btns[mesure].setVisible(false);
		mesure--;
	}
	public void reset(){
		cpt = 0;
		for (int i = 0; i < btns.length; i++) {
			btns[i].setEnabled(false);
		}
	}

}
