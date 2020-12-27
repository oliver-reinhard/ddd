package com.mimacom.ddd.dm.esm.ui.plantuml;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.esm.ui.internal.EsmActivator;
import com.mimacom.ddd.util.plantuml.AbstractInjectingDiagramTextProviderWrapper;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider;

public class EsmStateDiagramTextProviderWrapper extends AbstractInjectingDiagramTextProviderWrapper {

	@Override
	protected Injector getInjector() {
		return EsmActivator.getInstance().getInjector(EsmActivator.COM_MIMACOM_DDD_DM_ESM_ESM);
	}

	@Override
	protected Class<? extends DiagramTextProvider> getDiagramTextProviderClass() {
		return EsmStateDiagramTextProvider.class;
	}
}
