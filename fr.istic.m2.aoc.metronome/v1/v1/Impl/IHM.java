package v1.Impl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import v1.Interface.Horloge;

/**
 * @(#) IHM.java
 */

public class IHM extends JFrame {

	private Controller ctl;
	private Horloge h;
	private Buzzer bzzr;
	
	private StartButton startBtn;
	private StopButton stopBtn;
	
	private DecButton decBtn;
	private IncButton incBtn;
	
	private MoletteSlider moletteSldr;
	
	private Afficheur aff;
	private Led ledTemps;
	private Led ledMesure;
	private JPanel barreDeBouttons;

	public IHM(Controller ctl) {
		this.ctl = ctl;
		h = new HorlogeImpl();
		bzzr = new Buzzer();
		stopBtn = new StopButton(this);
		startBtn = new StartButton(this);
		decBtn = new DecButton();
		incBtn = new IncButton();
		moletteSldr = new MoletteSlider();
		aff = new Afficheur();
		ledTemps = new Led(Color.GREEN, h);
		ledMesure = new Led(Color.RED, h);
		
		
		this.setPreferredSize(new Dimension(300, 150));
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		
		
		
		barreDeBouttons = new JPanel();
		barreDeBouttons.setLayout(new FlowLayout());
		barreDeBouttons.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		barreDeBouttons.add(startBtn);
		barreDeBouttons.add(stopBtn);
		barreDeBouttons.add(incBtn);
		barreDeBouttons.add(decBtn);
		
		this.add(barreDeBouttons, BorderLayout.SOUTH);
		
		
		this.add(moletteSldr, BorderLayout.NORTH);
		
		this.add(ledTemps, BorderLayout.WEST);
		this.add(ledMesure, BorderLayout.EAST);
		
		this.add(aff, BorderLayout.CENTER);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);
				System.exit(0);
			}
		});
		
		this.pack();
	}
	
	public void notifyTemps() {
		ledTemps.update();
	}
	
	public void notifyMesure() {
		ledMesure.update();
	}
	
	public void start() {
		ctl.start();
	}
	
	public void stop() {
		ctl.stop();
	}
}
