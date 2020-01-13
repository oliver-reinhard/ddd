package com.mimacom.ddd.pub.pub.indexing

import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.ReferenceTarget
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class PubQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	/*
	 * Qualified name of objects implementing ReferenceTarget = {Component.name, obj.name} instead of fully qualified by containment hierarchy.
	 */
	override QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof ReferenceTarget) {
			if (obj.name !== null && obj.name.length > 0) {
				val compo = EcoreUtil2.getContainerOfType(obj, Component)
				if (compo !== null && obj.name !== null) {
					val compoQN = computeFullyQualifiedName(compo)
					if (obj instanceof Component) {
						return compoQN
					} else if (compoQN !== null) {
						val rootQN = compoQN.append(obj.name)
						return rootQN
					}
					return null
				}
			}
		}
		return super.getFullyQualifiedName(obj);
	}
}
