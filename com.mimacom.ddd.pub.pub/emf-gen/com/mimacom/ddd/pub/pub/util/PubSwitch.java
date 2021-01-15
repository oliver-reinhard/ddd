/**
 */
package com.mimacom.ddd.pub.pub.util;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.IRichTextSegment;

import com.mimacom.ddd.pub.pub.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.pub.PubPackage
 * @generated
 */
public class PubSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PubPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubSwitch() {
		if (modelPackage == null) {
			modelPackage = PubPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PubPackage.PUB_MODEL: {
				PubModel pubModel = (PubModel)theEObject;
				T result = casePubModel(pubModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseReferenceTarget(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.SYMBOL: {
				Symbol symbol = (Symbol)theEObject;
				T result = caseSymbol(symbol);
				if (result == null) result = caseDNamedElement(symbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PUBLICATION: {
				Publication publication = (Publication)theEObject;
				T result = casePublication(publication);
				if (result == null) result = caseDocument(publication);
				if (result == null) result = caseReferenceTarget(publication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseDocument(component);
				if (result == null) result = caseReferenceTarget(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.REFERENCE_TARGET: {
				ReferenceTarget referenceTarget = (ReferenceTarget)theEObject;
				T result = caseReferenceTarget(referenceTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseDExpression(reference);
				if (result == null) result = caseIRichTextSegment(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.DOCUMENT_SEGMENT: {
				DocumentSegment documentSegment = (DocumentSegment)theEObject;
				T result = caseDocumentSegment(documentSegment);
				if (result == null) result = caseReferenceTarget(documentSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.BLOCK_CONTAINER: {
				BlockContainer blockContainer = (BlockContainer)theEObject;
				T result = caseBlockContainer(blockContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.SEGMENT_WITH_TEXT: {
				SegmentWithText segmentWithText = (SegmentWithText)theEObject;
				T result = caseSegmentWithText(segmentWithText);
				if (result == null) result = caseDocumentSegment(segmentWithText);
				if (result == null) result = caseBlockContainer(segmentWithText);
				if (result == null) result = caseReferenceTarget(segmentWithText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.ABSTRACT: {
				Abstract abstract_ = (Abstract)theEObject;
				T result = caseAbstract(abstract_);
				if (result == null) result = caseSegmentWithText(abstract_);
				if (result == null) result = caseDocumentSegment(abstract_);
				if (result == null) result = caseBlockContainer(abstract_);
				if (result == null) result = caseReferenceTarget(abstract_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PREFACE: {
				Preface preface = (Preface)theEObject;
				T result = casePreface(preface);
				if (result == null) result = caseSegmentWithText(preface);
				if (result == null) result = caseDocumentSegment(preface);
				if (result == null) result = caseBlockContainer(preface);
				if (result == null) result = caseReferenceTarget(preface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.EPILOGUE: {
				Epilogue epilogue = (Epilogue)theEObject;
				T result = caseEpilogue(epilogue);
				if (result == null) result = caseSegmentWithText(epilogue);
				if (result == null) result = caseDocumentSegment(epilogue);
				if (result == null) result = caseBlockContainer(epilogue);
				if (result == null) result = caseReferenceTarget(epilogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.SEGMENT_WITH_TABLE: {
				SegmentWithTable segmentWithTable = (SegmentWithTable)theEObject;
				T result = caseSegmentWithTable(segmentWithTable);
				if (result == null) result = caseDocumentSegment(segmentWithTable);
				if (result == null) result = caseBlockContainer(segmentWithTable);
				if (result == null) result = caseReferenceTarget(segmentWithTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.CHANGE_HISTORY: {
				ChangeHistory changeHistory = (ChangeHistory)theEObject;
				T result = caseChangeHistory(changeHistory);
				if (result == null) result = caseSegmentWithTable(changeHistory);
				if (result == null) result = caseDocumentSegment(changeHistory);
				if (result == null) result = caseBlockContainer(changeHistory);
				if (result == null) result = caseReferenceTarget(changeHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.CHANGE_DESCRIPTION: {
				ChangeDescription changeDescription = (ChangeDescription)theEObject;
				T result = caseChangeDescription(changeDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.TOC: {
				TOC toc = (TOC)theEObject;
				T result = caseTOC(toc);
				if (result == null) result = caseSegmentWithTable(toc);
				if (result == null) result = caseDocumentSegment(toc);
				if (result == null) result = caseBlockContainer(toc);
				if (result == null) result = caseReferenceTarget(toc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.ABBREVIATIONS: {
				Abbreviations abbreviations = (Abbreviations)theEObject;
				T result = caseAbbreviations(abbreviations);
				if (result == null) result = caseSegmentWithTable(abbreviations);
				if (result == null) result = caseDocumentSegment(abbreviations);
				if (result == null) result = caseBlockContainer(abbreviations);
				if (result == null) result = caseReferenceTarget(abbreviations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.ABBREVIATION: {
				Abbreviation abbreviation = (Abbreviation)theEObject;
				T result = caseAbbreviation(abbreviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.LIST_OF_TABLES: {
				ListOfTables listOfTables = (ListOfTables)theEObject;
				T result = caseListOfTables(listOfTables);
				if (result == null) result = caseSegmentWithTable(listOfTables);
				if (result == null) result = caseDocumentSegment(listOfTables);
				if (result == null) result = caseBlockContainer(listOfTables);
				if (result == null) result = caseReferenceTarget(listOfTables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.LIST_OF_FIGURES: {
				ListOfFigures listOfFigures = (ListOfFigures)theEObject;
				T result = caseListOfFigures(listOfFigures);
				if (result == null) result = caseSegmentWithTable(listOfFigures);
				if (result == null) result = caseDocumentSegment(listOfFigures);
				if (result == null) result = caseBlockContainer(listOfFigures);
				if (result == null) result = caseReferenceTarget(listOfFigures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.BIBLIOGRAPHY: {
				Bibliography bibliography = (Bibliography)theEObject;
				T result = caseBibliography(bibliography);
				if (result == null) result = caseSegmentWithTable(bibliography);
				if (result == null) result = caseDocumentSegment(bibliography);
				if (result == null) result = caseBlockContainer(bibliography);
				if (result == null) result = caseReferenceTarget(bibliography);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.BIBLIOGRAPHY_ENTRY: {
				BibliographyEntry bibliographyEntry = (BibliographyEntry)theEObject;
				T result = caseBibliographyEntry(bibliographyEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.GLOSSARY: {
				Glossary glossary = (Glossary)theEObject;
				T result = caseGlossary(glossary);
				if (result == null) result = caseSegmentWithTable(glossary);
				if (result == null) result = caseDocumentSegment(glossary);
				if (result == null) result = caseBlockContainer(glossary);
				if (result == null) result = caseReferenceTarget(glossary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.GLOSSARY_ENTRY: {
				GlossaryEntry glossaryEntry = (GlossaryEntry)theEObject;
				T result = caseGlossaryEntry(glossaryEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.INDEX: {
				Index index = (Index)theEObject;
				T result = caseIndex(index);
				if (result == null) result = caseDocumentSegment(index);
				if (result == null) result = caseReferenceTarget(index);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.INDEX_ENTRY: {
				IndexEntry indexEntry = (IndexEntry)theEObject;
				T result = caseIndexEntry(indexEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.SEGMENT_INCLUDE: {
				SegmentInclude segmentInclude = (SegmentInclude)theEObject;
				T result = caseSegmentInclude(segmentInclude);
				if (result == null) result = caseDocumentSegment(segmentInclude);
				if (result == null) result = caseReferenceTarget(segmentInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PUBLICATION_BODY: {
				PublicationBody publicationBody = (PublicationBody)theEObject;
				T result = casePublicationBody(publicationBody);
				if (result == null) result = caseDocumentSegment(publicationBody);
				if (result == null) result = caseDivisionContainer(publicationBody);
				if (result == null) result = caseReferenceTarget(publicationBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.NUMBERED: {
				Numbered numbered = (Numbered)theEObject;
				T result = caseNumbered(numbered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.NUMBERED_BY_CHAPTER: {
				NumberedByChapter numberedByChapter = (NumberedByChapter)theEObject;
				T result = caseNumberedByChapter(numberedByChapter);
				if (result == null) result = caseNumbered(numberedByChapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.DIVISION_CONTAINER: {
				DivisionContainer divisionContainer = (DivisionContainer)theEObject;
				T result = caseDivisionContainer(divisionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseDivisionContainer(division);
				if (result == null) result = caseBlockContainer(division);
				if (result == null) result = caseNumbered(division);
				if (result == null) result = caseReferenceTarget(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = caseDivision(part);
				if (result == null) result = caseDivisionContainer(part);
				if (result == null) result = caseBlockContainer(part);
				if (result == null) result = caseNumbered(part);
				if (result == null) result = caseReferenceTarget(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.APPENDIX: {
				Appendix appendix = (Appendix)theEObject;
				T result = caseAppendix(appendix);
				if (result == null) result = casePart(appendix);
				if (result == null) result = caseDivision(appendix);
				if (result == null) result = caseDivisionContainer(appendix);
				if (result == null) result = caseBlockContainer(appendix);
				if (result == null) result = caseNumbered(appendix);
				if (result == null) result = caseReferenceTarget(appendix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.CHAPTER: {
				Chapter chapter = (Chapter)theEObject;
				T result = caseChapter(chapter);
				if (result == null) result = caseDivision(chapter);
				if (result == null) result = caseDivisionContainer(chapter);
				if (result == null) result = caseBlockContainer(chapter);
				if (result == null) result = caseNumbered(chapter);
				if (result == null) result = caseReferenceTarget(chapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseDivision(section);
				if (result == null) result = caseDivisionContainer(section);
				if (result == null) result = caseBlockContainer(section);
				if (result == null) result = caseNumbered(section);
				if (result == null) result = caseReferenceTarget(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.SUBSECTION: {
				Subsection subsection = (Subsection)theEObject;
				T result = caseSubsection(subsection);
				if (result == null) result = caseDivision(subsection);
				if (result == null) result = caseDivisionContainer(subsection);
				if (result == null) result = caseBlockContainer(subsection);
				if (result == null) result = caseNumbered(subsection);
				if (result == null) result = caseReferenceTarget(subsection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.SUBSUBSECTION: {
				Subsubsection subsubsection = (Subsubsection)theEObject;
				T result = caseSubsubsection(subsubsection);
				if (result == null) result = caseDivision(subsubsection);
				if (result == null) result = caseDivisionContainer(subsubsection);
				if (result == null) result = caseBlockContainer(subsubsection);
				if (result == null) result = caseNumbered(subsubsection);
				if (result == null) result = caseReferenceTarget(subsubsection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.CONTENT_BLOCK: {
				ContentBlock contentBlock = (ContentBlock)theEObject;
				T result = caseContentBlock(contentBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.ADMONITION: {
				Admonition admonition = (Admonition)theEObject;
				T result = caseAdmonition(admonition);
				if (result == null) result = caseContentBlock(admonition);
				if (result == null) result = caseBlockContainer(admonition);
				if (result == null) result = caseReferenceTarget(admonition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.LIST2: {
				List2 list2 = (List2)theEObject;
				T result = caseList2(list2);
				if (result == null) result = caseContentBlock(list2);
				if (result == null) result = caseReferenceTarget(list2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.LIST_ITEM: {
				ListItem listItem = (ListItem)theEObject;
				T result = caseListItem(listItem);
				if (result == null) result = caseBlockContainer(listItem);
				if (result == null) result = caseNumbered(listItem);
				if (result == null) result = caseReferenceTarget(listItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.TITLED_BLOCK: {
				TitledBlock titledBlock = (TitledBlock)theEObject;
				T result = caseTitledBlock(titledBlock);
				if (result == null) result = caseContentBlock(titledBlock);
				if (result == null) result = caseNumberedByChapter(titledBlock);
				if (result == null) result = caseReferenceTarget(titledBlock);
				if (result == null) result = caseNumbered(titledBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.TITLED_TABLE: {
				TitledTable titledTable = (TitledTable)theEObject;
				T result = caseTitledTable(titledTable);
				if (result == null) result = caseTitledBlock(titledTable);
				if (result == null) result = caseContentBlock(titledTable);
				if (result == null) result = caseNumberedByChapter(titledTable);
				if (result == null) result = caseReferenceTarget(titledTable);
				if (result == null) result = caseNumbered(titledTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.ABSTRACT_TABLE: {
				AbstractTable abstractTable = (AbstractTable)theEObject;
				T result = caseAbstractTable(abstractTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseAbstractTable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.TABLE_CELL: {
				TableCell tableCell = (TableCell)theEObject;
				T result = caseTableCell(tableCell);
				if (result == null) result = caseBlockContainer(tableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PROVIDED_TABLE: {
				ProvidedTable providedTable = (ProvidedTable)theEObject;
				T result = caseProvidedTable(providedTable);
				if (result == null) result = caseAbstractTable(providedTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PROVIDED_TABLE_TYPE: {
				ProvidedTableType providedTableType = (ProvidedTableType)theEObject;
				T result = caseProvidedTableType(providedTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.TITLED_FIGURE: {
				TitledFigure titledFigure = (TitledFigure)theEObject;
				T result = caseTitledFigure(titledFigure);
				if (result == null) result = caseTitledBlock(titledFigure);
				if (result == null) result = caseContentBlock(titledFigure);
				if (result == null) result = caseNumberedByChapter(titledFigure);
				if (result == null) result = caseReferenceTarget(titledFigure);
				if (result == null) result = caseNumbered(titledFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.ABSTRACT_FIGURE: {
				AbstractFigure abstractFigure = (AbstractFigure)theEObject;
				T result = caseAbstractFigure(abstractFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.INCLUDED_FIGURE: {
				IncludedFigure includedFigure = (IncludedFigure)theEObject;
				T result = caseIncludedFigure(includedFigure);
				if (result == null) result = caseAbstractFigure(includedFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PROVIDED_FIGURE: {
				ProvidedFigure providedFigure = (ProvidedFigure)theEObject;
				T result = caseProvidedFigure(providedFigure);
				if (result == null) result = caseAbstractFigure(providedFigure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PROVIDED_DIAGRAM_TYPE: {
				ProvidedDiagramType providedDiagramType = (ProvidedDiagramType)theEObject;
				T result = caseProvidedDiagramType(providedDiagramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.EQUATION: {
				Equation equation = (Equation)theEObject;
				T result = caseEquation(equation);
				if (result == null) result = caseTitledBlock(equation);
				if (result == null) result = caseContentBlock(equation);
				if (result == null) result = caseNumberedByChapter(equation);
				if (result == null) result = caseReferenceTarget(equation);
				if (result == null) result = caseNumbered(equation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.TITLED_CODE_LISTING: {
				TitledCodeListing titledCodeListing = (TitledCodeListing)theEObject;
				T result = caseTitledCodeListing(titledCodeListing);
				if (result == null) result = caseTitledBlock(titledCodeListing);
				if (result == null) result = caseContentBlock(titledCodeListing);
				if (result == null) result = caseNumberedByChapter(titledCodeListing);
				if (result == null) result = caseReferenceTarget(titledCodeListing);
				if (result == null) result = caseNumbered(titledCodeListing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseContentBlock(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.RICH_TEXT_PARAGRAPH: {
				RichTextParagraph richTextParagraph = (RichTextParagraph)theEObject;
				T result = caseRichTextParagraph(richTextParagraph);
				if (result == null) result = caseParagraph(richTextParagraph);
				if (result == null) result = caseContentBlock(richTextParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.RICH_TEXT_REFERENCING_PARAGRAPH: {
				RichTextReferencingParagraph richTextReferencingParagraph = (RichTextReferencingParagraph)theEObject;
				T result = caseRichTextReferencingParagraph(richTextReferencingParagraph);
				if (result == null) result = caseContentBlock(richTextReferencingParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.UNFORMATTED_PARAGRAPH: {
				UnformattedParagraph unformattedParagraph = (UnformattedParagraph)theEObject;
				T result = caseUnformattedParagraph(unformattedParagraph);
				if (result == null) result = caseParagraph(unformattedParagraph);
				if (result == null) result = caseContentBlock(unformattedParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PubPackage.FOOTNOTE: {
				Footnote footnote = (Footnote)theEObject;
				T result = caseFootnote(footnote);
				if (result == null) result = caseContentBlock(footnote);
				if (result == null) result = caseReferenceTarget(footnote);
				if (result == null) result = caseNumberedByChapter(footnote);
				if (result == null) result = caseNumbered(footnote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubModel(PubModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublication(Publication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceTarget(ReferenceTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentSegment(DocumentSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockContainer(BlockContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment With Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment With Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentWithText(SegmentWithText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstract(Abstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreface(Preface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Epilogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Epilogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpilogue(Epilogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment With Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment With Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentWithTable(SegmentWithTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeHistory(ChangeHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeDescription(ChangeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOC(TOC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviations(Abbreviations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbreviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbreviation(Abbreviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Tables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Tables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfTables(ListOfTables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Figures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Figures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfFigures(ListOfFigures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliography(Bibliography object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bibliography Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bibliography Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBibliographyEntry(BibliographyEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossary(Glossary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossaryEntry(GlossaryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex(Index object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexEntry(IndexEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentInclude(SegmentInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationBody(PublicationBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numbered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numbered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumbered(Numbered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numbered By Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numbered By Chapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberedByChapter(NumberedByChapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivisionContainer(DivisionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appendix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appendix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppendix(Appendix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapter(Chapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsection(Subsection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsubsection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsubsection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsubsection(Subsubsection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentBlock(ContentBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admonition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admonition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmonition(Admonition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList2(List2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titled Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titled Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitledBlock(TitledBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titled Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titled Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitledTable(TitledTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTable(AbstractTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCell(TableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedTable(ProvidedTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedTableType(ProvidedTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titled Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titled Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitledFigure(TitledFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFigure(AbstractFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Included Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Included Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludedFigure(IncludedFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Figure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Figure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedFigure(ProvidedFigure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Diagram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Diagram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedDiagramType(ProvidedDiagramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquation(Equation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titled Code Listing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titled Code Listing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitledCodeListing(TitledCodeListing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichTextParagraph(RichTextParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text Referencing Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text Referencing Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichTextReferencingParagraph(RichTextReferencingParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unformatted Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unformatted Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnformattedParagraph(UnformattedParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footnote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footnote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFootnote(Footnote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNamedElement(DNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRich Text Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRich Text Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRichTextSegment(IRichTextSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDExpression(DExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PubSwitch
