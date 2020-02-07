/*

 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.scoping

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.pub.pub.Figure
import com.mimacom.ddd.pub.pub.PubModel
import com.mimacom.ddd.pub.pub.PubPackage
import com.mimacom.ddd.pub.pub.Reference
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class PubScopeProvider extends AbstractPubScopeProvider {

	static val PUB = PubPackage.eINSTANCE

	@Inject IQualifiedNameProvider qualifiedNameProvider
	@Inject DiagramProviderRegistry registry

	override IScope getScope(EObject context, EReference reference) {

		if (reference == PUB.reference_Target && context instanceof Reference) {
			val targetScope = switch (context as Reference).scope {
				case DOCUMENT_SEGMENT: PUB.documentSegment
				case DIVISION: PUB.division
				case PART: PUB.part
				case APPENDIX: PUB.appendix
				case CHAPTER: PUB.chapter
				case SECTION: PUB.section
				case SUBSECTION: PUB.subsection
				case SUBSUBSECTION: PUB.subsubsection
				case TABLE: PUB.table
				case FIGURE: PUB.figure
				case EQUATION: PUB.equation
				case CODE_LISTING: PUB.codeListing
				case ADMONITION: PUB.admonition
				case ABBREVIATION: PUB.abbreviation
				case GLOSSARY: PUB.glossaryEntry
				case BIBLIOGRAPHY: PUB.bibliographyEntry
				default: PUB.referenceTarget
			}
			return getDefaultScopeOfType(context, targetScope)

		} else if (reference == PUB.figure_Renderer && context instanceof Figure) {
			val figure = context as Figure
			val model = EcoreUtil2.getContainerOfType(context, PubModel)
			if (model !== null) {
				// model.figureRenderers are installed by ExtensionPointsScopeElementsDerivedStateComputer
				if (model.figureRenderers.empty) {
					return IScope.NULLSCOPE
					
				} else if (figure.diagramRoot !== null) {
					// limit figure renderers to those providing for the class of the given diagram-root: 
					val diagramProviderIds = registry.getDiagramProviders(figure.diagramRoot.class).map[it.id].toList
					// Scopes.scopeFor does not use an IQualifiedNameProvider to compute the qualified name of the objects
					return createScopeWithQualifiedNames(model.figureRenderers.filter[diagramProviderIds.contains(it.name)])
				}
			}
		}
		return super.getScope(context, reference)
	}

	protected def createScopeWithQualifiedNames(Iterable<? extends EObject> objects) {
		val List<IEObjectDescription> descriptions = Lists.newArrayList
		for (obj : objects) {
			descriptions.add(new EObjectDescription(qualifiedNameProvider.getFullyQualifiedName(obj), obj, null))
		}
		return new SimpleScope(descriptions)
	}
}
