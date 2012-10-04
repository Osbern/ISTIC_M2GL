package auction.commands;

import auction.Command;
import auction.Person;
import auction.User;
import auction.impl.ServerImpl;


public class CreateAuction implements Command {

	 
	public String execute(String canal, String params) {
		String[] args = params.split(" ");
		if(args.length<5)
			return "ERROR: invalid number of arguments";
		Person p = ServerImpl.instance.getCanals().get(canal);
		if(p==null)
			return "ERROR: no user logged on this canal";
		StringBuffer description = new StringBuffer();
		description.append(args[1]);
		for(int i=1;i<args.length-4;i++)
			description.append(" "+args[i+1]);
		if(p instanceof User)
			return ServerImpl.instance.createAuction((User)p, args[0], description.toString(), Integer.parseInt(args[args.length-3]), Integer.parseInt(args[args.length-2]), Integer.parseInt(args[args.length-1]));
		return "ERROR: only a user can create an auction";
	}

}
