package auction.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.Moderator;

public class ModeratorImplTest {
	
	private Moderator mod;

	@Before
	public void setUp() throws Exception {
		mod = new ModeratorImpl("Jean", "Dupont", "jean.dupont@mail.com", "pwd",
				"quelque part");
	}

	@After
	public void tearDown() throws Exception {
		mod = null;
	}

	@Test
	public void testGetAdress() {
		assertEquals("quelque part", mod.getAdress());
	}

	@Test
	public void testGetEmail() {
		assertEquals("jean.dupont@mail.com", mod.getEmail());
	}

	@Test
	public void testGetFirstName() {
		assertEquals("Jean", mod.getFirstName());
	}

	@Test
	public void testGetLastName() {
		assertEquals("Dupont", mod.getLastName());
	}

	@Test
	public void testGetPassword() {
		assertEquals("pwd", mod.getPassword());
	}
}
