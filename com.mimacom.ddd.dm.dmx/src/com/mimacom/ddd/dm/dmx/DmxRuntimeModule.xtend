/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx

import com.google.inject.Binder
import com.google.inject.name.Names
import com.mimacom.ddd.dm.dmx.indexing.DmxQualifiedNameProvider
import com.mimacom.ddd.dm.dmx.parsing.DmxValueConverters
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class DmxRuntimeModule extends AbstractDmxRuntimeModule {
	
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider()  {
		return DmxQualifiedNameProvider
	}
	
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return DmxValueConverters
	}
	
	override void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
		.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(DmxImportedNamespaceAwareLocalScopeProvider);
	}
}
