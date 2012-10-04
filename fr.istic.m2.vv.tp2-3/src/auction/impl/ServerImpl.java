package auction.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import auction.Auction;
import auction.Command;
import auction.Person;
import auction.Server;
import auction.User;
import auction.commands.CancelAuction;
import auction.commands.CloseAccount;
import auction.commands.CreateAuction;
import auction.commands.CreateRAuction;
import auction.commands.DecCredit;
import auction.commands.DelMessage;
import auction.commands.Enroll;
import auction.commands.GetBidHistory;
import auction.commands.GetCredit;
import auction.commands.GetCurrentBid;
import auction.commands.GetDesc;
import auction.commands.GetEndDate;
import auction.commands.GetMessages;
import auction.commands.GetMinBid;
import auction.commands.GetResPrice;
import auction.commands.GetStartDate;
import auction.commands.IncCredit;
import auction.commands.JoinAuction;
import auction.commands.LeaveAuction;
import auction.commands.ListAuctions;
import auction.commands.Login;
import auction.commands.Logout;
import auction.commands.PlaceBid;
import auction.commands.PostMessage;
import auction.commands.SetDesc;
import auction.commands.SetEndDate;
import auction.commands.SetMinBid;
import auction.commands.SetResPrice;
import auction.commands.SetStartDate;


public class ServerImpl implements Server {
	public static final Server instance = new auction.impl.ServerImpl();

	public static void main(String[] args) {
		if(args.length!=2) {
			System.err.println("Incorrect number of arguments.");
			System.exit(-1);
		}

		try {
			instance.start(args[0],args[1]);
			System.out.println("Done.");
		}
		catch (IOException e) {
			e.printStackTrace();
			System.exit(-2);
		}
	}

	private Map<String,Auction> auctions = new Hashtable<String,Auction>();

	private BufferedReader br;

	private BufferedWriter bw;

	private Map<String,Person> canals = new Hashtable<String, Person>();

	private Map<String,Command> commands = new Hashtable<String,Command>();

	private Map<String,Person> persons = new Hashtable<String,Person>();

	private int tick = 0;

	private ServerImpl(){
		commands.put("cancel_auction", new CancelAuction());
		commands.put("close_account", new CloseAccount());
		commands.put("create_auction", new CreateAuction());
		commands.put("create_r_auction", new CreateRAuction());
		commands.put("dec_credit", new DecCredit());
		commands.put("del_message", new DelMessage());
		commands.put("enroll", new Enroll());
		commands.put("get_bid_history", new GetBidHistory());
		commands.put("get_credit", new GetCredit());
		commands.put("get_current_bid", new GetCurrentBid());
		commands.put("get_desc", new GetDesc());
		commands.put("get_end_date", new GetEndDate());
		commands.put("get_messages", new GetMessages());
		commands.put("get_min_bid", new GetMinBid());
		commands.put("get_res_price", new GetResPrice());
		commands.put("get_start_date", new GetStartDate());
		commands.put("inc_credit", new IncCredit());
		commands.put("join_auction", new JoinAuction());
		commands.put("leave_auction", new LeaveAuction());
		commands.put("list_auctions", new ListAuctions());
		commands.put("log_in", new Login());
		commands.put("log_out", new Logout());
		commands.put("place_bid", new PlaceBid());
		commands.put("post_message", new PostMessage());
		commands.put("set_desc", new SetDesc());
		commands.put("set_end_date", new SetEndDate());
		commands.put("set_min_bid", new SetMinBid());
		commands.put("set_res_price", new SetResPrice());
		commands.put("set_start_date",new SetStartDate());
		persons.put("moderator@auction.com",new ModeratorImpl("Admin","Moderator","moderator@auction.com","pass","auction house"));
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#closeAccount(java.lang.String)
	 */
	public String closeAccount(String canal){
		if (!canals.containsKey(canal))
			return "ERROR: no user logged on this canal";
		Person p = canals.get(canal);
		if(p instanceof User && !((User)p).getJoinedAuctions().isEmpty())
			return "ERROR: you must leave all your auctions before closing your account";
		persons.remove(p.getEmail());
		canals.remove(canal);
		return "OK";
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#createAuction(auction.impl.UserImpl, java.lang.String, java.lang.String, int, int, int)
	 */
	public String createAuction(User user, String name, String description, int startDate, int endDate, int minimumBid){
		if(endDate<=startDate)
			return "ERROR: the end date must be greater than the end date";
		if(startDate<=tick)
			return "ERROR: the start date must be greater than the current time";
		if(minimumBid<=0)
			return "ERROR: the minimum bid must be greater than 0";
		if(auctions.containsKey(name))
			return "ERROR: an auction with the same name exists";
		AuctionFactory.getEInstance().createAuction(user,name,description,startDate,endDate,minimumBid);
		return "OK";
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#createRAuction(auction.impl.UserImpl, java.lang.String, java.lang.String, int, int, int, int)
	 */
	public String createRAuction(User user, String name, String description, int startDate, int endDate, int minimumBid, int reservePrice){
		if(endDate<=startDate)
			return "ERROR: the end date must be greater than the start date";
		if(startDate<=tick)
			return "ERROR: the start date must be greater than the current time";
		if(minimumBid<=0)
			return "ERROR: the minimum bid must be greater than 0";
		if(reservePrice<=minimumBid)
			return "ERROR: the reserve price must be greater than the minimum bid";
		if(auctions.containsKey(name))
			return "ERROR: an auction with the same name exists";
		AuctionFactory.getEInstance().createReservedAuction(user,name,description,startDate,endDate,minimumBid,reservePrice);
		return "OK";
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#createUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public String createUser(String firstName, String lastName, String email, String password, String address){
		if(persons.containsKey(email))
			return "ERROR: e-mail already used";
		new UserImpl(firstName,lastName,email,password,address);
		return "OK";
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#getAuctions()
	 */
	public Map<String,Auction> getAuctions() {
		return auctions;
	}


	/* (non-Javadoc)
	 * @see auction.impl.Server#getCanals()
	 */
	public Map<String,Person> getCanals() {
		return canals;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#getPersons()
	 */
	public Map<String,Person> getPersons() {
		return persons;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#getTick()
	 */
	public int getTick() {
		return tick;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#listAuctions(java.lang.String)
	 */
	public String listAuctions(String canal){
		Person p = instance.getCanals().get(canal);
		if(p==null)
			return "ERROR: no user logged on this canal";
		StringBuffer result = new StringBuffer();
		for(Auction a: auctions.values()) {
			result.append(System.getProperty("line.separator"));
			result.append(a);
		}
		return result.length()>0 ? result.substring(System.getProperty("line.separator").length()) : "";
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#login(java.lang.String, java.lang.String, java.lang.String)
	 */
	public String login(String canal, String email, String password){
		if (canals.containsKey(canal))
			return "ERROR: a user is already logged on this canal";
		if (persons.containsKey(email)) {
			Person p = persons.get(email);
			if(!p.getPassword().equals(password))
				return "ERROR: incorrect login informations";
			canals.put(canal, p);
			return "OK";
		}
		else
			return "ERROR: incorrect login informations";
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#logout(java.lang.String)
	 */
	public String logout(String canal){
		if(!canals.containsKey(canal))
			return "ERROR: no user logged on this canal";
		canals.remove(canal);
		return "OK";
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#query(java.lang.String)
	 */
	public String query(String query) {
		String[] args = query.split("\\?");
		if(args.length!=2)
			return query;
		String canal = args[0].trim();
		String[] args2 = args[1].trim().split(" ", 2);
		String cmd = args2[0].toLowerCase();
		String params = (args2.length == 2 ? args2[1] : "");
		if(commands.containsKey(cmd))
			return canal+"!"+commands.get(cmd).execute(canal, params);
		else
			return canal+"!"+"ERROR: unknown command";
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#reset()
	 */
	public void reset() {
		auctions = new Hashtable<String,Auction>();
		canals = new Hashtable<String, Person>();
		persons = new Hashtable<String, Person>();
		persons.put("moderator@auction.com",new ModeratorImpl("Admin","Moderator","moderator@auction.com","pass","auction house"));
		tick = 0;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#send(auction.impl.Person, java.lang.String)
	 */
	public void send(Person p, String message) {
		for(String canal: canals.keySet()) {
			if(canals.get(canal)==p) {
				try {
					bw.write(canal+"!"+message);
					bw.newLine();
				}
				catch (IOException e) {
					e.printStackTrace();
					System.exit(-2);
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#start(java.lang.String, java.lang.String)
	 */
	public void start(String input, String output) throws IOException {
		br = new BufferedReader(new FileReader(input));
		bw = new BufferedWriter(new FileWriter(output));
		String line;
		while((line = br.readLine())!=null) {
			line = line.trim();
			if (line.toLowerCase().equals("tick"))
				instance.tick();
			else {
				bw.write(instance.query(line));
				bw.newLine();
			}
		}
		br.close();
		bw.close();
	}

	/* (non-Javadoc)
	 * @see auction.impl.Server#tick()
	 */
	public void tick() {
		tick++;
		for(Auction a: auctions.values()) {
			if(a.getStartDate()==tick) {
				a.open();
			}
			if(a.getEndDate()==tick) {
				a.close();
			}
		}
	}

}