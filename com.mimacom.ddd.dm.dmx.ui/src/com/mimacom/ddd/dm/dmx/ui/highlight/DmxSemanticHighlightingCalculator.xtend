package com.mimacom.ddd.dm.dmx.ui.highlight

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DNamedElement
import com.mimacom.ddd.dm.base.base.DRichText
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator

class DmxSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

//	@Inject
//	DemGrammarAccess ga;
	@Inject
	OperationCanceledManager operationCanceledManager;

	override boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {
		operationCanceledManager.checkCanceled(cancelIndicator);
		if (object instanceof DNamedElement) {
//			val ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
//			handleCaseNode(node, acceptor, cancelIndicator);
			highlightFeature(acceptor, object, BasePackage.eINSTANCE.DNamedElement_Name,
				DmxHighlightingConfiguration.NAME_ID)
		} else if (object instanceof DRichText) {
			val ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
			highlightNode(acceptor, node, DmxHighlightingConfiguration.RICH_TEXT_ID)
		}
		return super.highlightElement(object, acceptor, cancelIndicator);
	}

	def handleCaseNode(INode n, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		acceptor.addPosition(n.getOffset(), n.getLength(), DmxHighlightingConfiguration.NAME_ID);
//		val BidiTreeIterable<INode> iterable = n.getAsTreeIterable();
//		for (INode nx : iterable) {
//			operationCanceledManager.checkCanceled(cancelIndicator);
//			val EObject grammarElement = nx.getGrammarElement();
//			if (grammarElement instanceof RuleCall) {
//				if (ga.getGlobalPathRule() == ((RuleCall) grammarElement).getRule()) {
//					acceptor.addPosition(nx.getOffset(), nx.getLength(), HighlightingStyles.KEYWORD_ID);
//				}
//			}
//		}
	}

}
