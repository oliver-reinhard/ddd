package com.mimacom.ddd.sm.sim.indexing

import com.google.common.collect.Maps
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.IDeductionDefinition
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

@Singleton
class SimResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	static val LOGGER = Logger.getLogger(SimResourceDescriptionStrategy);
	public static val KEY_DEDUCED_FROM = "deducedFrom"
	
	/*
	 * Prevents indexing of deduction rules and creates custom index entries for synthetic types
	 */
	override boolean createEObjectDescriptions(EObject obj, IAcceptor<IEObjectDescription> acceptor) {
		if (obj instanceof IDeductionDefinition) {
			// Don't index
			return false
		}
		if (obj instanceof DType) {
			if (obj.synthetic) {
				val typeToIndex = obj
				val source = typeToIndex.deductionDefinition.deductionRule.source
				if (source instanceof DType) {
					// create custom index entry with reference to source
					return createDTypeDescription(typeToIndex, source, acceptor)
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
   def boolean createDTypeDescription(DType typeToIndex, DType source, IAcceptor<IEObjectDescription> acceptor) {
		val qnp = getQualifiedNameProvider()
		if (qnp === null)
			return false;
		try {
			val tQualifiedName = qnp.getFullyQualifiedName(typeToIndex);
			if (tQualifiedName !== null) {
				val sQualifiedName = qnp.getFullyQualifiedName(source);
				if (sQualifiedName !== null) {
					val userData = Maps.newHashMap
					userData.put(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM, sQualifiedName.toString)
					acceptor.accept(EObjectDescription.create(tQualifiedName, typeToIndex, userData));
				}  else {
					acceptor.accept(EObjectDescription.create(tQualifiedName, typeToIndex));
				}
			}
		} catch (Exception exc) {
			LOGGER.error(exc.getMessage(), exc);
		}
		return true;
	}
}