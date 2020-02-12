/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider;
import com.mimacom.ddd.dm.dmx.scoping.DmxQualifiedNameProvider;
import com.mimacom.ddd.sm.sim.AbstractSimRuntimeModule;
import com.mimacom.ddd.sm.sim.derivedState.SimDerivedStateComputer;
import com.mimacom.ddd.sm.sim.generator.SimCompositeGenerator;
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy;
import com.mimacom.ddd.sm.sim.parsing.SimValueConverters;
import com.mimacom.ddd.sm.sim.scoping.SimCrossReferenceSerializer;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class SimRuntimeModule extends AbstractSimRuntimeModule {
  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return DmxQualifiedNameProvider.class;
  }
  
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return SimValueConverters.class;
  }
  
  @Override
  public void configureIScopeProviderDelegate(final Binder binder) {
    binder.<IScopeProvider>bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(DmxImportedNamespaceAwareLocalScopeProvider.class);
  }
  
  @Override
  public Class<? extends XtextResource> bindXtextResource() {
    return DerivedStateAwareResource.class;
  }
  
  public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
    return SimDerivedStateComputer.class;
  }
  
  public Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
    return DerivedStateAwareResourceDescriptionManager.class;
  }
  
  public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
    return SimResourceDescriptionStrategy.class;
  }
  
  public Class<? extends ICrossReferenceSerializer> bindICrossReferenceSerializer() {
    return SimCrossReferenceSerializer.class;
  }
  
  @Override
  public Class<? extends IGenerator2> bindIGenerator2() {
    return SimCompositeGenerator.class;
  }
}
