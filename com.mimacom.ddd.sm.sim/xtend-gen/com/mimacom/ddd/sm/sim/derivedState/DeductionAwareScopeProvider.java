package com.mimacom.ddd.sm.sim.derivedState;

import com.google.common.collect.Sets;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamespace;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

@SuppressWarnings("all")
public class DeductionAwareScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  private static final Logger LOGGER = Logger.getLogger(DeductionAwareScopeProvider.class);
  
  public Iterable<IEObjectDescription> filterByImportedNamespaces(final EObject context, final Iterable<IEObjectDescription> descriptions, final boolean ignoreCase) {
    final DNamespace namespace = EcoreUtil2.<DNamespace>getContainerOfType(context, DNamespace.class);
    if ((namespace == null)) {
      return Collections.EMPTY_LIST;
    }
    final List<ImportNormalizer> namespaceResolvers = this.getImportedNamespaceResolvers(namespace, ignoreCase);
    DModel _model = namespace.getModel();
    boolean _tripleNotEquals = (_model != null);
    if (_tripleNotEquals) {
      final QualifiedName name = this.getQualifiedNameOfLocalElement(namespace.getModel());
      if (((name != null) && (!name.isEmpty()))) {
        final ImportNormalizer localNormalizer = this.doCreateImportNormalizer(name, true, ignoreCase);
        namespaceResolvers.add(localNormalizer);
      }
    }
    return this.resolveDescriptions(descriptions, namespaceResolvers, ignoreCase);
  }
  
  protected Iterable<IEObjectDescription> resolveDescriptions(final Iterable<IEObjectDescription> candidates, final List<ImportNormalizer> normalizers, final boolean ignoreCase) {
    final HashSet<IEObjectDescription> result = Sets.<IEObjectDescription>newHashSet();
    for (final IEObjectDescription desc : candidates) {
      {
        final QualifiedName name = desc.getQualifiedName();
        for (final ImportNormalizer normalizer : normalizers) {
          {
            final QualifiedName alias = normalizer.deresolve(name);
            if (((alias != null) && (alias.getSegmentCount() == 1))) {
              boolean _isDebugEnabled = DeductionAwareScopeProvider.LOGGER.isDebugEnabled();
              if (_isDebugEnabled) {
                DeductionAwareScopeProvider.LOGGER.debug(((("Match " + name) + " with import ") + normalizer));
              }
              result.add(desc);
            }
          }
        }
      }
    }
    return result;
  }
}
