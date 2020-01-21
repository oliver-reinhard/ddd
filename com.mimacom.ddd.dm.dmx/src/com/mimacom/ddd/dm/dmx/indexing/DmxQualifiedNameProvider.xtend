package com.mimacom.ddd.dm.dmx.indexing

import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DNamespace
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

class DmxQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	/*
	 * Qualified name of root entity types = {Domain.name, type.name} instead of fully qualified by containment hierarchy including Aggregate.
	 */
	override QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof DEntityType) {
			if (obj.root) {
				val domain = EcoreUtil2.getContainerOfType(obj, DNamespace)
				if (domain !== null && obj.name !== null) {
					val domainQN = computeFullyQualifiedName(domain)
					val rootQN = domainQN.append(obj.name)
					return rootQN
				}
			}
		}
		return super.getFullyQualifiedName(obj);
	}
}
