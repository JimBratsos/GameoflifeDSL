/*
 * generated by Xtext 2.25.0
 */
package gameoflife;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class GameoflifeDSLStandaloneSetup extends GameoflifeDSLStandaloneSetupGenerated {

	public static void doSetup() {
		new GameoflifeDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
