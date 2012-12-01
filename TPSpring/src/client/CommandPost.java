package client;

import java.rmi.RemoteException;

import server.ChatRoom;


public class CommandPost implements Commande {

	public CommandPost(ChatRoom room) {
		this.room = room;
	}

	ChatRoom room = null;
	User user = null;
	ChatUI ui = null;

	public void execute() {
		try {
			room.postMessage(user.getPseudo(), ui.getMessage());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void setUser(User user) {
		this.user = user;
	}


	public void setUI(ChatUI ui2) {
		this.ui=ui2;
	}

}
