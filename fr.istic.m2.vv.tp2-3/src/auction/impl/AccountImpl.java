package auction.impl;

import auction.Account;
import auction.Auction;
import auction.User;

public class AccountImpl implements Account {

	private int credit = 0;

	private User owner;

	public AccountImpl(User owner){
		this.owner = owner;
	}

	/* (non-Javadoc)
	 * @see auction.AccountItf#decCredit(int)
	 */
	public String decCredit(int amount){
		credit -= amount;
		return "OK";
	}
			
	/* (non-Javadoc)
	 * @see auction.AccountItf#getCredit()
	 */
	public int getCredit() {
		return credit;
	}

	/* (non-Javadoc)
	 * @see auction.AccountItf#getCredits()
	 */
	public String getCredits(){
		return getCredit()+" "+getFreeCredit();
	}

	/* (non-Javadoc)
	 * @see auction.AccountItf#getFreeCredit()
	 */
	public int getFreeCredit(){
		int freeCredit = credit;
		for(Auction a: ServerImpl.instance.getAuctions().values()) {
			if(a.getMaxBid()!=null && a.getMaxBid().getUser()==owner)
				freeCredit = a.getMaxBid().getAmount();
		}
		return freeCredit;
	}

	/* (non-Javadoc)
	 * @see auction.AccountItf#incCredit(int)
	 */
	public String incCredit(int amount){
		credit += amount;
		return "OK";
	}

}