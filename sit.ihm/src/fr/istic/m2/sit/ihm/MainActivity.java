package fr.istic.m2.sit.ihm;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Menu;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.maps.MapActivity;

import fr.istic.m2.fragment.ItemsFragment;
import fr.istic.m2.fragment.MapFragment;

public class MainActivity extends MapActivity {
	
	public static final int ITEMS_ID = 1;
	public static final int MAP_ID = 2;
	
	public static int height, width;
	
	private FragmentManager fm;
	public FrameLayout flItems, flMap;
	public ItemsFragment items;
	public MapFragment map;
	public LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Point size = new Point();
		getWindowManager().getDefaultDisplay().getSize(size);
		height = size.x;
		width = size.y;
		
		fm = getFragmentManager();
		layout = new LinearLayout(this);
		items = new ItemsFragment();
		map = new MapFragment();
		
		flItems = new FrameLayout(this);
		flItems.setId(ITEMS_ID);
		flItems.setBackgroundColor(Color.CYAN);
		flMap = new FrameLayout(this);
		flMap.setId(MAP_ID);
		
		FragmentTransaction tr = fm.beginTransaction();
		tr.add(ITEMS_ID, items);
		tr.add(MAP_ID, map);
		tr.commit();

		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
		params.weight = 2;
		layout.addView(flItems, params);
		params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
		params.weight = 1;
		layout.addView(flMap, params);
		
		
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
