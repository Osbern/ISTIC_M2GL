package auction.commands;

import auction.Auction;
import auction.Command;
import auction.Person;
import auction.impl.ServerImpl;


public class SetDesc implements Command {

	 
	public String execute(String canal, String params) {
		String[] args = params.split(" ",2);
		if(args.length!=2)
			return "ERROR: invalid number of arguments";
		Person p = ServerImpl.instance.getCanals().get(canal);
		if(p==null)
			return "ERROR: no user logged on this canal";
		Auction a = ServerImpl.instance.getAuctions().get(args[0]);
		if(a!=null)
			return a.setDesc(p, args[1]);
		else
			return "ERROR: no auction with this name";
	}

}
