/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DContext;
import com.mimacom.ddd.dm.base.base.DEntityNature;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DState;
import com.mimacom.ddd.dm.base.base.DStateEvent;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.base.IValueType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQuery;
import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;
import com.mimacom.ddd.dm.dim.DimUtil;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import com.mimacom.ddd.dm.dim.derivedState.DimDerivedStateComputer;
import com.mimacom.ddd.dm.dim.validation.AbstractDimValidator;
import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes;
import java.util.List;
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
  
  protected static final BasePackage BASE = BasePackage.eINSTANCE;
  
  @Check
  public void checkDomainDeclaresOnlyValueTypes(final DomainInformationModel d) {
    EList<DType> _types = d.getTypes();
    for (final DType vt : _types) {
      if ((!(vt instanceof IValueType))) {
        this.error("Declared type is not a value type", vt, DimValidator.BASE.getDNamedElement_Name());
      } else {
        if ((vt instanceof DComplexType)) {
          EList<DFeature> _features = ((DComplexType)vt).getFeatures();
          for (final DFeature f : _features) {
            if ((f instanceof DAssociation)) {
              this.error("Declared feature cannot be an association", f, DimValidator.BASE.getDNamedElement_Name());
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
          DimValidator.BASE.getDNamedElement_Name());
      }
    }
  }
  
  @Check
  public void checkCyclicTypeHierarchy(final DComplexType t) {
    boolean _contains = this._dimUtil.typeHierarchy(t).contains(t);
    if (_contains) {
      this.error("Type is part of a supertype cycle", t, DimValidator.BASE.getDNamedElement_Name());
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
        this.error("Supertype is not compatible", t, DimValidator.BASE.getDNamedElement_Name());
      } else {
        if ((t instanceof DEntityType)) {
          boolean _isRoot = ((DEntityType)t).isRoot();
          DComplexType _superType_1 = ((DEntityType)t).getSuperType();
          boolean _isRoot_1 = ((DEntityType) _superType_1).isRoot();
          boolean _tripleNotEquals_2 = (Boolean.valueOf(_isRoot) != Boolean.valueOf(_isRoot_1));
          if (_tripleNotEquals_2) {
            this.error("Entity or relationship root property must match supertype\'s root property", t, DimValidator.BASE.getDNamedElement_Name());
          }
        }
      }
      final DomainInformationModel tDomain = EcoreUtil2.<DomainInformationModel>getContainerOfType(t, DomainInformationModel.class);
      final DomainInformationModel superTypeDomain = EcoreUtil2.<DomainInformationModel>getContainerOfType(t.getSuperType(), DomainInformationModel.class);
      if ((superTypeDomain != tDomain)) {
        this.error("Supertype must be in same domain", t, DimValidator.BASE.getDNamedElement_Name());
      }
    }
  }
  
  @Check
  public void checkNoFeatureOverrides(final DComplexType t) {
    final Set<String> inherited = this._dimUtil.inheritedFeatureNames(t);
    EList<DFeature> _features = t.getFeatures();
    for (final DFeature f : _features) {
      if ((inherited.contains(f.getName()) && (!Objects.equal(f.getName(), DimDerivedStateComputer.SYNTHETIC_STATE_QUERY_NAME)))) {
        String _name = f.getName();
        String _plus = ("Feature \'" + _name);
        String _plus_1 = (_plus + "\' cannot override inherited feature of same name");
        this.error(_plus_1, f, DimValidator.BASE.getDNamedElement_Name());
      }
    }
  }
  
  @Check
  public void checkRelationshipHasTwoAssociations(final DEntityType r) {
    DEntityNature _nature = r.getNature();
    boolean _equals = Objects.equal(_nature, DEntityNature.RELATIONSHIP);
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
        this.error("A relationship must declare at least 2 associations", r, DimValidator.BASE.getDNamedElement_Name());
      }
    }
  }
  
  @Check
  public void checkPrimitiveDoesNotRedefineItself(final DPrimitive p) {
    DPrimitive _redefines = p.getRedefines();
    boolean _equals = Objects.equal(_redefines, p);
    if (_equals) {
      this.error("Primitive cannot redefine itself", p, DimValidator.BASE.getDPrimitive_Redefines());
    }
  }
  
  @Check
  public void checkEnumerationHasLiterals(final DEnumeration e) {
    int _size = e.getLiterals().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("Enumeration does not declare literals", e, DimValidator.BASE.getDNamedElement_Name());
    }
  }
  
  @Check
  public void checkFeatureTypeIsSet(final DFeature f) {
    DType _type = f.getType();
    boolean _tripleEquals = (_type == null);
    if (_tripleEquals) {
      this.error("Feature must have a type", f, DimValidator.BASE.getDNamedElement_Name());
    }
  }
  
  @Check
  public void checkNoFeatureNamedState(final DFeature f) {
    String _name = f.getName();
    boolean _equals = Objects.equal(_name, DimDerivedStateComputer.SYNTHETIC_STATE_QUERY_NAME);
    if (_equals) {
      final IFeatureContainer container = EcoreUtil2.<IFeatureContainer>getContainerOfType(f, IFeatureContainer.class);
      if ((container instanceof DEntityType)) {
        final Set<DComplexType> superTypes = this._dimUtil.typeHierarchy(((DComplexType)container));
        final Function1<DComplexType, Boolean> _function = (DComplexType t) -> {
          return Boolean.valueOf(((t instanceof DEntityType) && (!((DEntityType) t).getStates().isEmpty())));
        };
        boolean _exists = IterableExtensions.<DComplexType>exists(superTypes, _function);
        if (_exists) {
          if ((f instanceof TSyntheticQuery)) {
            this.error("Cannot declare states while states or a \'state\' feature are declared for one of its super types.", container, 
              DimValidator.BASE.getDEntityType_States());
          } else {
            this.error("Cannot declare a \'state\' feature while states or a \'state\' feature are declared for one of its super types.", f, 
              DimValidator.BASE.getDNamedElement_Name());
          }
        }
      }
    }
  }
  
  @Check
  public void checkNoEnumNamedState(final DEnumeration e) {
    if ((e.getName().endsWith(DimDerivedStateComputer.SYNTHETIC_STATES_ENUM_SUFFIX) && (!(e instanceof TSyntheticEnumeration)))) {
      final ITypeContainer container = EcoreUtil2.<ITypeContainer>getContainerOfType(e, ITypeContainer.class);
      if ((container != null)) {
        final int len = DimDerivedStateComputer.SYNTHETIC_STATES_ENUM_SUFFIX.length();
        String _name = e.getName();
        int _length = e.getName().length();
        int _minus = (_length - len);
        final String entityName = _name.substring(0, _minus);
        final Function1<DEntityType, Boolean> _function = (DEntityType it) -> {
          String _name_1 = it.getName();
          return Boolean.valueOf(Objects.equal(_name_1, entityName));
        };
        final DEntityType candidate = IterableExtensions.<DEntityType>head(IterableExtensions.<DEntityType>filter(Iterables.<DEntityType>filter(container.getTypes(), DEntityType.class), _function));
        if (((candidate != null) && (!candidate.getStates().isEmpty()))) {
          String _name_1 = e.getName();
          String _plus = ("Cannot declare a \'" + _name_1);
          String _plus_1 = (_plus + "\' enumeration while entity \'");
          String _name_2 = candidate.getName();
          String _plus_2 = (_plus_1 + _name_2);
          String _plus_3 = (_plus_2 + "\' declares states.");
          this.error(_plus_3, e, 
            DimValidator.BASE.getDNamedElement_Name());
        }
      }
    }
  }
  
  @Check
  public void checkAttributeIsValueType(final DAttribute a) {
    DType _type = a.getType();
    boolean _not = (!(_type instanceof IValueType));
    if (_not) {
      this.error("Referenced type must be a ValueType", a, DimValidator.BASE.getDNavigableMember_Type());
    }
  }
  
  @Check
  public void checkRealWorldEntityType(final DEntityType e) {
    if ((Objects.equal(e.getNature(), DEntityNature.AUTONOMOUS_ENTITY) && e.isAbstract())) {
      this.error("Autonomous entities cannot be abstract", e, DimValidator.BASE.getDComplexType_Abstract());
    }
  }
  
  @Check
  public void checkAssocitionToEntityType(final DAssociation a) {
    DType _type = a.getType();
    boolean _not = (!(_type instanceof DEntityType));
    if (_not) {
      this.error("Referenced type must be an EntityType", a, DimValidator.BASE.getDNavigableMember_Type());
    }
  }
  
  @Check
  public void checkAssociationMultiplicities(final DMultiplicity m) {
    int _maxOccurs = m.getMaxOccurs();
    boolean _equals = (_maxOccurs == 0);
    if (_equals) {
      this.error("Maximum targets cannot be 0", m, DimValidator.BASE.getDMultiplicity_MaxOccurs());
    }
  }
  
  @Check
  public void checkQueryType(final DQuery q) {
    this.checkMemberType(q);
  }
  
  @Check
  public void checkQueryParameterType(final DQueryParameter p) {
    this.checkMemberType(p);
  }
  
  protected void checkMemberType(final DNavigableMember member) {
    boolean _isAllowedMemberType = this.isAllowedMemberType(member);
    boolean _not = (!_isAllowedMemberType);
    if (_not) {
      this.error(("Referenced " + DimValidator.ILLEGAL_MEMBER_TYPE_MSG), member, DimValidator.BASE.getDNavigableMember_Type());
    }
  }
  
  protected static final String ILLEGAL_MEMBER_TYPE_MSG = "type must be a ValueType, the query\'s own container, or the component\'s main entity";
  
  protected boolean isAllowedMemberType(final DNavigableMember member) {
    final DComplexType containingType = EcoreUtil2.<DComplexType>getContainerOfType(member, DComplexType.class);
    final DAggregate aggregate = EcoreUtil2.<DAggregate>getContainerOfType(member, DAggregate.class);
    final DType type = member.getType();
    return (((type instanceof IValueType) || Objects.equal(type, containingType)) || 
      (((type instanceof DEntityType) && ((DEntityType) type).isRoot()) && this.allTypes(aggregate).contains(type)));
  }
  
  protected List<DType> allTypes(final DAggregate a) {
    return a.getTypes();
  }
  
  /**
   * Naming: Elements whose names should start with a CAPITAL
   */
  protected void checkNameStartsWithCapitalImpl(final String name, final DNamedElement ne) {
    if ((!(ne instanceof ISyntheticElement))) {
      if ((((name != null) && (name.length() > 0)) && (!Character.isUpperCase(name.charAt(0))))) {
        this.warning("Name should start with a capital", ne, DimValidator.BASE.getDNamedElement_Name());
      }
    }
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DomainInformationModel d) {
    String _name = d.getName();
    boolean _equals = Objects.equal(DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.DEFAULT_IMPORT_TYPES, _name);
    if (_equals) {
      return;
    } else {
      if (((d.getName() != null) && d.getName().startsWith((DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.PREFIX + ".")))) {
        this.checkNameStartsWithCapitalImpl(d.getName().substring(3), d);
        return;
      }
    }
    this.checkNameStartsWithCapitalImpl(d.getName(), d);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DAggregate a) {
    this.checkNameStartsWithCapitalImpl(a.getName(), a);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DType t) {
    this.checkNameStartsWithCapitalImpl(t.getName(), t);
  }
  
  @Check
  public void checkTypeNameStartsWithCapital(final DNamedPredicate c) {
    this.checkNameStartsWithCapitalImpl(c.getName(), c);
  }
  
  /**
   * Naming: Elements whose names should start with a LOWERCASE
   */
  protected void checkNameStartsWithLowercaseImpl(final DNamedElement ne) {
    if ((!(ne instanceof ISyntheticElement))) {
      String _name = ne.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        final char first = ne.getName().charAt(0);
        final char underscore = '_';
        if (((!Character.isLowerCase(first)) && (first != underscore))) {
          this.warning("Name should start with a lowercase or underscore", DimValidator.BASE.getDNamedElement_Name());
        }
      }
    }
  }
  
  @Check
  public void checkFeatureNameStartsWithLowercase(final DFeature f) {
    this.checkNameStartsWithLowercaseImpl(f);
  }
  
  @Check
  public void checkFeatureNameStartsWithLowercase(final DQueryParameter p) {
    this.checkNameStartsWithLowercaseImpl(p);
  }
  
  @Check
  public void checkFeatureNameStartsWithLowercase(final DContext c) {
    this.checkNameStartsWithLowercaseImpl(c);
  }
  
  /**
   * Naming: Elements whose names should be ALL UPPERCASE
   */
  protected void checkLiteralIsUppercaseImpl(final DNamedElement ne) {
    if ((!(ne instanceof ISyntheticElement))) {
      final String name = ne.getName();
      if (((name != null) && (!name.equals(name.toUpperCase())))) {
        String _name = ne.getName();
        String _plus = ("Name should be all uppercase: " + _name);
        this.warning(_plus, DimValidator.BASE.getDNamedElement_Name());
      }
    }
  }
  
  @Check
  public void checkLiteralIsUppercase(final DLiteral literal) {
    this.checkLiteralIsUppercaseImpl(literal);
  }
  
  @Check
  public void checkStateNameIsUppercase(final DState state) {
    this.checkLiteralIsUppercaseImpl(state);
  }
  
  @Check
  public void checkStateEventNameIsUppercase(final DStateEvent event) {
    this.checkLiteralIsUppercaseImpl(event);
  }
}
