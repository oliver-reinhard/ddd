package com.mimacom.ddd.dm.dem.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.TypesUtil;
import com.mimacom.ddd.dm.base.base.DContext;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.richText.RichTextUtil;
import com.mimacom.ddd.dm.base.styledText.StyledTextUtil;
import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemCaseConjunction;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemNotification;
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
public class DemEventTableRenderer extends AbstractDemEventTableRenderer {
  private static final Logger LOGGER = Logger.getLogger(DemEventTableRenderer.class);
  
  @Inject
  @Extension
  private TypesUtil _typesUtil;
  
  @Inject
  @Extension
  private StyledTextUtil _styledTextUtil;
  
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
  @Inject
  @Extension
  private PubTableUtil _pubTableUtil;
  
  @Override
  public Table render(final IDiagramRoot root) {
    DemEventTableRenderer.LOGGER.info((" for " + root));
    final DemDomainEvent e = ((DemDomainEvent) root);
    final Table t = this._pubTableUtil.createTableWithHeader("Compartment", "Name", "Type/Predicate", "Description");
    String _strong = this._styledTextUtil.strong("Event");
    String _name = e.getName();
    this._pubTableUtil.addStyledTextRowWithDescription(t, new String[] { _strong, _name, "" }, e.getDescription());
    this.renderContext(t, e);
    this.renderTriggers(t, e);
    this.renderNotifications(t, e);
    this.renderPreconditions(t, e);
    this.renderPostconditions(t, e);
    return t;
  }
  
  protected void renderContext(final Table t, final DemDomainEvent e) {
    boolean firstRow = true;
    EList<DContext> _context = e.getContext();
    for (final DContext c : _context) {
      {
        String _xifexpression = null;
        if (firstRow) {
          _xifexpression = this._styledTextUtil.strong("Context");
        } else {
          _xifexpression = PubTableUtil.IGNORE_TABLE_CELL;
        }
        final String firstColValue = _xifexpression;
        String _keyword = this._styledTextUtil.keyword(c.getName());
        String _describeType = this._typesUtil.describeType(c);
        final TableRow row = this._pubTableUtil.addStyledTextRowWithDescription(t, new String[] { firstColValue, _keyword, _describeType }, c.getDescription());
        if (firstRow) {
          TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
          _head.setHeight(((Object[])Conversions.unwrapArray(e.getContext(), Object.class)).length);
          firstRow = false;
        }
      }
    }
  }
  
  protected void renderTriggers(final Table t, final DemDomainEvent e) {
    boolean firstRow = true;
    EList<DemActor> _triggers = e.getTriggers();
    for (final DemActor trigger : _triggers) {
      {
        String _xifexpression = null;
        if (firstRow) {
          _xifexpression = this._styledTextUtil.strong("Triggers");
        } else {
          _xifexpression = PubTableUtil.IGNORE_TABLE_CELL;
        }
        final String firstColValue = _xifexpression;
        String _name = trigger.getName();
        final TableRow row = this._pubTableUtil.addStyledTextRowWithDescription(t, new String[] { firstColValue, _name, "" }, trigger.getDescription());
        if (firstRow) {
          TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
          _head.setHeight(((Object[])Conversions.unwrapArray(e.getTriggers(), Object.class)).length);
          firstRow = false;
        }
      }
    }
  }
  
  protected void renderNotifications(final Table t, final DemDomainEvent e) {
    boolean firstRow = true;
    EList<DemNotification> _notifications = e.getNotifications();
    for (final DemNotification n : _notifications) {
      {
        String _xifexpression = null;
        if (firstRow) {
          _xifexpression = this._styledTextUtil.strong("Notifications");
        } else {
          _xifexpression = PubTableUtil.IGNORE_TABLE_CELL;
        }
        final String firstColValue = _xifexpression;
        String _name = n.getName();
        String _describeType = this._typesUtil.describeType(n.getMessage());
        final TableRow row = this._pubTableUtil.addStyledTextRowWithDescription(t, new String[] { firstColValue, _name, _describeType }, n.getDescription());
        if (firstRow) {
          TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
          _head.setHeight(((Object[])Conversions.unwrapArray(e.getNotifications(), Object.class)).length);
          firstRow = false;
        }
      }
    }
  }
  
  protected void renderPreconditions(final Table t, final DemDomainEvent e) {
    boolean firstRow = true;
    EList<DNamedPredicate> _preconditionsCNF = e.getPreconditionsCNF();
    for (final DNamedPredicate pre : _preconditionsCNF) {
      {
        String _xifexpression = null;
        if (firstRow) {
          _xifexpression = this._styledTextUtil.strong("Preconditions");
        } else {
          _xifexpression = PubTableUtil.IGNORE_TABLE_CELL;
        }
        final String firstColValue = _xifexpression;
        String _name = pre.getName();
        final TableRow row = this._pubTableUtil.addStyledTextRowWithDescription(t, new String[] { firstColValue, _name, "" }, this.ensureNotEmpty(pre.getDescription()));
        if (firstRow) {
          TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
          _head.setHeight(((Object[])Conversions.unwrapArray(e.getNotifications(), Object.class)).length);
          firstRow = false;
        }
      }
    }
  }
  
  protected void renderPostconditions(final Table t, final DemDomainEvent e) {
    int tableLines = ((Object[])Conversions.unwrapArray(e.getPostconditionsDNF(), Object.class)).length;
    EList<DNamedElement> _postconditionsDNF = e.getPostconditionsDNF();
    for (final DNamedElement post : _postconditionsDNF) {
      if ((post instanceof DemCaseConjunction)) {
        int _length = ((Object[])Conversions.unwrapArray(((DemCaseConjunction)post).getPredicates(), Object.class)).length;
        int _plus = (tableLines + _length);
        tableLines = _plus;
      }
    }
    boolean firstRow = true;
    EList<DNamedElement> _postconditionsDNF_1 = e.getPostconditionsDNF();
    for (final DNamedElement post_1 : _postconditionsDNF_1) {
      {
        this.postcondition(t, post_1, firstRow, tableLines);
        firstRow = false;
      }
    }
  }
  
  protected void _postcondition(final Table t, final DNamedPredicate pred, final boolean firstRow, final int vspan) {
    String _xifexpression = null;
    if (firstRow) {
      _xifexpression = this._styledTextUtil.strong("Postconditions");
    } else {
      _xifexpression = PubTableUtil.IGNORE_TABLE_CELL;
    }
    final String firstColValue = _xifexpression;
    String _name = pred.getName();
    final TableRow row = this._pubTableUtil.addStyledTextRowWithDescription(t, new String[] { firstColValue, _name, "" }, 
      this.ensureNotEmpty(pred.getDescription()));
    if (firstRow) {
      TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
      _head.setHeight(vspan);
    }
  }
  
  protected void _postcondition(final Table t, final DemCaseConjunction conj, final boolean firstConjuction, final int vspan) {
    String _xifexpression = null;
    if (firstConjuction) {
      _xifexpression = this._styledTextUtil.strong("Postconditions");
    } else {
      _xifexpression = PubTableUtil.IGNORE_TABLE_CELL;
    }
    final String firstColValue = _xifexpression;
    String _name = conj.getName();
    String _xifexpression_1 = null;
    boolean _isOtherwise = conj.isOtherwise();
    if (_isOtherwise) {
      _xifexpression_1 = "OTHERWISE";
    } else {
      _xifexpression_1 = "WHEN";
    }
    String _emphasis = this._styledTextUtil.emphasis(_xifexpression_1);
    final TableRow row = this._pubTableUtil.addStyledTextRowWithDescription(t, 
      new String[] { firstColValue, _name, _emphasis }, this.ensureNotEmpty(conj.getDescription()));
    if (firstConjuction) {
      TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
      _head.setHeight(vspan);
    }
    boolean firstPredicate = true;
    EList<DNamedPredicate> _predicates = conj.getPredicates();
    for (final DNamedPredicate pred : _predicates) {
      {
        String _xifexpression_2 = null;
        if (firstPredicate) {
          _xifexpression_2 = "";
        } else {
          _xifexpression_2 = PubTableUtil.IGNORE_TABLE_CELL;
        }
        final String secondColValue = _xifexpression_2;
        String _name_1 = pred.getName();
        final TableRow predRow = this._pubTableUtil.addRowWithDescription(t, new String[] { PubTableUtil.IGNORE_TABLE_CELL, secondColValue, _name_1 }, this.ensureNotEmpty(pred.getDescription()));
        if (firstPredicate) {
          TableCell _head_1 = IterableExtensions.<TableCell>head(predRow.getCells());
          _head_1.setHeight(((Object[])Conversions.unwrapArray(conj.getPredicates(), Object.class)).length);
          firstPredicate = false;
        }
      }
    }
  }
  
  protected DRichText ensureNotEmpty(final DRichText text) {
    DRichText _xifexpression = null;
    boolean _isEmpty = this._richTextUtil.isEmpty(text);
    if (_isEmpty) {
      _xifexpression = this._richTextUtil.toRichText("* * TO DO * *");
    } else {
      _xifexpression = text;
    }
    return _xifexpression;
  }
  
  protected void postcondition(final Table t, final DNamedElement pred, final boolean firstRow, final int vspan) {
    if (pred instanceof DNamedPredicate) {
      _postcondition(t, (DNamedPredicate)pred, firstRow, vspan);
      return;
    } else if (pred instanceof DemCaseConjunction) {
      _postcondition(t, (DemCaseConjunction)pred, firstRow, vspan);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t, pred, firstRow, vspan).toString());
    }
  }
}
