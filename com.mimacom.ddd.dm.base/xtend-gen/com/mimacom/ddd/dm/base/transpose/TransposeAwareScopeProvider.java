package com.mimacom.ddd.dm.base.transpose;

import com.google.common.collect.Sets;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

@SuppressWarnings("all")
public class TransposeAwareScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  private static final Logger LOGGER = Logger.getLogger(TransposeAwareScopeProvider.class);
  
  public Iterable<IEObjectDescription> filterByImportedNamespaces(final EObject context, final Iterable<IEObjectDescription> descriptions, final boolean ignoreCase) {
    final DNamespace namespace = EcoreUtil2.<DNamespace>getContainerOfType(context, DNamespace.class);
    if ((namespace == null)) {
      return Collections.EMPTY_LIST;
    }
    final List<ImportNormalizer> namespaceResolvers = this.getImportedNamespaceResolvers(namespace, ignoreCase);
    final HashSet<ImportNormalizer> namespaceResolversSet = Sets.<ImportNormalizer>newHashSet(namespaceResolvers);
    this.addLocalNamespaceResolver(namespaceResolversSet, namespace.getModel(), ignoreCase);
    final ITypeContainer typeContainer = EcoreUtil2.<ITypeContainer>getContainerOfType(context, ITypeContainer.class);
    this.addLocalNamespaceResolver(namespaceResolversSet, typeContainer, ignoreCase);
    return this.resolveDescriptions(descriptions, namespaceResolversSet, ignoreCase);
  }
  
  protected void addLocalNamespaceResolver(final Set<ImportNormalizer> namespaceResolvers, final EObject namespace, final boolean ignoreCase) {
    if ((namespace != null)) {
      final QualifiedName name = this.getQualifiedNameOfLocalElement(namespace);
      if (((name != null) && (!name.isEmpty()))) {
        final ImportNormalizer localNormalizer = this.doCreateImportNormalizer(name, true, ignoreCase);
        namespaceResolvers.add(localNormalizer);
      }
    }
  }
  
  protected Iterable<IEObjectDescription> resolveDescriptions(final Iterable<IEObjectDescription> candidates, final Iterable<ImportNormalizer> normalizers, final boolean ignoreCase) {
    final HashSet<IEObjectDescription> result = Sets.<IEObjectDescription>newHashSet();
    for (final IEObjectDescription desc : candidates) {
      {
        final QualifiedName name = desc.getQualifiedName();
        for (final ImportNormalizer normalizer : normalizers) {
          {
            final QualifiedName alias = normalizer.deresolve(name);
            if (((alias != null) && (alias.getSegmentCount() == 1))) {
              boolean _isDebugEnabled = TransposeAwareScopeProvider.LOGGER.isDebugEnabled();
              if (_isDebugEnabled) {
                TransposeAwareScopeProvider.LOGGER.debug(((("Match " + name) + " with import ") + normalizer));
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
