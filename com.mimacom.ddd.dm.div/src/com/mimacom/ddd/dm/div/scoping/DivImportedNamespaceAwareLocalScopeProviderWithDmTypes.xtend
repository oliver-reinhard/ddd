package com.mimacom.ddd.dm.div.scoping

import com.mimacom.ddd.dm.dmx.scoping.DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes
import java.util.List
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class DivImportedNamespaceAwareLocalScopeProviderWithDmTypes extends ImportedNamespaceAwareLocalScopeProvider {
	
	
	
	override List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		newArrayList(
			new ImportNormalizer(QualifiedName.create(DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes::PREFIX, DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes::TYPES), true /* wildcard*/, ignoreCase)
		)
	}
}