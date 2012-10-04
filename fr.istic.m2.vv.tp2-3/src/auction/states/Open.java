package auction.states;

import auction.Auction;
import auction.AuctionState;
import auction.Bid;
import auction.Moderator;
import auction.Person;
import auction.ReserveAuction;
import auction.User;
import auction.impl.BidImpl;
import auction.impl.MessageImpl;
import auction.impl.ServerImpl;
import auction.impl.UserImpl;

public class Open implements AuctionState {

	public static final Open instance = new Open();

	 
	public String cancelAuction(Auction auction, Person person) {
		return "ERROR: auction open";
	}
 
	 
	public void close(Auction auction) {
		Bid b = auction.getMaxBid();
		if(b!=null && (!(auction instanceof ReserveAuction) || b.getAmount()>=((ReserveAuction)auction).getReservePrice())) {
			User seller = auction.getSeller();
			User buyer = b.getUser();
			int price = b.getAmount();
			seller.getAccount().incCredit(price);
			buyer.getAccount().decCredit(price);
			for(User u: auction.getJoinedUsers())
				ServerImpl.instance.send(u, "AUCTION_CLOSED "+auction.getName()+" "+buyer.getEmail()+" "+price);
			ServerImpl.instance.send(seller, "AUCTION_CLOSED "+auction.getName()+" "+buyer.getEmail()+" "+price);
		}
		else {
			for(User u: auction.getJoinedUsers())
				ServerImpl.instance.send(u, "AUCTION_CLOSED "+auction.getName()+" not selled");
			ServerImpl.instance.send(auction.getSeller(), "AUCTION_CLOSED "+auction.getName()+" not selled");
		}
		auction.setState(Closed.instance);
	}

	 
	public String getCurrentBid(Auction auction) {
		Bid b = auction.getMaxBid();
		if (b!=null)
			return b.toString();
		else
			return "ERROR: no current bid";
	}

	 
	public String getName() {
		return "OPEN";
	}

	 
	public String join(Auction auction, User user) {
		if(auction.getJoinedUsers().contains(user))
			return "ERROR: auction already joined";
		auction.getJoinedUsers().add(user);
		user.getJoinedAuctions().add(auction);
		return "OK";
	}

	 
	public String leave(Auction auction, User user) {
		if(!auction.getJoinedUsers().contains(user))
			return "ERROR: auction not joined";
		Bid b = auction.getMaxBid();
		if(b!=null && b.getUser()==user)
			return "ERROR: you cannot leave an auction when you have the best bid";
		auction.getJoinedUsers().remove(user);
		user.getJoinedAuctions().remove(auction);
		return "OK";
	}

	 
	public void open(Auction auction) {
		throw new Error("Cannot open an open auction");
	}

	 
	public String placeBid(Auction auction, UserImpl user, int amount) {
		if(amount<auction.minimumAmount())
			return "ERROR: insufficient amount";
		if(amount>user.getAccount().getFreeCredit()+(auction.getMaxBid()!=null && auction.getMaxBid().getUser()==user ? auction.getMaxBid().getAmount() : 0 ))
			return "ERROR: insufficient free credit";
		new BidImpl(user,auction,amount);
		for(User u : auction.getJoinedUsers())
			ServerImpl.instance.send(u, "BID "+auction.getName()+" "+user.getEmail()+" "+amount);
		return "OK";
	}

	 
	public String postMessage(Auction auction, Person person, String message){
		if(auction.getSeller()!=person && !(person instanceof Moderator) && !auction.getJoinedUsers().contains(person))
			return "ERROR: you cannot post on this bulletin board"; 
		new MessageImpl(auction.getBulletinBoard(),person,message);
		for(User u: auction.getJoinedUsers())
			ServerImpl.instance.send(u, "MESSAGE "+auction.getName()+" "+person.getEmail()+" "+message);
		return "OK";
	}

	 
	public String setDesc(Auction auction, Person person, String value) {
		return "ERROR: auctions is open";
	}

	 
	public String setEndDate(Auction auction, Person person, int value) {
		return "ERROR: auctions is open";
	}

	 
	public String setMinBid(Auction auction, Person person, int value) {
		return "ERROR: auctions is open";
	}

	 
	public String setResPrice(ReserveAuction auction, Person person, int value) {
		return "ERROR: auctions is open";
	}

	 
	public String setStartDate(Auction auction, Person person, int value) {
		return "ERROR: auctions is open";
	}

}
