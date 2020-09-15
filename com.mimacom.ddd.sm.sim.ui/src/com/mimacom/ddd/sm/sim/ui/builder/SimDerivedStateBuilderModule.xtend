package com.mimacom.ddd.sm.sim.ui.builder

import com.google.inject.AbstractModule
import com.google.inject.Scopes
import org.eclipse.xtext.builder.builderState.IBuilderState

class SimDerivedStateBuilderModule extends AbstractModule {

	override protected configure() {
		bind(IBuilderState).to(SimClusteringBuilderState).in(Scopes.SINGLETON);
	}
}
