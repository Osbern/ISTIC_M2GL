package v1.Impl.UI;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.instruments.SubtractiveSynthVoice;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.SawtoothOscillator;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitGenerator;
import com.jsyn.unitgen.UnitVoice;
import com.softsynth.shared.time.TimeStamp;

/**
 * Play notes using timestamped noteOn and noteOff methods of the UnitVoice.
 * 
 * @author Phil Burk (C) 2009 Mobileer Inc
 * 
 */
public class PlayNotes {
	private Synthesizer synth;
	private UnitGenerator ugen;
	private UnitVoice voice;
	private LineOut lineOut;

	public void play(double freq) {
		// Create a context for the synthesizer.
		synth = JSyn.createSynthesizer();
		synth.getAudioDeviceManager().setSuggestedOutputLatency(0.123);

		// Add a tone generator.
		// synth.add( ugen = new SawtoothOscillator() );
		// synth.add( ugen = new SineOscillator() );
		synth.add(ugen = new SubtractiveSynthVoice());
		voice = (UnitVoice) ugen;
		// Add an output mixer.
		synth.add(lineOut = new LineOut());

		// Connect the oscillator to the left and right audio output.
		voice.getOutput().connect(0, lineOut.input, 0);
		voice.getOutput().connect(0, lineOut.input, 1);

		// Start synthesizer using default stereo output at 44100 Hz.
		synth.start();

		// Get synthesizer time in seconds.
		double timeNow = synth.getCurrentTime();

		// Advance to a near future time so we have a clean start.
		TimeStamp timeStamp = new TimeStamp(timeNow + 0.1);

		// We only need to start the LineOut. It will pull data from the
		// oscillator.
		synth.startUnit(lineOut, timeStamp);

		// Schedule a note on and off.
		voice.noteOn(freq, 0.5, timeStamp);
		voice.noteOff(timeStamp.makeRelative(0.1));
	}
}
