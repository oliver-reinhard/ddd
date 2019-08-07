/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IIdentityType;
import com.mimacom.ddd.dm.base.IValueType;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.sm.sim.SAssociationDeduction;
import com.mimacom.ddd.sm.sim.SAttributeDeduction;
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;
import com.mimacom.ddd.sm.sim.SDetailTypeDeduction;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SEntityTypeDeduction;
import com.mimacom.ddd.sm.sim.SEnumerationDeduction;
import com.mimacom.ddd.sm.sim.SFeatureDeduction;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SImplicitElementDeduction;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.SLiteralDeduction;
import com.mimacom.ddd.sm.sim.SQueryDeduction;
import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.STristate;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import com.mimacom.ddd.sm.sim.SimPackage;
import com.mimacom.ddd.sm.sim.SimUtil;
import com.mimacom.ddd.sm.sim.validation.AbstractSimValidator;
import org.eclipse.emf.ecore.EObject;
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
  private DimUtil _dimUtil;
  
  @Inject
  @Extension
  private SimUtil _simUtil;
  
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  @Check
  @Override
  public void checkAggregateHasSingleRootOrRootHiearchy(final DAggregate a) {
    final Function1<DEntityType, Boolean> _function = (DEntityType it) -> {
      return Boolean.valueOf(((!(it instanceof SEntityTypeDeduction)) && it.isRoot()));
    };
    final Iterable<DEntityType> roots = IterableExtensions.<DEntityType>filter(Iterables.<DEntityType>filter(a.getTypes(), DEntityType.class), _function);
    final Function1<DEntityType, Boolean> _function_1 = (DEntityType it) -> {
      DAggregate _aggregate = this._dimUtil.aggregate(it.getSuperType());
      return Boolean.valueOf((!Objects.equal(_aggregate, a)));
    };
    final Iterable<DEntityType> topLevelRoots = IterableExtensions.<DEntityType>filter(roots, _function_1);
    int _size = IterableExtensions.size(topLevelRoots);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      for (final DEntityType r : roots) {
        this.error("Aggregate can only declare a single root or relationship or a single hierarchy thereof", r, BasePackage.Literals.DNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDEntityType(final SEntityTypeDeduction t) {
    final IDeducibleElement source = t.getDeductionRule().getSource();
    if ((source instanceof DEntityType)) {
      boolean _isRoot = ((DEntityType)source).isRoot();
      boolean _isRoot_1 = t.isRoot();
      boolean _tripleNotEquals = (Boolean.valueOf(_isRoot) != Boolean.valueOf(_isRoot_1));
      if (_tripleNotEquals) {
        this.error("Deduced entity rule must match domain-model root property", t.getDeductionRule(), 
          BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
      }
    } else {
      if ((source != null)) {
        this.error("Deduced entity rule must have a domain-model entity as its source", t.getDeductionRule(), 
          BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkCorrespondingDDetailType(final SDetailTypeDeduction t) {
    if (((t.getDeductionRule().getSource() != null) && (!(t.getDeductionRule().getSource() instanceof DDetailType)))) {
      this.error("Deduced DetailType rule must have a domain-model DetailType as its source", t.getDeductionRule(), 
        BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
    }
  }
  
  @Check
  public void checkRootPropertyForDetailType(final SDetailTypeDeduction t) {
    final DDeductionRule rule = t.getDeductionRule();
    if ((rule instanceof SStructureChangingRule)) {
      STristate _rootEntity = ((SStructureChangingRule)rule).getRootEntity();
      final boolean setsRootProperty = (!Objects.equal(_rootEntity, STristate.DONT_CARE));
      if (setsRootProperty) {
        this.warning("Setting the root property for DetailTypes does not have any effect.", rule, 
          SimPackage.Literals.SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY);
      }
    }
  }
  
  @Check
  public void checkDeducedFeaturesCombination(final SComplexTypeDeduction t) {
    DDeductionRule _deductionRule = t.getDeductionRule();
    if ((_deductionRule instanceof SGrabRule)) {
      final Iterable<SFeatureDeduction> featureDeductionDefinitions = Iterables.<SFeatureDeduction>filter(((DComplexType) t).getFeatures(), SFeatureDeduction.class);
      final Function1<SFeatureDeduction, Boolean> _function = (SFeatureDeduction it) -> {
        DDeductionRule _deductionRule_1 = it.getDeductionRule();
        return Boolean.valueOf((_deductionRule_1 instanceof SDitchRule));
      };
      final boolean hasDitchElements = IterableExtensions.<SFeatureDeduction>exists(featureDeductionDefinitions, _function);
      final Function1<SFeatureDeduction, Boolean> _function_1 = (SFeatureDeduction it) -> {
        DDeductionRule _deductionRule_1 = it.getDeductionRule();
        return Boolean.valueOf((_deductionRule_1 instanceof SGrabRule));
      };
      final boolean hasGrabElements = IterableExtensions.<SFeatureDeduction>exists(featureDeductionDefinitions, _function_1);
      if ((hasDitchElements && hasGrabElements)) {
        this.error("Cannot use both grab rule and ditch rules together.", t.getDeductionRule(), 
          BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
      }
    }
  }
  
  @Check
  public void checkComplexTypeExtensionChange(final SStructureChangingRule r) {
    DType _extendFrom = r.getExtendFrom();
    boolean _tripleNotEquals = (_extendFrom != null);
    if (_tripleNotEquals) {
      final EObject container = r.eContainer();
      if ((container instanceof SComplexTypeDeduction)) {
        Class<? extends DType> _baseImplClass = this._simUtil.baseImplClass(((STypeDeduction)container));
        Class<? extends DType> _class = r.getExtendFrom().getClass();
        boolean _notEquals = (!Objects.equal(_baseImplClass, _class));
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
  public void checkHasDeducedContainer(final SFeatureDeduction f) {
    final EObject container = f.eContainer();
    if ((!(container instanceof SComplexTypeDeduction))) {
      this.error("Features can only have a deduction rule if the containing type also has a deduction rule.", f.getDeductionRule(), 
        BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
    }
  }
  
  @Check
  public void checkCorrespondingDAttributeType(final SAttributeDeduction a) {
    if (((a.getDeductionRule().getSource() != null) && (!(a.getDeductionRule().getSource() instanceof DAttribute)))) {
      this.error("Deduced attribute rule must have a domain-model attribute as its source", a.getDeductionRule(), 
        BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
    }
  }
  
  @Check
  public void checkCorrespondingDQueryType(final SQueryDeduction q) {
    if (((q.getDeductionRule().getSource() != null) && (!(q.getDeductionRule().getSource() instanceof DQuery)))) {
      this.error("Deduced query rule must have a domain-model attribute as its source", q.getDeductionRule(), 
        BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
    }
  }
  
  @Check
  public void checkCorrespondingDAssociationType(final SAssociationDeduction a) {
    if (((a.getDeductionRule().getSource() != null) && (!(a.getDeductionRule().getSource() instanceof DAssociation)))) {
      this.error("Deduced association rule must have a domain-model association as its source", 
        BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
    }
  }
  
  @Check
  public void checkHasDeducedEnumeration(final SLiteralDeduction literal) {
    final EObject container = literal.eContainer();
    if ((!(container instanceof SEnumerationDeduction))) {
      this.error("Literals can only have a deduction rule if the containing enumeration also has a deduction rule.", 
        literal.getDeductionRule(), BasePackage.Literals.DDEDUCTION_RULE__SOURCE);
    }
  }
  
  @Check
  @Override
  public void checkEnumerationHasLiterals(final DEnumeration e) {
    if ((e instanceof IDeductionDefinition)) {
      return;
    }
    super.checkEnumerationHasLiterals(e);
  }
  
  @Check
  @Override
  public void checkAttributeIsValueType(final DAttribute a) {
    if ((a instanceof IDeductionDefinition)) {
      return;
    }
    if (((!a.isSynthetic()) && (!(a.getType() instanceof IValueType)))) {
      super.checkAttributeIsValueType(a);
    } else {
      boolean _isSynthetic = a.isSynthetic();
      if (_isSynthetic) {
        DType _type = a.getType();
        boolean _tripleEquals = (_type == null);
        if (_tripleEquals) {
          String _description = this.getDescription(a);
          String _plus = (_description + ": no mapping rule for type");
          this.errorOnStructuralElement(a, _plus);
        } else {
          DType _type_1 = a.getType();
          boolean _not = (!(_type_1 instanceof IValueType));
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
  public void checkAssocitionToRootType(final DAssociation a) {
    if ((a instanceof IDeductionDefinition)) {
      return;
    }
    boolean _isSynthetic = a.isSynthetic();
    if (_isSynthetic) {
      DType _type = a.getType();
      boolean _tripleEquals = (_type == null);
      if (_tripleEquals) {
        String _description = this.getDescription(a);
        String _plus = (_description + ": no mapping rule for type");
        this.errorOnStructuralElement(a, _plus);
      } else {
        DType _type_1 = a.getType();
        boolean _not = (!(_type_1 instanceof IIdentityType));
        if (_not) {
          String _description_1 = this.getDescription(a);
          String _plus_1 = (_description_1 + ": referenced type is not an IdentityType");
          this.errorOnStructuralElement(a, _plus_1);
        }
      }
    }
  }
  
  @Check
  @Override
  public void checkParameterIsValueType(final DQueryParameter p) {
    if ((p instanceof IDeductionDefinition)) {
      return;
    }
    boolean _isSynthetic = p.isSynthetic();
    boolean _not = (!_isSynthetic);
    if (_not) {
      boolean _not_1 = (!((p.getType() instanceof IValueType) || Objects.equal(p.getType(), p.eContainer())));
      if (_not_1) {
        this.error("Refererenced query-parameter type is neither a ValueType nor the query\'s own container", p, 
          BasePackage.Literals.DNAVIGABLE_MEMBER__TYPE);
      }
    } else {
      DType _type = p.getType();
      boolean _tripleEquals = (_type == null);
      if (_tripleEquals) {
        String _description = this.getDescription(p);
        String _plus = (_description + ": no mapping rule for type");
        this.errorOnStructuralElement(p, _plus);
      } else {
        boolean _not_2 = (!((p.getType() instanceof IValueType) || Objects.equal(p.getType(), p.eContainer())));
        if (_not_2) {
          String _description_1 = this.getDescription(p);
          String _plus_1 = (_description_1 + ": type is neither a ValueType nor the query\'s own container");
          this.errorOnStructuralElement(p, _plus_1);
        }
      }
    }
  }
  
  @Check
  public void checkCoreQueryInCoreModel(final DQuery q) {
    final EObject eContainer = q.eContainer();
    if ((eContainer instanceof SInformationModel)) {
      SInformationModelKind _kind = ((SInformationModel)eContainer).getKind();
      boolean _tripleNotEquals = (_kind != SInformationModelKind.CORE);
      if (_tripleNotEquals) {
        this.error("Core queries can only be defined in core interface models", eContainer, SimPackage.Literals.SINFORMATION_MODEL__QUERIES);
      }
    }
  }
  
  protected String getDescription(final EObject obj) {
    String _xblockexpression = null;
    {
      String synthetic = "";
      if ((obj instanceof IDeducibleElement)) {
        boolean _isSynthetic = ((IDeducibleElement)obj).isSynthetic();
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
    if ((e instanceof IDeducibleElement)) {
      boolean _isSynthetic = ((IDeducibleElement)e).isSynthetic();
      if (_isSynthetic) {
        final IDeductionDefinition definition = ((IDeducibleElement)e).getDeducedFrom();
        if ((definition instanceof SImplicitElementDeduction)) {
          this.warningOnStructuralElementImpl(((SImplicitElementDeduction)definition).getOriginalDeductionDefinition(), warningMsg);
        } else {
          final EObject container = ((IDeducibleElement)e).eContainer();
          if ((container instanceof IDeducibleElement)) {
            this.warningOnStructuralElement(container, warningMsg);
          } else {
            this.warningOnStructuralElementImpl(container, warningMsg);
          }
        }
      } else {
        if ((e instanceof IDeductionDefinition)) {
          this.warning(warningMsg, e, BasePackage.Literals.IDEDUCTION_DEFINITION__DEDUCTION_RULE);
        } else {
          boolean _isSynthetic_1 = ((IDeducibleElement)e).isSynthetic();
          boolean _not = (!_isSynthetic_1);
          if (_not) {
            this.warningOnStructuralElementImpl(e, warningMsg);
          }
        }
      }
    } else {
      this.warningOnStructuralElementImpl(e, warningMsg);
    }
  }
  
  protected void warningOnStructuralElementImpl(final EObject obj, final String warningMsg) {
    if ((obj instanceof DNamedElement)) {
      this.warning(warningMsg, obj, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    } else {
      this.warning(warningMsg, obj, null);
    }
  }
  
  protected void errorOnStructuralElement(final EObject e, final String errorMsg) {
    if ((e instanceof IDeducibleElement)) {
      boolean _isSynthetic = ((IDeducibleElement)e).isSynthetic();
      if (_isSynthetic) {
        final IDeductionDefinition definition = ((IDeducibleElement)e).getDeducedFrom();
        if ((definition instanceof SImplicitElementDeduction)) {
          this.errorOnStructuralElementImpl(((SImplicitElementDeduction)definition).getOriginalDeductionDefinition(), errorMsg);
        } else {
          final EObject container = ((IDeducibleElement)e).eContainer();
          if ((container instanceof IDeducibleElement)) {
            this.errorOnStructuralElement(container, errorMsg);
          } else {
            this.errorOnStructuralElementImpl(container, errorMsg);
          }
        }
      } else {
        if ((e instanceof IDeductionDefinition)) {
          this.error(errorMsg, e, BasePackage.Literals.IDEDUCTION_DEFINITION__DEDUCTION_RULE);
        } else {
          boolean _isSynthetic_1 = ((IDeducibleElement)e).isSynthetic();
          boolean _not = (!_isSynthetic_1);
          if (_not) {
            this.errorOnStructuralElementImpl(e, errorMsg);
          }
        }
      }
    } else {
      this.errorOnStructuralElementImpl(e, errorMsg);
    }
  }
  
  protected void errorOnStructuralElementImpl(final EObject obj, final String errorMsg) {
    if ((obj instanceof DNamedElement)) {
      this.error(errorMsg, obj, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    } else {
      this.error(errorMsg, obj, null);
    }
  }
}
