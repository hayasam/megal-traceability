/*
* generated by Xtext
*/
package org.softlang.megal.language;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MegalStandaloneSetup extends MegalStandaloneSetupGenerated{

	public static void doSetup() {
		new MegalStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

