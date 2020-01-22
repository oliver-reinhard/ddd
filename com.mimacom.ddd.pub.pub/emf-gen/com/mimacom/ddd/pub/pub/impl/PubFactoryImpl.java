/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.pub.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PubFactoryImpl extends EFactoryImpl implements PubFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PubFactory init() {
		try {
			PubFactory thePubFactory = (PubFactory)EPackage.Registry.INSTANCE.getEFactory(PubPackage.eNS_URI);
			if (thePubFactory != null) {
				return thePubFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PubFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PubPackage.PUB_MODEL: return createPubModel();
			case PubPackage.PUBLICATION: return createPublication();
			case PubPackage.COMPONENT: return createComponent();
<<<<<<< HEAD
			case PubPackage.REFERENCE: return createReference();
			case PubPackage.SEGMENT_WITH_TEXT: return createSegmentWithText();
			case PubPackage.ABSTRACT: return createAbstract();
			case PubPackage.PREFACE: return createPreface();
			case PubPackage.EPILOGUE: return createEpilogue();
			case PubPackage.SEGMENT_WITH_TABLE: return createSegmentWithTable();
			case PubPackage.CHANGE_HISTORY: return createChangeHistory();
			case PubPackage.CHANGE_DESCRIPTION: return createChangeDescription();
			case PubPackage.TOC: return createTOC();
			case PubPackage.ABBREVIATIONS: return createAbbreviations();
			case PubPackage.ABBREVIATION: return createAbbreviation();
			case PubPackage.LIST_OF_TABLES: return createListOfTables();
			case PubPackage.LIST_OF_FIGURES: return createListOfFigures();
			case PubPackage.BIBLIOGRAPHY: return createBibliography();
			case PubPackage.BIBLIOGRAPHY_ENTRY: return createBibliographyEntry();
			case PubPackage.GLOSSARY: return createGlossary();
			case PubPackage.GLOSSARY_ENTRY: return createGlossaryEntry();
			case PubPackage.INDEX: return createIndex();
			case PubPackage.INDEX_ENTRY: return createIndexEntry();
			case PubPackage.SEGMENT_INCLUDE: return createSegmentInclude();
			case PubPackage.PUBLICATION_BODY: return createPublicationBody();
			case PubPackage.PART: return createPart();
			case PubPackage.APPENDIX: return createAppendix();
			case PubPackage.CHAPTER: return createChapter();
			case PubPackage.SECTION: return createSection();
			case PubPackage.SUBSECTION: return createSubsection();
			case PubPackage.SUBSUBSECTION: return createSubsubsection();
			case PubPackage.ADMONITION: return createAdmonition();
			case PubPackage.LIST: return createList();
			case PubPackage.LIST_ITEM: return createListItem();
			case PubPackage.TABLE: return createTable();
			case PubPackage.TABLE_ROW: return createTableRow();
			case PubPackage.TABLE_CELL: return createTableCell();
			case PubPackage.FIGURE: return createFigure();
			case PubPackage.EQUATION: return createEquation();
			case PubPackage.CODE_LISTING: return createCodeListing();
			case PubPackage.PARAGRAPH: return createParagraph();
			case PubPackage.UNFORMATTED_PARAGRAPH: return createUnformattedParagraph();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PubPackage.PUBLICATION_NATURE:
				return createPublicationNatureFromString(eDataType, initialValue);
			case PubPackage.REFERENCE_SCOPE:
				return createReferenceScopeFromString(eDataType, initialValue);
			case PubPackage.ADMONITION_KIND:
				return createAdmonitionKindFromString(eDataType, initialValue);
			case PubPackage.LIST_STYLE:
				return createListStyleFromString(eDataType, initialValue);
			case PubPackage.CODE_LANGUAGE:
				return createCodeLanguageFromString(eDataType, initialValue);
			case PubPackage.PARAGRAPH_STYLE:
				return createParagraphStyleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PubPackage.PUBLICATION_NATURE:
				return convertPublicationNatureToString(eDataType, instanceValue);
			case PubPackage.REFERENCE_SCOPE:
				return convertReferenceScopeToString(eDataType, instanceValue);
			case PubPackage.ADMONITION_KIND:
				return convertAdmonitionKindToString(eDataType, instanceValue);
			case PubPackage.LIST_STYLE:
				return convertListStyleToString(eDataType, instanceValue);
			case PubPackage.CODE_LANGUAGE:
				return convertCodeLanguageToString(eDataType, instanceValue);
			case PubPackage.PARAGRAPH_STYLE:
				return convertParagraphStyleToString(eDataType, instanceValue);
=======
			case PubPackage.SEGMENT_WITH_TEXT: return createSegmentWithText();
			case PubPackage.ABSTRACT: return createAbstract();
			case PubPackage.PREFACE: return createPreface();
			case PubPackage.EPILOGUE: return createEpilogue();
			case PubPackage.PUBLICATION_BODY: return createPublicationBody();
			case PubPackage.SEGMENT_WITH_TABLE: return createSegmentWithTable();
			case PubPackage.CHANGE_HISTORY: return createChangeHistory();
			case PubPackage.CHANGE_DESCRIPTION: return createChangeDescription();
			case PubPackage.TOC: return createTOC();
			case PubPackage.ABBREVIATIONS: return createAbbreviations();
			case PubPackage.ABBREVIATION: return createAbbreviation();
			case PubPackage.LIST_OF_TABLES: return createListOfTables();
			case PubPackage.LIST_OF_FIGURES: return createListOfFigures();
			case PubPackage.BIBLIOGRAPHY: return createBibliography();
			case PubPackage.BIBLIOGRAPHY_ENTRY: return createBibliographyEntry();
			case PubPackage.GLOSSARY: return createGlossary();
			case PubPackage.GLOSSARY_ENTRY: return createGlossaryEntry();
			case PubPackage.INDEX: return createIndex();
			case PubPackage.INDEX_ENTRY: return createIndexEntry();
			case PubPackage.SEGMENT_INCLUDE: return createSegmentInclude();
			case PubPackage.PART: return createPart();
			case PubPackage.APPENDIX: return createAppendix();
			case PubPackage.CHAPTER: return createChapter();
			case PubPackage.SECTION: return createSection();
			case PubPackage.SUBSECTION: return createSubsection();
			case PubPackage.SUBSUBSECTION: return createSubsubsection();
			case PubPackage.ADMONITION: return createAdmonition();
			case PubPackage.LIST: return createList();
			case PubPackage.LIST_ITEM: return createListItem();
			case PubPackage.TABLE: return createTable();
			case PubPackage.TABLE_ROW: return createTableRow();
			case PubPackage.TABLE_CELL: return createTableCell();
			case PubPackage.FIGURE: return createFigure();
			case PubPackage.EQUATION: return createEquation();
			case PubPackage.CODE_LISTING: return createCodeListing();
			case PubPackage.PARAGRAPH: return createParagraph();
			case PubPackage.UNFORMATTED_PARAGRAPH: return createUnformattedParagraph();
			case PubPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PubPackage.PUBLICATION_NATURE:
				return createPublicationNatureFromString(eDataType, initialValue);
			case PubPackage.ADMONITION_KIND:
				return createAdmonitionKindFromString(eDataType, initialValue);
			case PubPackage.LIST_STYLE:
				return createListStyleFromString(eDataType, initialValue);
			case PubPackage.CODE_LANGUAGE:
				return createCodeLanguageFromString(eDataType, initialValue);
			case PubPackage.PARAGRAPH_STYLE:
				return createParagraphStyleFromString(eDataType, initialValue);
			case PubPackage.REFERENCE_SCOPE:
				return createReferenceScopeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PubPackage.PUBLICATION_NATURE:
				return convertPublicationNatureToString(eDataType, instanceValue);
			case PubPackage.ADMONITION_KIND:
				return convertAdmonitionKindToString(eDataType, instanceValue);
			case PubPackage.LIST_STYLE:
				return convertListStyleToString(eDataType, instanceValue);
			case PubPackage.CODE_LANGUAGE:
				return convertCodeLanguageToString(eDataType, instanceValue);
			case PubPackage.PARAGRAPH_STYLE:
				return convertParagraphStyleToString(eDataType, instanceValue);
			case PubPackage.REFERENCE_SCOPE:
				return convertReferenceScopeToString(eDataType, instanceValue);
>>>>>>> refs/remotes/origin/master
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubModel createPubModel() {
		PubModelImpl pubModel = new PubModelImpl();
		return pubModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publication createPublication() {
		PublicationImpl publication = new PublicationImpl();
		return publication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentWithText createSegmentWithText() {
		SegmentWithTextImpl segmentWithText = new SegmentWithTextImpl();
		return segmentWithText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstract createAbstract() {
		AbstractImpl abstract_ = new AbstractImpl();
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Preface createPreface() {
		PrefaceImpl preface = new PrefaceImpl();
		return preface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Epilogue createEpilogue() {
		EpilogueImpl epilogue = new EpilogueImpl();
		return epilogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationBody createPublicationBody() {
		PublicationBodyImpl publicationBody = new PublicationBodyImpl();
		return publicationBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentWithTable createSegmentWithTable() {
		SegmentWithTableImpl segmentWithTable = new SegmentWithTableImpl();
		return segmentWithTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeHistory createChangeHistory() {
		ChangeHistoryImpl changeHistory = new ChangeHistoryImpl();
		return changeHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeDescription createChangeDescription() {
		ChangeDescriptionImpl changeDescription = new ChangeDescriptionImpl();
		return changeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOC createTOC() {
		TOCImpl toc = new TOCImpl();
		return toc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abbreviations createAbbreviations() {
		AbbreviationsImpl abbreviations = new AbbreviationsImpl();
		return abbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abbreviation createAbbreviation() {
		AbbreviationImpl abbreviation = new AbbreviationImpl();
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOfTables createListOfTables() {
		ListOfTablesImpl listOfTables = new ListOfTablesImpl();
		return listOfTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOfFigures createListOfFigures() {
		ListOfFiguresImpl listOfFigures = new ListOfFiguresImpl();
		return listOfFigures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bibliography createBibliography() {
		BibliographyImpl bibliography = new BibliographyImpl();
		return bibliography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliographyEntry createBibliographyEntry() {
		BibliographyEntryImpl bibliographyEntry = new BibliographyEntryImpl();
		return bibliographyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glossary createGlossary() {
		GlossaryImpl glossary = new GlossaryImpl();
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryEntry createGlossaryEntry() {
		GlossaryEntryImpl glossaryEntry = new GlossaryEntryImpl();
		return glossaryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexEntry createIndexEntry() {
		IndexEntryImpl indexEntry = new IndexEntryImpl();
		return indexEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentInclude createSegmentInclude() {
		SegmentIncludeImpl segmentInclude = new SegmentIncludeImpl();
		return segmentInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appendix createAppendix() {
		AppendixImpl appendix = new AppendixImpl();
		return appendix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Chapter createChapter() {
		ChapterImpl chapter = new ChapterImpl();
		return chapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subsection createSubsection() {
		SubsectionImpl subsection = new SubsectionImpl();
		return subsection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subsubsection createSubsubsection() {
		SubsubsectionImpl subsubsection = new SubsubsectionImpl();
		return subsubsection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Admonition createAdmonition() {
		AdmonitionImpl admonition = new AdmonitionImpl();
		return admonition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Figure createFigure() {
		FigureImpl figure = new FigureImpl();
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equation createEquation() {
		EquationImpl equation = new EquationImpl();
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListing createCodeListing() {
		CodeListingImpl codeListing = new CodeListingImpl();
		return codeListing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnformattedParagraph createUnformattedParagraph() {
		UnformattedParagraphImpl unformattedParagraph = new UnformattedParagraphImpl();
		return unformattedParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationNature createPublicationNatureFromString(EDataType eDataType, String initialValue) {
		PublicationNature result = PublicationNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicationNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdmonitionKind createAdmonitionKindFromString(EDataType eDataType, String initialValue) {
		AdmonitionKind result = AdmonitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdmonitionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyle createListStyleFromString(EDataType eDataType, String initialValue) {
		ListStyle result = ListStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLanguage createCodeLanguageFromString(EDataType eDataType, String initialValue) {
		CodeLanguage result = CodeLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphStyle createParagraphStyleFromString(EDataType eDataType, String initialValue) {
		ParagraphStyle result = ParagraphStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParagraphStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceScope createReferenceScopeFromString(EDataType eDataType, String initialValue) {
		ReferenceScope result = ReferenceScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubPackage getPubPackage() {
		return (PubPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PubPackage getPackage() {
		return PubPackage.eINSTANCE;
	}

} //PubFactoryImpl
