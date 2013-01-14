package v1.Impl.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import v1.Impl.Controller;
import v1.Impl.HorlogeImpl;
import v2.Adaptor.Horloge;

/**
 * @(#) IHM.java
 */

public class IHM extends JFrame {

	private Controller ctl;
	private Buzzer bzzr;

	private StartButton startBtn;
	private StopButton stopBtn;

	private DecButton decBtn;
	private IncButton incBtn;

	private MoletteSlider moletteSldr;
	private MesureDisplayer md;

	private Afficheur aff;
	private Led ledTemps;
	private Led ledMesure;
	private JPanel barreDeBouttons;

	private Horloge h;

	private int tempo;
	private JPanel zoneDuCentre;
	private Afficheur affMesure;

	public IHM(final Controller ctl) {
		this.ctl = ctl;
		bzzr = new Buzzer();
		stopBtn = new StopButton(this);
		startBtn = new StartButton(this);
		decBtn = new DecButton(this);
		incBtn = new IncButton(this);
		moletteSldr = new MoletteSlider(this);
		aff = new Afficheur(this);
		md = new MesureDisplayer(this, ctl.getMesure());
		
		h = new HorlogeImpl();
		ledTemps = new Led(Color.GREEN, h);
		ledMesure = new Led(Color.RED,h );
		
		affMesure = new Afficheur(this);
		affMesure.setText(""+ctl.getMesure());


		tempoHasChanged(moletteSldr.getValue());

		this.setPreferredSize(new Dimension(300, 150));
		this.setVisible(true);
		this.setLayout(new BorderLayout());

		stopBtn.setEnabled(false);
		
		barreDeBouttons = new JPanel();
		barreDeBouttons.setLayout(new FlowLayout());
		barreDeBouttons
				.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		barreDeBouttons.add(startBtn);
		barreDeBouttons.add(stopBtn);
		barreDeBouttons.add(affMesure);
		barreDeBouttons.add(incBtn);
		barreDeBouttons.add(decBtn);
		this.add(barreDeBouttons, BorderLayout.SOUTH);

		zoneDuCentre = new JPanel();
		zoneDuCentre.setLayout(new BorderLayout());
		zoneDuCentre.add(ledTemps,BorderLayout.WEST);
		zoneDuCentre.add(aff,BorderLayout.CENTER);
		zoneDuCentre.add(ledMesure, BorderLayout.EAST);
		zoneDuCentre.add(md, BorderLayout.SOUTH);

		this.add(zoneDuCentre, BorderLayout.CENTER);
		this.add(moletteSldr, BorderLayout.NORTH);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});

		this.pack();
	}

	public void notifyTemps() {
		md.temps();
		ledTemps.update(Led.LEDTEMPS);
		bzzr.update();
	}

	public void notifyMesure() {
		md.mesure();
		ledMesure.update(Led.LEDMESURE);
	}

	public void start() {
		ctl.start();
		stopBtn.setEnabled(true);
	}

	public void stop() {
		ctl.stop();
		stopBtn.setEnabled(false);
		md.reset();
	}

	public void incMesure() {
		ctl.inc();
		md.inc();
		affMesure.setText("" + ctl.getMesure());
	}

	public void decMesure() {
		ctl.dec();
		md.dec();
		affMesure.setText("" + ctl.getMesure());
	}

	public void tempoHasChanged(int newTempo) {
		tempo = newTempo;
		aff.setText(tempo + " bpm");
		ctl.setTempo(tempo);
	}

	public int getTempo() {
		return tempo;
	}

	public void activerDec() {
		decBtn.setEnabled(true);
	}

	public void desactiverInc() {
		incBtn.setEnabled(false);
	}

	public void activerInc() {
		incBtn.setEnabled(true);
	}

	public void desactiverDec() {
		decBtn.setEnabled(false);
	}

	public void tempoHasChanging(int value) {
		aff.setText(value + " bpm");
	}

}
