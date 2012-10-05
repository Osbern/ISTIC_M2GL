package auction.impl;

import java.util.Collection;
import java.util.List;

import auction.Auction;
import auction.AuctionState;
import auction.Bid;
import auction.Person;
import auction.User;
import auction.states.Pending;

public class AuctionImpl implements Auction {

	private List<BidImpl> bids = new java.util.ArrayList<BidImpl>();

	private BulletinBoardImpl bulletinBoard = new BulletinBoardImpl();

	private String description;

	private int endDate;

	private Collection<User> joinedUsers = new java.util.ArrayList<User>();

	private int minimumBid;

	private String name;

	private User seller;

	private int startDate;

	private AuctionState state = Pending.instance;

	public AuctionImpl(User seller, String name, String description, int startDate, int endDate, int minimumBid) {
		this.seller = seller;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.minimumBid = minimumBid;
		ServerImpl.instance.getAuctions().put(name,this);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#cancelAuction(auction.Person)
	 */
	public String cancelAuction(Person person){
		return state.cancelAuction(this, person);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#close()
	 */
	public void close() {
		state.close(this);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getBidHistory()
	 */
	public String getBidHistory(){
		StringBuffer result = new StringBuffer();
		for(Bid b: bids) {
			result.append(System.getProperty("line.separator"));
			//result.append(b);
		}
		return result.length()>0 ? result.substring(System.getProperty("line.separator").length()) : "";
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getBids()
	 */
	public Collection<BidImpl> getBids() {
		return bids;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getBulletinBoard()
	 */
	public BulletinBoardImpl getBulletinBoard() {
		return bulletinBoard;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getCurrentBid()
	 */
	public String getCurrentBid(){
		return state.getCurrentBid(this);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getDescription()
	 */
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getEndD()
	 */
	public String getEndD(){
		return Integer.toString(endDate);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getEndDate()
	 */
	public int getEndDate() {
		return endDate;
	}


	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getJoinedUsers()
	 */
	public Collection<User> getJoinedUsers() {
		return joinedUsers;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getMaxBid()
	 */
	public Bid getMaxBid(){
		if(bids.isEmpty())
			return null;
		return bids.get(bids.size()-1);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getMinBid()
	 */
	public String getMinBid(){
		return Integer.toString(minimumBid);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getMinimumBid()
	 */
	public int getMinimumBid() {
		return minimumBid;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getSeller()
	 */
	public User getSeller() {
		return seller;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getStartD()
	 */
	public String getStartD(){
		return Integer.toString(startDate);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getStartDate()
	 */
	public int getStartDate() {
		return startDate;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#getState()
	 */
	public AuctionState getState() {
		return state;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#join(auction.User)
	 */
	public String join(UserImpl user) {
		return state.join(this, user);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#leave(auction.User)
	 */
	public String leave(User user) {
		return state.leave(this, user);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#minimumAmount()
	 */
	public int minimumAmount() {
		Bid b = getMaxBid();
		if (b==null)
			return minimumBid;
		else
			return b.getAmount()*11/10;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#open()
	 */
	public void open() {
		state.open(this);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#placeBid(auction.User, int)
	 */
	public String placeBid(UserImpl user, int amount){
		return state.placeBid(this, user, amount);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#postMessage(auction.Person, java.lang.String)
	 */
	public String postMessage(Person person, String message){
		return state.postMessage(this, person, message);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setDesc(auction.Person, java.lang.String)
	 */
	public String setDesc(Person person, String value){
		return state.setDesc(this, person, value);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setDescription(java.lang.String)
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setEndD(auction.Person, int)
	 */
	public String setEndD(Person person, int value) {
		return state.setEndDate(this, person, value);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setEndDate(int)
	 */
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setMinBid(auction.Person, int)
	 */
	public String setMinBid(Person person, int value){
		return state.setMinBid(this, person, value);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setMinimumBid(int)
	 */
	public void setMinimumBid(int minimumBid) {
		this.minimumBid = minimumBid;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setStartD(auction.Person, int)
	 */
	public String setStartD(Person person, int value) {
		return state.setStartDate(this, person, value);
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setStartDate(int)
	 */
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#setState(auction.AuctionState)
	 */
	public void setState(AuctionState s) {
		state = s;
	}

	/* (non-Javadoc)
	 * @see auaction.impl.Auction#toString()
	 */
	public String toString() {
		return name+" "+description+" "+state.getName()+" "+getEndD();
	}
}