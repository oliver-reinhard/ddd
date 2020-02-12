package com.mimacom.ddd.sm.sim.ui.plantuml;

import com.google.inject.Injector;
import com.mimacom.ddd.sm.sim.ui.internal.SimActivator;
import com.mimacom.ddd.util.plantuml.AbstractInjectingDiagramTextProviderWrapper;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider;

public class SimTypeDiagramTextProviderWrapper extends AbstractInjectingDiagramTextProviderWrapper {

	@Override
	protected Injector getInjector() {
		return SimActivator.getInstance().getInjector(SimActivator.COM_MIMACOM_DDD_SM_SIM_SIM);
	}

	@Override
	protected Class<? extends DiagramTextProvider> getDiagramTextProviderClass() {
		return SimTypeDiagramTextProvider.class;
	}
}
