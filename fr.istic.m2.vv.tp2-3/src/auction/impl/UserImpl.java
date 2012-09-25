package auction.impl;

import java.util.ArrayList;
import java.util.Collection;

import auction.Account;
import auction.Auction;
import auction.Bid;
import auction.User;

public class UserImpl extends PersonImpl implements User {

	private Account account = new AccountImpl(this);

	private Collection<Bid> bids = new ArrayList<Bid>();

	private Collection<Auction> joinedAuctions = new java.util.ArrayList<Auction>();

	public UserImpl(String firstName,String lastName,String email,String password,String address) {
		super(firstName,lastName,email,password,address);
	}

	/* (non-Javadoc)
	 * @see auction.impl.User#getAccount()
	 */
	public Account getAccount() {
		return account;
	}

	/* (non-Javadoc)
	 * @see auction.impl.User#getBids()
	 */
	public Collection<Bid> getBids() {
		return bids;
	}

	/* (non-Javadoc)
	 * @see auction.impl.User#getJoinedAuctions()
	 */
	public Collection<Auction> getJoinedAuctions() {
		return joinedAuctions;
	}

}
