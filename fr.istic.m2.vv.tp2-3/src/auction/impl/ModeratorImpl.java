package auction.impl;

import auction.Moderator;

public class ModeratorImpl extends PersonImpl implements Moderator {
	public ModeratorImpl(String firstName,String lastName,String email,String password,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.adress = address;
	}
}
