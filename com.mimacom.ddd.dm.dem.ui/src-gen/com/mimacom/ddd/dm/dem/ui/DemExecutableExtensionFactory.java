/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dem.ui;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dem.ui.internal.DemActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DemExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DemActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DemActivator activator = DemActivator.getInstance();
		return activator != null ? activator.getInjector(DemActivator.COM_MIMACOM_DDD_DM_DEM_DEM) : null;
	}

}
