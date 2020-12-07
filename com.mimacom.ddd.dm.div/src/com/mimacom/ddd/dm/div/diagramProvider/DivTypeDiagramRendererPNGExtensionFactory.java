package com.mimacom.ddd.dm.div.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.dim.DimStandaloneSetup;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;

public class DivTypeDiagramRendererPNGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final DivTypeDiagramRenderer obj = new DivTypeDiagramRenderer(PlantUmlFileFormat.PNG);
		new DimStandaloneSetup().createInjector().injectMembers(obj);
		return obj;
	}

}
