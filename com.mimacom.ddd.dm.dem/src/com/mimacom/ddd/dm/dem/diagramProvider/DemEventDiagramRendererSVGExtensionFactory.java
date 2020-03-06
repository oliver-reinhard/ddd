package com.mimacom.ddd.dm.dem.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.dem.DemStandaloneSetup;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;

public class DemEventDiagramRendererSVGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final DemEventDiagramRenderer obj = new DemEventDiagramRenderer(PlantUmlFileFormat.SVG);
		new DemStandaloneSetup().createInjector().injectMembers(obj);
		return obj;
	}

}
