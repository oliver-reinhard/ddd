package com.mimacom.ddd.dm.dim.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DInformationModel;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.pub.pub.PubTableUtil;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DimAllTypesTableRenderer implements ITableRenderer {
  private static final Logger LOGGER = Logger.getLogger(DimAllTypesTableRenderer.class);
  
  @Inject
  @Extension
  private DimUtil _dimUtil;
  
  @Inject
  @Extension
  private PubTableUtil _pubTableUtil;
  
  @Override
  public boolean canRender(final IDiagramRoot root) {
    if (((root instanceof DInformationModel) || (root instanceof DAggregate))) {
      final List<DType> allTypes = EcoreUtil2.<DType>eAllOfType(root, DType.class);
      boolean _isEmpty = allTypes.isEmpty();
      return (!_isEmpty);
    }
    return false;
  }
  
  @Override
  public Table render(final IDiagramRoot root) {
    DimAllTypesTableRenderer.LOGGER.info((" for " + root));
    final Table t = this._pubTableUtil.createTableWithHeader("Type", "Description");
    if (((root instanceof DInformationModel) || (root instanceof DAggregate))) {
      final List<DType> allTypes = EcoreUtil2.<DType>eAllOfType(root, DType.class);
      for (final DType type : allTypes) {
        this.describe(t, type);
      }
    }
    return t;
  }
  
  protected void _describe(final Table t, final DPrimitive p) {
    String _label = this._dimUtil.label(p);
    String _plus = (_label + " redefines ");
    String _name = p.getRedefines().getName();
    String _plus_1 = (_plus + _name);
    this._pubTableUtil.addRowWithDescription(t, new String[] { _plus_1 }, p.getDescription());
  }
  
  protected void _describe(final Table t, final DType type) {
    String _label = this._dimUtil.label(type);
    this._pubTableUtil.addRowWithDescription(t, new String[] { _label }, type.getDescription());
  }
  
  protected void describe(final Table t, final DType p) {
    if (p instanceof DPrimitive) {
      _describe(t, (DPrimitive)p);
      return;
    } else if (p != null) {
      _describe(t, p);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t, p).toString());
    }
  }
}
