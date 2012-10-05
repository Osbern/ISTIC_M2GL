package auction.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.Account;
import auction.User;

public class AccountImplTest {
	
	private Account a;

	@Before
	public void setUp() throws Exception {
		User owner = new UserImpl("Jean", "Dupont", "jean.dupont@mail.com", "pwd", "quelque part");
		a = new AccountImpl(owner);
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}
	
	@Test
	public void testIncCredit() {
		a.incCredit(50);
		assertEquals(50, a.getCredit());
	}

	@Test
	public void testDecCredit() {
		a.decCredit(100);
		assertEquals(-100, a.getCredit());
	}

	@Test
	public void testGetCredit() {
		assertEquals(0, a.getCredit());
	}
	
	@Test
	public void testGetFreeCredit() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCredits() {
		fail("Not yet implemented");
	}

}
