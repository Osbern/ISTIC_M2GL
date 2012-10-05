package auction.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.Message;
import auction.Person;

public class MessageImplTest {
	
	private Message m;
	private Person u;

	@Before
	public void setUp() throws Exception {
		BulletinBoardImpl bb = new BulletinBoardImpl();
		u = new UserImpl("Jean", "Dupont", "jean.dupont@mail.com", "pwd", "quelque part");
		m = new MessageImpl(bb, u, "Hello World");
	}

	@After
	public void tearDown() throws Exception {
		m = null;
	}

	@Test
	public void testMessageImpl() {
		assertEquals(u, m.getAuthor());
		assertEquals("Hello World", m.getMessage());
	}

}
