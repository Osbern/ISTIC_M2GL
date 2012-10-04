package auction.impl;

import auction.Person;

public abstract class PersonImpl implements Person {

	protected String adress;

	protected String email;

	protected String firstName;

	protected String lastName;

	protected String password;

	protected PersonImpl() {
		
	}
	
	public PersonImpl(String firstName,String lastName,String email,String password,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.adress = address;
		ServerImpl.instance.getPersons().put(email,this);
	}

	/* (non-Javadoc)
	 * @see auction.impl.Person#getAdress()
	 */
	public String getAdress() {
		return adress;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Person#getEmail()
	 */
	public String getEmail() {
		return email;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Person#getFirstName()
	 */
	public String getFirstName() {
		return firstName;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Person#getLastName()
	 */
	public String getLastName() {
		return lastName;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Person#getPassword()
	 */
	public String getPassword() {
		return password;
	}

}