package com.mimacom.ddd.sm.sim.indexing;

import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.modelDeduction.DeductionHelper;
import com.mimacom.ddd.dm.dmx.indexing.DmxResourceDescriptionStrategy;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.STypeMapping;
import java.util.Map;
import org.apache.log4j.Level;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Singleton
@SuppressWarnings("all")
public class SimResourceDescriptionStrategy extends DmxResourceDescriptionStrategy {
  public SimResourceDescriptionStrategy() {
    DmxResourceDescriptionStrategy.LOGGER.setLevel(Level.DEBUG);
  }
  
  /**
   * Prevents indexing of deduction rules and creates custom index entries for synthetic types
   */
  @Override
  public boolean createEObjectDescriptions(final EObject obj, final IAcceptor<IEObjectDescription> acceptor) {
    if ((obj instanceof IDeductionDefinition)) {
      return false;
    }
    if ((obj instanceof DType)) {
      boolean _isSynthetic = ((DType)obj).isSynthetic();
      if (_isSynthetic) {
        final DType typeToIndex = ((DType)obj);
        final IDeducibleElement source = typeToIndex.getDeducedFrom().getDeductionRule().getSource();
        if ((source instanceof DType)) {
          return this.createSTypeDeductionDescription(typeToIndex, ((DType)source), acceptor);
        }
      }
    }
    return super.createEObjectDescriptions(obj, acceptor);
  }
  
  public boolean createSTypeDeductionDescription(final DType typeToIndex, final DType source, final IAcceptor<IEObjectDescription> acceptor) {
    final IQualifiedNameProvider qnp = this.getQualifiedNameProvider();
    if ((qnp == null)) {
      return false;
    }
    try {
      final QualifiedName targetQN = qnp.getFullyQualifiedName(typeToIndex);
      if ((targetQN != null)) {
        IEObjectDescription targetDesc = EObjectDescription.create(targetQN, typeToIndex);
        acceptor.accept(targetDesc);
        boolean _isGreaterOrEqual = DmxResourceDescriptionStrategy.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
        if (_isGreaterOrEqual) {
          String _path = typeToIndex.eResource().getURI().path();
          String _plus = ("OBJ " + _path);
          String _plus_1 = (_plus + " - ");
          String _plus_2 = (_plus_1 + targetQN);
          String _plus_3 = (_plus_2 + ": ");
          String _name = typeToIndex.eClass().getName();
          String _plus_4 = (_plus_3 + _name);
          DmxResourceDescriptionStrategy.LOGGER.debug(_plus_4);
        }
        final QualifiedName sourceQN = qnp.getFullyQualifiedName(source);
        if ((sourceQN != null)) {
          final IDeductionDefinition deduction = typeToIndex.getDeducedFrom();
          final SInformationModel model = EcoreUtil2.<SInformationModel>getContainerOfType(deduction, SInformationModel.class);
          final STypeMapping typeMappingType = model.getIndexingHelper();
          final Map<String, String> userData = DeductionHelper.createEObjectDescriptionUserData(targetQN);
          final QualifiedName sourceQNForIndex = DeductionHelper.getDeductionSourceQNForIndex(sourceQN);
          final IEObjectDescription mappingDesc = EObjectDescription.create(sourceQNForIndex, typeMappingType, userData);
          acceptor.accept(mappingDesc);
          boolean _isGreaterOrEqual_1 = DmxResourceDescriptionStrategy.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
          if (_isGreaterOrEqual_1) {
            String _path_1 = deduction.eResource().getURI().path();
            String _plus_5 = ("OBJ " + _path_1);
            String _plus_6 = (_plus_5 + " - ");
            String _plus_7 = (_plus_6 + sourceQNForIndex);
            String _plus_8 = (_plus_7 + ": ");
            String _name_1 = typeMappingType.eClass().getName();
            String _plus_9 = (_plus_8 + _name_1);
            String _plus_10 = (_plus_9 + 
              " -> ");
            String _plus_11 = (_plus_10 + targetQN);
            DmxResourceDescriptionStrategy.LOGGER.debug(_plus_11);
          }
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exc = (Exception)_t;
        DmxResourceDescriptionStrategy.LOGGER.error(exc.getMessage(), exc);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return true;
  }
  
  @Override
  public boolean createReferenceDescriptions(final EObject from, final URI exportedContainerURI, final IAcceptor<IReferenceDescription> acceptor) {
    boolean _xblockexpression = false;
    {
      if ((from instanceof IDeductionDefinition)) {
        return true;
      }
      _xblockexpression = super.createReferenceDescriptions(from, exportedContainerURI, acceptor);
    }
    return _xblockexpression;
  }
  
  @Override
  protected IReferenceDescription createReferenceDescription(final EObject owner, final URI exportedContainerURI, final EReference eReference, final int indexInList, final EObject target) {
    final IReferenceDescription refDesc = super.createReferenceDescription(owner, exportedContainerURI, eReference, indexInList, target);
    boolean _isGreaterOrEqual = DmxResourceDescriptionStrategy.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
    if (_isGreaterOrEqual) {
      String _path = exportedContainerURI.path();
      String _plus = ("REF " + _path);
      String _plus_1 = (_plus + " - ");
      String _plus_2 = (_plus_1 + owner);
      String _plus_3 = (_plus_2 + " -> ");
      String _simpleName = target.getClass().getSimpleName();
      String _plus_4 = (_plus_3 + _simpleName);
      String _plus_5 = (_plus_4 + ":");
      URI _targetEObjectUri = refDesc.getTargetEObjectUri();
      String _plus_6 = (_plus_5 + _targetEObjectUri);
      DmxResourceDescriptionStrategy.LOGGER.debug(_plus_6);
    }
    return refDesc;
  }
}
