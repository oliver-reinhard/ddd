/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.validation

import com.google.common.collect.Sets
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DRichText
import com.mimacom.ddd.dm.base.DTextSegment
import com.mimacom.ddd.dm.base.richText.RichTextUtil
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxStaticReference
import com.mimacom.ddd.pub.pub.Chapter
import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.Document
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.IncludedFigure
import com.mimacom.ddd.pub.pub.ListItem
import com.mimacom.ddd.pub.pub.ListStyle
import com.mimacom.ddd.pub.pub.Part
import com.mimacom.ddd.pub.pub.ProvidedFigure
import com.mimacom.ddd.pub.pub.ProvidedTable
import com.mimacom.ddd.pub.pub.PubPackage
import com.mimacom.ddd.pub.pub.PubUtil
import com.mimacom.ddd.pub.pub.PublicationBody
import com.mimacom.ddd.pub.pub.Section
import com.mimacom.ddd.pub.pub.Subsection
import com.mimacom.ddd.pub.pub.Subsubsection
import com.mimacom.ddd.pub.pub.Symbol
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TitledBlock
import com.mimacom.ddd.pub.pub.TitledCodeListing
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil
import com.mimacom.ddd.pub.pub.impl.PubConstants
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.serializer.ISerializer
import org.eclipse.xtext.validation.Check

import static com.mimacom.ddd.pub.proto.derivedState.PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PubValidator extends AbstractPubValidator {

	static val BASE = BasePackage.eINSTANCE
	static val PUB = PubPackage.eINSTANCE

	@Inject extension RichTextUtil
	@Inject extension PubUtil
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
	def generatorTarget(Document doc) {
		if (!(doc.generateHtml || doc.generateLaTeX || doc.generateMarkdown || doc.generateAsciiDoc)) {
			error("Document must define at least one generator target.", PUB.document_PublicationClass)
		}
	}

	@Check
	def protoSymbols(Document doc) {
		if (doc.publicationClass !== null) {
			for (protoSymbol : doc.publicationClass.symbols) {
				if (doc.getSymbol(protoSymbol.name) === null) {
					val msg = "Document must define prototype symbol '" + protoSymbol.name + "'"
					if (! (doc.symbols.empty || doc.symbols.head.name == TITLE_SYMBOL_NAME)) {
						// the symbol TITLE_SYMBOL_NAME is a synthetic element that has not parse-tree node.
						error(msg, doc.symbols.head, BASE.DNamedElement_Name)
					} else {
						error(msg, PUB.referenceTarget_Name)
					}
				}
			}
		}
	}

	@Check
	def symbolIsUppercase(Symbol s) {
		if (! s.name.equals(s.name.toUpperCase)) {
			warning("Symbol name should be ALL UPPPERCASE", s, BASE.DNamedElement_Name)
		}
	}

	@Check
	def symbolValueIsNotEmpty(Symbol s) {
		if (s.value.empty) {
			error("Symbol value is empty", s, PUB.symbol_Value)
		}
	}

	@Check(NORMAL)
	def includedDivisionSymbolsAreDefined(Division div) {
		if (div.include !== null) {
			val doc = EcoreUtil2.getContainerOfType(div, Document)
			val includedDoc = EcoreUtil2.getContainerOfType(div.include, Document)
			if (doc !== null && includedDoc !== null) {
				for (includeSymbol : includedDoc.symbols) {
					if (doc.getSymbol(includeSymbol.name) === null) {
						error("This document must define symbol '" + includeSymbol.name +
							"' of included-division document", PUB.division_Include)
					}
				}

			}
		}
	}

	@Check
	def segmentsOfDocumentClass(DocumentSegment seg) {
		if (seg.prototype === null) {
			val node = NodeModelUtils.findActualNodeFor(seg)
			acceptError(seg.displayName +
				" is not a valid segment with respect to the class definition for this document", seg, node.offset,
				node.length, null)
		}
	}

	@Check
	def divisionsOfDocumentClass(Division div) {
		if (div.prototype === null) {
			error(div.displayName + " is not a valid division with respect to the class definition for this document",
				PUB.division_Title)
		}
	}

	@Check
	def partsXorChaptersXorSections(PublicationBody body) {
		var parts = body.divisions.filter(Part)
		var chapters = body.divisions.filter(Chapter)
		var sections = body.divisions.filter(Section)
		if (! parts.empty && ! chapters.empty || ! parts.empty && ! sections.empty ||
			! sections.empty && ! chapters.empty) {
			val msg = "Cannot only have one type of division (Part, Chapter, Section) at the top level."
			val part = parts.head
			if (part !== null) {
				error(msg, part, PUB.division_Title) // flag first occurrence
			}
			val chapter = chapters.head
			if (chapter !== null) {
				error(msg, chapter, PUB.division_Title) // flag first occurrence
			}
			val section = sections.head
			if (section !== null) {
				error(msg, section, PUB.division_Title) // flag first occurrence
			}
		}
	}

	@Check
	def includeIsNotTransitive(Division div) {
		if (div.include !== null && div.include.include !== null) {
			error("Included division cannot itself include another division. Replace with non-transitive include.",
				PUB.division_Include)
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
	def includedFigureFileExists(IncludedFigure f) {
		if (f.fileUri === null || f.fileUri.empty) {
			error("File URI cannot be empty", f.eContainer, PUB.titledBlock_Title)
			return
		}
		val fileUri = URI.createURI(f.fileUri)
		val file = f.eResource.resourceFile(fileUri)
		if (!file.exists) {
			error("File does not exist", PUB.includedFigure_FileUri)
		}
	}

	@Check(NORMAL)
	def diagramCanRender(ProvidedFigure f) {
		if (f.diagramRoot !== null && f.renderer !== null && f.renderer.name !== null) {
			val provider = diagramProviderRegistry.getDiagramRenderer(f.renderer.name)
			if (! provider.canRender(f.diagramRoot)) {
				error("The referenced model does not provide content, the generated diagram will be empty",
					PUB.providedFigure_DiagramRoot)
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
				error("The referenced model does not provide content, the generated table will be empty",
					PUB.providedTable_DiagramRoot)
			}
		}
	}

	//
	// laTeX
	//
	protected def boolean generateHtml(EObject obj) {
		val document = EcoreUtil2.getContainerOfType(obj, Document)
		return document !== null && document.generateHtml
	}

	protected def boolean generateLaTeX(EObject obj) {
		val document = EcoreUtil2.getContainerOfType(obj, Document)
		return document !== null && document.generateLaTeX
	}

	protected def boolean generateMarkdown(EObject obj) {
		val document = EcoreUtil2.getContainerOfType(obj, Document)
		return document !== null && document.generateMarkdown
	}

	protected def boolean generateAsciiDoc(EObject obj) {
		val document = EcoreUtil2.getContainerOfType(obj, Document)
		return document !== null && document.generateAsciiDoc
	}
}
