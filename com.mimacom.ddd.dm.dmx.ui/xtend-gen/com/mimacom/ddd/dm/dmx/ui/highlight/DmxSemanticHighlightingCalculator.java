package com.mimacom.ddd.dm.dmx.ui.highlight;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.dmx.ui.highlight.DmxHighlightingConfiguration;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class DmxSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  @Inject
  private OperationCanceledManager operationCanceledManager;
  
  @Override
  public boolean highlightElement(final EObject object, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    this.operationCanceledManager.checkCanceled(cancelIndicator);
    if ((object instanceof DNamedElement)) {
      this.highlightFeature(acceptor, object, BasePackage.eINSTANCE.getDNamedElement_Name(), 
        DmxHighlightingConfiguration.NAME_ID);
    } else {
      if ((object instanceof DRichText)) {
        final ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
        this.highlightNode(acceptor, node, DmxHighlightingConfiguration.RICH_TEXT_ID);
      }
    }
    return super.highlightElement(object, acceptor, cancelIndicator);
  }
  
  public void handleCaseNode(final INode n, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    acceptor.addPosition(n.getOffset(), n.getLength(), DmxHighlightingConfiguration.NAME_ID);
  }
}
