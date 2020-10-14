package com.mimacom.ddd.sm.sim;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.TTranspositionRule;
import com.mimacom.ddd.dm.base.base.impl.DDetailTypeImpl;
import com.mimacom.ddd.dm.base.base.impl.DEntityTypeImpl;
import com.mimacom.ddd.dm.base.base.impl.DEnumerationImpl;
import com.mimacom.ddd.dm.base.base.impl.DPrimitiveImpl;
import com.mimacom.ddd.dm.base.base.impl.DTypeImpl;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TAssociationTransposition;
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition;
import com.mimacom.ddd.dm.base.transpose.TDetailTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TDitchRule;
import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition;
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition;
import com.mimacom.ddd.dm.base.transpose.TFuseRule;
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.sm.sim.SystemInformationModel;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimUtil extends DimUtil {
  public Class<? extends DType> baseImplClass(final TTypeTransposition type) {
    Class<? extends DTypeImpl> _switchResult = null;
    boolean _matched = false;
    if (type instanceof TPrimitiveTransposition) {
      _matched=true;
      _switchResult = DPrimitiveImpl.class;
    }
    if (!_matched) {
      if (type instanceof TEnumerationTransposition) {
        _matched=true;
        _switchResult = DEnumerationImpl.class;
      }
    }
    if (!_matched) {
      if (type instanceof TEntityTypeTransposition) {
        _matched=true;
        _switchResult = DEntityTypeImpl.class;
      }
    }
    if (!_matched) {
      if (type instanceof TDetailTypeTransposition) {
        _matched=true;
        _switchResult = DDetailTypeImpl.class;
      }
    }
    return _switchResult;
  }
  
  public Class<? extends DFeature> baseClass(final TFeatureTransposition feature) {
    Class<? extends DFeature> _switchResult = null;
    boolean _matched = false;
    if (feature instanceof TAttributeTransposition) {
      _matched=true;
      _switchResult = DAttribute.class;
    }
    if (!_matched) {
      if (feature instanceof TAssociationTransposition) {
        _matched=true;
        _switchResult = DAssociation.class;
      }
    }
    if (!_matched) {
      if (feature instanceof TQueryTransposition) {
        _matched=true;
        _switchResult = DQuery.class;
      }
    }
    return _switchResult;
  }
  
  public List<DType> syntheticTypes(final TAggregateTransposition a) {
    EObject _eContainer = a.eContainer();
    final SystemInformationModel model = ((SystemInformationModel) _eContainer);
    final Function1<DAggregate, Boolean> _function = (DAggregate it) -> {
      return Boolean.valueOf((it.isSynthetic() && Objects.equal(it.getTransposedBy(), a)));
    };
    final Iterable<DAggregate> syntheticAggregates = IterableExtensions.<DAggregate>filter(model.getAggregates(), _function);
    int _size = IterableExtensions.size(syntheticAggregates);
    boolean _equals = (_size == 1);
    if (_equals) {
      return IterableExtensions.<DAggregate>head(syntheticAggregates).getTypes();
    }
    return Collections.EMPTY_LIST;
  }
  
  public EClass baseEClass(final TFeatureTransposition feature) {
    EClass _switchResult = null;
    boolean _matched = false;
    if (feature instanceof TAttributeTransposition) {
      _matched=true;
      _switchResult = BasePackage.eINSTANCE.getDAttribute();
    }
    if (!_matched) {
      if (feature instanceof TAssociationTransposition) {
        _matched=true;
        _switchResult = BasePackage.eINSTANCE.getDAssociation();
      }
    }
    if (!_matched) {
      if (feature instanceof TQueryTransposition) {
        _matched=true;
        _switchResult = BasePackage.eINSTANCE.getDQuery();
      }
    }
    return _switchResult;
  }
  
  @Override
  public String label(final DAggregate a) {
    String _name = a.getName();
    return ("Aggregate " + _name);
  }
  
  public String label(final TTranspositionRule rule) {
    String _switchResult = null;
    boolean _matched = false;
    if (rule instanceof TMorphRule) {
      _matched=true;
      String _label = this.label(((TMorphRule)rule).getSource());
      String _plus = ("Morph " + _label);
      String _xifexpression = null;
      String _renameTo = ((TMorphRule)rule).getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        String _renameTo_1 = ((TMorphRule)rule).getRenameTo();
        _xifexpression = (" as " + _renameTo_1);
      } else {
        _xifexpression = "";
      }
      _switchResult = (_plus + _xifexpression);
    }
    if (!_matched) {
      if (rule instanceof TFuseRule) {
        _matched=true;
        String _label = this.label(((TFuseRule)rule).getSource());
        _switchResult = ("Fuse " + _label);
      }
    }
    if (!_matched) {
      if (rule instanceof TGrabRule) {
        _matched=true;
        String _label = this.label(((TGrabRule)rule).getSource());
        String _plus = ("Grab " + _label);
        String _xifexpression = null;
        String _renameTo = ((TGrabRule)rule).getRenameTo();
        boolean _tripleNotEquals = (_renameTo != null);
        if (_tripleNotEquals) {
          String _renameTo_1 = ((TGrabRule)rule).getRenameTo();
          _xifexpression = (" as " + _renameTo_1);
        } else {
          _xifexpression = "";
        }
        _switchResult = (_plus + _xifexpression);
      }
    }
    if (!_matched) {
      if (rule instanceof TDitchRule) {
        _matched=true;
        String _label = this.label(((TDitchRule)rule).getSource());
        _switchResult = ("Ditch " + _label);
      }
    }
    if (!_matched) {
      if (rule instanceof TGrabAggregateRule) {
        _matched=true;
        String _label = this.label(((TGrabAggregateRule)rule).getSource());
        _switchResult = ("Grab aggregate " + _label);
      }
    }
    if (!_matched) {
      _switchResult = rule.getClass().getSimpleName();
    }
    return _switchResult;
  }
  
  public String label(final TFuseRule rule) {
    DNamedElement _namedSource = rule.getNamedSource();
    String _name = null;
    if (_namedSource!=null) {
      _name=_namedSource.getName();
    }
    final StringBuilder sb = new StringBuilder(_name);
    EList<DNamedElement> _otherSources = rule.getOtherSources();
    for (final DNamedElement s : _otherSources) {
      {
        sb.append(" and ");
        sb.append(s.getName());
      }
    }
    return sb.toString();
  }
}
