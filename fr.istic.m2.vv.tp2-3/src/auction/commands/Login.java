package auction.commands;

import auction.Command;
import auction.impl.ServerImpl;


public class Login implements Command {

	 
	public String execute(String canal, String params) {
		String[] args = params.split(" ");
		if(args.length!=2)
			return "ERROR: invalid number of arguments";
		return ServerImpl.instance.login(canal, args[0], args[1]);
	}

}
