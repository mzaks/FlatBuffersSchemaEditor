/*
 * generated by Xtext
 */
package maxim.zaks;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FlatBuffersStandaloneSetup extends FlatBuffersStandaloneSetupGenerated{

	public static void doSetup() {
		new FlatBuffersStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
