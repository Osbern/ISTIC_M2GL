package fr.istic.m2.mmm;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

public class PersonContentProvider extends ContentProvider {
	
	private static Person[] data;
	
	public static final String NAMES = "names";
	public static final String DATE = "date";
	public static final String TOWN = "town";
	
	static final String AUTHORITY = "fr.istic.m2.mmm.personcontentprovider";
	public static final String PROVIDER_NAME = "fr.istic.m2.mmm.personcontentprovider";
	public static final Uri CONTENT_URI = Uri.parse("content://"+ PROVIDER_NAME);

	@Override
	public int delete(Uri arg0, String arg1, String[] arg2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType(Uri arg0) {
		return ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + "com.persons";
	}

	@Override
	public Uri insert(Uri arg0, ContentValues arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreate() {
		data = new Person[3];
		data[0] = new Person("Bob De La Bricolerie", "01/04/1791", "Domaine De La Bricolerie");
		data[1] = new Person("Harry L'Empoter", "12/10/1968", "La où il faut");
		data[2] = new Person("John", "01/02/1942", "Somewhere under the rainbow");
		return true;
	}

	@Override
	public Cursor query(Uri arg0, String[] arg1, String arg2, String[] arg3, String arg4) {
		MatrixCursor mc = new MatrixCursor(new String[] {
				NAMES,
				DATE,
				TOWN
		});
		
		for (int i = 0; i < data.length ; i++) {
			mc.newRow().add(i).add(data[i].getNames()).add(data[i].getDate()).add(data[i].getTown());
		}
		return mc;
	}

	@Override
	public int update(Uri arg0, ContentValues arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return 0;
	}
}
