package com.mimacom.ddd.dm.dmx.scoping

import com.mimacom.ddd.dm.base.DDomain
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class DmxImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	public static val PREFIX = "dm"
	static val TYPES = "types"
	static val FUNCTIONS = "functions"
	
	public static val DEFAULT_IMPORT_TYPES = PREFIX + "." + TYPES
	public static val DEFAULT_IMPORT_FUNCTIONS = PREFIX + "." + FUNCTIONS
	
	override List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		newArrayList(
			new ImportNormalizer(QualifiedName.create(PREFIX, TYPES), true /* wildcard*/, ignoreCase),
			new ImportNormalizer(QualifiedName.create(PREFIX, FUNCTIONS), true /* wildcard*/, ignoreCase)
		)
	}
	
	override protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		val resolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase)
		if (context instanceof DDomain) {
			val domainName = context.name // domain name (may contain dots but is still a plain string)
			if (domainName !== null) {
				// all the aggregates within the same domain name space as this DDomain will be automatically visible without an import statement
				// resolvers += new ImportNormalizer(QualifiedName.create(domainName), true /* wildcard*/, ignoreCase ) => DOES NOT WORK!!
				// This solution is from: https://de.slideshare.net/holgerschill/deep-dive-into-xtext-scoping-local-and-global-scopes-explained, p. 24
				resolvers += createImportedNamespaceResolver(domainName + ".*", ignoreCase)
			}
		}
		return resolvers
	}
	
}