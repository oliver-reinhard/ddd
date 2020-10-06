package com.mimacom.ddd.dm.dmx.scoping;

import com.mimacom.ddd.dm.base.base.DNamespace;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

@SuppressWarnings("all")
public class DmxImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    final List<ImportNormalizer> resolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase);
    if ((context instanceof DNamespace)) {
      final String name = ((DNamespace)context).getName();
      if ((name != null)) {
        ImportNormalizer _createImportedNamespaceResolver = this.createImportedNamespaceResolver((name + ".*"), ignoreCase);
        resolvers.add(_createImportedNamespaceResolver);
      }
    }
    return resolvers;
  }
}
