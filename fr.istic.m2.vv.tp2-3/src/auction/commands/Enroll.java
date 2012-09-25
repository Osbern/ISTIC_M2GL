package auction.commands;

import auction.Command;
import auction.impl.ServerImpl;


public class Enroll implements Command {

	 
	public String execute(String canal, String params) {
		String[] args = params.split(" ",5);
		if(args.length!=5)
			return "ERROR: invalid number of arguments";
		return ServerImpl.instance.createUser(args[0], args[1], args[2], args[3], args[4]);
	}

}
