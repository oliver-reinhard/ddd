package com.mimacom.ddd.pub.pub.indexing

import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.ReferenceTarget
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class PubQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	static final Logger LOGGER = Logger.getLogger(PubQualifiedNameProvider);

	override QualifiedName computeFullyQualifiedName(EObject obj) {
		val qualifiedName = switch obj {
			Component:
				super.computeFullyQualifiedName(obj)
			ReferenceTarget: {
				componentWideObject(obj)
			}
			default:
				return super.computeFullyQualifiedName(obj)
		}
		if (LOGGER.infoEnabled) {
			LOGGER.info(qualifiedName?.toString("|") + " - " + obj)
		}
		return qualifiedName
	}

	/*
	 * Qualified name of objects implementing ReferenceTarget = {Component.name, obj.name} instead of fully qualified by containment hierarchy.
	 */
	protected def QualifiedName componentWideObject(ReferenceTarget obj) {
		if (obj.name !== null && obj.name.length > 0) {
			val compo = EcoreUtil2.getContainerOfType(obj, Component)
			if (compo !== null) {
				val compoQN = getOrComputeFullyQualifiedName(compo)
				return compoQN.append(obj.name)
			}
		}
		return super.computeFullyQualifiedName(obj);
	}
}
