package auction.impl;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.Person;

public class BulletinBoardImplTest {
	
	private BulletinBoardImpl bb;

	@Before
	public void setUp() throws Exception {
		bb = new BulletinBoardImpl();
		MessageImpl m1 = EasyMock.createMock(MessageImpl.class);
		MessageImpl m2 = EasyMock.createMock(MessageImpl.class);
		MessageImpl m3 = EasyMock.createMock(MessageImpl.class);
		EasyMock.replay(m1, m2, m3);

		bb.getMessages().add(m1);
		bb.getMessages().add(m2);
		bb.getMessages().add(m3);
	}

	@After
	public void tearDown() throws Exception {
		bb = null;
	}

	@Test
	public void testDelMessage() {
		Person mod = new ModeratorImpl("Toto", "Tata", "toto.tata@titi.com", "pwnd", "!!");
		assertEquals("OK", bb.delMessage(mod, 2));
	}
	
//	@Test
//	public void testGetMess() {
//		
//		MessageImpl m4 = EasyMock.createMock(MessageImpl.class);
//		MessageImpl m5 = EasyMock.createMock(MessageImpl.class);
//		MessageImpl m6 = EasyMock.createMock(MessageImpl.class);
//		
//		EasyMock.expect(m4.toString()).andReturn("[m1]");
//		EasyMock.expect(m5.toString()).andReturn("[m2]");
//		EasyMock.expect(m6.toString()).andReturn("[m3]");
//		EasyMock.replay(m4, m5, m6);
//		
//		bb.getMessages().add(m4);
//		bb.getMessages().add(m5);
//		bb.getMessages().add(m6);
//		
//		assertEquals("1 [m1]" + System.getProperty("line.separator") 
//				+ "2 [m2]" + System.getProperty("line.separator")
//				+ "3 [m3]", bb.getMess());
//	}

}
