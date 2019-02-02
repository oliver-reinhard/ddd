package com.mimacom.ddd.sm.sms;

import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.sm.sms.SAggregate;
import com.mimacom.ddd.sm.sms.SAssociation;
import com.mimacom.ddd.sm.sms.SAssociationKind;
import com.mimacom.ddd.sm.sms.SComplexType;
import com.mimacom.ddd.sm.sms.SCondition;
import com.mimacom.ddd.sm.sms.SDeductionRule;
import com.mimacom.ddd.sm.sms.SDetailType;
import com.mimacom.ddd.sm.sms.SDitchRule;
import com.mimacom.ddd.sm.sms.SEnumeration;
import com.mimacom.ddd.sm.sms.SFeature;
import com.mimacom.ddd.sm.sms.SFuseRule;
import com.mimacom.ddd.sm.sms.SGrabAggregateRule;
import com.mimacom.ddd.sm.sms.SGrabRule;
import com.mimacom.ddd.sm.sms.SMorphRule;
import com.mimacom.ddd.sm.sms.SPrimitive;
import com.mimacom.ddd.sm.sms.SRootType;
import com.mimacom.ddd.sm.sms.SType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class SmsUtil {
  /**
   * Returns all the supertypes of the given type.
   */
  public Set<SComplexType> typeHierarchy(final SComplexType type) {
    final LinkedHashSet<SComplexType> hierarchy = new LinkedHashSet<SComplexType>();
    SComplexType current = type.getSuperType();
    while (((current != null) && (!hierarchy.contains(current)))) {
      {
        hierarchy.add(current);
        current = current.getSuperType();
      }
    }
    return hierarchy;
  }
  
  /**
   * Returns all the supertypes of the given type.
   */
  public Set<DComplexType> typeHierarchy(final DComplexType type) {
    final LinkedHashSet<DComplexType> hierarchy = new LinkedHashSet<DComplexType>();
    DComplexType current = type.getSuperType();
    while (((current != null) && (!hierarchy.contains(current)))) {
      {
        hierarchy.add(current);
        current = current.getSuperType();
      }
    }
    return hierarchy;
  }
  
  /**
   * Returns the names of all the features of the given type: its own as well as the inherited ones.
   */
  public List<DFeature> allFeatures(final DComplexType type) {
    final ArrayList<DFeature> features = Lists.<DFeature>newArrayList(type.getFeatures());
    Set<DComplexType> _typeHierarchy = this.typeHierarchy(type);
    for (final DComplexType t : _typeHierarchy) {
      features.addAll(t.getFeatures());
    }
    return features;
  }
  
  /**
   * Returns the names of all the inherited features of the given type.
   */
  public Set<String> inheritedFeatureNames(final SComplexType type) {
    final Set<SComplexType> supertypes = this.typeHierarchy(type);
    final LinkedHashSet<String> features = new LinkedHashSet<String>();
    for (final SComplexType t : supertypes) {
      final Function1<SFeature, String> _function = (SFeature it) -> {
        return it.getName();
      };
      features.addAll(ListExtensions.<SFeature, String>map(t.getFeatures(), _function));
    }
    return features;
  }
  
  public String label(final SAggregate a) {
    String _rootName = a.getRootName();
    return ("Aggregate " + _rootName);
  }
  
  public String label(final SType type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof SPrimitive) {
      _matched=true;
      String _xifexpression = null;
      boolean _isArchetype = ((SPrimitive)type).isArchetype();
      if (_isArchetype) {
        _xifexpression = "Archetype ";
      } else {
        _xifexpression = "Primitive ";
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (type instanceof SEnumeration) {
        _matched=true;
        _switchResult = "Enumeration ";
      }
    }
    if (!_matched) {
      if (type instanceof SRootType) {
        _matched=true;
        _switchResult = "Root ";
      }
    }
    if (!_matched) {
      if (type instanceof SDetailType) {
        _matched=true;
        _switchResult = "Detail ";
      }
    }
    if (!_matched) {
      if (type instanceof SAssociation) {
        _matched=true;
        String _switchResult_1 = null;
        SAssociationKind _kind = ((SAssociation)type).getKind();
        if (_kind != null) {
          switch (_kind) {
            case REFERENCE:
              _switchResult_1 = "Reference ";
              break;
            case COMPOSITE:
              _switchResult_1 = "Composite ";
              break;
            case INVERSE_COMPOSITE:
              _switchResult_1 = "Inverse Composite ";
              break;
            default:
              _switchResult_1 = ((SAssociation)type).getKind().toString();
              break;
          }
        } else {
          _switchResult_1 = ((SAssociation)type).getKind().toString();
        }
        _switchResult = _switchResult_1;
      }
    }
    if (!_matched) {
      _switchResult = type.getClass().getSimpleName();
    }
    final String typeLabel = _switchResult;
    String _name = null;
    if (type!=null) {
      _name=type.getName();
    }
    return (typeLabel + _name);
  }
  
  public String label(final SFeature f) {
    String _name = null;
    if (f!=null) {
      _name=f.getName();
    }
    String _plus = (_name + " : ");
    SType _type = f.getType();
    String _label = null;
    if (_type!=null) {
      _label=this.label(_type);
    }
    return (_plus + _label);
  }
  
  public String label(final SCondition c) {
    String _name = c.getName();
    return ("Constraint " + _name);
  }
  
  public String label(final SDeductionRule rule) {
    String _switchResult = null;
    boolean _matched = false;
    if (rule instanceof SMorphRule) {
      _matched=true;
      DNamedElement _source = ((SMorphRule)rule).getSource();
      String _name = null;
      if (_source!=null) {
        _name=_source.getName();
      }
      _switchResult = ("Morph " + _name);
    }
    if (!_matched) {
      if (rule instanceof SFuseRule) {
        _matched=true;
        DNamedElement _source = ((SFuseRule)rule).getSource();
        String _name = null;
        if (_source!=null) {
          _name=_source.getName();
        }
        String _plus = ("Fuse " + _name);
        String _plus_1 = (_plus + " and ");
        DNamedElement _source2 = ((SFuseRule)rule).getSource2();
        String _name_1 = null;
        if (_source2!=null) {
          _name_1=_source2.getName();
        }
        _switchResult = (_plus_1 + _name_1);
      }
    }
    if (!_matched) {
      if (rule instanceof SGrabRule) {
        _matched=true;
        DNamedElement _source = ((SGrabRule)rule).getSource();
        String _name = null;
        if (_source!=null) {
          _name=_source.getName();
        }
        _switchResult = ("Grab " + _name);
      }
    }
    if (!_matched) {
      if (rule instanceof SDitchRule) {
        _matched=true;
        DNamedElement _source = ((SDitchRule)rule).getSource();
        String _name = null;
        if (_source!=null) {
          _name=_source.getName();
        }
        _switchResult = ("Ditch " + _name);
      }
    }
    if (!_matched) {
      if (rule instanceof SGrabAggregateRule) {
        _matched=true;
        DAggregate _source = ((SGrabAggregateRule)rule).getSource();
        String _rootName = null;
        if (_source!=null) {
          _rootName=_source.getRootName();
        }
        _switchResult = ("Grab aggregate " + _rootName);
      }
    }
    if (!_matched) {
      _switchResult = rule.getClass().getSimpleName();
    }
    return _switchResult;
  }
}
