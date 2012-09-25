package auction.states;

import auction.Auction;
import auction.AuctionState;
import auction.Moderator;
import auction.Person;
import auction.ReserveAuction;
import auction.User;
import auction.impl.ServerImpl;
import auction.impl.UserImpl;

public class Pending implements AuctionState {

	public static final Pending instance = new Pending();

	 
	public String cancelAuction(Auction auction, Person person) {
		if(person instanceof Moderator || person == auction.getSeller()) {
			auction.setState(Cancelled.instance);
			return "OK";
		}
		else
			return "ERROR: you cannot cancel this auction";
	}

	 
	public void close(Auction auction) {
		throw new Error("Cannot close a pending auction.");
	}

	 
	public String getCurrentBid(Auction auction) {
		return "ERROR: auction pending";
	}

	 
	public String getName() {
		return "PENDING";
	}

	 
	public String join(Auction auction, User user) {
		return "ERROR: auction pending";
	}

	 
	public String leave(Auction auction, User user) {
		return "ERROR: auction pending";
	}

	 
	public void open(Auction auction) {
		auction.setState(Open.instance);
	}

	 
	public String placeBid(Auction auction, UserImpl user, int amount) {
		return "ERROR: auction pending";
	}

	 
	public String postMessage(Auction auction, Person person, String message){
		return "ERROR: auction pending";
	}

	 
	public String setDesc(Auction auction, Person person, String value) {
		if(auction.getSeller()!=person && !(person instanceof Moderator))
			return "ERROR: you cannot modify this auction";
		auction.setDescription(value);
		return "OK";
	}

	 
	public String setEndDate(Auction auction, Person person, int value) {
		if(auction.getSeller()!=person && !(person instanceof Moderator))
			return "ERROR: you cannot modify this auction";
		if(value<=auction.getStartDate())
			return "ERROR: the end date must be greater than the start date";
		auction.setEndDate(value);
		return "OK";
	}

	 
	public String setMinBid(Auction auction, Person person, int value) {
		if(auction.getSeller()!=person && !(person instanceof Moderator))
			return "ERROR: you cannot modify this auction";
		if(value<=0)
			return "ERROR: the minimum bid must be greater than 0";
		if(auction instanceof ReserveAuction && value>=((ReserveAuction)auction).getReservePrice())
			return "ERROR: the minimum bid must be less than the reserve price";
		auction.setMinimumBid(value);
		return "OK";
	}

	 
	public String setResPrice(ReserveAuction auction, Person person, int value) {
		if(auction.getSeller()!=person && !(person instanceof Moderator))
			return "ERROR: you cannot modify this auction";
		if(value<=auction.getMinimumBid())
			return "ERROR: the reserve price must be greater than the minimum bid";
		auction.setReservePrice(value);
		return "OK";
	}

	 
	public String setStartDate(Auction auction, Person person, int value) {
		if(auction.getSeller()!=person && !(person instanceof Moderator))
			return "ERROR: you cannot modify this auction";
		if(value<=ServerImpl.instance.getTick())
			return "ERROR: the start date must be greater than the current time";
		if(value>=auction.getEndDate())
			return "ERROR: the start date must be less than the end date";
		auction.setStartDate(value);
		return "OK";
	}

}