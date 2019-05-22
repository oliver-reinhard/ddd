/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dim.ui;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dim.ui.internal.DimActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DimExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DimActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DimActivator activator = DimActivator.getInstance();
		return activator != null ? activator.getInjector(DimActivator.COM_MIMACOM_DDD_DM_DIM_DIM) : null;
	}

}
