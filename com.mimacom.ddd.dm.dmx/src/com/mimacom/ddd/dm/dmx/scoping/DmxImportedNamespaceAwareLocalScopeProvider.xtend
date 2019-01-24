package com.mimacom.ddd.dm.dmx.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class DmxImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	static val PREFIX = "dm"
	static val TYPES = "types"
	static val FUNCTIONS = "functions"
	
	public static val DEFAULT_IMPORT_TYPES = PREFIX + "." + TYPES
	public static val DEFAULT_IMPORT_FUNCTIONS = PREFIX + "." + FUNCTIONS
	
	override getImplicitImports(boolean ignoreCase) {
		newArrayList(
			new ImportNormalizer(QualifiedName.create(PREFIX, TYPES), true /* wildcard*/, ignoreCase),
			new ImportNormalizer(QualifiedName.create(PREFIX, FUNCTIONS), true /* wildcard*/, ignoreCase)
		)
	}
}