package org.EurosDollars.API;

import javax.ejb.Remote;

@Remote
public interface EDAPI {
	
	public String euros2dollars(final String euros);
	public String dollars2euros(final String dollars);

}
