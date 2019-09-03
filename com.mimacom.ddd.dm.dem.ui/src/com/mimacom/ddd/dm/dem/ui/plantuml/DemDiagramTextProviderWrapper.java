package com.mimacom.ddd.dm.dem.ui.plantuml;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dem.ui.internal.DemActivator;
import com.mimacom.ddd.util.plantuml.AbstractInjectingDiagramTextProviderWrapper;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider;

public class DemDiagramTextProviderWrapper extends AbstractInjectingDiagramTextProviderWrapper {

	@Override
	protected Injector getInjector() {
		return DemActivator.getInstance().getInjector(DemActivator.COM_MIMACOM_DDD_DM_DEM_DEM);
	}

	@Override
	protected Class<? extends DiagramTextProvider> getDiagramTextProviderClass() {
		return DemDiagramTextProvider.class;
	}
}
