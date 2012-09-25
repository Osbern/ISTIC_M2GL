package auction.commands;

import auction.Auction;
import auction.Command;
import auction.Person;
import auction.User;
import auction.impl.ServerImpl;
import auction.impl.UserImpl;

public class JoinAuction implements Command {

	 
	public String execute(String canal, String params) {
		String[] args = params.split(" ");
		if(args.length!=1 || params.length()==0)
			return "ERROR: invalid number of arguments";
		Person p = ServerImpl.instance.getCanals().get(canal);
		if(p==null)
			return "ERROR: no user logged on this canal";
		if(!(p instanceof User))
			return "ERROR: only users can join an auction";
		Auction a = ServerImpl.instance.getAuctions().get(args[0]);
		if(a!=null)
			return a.join((UserImpl)p);
		else
			return "ERROR: no auction with this name";
	}

}
