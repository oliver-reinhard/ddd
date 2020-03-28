package com.mimacom.ddd.dm.dem.tableProvider

import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

abstract class AbstractDemEventTableRenderer implements ITableRenderer {

	override canRender(IDiagramRoot root) {
		if (root instanceof DemDomainEvent) {
			return root.name !== null && ! root.name.empty
		}
		return false
	}

	protected def String sourceCode(DExpression expr) {
		val ICompositeNode node = NodeModelUtils.findActualNodeFor(expr)
		return node !== null ? node.text : "ERROR";
	}
}
