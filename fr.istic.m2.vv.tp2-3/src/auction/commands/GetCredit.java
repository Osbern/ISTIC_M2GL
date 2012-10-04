package auction.commands;

import auction.Command;
import auction.Person;
import auction.User;
import auction.impl.ServerImpl;


public class GetCredit implements Command {

	 
	public String execute(String canal, String params) {
		Person p = ServerImpl.instance.getCanals().get(canal);
		if(p==null)
			return "ERROR: no user logged on this canal";
		if(p instanceof User)
			return ((User)p).getAccount().getCredits();
		return "ERROR: only users have an account";
	}

}
