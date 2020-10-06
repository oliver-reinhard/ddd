package com.mimacom.ddd.sm.sim.indexing

import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.ITransposition
import com.mimacom.ddd.dm.base.transpose.TransposeUtil
import com.mimacom.ddd.dm.dmx.indexing.DmxResourceDescriptionStrategy
import com.mimacom.ddd.sm.sim.SInformationModel
import org.apache.log4j.Level
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription
import org.eclipse.xtext.util.IAcceptor

@Singleton
class SimResourceDescriptionStrategy extends DmxResourceDescriptionStrategy {
//	protected static val LOGGER = Logger.getLogger(SimResourceDescriptionStrategy)

	new() {
		LOGGER.level = Level.DEBUG
	}

	/*
	 * Prevents indexing of deduction rules and creates custom index entries for synthetic types
	 */
	override boolean createEObjectDescriptions(EObject obj, IAcceptor<IEObjectDescription> acceptor) {
		if (obj instanceof ITransposition) {
			// Don't index IDeductionDefinition and its children
			return false // don't index child objects either
		}
		if (obj instanceof DType) {
			if (obj.isSynthetic && obj.getTransposedBy !== null) {
				val source = obj.getTransposedBy.getTranspositionRule.getSource
				if (source instanceof DType) {
					// create custom index entry with reference to source
					return createSTypeDeductionDescription(obj, source, acceptor)
				}
			}
		}
//		if (obj.eResource !== null) {
//			val model = obj.eResource.contents.head
//			if (model instanceof SInformationModel) {
//				if (model.deduced) {
//					return false
//				}
//			}
//		}
		return super.createEObjectDescriptions(obj, acceptor);
	}

	// Adapted copy of DefaultResourceDescriptionStrategy.createEObjectDescriptions(obj, acceptor)
	def boolean createSTypeDeductionDescription(DType typeToIndex, DType source,
		IAcceptor<IEObjectDescription> acceptor) {
		val qnp = getQualifiedNameProvider()
		if (qnp === null)
			return false;
		try {
			val targetQN = qnp.getFullyQualifiedName(typeToIndex);
			if (targetQN !== null) {

				// create target description
				var IEObjectDescription targetDesc = EObjectDescription.create(targetQN, typeToIndex)
				acceptor.accept(targetDesc);

				if (LOGGER.debugEnabled) {
					LOGGER.debug(
						"OBJ " + typeToIndex.eResource.URI.path + " - " + targetQN + ": " + typeToIndex.eClass.name)
				}

				// create mapping description:
				val sourceQN = qnp.getFullyQualifiedName(source);
				if (sourceQN !== null) {
					val deduction = typeToIndex.getTransposedBy
					val model = EcoreUtil2.getContainerOfType(deduction, SInformationModel)
					val typeMappingType = model.indexingHelper
					val userData = TransposeUtil.createEObjectDescriptionUserData(targetQN)
					val sourceQNForIndex = TransposeUtil.getDeductionSourceQNForIndex(sourceQN)
					val mappingDesc = EObjectDescription.create(sourceQNForIndex, typeMappingType, userData)
					acceptor.accept(mappingDesc);

					if (LOGGER.debugEnabled) {
						LOGGER.debug(
							"OBJ " + deduction.eResource.URI.path + " - " + sourceQNForIndex + ": " +
								typeMappingType.eClass.name + " -> " + targetQN)
					}
				}
			}
		} catch (Exception exc) {
			LOGGER.error(exc.getMessage(), exc);
		}
		return true;
	}

	override boolean createReferenceDescriptions(EObject from, URI exportedContainerURI,
		IAcceptor<IReferenceDescription> acceptor) {
		if (from instanceof ITransposition) {
			// Don't index IDeductionDefinition
			return true // do index references of IDedctionRule children to domain model
		}
		super.createReferenceDescriptions(from, exportedContainerURI, acceptor)
	}

	override protected IReferenceDescription createReferenceDescription(EObject owner, URI exportedContainerURI,
		EReference eReference, int indexInList, EObject target) {
		val refDesc = super.createReferenceDescription(owner, exportedContainerURI, eReference, indexInList, target)

		if (LOGGER.debugEnabled) {
			LOGGER.debug("REF " + exportedContainerURI.path + " - " + owner + " -> " + target.class.simpleName + ":" +
				refDesc.targetEObjectUri)
		}
		return refDesc
	}

}
