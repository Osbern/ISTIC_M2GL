package fr.istic.m2.sit_ihm.overlays;

import java.util.ArrayList;
import java.util.List;

import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class PrimaryOverlay extends ItemizedOverlay {
	
	private List<OverlayItem> items = new ArrayList<OverlayItem>();

	public PrimaryOverlay(Drawable defaultMarker) {
		super(boundCenterBottom(defaultMarker));
	}
	
	public void addOverlay(OverlayItem item) {
		items.add(item);
		populate();
	}

	@Override
	protected OverlayItem createItem(int i) {
		return items.get(i);
	}

	@Override
	public int size() {
		return items.size();
	}

}
