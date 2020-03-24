package com.mimacom.ddd.dm.dem.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.dem.DemStandaloneSetup;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;

public class DemEventsOverviewDiagramRendererPNGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final DemEventsOverviewDiagramRenderer obj = new DemEventsOverviewDiagramRenderer(PlantUmlFileFormat.PNG);
		new DemStandaloneSetup().createInjector().injectMembers(obj);
		return obj;
	}

}
