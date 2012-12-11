package fr.istic.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.istic.client.ManageData;

public class ManageDataImpl extends RemoteServiceServlet implements ManageData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1539312056609579763L;
	private int number = 42;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer value) {
		number = value;
	}

}
