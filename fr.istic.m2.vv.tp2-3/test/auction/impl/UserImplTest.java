package auction.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.User;

public class UserImplTest {

	private User u;

	@Before
	public void setUp() throws Exception {
		u = new UserImpl("Jean", "Dupont", "jean.dupont@mail.com", "pwd",
				"quelque part");
	}

	@After
	public void tearDown() throws Exception {
		u = null;
	}

	/**
	 * This test checks if Account is correctly initialized
	 */
	@Test
	public void testGetAccount() {
		assertNotNull(u.getAccount());
	}

	@Test
	public void testGetBids() {
		assertNotNull(u.getBids());
	}

	@Test
	public void testGetJoinedAuctions() {
		assertNotNull(u.getJoinedAuctions());
	}

	@Test
	public void testGetAdress() {
		assertEquals("quelque part", u.getAdress());
	}

	@Test
	public void testGetEmail() {
		assertEquals("jean.dupont@mail.com", u.getEmail());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("Jean", u.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Dupont", u.getLastName());
	}

	@Test
	public void testGetPassword() {
		assertEquals("pwd", u.getPassword());
	}

}
