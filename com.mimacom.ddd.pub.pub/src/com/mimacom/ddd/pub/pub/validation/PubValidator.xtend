/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.validation

import com.google.common.collect.Sets
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DRichText
import com.mimacom.ddd.dm.base.DTextSegment
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxStaticReference
import com.mimacom.ddd.pub.pub.Chapter
import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.Document
import com.mimacom.ddd.pub.pub.ListItem
import com.mimacom.ddd.pub.pub.ListStyle
import com.mimacom.ddd.pub.pub.Part
import com.mimacom.ddd.pub.pub.ProvidedFigure
import com.mimacom.ddd.pub.pub.ProvidedTable
import com.mimacom.ddd.pub.pub.PubElementNames
import com.mimacom.ddd.pub.pub.PubPackage
import com.mimacom.ddd.pub.pub.PubUtil
import com.mimacom.ddd.pub.pub.PublicationBody
import com.mimacom.ddd.pub.pub.Section
import com.mimacom.ddd.pub.pub.Subsection
import com.mimacom.ddd.pub.pub.Subsubsection
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TitledBlock
import com.mimacom.ddd.pub.pub.TitledCodeListing
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil
import com.mimacom.ddd.pub.pub.impl.PubConstants
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PubValidator extends AbstractPubValidator {

	static val BASE = BasePackage.eINSTANCE
	static val PUB = PubPackage.eINSTANCE
	
	@Inject extension PubUtil
	@Inject extension PubElementNames
	@Inject extension PubNumberingUtil
	@Inject ISerializer serializer
	@Inject TableProviderRegistry tableProviderRegistry
	@Inject DiagramProviderRegistry diagramProviderRegistry

	val tableValidator = new PubTableValidator(this)

	@Check
	def publicationClass(Document doc) {
		if (doc.publicationClass === null) {
			error("Document has no publication class.", PUB.document_PublicationClass)
		}
	}

	@Check
	def partsXorSections(PublicationBody body) {
		var parts = body.divisions.filter(Part)
		var chapters = body.divisions.filter(Chapter)
		if (! parts.empty && ! chapters.empty) {
			error("Cannot have both Parts and Chapters at the top level.", body.divisions.head, PUB.division_Title) // flag first occurrence
		}
	}

	@Check
	def divisionStructuralIntegrity(Division d) {
		if (d.include !== null) {
			if (! d.divisions.empty) {
				error("A division with an include cannot also contain divisions", PUB.divisionContainer_Divisions, 0)
			}
			if (! d.contents.empty) {
				error("A division with an include cannot also define contents", PUB.blockContainer_Contents, 0)
			}
			if (d.class != d.include.class) {
				error("Division include must be of the same type as the including division: " + d.include.displayName,
					PUB.division_Include)
			}
		} else if (! d.divisions.empty) {
			val head = d.divisions.head
			val clazz = head.class
			switch d {
				Part:
					if (clazz.isAssignableFrom(Chapter)) {
						error("A Part must contain subdivisions of type Chapter.", head, PUB.division_Title)
					}
				Chapter:
					if (clazz.isAssignableFrom(Section)) {
						error("A Chapter must contain subdivisions of type Section.", head, PUB.division_Title)
					}
				Section:
					if (clazz.isAssignableFrom(Subsection)) {
						error("A Section must contain subdivisions of type Subsection.", head, PUB.division_Title)
					}
				Subsection:
					if (clazz.isAssignableFrom(Subsubsection)) {
						error("A Subsection must contain subdivisions of type Subsubsection.", head, PUB.division_Title)
					}
				Subsubsection:
					error("A Subsubsection cannot contain subdivisions.", head, PUB.division_Title)
			}
			for (subdiv : d.divisions) {
				if (subdiv.class != clazz) {
					val msg = "A division can only contain subdivisions of the same type."
					error(msg, head, PUB.division_Title)
					error(msg, subdiv, PUB.division_Title)
				}
			}

		}
	}

	@Check(NORMAL)
	def divisionIsOnlyIncludedOnce(Component compo) {
		val allDivisionsInSequenceOfOccurrence = compo.gatherAllDivisionsAndSetSequenceNumbers
		val divisionsSet = Sets.newHashSet
		val msg = "A division can only be included once and there can be no overlaps: "
		for (div : allDivisionsInSequenceOfOccurrence) {
			if (! divisionsSet.add(div)) {
				error(msg, div, PUB.division_Include)
			}
			if (div.include !== null && ! divisionsSet.add(div.include)) {
				error(msg, div, PUB.division_Include)
			}
		}
	}

	@Check(NORMAL)
	def includedCodeSyntax(TitledCodeListing cl) {
		if (cl.include !== null) {
			var hasErrors = false
			val res = cl.include.eResource
			if (res instanceof XtextResource) {
				hasErrors = res.parseResult.hasSyntaxErrors
			}
			if (! hasErrors) {
				try {
					serializer.serialize(cl.include) // throws RuntimeException
				} catch (RuntimeException ex) {
					// the syntax for the include is temporarily inconsistent and cannot be serialised
					hasErrors = true
				}
			}
			if (hasErrors) {
				error("Code for the included expression has errors.", PUB.titledCodeListing_Include)
			}
		}
	}

	@Check
	def startNumberOnlyAtFirstDivision(Division div) {
		if (div.getSequenceNumber > 0 && div.startNumberingAt != PubConstants.DIVISION_NUMBERING_DEFAULT_START_VALUE) {
			error("The numbering start can only be defined by the first element at that level.",
				PUB.division_StartNumberingAt)
		}
	}

	@Check
	def titleForTitledListItems(ListItem item) {
		val style = item.list.style
		if (style == ListStyle.TITLE && item.title.empty) {
			error("Item title must be defined for list style '" + style.literal + "'.", item.list, PUB.list_Items,
				item.list.items.indexOf(item))
		} else if (style != ListStyle.TITLE && ! (item.title.empty)) {
			error("Item cannot have a title for list style '" + style.literal + "'.", PUB.listItem_Title)
		}
	}

	@Check
	def includedDividionDoesNotInclude(Division div) {
		if (div.include !== null && div.include.include !== null) {
			error("Included division cannot itself include another division. Replace with non-transitive include.",
				PUB.division_Include)
		}
	}

	@Check
	def titledBlockExpressionIsReference(DRichText rt) {
		val parent = rt.eContainer
		if (parent instanceof TitledBlock || parent instanceof Division) {
			for (var i = 0; i < rt.segments.length; i++) {
				// only check top-level expression elements
				switch rt.segments.get(i) {
					DTextSegment: {
					}
					DmxContextReference: {
					}
					DmxStaticReference: {
					}
					default:
						error(
							"Titles can only contain expressions that are a direct reference to an external model element.",
							rt, BASE.DRichText_Segments, i)
				}
			}
		}
	}

	//
	// Tables
	//
	@Check
	def table(Table t) {
		tableValidator.validate(t)
	}
	
	//
	// Figure / Diagram Renderers
	//
	@Check(NORMAL)
	def diagramCanRender(ProvidedFigure f) {
		if (f.diagramRoot !== null && f.renderer !== null && f.renderer.name !== null) {
			val provider = diagramProviderRegistry.getDiagramRenderer(f.renderer.name)
			if (! provider.canRender(f.diagramRoot)) {
				error("The referenced model does not provide content, the generated diagram will be empty", PUB.providedFigure_DiagramRoot)
			}
		}
	}
	
	//
	// Table Renderers
	//
	@Check(NORMAL)
	def tableCanRender(ProvidedTable t) {
		if (t.diagramRoot !== null && t.renderer !== null && t.renderer.name !== null) {
			val provider = tableProviderRegistry.getTableRenderer(t.renderer.name)
			if (! provider.canRender(t.diagramRoot)) {
				error("The referenced model does not provide content, the generated table will be empty", PUB.providedTable_DiagramRoot)
			}
		}
	}
	
}
