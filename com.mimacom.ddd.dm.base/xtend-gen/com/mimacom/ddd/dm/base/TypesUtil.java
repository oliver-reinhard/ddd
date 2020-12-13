package com.mimacom.ddd.dm.base;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAssociationKind;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEntityNature;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DInformationModel;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.impl.DDetailTypeImpl;
import com.mimacom.ddd.dm.base.base.impl.DEntityTypeImpl;
import com.mimacom.ddd.dm.base.base.impl.DEnumerationImpl;
import com.mimacom.ddd.dm.base.base.impl.DPrimitiveImpl;
import com.mimacom.ddd.dm.base.base.impl.DTypeImpl;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate;
import com.mimacom.ddd.dm.base.transpose.ITransposableElement;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
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
import com.mimacom.ddd.dm.base.transpose.TInformationModel;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition;
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  
  public DNamespace domain(final EObject obj) {
    return EcoreUtil2.<DNamespace>getContainerOfType(obj, DNamespace.class);
  }
  
  public String domainName(final EObject obj) {
    final DNamespace d = this.domain(obj);
    String _xifexpression = null;
    if ((d != null)) {
      _xifexpression = d.getName();
    } else {
      _xifexpression = "NO-DOMAIN";
    }
    return _xifexpression;
  }
  
  public DInformationModel model(final EObject obj) {
    return EcoreUtil2.<DInformationModel>getContainerOfType(obj, DInformationModel.class);
  }
  
  public String modelName(final EObject obj) {
    final DInformationModel d = this.model(obj);
    String _xifexpression = null;
    if ((d != null)) {
      _xifexpression = d.getName();
    } else {
      _xifexpression = "NO-PARENT-MODEL";
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
  
  public String outermostSemanticContainerName(final EObject obj) {
    return this.modelName(obj);
  }
  
  public DComplexType containingType(final DFeature f) {
    return EcoreUtil2.<DComplexType>getContainerOfType(f, DComplexType.class);
  }
  
  public String containingTypeName(final DFeature f) {
    final DComplexType t = this.containingType(f);
    String _xifexpression = null;
    if ((t != null)) {
      _xifexpression = t.getName();
    } else {
      _xifexpression = "NO-CONTAINING-TYPE";
    }
    return _xifexpression;
  }
  
  /**
   * @param hideMandatory1   [1,1] is the default, return "" if true
   */
  public String multiplicityText(final DNavigableMember member, final boolean suppressMandatory1) {
    final DMultiplicity m = member.getMultiplicity();
    if (((m == null) || ((m.getMinOccurs() == 1) && (m.getMaxOccurs() == 1)))) {
      String _xifexpression = null;
      if (suppressMandatory1) {
        _xifexpression = "";
      } else {
        _xifexpression = "[1]";
      }
      return _xifexpression;
    }
    String _xifexpression_1 = null;
    int _maxOccurs = m.getMaxOccurs();
    boolean _equals = (_maxOccurs == (-1));
    if (_equals) {
      _xifexpression_1 = "*";
    } else {
      _xifexpression_1 = Integer.valueOf(m.getMaxOccurs()).toString();
    }
    final String maxOccurs = _xifexpression_1;
    if (((m.getMinOccurs() == 0) && (m.getMaxOccurs() == (-1)))) {
      return (("[" + maxOccurs) + "]");
    }
    int _minOccurs = m.getMinOccurs();
    int _maxOccurs_1 = m.getMaxOccurs();
    boolean _equals_1 = (_minOccurs == _maxOccurs_1);
    if (_equals_1) {
      return (("[" + maxOccurs) + "]");
    }
    int _minOccurs_1 = m.getMinOccurs();
    String _plus = ("[" + Integer.valueOf(_minOccurs_1));
    String _plus_1 = (_plus + ",");
    String _plus_2 = (_plus_1 + maxOccurs);
    return (_plus_2 + "]");
  }
  
  /**
   * Precondition: d is the domain owning the association
   */
  public boolean isTargetInsideModel(final DAssociation a, final DInformationModel d) {
    DEntityType _targetType = a.getTargetType();
    boolean _tripleNotEquals = (_targetType != null);
    if (_tripleNotEquals) {
      final DInformationModel targetModel = this.model(a.getTargetType());
      return Objects.equal(d, targetModel);
    }
    return false;
  }
  
  public boolean isTargetInsideModel(final DAssociation a) {
    final DInformationModel d = this.model(a);
    if ((d == null)) {
      return false;
    }
    return this.isTargetInsideModel(a, d);
  }
  
  /**
   * Precondition: d is the domain owning the feature
   */
  public boolean isTypeInsideModel(final DFeature f, final DInformationModel d) {
    DType _type = f.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      final DInformationModel targetModel = this.model(f.getType());
      return Objects.equal(d, targetModel);
    }
    return false;
  }
  
  public boolean isTypeInsideModel(final DFeature f) {
    final DInformationModel d = this.model(f);
    if ((d == null)) {
      return false;
    }
    return this.isTypeInsideModel(f, d);
  }
  
  /**
   * Labels
   */
  public String simpleClassName(final Object obj) {
    final String name = obj.getClass().getSimpleName();
    boolean _endsWith = name.endsWith("Impl");
    if (_endsWith) {
      int _length = name.length();
      int _minus = (_length - 4);
      return name.substring(0, _minus);
    } else {
      boolean _endsWith_1 = name.endsWith("ImplCustom");
      if (_endsWith_1) {
        int _length_1 = name.length();
        int _minus_1 = (_length_1 - 10);
        return name.substring(0, _minus_1);
      }
    }
    return name;
  }
  
  public String describeType(final DNavigableMember m) {
    final StringBuilder b = new StringBuilder();
    DType _type = m.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      String _name = m.getType().getName();
      boolean _tripleNotEquals_1 = (_name != null);
      if (_tripleNotEquals_1) {
        b.append(m.getType().getName());
        b.append(this.multiplicityText(m, false));
      }
      b.append(" (");
      b.append(this.metatypeName(m.getType()));
      b.append(")");
    }
    return b.toString();
  }
  
  public String metatypeName(final DType type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof DPrimitive) {
      _matched=true;
      _switchResult = "Primitive";
    }
    if (!_matched) {
      if (type instanceof DEnumeration) {
        _matched=true;
        _switchResult = "Enumeration";
      }
    }
    if (!_matched) {
      if (type instanceof DEntityType) {
        _matched=true;
        String _xblockexpression = null;
        {
          String _switchResult_1 = null;
          DEntityNature _nature = ((DEntityType)type).getNature();
          if (_nature != null) {
            switch (_nature) {
              case AUTONOMOUS_ENTITY:
              case CONTROLLED_ENTITY:
                _switchResult_1 = "Entity";
                break;
              case RELATIONSHIP:
                _switchResult_1 = "Relationship";
                break;
              default:
                _switchResult_1 = ((DEntityType)type).getNature().getName();
                break;
            }
          } else {
            _switchResult_1 = ((DEntityType)type).getNature().getName();
          }
          final String name = _switchResult_1;
          String _xifexpression = null;
          boolean _isRoot = ((DEntityType)type).isRoot();
          if (_isRoot) {
            _xifexpression = ("main " + name);
          } else {
            _xifexpression = name;
          }
          _xblockexpression = _xifexpression;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (type instanceof DDetailType) {
        _matched=true;
        _switchResult = "Detail";
      }
    }
    if (!_matched) {
      _switchResult = type.getClass().getSimpleName();
    }
    return _switchResult;
  }
  
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
  
  public List<DType> syntheticTypes(final TAggregateTransposition a) {
    EObject _eContainer = a.eContainer();
    final TInformationModel model = ((TInformationModel) _eContainer);
    final Function1<TSyntheticAggregate, Boolean> _function = (TSyntheticAggregate it) -> {
      ITransposition _recipe = it.getRecipe();
      return Boolean.valueOf(Objects.equal(_recipe, a));
    };
    final Iterable<TSyntheticAggregate> syntheticAggregates = IterableExtensions.<TSyntheticAggregate>filter(Iterables.<TSyntheticAggregate>filter(model.getAggregates(), TSyntheticAggregate.class), _function);
    int _size = IterableExtensions.size(syntheticAggregates);
    boolean _equals = (_size == 1);
    if (_equals) {
      return IterableExtensions.<TSyntheticAggregate>head(syntheticAggregates).getTypes();
    }
    return Collections.EMPTY_LIST;
  }
  
  public String label(final DAggregate a) {
    String _name = a.getName();
    return ("Component " + _name);
  }
  
  public String label(final DType type) {
    String _metatypeName = this.metatypeName(type);
    String _plus = (_metatypeName + " ");
    String _name = null;
    if (type!=null) {
      _name=type.getName();
    }
    return (_plus + _name);
  }
  
  public String label(final DLiteral lit) {
    return lit.getName();
  }
  
  public String label(final DAssociation a) {
    String _switchResult = null;
    DAssociationKind _kind = a.getKind();
    if (_kind != null) {
      switch (_kind) {
        case REFERENCE:
          _switchResult = "Reference to ";
          break;
        case COMPOSITE:
          _switchResult = "Composite to ";
          break;
        case INVERSE_COMPOSITE:
          _switchResult = "Inverse Composite to ";
          break;
        default:
          _switchResult = a.getKind().toString();
          break;
      }
    } else {
      _switchResult = a.getKind().toString();
    }
    return _switchResult;
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
  
  public String label(final DQuery f) {
    String _name = f.getName();
    String _plus = (_name + "(");
    String _xifexpression = null;
    boolean _isEmpty = f.getParameters().isEmpty();
    if (_isEmpty) {
      _xifexpression = "";
    } else {
      _xifexpression = "..";
    }
    String _plus_1 = (_plus + _xifexpression);
    String _plus_2 = (_plus_1 + ") : ");
    DType _type = f.getType();
    String _label = null;
    if (_type!=null) {
      _label=this.label(_type);
    }
    return (_plus_2 + _label);
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
  
  public String label(final ITransposableElement e) {
    if ((e instanceof DNamedElement)) {
      return ((DNamedElement)e).getName();
    }
    return e.toString();
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
