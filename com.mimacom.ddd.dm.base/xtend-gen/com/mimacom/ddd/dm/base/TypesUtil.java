package com.mimacom.ddd.dm.base;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAssociationKind;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DInformationModel;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IFeatureContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class TypesUtil {
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
  protected List<DFeature> _allFeatures(final DComplexType type) {
    if ((type == null)) {
      return Collections.EMPTY_LIST;
    }
    final ArrayList<DFeature> features = Lists.<DFeature>newArrayList(type.getFeatures());
    Set<DComplexType> _typeHierarchy = this.typeHierarchy(type);
    for (final DComplexType t : _typeHierarchy) {
      features.addAll(t.getFeatures());
    }
    return features;
  }
  
  protected List<DFeature> _allFeatures(final IFeatureContainer container) {
    return container.getFeatures();
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
  
  public DInformationModel domain(final EObject obj) {
    return EcoreUtil2.<DInformationModel>getContainerOfType(obj, DInformationModel.class);
  }
  
  public String domainName(final EObject obj) {
    final DInformationModel d = this.domain(obj);
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
      _xifexpression = a.getName();
    } else {
      _xifexpression = "default";
    }
    return _xifexpression;
  }
  
  public String multiplicityText(final DNavigableMember member) {
    final DMultiplicity m = member.getMultiplicity();
    if (((m == null) || ((m.getMinOccurs() == 1) && (m.getMaxOccurs() == 1)))) {
      return "";
    }
    String _xifexpression = null;
    int _maxOccurs = m.getMaxOccurs();
    boolean _equals = (_maxOccurs == (-1));
    if (_equals) {
      _xifexpression = "*";
    } else {
      _xifexpression = Integer.valueOf(m.getMaxOccurs()).toString();
    }
    final String maxOccurs = _xifexpression;
    int _minOccurs = m.getMinOccurs();
    String _plus = ("[" + Integer.valueOf(_minOccurs));
    String _plus_1 = (_plus + ",");
    String _plus_2 = (_plus_1 + maxOccurs);
    return (_plus_2 + "]");
  }
  
  /**
   * Precondition: d is the domain owning the association
   */
  public boolean isTargetInsideDomain(final DAssociation a, final DInformationModel d) {
    DEntityType _targetType = a.getTargetType();
    boolean _tripleNotEquals = (_targetType != null);
    if (_tripleNotEquals) {
      final DInformationModel targetDomain = this.domain(a.getTargetType());
      return Objects.equal(d, targetDomain);
    }
    return false;
  }
  
  public boolean isTargetInsideDomain(final DAssociation a) {
    final DInformationModel d = this.domain(a);
    if ((d == null)) {
      return false;
    }
    return this.isTargetInsideDomain(a, d);
  }
  
  /**
   * Precondition: d is the domain owning the feature
   */
  public boolean isTypeInsideDomain(final DFeature f, final DInformationModel d) {
    DType _type = f.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      final DInformationModel targetDomain = this.domain(f.getType());
      return Objects.equal(d, targetDomain);
    }
    return false;
  }
  
  public boolean isTypeInsideDomain(final DFeature f) {
    final DInformationModel d = this.domain(f);
    if ((d == null)) {
      return false;
    }
    return this.isTypeInsideDomain(f, d);
  }
  
  public String describeType(final DNavigableMember m) {
    String _xifexpression = null;
    DType _type = m.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      String _label = this.label(m.getType());
      String _plus = (_label + " ");
      String _multiplicityText = this.multiplicityText(m);
      _xifexpression = (_plus + _multiplicityText);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String label(final DAggregate a) {
    String _name = a.getName();
    return ("Component " + _name);
  }
  
  public String label(final DType type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof DPrimitive) {
      _matched=true;
      _switchResult = "Primitive ";
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
          _xifexpression = "Root Entity ";
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
  
  public String label(final DNamedPredicate c) {
    String _name = c.getName();
    return ("Constraint " + _name);
  }
  
  public String label(final IDeducibleElement e) {
    String _switchResult = null;
    boolean _matched = false;
    if (e instanceof DAggregate) {
      _matched=true;
      _switchResult = this.label(((DAggregate)e));
    }
    if (!_matched) {
      if (e instanceof DType) {
        _matched=true;
        _switchResult = this.label(((DType)e));
      }
    }
    if (!_matched) {
      if (e instanceof DFeature) {
        _matched=true;
        _switchResult = this.label(((DFeature)e));
      }
    }
    if (!_matched) {
      if (e instanceof DQueryParameter) {
        _matched=true;
        _switchResult = this.label(((DQueryParameter)e));
      }
    }
    if (!_matched) {
      if (e instanceof DLiteral) {
        _matched=true;
        _switchResult = ((DLiteral)e).getName();
      }
    }
    if (!_matched) {
      _switchResult = e.toString();
    }
    return _switchResult;
  }
  
  public List<DFeature> allFeatures(final IFeatureContainer type) {
    if (type instanceof DComplexType) {
      return _allFeatures((DComplexType)type);
    } else if (type != null) {
      return _allFeatures(type);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type).toString());
    }
  }
}
