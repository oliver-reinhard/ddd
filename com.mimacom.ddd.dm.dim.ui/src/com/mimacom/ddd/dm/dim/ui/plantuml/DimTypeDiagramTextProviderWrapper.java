package com.mimacom.ddd.dm.dim.ui.plantuml;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dim.ui.internal.DimActivator;
import com.mimacom.ddd.util.plantuml.AbstractInjectingDiagramTextProviderWrapper;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider;

public class DimTypeDiagramTextProviderWrapper extends AbstractInjectingDiagramTextProviderWrapper {

	@Override
	protected Injector getInjector() {
		return DimActivator.getInstance().getInjector(DimActivator.COM_MIMACOM_DDD_DM_DIM_DIM);
	}

	@Override
	protected Class<? extends DiagramTextProvider> getDiagramTextProviderClass() {
		return DimTypeDiagramTextProvider.class;
	}
}
