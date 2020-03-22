/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.mimacom.ddd.dm.dem.AbstractDemRuntimeModule;
import com.mimacom.ddd.dm.dem.scoping.DemQualifiedNameProvider;
import com.mimacom.ddd.dm.dem.typecomputer.DemTypeComputer;
import com.mimacom.ddd.dm.dem.typecomputer.DemTypeDescriptorProvider;
import com.mimacom.ddd.dm.dmx.parsing.DmxValueConverters;
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class DemRuntimeModule extends AbstractDemRuntimeModule {
  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return DemQualifiedNameProvider.class;
  }
  
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return DmxValueConverters.class;
  }
  
  @Override
  public void configureIScopeProviderDelegate(final Binder binder) {
    binder.<IScopeProvider>bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(DmxImportedNamespaceAwareLocalScopeProvider.class);
  }
  
  public Class<? extends DmxTypeComputer> bindDmxTypeComputer() {
    return DemTypeComputer.class;
  }
  
  public Class<? extends DmxTypeDescriptorProvider> bindDmxTypeDescriptorProvider() {
    return DemTypeDescriptorProvider.class;
  }
}
