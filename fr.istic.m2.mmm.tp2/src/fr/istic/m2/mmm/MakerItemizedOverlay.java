package fr.istic.m2.mmm;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;
import android.widget.Toast;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class MakerItemizedOverlay extends ItemizedOverlay {
	
	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();

	public MakerItemizedOverlay(Drawable defaultMarker) {
		super(boundCenterBottom(defaultMarker));
	}
	
	public void addOverlay(OverlayItem overlay) {
		mOverlays.add(overlay);
		populate();
	}

	@Override
	protected OverlayItem createItem(int i) {
		return mOverlays.get(i);
	}

	@Override
	public int size() {
		return mOverlays.size();
	}
	
	@Override
	protected boolean onTap(int index) {
		OverlayItem item = mOverlays.get(index);
		Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
		
		return super.onTap(index);
	}

}
