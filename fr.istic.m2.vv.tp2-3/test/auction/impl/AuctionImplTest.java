package auction.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.Auction;
import auction.User;

public class AuctionImplTest {
	
	private Auction a;

	@Before
	public void setUp() throws Exception {
		User seller = new UserImpl("Jean", "Dupont", "jean.dupont@mail.com", "pwd", "quelque part");
		a = new AuctionImpl(seller, "A1", "Auction A1", 0, 500, 10);
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testCancelAuction() {
		fail("Not yet implemented");
	}

	@Test
	public void testClose() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBidHistory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBids() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBulletinBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCurrentBid() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEndD() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEndDate() {
		assertEquals(500, a.getEndDate());
	}

	@Test
	public void testGetJoinedUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMaxBid() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMinBid() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMinimumBid() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSeller() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStartD() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStartDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetState() {
		fail("Not yet implemented");
	}

	@Test
	public void testJoin() {
		fail("Not yet implemented");
	}

	@Test
	public void testLeave() {
		fail("Not yet implemented");
	}

	@Test
	public void testMinimumAmount() {
		BidImpl b1 = EasyMock.createMock(BidImpl.class);
		EasyMock.expect(b1.getAmount()).andReturn(10);
		BidImpl b2 = EasyMock.createMock(BidImpl.class);
		EasyMock.expect(b2.getAmount()).andReturn(50);
		BidImpl b3 = EasyMock.createMock(BidImpl.class);
		EasyMock.expect(b3.getAmount()).andReturn(100);
		EasyMock.replay(b1, b2, b3);
		
		a.getBids().add(b1);
		a.getBids().add(b2);
		a.getBids().add(b3);
		assertEquals(110, a.minimumAmount());
	}
	
	/**
	 * Test when bids is empty
	 */
	@Test
	public void testMinimumAmount2() {
		assertEquals(10, a.minimumAmount());
	}

	@Test
	public void testOpen() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlaceBid() {
		fail("Not yet implemented");
	}

	@Test
	public void testPostMessage() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDesc() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEndD() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEndDate() {
		a.setEndDate(20);
		assertEquals(20, a.getEndDate());
	}

	@Test
	public void testSetMinBid() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMinimumBid() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStartD() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStartDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetState() {
		fail("Not yet implemented");
	}

}
