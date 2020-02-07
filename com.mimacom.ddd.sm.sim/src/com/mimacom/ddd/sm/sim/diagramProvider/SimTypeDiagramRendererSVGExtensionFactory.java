package com.mimacom.ddd.sm.sim.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.sm.sim.SimStandaloneSetup;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;

public class SimTypeDiagramRendererSVGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final SimTypeDiagramRenderer obj = new SimTypeDiagramRenderer(PlantUmlFileFormat.SVG);
		new SimStandaloneSetup().createInjector().injectMembers(obj);
		return obj;
	}

}
