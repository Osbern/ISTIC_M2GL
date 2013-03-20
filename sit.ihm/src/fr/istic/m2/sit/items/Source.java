package fr.istic.m2.sit.items;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

public class Source extends OverlayItem {

	public Source(double x, double y, String title, String snippet) {
		super(new GeoPoint((int) x, (int) y), title, snippet);
	}
	
	

}
