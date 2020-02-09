package com.mimacom.ddd.dm.dim.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DInformationModel;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.pub.pub.PubTableUtil;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DimTypesTableRenderer implements ITableRenderer {
  private static final Logger LOGGER = Logger.getLogger(DimTypesTableRenderer.class);
  
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
    DimTypesTableRenderer.LOGGER.info((" for " + root));
    final Table t = this._pubTableUtil.createTableWithHeader("Type", "Feature Name", "Primitive / Feature Type", "Description");
    if (((root instanceof DInformationModel) || (root instanceof DAggregate))) {
      final List<DType> allTypes = EcoreUtil2.<DType>eAllOfType(root, DType.class);
      for (final DType type : allTypes) {
        this.describe(t, type);
      }
    }
    return t;
  }
  
  protected void _describe(final Table t, final DPrimitive p) {
    String _name = p.getName();
    String _plus = ("Primitive " + _name);
    String _name_1 = p.getRedefines().getName();
    String _plus_1 = ("Redefines " + _name_1);
    this._pubTableUtil.addDescriptionRow(t, new String[] { _plus, "", _plus_1 }, p.getDescription());
  }
  
  protected void _describe(final Table t, final DEnumeration e) {
    String _name = e.getName();
    String _plus = ("Enumeration " + _name);
    this._pubTableUtil.addDescriptionRow(t, new String[] { _plus, "", "" }, e.getDescription());
  }
  
  protected void _describe(final Table t, final DDetailType d) {
    String _name = d.getName();
    String _plus = ("Detail " + _name);
    this._pubTableUtil.addDescriptionRow(t, new String[] { _plus, "", "" }, d.getDescription());
    EList<DFeature> _features = d.getFeatures();
    for (final DFeature f : _features) {
      this.describe(t, f);
    }
  }
  
  protected void _describe(final Table t, final DEntityType e) {
    String _xifexpression = null;
    boolean _isRoot = e.isRoot();
    if (_isRoot) {
      _xifexpression = "Root";
    } else {
      _xifexpression = "";
    }
    String _plus = (_xifexpression + "Entity ");
    String _name = e.getName();
    String _plus_1 = (_plus + _name);
    this._pubTableUtil.addDescriptionRow(t, new String[] { _plus_1, "", "" }, e.getDescription());
    EList<DFeature> _features = e.getFeatures();
    for (final DFeature f : _features) {
      this.describe(t, f);
    }
  }
  
  protected void _describe(final Table t, final DFeature f) {
    String _name = f.getName();
    String _name_1 = f.getType().getName();
    String _plus = (_name_1 + " ");
    String _multiplicityText = this._dimUtil.multiplicityText(f);
    String _plus_1 = (_plus + _multiplicityText);
    this._pubTableUtil.addDescriptionRow(t, new String[] { "", _name, _plus_1 }, f.getDescription());
  }
  
  protected void describe(final Table t, final EObject d) {
    if (d instanceof DDetailType) {
      _describe(t, (DDetailType)d);
      return;
    } else if (d instanceof DEntityType) {
      _describe(t, (DEntityType)d);
      return;
    } else if (d instanceof DEnumeration) {
      _describe(t, (DEnumeration)d);
      return;
    } else if (d instanceof DPrimitive) {
      _describe(t, (DPrimitive)d);
      return;
    } else if (d instanceof DFeature) {
      _describe(t, (DFeature)d);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t, d).toString());
    }
  }
}
