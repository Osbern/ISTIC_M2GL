package auction;

import java.io.IOException;
import java.util.Map;

public interface Server {


	public abstract String closeAccount(String canal);
 
	public abstract String createAuction(User user, String name,
			String description, int startDate, int endDate, int minimumBid);

	public abstract String createRAuction(User user, String name,
			String description, int startDate, int endDate, int minimumBid,
			int reservePrice);

	public abstract String createUser(String firstName, String lastName,
			String email, String password, String address);

	public abstract Map<String, Auction> getAuctions();

	public abstract Map<String, Person> getCanals();

	public abstract Map<String, Person> getPersons();

	public abstract int getTick();

	public abstract String listAuctions(String canal);

	public abstract String login(String canal, String email, String password);

	public abstract String logout(String canal);

	public abstract String query(String query);

	public abstract void reset();

	public abstract void send(Person p, String message);

	public abstract void start(String input, String output) throws IOException;

	public abstract void tick();

}