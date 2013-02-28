package fr.istic.m2.sit_ihm;

import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

import fr.istic.m2.sit_ihm.overlays.PrimaryOverlay;

public class MainActivity extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout layout = new LinearLayout(this);
		
		MapView mapView = new MapView(this, "map");
		mapView.setBuiltInZoomControls(true);
		
		PrimaryOverlay pov = new PrimaryOverlay(getResources().getDrawable(R.drawable.fire));
		pov.addOverlay(new OverlayItem(new GeoPoint((int) (48.11547 * 1000000),(int) (-1.63840 * 1000000)), "Ici c'est l'ISTIC Moujon", "I'm a super Moujon !"));

		mapView.getOverlays().add(pov);
		
		layout.addView(mapView);
		setContentView(layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
