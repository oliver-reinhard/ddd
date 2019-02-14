package com.mimacom.ddd.sm.sim.indexing

import com.google.common.collect.Maps
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.sm.sim.SDeducibleElement
import com.mimacom.ddd.sm.sim.SType
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

import static com.mimacom.ddd.sm.sim.SElementNature.*

@Singleton
class SimResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	static val LOGGER = Logger.getLogger(SimResourceDescriptionStrategy);
	public static val KEY_DEDUCED_FROM = "deducedFrom"
	
	/*
	 * Prevents indexing of deduction rules and of information models with attribute deduced = true
	 */
	override boolean createEObjectDescriptions(EObject obj, IAcceptor<IEObjectDescription> acceptor) {
		if (obj instanceof SType) {
			if (obj.nature == SYNTHETIC && obj.deductionRule !== null) {
				val source = obj.deductionRule.source
				if (source instanceof DType) {
					return createSTypeDescription(obj, source, acceptor)
				}
			}
		}
		if (obj instanceof SDeducibleElement) {
			if (obj.nature == DEDUCTION_RULE) {
				return false
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
	
	// Adapted copy of DefaultResourceDescriptionStrategy.createSTypeDescription(obj, acceptor)
   def boolean createSTypeDescription(SType type, DType source, IAcceptor<IEObjectDescription> acceptor) {
		val qnp = getQualifiedNameProvider()
		if (qnp === null)
			return false;
		try {
			val sQualifiedName = qnp.getFullyQualifiedName(type);
			val dQualifiedName = qnp.getFullyQualifiedName(source);
			if (sQualifiedName !== null) {
				if (dQualifiedName !== null) {
					val userData = Maps.newHashMap
					userData.put(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM, dQualifiedName.toString)
					acceptor.accept(EObjectDescription.create(sQualifiedName, type, userData));
				}  else {
					acceptor.accept(EObjectDescription.create(sQualifiedName, type));
				}
			}
		} catch (Exception exc) {
			LOGGER.error(exc.getMessage(), exc);
		}
		return true;
	}
}