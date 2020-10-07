package com.mimacom.ddd.dm.base.transpose;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.transpose.TransposeAwareScopeProvider;
import com.mimacom.ddd.dm.base.transpose.TypeMappingUtil;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TransposeAwareResource extends DerivedStateAwareResource {
  private static final Logger LOGGER = Logger.getLogger(TransposeAwareResource.class);
  
  @Inject
  private TransposeAwareScopeProvider scopeProvider;
  
  @Inject
  @Extension
  private TypeMappingUtil _typeMappingUtil;
  
  public TransposeAwareResource() {
    TransposeAwareResource.LOGGER.setLevel(Level.DEBUG);
    int _hashCode = this.hashCode();
    String _plus = ("Created resource " + Integer.valueOf(_hashCode));
    TransposeAwareResource.LOGGER.debug(_plus);
  }
  
  /**
   * IDeductionAwareResource
   */
  public EObject deduceTargetObject(final QualifiedName sourceObjectQN, final EObject objectContext) {
    final Iterable<IEObjectDescription> descriptions = this._typeMappingUtil.getTransposedTypeDescriptions(objectContext, sourceObjectQN);
    final Iterable<IEObjectDescription> importedDescriptions = this.scopeProvider.filterByImportedNamespaces(objectContext, descriptions, false);
    boolean _isEmpty = IterableExtensions.isEmpty(importedDescriptions);
    boolean _not = (!_isEmpty);
    if (_not) {
      final IEObjectDescription systemTypeDesc = IterableExtensions.<IEObjectDescription>head(importedDescriptions);
      final EObject systemType = this.getResourceSet().getEObject(systemTypeDesc.getEObjectURI(), true);
      boolean _isDebugEnabled = TransposeAwareResource.LOGGER.isDebugEnabled();
      if (_isDebugEnabled) {
        String _plus = (sourceObjectQN + " -> ");
        QualifiedName _name = systemTypeDesc.getName();
        String _plus_1 = (_plus + _name);
        String _plus_2 = (_plus_1 + " (");
        String _plus_3 = (_plus_2 + systemType);
        String _plus_4 = (_plus_3 + ")");
        TransposeAwareResource.LOGGER.debug(_plus_4);
      }
      return systemType;
    }
    TransposeAwareResource.LOGGER.debug(((("fragment QN = " + sourceObjectQN) + " -> ") + null));
    return null;
  }
  
  /**
   * Returns the contents without computing the derived state.
   */
  public synchronized EList<EObject> peekContents() {
    return this.doGetContents();
  }
}
