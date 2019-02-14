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
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DRootType;
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
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SNamedElement;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SQueryParameter;
import com.mimacom.ddd.sm.sim.SRootType;
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
  
  @Check
  public void checkAggregateHasSingleRoot(final SAggregate a) {
    final Function1<SRootType, Boolean> _function = (SRootType it) -> {
      SElementNature _nature = it.getNature();
      return Boolean.valueOf((!Objects.equal(_nature, SElementNature.DEDUCTION_RULE)));
    };
    final Iterable<SRootType> roots = IterableExtensions.<SRootType>filter(Iterables.<SRootType>filter(a.getTypes(), SRootType.class), _function);
    int _size = IterableExtensions.size(roots);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      for (final SRootType t : roots) {
        this.error("Aggregate can only declare a single root or relationship", t, SimPackage.Literals.SNAMED_ELEMENT__NAME);
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
  public void checkCorrespondingDRootType(final SRootType t) {
    SElementNature _nature = t.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((t.getDeductionRule().getSource() != null) && (!(t.getDeductionRule().getSource() instanceof DRootType)))) {
        this.error("Deduced RootType rule must have a domain-model RootType as its source", t.getDeductionRule(), SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDDetailType(final SDetailType t) {
    SElementNature _nature = t.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((t.getDeductionRule().getSource() != null) && (!(t.getDeductionRule().getSource() instanceof DDetailType)))) {
        this.error("Deduced DetailType rule must have a domain-model DetailType as its source", t.getDeductionRule(), SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkDeducedFeaturesCombination(final SComplexType type) {
    SElementNature _nature = type.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      SDeductionRule _deductionRule = type.getDeductionRule();
      if ((_deductionRule instanceof SGrabRule)) {
        final Function1<SFeature, Boolean> _function = (SFeature it) -> {
          SDeductionRule _deductionRule_1 = it.getDeductionRule();
          return Boolean.valueOf((_deductionRule_1 instanceof SDitchRule));
        };
        final boolean hasDitchElements = IterableExtensions.<SFeature>exists(type.getFeatures(), _function);
        final Function1<SFeature, Boolean> _function_1 = (SFeature it) -> {
          SDeductionRule _deductionRule_1 = it.getDeductionRule();
          return Boolean.valueOf((_deductionRule_1 instanceof SGrabRule));
        };
        final boolean hasGrabElements = IterableExtensions.<SFeature>exists(type.getFeatures(), _function_1);
        if ((hasDitchElements && hasGrabElements)) {
          this.error("Cannot use both grab rule and ditch rules together.", type.getDeductionRule(), SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
        }
      }
    }
  }
  
  @Check
  public void checkHasDeducedContainer(final SFeature feature) {
    SElementNature _nature = feature.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      EObject _eContainer = feature.eContainer();
      final SComplexType container = ((SComplexType) _eContainer);
      SElementNature _nature_1 = container.getNature();
      boolean _notEquals = (!Objects.equal(_nature_1, SElementNature.DEDUCTION_RULE));
      if (_notEquals) {
        this.error("Features can only have deduction rule if the containing type also has a deduction rule.", feature.getDeductionRule(), SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDAttributeType(final SAttribute a) {
    SElementNature _nature = a.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((a.getDeductionRule().getSource() != null) && (!(a.getDeductionRule().getSource() instanceof DAttribute)))) {
        this.error("Deduced attribute rule must have a domain-model attribute as its source", a.getDeductionRule(), SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDQueryType(final SQuery q) {
    SElementNature _nature = q.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((q.getDeductionRule().getSource() != null) && (!(q.getDeductionRule().getSource() instanceof DQuery)))) {
        this.error("Deduced query rule must have a domain-model attribute as its source", q.getDeductionRule(), SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDAssociationType(final SAssociation a) {
    SElementNature _nature = a.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
    if (_equals) {
      if (((a.getDeductionRule().getSource() != null) && (!(a.getDeductionRule().getSource() instanceof DAssociation)))) {
        this.error("Deduced association rule must have a domain-model attribute as its source", SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
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
        this.error("Literals can only have deduction rule if the containing enumeration also has a deduction rule.", literal.getDeductionRule(), SimPackage.Literals.SDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkEnumerationHasLiterals(final SEnumeration e) {
    int _size = e.getLiterals().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("Enumeration does not declare literals", e, SimPackage.Literals.SNAMED_ELEMENT__NAME);
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
          EObject _eContainer = a.eContainer();
          String _name = a.getName();
          String _plus = ("Synthetic attribute \"" + _name);
          String _plus_1 = (_plus + "\": no mapping rule for type");
          this.errorOnSyntheticFeature(((SComplexType) _eContainer), _plus_1);
        } else {
          SType _type_1 = a.getType();
          boolean _not = (!(_type_1 instanceof SValueType));
          if (_not) {
            EObject _eContainer_1 = a.eContainer();
            String _name_1 = a.getName();
            String _plus_2 = ("Synthetic attribute \"" + _name_1);
            String _plus_3 = (_plus_2 + "\": referenced type is not a ValueType");
            this.errorOnSyntheticFeature(((SComplexType) _eContainer_1), _plus_3);
          }
        }
      }
    }
  }
  
  @Check
  public void checkAssocitionToRootType(final SAssociation a) {
    if ((Objects.equal(a.getNature(), SElementNature.GENUINE) && (!(a.getType() instanceof SRootType)))) {
      this.error("Referenced type is not a RootType", a, SimPackage.Literals.SFEATURE__TYPE);
    } else {
      SElementNature _nature = a.getNature();
      boolean _equals = Objects.equal(_nature, SElementNature.SYNTHETIC);
      if (_equals) {
        SType _type = a.getType();
        boolean _tripleEquals = (_type == null);
        if (_tripleEquals) {
          EObject _eContainer = a.eContainer();
          String _name = a.getName();
          String _plus = ("Synthetic reference \"" + _name);
          String _plus_1 = (_plus + "\": no mapping rule for type");
          this.errorOnSyntheticFeature(((SComplexType) _eContainer), _plus_1);
        } else {
          SType _type_1 = a.getType();
          boolean _not = (!(_type_1 instanceof SValueType));
          if (_not) {
            EObject _eContainer_1 = a.eContainer();
            String _name_1 = a.getName();
            String _plus_2 = ("Synthetic reference \"" + _name_1);
            String _plus_3 = (_plus_2 + "\": referenced type is not a RootType");
            this.errorOnSyntheticFeature(((SComplexType) _eContainer_1), _plus_3);
          }
        }
      }
    }
  }
  
  public void errorOnSyntheticFeature(final SDeducibleElement container, final String errorMsg) {
    SElementNature _nature = container.getNature();
    boolean _equals = Objects.equal(_nature, SElementNature.GENUINE);
    if (_equals) {
      if ((container instanceof SNamedElement)) {
        this.error(errorMsg, container, SimPackage.Literals.SNAMED_ELEMENT__NAME);
      } else {
        this.error(errorMsg, container, null);
      }
    } else {
      SElementNature _nature_1 = container.getNature();
      boolean _equals_1 = Objects.equal(_nature_1, SElementNature.DEDUCTION_RULE);
      if (_equals_1) {
        this.error(errorMsg, container, SimPackage.Literals.SDEDUCIBLE_ELEMENT__DEDUCTION_RULE);
      } else {
        EObject _eContainer = container.eContainer();
        this.errorOnSyntheticFeature(((SDeducibleElement) _eContainer), errorMsg);
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
    if (((!Objects.equal(p.getNature(), SElementNature.DEDUCTION_RULE)) && (!((p.getType() instanceof SValueType) || Objects.equal(p.getType(), p.eContainer()))))) {
      this.error("Refererenced type is not a ValueType nor the query\'s own container", p, SimPackage.Literals.SQUERY_PARAMETER__TYPE);
    }
  }
  
  public void checkNameStartsWithCapital(final SNamedElement ne) {
    final String name = ne.getName();
    if ((((name != null) && (name.length() > 0)) && (!Character.isUpperCase(name.charAt(0))))) {
      this.warning("Name should start with a capital", ne, SimPackage.Literals.SNAMED_ELEMENT__NAME);
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
      this.warning("Name should start with a lowercase or underscore", SimPackage.Literals.SNAMED_ELEMENT__NAME);
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
      this.warning("Name should be all upercase", SimPackage.Literals.SNAMED_ELEMENT__NAME);
    }
  }
}
