/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom

import com.google.inject.Binder
import com.google.inject.name.Names
import com.mimacom.ddd.dm.dmx.indexing.DmxResourceDescriptionStrategy
import com.mimacom.ddd.dm.dmx.parsing.DmxValueConverters
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer
import com.mimacom.ddd.dm.dom.plantuml.DomSkinparamClass
import com.mimacom.ddd.dm.dom.typecomputer.DomTypeComputer
import com.mimacom.ddd.util.plantuml.SkinparamClass
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class DomRuntimeModule extends AbstractDomRuntimeModule {
	
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return DmxValueConverters
	}
	
	def Class<? extends DmxTypeComputer> bindITypeComputer() {
		return DomTypeComputer
	}
	
	override void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
		.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes);
	}

	def Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return DmxResourceDescriptionStrategy;
	}
	
	def Class<? extends SkinparamClass> bindPlantUMLSkinparamClass() {
		DomSkinparamClass
	}
}
