/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import com.mimacom.ddd.dm.dmx.indexing.DmxQualifiedNameProvider;
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider;
import com.mimacom.ddd.sm.asm.AbstractAsmRuntimeModule;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class AsmRuntimeModule extends AbstractAsmRuntimeModule {
  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return DmxQualifiedNameProvider.class;
  }
  
  @Override
  public void configureIScopeProviderDelegate(final Binder binder) {
    binder.<IScopeProvider>bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(DmxImportedNamespaceAwareLocalScopeProvider.class);
  }
}
