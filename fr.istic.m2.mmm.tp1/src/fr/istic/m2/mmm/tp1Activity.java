package fr.istic.m2.mmm;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
import fr.istic.m2.mmm.tp1.R;

public class tp1Activity extends Activity {
	/** Called when the activity is first created. */

	private boolean added = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Button submit = (Button) findViewById(R.id.submit);
		submit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				EditText names = (EditText) findViewById(R.id.editNames);
				DatePicker date = (DatePicker) findViewById(R.id.pickDate);
				EditText town = (EditText) findViewById(R.id.editTown);
				// String value = names.getText() + "\n" + date.getDayOfMonth()
				// + "/" + date.getMonth() + "/" + date.getYear() + "\n"
				// + town.getText();
				// Toast.makeText(getApplicationContext(), value,
				// Toast.LENGTH_SHORT).show();
				Intent aff = new Intent(tp1Activity.this, tp1Aff.class);
				// aff.putExtra("Names", names.getText().toString());
				// aff.putExtra("Date", date.getDayOfMonth() + "/" +
				// date.getMonth() + "/" + date.getYear());
				// aff.putExtra("Town", town.getText().toString());
				// startActivity(aff);
				Person p = new Person(names.getText().toString(), date
						.getDayOfMonth()
						+ "/"
						+ (date.getMonth() + 1)
						+ "/"
						+ date.getYear(), town.getText().toString());
				aff.putExtra("Person", p);
				startActivity(aff);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater meni = getMenuInflater();
		meni.inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.reset:
			EditText names = (EditText) findViewById(R.id.editNames);
			DatePicker date = (DatePicker) findViewById(R.id.pickDate);
			EditText town = (EditText) findViewById(R.id.editTown);
			names.setText("");
			date.init(1900, 1, 1, null);
			town.setText("");
			break;
		case R.id.add:
			if (!added) {
				LinearLayout main = (LinearLayout) findViewById(R.id.layout);
				EditText phone = new EditText(getApplicationContext());
				main.addView(phone, main.getChildCount() - 1);
				item.setEnabled(false);
				added = true;
			}
			break;
		case R.id.web:
			Spinner dep = (Spinner) findViewById(R.id.spinnerDep);
			Intent web = new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://fr.wikipedia.org/wiki/"
							+ ((String) dep.getSelectedItem())));
			startActivity(web);
			break;
		}
		return true;
	}
}