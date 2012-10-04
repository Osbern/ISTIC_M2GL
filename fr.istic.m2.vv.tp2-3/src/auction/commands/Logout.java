package auction.commands;

import auction.Command;
import auction.impl.ServerImpl;


public class Logout implements Command {

	 
	public String execute(String canal, String params) {
		return ServerImpl.instance.logout(canal);
	}

}
