package com.mimacom.ddd.sm.sim.indexing;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SType;
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
   * Prevents indexing of deduction rules and of information models with attribute deduced = true
   */
  @Override
  public boolean createEObjectDescriptions(final EObject obj, final IAcceptor<IEObjectDescription> acceptor) {
    if ((obj instanceof SType)) {
      if ((Objects.equal(((SType)obj).getNature(), SElementNature.SYNTHETIC) && (((SType)obj).getDeductionRule() != null))) {
        final EObject source = ((SType)obj).getDeductionRule().getSource();
        if ((source instanceof DType)) {
          return this.createSTypeDescription(((SType)obj), ((DType)source), acceptor);
        }
      }
    }
    if ((obj instanceof SDeducibleElement)) {
      SElementNature _nature = ((SDeducibleElement)obj).getNature();
      boolean _equals = Objects.equal(_nature, SElementNature.DEDUCTION_RULE);
      if (_equals) {
        return false;
      }
    }
    return super.createEObjectDescriptions(obj, acceptor);
  }
  
  public boolean createSTypeDescription(final SType type, final DType source, final IAcceptor<IEObjectDescription> acceptor) {
    final IQualifiedNameProvider qnp = this.getQualifiedNameProvider();
    if ((qnp == null)) {
      return false;
    }
    try {
      final QualifiedName sQualifiedName = qnp.getFullyQualifiedName(type);
      final QualifiedName dQualifiedName = qnp.getFullyQualifiedName(source);
      if ((sQualifiedName != null)) {
        if ((dQualifiedName != null)) {
          final HashMap<String, String> userData = Maps.<String, String>newHashMap();
          userData.put(SimResourceDescriptionStrategy.KEY_DEDUCED_FROM, dQualifiedName.toString());
          acceptor.accept(EObjectDescription.create(sQualifiedName, type, userData));
        } else {
          acceptor.accept(EObjectDescription.create(sQualifiedName, type));
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
