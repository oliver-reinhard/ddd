package com.mimacom.ddd.sm.sms;

import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.sm.sms.SComplexType;
import com.mimacom.ddd.sm.sms.SFeature;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class SmsUtil {
  /**
   * Returns all the supertypes of the given type.
   */
  public Set<SComplexType> typeHierarchy(final SComplexType type) {
    final LinkedHashSet<SComplexType> hierarchy = new LinkedHashSet<SComplexType>();
    SComplexType current = type.getSuperType();
    while (((current != null) && (!hierarchy.contains(current)))) {
      {
        hierarchy.add(current);
        current = current.getSuperType();
      }
    }
    return hierarchy;
  }
  
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
  public List<DFeature> allFeatures(final DComplexType type) {
    final ArrayList<DFeature> features = Lists.<DFeature>newArrayList(type.getFeatures());
    Set<DComplexType> _typeHierarchy = this.typeHierarchy(type);
    for (final DComplexType t : _typeHierarchy) {
      features.addAll(t.getFeatures());
    }
    return features;
  }
  
  /**
   * Returns the names of all the inherited features of the given type.
   */
  public Set<String> inheritedFeatureNames(final SComplexType type) {
    final Set<SComplexType> supertypes = this.typeHierarchy(type);
    final LinkedHashSet<String> features = new LinkedHashSet<String>();
    for (final SComplexType t : supertypes) {
      final Function1<SFeature, String> _function = (SFeature it) -> {
        return it.getName();
      };
      features.addAll(ListExtensions.<SFeature, String>map(t.getFeatures(), _function));
    }
    return features;
  }
}
