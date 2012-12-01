package client;

import java.rmi.RemoteException;

public class Main {
	public static void main(String[] args) throws RemoteException {
		new Thread(new ChatUserImpl("essai1")).start();
		
	}

}
