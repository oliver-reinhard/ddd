package com.mimacom.ddd.dm.dmx;

import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxConstructorCall;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("all")
public class DmxUtil {
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
  
  public List<DExpression> nullSafeCallArguments(final DmxMemberNavigation nav) {
    DmxCallArguments _callArguments = nav.getCallArguments();
    boolean _tripleEquals = (_callArguments == null);
    if (_tripleEquals) {
      return Collections.EMPTY_LIST;
    }
    return nav.getCallArguments().getArguments();
  }
  
  public List<DExpression> nullSafeCallArguments(final DmxFunctionCall call) {
    DmxCallArguments _callArguments = call.getCallArguments();
    boolean _tripleEquals = (_callArguments == null);
    if (_tripleEquals) {
      return Collections.EMPTY_LIST;
    }
    return call.getCallArguments().getArguments();
  }
  
  public List<DExpression> nullSafeCallArguments(final DmxConstructorCall call) {
    DmxCallArguments _callArguments = call.getCallArguments();
    boolean _tripleEquals = (_callArguments == null);
    if (_tripleEquals) {
      return Collections.EMPTY_LIST;
    }
    return call.getCallArguments().getArguments();
  }
}
