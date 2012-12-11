package org.EurosDollars.Beans;

import javax.ejb.Stateless;

import org.EurosDollars.API.EDAPI;

@Stateless(mappedName = "EurosDollars")
public class ConvertBean implements EDAPI {
	
	public String euros2dollars(final String euros) {
		float e = Float.parseFloat(euros);
		float d = 1.2898f * e;
		String res = String.valueOf(d);
		return res;
	}
	public String dollars2euros(final String dollars) {
		float d = Float.parseFloat(dollars);
		float e = d/1.2898f;
		String res = String.valueOf(e);
		return res;
	}
}
