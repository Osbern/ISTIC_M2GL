package fr.istic.m2.sit.ihm;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import com.google.android.maps.MapActivity;

import fr.istic.m2.fragment.ItemsFragment;
import fr.istic.m2.fragment.MapFragment;

public class MainActivity extends MapActivity {
	
	public static int height, width;
	
	private FragmentManager fm;
	private FrameLayout flItems, flMap;
	private ItemsFragment items;
	public MapFragment map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Point size = new Point();
		getWindowManager().getDefaultDisplay().getSize(size);
		height = size.x;
		width = size.y;
		
		fm = getFragmentManager();
		RelativeLayout layout = new RelativeLayout(this);
		items = new ItemsFragment();
		map = new MapFragment();
		
		flMap = new FrameLayout(this);
		flMap.setId(13);
		flItems = new FrameLayout(this);
		flItems.setId(42);
		flItems.setBackgroundColor(Color.CYAN);
		layout.addView(flMap);
		layout.addView(flItems, 400, height);
		
		FragmentTransaction tr = fm.beginTransaction();
		tr.add(13, map);
		tr.add(42, items);
		tr.commit();
		
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
