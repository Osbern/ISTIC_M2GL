package com.jsyn.examples;

import com.jsyn.unitgen.UnitFilter;

/**
 * Custom unit generator that can be used with other JSyn units.
 * Cube the input value and write it to output port.
 * 
 * @author Phil Burk (C) 2010 Mobileer Inc
 * 
 */
public class CustomCubeUnit extends UnitFilter
{

	@Override
	/** This is where the synthesis occurs.
	 * It is called in a high priority background thread so do not do
	 * anything crazy here like reading a file or doing network I/O.
	 * Just do fast arithmetic.
	 * <br>
	 * The start and limit allow us to do either block or single sample processing.
	 */
	public void generate( int start, int limit )
	{
		// Get signal arrays from ports.
		double[] inputs = input.getValues();
		double[] outputs = output.getValues();

		for( int i = start; i < limit; i++ )
		{
			double x = inputs[i];
			// Do the math.
			outputs[i] = x * x * x;
		}
	}
}
