package com.mimacom.ddd.sm.sim.derivedState

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.modelDeduction.IDeductionAwareResource
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.emf.common.util.EList

class DeductionAwareResource extends DerivedStateAwareResource implements IDeductionAwareResource {

	static val LOGGER = Logger.getLogger(DeductionAwareResource);

	@Inject DeductionAwareScopeProvider scopeProvider
	@Inject extension TypeMappingUtil

	new() {
		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created resource " + hashCode)
	}

	/* IDeductionAwareResource */
	override EObject deduceTargetObject(QualifiedName sourceObjectQN, EObject objectContext) {
		val descriptions = getSystemTypeDescriptions(objectContext, sourceObjectQN)
		val importedDescriptions = scopeProvider.filterByImportedNamespaces(objectContext, descriptions, false)
		if (! importedDescriptions.empty) {
			val systemTypeDesc = importedDescriptions.head // consider only the first element
			val systemType = getResourceSet.getEObject(systemTypeDesc.EObjectURI, true)

			if (LOGGER.debugEnabled) {
				LOGGER.debug(sourceObjectQN + ' -> ' + systemTypeDesc.name + ' (' + systemType + ')')
			}
			return systemType
		}
		LOGGER.debug("fragment QN = " + sourceObjectQN + ' -> ' + null)
		return null;
	}
	
	/*
	 * Returns the contents without computing the derived state.
	 */
	synchronized def EList<EObject> peekContents() {
		return doGetContents
	}

}
