package com.mimacom.ddd.sm.sim.indexing

import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.synthetic.TSyntheticType
import com.mimacom.ddd.dm.base.transpose.ITransposition
import com.mimacom.ddd.dm.base.transpose.TranspositionUtil
import com.mimacom.ddd.dm.dmx.indexing.DmxResourceDescriptionStrategy
import com.mimacom.ddd.sm.sim.SystemInformationModel
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
		if (obj instanceof TSyntheticType) {
			if (obj.recipe !== null) {
				val source = obj.recipe.getRule.getSource
				if (source instanceof DType) {
					// create custom index entry with reference to source
					return createTTypeTranspositionDescription(obj, source, acceptor)
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
	def boolean createTTypeTranspositionDescription(TSyntheticType typeToIndex, DType source,
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
					val recipe = typeToIndex.recipe
					val model = EcoreUtil2.getContainerOfType(recipe, SystemInformationModel)
					val typeMappingType = model.indexingHelper
					val userData = TranspositionUtil.createEObjectDescriptionUserData(targetQN)
					val sourceQNForIndex = TranspositionUtil.getTranspositionSourceQNForIndex(sourceQN)
					val mappingDesc = EObjectDescription.create(sourceQNForIndex, typeMappingType, userData)
					acceptor.accept(mappingDesc);

					if (LOGGER.debugEnabled) {
						LOGGER.debug(
							"OBJ " + recipe.eResource.URI.path + " - " + sourceQNForIndex + ": " +
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
