/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.generator

import com.google.inject.Inject
import com.mimacom.ddd.pub.pub.Admonition
import com.mimacom.ddd.pub.pub.ChangeHistory
import com.mimacom.ddd.pub.pub.Chapter
import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.ContentBlock
import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.Document
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.Equation
import com.mimacom.ddd.pub.pub.Footnote
import com.mimacom.ddd.pub.pub.IncludedFigure
import com.mimacom.ddd.pub.pub.Index
import com.mimacom.ddd.pub.pub.List2
import com.mimacom.ddd.pub.pub.ListItem
import com.mimacom.ddd.pub.pub.ListOfFigures
import com.mimacom.ddd.pub.pub.ListOfTables
import com.mimacom.ddd.pub.pub.ParagraphStyle
import com.mimacom.ddd.pub.pub.Part
import com.mimacom.ddd.pub.pub.ProvidedFigure
import com.mimacom.ddd.pub.pub.ProvidedTable
import com.mimacom.ddd.pub.pub.PubModel
import com.mimacom.ddd.pub.pub.PubPlatformUtil
import com.mimacom.ddd.pub.pub.PubUtil
import com.mimacom.ddd.pub.pub.Publication
import com.mimacom.ddd.pub.pub.PublicationBody
import com.mimacom.ddd.pub.pub.RichTextParagraph
import com.mimacom.ddd.pub.pub.RichTextReferencingParagraph
import com.mimacom.ddd.pub.pub.SegmentWithText
import com.mimacom.ddd.pub.pub.TOC
import com.mimacom.ddd.pub.pub.Table
import com.mimacom.ddd.pub.pub.TitledBlock
import com.mimacom.ddd.pub.pub.TitledCodeListing
import com.mimacom.ddd.pub.pub.TitledFigure
import com.mimacom.ddd.pub.pub.TitledTable
import com.mimacom.ddd.pub.pub.UnformattedParagraph
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PubGeneratorDelegate {

	extension AbstractPubRenderer renderer
	@Inject extension PubUtil
	@Inject extension PubPlatformUtil
	@Inject extension PubNumberingUtil
	@Inject extension PubGeneratorUtil
	@Inject extension CodeListingFormatter
	@Inject TableProviderRegistry tableProviderRegistry

	static val Logger LOGGER = Logger.getLogger(PubGeneratorDelegate);
	static val FIGURES_GEN_DIRECTORY = "figures"

	var Resource resource
	var IFileSystemAccess2 fileSystemAccess
	var Document doc
	var String genDirectory
//	var IGeneratorContext generatorContext
	var java.util.List<Division> allDivisionsInSequenceOfOccurrenceCache
	var java.util.List<TitledTable> allTablesInSequenceOfOccurrenceCache
	var java.util.List<TitledFigure> allFiguresInSequenceOfOccurrenceCache

	val nestedContentBlockGenerator = new NestedContentBlockGenerator {

		override generate(ContentBlock b) {
			b.genBlock
		}
	}

	/*
	 * Execute once.
	 */
	def void init(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		this.resource = resource
		this.fileSystemAccess = fsa
//		this.generatorContext = context
		val model = this.resource.contents.get(0) as PubModel
		this.doc = model.document
		if (doc !== null) {
			if (doc instanceof Component) {
				doc.initialiseNumberingCaches
			}
		}
	}

	protected def void initialiseNumberingCaches(Component compo) {
		allDivisionsInSequenceOfOccurrenceCache = compo.gatherAllDivisionsAndSetSequenceNumbers
		allTablesInSequenceOfOccurrenceCache = compo.gatherAllTablesInSequenceAndSetSequenceNumbers
		allFiguresInSequenceOfOccurrenceCache = compo.gatherAllFiguresInSequenceAndSetSequenceNumbers
		compo.gatherAllCodeListingsInSequenceAndSetSequenceNumbers
		compo.gatherAllFootnotesInSequenceAndSetSequenceNumbers
	}

	/*
	 * Execute once per target.
	 */
	def generate(AbstractPubRenderer renderer) {
		if (doc !== null) {
			this.renderer = renderer
			genDirectory = doc.fileSuffix
			doc.prepare(fileSystemAccess)
			val text = doc.genDocument
			fileSystemAccess.generateFile(genDirectory + "/" + doc.fileName, text)
			doc.finish(fileSystemAccess)
		}
	}

	//
	// Documents
	//
	def dispatch CharSequence genDocument(Publication pub) {
	}

	def dispatch CharSequence genDocument(Component comp) {
		val segmentIterator = '''
		«FOR seg : comp.segments»
			«seg.genSegment»
		«ENDFOR»'''
		comp.renderDocument([segmentIterator])
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

	def dispatch CharSequence genSegment(PublicationBody body) {
		val topLevelDivision = body.divisions.head
		val hasChapters = topLevelDivision instanceof Part || topLevelDivision instanceof Chapter
		val divisionIterator = '''
			«FOR div : body.divisions»
				
				«div.genDivision»
			«ENDFOR»
			«IF ! hasChapters»«body.genFootnotes(true)»«ENDIF»
		'''
		body.renderSegment([divisionIterator])
	}

	def dispatch CharSequence genSegment(TOC toc) {
		val Table t = toc.toTable(allDivisionsInSequenceOfOccurrenceCache)
		toc.renderSegment(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genSegment(ListOfTables lot) {
		val Table t = lot.toTable(allTablesInSequenceOfOccurrenceCache)
		lot.renderSegment(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genSegment(ListOfFigures lof) {
		val Table t = lof.toTable(allFiguresInSequenceOfOccurrenceCache)
		lof.renderSegment(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genSegment(ChangeHistory hist) {
		val Table t = hist.toTable
		hist.renderSegment(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genSegment(Index index) {
		index.renderSegment
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
			«IF div instanceof Part && ! divContents.divisions.empty && (div.eContainer as PublicationBody).divisions.last !== div»«div.genFootnotes(false)»«ENDIF»
			
			«FOR subdiv : divContents.divisions»
				
					«subdiv.genDivision»
			«ENDFOR»
			«IF div instanceof Chapter»«div.genFootnotes(true)»«ENDIF»
		'''
	}

	//
	// Content
	//
	def dispatch CharSequence genBlock(Admonition a) {
		a.renderAdmonition
	}

	def dispatch CharSequence genBlock(List2 list) {
		val itemIterator = '''
			«FOR item : list.items»
				«item.genListItem»
			«ENDFOR»
		'''
		switch list.style {
			case BULLET: list.renderBulletList([itemIterator])
			case SEQUENCE: list.renderNumberedList([itemIterator])
			case TITLE: list.renderTitledList([itemIterator])
		}
	}

	def CharSequence genListItem(ListItem item) {
		val blockIterator = '''
		«FOR block : item.contents»
			«block.genBlock»
		«ENDFOR»'''
		switch item.list.style {
			case BULLET,
			case SEQUENCE: item.renderListItem([blockIterator])
			case TITLE: item.renderTitledListItem([blockIterator])
		}
	}

	def dispatch CharSequence genBlock(TitledBlock b) {
		val blockBodyDispatcher = '''
			«b.genTitledBlock»
			«b.renderTitledBlockTitle»
		'''
		b.renderTitledBlock([blockBodyDispatcher])
	}

	def dispatch CharSequence genTitledBlock(TitledTable t) {
		genTable(t.table)
	}

	def dispatch CharSequence genTable(Table t) {
		renderTable(t, nestedContentBlockGenerator)
	}

	def dispatch CharSequence genTable(ProvidedTable t) {
		val provider = tableProviderRegistry.getTableRenderer(t.tableType.name)
		if (provider !== null) {
			val table = provider.render(t.diagramRoot)
			table.widthPercent = t.widthPercent
			table.gridlines = t.gridlines
			renderTable(table, nestedContentBlockGenerator)
		} else {
			val msg = "Table renderer '" + t.tableType.name + "' not found."
			LOGGER.error(msg)
			return "ERROR: " + msg
		}
	}

	def dispatch CharSequence genTitledBlock(TitledFigure f) {
		genFigure(f.figure)
	}

	def dispatch CharSequence genFigure(IncludedFigure f) {
		val fileUri = URI.createURI(f.fileUri)
		val file = f.eResource.resourceFile(fileUri)
		// copy the file to the output location
		val outputFileName = FIGURES_GEN_DIRECTORY + "/" + fileUri.segments.last
		fileSystemAccess.generateFile(genDirectory + "/" + outputFileName, file.contents)
		renderFigure(f, outputFileName)
	}

	def dispatch CharSequence genFigure(ProvidedFigure f) {
		val rendererProxy = f.preferredDiagramRenderer(diagramFileFormatPreference)
		if (rendererProxy !== null) {
			val fileName = FIGURES_GEN_DIRECTORY + "/figure-" + (f.eContainer as TitledFigure).tieredNumber
			val fileExtension = rendererProxy.format.name.toLowerCase
			val inputStream = rendererProxy.render(f.diagramRoot)
			val file = fileName + "." + fileExtension
			fileSystemAccess.generateFile(genDirectory + "/" + file, inputStream)
			renderFigure(f, file)
		} else {
			val msg = "Figure renderer '" + f.diagramType.name + "' not found."
			LOGGER.error(msg)
			return "ERROR: " + msg
		}
	}

	def dispatch CharSequence genTitledBlock(Equation e) {
		renderEquation(e)
	}

	def dispatch CharSequence genTitledBlock(TitledCodeListing cl) {
		var formattedCode = if (cl.include !== null) {
			val sourceCode = cl.include.sourceCodeFromXtextResource  // there is a validation: sourceCode never null
			sourceCode.trimBlankLines
		}else {
			cl.codeLines.trimBlankLines
		}
		formattedCode = formattedCode.outdent(PubGeneratorUtil::TAB_SIZE)
		renderCodeListing(cl, formattedCode)
	}

	def dispatch CharSequence genBlock(RichTextParagraph para) {
		if (para.style == ParagraphStyle.QUOTE) {
			return para.renderQuotedParagraph
		} else {
			return para.renderPlainParagraph
		}
	}

	def dispatch CharSequence genBlock(UnformattedParagraph para) {
		para.renderUnformattedParagraph
	}

	def dispatch CharSequence genBlock(RichTextReferencingParagraph para) {
		para.renderRichTextReferencingParagraph
	}

	def dispatch CharSequence genBlock(Footnote f) {
		// for some targets, footnotes are inlined at any defined, then they are placed by the target's processor
		f.renderFootnoteInPlace
	}

	def dispatch CharSequence genBlock(ContentBlock block) {
		throw new IllegalArgumentException("Unsupported content-block type: " + block.class.name)
	}

	def CharSequence genFootnotes(EObject container, boolean allContents) {
		val footnotes = allContents ? EcoreUtil2.eAllOfType(container, Footnote) : container.eContents.filter(Footnote)
		'''«IF (! footnotes.empty)»«footnotes.renderFootnotes»«ENDIF»'''
	}
}
