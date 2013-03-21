package fr.istic.m2.sit.ihm;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.maps.MapActivity;

import fr.istic.m2.fragment.ItemsFragment;
import fr.istic.m2.fragment.MapFragment;

public class MainActivity extends MapActivity {
	
	public static final int ITEMS_ID = 1;
	public static final int MAP_ID = 2;
	
	public static int height, width;
	private boolean visible;
	private int menuWidth;
	
	private FragmentManager fm;
	public FrameLayout flItems, flMap;
	public ItemsFragment items;
	public MapFragment map;
	public LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		
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
		flItems.setBackgroundColor(Color.LTGRAY);
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
		visible = true;
		menuWidth = findViewById(MainActivity.ITEMS_ID).getLayoutParams().width;
		
		ActionBar acBar = getActionBar();
		acBar.setDisplayShowCustomEnabled(true);
		acBar.setDisplayShowHomeEnabled(false);
		acBar.setDisplayShowTitleEnabled(false);
		RelativeLayout menuLayout = new RelativeLayout(this);
		Button btn = new Button(this);
		btn.setText("+");
		btn.setTextSize(30);
		btn.setTextColor(Color.WHITE);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.w("LOCK", "click");
				if (visible) {
					((LinearLayout.LayoutParams) findViewById(MainActivity.ITEMS_ID).getLayoutParams()).width = 2;
					visible = false;
				}
				else {
					((LinearLayout.LayoutParams) findViewById(MainActivity.ITEMS_ID).getLayoutParams()).width = menuWidth;
					visible = true;
				}
				setContentView(layout);
			}
		});
		menuLayout.addView(btn);
		acBar.setCustomView(menuLayout);
		
		return true;
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
