package auction;

import java.util.Collection;

import auction.impl.BidImpl;
import auction.impl.BulletinBoardImpl;
import auction.impl.UserImpl;


public interface Auction {

	public abstract String cancelAuction(Person person);

	public abstract void close();

	public abstract String getBidHistory();

	public abstract Collection<BidImpl> getBids();

	public abstract BulletinBoardImpl getBulletinBoard();

	public abstract String getCurrentBid();

	public abstract String getDescription();

	public abstract String getEndD();

	public abstract int getEndDate();

	public abstract Collection<User> getJoinedUsers();

	public abstract Bid getMaxBid();

	public abstract String getMinBid();

	public abstract int getMinimumBid();

	public abstract String getName();

	public abstract User getSeller();

	public abstract String getStartD();

	public abstract int getStartDate();

	public abstract AuctionState getState();

	public abstract String join(UserImpl user);

	public abstract String leave(User user);

	public abstract int minimumAmount();

	public abstract void open();

	public abstract String placeBid(UserImpl user, int amount);

	public abstract String postMessage(Person person, String message);

	public abstract String setDesc(Person person, String value);

	public abstract void setDescription(String description);

	public abstract String setEndD(Person person, int value);

	public abstract void setEndDate(int endDate);

	public abstract String setMinBid(Person person, int value);

	public abstract void setMinimumBid(int minimumBid);

	public abstract String setStartD(Person person, int value);

	public abstract void setStartDate(int startDate);

	public abstract void setState(AuctionState s);

	public abstract String toString();

}