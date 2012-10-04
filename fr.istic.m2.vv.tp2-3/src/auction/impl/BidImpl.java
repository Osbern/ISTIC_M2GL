package auction.impl;

import auction.Auction;
import auction.Bid;


public class BidImpl implements Bid {

	private int amount;

	private Auction auction;

	private UserImpl user;

	public BidImpl(UserImpl user, Auction auction, int amount){
		this.user = user;
		this.amount = amount;
		auction.getBids().add(this);
		user.getBids().add(this);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Bid#getAmount()
	 */
	public int getAmount() {
		return amount;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Bid#getAuction()
	 */
	public Auction getAuction() {
		return auction;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Bid#getUser()
	 */
	public UserImpl getUser() {
		return user;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Bid#toString()
	 */
	public String toString() {
		return user.getEmail()+" "+amount;
	}
}
