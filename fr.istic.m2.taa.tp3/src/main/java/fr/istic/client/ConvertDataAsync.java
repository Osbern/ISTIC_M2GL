package fr.istic.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ConvertDataAsync {

	void dollars2euros(String dollars, AsyncCallback<String> callback);

	void euros2dollars(String euros, AsyncCallback<String> callback);

}
