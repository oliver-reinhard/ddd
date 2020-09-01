package com.mimacom.ddd.sm.sim.derivedState

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.modelDeduction.IDeductionAwareResource
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.DerivedStateAwareResource

class DeductionAwareResource extends DerivedStateAwareResource implements IDeductionAwareResource {

	static val LOGGER = Logger.getLogger(DeductionAwareResource);

	@Inject TransformationContext helper

	new() {
		LOGGER.level = Level.DEBUG
		LOGGER.debug("Created resource " + hashCode)
	}

//	override getEObject(URI uri, boolean loadOnDemand) {
//		val fragment = uri.fragment
//		if (fragment === null || ! fragment.startsWith(TransformationContext.FRAGMENT_PREFIX)) {
//			return super.getEObject(uri, loadOnDemand)
//		}
//		val domainTypeQN = fragment.substring(TransformationContext.FRAGMENT_PREFIX.length)
//
//		val resource = getResource(uri.trimFragment(), loadOnDemand);
//		if (resource !== null && ! resource.contents.empty) {
//			val descriptions = helper.getSystemTypeDescriptions(resource.contents.head,
//				QualifiedName.create(domainTypeQN))
//			if (! descriptions.empty) {
//				val systemTypeDesc = descriptions.head
//				val systemType = super.getEObject(systemTypeDesc.EObjectURI, loadOnDemand)
//
//				if (LOGGER.level == Level.DEBUG) {
//					LOGGER.debug(domainTypeQN + ' -> ' + systemTypeDesc.name + ' (' + systemType + ')')
//				}
//				return systemType
//			}
//		}
//		LOGGER.debug("fragment QN = " + domainTypeQN + ' -> ' + null)
//		return null;
//	}
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
