package fr.istic.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.istic.client.GreetingService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

  public String greetServer(String input) throws IllegalArgumentException {
	  return input.toUpperCase();
  
  }

  
}
