package com.mimacom.ddd.dm.dim.tableProvider;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import com.mimacom.ddd.pub.pub.PubTableUtil;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.tableProvider.ITableRenderer;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DimAllFeaturesTableRenderer implements ITableRenderer {
  private static final Logger LOGGER = Logger.getLogger(DimAllFeaturesTableRenderer.class);
  
  @Inject
  @Extension
  private DimUtil _dimUtil;
  
  @Inject
  @Extension
  private PubTableUtil _pubTableUtil;
  
  @Override
  public boolean canRender(final IDiagramRoot root) {
    if (((root instanceof DomainInformationModel) || (root instanceof DAggregate))) {
      final List<DFeature> allFeatures = EcoreUtil2.<DFeature>eAllOfType(root, DFeature.class);
      boolean _isEmpty = allFeatures.isEmpty();
      return (!_isEmpty);
    }
    return false;
  }
  
  @Override
  public Table render(final IDiagramRoot root) {
    DimAllFeaturesTableRenderer.LOGGER.info((" for " + root));
    final Table t = this._pubTableUtil.createTableWithHeader("Type", "Feature Name", "Feature Type", "Description");
    if (((root instanceof DomainInformationModel) || (root instanceof DAggregate))) {
      final List<DComplexType> allTypes = EcoreUtil2.<DComplexType>eAllOfType(root, DComplexType.class);
      for (final DComplexType type : allTypes) {
        {
          final String typeLabel = this._dimUtil.label(type);
          boolean first = true;
          EList<DFeature> _features = type.getFeatures();
          for (final DFeature f : _features) {
            {
              String _xifexpression = null;
              if (first) {
                _xifexpression = typeLabel;
              } else {
                _xifexpression = "";
              }
              String _name = f.getName();
              String _name_1 = f.getType().getName();
              String _plus = (_name_1 + " ");
              String _multiplicityText = this._dimUtil.multiplicityText(f);
              String _plus_1 = (_plus + _multiplicityText);
              this._pubTableUtil.addRowWithDescription(t, new String[] { _xifexpression, _name, _plus_1 }, 
                f.getDescription());
              first = false;
            }
          }
        }
      }
    }
    return t;
  }
}
