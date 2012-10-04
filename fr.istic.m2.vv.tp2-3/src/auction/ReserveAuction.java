package auction;

public interface ReserveAuction extends Auction {

	public abstract int getReservePrice();

	public abstract void setReservePrice(int reservePrice);

	public abstract String setResPrice(Person person, int value);

}