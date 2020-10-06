package com.mimacom.ddd.dm.dem.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.styledText.StyledTextUtil;
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
  private StyledTextUtil _styledTextUtil;
  
  @Inject
  @Extension
  private PubTableUtil _pubTableUtil;
  
  @Override
  public Table render(final IDiagramRoot root) {
    DemEventPostconditionsTableRenderer.LOGGER.info((" for " + root));
    final DemDomainEvent e = ((DemDomainEvent) root);
    final Table t = this._pubTableUtil.createTableWithHeader("Outcome", "Postcondition", "Selector/Predicate");
    EList<DNamedElement> _postconditionsDNF = e.getPostconditionsDNF();
    for (final DNamedElement post : _postconditionsDNF) {
      this.postcondition(t, post);
    }
    return t;
  }
  
  protected void _postcondition(final Table t, final DNamedPredicate pred) {
    final String predSourceCode = this.sourceCode(pred.getPredicate());
    String _name = pred.getName();
    this._pubTableUtil.addRowWithDescription(t, new String[] { _name, "", predSourceCode }, pred.getDescription());
  }
  
  protected void _postcondition(final Table t, final DemCaseConjunction conj) {
    final String selectorSourceCode = this.sourceCode(conj.getSelector());
    String _name = conj.getName();
    String _xifexpression = null;
    boolean _isOtherwise = conj.isOtherwise();
    if (_isOtherwise) {
      _xifexpression = "OTHERWISE";
    } else {
      _xifexpression = "WHEN";
    }
    String _monospace = this._styledTextUtil.monospace(selectorSourceCode);
    this._pubTableUtil.addStyledTextRow(t, new String[] { _name, _xifexpression, _monospace });
    boolean firstPredicate = true;
    EList<DNamedPredicate> _predicates = conj.getPredicates();
    for (final DNamedPredicate pred : _predicates) {
      {
        String _xifexpression_1 = null;
        if (firstPredicate) {
          _xifexpression_1 = "";
        } else {
          _xifexpression_1 = PubTableUtil.IGNORE_TABLE_CELL;
        }
        final String firstColValue = _xifexpression_1;
        final String predSourceCode = this.sourceCode(pred.getPredicate());
        String _name_1 = pred.getName();
        String _monospace_1 = this._styledTextUtil.monospace(predSourceCode);
        final TableRow predRow = this._pubTableUtil.addStyledTextRow(t, new String[] { firstColValue, _name_1, _monospace_1 });
        if (firstPredicate) {
          TableCell _head = IterableExtensions.<TableCell>head(predRow.getCells());
          _head.setHeight(((Object[])Conversions.unwrapArray(conj.getPredicates(), Object.class)).length);
          firstPredicate = false;
        }
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
