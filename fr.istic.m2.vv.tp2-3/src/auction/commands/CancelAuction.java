package auction.commands;

import auction.Auction;
import auction.Command;
import auction.Person;
import auction.impl.ServerImpl;

public class CancelAuction implements Command {

	 
	public String execute(String canal, String params) {
		String[] args = params.split(" ");
		if(args.length!=1 || params.length()==0)
			return "ERROR: invalid number of arguments";
		Person p = ServerImpl.instance.getCanals().get(canal);
		if(p==null)
			return "ERROR: no user logged on this canal";
		Auction a = ServerImpl.instance.getAuctions().get(params);
		if(a!=null)
			return a.cancelAuction(p);
		else
			return "ERROR: no auction with this name";
	}

}
