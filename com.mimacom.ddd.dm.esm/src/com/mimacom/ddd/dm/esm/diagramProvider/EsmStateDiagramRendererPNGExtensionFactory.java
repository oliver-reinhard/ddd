package com.mimacom.ddd.dm.esm.diagramProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.mimacom.ddd.dm.esm.EsmStandaloneSetup;
import com.mimacom.ddd.util.plantuml.PlantUmlFileFormat;

public class EsmStateDiagramRendererPNGExtensionFactory implements IExecutableExtensionFactory {

	@Override
	public Object create() throws CoreException {
		final EsmStateDiagramRenderer obj = new EsmStateDiagramRenderer(PlantUmlFileFormat.PNG);
		new EsmStandaloneSetup().createInjector().injectMembers(obj);
		return obj;
	}

}
