package com.mimacom.ddd.sm.sim.indexing;

import com.google.common.collect.Maps;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Singleton
@SuppressWarnings("all")
public class SimResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  private static final Logger LOGGER = Logger.getLogger(SimResourceDescriptionStrategy.class);
  
  public static final String KEY_DEDUCED_FROM = "deducedFrom";
  
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
          return this.createDTypeDescription(typeToIndex, ((DType)source), acceptor);
        }
      }
    }
    return super.createEObjectDescriptions(obj, acceptor);
  }
  
  public boolean createDTypeDescription(final DType typeToIndex, final DType source, final IAcceptor<IEObjectDescription> acceptor) {
    final IQualifiedNameProvider qnp = this.getQualifiedNameProvider();
    if ((qnp == null)) {
      return false;
    }
    try {
      final QualifiedName tQualifiedName = qnp.getFullyQualifiedName(typeToIndex);
      if ((tQualifiedName != null)) {
        final QualifiedName sQualifiedName = qnp.getFullyQualifiedName(source);
        if ((sQualifiedName != null)) {
          final HashMap<String, String> userData = Maps.<String, String>newHashMap();
          userData.put(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM, sQualifiedName.toString());
          acceptor.accept(EObjectDescription.create(tQualifiedName, typeToIndex, userData));
        } else {
          acceptor.accept(EObjectDescription.create(tQualifiedName, typeToIndex));
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exc = (Exception)_t;
        SimResourceDescriptionStrategy.LOGGER.error(exc.getMessage(), exc);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return true;
  }
}
