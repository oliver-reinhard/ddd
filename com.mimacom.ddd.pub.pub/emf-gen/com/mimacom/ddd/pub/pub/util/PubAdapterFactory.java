/**
 */
package com.mimacom.ddd.pub.pub.util;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.IRichTextSegment;

import com.mimacom.ddd.pub.pub.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.pub.PubPackage
 * @generated
 */
public class PubAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PubPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PubPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubSwitch<Adapter> modelSwitch =
		new PubSwitch<Adapter>() {
			@Override
			public Adapter casePubModel(PubModel object) {
				return createPubModelAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseSymbol(Symbol object) {
				return createSymbolAdapter();
			}
			@Override
			public Adapter casePublication(Publication object) {
				return createPublicationAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseReferenceTarget(ReferenceTarget object) {
				return createReferenceTargetAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseDocumentSegment(DocumentSegment object) {
				return createDocumentSegmentAdapter();
			}
			@Override
			public Adapter caseBlockContainer(BlockContainer object) {
				return createBlockContainerAdapter();
			}
			@Override
			public Adapter caseSegmentWithText(SegmentWithText object) {
				return createSegmentWithTextAdapter();
			}
			@Override
			public Adapter caseAbstract(Abstract object) {
				return createAbstractAdapter();
			}
			@Override
			public Adapter casePreface(Preface object) {
				return createPrefaceAdapter();
			}
			@Override
			public Adapter caseEpilogue(Epilogue object) {
				return createEpilogueAdapter();
			}
			@Override
			public Adapter caseSegmentWithTable(SegmentWithTable object) {
				return createSegmentWithTableAdapter();
			}
			@Override
			public Adapter caseChangeHistory(ChangeHistory object) {
				return createChangeHistoryAdapter();
			}
			@Override
			public Adapter caseChangeDescription(ChangeDescription object) {
				return createChangeDescriptionAdapter();
			}
			@Override
			public Adapter caseTOC(TOC object) {
				return createTOCAdapter();
			}
			@Override
			public Adapter caseAbbreviations(Abbreviations object) {
				return createAbbreviationsAdapter();
			}
			@Override
			public Adapter caseAbbreviation(Abbreviation object) {
				return createAbbreviationAdapter();
			}
			@Override
			public Adapter caseListOfTables(ListOfTables object) {
				return createListOfTablesAdapter();
			}
			@Override
			public Adapter caseListOfFigures(ListOfFigures object) {
				return createListOfFiguresAdapter();
			}
			@Override
			public Adapter caseBibliography(Bibliography object) {
				return createBibliographyAdapter();
			}
			@Override
			public Adapter caseBibliographyEntry(BibliographyEntry object) {
				return createBibliographyEntryAdapter();
			}
			@Override
			public Adapter caseGlossary(Glossary object) {
				return createGlossaryAdapter();
			}
			@Override
			public Adapter caseGlossaryEntry(GlossaryEntry object) {
				return createGlossaryEntryAdapter();
			}
			@Override
			public Adapter caseIndex(Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseIndexEntry(IndexEntry object) {
				return createIndexEntryAdapter();
			}
			@Override
			public Adapter caseSegmentInclude(SegmentInclude object) {
				return createSegmentIncludeAdapter();
			}
			@Override
			public Adapter casePublicationBody(PublicationBody object) {
				return createPublicationBodyAdapter();
			}
			@Override
			public Adapter caseNumbered(Numbered object) {
				return createNumberedAdapter();
			}
			@Override
			public Adapter caseNumberedByChapter(NumberedByChapter object) {
				return createNumberedByChapterAdapter();
			}
			@Override
			public Adapter caseDivisionContainer(DivisionContainer object) {
				return createDivisionContainerAdapter();
			}
			@Override
			public Adapter caseDivision(Division object) {
				return createDivisionAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseAppendix(Appendix object) {
				return createAppendixAdapter();
			}
			@Override
			public Adapter caseChapter(Chapter object) {
				return createChapterAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseSubsection(Subsection object) {
				return createSubsectionAdapter();
			}
			@Override
			public Adapter caseSubsubsection(Subsubsection object) {
				return createSubsubsectionAdapter();
			}
			@Override
			public Adapter caseContentBlock(ContentBlock object) {
				return createContentBlockAdapter();
			}
			@Override
			public Adapter caseAdmonition(Admonition object) {
				return createAdmonitionAdapter();
			}
			@Override
			public Adapter caseList2(List2 object) {
				return createList2Adapter();
			}
			@Override
			public Adapter caseListItem(ListItem object) {
				return createListItemAdapter();
			}
			@Override
			public Adapter caseTitledBlock(TitledBlock object) {
				return createTitledBlockAdapter();
			}
			@Override
			public Adapter caseTitledTable(TitledTable object) {
				return createTitledTableAdapter();
			}
			@Override
			public Adapter caseAbstractTable(AbstractTable object) {
				return createAbstractTableAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseTableCell(TableCell object) {
				return createTableCellAdapter();
			}
			@Override
			public Adapter caseProvidedTable(ProvidedTable object) {
				return createProvidedTableAdapter();
			}
			@Override
			public Adapter caseProvidedTableType(ProvidedTableType object) {
				return createProvidedTableTypeAdapter();
			}
			@Override
			public Adapter caseTitledFigure(TitledFigure object) {
				return createTitledFigureAdapter();
			}
			@Override
			public Adapter caseAbstractFigure(AbstractFigure object) {
				return createAbstractFigureAdapter();
			}
			@Override
			public Adapter caseIncludedFigure(IncludedFigure object) {
				return createIncludedFigureAdapter();
			}
			@Override
			public Adapter caseProvidedFigure(ProvidedFigure object) {
				return createProvidedFigureAdapter();
			}
			@Override
			public Adapter caseProvidedDiagramType(ProvidedDiagramType object) {
				return createProvidedDiagramTypeAdapter();
			}
			@Override
			public Adapter caseEquation(Equation object) {
				return createEquationAdapter();
			}
			@Override
			public Adapter caseTitledCodeListing(TitledCodeListing object) {
				return createTitledCodeListingAdapter();
			}
			@Override
			public Adapter caseParagraph(Paragraph object) {
				return createParagraphAdapter();
			}
			@Override
			public Adapter caseRichTextParagraph(RichTextParagraph object) {
				return createRichTextParagraphAdapter();
			}
			@Override
			public Adapter caseRichTextReferencingParagraph(RichTextReferencingParagraph object) {
				return createRichTextReferencingParagraphAdapter();
			}
			@Override
			public Adapter caseUnformattedParagraph(UnformattedParagraph object) {
				return createUnformattedParagraphAdapter();
			}
			@Override
			public Adapter caseFootnote(Footnote object) {
				return createFootnoteAdapter();
			}
			@Override
			public Adapter caseDNamedElement(DNamedElement object) {
				return createDNamedElementAdapter();
			}
			@Override
			public Adapter caseIRichTextSegment(IRichTextSegment object) {
				return createIRichTextSegmentAdapter();
			}
			@Override
			public Adapter caseDExpression(DExpression object) {
				return createDExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.PubModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.PubModel
	 * @generated
	 */
	public Adapter createPubModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Publication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Publication
	 * @generated
	 */
	public Adapter createPublicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ReferenceTarget <em>Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ReferenceTarget
	 * @generated
	 */
	public Adapter createReferenceTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.DocumentSegment <em>Document Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.DocumentSegment
	 * @generated
	 */
	public Adapter createDocumentSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.BlockContainer <em>Block Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.BlockContainer
	 * @generated
	 */
	public Adapter createBlockContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.SegmentWithText <em>Segment With Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.SegmentWithText
	 * @generated
	 */
	public Adapter createSegmentWithTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Abstract
	 * @generated
	 */
	public Adapter createAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Preface <em>Preface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Preface
	 * @generated
	 */
	public Adapter createPrefaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Epilogue <em>Epilogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Epilogue
	 * @generated
	 */
	public Adapter createEpilogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.SegmentWithTable <em>Segment With Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.SegmentWithTable
	 * @generated
	 */
	public Adapter createSegmentWithTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ChangeHistory <em>Change History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ChangeHistory
	 * @generated
	 */
	public Adapter createChangeHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ChangeDescription <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ChangeDescription
	 * @generated
	 */
	public Adapter createChangeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.TOC <em>TOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.TOC
	 * @generated
	 */
	public Adapter createTOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Abbreviations <em>Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Abbreviations
	 * @generated
	 */
	public Adapter createAbbreviationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Abbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Abbreviation
	 * @generated
	 */
	public Adapter createAbbreviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ListOfTables <em>List Of Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ListOfTables
	 * @generated
	 */
	public Adapter createListOfTablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ListOfFigures <em>List Of Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ListOfFigures
	 * @generated
	 */
	public Adapter createListOfFiguresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Bibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Bibliography
	 * @generated
	 */
	public Adapter createBibliographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.BibliographyEntry <em>Bibliography Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.BibliographyEntry
	 * @generated
	 */
	public Adapter createBibliographyEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Glossary
	 * @generated
	 */
	public Adapter createGlossaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.GlossaryEntry <em>Glossary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.GlossaryEntry
	 * @generated
	 */
	public Adapter createGlossaryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.IndexEntry <em>Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.IndexEntry
	 * @generated
	 */
	public Adapter createIndexEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.SegmentInclude <em>Segment Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.SegmentInclude
	 * @generated
	 */
	public Adapter createSegmentIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.PublicationBody <em>Publication Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.PublicationBody
	 * @generated
	 */
	public Adapter createPublicationBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Numbered <em>Numbered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Numbered
	 * @generated
	 */
	public Adapter createNumberedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.NumberedByChapter <em>Numbered By Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.NumberedByChapter
	 * @generated
	 */
	public Adapter createNumberedByChapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.DivisionContainer <em>Division Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.DivisionContainer
	 * @generated
	 */
	public Adapter createDivisionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Division
	 * @generated
	 */
	public Adapter createDivisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Appendix <em>Appendix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Appendix
	 * @generated
	 */
	public Adapter createAppendixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Chapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Chapter
	 * @generated
	 */
	public Adapter createChapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Subsection <em>Subsection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Subsection
	 * @generated
	 */
	public Adapter createSubsectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Subsubsection <em>Subsubsection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Subsubsection
	 * @generated
	 */
	public Adapter createSubsubsectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ContentBlock <em>Content Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ContentBlock
	 * @generated
	 */
	public Adapter createContentBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Admonition <em>Admonition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Admonition
	 * @generated
	 */
	public Adapter createAdmonitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.List2 <em>List2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.List2
	 * @generated
	 */
	public Adapter createList2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ListItem
	 * @generated
	 */
	public Adapter createListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.TitledBlock <em>Titled Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.TitledBlock
	 * @generated
	 */
	public Adapter createTitledBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.TitledTable <em>Titled Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.TitledTable
	 * @generated
	 */
	public Adapter createTitledTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.AbstractTable <em>Abstract Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.AbstractTable
	 * @generated
	 */
	public Adapter createAbstractTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.TableCell
	 * @generated
	 */
	public Adapter createTableCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ProvidedTable <em>Provided Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ProvidedTable
	 * @generated
	 */
	public Adapter createProvidedTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ProvidedTableType <em>Provided Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ProvidedTableType
	 * @generated
	 */
	public Adapter createProvidedTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.TitledFigure <em>Titled Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.TitledFigure
	 * @generated
	 */
	public Adapter createTitledFigureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.AbstractFigure <em>Abstract Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.AbstractFigure
	 * @generated
	 */
	public Adapter createAbstractFigureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.IncludedFigure <em>Included Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.IncludedFigure
	 * @generated
	 */
	public Adapter createIncludedFigureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ProvidedFigure <em>Provided Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ProvidedFigure
	 * @generated
	 */
	public Adapter createProvidedFigureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.ProvidedDiagramType <em>Provided Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.ProvidedDiagramType
	 * @generated
	 */
	public Adapter createProvidedDiagramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Equation
	 * @generated
	 */
	public Adapter createEquationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.TitledCodeListing <em>Titled Code Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.TitledCodeListing
	 * @generated
	 */
	public Adapter createTitledCodeListingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Paragraph
	 * @generated
	 */
	public Adapter createParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.RichTextParagraph <em>Rich Text Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.RichTextParagraph
	 * @generated
	 */
	public Adapter createRichTextParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.RichTextReferencingParagraph <em>Rich Text Referencing Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.RichTextReferencingParagraph
	 * @generated
	 */
	public Adapter createRichTextReferencingParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.UnformattedParagraph <em>Unformatted Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.UnformattedParagraph
	 * @generated
	 */
	public Adapter createUnformattedParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.pub.pub.Footnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.pub.pub.Footnote
	 * @generated
	 */
	public Adapter createFootnoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DNamedElement <em>DNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DNamedElement
	 * @generated
	 */
	public Adapter createDNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.IRichTextSegment <em>IRich Text Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.IRichTextSegment
	 * @generated
	 */
	public Adapter createIRichTextSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DExpression <em>DExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DExpression
	 * @generated
	 */
	public Adapter createDExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PubAdapterFactory
