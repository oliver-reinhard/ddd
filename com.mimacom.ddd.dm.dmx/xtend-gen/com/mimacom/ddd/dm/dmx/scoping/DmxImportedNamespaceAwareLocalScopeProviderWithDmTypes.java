package com.mimacom.ddd.dm.dmx.scoping;

import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProvider;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes extends DmxImportedNamespaceAwareLocalScopeProvider {
  public static final String PREFIX = "dm";
  
  private static final String TYPES = "types";
  
  public static final String DEFAULT_IMPORT_TYPES = ((DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.PREFIX + ".") + DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.TYPES);
  
  @Override
  public List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create(DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.PREFIX, DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.TYPES);
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer);
  }
}
