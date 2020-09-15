package com.mimacom.ddd.sm.sim.derivedState

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.modelDeduction.IDeductionAwareResource
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.DerivedStateAwareResource

class DeductionAwareResource extends DerivedStateAwareResource implements IDeductionAwareResource {

	/*
	 * A tri-state initialization to distinguish between preIndexingPhase derived-state computation and full derived-state computation.
	 */
	enum InitializationState {
		NOT_INITIALIZED,
		PRE_INDEXING,
		FULLY_INITIALIZED
	}

	static val LOGGER = Logger.getLogger(DeductionAwareResource);

	@Inject TypeMappingUtil helper

	protected volatile InitializationState initializationState = InitializationState.NOT_INITIALIZED

	new() {
		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created resource " + hashCode)
	}

//	def InitializationState getInitializationState() {
//		initializationState
//	}
//
//	override setFullyInitialized(boolean fullyInitialized) {
//		super.setFullyInitialized(fullyInitialized)
//		initializationState = fullyInitialized ? InitializationState.PRE_INDEXING : InitializationState.NOT_INITIALIZED
//	}
//
//	override installDerivedState(boolean preIndexingPhase) {
//		if (preIndexingPhase && initializationState == InitializationState.NOT_INITIALIZED) {
//			super.installDerivedState(true)
//			initializationState = isFullyInitialized ? InitializationState.PRE_INDEXING : InitializationState.
//				NOT_INITIALIZED
//		} else if (!preIndexingPhase && initializationState != InitializationState.FULLY_INITIALIZED) {
//			super.installDerivedState(false)
//			initializationState = isFullyInitialized ? InitializationState.FULLY_INITIALIZED : InitializationState.
//				NOT_INITIALIZED
//		}
//	}
//
//	override discardDerivedState() {
//		super.discardDerivedState()
//		initializationState = InitializationState.NOT_INITIALIZED
//	}
//
//	override resolveLazyCrossReferences(CancelIndicator mon) {
//		// ensure we have the full derived state before resolving cross-references:
//		installDerivedState(false)
//		super.resolveLazyCrossReferences(mon)
//	}

	/* IDeductionAwareResource */
	override deduceTargetObject(QualifiedName sourceObjectQN, EObject objectContext) {
		val descriptions = helper.getSystemTypeDescriptions(objectContext, sourceObjectQN)
		if (! descriptions.empty) {
			val systemTypeDesc = descriptions.head
			val systemType = getResourceSet.getEObject(systemTypeDesc.EObjectURI, true)

			if (LOGGER.level.isGreaterOrEqual(Level.DEBUG)) {
				LOGGER.debug(sourceObjectQN + ' -> ' + systemTypeDesc.name + ' (' + systemType + ')')
			}
			return systemType
		}
		LOGGER.debug("fragment QN = " + sourceObjectQN + ' -> ' + null)
		return null;
	}

}
