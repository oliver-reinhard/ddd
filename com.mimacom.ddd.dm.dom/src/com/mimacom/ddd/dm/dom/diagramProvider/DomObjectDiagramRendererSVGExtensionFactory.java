package com.mimacom.ddd.dm.dom.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.dom.DomStandaloneSetup;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;

public class DomObjectDiagramRendererSVGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final DomObjectDiagramRenderer obj = new DomObjectDiagramRenderer(PlantUmlFileFormat.SVG);
		new DomStandaloneSetup().createInjector().injectMembers(obj);
		return obj;
	}

}
