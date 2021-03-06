package com.mimacom.ddd.sm.sim.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.sm.sim.SimStandaloneSetup;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;

public class SimTypeDiagramRendererPNGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final SimTypeDiagramRenderer obj = new SimTypeDiagramRenderer(PlantUmlFileFormat.PNG);
		new SimStandaloneSetup().createInjector().injectMembers(obj);
		return obj;
	}

}
