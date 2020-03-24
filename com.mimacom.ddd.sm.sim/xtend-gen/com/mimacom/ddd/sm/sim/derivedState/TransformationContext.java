package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DType;
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
  
  private Map<DType, DType> localDomainToSystemModelTypeMap;
  
  private Map<DType, DType> importedDomainToSystemModelTypeMap;
  
  private DerivedStateAwareResource resource;
  
  public void init(final DerivedStateAwareResource resource) {
    this.resource = resource;
    this.localDomainToSystemModelTypeMap = Maps.<DType, DType>newHashMap();
    this.importedDomainToSystemModelTypeMap = Maps.<DType, DType>newHashMap();
    this.initializeImportedMappedDomainTypesFromIndex();
  }
  
  public void initializeImportedMappedDomainTypesFromIndex() {
    final EObject model = IterableExtensions.<EObject>head(this.resource.getContents());
    final Iterable<IEObjectDescription> deducedTypeDescriptions = this.index.getVisibleExternalDeducedDTypes(model);
    final Map<QualifiedName, IEObjectDescription> allTypeDescriptionsMap = this.index.getVisibleDTypeDescriptionsMap(model);
    for (final IEObjectDescription sTypeDesc : deducedTypeDescriptions) {
      {
        final String sourceNameStr = sTypeDesc.getUserData(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM);
        final QualifiedName sourceQN = QualifiedName.create(sourceNameStr.split("\\."));
        final IEObjectDescription dTypeDesc = allTypeDescriptionsMap.get(sourceQN);
        if ((dTypeDesc != null)) {
          EObject dType = dTypeDesc.getEObjectOrProxy();
          EObject sType = sTypeDesc.getEObjectOrProxy();
          if (((dType instanceof DType) && (sType instanceof DType))) {
            boolean _eIsProxy = dType.eIsProxy();
            if (_eIsProxy) {
              dType = this.resource.getResourceSet().getEObject(dTypeDesc.getEObjectURI(), true);
            }
            boolean _eIsProxy_1 = sType.eIsProxy();
            if (_eIsProxy_1) {
              sType = this.resource.getResourceSet().getEObject(sTypeDesc.getEObjectURI(), true);
            }
            this.importedDomainToSystemModelTypeMap.put(((DType) dType), ((DType) sType));
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
  
  public void putSystemType(final DType domainType, final DType systemType) {
    final DType previousS = this.localDomainToSystemModelTypeMap.put(domainType, systemType);
    if ((previousS != null)) {
      String _name = domainType.getName();
      String _plus = ("There are two STypes realizing DType \"" + _name);
      String _plus_1 = (_plus + "\": as \"");
      String _name_1 = systemType.getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + "\" and as \"");
      String _plus_4 = (_plus_3 + previousS);
      String _plus_5 = (_plus_4 + "\"");
      throw new IllegalStateException(_plus_5);
    }
  }
  
  /**
   * @return  null if no system type is found for the given domain type.
   */
  public DType getSystemType(final DType domainType) {
    DType systemType = this.localDomainToSystemModelTypeMap.get(domainType);
    if ((systemType == null)) {
      systemType = this.importedDomainToSystemModelTypeMap.get(domainType);
    }
    return systemType;
  }
}
