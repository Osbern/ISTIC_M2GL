package fr.istic.m2.sit_ihm.items;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

public class Source extends OverlayItem {

	public Source(GeoPoint point, String title, String snippet) {
		super(point, title, snippet);
	}

}
