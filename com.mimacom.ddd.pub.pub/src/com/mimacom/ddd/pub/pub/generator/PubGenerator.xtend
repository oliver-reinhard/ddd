/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.generator

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.pub.pub.Admonition
import com.mimacom.ddd.pub.pub.ChangeHistory
import com.mimacom.ddd.pub.pub.CodeListing
import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.ContentBlock
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.Equation
import com.mimacom.ddd.pub.pub.Figure
import com.mimacom.ddd.pub.pub.Index
import com.mimacom.ddd.pub.pub.List
import com.mimacom.ddd.pub.pub.ListItem
import com.mimacom.ddd.pub.pub.ListOfFigures
import com.mimacom.ddd.pub.pub.ListOfTables
import com.mimacom.ddd.pub.pub.Paragraph
import com.mimacom.ddd.pub.pub.ParagraphStyle
import com.mimacom.ddd.pub.pub.PubModel
import com.mimacom.ddd.pub.pub.Publication
import com.mimacom.ddd.pub.pub.PublicationBody
import com.mimacom.ddd.pub.pub.SegmentWithText
import com.mimacom.ddd.pub.pub.TOC
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TitledBlock
import com.mimacom.ddd.pub.pub.UnformattedParagraph
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.serializer.ISerializer

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PubGenerator extends AbstractGenerator {

	@Inject extension PubHtmlRenderer
	@Inject extension PubNumberingUtil
	@Inject extension PubGeneratorUtil
	@Inject ISerializer serializer
	@Inject DiagramProviderRegistry registry
	
	static final Logger LOGGER = Logger.getLogger(PubGenerator);

	var IFileSystemAccess2 fileSystemAccess
//	var IGeneratorContext generatorContext
	var java.util.List<Division> allDivisionsInSequenceOfOccurrenceCache
	var java.util.List<Table> allTablesInSequenceOfOccurrenceCache
	var java.util.List<Figure> allFiguresInSequenceOfOccurrenceCache

	val nestedContentBlockGenerator = new NestedContentBlockGenerator {

		override generate(ContentBlock b) {
			b.genBlock
		}
	}

	override synchronized void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		this.fileSystemAccess = fsa
//		this.generatorContext = context
		val model = resource.contents.get(0) as PubModel
		if (model.document !== null) {
			model.document.prepare(fsa)
			val text = model.document.genDocument
			fsa.generateFile(model.document.fileName, text)
			model.document.finish(fsa)
		}
	}

	//
	// Documents
	//
	def dispatch CharSequence genDocument(Publication pub) {
	}

	def dispatch CharSequence genDocument(Component comp) {
		comp.initialiseNumberingCaches
		val segmentIterator = '''
		«FOR seg : comp.segments»
			«seg.genSegment»
		«ENDFOR»'''
		comp.renderDocument([segmentIterator])
	}

	def void initialiseNumberingCaches(Component compo) {
		allDivisionsInSequenceOfOccurrenceCache = compo.gatherAllDivisionsAndSetSequenceNumbers
		allTablesInSequenceOfOccurrenceCache = compo.gatherAllTablesInSequenceAndSetSequenceNumbers
		allFiguresInSequenceOfOccurrenceCache = compo.gatherAllFiguresInSequenceAndSetSequenceNumbers
	}

	//
	// Segments
	//
	def dispatch CharSequence genSegment(SegmentWithText seg) {
		val blockIterator = '''
			«FOR block : seg.contents»
				«block.genBlock»
			«ENDFOR»
		'''
		seg.renderSegment([blockIterator])
	}

	def dispatch CharSequence genSegment(PublicationBody seg) {
		val divisionIterator = '''
			«FOR div : seg.divisions»
				
					«div.genDivision»
			«ENDFOR»
		'''
		seg.renderSegment([divisionIterator])
	}

	def dispatch CharSequence genSegment(TOC seg) {
		val Table t = seg.toTable(allDivisionsInSequenceOfOccurrenceCache)
		seg.renderSegment(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genSegment(ListOfTables seg) {
		val Table t = seg.toTable(allTablesInSequenceOfOccurrenceCache)
		seg.renderSegment(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genSegment(ListOfFigures seg) {
		val Table t = seg.toTable(allFiguresInSequenceOfOccurrenceCache)
		seg.renderSegment(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genSegment(ChangeHistory seg) {
		val Table t = seg.toTable
		seg.renderSegment(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genSegment(Index seg) {
		seg.renderSegment
	}

	def dispatch CharSequence genSegment(DocumentSegment seg) {
		throw new IllegalArgumentException("Unsupported segment type: " + seg.class.name)
	}

	//
	// Divisions
	//
	def CharSequence genDivision(Division div) {
		var divTitle = div
		var divContents = div
		if (div.include !== null) {
			divContents = div.include
			if (div.title === null) {
				divTitle = div.include
			}
		}
		// Always use the title of the "native" division
		'''
			«divTitle.renderTitle»
			«FOR block : divContents.contents»
				«block.genBlock»
			«ENDFOR»
			«FOR subdiv : divContents.divisions»
				
					«subdiv.genDivision»
			«ENDFOR»
		'''
	}

	//
	// Content
	//
	def dispatch CharSequence genBlock(Admonition a) {
		a.renderAdmonition
	}

	def dispatch CharSequence genBlock(List list) {
		val itemIterator = '''
			«FOR item : list.items»
				«item.genListItem»
			«ENDFOR»
		'''
		switch list.style {
			case BULLET: renderBulletList(list, [itemIterator])
			case SEQUENCE: renderNumberedList(list, [itemIterator])
			case TITLE: renderTitledList(list, [itemIterator])
		}
	}

	def CharSequence genListItem(ListItem item) {
		val blockIterator = '''
		«FOR block : item.contents»
			«block.genBlock»
		«ENDFOR»'''
		switch item.list.style {
			case BULLET,
			case SEQUENCE: renderListItem(item, [blockIterator])
			case TITLE: renderTitledListItem(item, [blockIterator])
		}
	}

	def dispatch CharSequence genBlock(TitledBlock b) {
		val blockBodyDispatcher = '''
			«b.genTitledBlock»
			«b.renderTitledBlockTitle»
		'''
		renderTitledBlock(b, [blockBodyDispatcher])
	}

	def dispatch CharSequence genTitledBlock(Table t) {
		renderTable(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genTitledBlock(Figure f) {
		if (f.fileUri !== null) {
			// TODO copy file to output
			renderFigure(f, f.fileUri)
		} else {
			val provider = registry.getDiagramProvider(f.renderer.name)
			if (provider !== null) {
				val fileName = "figures/figure_" + f.tieredNumber
				val fileExtension = provider.format.name.toLowerCase
				val inputStream = provider.render(f.diagramRoot)
				val file = fileName + "." + fileExtension
				fileSystemAccess.generateFile(file, inputStream)
				renderFigure(f, file)
			} else {
				val msg = "Figure renderer '" + f.renderer.name + "' not found."
				LOGGER.error(msg)
				return "ERROR: " + msg
			}
		}
	}

	def dispatch CharSequence genTitledBlock(Equation e) {
		renderEquation(e)
	}

	def dispatch CharSequence genTitledBlock(CodeListing cl) {
		if (cl.include !== null) {
			try {
				var formattedCode = serializer.serialize(cl.include) // throws RuntimeException
				renderCodeListing(cl, Lists.newArrayList(formattedCode))
			} catch (RuntimeException ex) {
				// ignore – the syntax for the include is temporarily inconsistent and cannot be serialised
				// A validation is in place and this exception should never be thrown.
			}
		} else {
			renderCodeListing(cl, cl.codeLines)
		}
	}

	def dispatch CharSequence genBlock(Paragraph para) {
		if (para.style == ParagraphStyle.QUOTE) {
			return para.renderQuotedParagraph
		} else {
			return para.renderPlainParagraph
		}
	}

	def dispatch CharSequence genBlock(UnformattedParagraph para) {
		para.renderUnformattedParagraph
	}

	def dispatch CharSequence genBlock(ContentBlock block) {
		throw new IllegalArgumentException("Unsupported content-block type: " + block.class.name)
	}
}
