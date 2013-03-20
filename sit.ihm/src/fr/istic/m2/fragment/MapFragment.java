package fr.istic.m2.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

import fr.istic.m2.sit.ihm.MainActivity;
import fr.istic.m2.sit.ihm.R;
import fr.istic.m2.sit.items.Source;
import fr.istic.m2.sit.overlays.PrimaryOverlay;
import fr.istic.m2.sit.overlays.SourceOverlay;

public class MapFragment extends Fragment {
	
	private Activity act;
	public RelativeLayout layout;
	public MapView mapView;
	private boolean visible;
	private int width;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        act = getActivity();
        visible = true;
        width = ((LinearLayout.LayoutParams) act.findViewById(MainActivity.ITEMS_ID).getLayoutParams()).width;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	layout = new RelativeLayout(act);
    	
		mapView = new MapView(act, "map");
		mapView.setBuiltInZoomControls(true);
		mapView.setClickable(true);
		mapView.setEnabled(true);
		
//    	RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//    	mapView.setLayoutParams(params);
		
		PrimaryOverlay pov = new SourceOverlay(act);
		pov.addOverlay(new Source(48.11547 * 1000000, -1.63840 * 1000000, "Ici c'est l'ISTIC Moujon", "I'm a super Moujon !"));
		pov.addOverlay(new Source(47.11507 * 1000000, -0.63801 * 1000000, "Ici c'est pas l'ISTIC Moujon", "I'm a super Moujon !"));

		mapView.getOverlays().add(pov);
		
		PrimaryOverlay veh = new PrimaryOverlay(getResources().getDrawable(R.drawable.chief), act);
		veh.addOverlay(new OverlayItem(new GeoPoint((int) (45.11547 * 1000000),(int) (-1.63840 * 1000000)), "Ici c'est l'ISTIC Moujon", "I'm a super Moujon !"));
		veh.addOverlay(new OverlayItem(new GeoPoint((int) (48.11507 * 1000000),(int) (-0.63801 * 1000000)), "Ici c'est pas l'ISTIC Moujon", "I'm a super Moujon !"));

		mapView.getOverlays().add(veh);
		
		layout.addView(mapView);
		
		Button lock = new Button(act);
		lock.setText("LOCK");
		layout.addView(lock);
		((LayoutParams) lock.getLayoutParams()).addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		
		lock.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.w("LOCK", "click");
				if (visible) {
					((LinearLayout.LayoutParams) act.findViewById(MainActivity.ITEMS_ID).getLayoutParams()).width = 2;
					visible = false;
				}
				else {
					((LinearLayout.LayoutParams) act.findViewById(MainActivity.ITEMS_ID).getLayoutParams()).width = width;
					visible = true;
				}
				act.setContentView(((MainActivity) act).layout);
			}
		});
		
		return layout;
    }

}
