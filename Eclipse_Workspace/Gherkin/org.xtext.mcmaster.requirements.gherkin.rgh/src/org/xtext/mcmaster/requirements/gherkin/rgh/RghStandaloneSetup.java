/*
 * generated by Xtext 2.30.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class RghStandaloneSetup extends RghStandaloneSetupGenerated {

	public static void doSetup() {
		new RghStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
