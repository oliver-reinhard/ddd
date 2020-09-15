package com.mimacom.ddd.sm.sim.derivedState;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.modelDeduction.IDeductionAwareResource;
import com.mimacom.ddd.sm.sim.derivedState.TypeMappingUtil;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DeductionAwareResource extends DerivedStateAwareResource implements IDeductionAwareResource {
  /**
   * A tri-state initialization to distinguish between preIndexingPhase derived-state computation and full derived-state computation.
   */
  public enum InitializationState {
    NOT_INITIALIZED,
    
    PRE_INDEXING,
    
    FULLY_INITIALIZED;
  }
  
  private static final Logger LOGGER = Logger.getLogger(DeductionAwareResource.class);
  
  @Inject
  private TypeMappingUtil helper;
  
  protected volatile DeductionAwareResource.InitializationState initializationState = DeductionAwareResource.InitializationState.NOT_INITIALIZED;
  
  public DeductionAwareResource() {
    DeductionAwareResource.LOGGER.setLevel(Level.DEBUG);
    int _hashCode = this.hashCode();
    String _plus = ("Created resource " + Integer.valueOf(_hashCode));
    DeductionAwareResource.LOGGER.debug(_plus);
  }
  
  /**
   * IDeductionAwareResource
   */
  @Override
  public EObject deduceTargetObject(final QualifiedName sourceObjectQN, final EObject objectContext) {
    final Iterable<IEObjectDescription> descriptions = this.helper.getSystemTypeDescriptions(objectContext, sourceObjectQN);
    boolean _isEmpty = IterableExtensions.isEmpty(descriptions);
    boolean _not = (!_isEmpty);
    if (_not) {
      final IEObjectDescription systemTypeDesc = IterableExtensions.<IEObjectDescription>head(descriptions);
      final EObject systemType = this.getResourceSet().getEObject(systemTypeDesc.getEObjectURI(), true);
      boolean _isGreaterOrEqual = DeductionAwareResource.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
      if (_isGreaterOrEqual) {
        String _plus = (sourceObjectQN + " -> ");
        QualifiedName _name = systemTypeDesc.getName();
        String _plus_1 = (_plus + _name);
        String _plus_2 = (_plus_1 + " (");
        String _plus_3 = (_plus_2 + systemType);
        String _plus_4 = (_plus_3 + ")");
        DeductionAwareResource.LOGGER.debug(_plus_4);
      }
      return systemType;
    }
    DeductionAwareResource.LOGGER.debug(((("fragment QN = " + sourceObjectQN) + " -> ") + null));
    return null;
  }
}
