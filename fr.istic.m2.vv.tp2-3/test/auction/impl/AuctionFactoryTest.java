package auction.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import auction.User;

public class AuctionFactoryTest {
	AuctionFactory a;
	User seller = new UserImpl("Jean", "Dupont", "jean.dupont@mail.com",
			"pwd", "quelque part");
	@Before
	public void setUp() throws Exception {
		a = AuctionFactory.getEInstance();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	//les deux tests suivants échouent à cause de la factory mal faite.
	@Test
	public void testCreateAuction() {
		assertNotNull(a.createAuction(seller, "a1", "description", 100000, 102000, 150));
	}

	@Test
	public void testCreateReservedAuction() {
		assertNotNull(a.createReservedAuction(seller, "a2", "description", 100000, 102000, 150, 200));
	}

	@Test
	public void testGetEInstance() {
		assertNotNull(a);
	}

}
