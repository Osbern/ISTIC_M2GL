package auction;


public interface Bid {

	public abstract int getAmount();

	public abstract Auction getAuction();

	public abstract User getUser();

	public abstract String toString();

}