package com.mimacom.ddd.sm.sim.scoping

import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DNamedElement
import com.mimacom.ddd.dm.base.base.DNamespace
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import com.mimacom.ddd.sm.sim.SystemInformationModel

class SimQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	static final Logger LOGGER = Logger.getLogger(SimQualifiedNameProvider);

	override QualifiedName computeFullyQualifiedName(EObject obj) {
		val qualifiedName = switch obj {
			DNamespace:
				super.computeFullyQualifiedName(obj) // namespace name is a dotted notation -> need to break up into segments
			DEntityType case obj.root:
				modelWideObject(obj)
			default:
				super.computeFullyQualifiedName(obj)
		}
		if (LOGGER.debugEnabled) {
			LOGGER.debug(qualifiedName?.toString("|") + " - " + obj)
		}
		return qualifiedName;
	}
	

	/* 
	 * Object's QN = {SInformationModel.name, obj.name} --> omit DAggregate.name from qualified name!
	 */
	protected def QualifiedName modelWideObject(DNamedElement obj) {
		if (obj.name !== null) {
			val model = EcoreUtil2.getContainerOfType(obj, SystemInformationModel)
			if (model !== null) {
				val modelQN = getOrComputeFullyQualifiedName(model)
				return modelQN.append(obj.name)
			}
		}
		return super.computeFullyQualifiedName(obj);
	}
	
}