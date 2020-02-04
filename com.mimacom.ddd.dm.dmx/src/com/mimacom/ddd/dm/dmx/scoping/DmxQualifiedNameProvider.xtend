package com.mimacom.ddd.dm.dmx.scoping

import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DInformationModel
import com.mimacom.ddd.dm.base.DNamedElement
import com.mimacom.ddd.dm.base.DNamespace
import com.mimacom.ddd.dm.base.DType
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class DmxQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	static final Logger LOGGER = Logger.getLogger(DmxQualifiedNameProvider);

	override QualifiedName computeFullyQualifiedName(EObject obj) {
		val qualifiedName = switch obj {
			DNamespace:
				super.computeFullyQualifiedName(obj) // namespace name is a dotted notation -> need to break up into segments
			DType case obj.eContainer instanceof DInformationModel:
				namespaceWideObject(obj)
			DAggregate:
				namespaceWideObject(obj)
			DEntityType case obj.root:
				namespaceWideObject(obj)
			default:
				super.computeFullyQualifiedName(obj)
		}
		if (LOGGER.infoEnabled) {
			LOGGER.info(qualifiedName?.toString("|") + " - " + obj)
		}
		return qualifiedName;
	}

	/* 
	 * Object's QN = {DNamespace.name, obj.name} --> omit DInformationModel.name from qualified name!
	 */
	protected def QualifiedName namespaceWideObject(DNamedElement obj) {
		if (obj.name !== null) {
			val namespace = EcoreUtil2.getContainerOfType(obj, DNamespace)
			if (namespace !== null) {
				val nsQN = getOrComputeFullyQualifiedName(namespace)
				return nsQN.append(obj.name)
			}
		}
		return super.computeFullyQualifiedName(obj);
	}
}
