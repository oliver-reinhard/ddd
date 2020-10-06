package com.mimacom.ddd.dm.dmx.scoping

import com.mimacom.ddd.dm.base.base.DNamespace
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class DmxImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	override protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		val resolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase)
		if (context instanceof DNamespace) {
			val name = context.name // domain name (may contain dots but is still a plain string)
			if (name !== null) {
				// all the aggregates within the same domain name space as this DDomain will be automatically visible without an import statement
				// resolvers += new ImportNormalizer(QualifiedName.create(domainName), true /* wildcard*/, ignoreCase ) => DOES NOT WORK!!
				// This solution is from: https://de.slideshare.net/holgerschill/deep-dive-into-xtext-scoping-local-and-global-scopes-explained, p. 24
				resolvers += createImportedNamespaceResolver(name + ".*", ignoreCase)
			}
		}
		return resolvers
	}
	
}