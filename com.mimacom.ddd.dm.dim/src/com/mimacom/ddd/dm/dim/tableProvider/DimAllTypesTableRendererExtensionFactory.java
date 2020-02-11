package com.mimacom.ddd.dm.dim.tableProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.dim.DimStandaloneSetup;

public class DimAllTypesTableRendererExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {;
		return new DimStandaloneSetup().createInjector().getInstance(DimAllTypesTableRenderer.class);
	}

}
