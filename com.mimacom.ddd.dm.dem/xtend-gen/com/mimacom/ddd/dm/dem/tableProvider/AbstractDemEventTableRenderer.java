package com.mimacom.ddd.dm.dem.tableProvider;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

@SuppressWarnings("all")
public abstract class AbstractDemEventTableRenderer implements ITableRenderer {
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
    return _xifexpression;
  }
}
