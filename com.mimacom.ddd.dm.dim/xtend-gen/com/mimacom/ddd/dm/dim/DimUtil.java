package com.mimacom.ddd.dm.dim;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAssociationKind;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DCondition;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DType;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DimUtil {
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
   * Returns the names of all the inherited features of the given type (but not its own features).
   */
  public Set<String> inheritedFeatureNames(final DComplexType type) {
    final Set<DComplexType> supertypes = this.typeHierarchy(type);
    final LinkedHashSet<String> features = new LinkedHashSet<String>();
    for (final DComplexType t : supertypes) {
      final Function1<DFeature, String> _function = (DFeature it) -> {
        return it.getName();
      };
      features.addAll(ListExtensions.<DFeature, String>map(t.getFeatures(), _function));
    }
    return features;
  }
  
  public DDomain domain(final EObject obj) {
    return EcoreUtil2.<DDomain>getContainerOfType(obj, DDomain.class);
  }
  
  public String domainName(final EObject obj) {
    final DDomain d = this.domain(obj);
    String _xifexpression = null;
    if ((d != null)) {
      _xifexpression = d.getName();
    } else {
      _xifexpression = "NO_DOMAIN";
    }
    return _xifexpression;
  }
  
  public DAggregate aggregate(final EObject obj) {
    return EcoreUtil2.<DAggregate>getContainerOfType(obj, DAggregate.class);
  }
  
  public String aggregateName(final EObject obj) {
    final DAggregate a = this.aggregate(obj);
    String _xifexpression = null;
    if ((a != null)) {
      _xifexpression = a.getDerivedName();
    } else {
      _xifexpression = "NO_AGGREGATE";
    }
    return _xifexpression;
  }
  
  /**
   * Precondition: d is the domain owning the association
   */
  public boolean isTargetInsideDomain(final DAssociation a, final DDomain d) {
    DEntityType _targetType = a.getTargetType();
    boolean _tripleNotEquals = (_targetType != null);
    if (_tripleNotEquals) {
      final DDomain targetDomain = this.domain(a.getTargetType());
      return Objects.equal(d, targetDomain);
    }
    return false;
  }
  
  public boolean isTargetInsideDomain(final DAssociation a) {
    final DDomain d = this.domain(a);
    if ((d == null)) {
      return false;
    }
    return this.isTargetInsideDomain(a, d);
  }
  
  /**
   * Precondition: d is the domain owning the feature
   */
  public boolean isTypeInsideDomain(final DFeature f, final DDomain d) {
    DType _type = f.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      final DDomain targetDomain = this.domain(f.getType());
      return Objects.equal(d, targetDomain);
    }
    return false;
  }
  
  public boolean isTypeInsideDomain(final DFeature f) {
    final DDomain d = this.domain(f);
    if ((d == null)) {
      return false;
    }
    return this.isTypeInsideDomain(f, d);
  }
  
  public String label(final DAggregate a) {
    String _derivedName = a.getDerivedName();
    return ("Aggregate " + _derivedName);
  }
  
  public String label(final DType type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof DPrimitive) {
      _matched=true;
      String _xifexpression = null;
      boolean _isArchetype = ((DPrimitive)type).isArchetype();
      if (_isArchetype) {
        _xifexpression = "Archetype ";
      } else {
        _xifexpression = "Primitive ";
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (type instanceof DEnumeration) {
        _matched=true;
        _switchResult = "Enumeration ";
      }
    }
    if (!_matched) {
      if (type instanceof DEntityType) {
        _matched=true;
        String _xifexpression = null;
        boolean _isRoot = ((DEntityType)type).isRoot();
        if (_isRoot) {
          _xifexpression = "Root ";
        } else {
          _xifexpression = "Entity ";
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (type instanceof DDetailType) {
        _matched=true;
        _switchResult = "Detail ";
      }
    }
    if (!_matched) {
      if (type instanceof DAssociation) {
        _matched=true;
        String _switchResult_1 = null;
        DAssociationKind _kind = ((DAssociation)type).getKind();
        if (_kind != null) {
          switch (_kind) {
            case REFERENCE:
              _switchResult_1 = "Reference to ";
              break;
            case COMPOSITE:
              _switchResult_1 = "Composite to ";
              break;
            case INVERSE_COMPOSITE:
              _switchResult_1 = "Inverse Composite to ";
              break;
            default:
              _switchResult_1 = ((DAssociation)type).getKind().toString();
              break;
          }
        } else {
          _switchResult_1 = ((DAssociation)type).getKind().toString();
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
  
  public String label(final DFeature f) {
    String _name = f.getName();
    String _plus = (_name + " : ");
    DType _type = f.getType();
    String _label = null;
    if (_type!=null) {
      _label=this.label(_type);
    }
    return (_plus + _label);
  }
  
  public String label(final DQueryParameter p) {
    String _name = p.getName();
    String _plus = (_name + " : ");
    DType _type = p.getType();
    String _label = null;
    if (_type!=null) {
      _label=this.label(_type);
    }
    return (_plus + _label);
  }
  
  public String label(final DCondition c) {
    String _name = c.getName();
    return ("Constraint " + _name);
  }
}
