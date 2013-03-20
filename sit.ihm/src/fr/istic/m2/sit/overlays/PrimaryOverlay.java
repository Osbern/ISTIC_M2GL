package fr.istic.m2.sit.overlays;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.Toast;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

public class PrimaryOverlay extends ItemizedOverlay {
	
	private List<OverlayItem> items = new ArrayList<OverlayItem>();
	private Context context;

	public PrimaryOverlay(Drawable defaultMarker) {
		super(boundCenterBottom(defaultMarker));
	}
	
	public PrimaryOverlay(Drawable defaultMarker, Context context) {
		super(boundCenterBottom(defaultMarker));
		this.context = context;
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
	
	@Override
	public void draw(Canvas canvas, MapView mapView, boolean shadow) {
		super.draw(canvas, mapView, false);
	}
	
	@Override
	public boolean onTap(int index) {
		OverlayItem item = items.get(index);
		Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();
		
		return super.onTap(index);
	}

}
