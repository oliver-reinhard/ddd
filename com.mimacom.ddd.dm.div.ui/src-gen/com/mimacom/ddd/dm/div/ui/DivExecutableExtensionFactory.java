/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.div.ui;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.div.ui.internal.DivActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DivExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DivActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DivActivator activator = DivActivator.getInstance();
		return activator != null ? activator.getInjector(DivActivator.COM_MIMACOM_DDD_DM_DIV_DIV) : null;
	}

}
