package com.mimacom.ddd.dm.dem.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.pub.pub.generator.CodeListingFormatter;
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public abstract class AbstractDemEventTableRenderer implements ITableRenderer {
  @Inject
  @Extension
  private CodeListingFormatter _codeListingFormatter;
  
  @Override
  public boolean canRender(final IDiagramRoot root) {
    if ((root instanceof DemDomainEvent)) {
      return ((((DemDomainEvent)root).getName() != null) && (!((DemDomainEvent)root).getName().isEmpty()));
    }
    return false;
  }
  
  protected String sourceCode(final DExpression expr) {
    final ICompositeNode node = NodeModelUtils.findActualNodeFor(expr);
    String _xifexpression = null;
    if ((node != null)) {
      _xifexpression = node.getText();
    } else {
      _xifexpression = "ERROR";
    }
    final String raw = _xifexpression;
    final String formatted = this._codeListingFormatter.outdent(this._codeListingFormatter.trimBlankLines(raw), 2);
    return formatted;
  }
}
