package com.mimacom.ddd.dm.div.scoping;

import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class DivImportedNamespaceAwareLocalScopeProviderWithDmTypes extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  public List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    QualifiedName _create = QualifiedName.create(DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.PREFIX, DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes.TYPES);
    ImportNormalizer _importNormalizer = new ImportNormalizer(_create, true, ignoreCase);
    return CollectionLiterals.<ImportNormalizer>newArrayList(_importNormalizer);
  }
}
