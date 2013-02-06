package fr.istic.m2.mmm;

import android.os.Bundle;

import com.google.android.maps.MapActivity;

import fr.istic.m2.mmm.tp2.R;

public class tp2Activity extends MapActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
    }

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}