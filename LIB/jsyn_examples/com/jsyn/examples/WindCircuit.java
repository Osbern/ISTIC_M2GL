package com.jsyn.examples;

import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.unitgen.*;

/**
 * Wind Sound Create a wind-like sound by feeding white noise "shshshshsh"
 * through a randomly varying state filter to make a "whooowhoosh" sound. The
 * cuttoff frequency of the low pass filter is controlled by a RedNoise unit
 * which creates a slowly varying random control signal.
 * 
 * @author (C) 1997 Phil Burk, SoftSynth.com, All Rights Reserved
 */

public class WindCircuit extends Circuit implements UnitSource
{
	/* Declare units that will be part of the circuit. */
	WhiteNoise myNoise;
	FilterStateVariable myFilter;
	RedNoise myLFO;
	MultiplyAdd myScalar;

	/* Declare ports. */
	public UnitInputPort noiseAmp;
	public UnitInputPort modRate;
	public UnitInputPort modDepth;
	public UnitInputPort cutoff;
	public UnitInputPort resonance;
	public UnitInputPort amplitude;
	public UnitOutputPort output;

	public WindCircuit()
	{
		/*
		 * Create various unit generators and add them to circuit.
		 */
		add( myNoise = new WhiteNoise() );
		add( myFilter = new FilterStateVariable() );
		add( myLFO = new RedNoise() );
		add( myScalar = new MultiplyAdd() );

		/* Make ports on internal units appear as ports on circuit. */
		/* Optionally give some circuit ports more meaningful names. */
		addPort( noiseAmp = myNoise.amplitude, "NoiseAmp" );
		addPort( modRate = myLFO.frequency, "ModRate" );
		addPort( modDepth = myScalar.inputB, "ModDepth" );
		addPort( cutoff = myScalar.inputC, "Cutoff" );
		addPort( resonance = myFilter.resonance );
		addPort( amplitude = myFilter.amplitude );
		addPort( output = myFilter.output );

		/* Connect SynthUnits to make control signal path. */
		myLFO.output.connect( myScalar.inputA );
		myScalar.output.connect( myFilter.frequency );
		/* Connect SynthUnits to make audio signal path. */
		myNoise.output.connect( myFilter.input );

		/* Set ports to useful values and ranges. */
		noiseAmp.setup( 0.0, 0.3, 0.4 );
		modRate.setup( 0.0, 1.0, 10.0 );
		modDepth.setup( 0.0, 300.0, 1000.0 );
		cutoff.setup( 0.0, 600.0, 1000.0 );
		resonance.setup( 0.0, 0.066, 0.2 );
		amplitude.setup( 0.0, 0.9, 0.999 );
	}

	public UnitOutputPort getOutput()
	{
		return output;
	}
}
