package auction.impl;

import auction.Auction;
import auction.User;

public class AuctionFactory {
	
	private static AuctionFactory eInstance = new AuctionFactory();
	
	public  Auction createAuction(User seller, String name, String description, int startDate, int endDate, int minimumBid){
		return null;
	}
	public  Auction createReservedAuction(User creator, String name, String description,
			 int startDate, int endDate, int minimumBid,int reservePrice){
		return null;
	}
	public static AuctionFactory getEInstance() {
		return eInstance;
	}
	

}
