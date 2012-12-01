package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

import javax.security.auth.login.FailedLoginException;

import client.ChatUser;


public class ChatRoomImpl extends UnicastRemoteObject implements ChatRoom {
	private Hashtable<String, ChatUser> users = new Hashtable<String, ChatUser>();

	private Hashtable<String, char[]> alloweduser = new Hashtable<String, char[]>();

	// configurable option
	private boolean debug = false;

	public ChatRoomImpl() throws RemoteException {
		super();
		alloweduser.put("toto", "passtoto".toCharArray());
		alloweduser.put("titi", "passtiti".toCharArray());
		alloweduser.put("testUser", "testPassword".toCharArray());

	}

	public void subscribe(ChatUser user, String pseudo) throws RemoteException {
		String message = "Connexion de " + pseudo;
		this.postMessage("ChatRoom", message);
		System.out.println(message);
		this.users.put(pseudo, user);
	}

	public void unsubscribe(String pseudo) throws RemoteException {
		String message = "Deconnexion de " + pseudo;
		System.out.println(message);
		this.users.remove(pseudo);
		this.postMessage("ChatRoom", message);
	}

	public void postMessage(String pseudo, String message)
			throws RemoteException {
		String fullMessage = pseudo + " >> " + message;
		System.out.println(fullMessage);

		for (ChatUser user : users.values()) {
			user.displayMessage(fullMessage);
		}
	}

	public boolean authentification(String username, char[] password)
			throws FailedLoginException, RemoteException {
		// verify the username/password
		boolean usernameCorrect = false;
		boolean passwordCorrect = false;
		if (this.alloweduser.containsKey(username)) {
			usernameCorrect = true;
			if (password.length == this.alloweduser.get(username).length
					&& testPassword(this.alloweduser.get(username), password)) {

				// authentication succeeded!!!
				passwordCorrect = true;
				if (debug)
					System.out.println("\t\t[SampleLoginModule] "
							+ "authentication succeeded");
				return true;
			}

		}

		// authentication failed -- clean out state
		if (debug)
			System.out.println("\t\t[SampleLoginModule] "
					+ "authentication failed");
		for (int i = 0; i < password.length; i++)
			password[i] = ' ';
		if (!usernameCorrect) {
			throw new FailedLoginException("User Name Incorrect");
		} else {
			throw new FailedLoginException("Password Incorrect");

		}
	}

	private boolean testPassword(char[] cs, char[] password) {
		boolean result = true;
		int i = 0;
		while (i < cs.length && result) {
			if (cs[i] != password[i])
				result = false;
			i++;
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		try {
			LocateRegistry.createRegistry(1099);
		} catch (Exception e) {
			System.err.println("Il y a deja un registre de lancer");
		}

		ChatRoomImpl room = new ChatRoomImpl();
		Naming.rebind("ChatRoom", room);
	}
}