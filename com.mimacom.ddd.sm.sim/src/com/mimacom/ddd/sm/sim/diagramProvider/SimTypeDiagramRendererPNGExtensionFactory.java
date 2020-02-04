package com.mimacom.ddd.sm.sim.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dim.DimStandaloneSetup;

public class SimTypeDiagramRendererPNGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final Injector injector = new DimStandaloneSetup().createInjector();
		return injector.getInstance(SimTypeDiagramRendererPNG.class);
	}

}
