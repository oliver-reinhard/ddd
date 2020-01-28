package com.mimacom.ddd.dm.dmx.scoping;

import com.mimacom.ddd.dm.base.DNamespace;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class DmxImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  public static final String PREFIX = "dm";
  
  private static final String TYPES = "types";
  
  public static final String DEFAULT_IMPORT_TYPES = ((DmxImportedNamespaceAwareLocalScopeProvider.PREFIX + ".") + DmxImportedNamespaceAwareLocalScopeProvider.TYPES);
  
  @Override
  public List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create(DmxImportedNamespaceAwareLocalScopeProvider.PREFIX, DmxImportedNamespaceAwareLocalScopeProvider.TYPES);
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer);
  }
  
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
