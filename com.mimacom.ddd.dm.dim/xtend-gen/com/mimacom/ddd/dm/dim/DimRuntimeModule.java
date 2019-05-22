/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.mimacom.ddd.dm.dim.AbstractDimRuntimeModule;
import com.mimacom.ddd.dm.dmx.parsing.DmxValueConverters;
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class DimRuntimeModule extends AbstractDimRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return DmxValueConverters.class;
  }
  
  @Override
  public void configureIScopeProviderDelegate(final Binder binder) {
    binder.<IScopeProvider>bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(DmxImportedNamespaceAwareLocalScopeProvider.class);
  }
}
