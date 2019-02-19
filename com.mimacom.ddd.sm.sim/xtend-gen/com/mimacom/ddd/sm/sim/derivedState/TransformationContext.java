package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.indexing.SimIndex;
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    this.initializeImportedMappedDTypesFromIndex();
  }
  
  public void initializeImportedMappedDTypesFromIndex() {
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
  }
  
  public void putSType(final DType dType, final SType sType) {
    final SType previousS = this.localDTypeToSTypeMap.put(dType, sType);
    if ((previousS != null)) {
      String _name = dType.getName();
      String _plus = ("There are two STypes realizing DType \"" + _name);
      String _plus_1 = (_plus + "\" as \"");
      String _name_1 = sType.getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + "\" and as \"");
      String _plus_4 = (_plus_3 + previousS);
      String _plus_5 = (_plus_4 + "\"");
      throw new IllegalStateException(_plus_5);
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
