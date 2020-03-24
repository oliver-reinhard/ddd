package com.mimacom.ddd.dm.dem.tableProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.dem.DemStandaloneSetup;

public class DemEventPostconditionsTableRendererExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {;
		return new DemStandaloneSetup().createInjector().getInstance(DemEventPostconditionsTableRenderer.class);
	}

}
