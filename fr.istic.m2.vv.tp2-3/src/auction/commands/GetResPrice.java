package auction.commands;

import auction.Auction;
import auction.Command;
import auction.Person;
import auction.ReserveAuction;
import auction.impl.ServerImpl;


public class GetResPrice implements Command {

	 
	public String execute(String canal, String params) {
		String[] args = params.split(" ");
		if(args.length!=1 || params.length()==0)
			return "ERROR: invalid number of arguments";
		Person p = ServerImpl.instance.getCanals().get(canal);
		if(p==null)
			return "ERROR: no user logged on this canal";
		Auction a = ServerImpl.instance.getAuctions().get(args[0]);
		if(a==null)
			return "ERROR: no auction with this name";
		if(a instanceof ReserveAuction)
			return Integer.toString(((ReserveAuction)a).getReservePrice()); // bug: was a.getDescription() 
		else
			return "ERROR: this auction has no reserve price";
	}

}
