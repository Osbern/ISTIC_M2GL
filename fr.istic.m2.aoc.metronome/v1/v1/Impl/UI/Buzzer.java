package v1.Impl.UI;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/**
 * @(#) Buzzer.java
 */

public class Buzzer {
	
	private SourceDataLine auline;
	private AudioInputStream audioInputStream;
	
	public Buzzer() {
		String filename = "C:\\Users\\28002846\\ISTIC_M2GL\\fr.istic.m2.aoc.metronome\\audio\\pop.wav";

		File soundFile = new File(filename);

		if (!soundFile.exists()) {
			System.err.println("Wave file not found: " + filename);
			return;
		}

		audioInputStream = null;
		try {
			audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		AudioFormat format = audioInputStream.getFormat();
		auline = null;

		DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

		try {
			auline = (SourceDataLine) AudioSystem.getLine(info);
			auline.open(format);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	public void update() {
		int EXTERNAL_BUFFER_SIZE = 524288;

		auline.start();

		int nBytesRead = 0;
		byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

		try {
			while (nBytesRead != -1) {
				nBytesRead = audioInputStream.read(abData, 0, abData.length);
				if (nBytesRead >= 0) {
					auline.write(abData, 0, nBytesRead);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} finally {
			auline.drain();
			auline.close();
		}
	}
}
