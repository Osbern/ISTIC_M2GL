
package fr.istic.m2.idm.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TopanlStandaloneSetup extends TopanlStandaloneSetupGenerated{

	public static void doSetup() {
		new TopanlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

