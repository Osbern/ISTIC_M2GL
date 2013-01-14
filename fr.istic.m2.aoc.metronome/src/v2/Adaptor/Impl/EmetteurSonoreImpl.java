package v2.Adaptor.Impl;

import v1.Impl.UI.PlayNotes;
import v2.Adaptor.EmetteurSonore;

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
