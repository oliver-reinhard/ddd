package com.mimacom.ddd.dm.dem.tableProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.dem.DemStandaloneSetup;

public class DemEventTableRendererExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {;
		return new DemStandaloneSetup().createInjector().getInstance(DemEventTableRenderer.class);
	}

}
