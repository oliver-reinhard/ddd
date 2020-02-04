package com.mimacom.ddd.dm.dim.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dim.DimStandaloneSetup;

public class DimTypeDiagramRendererPNGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final Injector injector = new DimStandaloneSetup().createInjector();
		return injector.getInstance(DimTypeDiagramRendererPNG.class);
	}

}
