package v2.Adaptor.Impl;

import v2.Adaptor.EmetteurSonore;
import v2.Impl.UI.PlayNotes;

public class EmetteurSonoreImpl implements EmetteurSonore {

	private PlayNotes pn;

	public EmetteurSonoreImpl() {
		pn = new PlayNotes();
	}

	@Override
	public void emettreClic() {
		pn.play(440.0);
	}

}
