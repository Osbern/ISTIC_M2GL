package auction.commands;

import auction.Command;
import auction.impl.ServerImpl;


public class ListAuctions implements Command {

	 
	public String execute(String canal, String params) {
		return ServerImpl.instance.listAuctions(canal);
	}

}
