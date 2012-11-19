package com.jsyn.examples;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.scope.AudioScope;
import com.jsyn.swing.JAppletFrame;
import com.jsyn.swing.PortControllerFactory;
import com.jsyn.unitgen.ImpulseOscillator;
import com.jsyn.unitgen.ImpulseOscillatorBL;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.LinearRamp;
import com.jsyn.unitgen.Multiply;
import com.jsyn.unitgen.PulseOscillator;
import com.jsyn.unitgen.PulseOscillatorBL;
import com.jsyn.unitgen.RedNoise;
import com.jsyn.unitgen.SawtoothOscillator;
import com.jsyn.unitgen.SawtoothOscillatorBL;
import com.jsyn.unitgen.SawtoothOscillatorDPW;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.SquareOscillator;
import com.jsyn.unitgen.SquareOscillatorBL;
import com.jsyn.unitgen.TriangleOscillator;
import com.jsyn.unitgen.UnitOscillator;

/**
 * Display each oscillators waveform using the AudioScope. This is a
 * reimplementation of the TJ_SeeOsc Applet from the old API.
 * 
 * @author Phil Burk (C) 2010 Mobileer Inc
 * 
 */
public class SeeOscillators extends JApplet
{
	private static final long serialVersionUID = -8315903842197137926L;
	private Synthesizer synth;
	private ArrayList<UnitOscillator> oscillators = new ArrayList<UnitOscillator>();
	private LineOut lineOut;
	private AudioScope scope;
	private JPanel oscPanel;
	private Multiply oscGain;
	private ButtonGroup buttonGroup;
	private LinearRamp freqRamp;

	/* Can be run as either an application or as an applet. */
	public static void main( String args[] )
	{
		SeeOscillators applet = new SeeOscillators();
		JAppletFrame frame = new JAppletFrame( "ShowWaves", applet );
		frame.setSize( 640, 500 );
		frame.setVisible( true );
		frame.test();
		frame.validate();
	}

	private void setupGUI()
	{
		setLayout( new BorderLayout() );

		add( BorderLayout.NORTH, new JLabel(
				"Show Oscillators in an AudioScope" ) );

		scope = new AudioScope( synth );
		scope.addProbe( oscGain.output );
		scope.setTriggerMode( AudioScope.TriggerMode.NORMAL );
		//scope.getModel().getTriggerModel().getLevelModel().setDoubleValue( 0.0001 );
		// Turn off the gain and trigger control GUI.
		scope.getView().setShowControls( false );
		scope.start();
		add( BorderLayout.CENTER, scope.getView() );

		JPanel southPanel = new JPanel();
		southPanel.setLayout( new GridLayout( 0, 1 ) );
		add( BorderLayout.SOUTH, southPanel );
		
		oscPanel = new JPanel();
		oscPanel.setLayout( new GridLayout( 2, 5 ) );
		southPanel.add( oscPanel );

		southPanel.add( PortControllerFactory.createExponentialPortSlider( freqRamp.input ) );
		southPanel.add( PortControllerFactory.createExponentialPortSlider( oscGain.inputB ) );

		oscPanel.validate();
		validate();
	}

	public void start()
	{
		synth = JSyn.createSynthesizer();

		// Use a multiplier for gain control and so we can hook up to the scope
		// from a single unit.
		synth.add( oscGain = new Multiply() );
		oscGain.inputB.setup( 0.02, 0.5, 1.0 );
		oscGain.inputB.setName( "Amplitude" );

		synth.add( freqRamp = new LinearRamp() );
		freqRamp.input.setup( 50.0, 300.0, 20000.0 );
		freqRamp.input.setName( "Frequency" );
		freqRamp.time.set( 0.1 );

		// Add an output so we can hear the oscillators.
		synth.add( lineOut = new LineOut() );

		oscGain.output.connect( lineOut.input );

		setupGUI();

		buttonGroup = new ButtonGroup();

		addOscillator( new SineOscillator(), "Sine" );
		addOscillator( new TriangleOscillator(), "Triangle" );
		addOscillator( new SawtoothOscillator(), "Sawtooth" );
		addOscillator( new SawtoothOscillatorBL(), "SawBL" );
		addOscillator( new SawtoothOscillatorDPW(), "SawDPW" );
		addOscillator( new RedNoise(), "RedNoise" );
		
		addOscillator( new SquareOscillator(), "Square" );
		addOscillator( new SquareOscillatorBL(), "SquareBL" );
		addOscillator( new PulseOscillator(), "Pulse" );
		addOscillator( new PulseOscillatorBL(), "PulseBL" );
		addOscillator( new ImpulseOscillator(), "Impulse" );
		addOscillator( new ImpulseOscillatorBL(), "ImpulseBL" );

		// Start synthesizer using default stereo output at 44100 Hz.
		synth.start();
		// Start lineOut so it can pull data from other units.
		lineOut.start();

		// We only need to start the LineOut. It will pull data from the
		// oscillator.
		lineOut.start();

	}

	private void addOscillator( final UnitOscillator osc, String label )
	{
		oscillators.add( osc );
		synth.add( osc );
		freqRamp.output.connect( osc.frequency );
		osc.amplitude.set( 1.0 );
		JRadioButton checkBox = new JRadioButton( label );
		buttonGroup.add( checkBox );
		checkBox.addActionListener(new ActionListener()
		{
			public void actionPerformed( ActionEvent arg0 )
			{
				// Disconnect other oscillators.
				oscGain.inputA.disconnectAll( 0 );
				// Connect this one.
				osc.output.connect( oscGain.inputA );
			}
		} );
		oscPanel.add( checkBox );
	}

	public void stop()
	{
		scope.stop();
		synth.stop();
	}

}
