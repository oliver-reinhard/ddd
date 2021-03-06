/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm

import com.google.inject.Binder
import com.google.inject.name.Names
import com.mimacom.ddd.dm.dmx.indexing.DmxResourceDescriptionStrategy
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class AsmRuntimeModule extends AbstractAsmRuntimeModule {
	
	override void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
		.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(DmxImportedNamespaceAwareLocalScopeProvider);
	}

	def Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return DmxResourceDescriptionStrategy;
	}
}
