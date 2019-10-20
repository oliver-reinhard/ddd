package com.mimacom.ddd.dm.dom.ui.plantuml;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dom.ui.internal.DomActivator;
import com.mimacom.ddd.util.plantuml.AbstractInjectingDiagramTextProviderWrapper;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider;

public class DomDiagramTextProviderWrapper extends AbstractInjectingDiagramTextProviderWrapper {

	@Override
	protected Injector getInjector() {
		return DomActivator.getInstance().getInjector(DomActivator.COM_MIMACOM_DDD_DM_DOM_DOM);
	}

	@Override
	protected Class<? extends DiagramTextProvider> getDiagramTextProviderClass() {
		return DomDiagramTextProvider.class;
	}
}
