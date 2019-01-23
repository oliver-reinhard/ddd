/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx

import com.mimacom.ddd.dm.dmx.parsing.DmxValueConverters
import org.eclipse.xtext.conversion.IValueConverterService
import com.google.inject.Binder
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class DmxRuntimeModule extends AbstractDmxRuntimeModule {
	
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return DmxValueConverters
	}
	
	override void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider)
		.annotatedWith(com.google.inject.name.Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(DmxImportedNamespaceAwareLocalScopeProvider);
	}
	
//	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider()  {
//		return typeof(DmxQualifiedNameProvider)
//	}
}
