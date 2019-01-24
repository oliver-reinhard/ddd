/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dms.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DCondition;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DException;
import com.mimacom.ddd.dm.base.DExistingApplication;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DRelationship;
import com.mimacom.ddd.dm.base.DRootType;
import com.mimacom.ddd.dm.base.DServiceParameter;
import com.mimacom.ddd.dm.base.DTime;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IValueType;
import com.mimacom.ddd.dm.dms.DmsUtil;
import com.mimacom.ddd.dm.dms.validation.AbstractDmsValidator;
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider;
import java.util.Set;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DmsValidator extends AbstractDmsValidator {
  @Inject
  @Extension
  private DmsUtil _dmsUtil;
  
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
  public void checkAggregateHasSingleRoot(final DAggregate a) {
    final BasicEList<DIdentityType> roots = new BasicEList<DIdentityType>();
    EList<DType> _types = a.getTypes();
    for (final DType t : _types) {
      if ((t instanceof DIdentityType)) {
        roots.add(((DIdentityType)t));
      }
    }
    int _size = roots.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      for (final DIdentityType t_1 : roots) {
        this.error("Aggregate can only declare a single root or relationship", t_1, BasePackage.Literals.DNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkCyclicTypeHierarchy(final DComplexType t) {
    boolean _contains = this._dmsUtil.typeHierarchy(t).contains(t);
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
    final Set<String> inherited = this._dmsUtil.inheritedFeatureNames(t);
    EList<DFeature> _features = t.getFeatures();
    for (final DFeature f : _features) {
      boolean _contains = inherited.contains(f.getName());
      if (_contains) {
        this.error("Feature cannot override inherited feature with same name", f, BasePackage.Literals.DNAMED_ELEMENT__NAME);
      }
    }
  }
  
  @Check
  public void checkRelationshipHasTwoAssociations(final DRelationship r) {
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
      this.error("Refererenced type is not a ValueType", a, BasePackage.Literals.DTYPED_MEMBER__TYPE);
    }
  }
  
  @Check
  public void checkAssocitionToRootType(final DAssociation a) {
    DType _type = a.getType();
    boolean _not = (!(_type instanceof DRootType));
    if (_not) {
      this.error("Refererenced type is not a RootType", a, BasePackage.Literals.DTYPED_MEMBER__TYPE);
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
    DType _type = p.getType();
    boolean _not = (!(_type instanceof IValueType));
    if (_not) {
      this.error("Refererenced type is not a ValueType", p, BasePackage.Literals.DTYPED_MEMBER__TYPE);
    }
  }
  
  @Check
  public void checkParameterIsValueType(final DServiceParameter p) {
    DType _type = p.getType();
    boolean _not = (!(_type instanceof IValueType));
    if (_not) {
      this.error("Refererenced type is not a ValueType", p, BasePackage.Literals.DTYPED_MEMBER__TYPE);
    }
  }
  
  @Check
  public void checkTimeCannotBeNotified(final DNotification n) {
    DActor _notified = n.getNotified();
    if ((_notified instanceof DTime)) {
      this.error("Time cannot be notified", n, BasePackage.Literals.DNOTIFICATION__NOTIFIED);
    }
  }
  
  public void checkNameStartsWithCapital(final DNamedElement ne) {
    final String name = ne.getName();
    if ((((name != null) && (name.length() > 0)) && (!Character.isUpperCase(name.charAt(0))))) {
      this.warning("Name should start with a capital", ne, BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DDomain d) {
    if ((Objects.equal(DmxImportedNamespaceAwareLocalScopeProvider.DEFAULT_IMPORT_TYPES, d.getName()) || Objects.equal(DmxImportedNamespaceAwareLocalScopeProvider.DEFAULT_IMPORT_FUNCTIONS, d.getName()))) {
      return;
    }
    this.checkNameStartsWithCapital(d);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DType t) {
    this.checkNameStartsWithCapital(t);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DCondition c) {
    this.checkNameStartsWithCapital(c);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DActor a) {
    this.checkNameStartsWithCapital(a);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DExistingApplication ea) {
    this.checkNameStartsWithCapital(ea);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DException e) {
    this.checkNameStartsWithCapital(e);
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
  public void checkFeatureNameStartsWithLowercase(final DServiceParameter p) {
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
      this.warning("Name should be all upercase", BasePackage.Literals.DNAMED_ELEMENT__NAME);
    }
  }
}
