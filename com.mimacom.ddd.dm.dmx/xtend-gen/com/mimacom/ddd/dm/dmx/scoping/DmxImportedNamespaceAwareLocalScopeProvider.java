package com.mimacom.ddd.dm.dmx.scoping;

import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class DmxImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  private static final String PREFIX = "dm";
  
  private static final String TYPES = "types";
  
  private static final String FUNCTIONS = "functions";
  
  public static final String DEFAULT_IMPORT_TYPES = ((DmxImportedNamespaceAwareLocalScopeProvider.PREFIX + ".") + DmxImportedNamespaceAwareLocalScopeProvider.TYPES);
  
  public static final String DEFAULT_IMPORT_FUNCTIONS = ((DmxImportedNamespaceAwareLocalScopeProvider.PREFIX + ".") + DmxImportedNamespaceAwareLocalScopeProvider.FUNCTIONS);
  
  @Override
  public List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create(DmxImportedNamespaceAwareLocalScopeProvider.PREFIX, DmxImportedNamespaceAwareLocalScopeProvider.TYPES);
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    QualifiedName _create_1 = QualifiedName.create(DmxImportedNamespaceAwareLocalScopeProvider.PREFIX, DmxImportedNamespaceAwareLocalScopeProvider.FUNCTIONS);
    ImportNormalizer _importNormalizer_1 = new ImportNormalizer(_create_1, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer, _importNormalizer_1);
  }
}
