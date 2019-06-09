/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SAssociation;
import com.mimacom.ddd.sm.sim.SAttribute;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SCondition;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SDetailType;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SEntityType;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SNamedElement;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SQueryParameter;
import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.SSyntheticDeductionRule;
import com.mimacom.ddd.sm.sim.STristate;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SValueType;
import com.mimacom.ddd.sm.sim.SimPackage;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.validation.AbstractSimValidator;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SimValidator extends AbstractSimValidator {
  @Inject
  @Extension
  private SimUtil _simUtil;
  
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  @Check
  public void checkAggregateHasSingleRootOrRootHiearchy(final SAggregate a) {
    final Function1<SEntityType, Boolean> _function = (SEntityType it) -> {
      return Boolean.valueOf(((!Objects.equal(it.getNature(), SElementNature.DEDUCTION_RULE)) && it.isRoot()));
    };
    final Iterable<SEntityType> roots = IterableExtensions.<SEntityType>filter(Iterables.<SEntityType>filter(a.getTypes(), SEntityType.class), _function);
    final Function1<SEntityType, Boolean> _function_1 = (SEntityType it) -> {
      SAggregate _aggregate = this._simUtil.aggregate(it.getSuperType());
      return Boolean.valueOf((!Objects.equal(_aggregate, a)));
    };
    final Iterable<SEntityType> topLevelRoots = IterableExtensions.<SEntityType>filter(roots, _function_1);
    int _size = IterableExtensions.size(topLevelRoots);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      for (final SEntityType r : roots) {
        this.error("Aggregate can only declare a single root or relationship or a single hierarchy thereof", r, SimPackage.Literals.SNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkCyclicTypeHierarchy(final SComplexType t) {
    boolean _contains = this._simUtil.typeHierarchy(t).contains(t);
    if (_contains) {
      this.error("Type is part of a supertype cycle", t, SimPackage.Literals.SNAMED_ELEMENT__NAME);
    }
  }
  
  @Check
  public void checkSupertype(final SComplexType t) {
    SComplexType _superType = t.getSuperType();
    boolean _tripleNotEquals = (_superType != null);
    if (_tripleNotEquals) {
      EClass _eClass = t.getSuperType().eClass();
      EClass _eClass_1 = t.eClass();
      boolean _tripleNotEquals_1 = (_eClass != _eClass_1);
      if (_tripleNotEquals_1) {
        this.error("Supertype is not compatible", t, SimPackage.Literals.SNAMED_ELEMENT__NAME);
      }
      final SInformationModel tDomain = EcoreUtil2.<SInformationModel>getContainerOfType(t, SInformationModel.class);
      final SInformationModel superTypeDomain = EcoreUtil2.<SInformationModel>getContainerOfType(t.getSuperType(), SInformationModel.class);
      if ((superTypeDomain != tDomain)) {
        this.error("Supertype must be in same information model", t, SimPackage.Literals.SNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkNoFeatureOverrides(final SComplexType t) {
    final Set<String> inherited = this._simUtil.inheritedFeatureNames(t);
    EList<SFeature> _features = t.getFeatures();
    for (final SFeature f : _features) {
      boolean _contains = inherited.contains(f.getName());
      if (_contains) {
        this.error("Feature cannot override inherited feature with same name", f, SimPackage.Literals.SNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDEntityType(final SEntityType t) {
    SElementNature _nature = t.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      final EObject source = t.getDeductionRule().getSource();
      if ((source instanceof DEntityType)) {
        boolean _isRoot = ((DEntityType)source).isRoot();
        boolean _isRoot_1 = t.isRoot();
        boolean _tripleNotEquals = (Boolean.valueOf(_isRoot) != Boolean.valueOf(_isRoot_1));
        if (_tripleNotEquals) {
          this.error("Deduced entity rule must match domain-model root property", t.getDeductionRule(), 
            SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
        }
      } else {
        if ((source != null)) {
          this.error("Deduced entity rule must have a domain-model entity as its source", t.getDeductionRule(), 
            SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
        }
      }
    }
  }
  
  @Check
  public void checkCorrespondingDDetailType(final SDetailType t) {
    SElementNature _nature = t.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((t.getDeductionRule().getSource() != null) && (!(t.getDeductionRule().getSource() instanceof DDetailType)))) {
        this.error("Deduced DetailType rule must have a domain-model DetailType as its source", t.getDeductionRule(), 
          SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkRootPropertyForDetailType(final SDetailType t) {
    SElementNature _nature = t.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      final SDeductionRule rule = t.getDeductionRule();
      if ((rule instanceof SStructureChangingRule)) {
        STristate _rootEntity = ((SStructureChangingRule)rule).getRootEntity();
        final boolean setsRootProperty = (!Objects.equal(_rootEntity, STristate.DONT_CARE));
        if (setsRootProperty) {
          this.warning("Setting the root property for DetailTypes does not have any effect.", rule, 
            SimPackage.Literals.SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY);
        }
      }
    }
  }
  
  @Check
  public void checkDeducedFeaturesCombination(final SComplexType t) {
    SElementNature _nature = t.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      SDeductionRule _deductionRule = t.getDeductionRule();
      if ((_deductionRule instanceof SGrabRule)) {
        final Function1<SFeature, Boolean> _function = (SFeature it) -> {
          SDeductionRule _deductionRule_1 = it.getDeductionRule();
          return Boolean.valueOf((_deductionRule_1 instanceof SDitchRule));
        };
        final boolean hasDitchElements = IterableExtensions.<SFeature>exists(t.getFeatures(), _function);
        final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
          SDeductionRule _deductionRule_1 = it.getDeductionRule();
          return Boolean.valueOf((_deductionRule_1 instanceof SGrabRule));
        };
        final boolean hasGrabElements = IterableExtensions.<SFeature>exists(t.getFeatures(), _function_1);
        if ((hasDitchElements && hasGrabElements)) {
          this.error("Cannot use both grab rule and ditch rules together.", t.getDeductionRule(), 
            SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
        }
      }
    }
  }
  
  @Check
  public void checkComplexTypeExtensionChange(final SStructureChangingRule r) {
    SType _extendFrom = r.getExtendFrom();
    boolean _tripleNotEquals = (_extendFrom != null);
    if (_tripleNotEquals) {
      final EObject container = r.eContainer();
      if ((container instanceof SComplexType)) {
        Class<? extends SComplexType> _class = ((SComplexType)container).getClass();
        Class<? extends SType> _class_1 = r.getExtendFrom().getClass();
        boolean _notEquals = (!Objects.equal(_class, _class_1));
        if (_notEquals) {
          this.error("New super type is not compatible with the subject of this rule", r, SimPackage.Literals.SSTRUCTURE_CHANGING_RULE__EXTEND_FROM);
        }
      }
    }
  }
  
  @Check
  public void checkComplexTypeExtensionChange(final SFuseRule r) {
    boolean _isEmpty = r.getOtherSources().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      this.error("Feature not implemented yet", r, SimPackage.Literals.SFUSE_RULE__OTHER_SOURCES);
    }
  }
  
  @Check
  public void checkHasDeducedContainer(final SFeature f) {
    SElementNature _nature = f.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      EObject _eContainer = f.eContainer();
      final SComplexType container = ((SComplexType) _eContainer);
      SElementNature _nature_1 = container.getNature();
      boolean _notEquals = (!Objects.equal(_nature_1, SElementNature.DEDUCTION_RULE));
      if (_notEquals) {
        this.error("Features can only have a deduction rule if the containing type also has a deduction rule.", f.getDeductionRule(), 
          SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDAttributeType(final SAttribute a) {
    SElementNature _nature = a.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((a.getDeductionRule().getSource() != null) && (!(a.getDeductionRule().getSource() instanceof DAttribute)))) {
        this.error("Deduced attribute rule must have a domain-model attribute as its source", a.getDeductionRule(), 
          SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDQueryType(final SQuery q) {
    SElementNature _nature = q.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((q.getDeductionRule().getSource() != null) && (!(q.getDeductionRule().getSource() instanceof DQuery)))) {
        this.error("Deduced query rule must have a domain-model attribute as its source", q.getDeductionRule(), 
          SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDAssociationType(final SAssociation a) {
    SElementNature _nature = a.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((a.getDeductionRule().getSource() != null) && (!(a.getDeductionRule().getSource() instanceof DAssociation)))) {
        this.error("Deduced association rule must have a domain-model association as its source", 
          SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkHasDeducedEnumeration(final SLiteral literal) {
    SElementNature _nature = literal.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      EObject _eContainer = literal.eContainer();
      final SEnumeration container = ((SEnumeration) _eContainer);
      SElementNature _nature_1 = container.getNature();
      boolean _notEquals = (!Objects.equal(_nature_1, SElementNature.DEDUCTION_RULE));
      if (_notEquals) {
        this.error("Literals can only have a deduction rule if the containing enumeration also has a deduction rule.", 
          literal.getDeductionRule(), SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkPrimitiveDoesNotRedefineItself(final SPrimitive p) {
    SPrimitive _redefines = p.getRedefines();
    boolean _equals = Objects.equal(_redefines, p);
    if (_equals) {
      this.error("Primitive cannot redefine itself", p, SimPackage.Literals.SPRIMITIVE__REDEFINES);
    }
  }
  
  @Check
  public void checkEnumerationHasLiterals(final SEnumeration e) {
    int _size = e.getLiterals().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      String _description = this.getDescription(e);
      String _plus = (_description + ": Enumeration does not declare literals");
      this.warningOnStructuralElement(e, _plus);
    }
  }
  
  @Check
  public void checkAttributeIsValueType(final SAttribute a) {
    if ((Objects.equal(a.getNature(), SElementNature.GENUINE) && (!(a.getType() instanceof SValueType)))) {
      this.error("Referenced type is not a ValueType", a, SimPackage.Literals.SFEATURE__TYPE);
    } else {
      SElementNature _nature = a.getNature();
      boolean _equals = Objects.equal(_nature, SElementNature.SYNTHETIC);
      if (_equals) {
        SType _type = a.getType();
        boolean _tripleEquals = (_type == null);
        if (_tripleEquals) {
          String _description = this.getDescription(a);
          String _plus = (_description + ": no mapping rule for type");
          this.errorOnStructuralElement(a, _plus);
        } else {
          SType _type_1 = a.getType();
          boolean _not = (!(_type_1 instanceof SValueType));
          if (_not) {
            String _description_1 = this.getDescription(a);
            String _plus_1 = (_description_1 + ": referenced type is not a ValueType");
            this.errorOnStructuralElement(a, _plus_1);
          }
        }
      }
    }
  }
  
  @Check
  public void checkAssocitionToRootType(final SAssociation a) {
    if ((Objects.equal(a.getNature(), SElementNature.GENUINE) && (!((a.getType() instanceof SEntityType) && ((SEntityType) a.getType()).isRoot())))) {
      this.error("Referenced type is not a RootType", a, SimPackage.Literals.SFEATURE__TYPE);
    } else {
      SElementNature _nature = a.getNature();
      boolean _equals = Objects.equal(_nature, SElementNature.SYNTHETIC);
      if (_equals) {
        SType _type = a.getType();
        boolean _tripleEquals = (_type == null);
        if (_tripleEquals) {
          String _description = this.getDescription(a);
          String _plus = (_description + ": no mapping rule for type");
          this.errorOnStructuralElement(a, _plus);
        } else {
          SType _type_1 = a.getType();
          boolean _not = (!(_type_1 instanceof SValueType));
          if (_not) {
            String _description_1 = this.getDescription(a);
            String _plus_1 = (_description_1 + ": referenced type is not a RootType");
            this.errorOnStructuralElement(a, _plus_1);
          }
        }
      }
    }
  }
  
  @Check
  public void checkAssociationMultiplicities(final SMultiplicity m) {
    int _maxOccurs = m.getMaxOccurs();
    boolean _equals = (_maxOccurs == 0);
    if (_equals) {
      this.error("Maximum targets cannot be 0", m, SimPackage.Literals.SMULTIPLICITY__MAX_OCCURS);
    }
  }
  
  @Check
  public void checkParameterIsValueType(final SQueryParameter p) {
    SElementNature _nature = p.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.GENUINE);
    if (_equals) {
      boolean _not = (!((p.getType() instanceof SValueType) || Objects.equal(p.getType(), p.eContainer())));
      if (_not) {
        this.error("Refererenced query-parameter type is neither a ValueType nor the query\'s own container", p, 
          SimPackage.Literals.SQUERY_PARAMETER__TYPE);
      }
    } else {
      SElementNature _nature_1 = p.getNature();
      boolean _equals_1 = Objects.equal(_nature_1, SElementNature.SYNTHETIC);
      if (_equals_1) {
        SType _type = p.getType();
        boolean _tripleEquals = (_type == null);
        if (_tripleEquals) {
          String _description = this.getDescription(p);
          String _plus = (_description + ": no mapping rule for type");
          this.errorOnStructuralElement(p, _plus);
        } else {
          boolean _not_1 = (!((p.getType() instanceof SValueType) || Objects.equal(p.getType(), p.eContainer())));
          if (_not_1) {
            String _description_1 = this.getDescription(p);
            String _plus_1 = (_description_1 + ": type is neither a ValueType nor the query\'s own container");
            this.errorOnStructuralElement(p, _plus_1);
          }
        }
      }
    }
  }
  
  public void checkNameStartsWithCapital(final SNamedElement ne) {
    final String name = ne.getName();
    if ((((name != null) && (name.length() > 0)) && (!Character.isUpperCase(name.charAt(0))))) {
      String _description = this.getDescription(ne);
      String _plus = (_description + ": Name should start with a capital");
      this.warningOnStructuralElement(ne, _plus);
    }
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final SType t) {
    this.checkNameStartsWithCapital(t);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final SCondition c) {
    this.checkNameStartsWithCapital(c);
  }
  
  public void checkNameStartsWithLowercase(final SNamedElement ne) {
    final char first = ne.getName().charAt(0);
    final char underscore = '_';
    if (((!Character.isLowerCase(first)) && (first != underscore))) {
      String _description = this.getDescription(ne);
      String _plus = (_description + ": Name should start with a lowercase or underscore");
      this.warningOnStructuralElement(ne, _plus);
    }
  }
  
  @Check
  public void checkFeatureNameStartsWithLowercase(final SFeature f) {
    this.checkNameStartsWithLowercase(f);
  }
  
  @Check
  public void checkFeatureNameStartsWithLowercase(final SQueryParameter p) {
    this.checkNameStartsWithLowercase(p);
  }
  
  @Check
  public void checkLiteralIsUppercase(final SLiteral literal) {
    boolean _equals = literal.getName().equals(literal.getName().toUpperCase());
    boolean _not = (!_equals);
    if (_not) {
      String _description = this.getDescription(literal);
      String _plus = (_description + ": Name should be all upercase");
      this.warningOnStructuralElement(literal, _plus);
    }
  }
  
  protected String getDescription(final EObject obj) {
    String _xblockexpression = null;
    {
      String synthetic = "";
      if ((obj instanceof SDeducibleElement)) {
        boolean _isSynthetic = ((SDeducibleElement)obj).isSynthetic();
        if (_isSynthetic) {
          synthetic = "Synthetic ";
        }
      }
      String _simpleName = obj.getClass().getSimpleName();
      String _plus = (synthetic + _simpleName);
      String _plus_1 = (_plus + " ");
      QualifiedName _fullyQualifiedName = this.qualifiedNameProvider.getFullyQualifiedName(obj);
      _xblockexpression = (_plus_1 + _fullyQualifiedName);
    }
    return _xblockexpression;
  }
  
  protected void warningOnStructuralElement(final EObject e, final String warningMsg) {
    if ((e instanceof SDeducibleElement)) {
      SElementNature _nature = ((SDeducibleElement)e).getNature();
      boolean _equals = Objects.equal(_nature, SElementNature.SYNTHETIC);
      if (_equals) {
        final SDeductionRule rule = ((SDeducibleElement)e).getDeductionRule();
        if ((rule instanceof SSyntheticDeductionRule)) {
          this.warningOnStructuralElementImpl(((SSyntheticDeductionRule)rule).getElementWithRule(), warningMsg);
        } else {
          final EObject container = ((SDeducibleElement)e).eContainer();
          if ((container instanceof SDeducibleElement)) {
            this.warningOnStructuralElement(container, warningMsg);
          } else {
            this.warningOnStructuralElementImpl(container, warningMsg);
          }
        }
      } else {
        SElementNature _nature_1 = ((SDeducibleElement)e).getNature();
        boolean _equals_1 = Objects.equal(_nature_1, SElementNature.DEDUCTION_RULE);
        if (_equals_1) {
          this.warning(warningMsg, e, SimPackage.Literals.SDEDUCIBLE_ELEMENT__DEDUCTION_RULE);
        } else {
          SElementNature _nature_2 = ((SDeducibleElement)e).getNature();
          boolean _equals_2 = Objects.equal(_nature_2, SElementNature.GENUINE);
          if (_equals_2) {
            this.warningOnStructuralElementImpl(e, warningMsg);
          }
        }
      }
    } else {
      this.warningOnStructuralElementImpl(e, warningMsg);
    }
  }
  
  protected void warningOnStructuralElementImpl(final EObject obj, final String warningMsg) {
    if ((obj instanceof SNamedElement)) {
      this.warning(warningMsg, obj, SimPackage.Literals.SNAMED_ELEMENT__NAME);
    } else {
      this.warning(warningMsg, obj, null);
    }
  }
  
  protected void errorOnStructuralElement(final EObject e, final String errorMsg) {
    if ((e instanceof SDeducibleElement)) {
      SElementNature _nature = ((SDeducibleElement)e).getNature();
      boolean _equals = Objects.equal(_nature, SElementNature.SYNTHETIC);
      if (_equals) {
        final SDeductionRule rule = ((SDeducibleElement)e).getDeductionRule();
        if ((rule instanceof SSyntheticDeductionRule)) {
          this.errorOnStructuralElementImpl(((SSyntheticDeductionRule)rule).getElementWithRule(), errorMsg);
        } else {
          final EObject container = ((SDeducibleElement)e).eContainer();
          if ((container instanceof SDeducibleElement)) {
            this.errorOnStructuralElement(container, errorMsg);
          } else {
            this.errorOnStructuralElementImpl(container, errorMsg);
          }
        }
      } else {
        SElementNature _nature_1 = ((SDeducibleElement)e).getNature();
        boolean _equals_1 = Objects.equal(_nature_1, SElementNature.DEDUCTION_RULE);
        if (_equals_1) {
          this.error(errorMsg, e, SimPackage.Literals.SDEDUCIBLE_ELEMENT__DEDUCTION_RULE);
        } else {
          SElementNature _nature_2 = ((SDeducibleElement)e).getNature();
          boolean _equals_2 = Objects.equal(_nature_2, SElementNature.GENUINE);
          if (_equals_2) {
            this.errorOnStructuralElementImpl(e, errorMsg);
          }
        }
      }
    } else {
      this.errorOnStructuralElementImpl(e, errorMsg);
    }
  }
  
  protected void errorOnStructuralElementImpl(final EObject obj, final String errorMsg) {
    if ((obj instanceof SNamedElement)) {
      this.error(errorMsg, obj, SimPackage.Literals.SNAMED_ELEMENT__NAME);
    } else {
      this.error(errorMsg, obj, null);
    }
  }
}
