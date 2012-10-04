package auction;

import java.util.Collection;

public interface User extends Person{

	public abstract Account getAccount();

	public abstract Collection<Bid> getBids();

	public abstract Collection<Auction> getJoinedAuctions();

}