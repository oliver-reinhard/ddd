package com.mimacom.ddd.dm.dem.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.dem.DemCaseConjunction;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.tableProvider.AbstractDemEventTableRenderer;
import com.mimacom.ddd.pub.pub.PubTableUtil;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import java.util.Arrays;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DemEventPostconditionsTableRenderer extends AbstractDemEventTableRenderer {
  private static final Logger LOGGER = Logger.getLogger(DemEventPostconditionsTableRenderer.class);
  
  @Inject
  @Extension
  private PubTableUtil _pubTableUtil;
  
  @Override
  public Table render(final IDiagramRoot root) {
    DemEventPostconditionsTableRenderer.LOGGER.info((" for " + root));
    final DemDomainEvent e = ((DemDomainEvent) root);
    final Table t = this._pubTableUtil.createTableWithHeader("Outcome", "", "Selector/Predicate", "Description");
    EList<DNamedElement> _postconditionsDNF = e.getPostconditionsDNF();
    for (final DNamedElement post : _postconditionsDNF) {
      this.postcondition(t, post);
    }
    return t;
  }
  
  protected void _postcondition(final Table t, final DNamedPredicate pred) {
    String _name = pred.getName();
    String _serialize = this.serialize(pred.getPredicate());
    this._pubTableUtil.addDescriptionRow(t, new String[] { _name, "", _serialize }, pred.getDescription());
  }
  
  protected void _postcondition(final Table t, final DemCaseConjunction conj) {
    String _name = conj.getName();
    String _xifexpression = null;
    boolean _isOtherwise = conj.isOtherwise();
    if (_isOtherwise) {
      _xifexpression = "OTHERWISE";
    } else {
      _xifexpression = this.serialize(conj.getSelector());
    }
    this._pubTableUtil.addDescriptionRow(t, new String[] { _name, "WHEN", _xifexpression }, conj.getDescription());
    boolean first = true;
    EList<DNamedPredicate> _predicates = conj.getPredicates();
    for (final DNamedPredicate pred : _predicates) {
      if (first) {
        String _name_1 = pred.getName();
        String _serialize = this.serialize(pred.getPredicate());
        final TableRow row = this._pubTableUtil.addDescriptionRow(t, new String[] { "", _name_1, _serialize }, pred.getDescription());
        TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
        _head.setHeight(((Object[])Conversions.unwrapArray(conj.getPredicates(), Object.class)).length);
        first = false;
      } else {
        String _name_2 = pred.getName();
        String _serialize_1 = this.serialize(pred.getPredicate());
        this._pubTableUtil.addDescriptionRow(t, new String[] { PubTableUtil.IGNORE_TABLE_CELL, _name_2, _serialize_1 }, pred.getDescription());
      }
    }
  }
  
  protected void postcondition(final Table t, final DNamedElement pred) {
    if (pred instanceof DNamedPredicate) {
      _postcondition(t, (DNamedPredicate)pred);
      return;
    } else if (pred instanceof DemCaseConjunction) {
      _postcondition(t, (DemCaseConjunction)pred);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t, pred).toString());
    }
  }
}
