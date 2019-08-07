package com.mimacom.ddd.dm.dem.ui.highlighting

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DNamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.service.OperationCanceledManager
import org.eclipse.xtext.util.CancelIndicator

class DemSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

//	@Inject
//	DemGrammarAccess ga;

	@Inject
	OperationCanceledManager operationCanceledManager;

	override boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		operationCanceledManager.checkCanceled(cancelIndicator);
		if (object instanceof DNamedElement) {
//			val ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
//			handleCaseNode(node, acceptor, cancelIndicator);
			highlightFeature(acceptor, object, BasePackage.eINSTANCE.DNamedElement_Name, DemHighlightingConfiguration.NAME_ID)
		}
		return super.highlightElement(object, acceptor, cancelIndicator);
	}

	def handleCaseNode(INode n, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		acceptor.addPosition(n.getOffset(), n.getLength(), DemHighlightingConfiguration.NAME_ID);
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
