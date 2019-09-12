/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DEntityOrigin;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DState;
import com.mimacom.ddd.dm.base.DStateEvent;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IValueType;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.dm.dim.validation.AbstractDimValidator;
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DimValidator extends AbstractDimValidator {
  @Inject
  @Extension
  private DimUtil _dimUtil;
  
  private final String NAME_ALL_UPPERCASE = "Name should be all upercase";
  
  @Check
  public void checkDomainDeclaresOnlyValueTypes(final DDomain d) {
    EList<DType> _types = d.getTypes();
    for (final DType vt : _types) {
      if ((!(vt instanceof IValueType))) {
        this.error("Declared type is not a value type", vt, BasePackage.Literals.DNAMED_ELEMENT__NAME);
      } else {
        if ((vt instanceof DComplexType)) {
          final DComplexType ct = ((DComplexType) vt);
          EList<DFeature> _features = ct.getFeatures();
          for (final DFeature f : _features) {
            if ((f instanceof DAssociation)) {
              this.error("Declared feature cannot be an association", f, BasePackage.Literals.DNAMED_ELEMENT__NAME);
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkAggregateHasSingleRootOrRootHiearchy(final DAggregate a) {
    final Function1<DEntityType, Boolean> _function = (DEntityType it) -> {
      return Boolean.valueOf(it.isRoot());
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
        this.error("Aggregate can only declare a single root / main entity or relationship or a a single hierarchy thereof", r, 
          BasePackage.Literals.DNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkCyclicTypeHierarchy(final DComplexType t) {
    boolean _contains = this._dimUtil.typeHierarchy(t).contains(t);
    if (_contains) {
      this.error("Type is part of a supertype cycle", t, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
  
  @Check
  public void checkSupertype(final DComplexType t) {
    DComplexType _superType = t.getSuperType();
    boolean _tripleNotEquals = (_superType != null);
    if (_tripleNotEquals) {
      EClass _eClass = t.getSuperType().eClass();
      EClass _eClass_1 = t.eClass();
      boolean _tripleNotEquals_1 = (_eClass != _eClass_1);
      if (_tripleNotEquals_1) {
        this.error("Supertype is not compatible", t, BasePackage.Literals.DNAMED_ELEMENT__NAME);
      } else {
        if ((t instanceof DEntityType)) {
          boolean _isRoot = ((DEntityType)t).isRoot();
          DComplexType _superType_1 = ((DEntityType)t).getSuperType();
          boolean _isRoot_1 = ((DEntityType) _superType_1).isRoot();
          boolean _tripleNotEquals_2 = (Boolean.valueOf(_isRoot) != Boolean.valueOf(_isRoot_1));
          if (_tripleNotEquals_2) {
            this.error("Entity or relationship root property must match supertype\'s root property", t, 
              BasePackage.Literals.DNAMED_ELEMENT__NAME);
          }
        }
      }
      final DDomain tDomain = EcoreUtil2.<DDomain>getContainerOfType(t, DDomain.class);
      final DDomain superTypeDomain = EcoreUtil2.<DDomain>getContainerOfType(t.getSuperType(), DDomain.class);
      if ((superTypeDomain != tDomain)) {
        this.error("Supertype must be in same domain", t, BasePackage.Literals.DNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkNoFeatureOverrides(final DComplexType t) {
    final Set<String> inherited = this._dimUtil.inheritedFeatureNames(t);
    EList<DFeature> _features = t.getFeatures();
    for (final DFeature f : _features) {
      boolean _contains = inherited.contains(f.getName());
      if (_contains) {
        this.error("Feature cannot override inherited feature with same name", f, BasePackage.Literals.DNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkRelationshipHasTwoAssociations(final DEntityType r) {
    DEntityOrigin _origin = r.getOrigin();
    boolean _equals = Objects.equal(_origin, DEntityOrigin.RELATIONSHIP);
    if (_equals) {
      int count = 0;
      int _size = r.getFeatures().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        DFeature _get = r.getFeatures().get((i).intValue());
        if ((_get instanceof DAssociation)) {
          count++;
        }
      }
      if ((count < 2)) {
        this.error("A relationship must declare at least 2 associations", r, BasePackage.Literals.DNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkPrimitiveDoesNotRedefineItself(final DPrimitive p) {
    DPrimitive _redefines = p.getRedefines();
    boolean _equals = Objects.equal(_redefines, p);
    if (_equals) {
      this.error("Primitive cannot redefine itself", p, BasePackage.Literals.DPRIMITIVE__REDEFINES);
    }
  }
  
  @Check
  public void checkEnumerationHasLiterals(final DEnumeration e) {
    int _size = e.getLiterals().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("Enumeration does not declare literals", e, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
  
  @Check
  public void checkAttributeIsValueType(final DAttribute a) {
    DType _type = a.getType();
    boolean _not = (!(_type instanceof IValueType));
    if (_not) {
      this.error("Refererenced type is not a ValueType", a, BasePackage.Literals.DNAVIGABLE_MEMBER__TYPE);
    }
  }
  
  @Check
  public void checkRealWorldEntityType(final DEntityType e) {
    if ((Objects.equal(e.getOrigin(), DEntityOrigin.PHYSICAL_OBJECT) && e.isAbstract())) {
      this.error("Entity Types representng real-world objects cannot be abstract", e, BasePackage.Literals.DCOMPLEX_TYPE__ABSTRACT);
    }
  }
  
  @Check
  public void checkAssocitionToEntityType(final DAssociation a) {
    DType _type = a.getType();
    boolean _not = (!(_type instanceof DEntityType));
    if (_not) {
      this.error("Refererenced type is not an EntityType", a, BasePackage.Literals.DNAVIGABLE_MEMBER__TYPE);
    }
  }
  
  @Check
  public void checkAssociationMultiplicities(final DMultiplicity m) {
    int _maxOccurs = m.getMaxOccurs();
    boolean _equals = (_maxOccurs == 0);
    if (_equals) {
      this.error("Maximum targets cannot be 0", m, BasePackage.Literals.DMULTIPLICITY__MAX_OCCURS);
    }
  }
  
  @Check
  public void checkParameterIsValueType(final DQueryParameter p) {
    boolean _not = (!((p.getType() instanceof IValueType) || Objects.equal(p.getType(), p.eContainer())));
    if (_not) {
      this.error("Refererenced type is not a ValueType nor the query\'s own container", p, BasePackage.Literals.DNAVIGABLE_MEMBER__TYPE);
    }
  }
  
  protected void checkNameStartsWithCapitalImpl(final String name, final DNamedElement ne) {
    if ((((name != null) && (name.length() > 0)) && (!Character.isUpperCase(name.charAt(0))))) {
      this.warning("Name should start with a capital", ne, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
  
  public void checkNameStartsWithCapital(final DNamedElement ne) {
    this.checkNameStartsWithCapitalImpl(ne.getName(), ne);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DDomain d) {
    String _name = d.getName();
    boolean _equals = Objects.equal(DmxImportedNamespaceAwareLocalScopeProvider.DEFAULT_IMPORT_TYPES, _name);
    if (_equals) {
      return;
    } else {
      boolean _startsWith = d.getName().startsWith((DmxImportedNamespaceAwareLocalScopeProvider.PREFIX + "."));
      if (_startsWith) {
        this.checkNameStartsWithCapitalImpl(d.getName().substring(3), d);
        return;
      }
    }
    this.checkNameStartsWithCapital(d);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DType t) {
    this.checkNameStartsWithCapital(t);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DNamedPredicate c) {
    this.checkNameStartsWithCapital(c);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DActor a) {
    this.checkNameStartsWithCapital(a);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DDomainEvent de) {
    this.checkNameStartsWithCapital(de);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DNotification n) {
    this.checkNameStartsWithCapital(n);
  }
  
  public void checkNameStartsWithLowercase(final DNamedElement ne) {
    final char first = ne.getName().charAt(0);
    final char underscore = '_';
    if (((!Character.isLowerCase(first)) && (first != underscore))) {
      this.warning("Name should start with a lowercase or underscore", BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
  
  @Check
  public void checkFeatureNameStartsWithLowercase(final DFeature f) {
    this.checkNameStartsWithLowercase(f);
  }
  
  @Check
  public void checkFeatureNameStartsWithLowercase(final DQueryParameter p) {
    this.checkNameStartsWithLowercase(p);
  }
  
  @Check
  public void checkFeatureNameStartsWithLowercase(final DContext c) {
    this.checkNameStartsWithLowercase(c);
  }
  
  @Check
  public void checkLiteralIsUppercase(final DLiteral literal) {
    boolean _equals = literal.getName().equals(literal.getName().toUpperCase());
    boolean _not = (!_equals);
    if (_not) {
      this.warning(this.NAME_ALL_UPPERCASE, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
  
  @Check
  public void checkStateNameIsUppercase(final DState state) {
    boolean _equals = state.getName().equals(state.getName().toUpperCase());
    boolean _not = (!_equals);
    if (_not) {
      this.warning(this.NAME_ALL_UPPERCASE, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
  
  @Check
  public void checkStateEventNameIsUppercase(final DStateEvent event) {
    boolean _equals = event.getName().equals(event.getName().toUpperCase());
    boolean _not = (!_equals);
    if (_not) {
      this.warning(this.NAME_ALL_UPPERCASE, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
}
