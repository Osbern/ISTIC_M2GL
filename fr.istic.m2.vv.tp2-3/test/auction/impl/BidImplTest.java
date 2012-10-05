package auction.impl;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.Auction;
import auction.Bid;

public class BidImplTest {
	
	private Bid b;
	private UserImpl user;

	@Before
	public void setUp() throws Exception {
		user = new UserImpl("Jean", "Dupont", "jean.dupont@mail.com", "pwd", "quelque part");
		Auction a = new AuctionImpl(user, "A1", "Auction A1", 0, 500, 100);
		b = new BidImpl(user, a, 100);
	}

	@After
	public void tearDown() throws Exception {
		b = null;
	}

	@Test
	public void testBidImpl() {
		assertEquals(100, b.getAmount());
		assertEquals(user, b.getUser());
	}

}
