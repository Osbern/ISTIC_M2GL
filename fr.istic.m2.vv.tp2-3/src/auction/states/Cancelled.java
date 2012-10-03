package auction.states;

import auction.Auction;
import auction.AuctionState;
import auction.Person;
import auction.ReserveAuction;
import auction.User;
import auction.impl.UserImpl;

public class Cancelled implements AuctionState {

	public static final Cancelled instance = new Cancelled();

	 
	public String cancelAuction(Auction auction, Person person) {
		return "ERROR: auction already cancelled";
	}

	 
	public void close(Auction auction) {
		throw new Error("Cannot close a cancelled auction.");
	}

	 
	public String getCurrentBid(Auction auction) {
		return "ERROR: auction cancelled";
	}

	 
	public String getName() {
		return "CANCELLED";
	}

	 
	public String join(Auction auction, User user) {
		return "ERROR: auction cancelled";
	}

	 
	public String leave(Auction auction, User user) {
		return "ERROR: auction cancelled";
	}

	 
	public void open(Auction auction) {
		throw new Error("Cannot open a cancelled auction.");
	}

	 
	public String placeBid(Auction auction, UserImpl user, int amount) {
		return "ERROR: auction cancelled";
	}

	 
	public String postMessage(Auction auction, Person person, String message){
		return "ERROR: auction cancelled";
	}

	 
	public String setDesc(Auction auction, Person person, String value) {
		return "ERROR: auction cancelled";
	}

	 
	public String setEndDate(Auction auction, Person person, int value) {
		return "ERROR: auction cancelled";
	}

	 
	public String setMinBid(Auction auction, Person person, int value) {
		return "ERROR: auction cancelled";
	}

	 
	public String setResPrice(ReserveAuction auction, Person person, int value) {
		return "ERROR: auction cancelled";
	}

	 
	public String setStartDate(Auction auction, Person person, int value) {
		return "ERROR: auction cancelled";
	}

}
