package com.mimacom.ddd.dm.base.transpose

import com.google.common.collect.Sets
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.base.base.ITypeContainer
import java.util.Collections
import java.util.Set
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.impl.ImportNormalizer
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

class TransposeAwareScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	static val LOGGER = Logger.getLogger(TransposeAwareScopeProvider);

	def Iterable<IEObjectDescription> filterByImportedNamespaces(EObject context, Iterable<IEObjectDescription> descriptions, boolean ignoreCase) {
		val namespace = EcoreUtil2.getContainerOfType(context, DNamespace)
		if (namespace === null) {
			return Collections.EMPTY_LIST
		}
		val namespaceResolvers = getImportedNamespaceResolvers(namespace, ignoreCase)
		// Ensure no duplicates even when adding more elements:
		val namespaceResolversSet = Sets.newHashSet(namespaceResolvers)
		namespaceResolversSet.addLocalNamespaceResolver(namespace.model, ignoreCase)
		val typeContainer = EcoreUtil2.getContainerOfType(context, ITypeContainer)
		namespaceResolversSet.addLocalNamespaceResolver(typeContainer, ignoreCase)
		return resolveDescriptions(descriptions, namespaceResolversSet, ignoreCase);
	}

	protected def void addLocalNamespaceResolver(Set<ImportNormalizer> namespaceResolvers, EObject namespace, boolean ignoreCase) {
		if (namespace !== null) {
			val name = getQualifiedNameOfLocalElement(namespace);
			if (name !== null && ! name.empty) {
				val localNormalizer = doCreateImportNormalizer(name, true, ignoreCase);
				namespaceResolvers.add(localNormalizer)
			}
		}
	}

	protected def Iterable<IEObjectDescription> resolveDescriptions(Iterable<IEObjectDescription> candidates, Iterable<ImportNormalizer> normalizers,
		boolean ignoreCase) {
		val result = Sets.newHashSet;
		for (desc : candidates) {
			val name = desc.qualifiedName
			for (ImportNormalizer normalizer : normalizers) {
				val alias = normalizer.deresolve(name);
				if (alias !== null && alias.segmentCount == 1) {
					if (LOGGER.debugEnabled) {
						LOGGER.debug("Match " + name + " with import " + normalizer)
					}
					result.add(desc);
				}
			}
//			// From: ImportNormalizer.getLocalElementsByName():
//			var QualifiedName resolvedQualifiedName = null;
//			for (ImportNormalizer normalizer : normalizers) {
//				val resolvedName = normalizer.resolve(name);
//				if (resolvedName !== null) {
//					val resolvedElements = importFrom.getExportedObjects(type, resolvedName,
//						ignoreCase);
//					for (resolvedElement : resolvedElements) {
//						if (resolvedQualifiedName === null) {
//							resolvedQualifiedName = resolvedName
//						} else if (!resolvedQualifiedName.equals(resolvedName)) {
//							if (result.get(0).getEObjectOrProxy() != resolvedElement.getEObjectOrProxy()) {
//								return emptyList();
//							}
//						}
//					}
//					val alias = normalizer.deresolve(resolvedElement.getName());
//					if (alias === null)
//						throw new IllegalStateException(
//							"Couldn't deresolve " + resolvedElement.getName() + " with import " + normalizer);
//					val aliasedEObjectDescription = new AliasedEObjectDescription(alias, resolvedElement);
//					result.add(aliasedEObjectDescription);
//				}
		}
		return result
	}
}
