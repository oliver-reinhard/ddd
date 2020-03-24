package com.mimacom.ddd.dm.dem.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.TypesUtil;
import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dem.tableProvider.AbstractDemEventTableRenderer;
import com.mimacom.ddd.pub.pub.PubTableUtil;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DemEventHeaderTableRenderer extends AbstractDemEventTableRenderer {
  private static final Logger LOGGER = Logger.getLogger(DemEventHeaderTableRenderer.class);
  
  @Inject
  @Extension
  private TypesUtil _typesUtil;
  
  @Inject
  @Extension
  private PubTableUtil _pubTableUtil;
  
  @Override
  public Table render(final IDiagramRoot root) {
    DemEventHeaderTableRenderer.LOGGER.info((" for " + root));
    final DemDomainEvent e = ((DemDomainEvent) root);
    final Table t = this._pubTableUtil.createTableWithHeader("Element", "Name", "Type", "Description");
    String _name = e.getName();
    this._pubTableUtil.addDescriptionRow(t, new String[] { "Event", _name, "" }, e.getDescription());
    this.renderContext(t, e);
    this.renderTriggers(t, e);
    this.renderNotifications(t, e);
    return t;
  }
  
  protected void renderContext(final Table t, final DemDomainEvent e) {
    boolean first = true;
    EList<DContext> _context = e.getContext();
    for (final DContext c : _context) {
      if (first) {
        String _name = c.getName();
        String _describeType = this._typesUtil.describeType(c);
        final TableRow row = this._pubTableUtil.addDescriptionRow(t, new String[] { "Context", _name, _describeType }, c.getDescription());
        TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
        _head.setHeight(((Object[])Conversions.unwrapArray(e.getContext(), Object.class)).length);
        first = false;
      } else {
        String _name_1 = c.getName();
        String _describeType_1 = this._typesUtil.describeType(c);
        this._pubTableUtil.addDescriptionRow(t, new String[] { PubTableUtil.IGNORE_TABLE_CELL, _name_1, _describeType_1 }, c.getDescription());
      }
    }
  }
  
  protected void renderTriggers(final Table t, final DemDomainEvent e) {
    boolean first = true;
    EList<DemActor> _triggers = e.getTriggers();
    for (final DemActor trigger : _triggers) {
      if (first) {
        String _name = trigger.getName();
        final TableRow row = this._pubTableUtil.addDescriptionRow(t, new String[] { "Triggers", _name, "" }, trigger.getDescription());
        TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
        _head.setHeight(((Object[])Conversions.unwrapArray(e.getTriggers(), Object.class)).length);
        first = false;
      } else {
        String _name_1 = trigger.getName();
        String _describeType = this._typesUtil.describeType(trigger);
        this._pubTableUtil.addDescriptionRow(t, new String[] { PubTableUtil.IGNORE_TABLE_CELL, _name_1, _describeType }, trigger.getDescription());
      }
    }
  }
  
  protected void renderNotifications(final Table t, final DemDomainEvent e) {
    boolean first = true;
    EList<DemNotification> _notifications = e.getNotifications();
    for (final DemNotification n : _notifications) {
      if (first) {
        String _name = n.getName();
        String _describeType = this._typesUtil.describeType(n.getMessage());
        final TableRow row = this._pubTableUtil.addDescriptionRow(t, new String[] { "Notifications", _name, _describeType }, n.getDescription());
        TableCell _head = IterableExtensions.<TableCell>head(row.getCells());
        _head.setHeight(((Object[])Conversions.unwrapArray(e.getNotifications(), Object.class)).length);
        first = false;
      } else {
        String _name_1 = n.getName();
        String _describeType_1 = this._typesUtil.describeType(n);
        this._pubTableUtil.addDescriptionRow(t, new String[] { PubTableUtil.IGNORE_TABLE_CELL, _name_1, _describeType_1 }, n.getDescription());
      }
    }
  }
}
