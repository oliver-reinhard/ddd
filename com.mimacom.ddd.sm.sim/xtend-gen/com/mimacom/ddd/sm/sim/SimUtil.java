package com.mimacom.ddd.sm.sim;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.impl.DDetailTypeImpl;
import com.mimacom.ddd.dm.base.impl.DEntityTypeImpl;
import com.mimacom.ddd.dm.base.impl.DEnumerationImpl;
import com.mimacom.ddd.dm.base.impl.DPrimitiveImpl;
import com.mimacom.ddd.dm.base.impl.DTypeImpl;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SAssociationDeduction;
import com.mimacom.ddd.sm.sim.SAttributeDeduction;
import com.mimacom.ddd.sm.sim.SDetailTypeDeduction;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SEntityTypeDeduction;
import com.mimacom.ddd.sm.sim.SEnumerationDeduction;
import com.mimacom.ddd.sm.sim.SFeatureDeduction;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SPrimitiveDeduction;
import com.mimacom.ddd.sm.sim.SQueryDeduction;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SimUtil extends DimUtil {
  public Class<? extends DType> baseImplClass(final STypeDeduction type) {
    Class<? extends DTypeImpl> _switchResult = null;
    boolean _matched = false;
    if (type instanceof SPrimitiveDeduction) {
      _matched=true;
      _switchResult = DPrimitiveImpl.class;
    }
    if (!_matched) {
      if (type instanceof SEnumerationDeduction) {
        _matched=true;
        _switchResult = DEnumerationImpl.class;
      }
    }
    if (!_matched) {
      if (type instanceof SEntityTypeDeduction) {
        _matched=true;
        _switchResult = DEntityTypeImpl.class;
      }
    }
    if (!_matched) {
      if (type instanceof SDetailTypeDeduction) {
        _matched=true;
        _switchResult = DDetailTypeImpl.class;
      }
    }
    return _switchResult;
  }
  
  public Class<? extends DFeature> baseClass(final SFeatureDeduction feature) {
    Class<? extends DFeature> _switchResult = null;
    boolean _matched = false;
    if (feature instanceof SAttributeDeduction) {
      _matched=true;
      _switchResult = DAttribute.class;
    }
    if (!_matched) {
      if (feature instanceof SAssociationDeduction) {
        _matched=true;
        _switchResult = DAssociation.class;
      }
    }
    if (!_matched) {
      if (feature instanceof SQueryDeduction) {
        _matched=true;
        _switchResult = DQuery.class;
      }
    }
    return _switchResult;
  }
  
  public List<DType> syntheticTypes(final SAggregateDeduction a) {
    EObject _eContainer = a.eContainer();
    final SInformationModel model = ((SInformationModel) _eContainer);
    final Function1<DAggregate, Boolean> _function = (DAggregate it) -> {
      return Boolean.valueOf((it.isSynthetic() && Objects.equal(it.getDeducedFrom(), a)));
    };
    final Iterable<DAggregate> syntheticAggregates = IterableExtensions.<DAggregate>filter(model.getAggregates(), _function);
    int _size = IterableExtensions.size(syntheticAggregates);
    boolean _equals = (_size == 1);
    if (_equals) {
      return IterableExtensions.<DAggregate>head(syntheticAggregates).getTypes();
    }
    return Collections.EMPTY_LIST;
  }
  
  public EClass baseEClass(final SFeatureDeduction feature) {
    EClass _switchResult = null;
    boolean _matched = false;
    if (feature instanceof SAttributeDeduction) {
      _matched=true;
      _switchResult = BasePackage.eINSTANCE.getDAttribute();
    }
    if (!_matched) {
      if (feature instanceof SAssociationDeduction) {
        _matched=true;
        _switchResult = BasePackage.eINSTANCE.getDAssociation();
      }
    }
    if (!_matched) {
      if (feature instanceof SQueryDeduction) {
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
  
  public String label(final DDeductionRule rule) {
    String _switchResult = null;
    boolean _matched = false;
    if (rule instanceof SMorphRule) {
      _matched=true;
      String _label = this.label(((SMorphRule)rule).getSource());
      String _plus = ("Morph " + _label);
      String _xifexpression = null;
      String _renameTo = ((SMorphRule)rule).getRenameTo();
      boolean _tripleNotEquals = (_renameTo != null);
      if (_tripleNotEquals) {
        String _renameTo_1 = ((SMorphRule)rule).getRenameTo();
        _xifexpression = (" as " + _renameTo_1);
      } else {
        _xifexpression = "";
      }
      _switchResult = (_plus + _xifexpression);
    }
    if (!_matched) {
      if (rule instanceof SFuseRule) {
        _matched=true;
        String _label = this.label(((SFuseRule)rule).getSource());
        _switchResult = ("Fuse " + _label);
      }
    }
    if (!_matched) {
      if (rule instanceof SGrabRule) {
        _matched=true;
        String _label = this.label(((SGrabRule)rule).getSource());
        String _plus = ("Grab " + _label);
        String _xifexpression = null;
        String _renameTo = ((SGrabRule)rule).getRenameTo();
        boolean _tripleNotEquals = (_renameTo != null);
        if (_tripleNotEquals) {
          String _renameTo_1 = ((SGrabRule)rule).getRenameTo();
          _xifexpression = (" as " + _renameTo_1);
        } else {
          _xifexpression = "";
        }
        _switchResult = (_plus + _xifexpression);
      }
    }
    if (!_matched) {
      if (rule instanceof SDitchRule) {
        _matched=true;
        String _label = this.label(((SDitchRule)rule).getSource());
        _switchResult = ("Ditch " + _label);
      }
    }
    if (!_matched) {
      if (rule instanceof SGrabAggregateRule) {
        _matched=true;
        String _label = this.label(((SGrabAggregateRule)rule).getSource());
        _switchResult = ("Grab aggregate " + _label);
      }
    }
    if (!_matched) {
      _switchResult = rule.getClass().getSimpleName();
    }
    return _switchResult;
  }
  
  public String label(final SFuseRule rule) {
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
