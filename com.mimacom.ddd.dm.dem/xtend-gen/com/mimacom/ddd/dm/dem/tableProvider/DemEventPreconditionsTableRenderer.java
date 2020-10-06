package com.mimacom.ddd.dm.dem.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.styledText.StyledTextUtil;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.tableProvider.AbstractDemEventTableRenderer;
import com.mimacom.ddd.pub.pub.PubTableUtil;
import com.mimacom.ddd.pub.pub.Table;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DemEventPreconditionsTableRenderer extends AbstractDemEventTableRenderer {
  private static final Logger LOGGER = Logger.getLogger(DemEventPreconditionsTableRenderer.class);
  
  @Inject
  @Extension
  private StyledTextUtil _styledTextUtil;
  
  @Inject
  @Extension
  private PubTableUtil _pubTableUtil;
  
  @Override
  public Table render(final IDiagramRoot root) {
    DemEventPreconditionsTableRenderer.LOGGER.info((" for " + root));
    final DemDomainEvent e = ((DemDomainEvent) root);
    final Table t = this._pubTableUtil.createTableWithHeader("Precondition", "Predicate");
    EList<DNamedPredicate> _preconditionsCNF = e.getPreconditionsCNF();
    for (final DNamedPredicate pre : _preconditionsCNF) {
      {
        String sourceCode = this.sourceCode(pre.getPredicate());
        String _name = pre.getName();
        String _monospace = this._styledTextUtil.monospace(sourceCode);
        this._pubTableUtil.addStyledTextRow(t, new String[] { _name, _monospace });
      }
    }
    return t;
  }
}
