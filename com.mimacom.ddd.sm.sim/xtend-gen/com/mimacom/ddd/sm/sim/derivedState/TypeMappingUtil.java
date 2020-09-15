package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.modelDeduction.DeductionUtil;
import com.mimacom.ddd.sm.sim.indexing.SimIndex;
import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

@Singleton
@SuppressWarnings("all")
public class TypeMappingUtil {
  private static final Logger LOGGER = Logger.getLogger(TypeMappingUtil.class);
  
  private static final BaseFactory BASE = BaseFactory.eINSTANCE;
  
  @Inject
  private SimIndex index;
  
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  public TypeMappingUtil() {
    TypeMappingUtil.LOGGER.setLevel(Level.DEBUG);
  }
  
  /**
   * Returns a proxy object with a URL that will resolve to the actual system type by ways of the SimIndex.
   * 
   * @param context used to derive the relevant eResource.
   * @return null if context is null or domainType has no fully qualified name
   */
  public DType getSystemTypeProxy(final EObject context, final DType domainType) {
    final QualifiedName domainTypeQN = this.qualifiedNameProvider.getFullyQualifiedName(domainType);
    if (((context == null) || (domainTypeQN == null))) {
      return null;
    }
    final URI resourceURI = context.eResource().getURI();
    String _string = resourceURI.toString();
    String _plus = (_string + "#");
    String _deductionProxyUriFragment = DeductionUtil.getDeductionProxyUriFragment(domainTypeQN);
    String _plus_1 = (_plus + _deductionProxyUriFragment);
    final URI uri = URI.createURI(_plus_1);
    final DPrimitive systemType = TypeMappingUtil.BASE.createDPrimitive();
    ((BasicEObjectImpl) systemType).eSetProxyURI(uri);
    boolean _isGreaterOrEqual = TypeMappingUtil.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
    if (_isGreaterOrEqual) {
      TypeMappingUtil.LOGGER.debug(((("getSystemTypeProxy for " + domainTypeQN) + " -> ") + uri));
    }
    return systemType;
  }
  
  /**
   * @param context used to derive the relevant eResource.
   * @return  null if no system type is found for the given domain type.
   */
  public Iterable<IEObjectDescription> getSystemTypeDescriptions(final EObject context, final QualifiedName domainTypeQN) {
    if ((domainTypeQN == null)) {
      String _string = context.toString();
      String _plus = ("context: " + _string);
      throw new NullPointerException(_plus);
    }
    final Iterable<IEObjectDescription> typeDeductionDescriptions = this.index.getVisibleSTypeMappingDescriptions(context, domainTypeQN);
    final ArrayList<IEObjectDescription> sTypes = Lists.<IEObjectDescription>newArrayList();
    for (final IEObjectDescription desc : typeDeductionDescriptions) {
      {
        final QualifiedName systemTypeQN = DeductionUtil.getDeductionTargetQN(desc);
        Iterables.<IEObjectDescription>addAll(sTypes, this.index.getVisibleDTypeDescriptions(context, systemTypeQN));
      }
    }
    boolean _isGreaterOrEqual = TypeMappingUtil.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
    if (_isGreaterOrEqual) {
      TypeMappingUtil.LOGGER.debug(((("getSystemTypeDescriptions for " + domainTypeQN) + " -> ") + sTypes));
    }
    return sTypes;
  }
}
