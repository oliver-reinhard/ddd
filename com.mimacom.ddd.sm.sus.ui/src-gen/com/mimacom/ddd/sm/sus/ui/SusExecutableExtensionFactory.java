/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.sus.ui;

import com.google.inject.Injector;
import com.mimacom.ddd.sm.sus.ui.internal.SusActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SusExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(SusActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		SusActivator activator = SusActivator.getInstance();
		return activator != null ? activator.getInjector(SusActivator.COM_MIMACOM_DDD_SM_SUS_SUS) : null;
	}

}
