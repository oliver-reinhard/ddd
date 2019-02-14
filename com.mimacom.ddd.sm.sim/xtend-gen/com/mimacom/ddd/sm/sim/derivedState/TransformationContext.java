package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.indexing.SimIndex;
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class TransformationContext {
  @Inject
  private SimIndex index;
  
  private Map<DType, SType> localDTypeToSTypeMap;
  
  private Map<DType, SType> importedDTypeToSTypeMap;
  
  private DerivedStateAwareResource resource;
  
  public void init(final DerivedStateAwareResource resource) {
    this.resource = resource;
    this.localDTypeToSTypeMap = Maps.<DType, SType>newHashMap();
    this.importedDTypeToSTypeMap = Maps.<DType, SType>newHashMap();
    this.initializeLocallyMappedDTypes();
    this.initializeImportedMappedDTypes();
  }
  
  public void initializeImportedMappedDTypes() {
    final EObject model = IterableExtensions.<EObject>head(this.resource.getContents());
    final Iterable<IEObjectDescription> deducedSTypeDescriptions = this.index.getVisibleExternalDeducedSTypes(model);
    final Map<QualifiedName, IEObjectDescription> dTypeDescriptionsMap = this.index.getVisibleDTypeDescriptionsMap(model);
    for (final IEObjectDescription sTypeDesc : deducedSTypeDescriptions) {
      {
        final String sourceNameStr = sTypeDesc.getUserData(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM);
        final QualifiedName sourceQN = QualifiedName.create(sourceNameStr.split("\\."));
        final IEObjectDescription dTypeDesc = dTypeDescriptionsMap.get(sourceQN);
        if ((dTypeDesc != null)) {
          EObject dType = dTypeDesc.getEObjectOrProxy();
          EObject sType = sTypeDesc.getEObjectOrProxy();
          if (((dType instanceof DType) && (sType instanceof SType))) {
            boolean _eIsProxy = dType.eIsProxy();
            if (_eIsProxy) {
              dType = this.resource.getResourceSet().getEObject(dTypeDesc.getEObjectURI(), true);
            }
            boolean _eIsProxy_1 = sType.eIsProxy();
            if (_eIsProxy_1) {
              sType = this.resource.getResourceSet().getEObject(sTypeDesc.getEObjectURI(), true);
            }
            this.importedDTypeToSTypeMap.put(((DType) dType), ((SType) sType));
          }
        }
      }
    }
  }
  
  /**
   * Crates a new map and adds those primitives of the resource to the map that realize DPrimitives.
   */
  public void initializeLocallyMappedDTypes() {
    final Function1<SPrimitive, Boolean> _function = (SPrimitive it) -> {
      SDeductionRule _deductionRule = it.getDeductionRule();
      EObject _source = null;
      if (_deductionRule!=null) {
        _source=_deductionRule.getSource();
      }
      return Boolean.valueOf((_source != null));
    };
    final Iterator<SPrimitive> contibutors = IteratorExtensions.<SPrimitive>filter(Iterators.<SPrimitive>filter(this.resource.getAllContents(), SPrimitive.class), _function);
    while (contibutors.hasNext()) {
      {
        final SPrimitive sPrimitive = contibutors.next();
        if ((sPrimitive.isArchetype() && (sPrimitive.getDeductionRule().getSource() instanceof DPrimitive))) {
          EObject _source = sPrimitive.getDeductionRule().getSource();
          this.putSType(((DPrimitive) _source), sPrimitive);
        }
      }
    }
  }
  
  public void putSType(final DType dType, final SType sType) {
    final SType previousS = this.localDTypeToSTypeMap.put(dType, sType);
    if ((previousS != null)) {
      String _name = dType.getName();
      String _plus = ("There are two STypes realizing DType \"" + _name);
      String _plus_1 = (_plus + "\"");
      throw new IllegalStateException(_plus_1);
    }
  }
  
  /**
   * @return  null if no SType is found for DType.
   */
  public SType getSType(final DType dType) {
    SType sPrimitive = this.localDTypeToSTypeMap.get(dType);
    if ((sPrimitive == null)) {
      sPrimitive = this.importedDTypeToSTypeMap.get(dType);
    }
    return sPrimitive;
  }
}
