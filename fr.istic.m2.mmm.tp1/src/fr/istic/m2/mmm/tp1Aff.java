package fr.istic.m2.mmm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import fr.istic.m2.mmm.tp1.R;

public class tp1Aff extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aff);
		
		Intent act = getIntent();
		Bundle truc = act.getExtras();
		Person p = truc.getParcelable("Person");
		
		String names = p.getNames();
		String date = p.getDate();
		String town = p.getTown();
		
		TextView textNames = (TextView) findViewById(R.id.textNames);
		textNames.setText(names);
		TextView textDate = (TextView) findViewById(R.id.textDate);
		textDate.setText(date);
		TextView textTown = (TextView) findViewById(R.id.textTown);
		textTown.setText(town);
		
	}

}
