package com.mimacom.ddd.sm.sim.ui.builder;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.mimacom.ddd.sm.sim.ui.builder.SimClusteringBuilderState;
import org.eclipse.xtext.builder.builderState.IBuilderState;

@SuppressWarnings("all")
public class SimDerivedStateBuilderModule extends AbstractModule {
  @Override
  protected void configure() {
    this.<IBuilderState>bind(IBuilderState.class).to(SimClusteringBuilderState.class).in(Scopes.SINGLETON);
  }
}
