package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.indexing.SimIndex;
import com.mimacom.ddd.sm.sim.indexing.SimResourceDescriptionStrategy;
import java.util.Map;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

@SuppressWarnings("all")
public class TransformationContext {
  private static final Logger LOGGER = Logger.getLogger(TransformationContext.class);
  
  @Inject
  private SimIndex index;
  
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  private Map<DType, DType> localDomainToSystemModelTypeMap;
  
  private Map<QualifiedName, DType> importedDomainQNToSystemModelTypeMap;
  
  private EObject context;
  
  public TransformationContext() {
  }
  
  public void init(final EObject context) {
    this.context = context;
    this.localDomainToSystemModelTypeMap = Maps.<DType, DType>newHashMap();
    this.importedDomainQNToSystemModelTypeMap = Maps.<QualifiedName, DType>newHashMap();
    this.initializeImportedMappedDomainTypesFromIndex();
  }
  
  public void initializeImportedMappedDomainTypesFromIndex() {
    final Iterable<IEObjectDescription> deducedTypeDescriptions = this.index.getVisibleExternalDeducedDTypes(this.context);
    final Map<QualifiedName, IEObjectDescription> allTypeDescriptionsMap = this.index.getVisibleDTypeDescriptionsMap(this.context);
    for (final IEObjectDescription sTypeDesc : deducedTypeDescriptions) {
      {
        final String sourceNameStr = sTypeDesc.getUserData(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM);
        final QualifiedName sourceQN = QualifiedName.create(sourceNameStr.split("\\."));
        final IEObjectDescription dTypeDesc = allTypeDescriptionsMap.get(sourceQN);
        if ((dTypeDesc != null)) {
          EObject dType = dTypeDesc.getEObjectOrProxy();
          EObject sType = sTypeDesc.getEObjectOrProxy();
          if (((dType instanceof DType) && (sType instanceof DType))) {
            this.importedDomainQNToSystemModelTypeMap.put(sourceQN, ((DType) sType));
            Level _level = TransformationContext.LOGGER.getLevel();
            boolean _equals = Objects.equal(_level, Level.DEBUG);
            if (_equals) {
              URI _eObjectURI = sTypeDesc.getEObjectURI();
              String _plus = ((("putSystemType for " + sourceQN) + " -> ") + _eObjectURI);
              TransformationContext.LOGGER.debug(_plus);
            }
          }
        }
      }
    }
  }
  
  public void putSystemType(final DType domainType, final DType systemType) {
    final DType previousS = this.localDomainToSystemModelTypeMap.put(domainType, systemType);
    if ((previousS != null)) {
      String _name = domainType.getName();
      String _plus = ("There are two system types realizing domain type \"" + _name);
      String _plus_1 = (_plus + "\": as \"");
      String _name_1 = systemType.getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + 
        "\" and as \"");
      String _plus_4 = (_plus_3 + previousS);
      String _plus_5 = (_plus_4 + "\"");
      TransformationContext.LOGGER.error(_plus_5);
    }
  }
  
  /**
   * @return  null if no system type is found for the given domain type.
   */
  public DType getSystemType(final DType domainType) {
    DType systemType = this.localDomainToSystemModelTypeMap.get(domainType);
    if ((systemType == null)) {
      final QualifiedName domainTypeQN = this.qualifiedNameProvider.getFullyQualifiedName(domainType);
      systemType = this.importedDomainQNToSystemModelTypeMap.get(domainTypeQN);
      if (((systemType == null) && Objects.equal(TransformationContext.LOGGER.getLevel(), Level.DEBUG))) {
        TransformationContext.LOGGER.debug((("getSystemType for " + domainTypeQN) + " -> null"));
      }
    }
    return systemType;
  }
}
