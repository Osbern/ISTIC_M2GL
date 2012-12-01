package client;

import java.rmi.RemoteException;

import server.ChatRoom;


public class CommandeUnregister implements Commande {

	ChatRoom room = null;
	User user = null;
	
	public CommandeUnregister(ChatRoom room) {
		this.room = room;
	}

	public void execute() {
		try {
			room.unsubscribe(user.getPseudo());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setUser(User user) {
		this.user = user;
	}

}
