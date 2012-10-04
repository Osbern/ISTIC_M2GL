package auction.impl;

import auction.Person;
import auction.ReserveAuction;
import auction.User;


public class ReserveAuctionImpl extends AuctionImpl implements ReserveAuction {

	private int reservePrice;

	public ReserveAuctionImpl(User creator, String name, String description, int startDate, int endDate, int minimumBid,int reservePrice) {
		super(creator,name,description,startDate,endDate,minimumBid);
		this.reservePrice = reservePrice;
	}

	/* (non-Javadoc)
	 * @see auction.impl.ReserveAuction#getReservePrice()
	 */
	public int getReservePrice() {
		return reservePrice;
	}

	/* (non-Javadoc)
	 * @see auction.impl.ReserveAuction#setReservePrice(int)
	 */
	public void setReservePrice(int reservePrice) {
		this.reservePrice = reservePrice;
	}

	/* (non-Javadoc)
	 * @see auction.impl.ReserveAuction#setResPrice(auction.impl.Person, int)
	 */
	public String setResPrice(Person person, int value){
		return getState().setResPrice(this, person, value);
	}

}
