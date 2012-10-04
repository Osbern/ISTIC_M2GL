
package auction;

import auction.impl.UserImpl;

public interface AuctionState {

	public abstract String cancelAuction(Auction auction, Person person);

	public abstract void close(Auction auction);

	public abstract String getCurrentBid(Auction auction);

	public abstract String getName();

	public abstract String join(Auction auction, User user);

	public abstract String leave(Auction auction, User user);

	public abstract void open(Auction auction);

	public abstract String placeBid(Auction auction, UserImpl user, int amount);

	public abstract String postMessage(Auction auction, Person person,
			String message);

	public abstract String setDesc(Auction auction, Person person, String value);

	public abstract String setEndDate(Auction auction, Person person, int value);

	public abstract String setMinBid(Auction auction, Person person, int value);

	public abstract String setResPrice(ReserveAuction auction,
			Person person, int value);

	public abstract String setStartDate(Auction auction, Person person,
			int value);

}