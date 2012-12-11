package fr.istic.server;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;

import org.EurosDollars.API.EDAPI;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import fr.istic.client.ConvertData;

@SuppressWarnings("serial")
public class ConvertDataImpl extends RemoteServiceServlet implements
		ConvertData {

	/**
	 * Use Smart Factory by default.
	 */
	private static final String DEFAULT_INITIAL_CONTEXT_FACTORY = "org.ow2.easybeans.component.smartclient.spi.SmartContextFactory";

	private EDAPI bean;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		try {
			bean = (EDAPI) getInitialContext().lookup("EurosDollars");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @return Returns the InitialContext.
	 * @throws NamingException
	 *             If the Context cannot be created.
	 */
	private static Context getInitialContext() throws NamingException {
		// if user don't use jclient/client container
		// we can specify the InitialContextFactory to use
		// But this is *not recommended*.
		Hashtable<String, Object> env = new Hashtable<String, Object>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, getInitialContextFactory());
		// Usually a simple new InitialContext() without any parameters is
		// sufficent.
		// return new InitialContext();
		return new InitialContext(env);

	}

	/**
	 * Returns a configurable InitialContextFactory classname.<br/>
	 * Can be configured with the
	 * <code>easybeans.client.initial-context-factory</code> System property.
	 * @return Returns a configurable InitialContextFactory classname.
	 */
	private static String getInitialContextFactory() {
		String prop = System
				.getProperty("easybeans.client.initial-context-factory");
		// If not found, use the default
		if (prop == null) {
			prop = DEFAULT_INITIAL_CONTEXT_FACTORY;
		}
		return prop;
	}

	public String euros2dollars(String euros) {
		return bean.euros2dollars(euros);
	}

	public String dollars2euros(String dollars) {
		return bean.dollars2euros(dollars);
	}
}
