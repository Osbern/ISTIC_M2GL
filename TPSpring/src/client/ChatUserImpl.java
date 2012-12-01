package client;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginException;

import server.ChatRoom;

import com.sun.security.auth.callback.DialogCallbackHandler;


public class ChatUserImpl extends UnicastRemoteObject implements ChatUser,
		Runnable, User {
	private ChatRoom room = null;

	private String pseudo = null;

	private String name = null;

	private ChatUI ui;

	public ChatUserImpl(String name) throws RemoteException {
		super(); // Appel au constructeur de UnicastRemoteObject
		this.name = name;
		try {
			this.room = (ChatRoom) Naming.lookup("rmi://localhost/ChatRoom");
		} catch (Exception e) {

			e.printStackTrace();
			System.exit(0);
		}

		this.createIHM();
		// this.requestPseudo();
	}

	public void createIHM() {
		Commande unreg = new CommandeUnregister(room);
		unreg.setUser(this);
		Commande post = new CommandPost(room);
		post.setUser(this);
		ui = new ChatUI(this, post, unreg);
		((CommandPost) post).setUI(ui);
	}

	public void displayMessage(String message) throws RemoteException {
		ui.displayMessage(message);
	}

	public void run() {
		try {
			SampleLoginModule lc = null;
			try {
				lc = new SampleLoginModule(room);
				//Set principals = new HashSet();
				//principals
				//		.add(new sample.principal.SamplePrincipal("testUser"));
				//Subject mySubject = new Subject(false, principals,
				//		new HashSet(), new HashSet());

				lc.initialize(new Subject(), new DialogCallbackHandler(), null,
						new HashMap());

			} catch (SecurityException se) {
				System.err.println("Cannot create LoginContext. "
						+ se.getMessage());
				System.exit(-1);
			}

			// the user has 3 attempts to authenticate successfully
			int i;
			for (i = 0; i < 3; i++) {
				try {

					// attempt authentication
					lc.login();

					// if we return with no exception, authentication succeeded
					break;

				} catch (LoginException le) {

					System.err.println("Authentication failed:");
					System.err.println("  " + le.getMessage());
					try {
						Thread.currentThread().sleep(3000);
					} catch (Exception e) {
						// ignore
					}

				}
			}

			// did they fail three times?
			if (i == 3) {
				System.out.println("Sorry");
				
				System.exit(-1);
			}

			System.out.println("Authentication succeeded!");
			this.pseudo = ui.requestPseudo();
			this.room.subscribe(this, this.pseudo);

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public String getPseudo() {
		return pseudo;
	}

}