package com.mimacom.ddd.dm.dim.derivedState

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.base.base.ITypeContainer
import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory
import com.mimacom.ddd.dm.base.transpose.ISyntheticElement
import com.mimacom.ddd.dm.dim.DomainInformationModel
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

class DimDerivedStateComputer implements IDerivedStateComputer {

	static val LOGGER = Logger.getLogger(DimDerivedStateComputer);
	static val SYNTHETIC = SyntheticFactory.eINSTANCE
	
	public static val SYNTHETIC_STATE_QUERY_NAME = "state"
	public static val SYNTHETIC_STATES_ENUM_SUFFIX = "State"

	var derivedStateInstalled = false

	new() {
		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created")
	}

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (! resource.parseResult.hasSyntaxErrors) {
			val namespace = resource.allContents.head as DNamespace
			val model = namespace.model as DomainInformationModel
			if (model !== null) {
				LOGGER.debug("Derive state for " + resource.URI)
				derivedStateInstalled = true
				doInstallDerivedState(resource, model)
				LOGGER.debug("Derive state END for " + resource.URI)
			}
		}
	}

	protected def void doInstallDerivedState(DerivedStateAwareResource resource, DomainInformationModel model) {
		val entitiesWithStates = resource.allContents.filter(DEntityType).filter[! states.empty]
		while (entitiesWithStates.hasNext) {
			val entity = entitiesWithStates.next
			val container = EcoreUtil2.getContainerOfType(entity, ITypeContainer)
			if (container !== null) {
				val enum_ = SYNTHETIC.createTSyntheticEnumeration
				enum_.name = entity.name + SYNTHETIC_STATES_ENUM_SUFFIX
				for (state : entity.states) {
					val lit = SYNTHETIC.createTSyntheticLiteral
					lit.name = state.name
					enum_.literals.add(lit)
				}
				container.types.add(enum_)
				val query = SYNTHETIC.createTSyntheticQuery
				query.name = SYNTHETIC_STATE_QUERY_NAME
				query.type = enum_
				entity.features.add(query)
			}
		}
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		if (derivedStateInstalled) {
			try {
				LOGGER.debug("Discard state for " + resource?.URI)
				resource.removeAllSyntheticElements

			} finally {
				derivedStateInstalled = false
			}
		}
	}

	protected def void removeAllSyntheticElements(DerivedStateAwareResource resource) {
		// create list from TreeIterator because we are going to modify the tree while we iterate over the elements:
		val syntheticElements = resource.allContents.filter(ISyntheticElement)
		val list = Lists.newArrayList
		while (syntheticElements.hasNext)
			list.add(syntheticElements.next)
		for (e : list) {
			EcoreUtil.remove(e)
		}
	}
}
