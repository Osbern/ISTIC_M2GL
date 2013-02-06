package fr.istic.m2.mmm;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
	
	private String names;
	private String date;
	private String town;
	
	public static final Creator<Person> CREATOR = new Creator<Person>() {
		
		public Person createFromParcel(Parcel in) {
			return new Person(in);
		}

		public Person[] newArray(int size) {
			return new Person[size];
		}
		
	};
	
	public Person(String names, String date, String town) {
		this.names= names;
		this.date = date;
		this.town = town;
	}
	
	private Person(Parcel in) {
		names = in.readString();
		date = in.readString();
		town = in.readString();
	}

	public int describeContents() {
		return 0;
	}

	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(names);
		dest.writeString(date);
		dest.writeString(town);
	}
	
	public String getNames() {
		return names;
	}

	public String getDate() {
		return date;
	}

	public String getTown() {
		return town;
	}

}
