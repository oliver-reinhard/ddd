package com.mimacom.ddd.dm.dim.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.dim.DimStandaloneSetup;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;

public class DimTypeDiagramRendererSVGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final DimTypeDiagramRenderer obj = new DimTypeDiagramRenderer(PlantUmlFileFormat.SVG);
		new DimStandaloneSetup().createInjector().injectMembers(obj);
		return obj;
	}

}
