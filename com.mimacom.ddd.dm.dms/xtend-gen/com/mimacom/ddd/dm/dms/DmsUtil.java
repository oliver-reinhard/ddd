package com.mimacom.ddd.dm.dms;

import com.google.common.base.Objects;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DRootType;
import com.mimacom.ddd.dm.base.DType;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DmsUtil {
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
      _xifexpression = "undefined";
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
      _xifexpression = a.getRootName();
    } else {
      _xifexpression = "undefined";
    }
    return _xifexpression;
  }
  
  /**
   * Precondition: d is the domain owning the association
   */
  public boolean isTargetInsideDomain(final DAssociation a, final DDomain d) {
    DRootType _targetType = a.getTargetType();
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
}
