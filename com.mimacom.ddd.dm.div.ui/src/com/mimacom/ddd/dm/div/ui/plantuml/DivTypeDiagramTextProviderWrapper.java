package com.mimacom.ddd.dm.div.ui.plantuml;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.div.ui.internal.DivActivator;
import com.mimacom.ddd.util.plantuml.AbstractInjectingDiagramTextProviderWrapper;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider;

public class DivTypeDiagramTextProviderWrapper extends AbstractInjectingDiagramTextProviderWrapper {

	@Override
	protected Injector getInjector() {
		return DivActivator.getInstance().getInjector(DivActivator.COM_MIMACOM_DDD_DM_DIV_DIV);
	}

	@Override
	protected Class<? extends DiagramTextProvider> getDiagramTextProviderClass() {
		return DivTypeDiagramTextProvider.class;
	}
}
