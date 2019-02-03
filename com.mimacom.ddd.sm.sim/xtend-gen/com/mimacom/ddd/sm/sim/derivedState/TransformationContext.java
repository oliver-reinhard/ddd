package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SType;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class TransformationContext {
  public static class UnsupportedDomainTypeException extends Exception {
    public UnsupportedDomainTypeException(final DType type) {
      super(new Function0<String>() {
        public String apply() {
          String _name = null;
          if (type!=null) {
            _name=type.getName();
          }
          String _plus = ("A system-model primitive type realizing the domain-model primitive type \"" + _name);
          String _plus_1 = (_plus + "\"  the has not been declared");
          return _plus_1;
        }
      }.apply());
    }
  }
  
  private final Map<DType, SType> dTypeToSTypeMap;
  
  private final DerivedStateAwareResource resource;
  
  public TransformationContext(final DerivedStateAwareResource resource) {
    this.resource = resource;
    this.dTypeToSTypeMap = Maps.<DType, SType>newHashMap();
    this.initializeMappedDPrimitives(resource);
  }
  
  /**
   * Crates a new map and adds those primitives of the resource to the map that realize DPrimitives.
   */
  public void initializeMappedDPrimitives(final DerivedStateAwareResource resource) {
    final Iterator<SPrimitive> contibutors = Iterators.<SPrimitive>filter(resource.getAllContents(), SPrimitive.class);
    while (contibutors.hasNext()) {
      {
        final SPrimitive sPrimitive = contibutors.next();
        boolean _isArchetype = sPrimitive.isArchetype();
        if (_isArchetype) {
          this.putSType(sPrimitive.getRealizes(), sPrimitive);
        }
      }
    }
  }
  
  public void putSType(final DType dType, final SType sType) {
    final SType previousS = this.dTypeToSTypeMap.put(dType, sType);
    if ((previousS != null)) {
      String _name = dType.getName();
      String _plus = ("There are two STypes realizing DType \"" + _name);
      String _plus_1 = (_plus + "\"");
      throw new IllegalStateException(_plus_1);
    }
  }
  
  public SType getSType(final DType dType) throws TransformationContext.UnsupportedDomainTypeException {
    final SType sPrimitive = this.dTypeToSTypeMap.get(dType);
    if ((sPrimitive == null)) {
      throw new TransformationContext.UnsupportedDomainTypeException(dType);
    }
    return sPrimitive;
  }
}
