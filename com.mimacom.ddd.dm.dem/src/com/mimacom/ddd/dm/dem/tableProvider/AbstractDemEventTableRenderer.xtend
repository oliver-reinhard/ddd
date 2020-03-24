package com.mimacom.ddd.dm.dem.tableProvider

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.dm.dem.DemDomainEvent
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.serializer.ISerializer

abstract class AbstractDemEventTableRenderer implements ITableRenderer {
	
	@Inject ISerializer serializer;

	static val MAX_EXPR_LENGTH = 100

	override canRender(IDiagramRoot root) {
		if (root instanceof DemDomainEvent) {
			return root.name !== null && ! root.name.empty
		}
		return false
	}
	

	protected def String serialize(DExpression expr) {
//		try {
//			var text = serializer.serialize(expr) // throws RuntimeException
//			text = text.replaceAll("^ |[\t\n\r]", "").replaceAll("[ ]+", " ");
//			if (text.length > MAX_EXPR_LENGTH) {
//				text = text.substring(0, MAX_EXPR_LENGTH) + "..."
//			}
//			return text
//		} catch (RuntimeException ex) {
//			// ignore – the expression is temporarily inconsistent and cannot be serialised
//		}
//		return ""
		val ICompositeNode node = NodeModelUtils.findActualNodeFor(expr)
		return node !== null ? node.text : "ERROR";
	}
	}
