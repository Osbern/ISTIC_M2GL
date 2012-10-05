package auction.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.Person;
import auction.Server;

public class ServerImplTest {
	
	private Server s;

	@Before
	public void setUp() throws Exception {
		s = ServerImpl.instance;
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testCloseAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateAuction() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateRAuction() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAuctions() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCanals() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPersons() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTick() {
		fail("Not yet implemented");
	}

	@Test
	public void testListAuctions() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogin() {
		Person p = new UserImpl("Jean", "Dupont", "jean.dupont@mail.com", "pwd", "somewhere");
		s.getPersons().put("jean.dupont@mail.com", p);
		assertEquals("OK", s.login("HOME", "jean.dupont@mail.com", "pwd"));
	}

	@Test
	public void testLogout() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuery() {
		fail("Not yet implemented");
	}

	@Test
	public void testReset() {
		fail("Not yet implemented");
	}

	@Test
	public void testSend() {
		fail("Not yet implemented");
	}

	@Test
	public void testStart() {
		fail("Not yet implemented");
	}

	@Test
	public void testTick() {
		fail("Not yet implemented");
	}

}
