package auction.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.User;

public class ReserveAuctionImplTest {
	ReserveAuctionImpl ra;
	User seller = new UserImpl("Jean", "Dupont", "jean.dupont@mail.com",
			"pwd", "quelque part");
	@Before
	public void setUp() throws Exception {
		ra = new ReserveAuctionImpl(seller, "name", "description", 100, 200, 100, 200);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReserveAuctionImpl() {
		assertNotNull(ra);
	}

	@Test
	public void testGetReservePrice() {
assertEquals(200, ra.getReservePrice());
}

	@Test
	public void testSetReservePrice() {
		ra.setReservePrice(2000);
		assertEquals(2000, ra.getReservePrice());	}

	@Test
	public void testSetResPrice() {
		ra.setResPrice(seller, 2000);
		assertEquals(2000, ra.getReservePrice());	}
}
