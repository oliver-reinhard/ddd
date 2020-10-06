package com.mimacom.ddd.dm.dem.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.base.IDiagramRoot
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.pub.pub.generator.CodeListingFormatter
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

abstract class AbstractDemEventTableRenderer implements ITableRenderer {

	@Inject extension CodeListingFormatter
	
	override canRender(IDiagramRoot root) {
		if (root instanceof DemDomainEvent) {
			return root.name !== null && ! root.name.empty
		}
		return false
	}

	protected def String sourceCode(DExpression expr) {
		val ICompositeNode node = NodeModelUtils.findActualNodeFor(expr)
		val raw = node !== null ? node.text : "ERROR"
		val formatted = raw.trimBlankLines.outdent(2)
		return formatted
	}
}
