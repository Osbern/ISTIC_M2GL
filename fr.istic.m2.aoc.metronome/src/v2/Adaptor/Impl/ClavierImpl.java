package v2.Adaptor.Impl;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import v2.Adaptor.Clavier;
import v2.Adaptor.Materiel;

public class ClavierImpl extends JPanel implements Clavier {
	
	private boolean decE, incE, startE, stopE;
	
	private JButton decBtn;
	private JButton incBtn;
	private JButton startBtn;
	private JButton stopBtn;
	
	public ClavierImpl() {
		decBtn = new JButton("Dec");
		incBtn = new JButton("Inc");
		startBtn = new JButton("Start");
		stopBtn = new JButton("Stop");
		
		decE = incE = startE = stopE = false;
		
		
		decBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				decE = true;
			}
		});
		
		incBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				incE = true;
			}
		});
		
		startBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startE = true;
			}
		});
		
		stopBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stopE = true;
			}
		});
		
		this.setLayout(new FlowLayout());
		this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		this.add(startBtn);
		this.add(stopBtn);
		this.add(incBtn);
		this.add(decBtn);
	}

	@Override
	public boolean touchePressee(int i) {
		boolean res = false;
		switch (i) {
		case Materiel.DEC:
			res = decE;
			decE = false;
			break;
		case Materiel.INC:
			res = incE;
			incE = false;
			break;
		case Materiel.START:
			res = startE;
			startE = false;
			break;
		case Materiel.STOP:
			res = stopE;
			stopE = false;
			break;
		}
		
		return res;
	}

}
