/*
 * generated by Xtext
 */
package maxim.zaks.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import maxim.zaks.ui.internal.FlatBuffersActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FlatBuffersExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FlatBuffersActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return FlatBuffersActivator.getInstance().getInjector(FlatBuffersActivator.MAXIM_ZAKS_FLATBUFFERS);
	}
	
}
