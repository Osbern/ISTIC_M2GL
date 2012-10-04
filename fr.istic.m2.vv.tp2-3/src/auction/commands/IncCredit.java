package auction.commands;

import auction.Command;
import auction.Person;
import auction.User;
import auction.impl.ServerImpl;


public class IncCredit implements Command {

	 
	public String execute(String canal, String params) {
		String[] args = params.split(" ");
		if(args.length!=1 || params.length()==0)
			return "ERROR: invalid number of arguments";
		Person p = ServerImpl.instance.getCanals().get(canal);
		if(p==null)
			return "ERROR: no user logged on this canal";
		if(p instanceof User)
			return ((User)p).getAccount().incCredit(Integer.parseInt(params));
		return "ERROR: only users have an account";
	}

}
