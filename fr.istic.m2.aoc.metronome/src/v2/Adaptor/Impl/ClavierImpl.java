package v2.Adaptor.Impl;

import v1.Impl.UI.DecButton;
import v1.Impl.UI.IncButton;
import v1.Impl.UI.StartButton;
import v1.Impl.UI.StopButton;
import v2.Adaptor.Clavier;

public class ClavierImpl implements Clavier {
	
	public static final int DEC = 0, INC = 1, START = 2, STOP = 3;
	
	private DecButton dec;
	private IncButton inc;
	private StartButton start;
	private StopButton stop;
	
	public ClavierImpl(DecButton dec, IncButton inc, StartButton start, StopButton stop) {
		this.dec = dec;
		this.inc = inc;
		this.start = start;
		this.stop = stop;
	}

	@Override
	public boolean touchePressee(int i) {
		boolean res = false;
		switch (i) {
		case DEC:
			res = dec.isEtat();
			dec.setEtat(false);
			break;
		case INC:
			res = inc.isEtat();
			inc.setEtat(false);
			break;
		case START:
			res = start.isEtat();
			start.setEtat(false);
			break;
		case STOP:
			res = stop.isEtat();
			stop.setEtat(false);
			break;
		}
		return res;
	}
}
