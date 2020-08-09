package com.mimacom.ddd.dm.dmx.scoping

import java.util.List
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer

class DmxImportedNamespaceAwareLocalScopeProviderWithDmTypes extends DmxImportedNamespaceAwareLocalScopeProvider {
	
	public static val PREFIX = "dm"
	static val TYPES = "types"
	
	public static val DEFAULT_IMPORT_TYPES = PREFIX + "." + TYPES
	
	override List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		newArrayList(
			new ImportNormalizer(QualifiedName.create(PREFIX, TYPES), true /* wildcard*/, ignoreCase)
		)
	}
}