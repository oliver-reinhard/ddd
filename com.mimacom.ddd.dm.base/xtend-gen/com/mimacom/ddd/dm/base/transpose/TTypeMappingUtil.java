package com.mimacom.ddd.dm.base.transpose;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive;
import com.mimacom.ddd.dm.base.transpose.TransposeIndex;
import com.mimacom.ddd.dm.base.transpose.TranspositionUtil;
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
public class TTypeMappingUtil {
  private static final Logger LOGGER = Logger.getLogger(TTypeMappingUtil.class);
  
  private static final SyntheticFactory SYNTHETIC = SyntheticFactory.eINSTANCE;
  
  @Inject
  private TransposeIndex index;
  
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  public TTypeMappingUtil() {
    TTypeMappingUtil.LOGGER.setLevel(Level.DEBUG);
  }
  
  /**
   * Returns a proxy object with a URL that will resolve to the actual system type by ways of the TransposeIndex.
   * 
   * @param context used to derive the relevant eResource.
   * @return null if context is null or domainType has no fully qualified name
   */
  public DType getTransposedTypeProxy(final EObject context, final DType sourceType) {
    final QualifiedName sourceTypeQN = this.qualifiedNameProvider.getFullyQualifiedName(sourceType);
    if (((context == null) || (sourceTypeQN == null))) {
      return null;
    }
    final URI resourceURI = context.eResource().getURI();
    String _string = resourceURI.toString();
    String _plus = (_string + "#");
    String _transposedTypeProxyUriFragment = TranspositionUtil.getTransposedTypeProxyUriFragment(sourceTypeQN);
    String _plus_1 = (_plus + _transposedTypeProxyUriFragment);
    final URI uri = URI.createURI(_plus_1);
    final TSyntheticPrimitive proxy = TTypeMappingUtil.SYNTHETIC.createTSyntheticPrimitive();
    ((BasicEObjectImpl) proxy).eSetProxyURI(uri);
    boolean _isGreaterOrEqual = TTypeMappingUtil.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
    if (_isGreaterOrEqual) {
      TTypeMappingUtil.LOGGER.debug(((("getSystemTypeProxy for " + sourceTypeQN) + " -> ") + uri));
    }
    return proxy;
  }
  
  /**
   * Returns the descriptions of all visible mapped types for a domain type given by its qualified name.
   * 
   * @param context used to derive the relevant eResource.
   * @param sourceTypeQN cannot be null
   * @return never null but may be an empty collection.
   */
  public Iterable<IEObjectDescription> getTransposedTypeDescriptions(final EObject context, final QualifiedName sourceTypeQN) {
    if ((sourceTypeQN == null)) {
      String _string = context.toString();
      String _plus = ("context: " + _string);
      throw new NullPointerException(_plus);
    }
    final Iterable<IEObjectDescription> transposedTypeDescriptions = this.index.getVisibleTTypeMappingDescriptions(context, sourceTypeQN);
    final ArrayList<IEObjectDescription> typeDescriptions = Lists.<IEObjectDescription>newArrayList();
    for (final IEObjectDescription desc : transposedTypeDescriptions) {
      {
        final QualifiedName systemTypeQN = TranspositionUtil.getTranspositionTargetQN(desc);
        Iterables.<IEObjectDescription>addAll(typeDescriptions, this.index.getVisibleDTypeDescriptions(context, systemTypeQN));
      }
    }
    boolean _isGreaterOrEqual = TTypeMappingUtil.LOGGER.getLevel().isGreaterOrEqual(Level.DEBUG);
    if (_isGreaterOrEqual) {
      TTypeMappingUtil.LOGGER.debug(((("getSystemTypeDescriptions for " + sourceTypeQN) + " -> ") + typeDescriptions));
    }
    return typeDescriptions;
  }
}
