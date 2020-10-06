/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim

import com.google.inject.Binder
import com.google.inject.name.Names
import com.mimacom.ddd.dm.base.transpose.TransposeAwareResource
import com.mimacom.ddd.sm.sim.derivedState.SimDerivedStateComputer
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy
import com.mimacom.ddd.sm.sim.parsing.SimValueConverters
import com.mimacom.ddd.sm.sim.scoping.SimQualifiedNameProvider
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class SimRuntimeModule extends AbstractSimRuntimeModule {
	
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider()  {
		return SimQualifiedNameProvider
	}

	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return SimValueConverters
	}
	
	override void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider)
		.annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(ImportedNamespaceAwareLocalScopeProvider); //DmxImportedNamespaceAwareLocalScopeProvider);
	}

	// derived state:
	
	override bindXtextResource() {
		TransposeAwareResource
	}

	def Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		SimDerivedStateComputer
	}

	def Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
		DerivedStateAwareResourceDescriptionManager
	}

	def Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SimResourceDescriptionStrategy;
	}

//	def Class<? extends ICrossReferenceSerializer> bindICrossReferenceSerializer() {
//		SimCrossReferenceSerializer // TODO remove if bug has been fixed
//	}
}
