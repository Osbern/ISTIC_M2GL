package org.EurosDollars.Client;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.EurosDollars.API.*;

/**
 * Hello world!
 * 
 */
public final class Client {
	
	private static final String DEFAULT_INITIAL_CONTEXT_FACTORY = "org.ow2.easybeans.component.smartclient.spi.SmartContextFactory";
	
    private static Context getInitialContext() throws NamingException {
        Hashtable<String, Object> env = new Hashtable<String, Object>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, getInitialContextFactory());
        return new InitialContext(env);
    }
    
    private static String getInitialContextFactory() {
        String prop = System.getProperty("easybeans.client.initial-context-factory");
        if (prop == null) {
            prop = DEFAULT_INITIAL_CONTEXT_FACTORY;
        }
        return prop;
    }
	
	public static void main(String[] args) {
		try {
			Context initialContext = getInitialContext();
			EDAPI api = (EDAPI) initialContext.lookup("EurosDollars");
			System.out.println("12 euros to dollars : "+api.euros2dollars("12"));
			System.out.println("12 dollars to euros : "+api.dollars2euros("12"));
			System.out.println("12 euros to dollars to euros : "+api.dollars2euros(api.euros2dollars("12")));
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
