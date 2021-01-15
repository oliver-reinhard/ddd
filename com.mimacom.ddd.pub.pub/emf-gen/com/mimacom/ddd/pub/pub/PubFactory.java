/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.pub.PubPackage
 * @generated
 */
public interface PubFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PubFactory eINSTANCE = com.mimacom.ddd.pub.pub.impl.PubFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	PubModel createPubModel();

	/**
	 * Returns a new object of class '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol</em>'.
	 * @generated
	 */
	Symbol createSymbol();

	/**
	 * Returns a new object of class '<em>Publication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publication</em>'.
	 * @generated
	 */
	Publication createPublication();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Segment With Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment With Text</em>'.
	 * @generated
	 */
	SegmentWithText createSegmentWithText();

	/**
	 * Returns a new object of class '<em>Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract</em>'.
	 * @generated
	 */
	Abstract createAbstract();

	/**
	 * Returns a new object of class '<em>Preface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Preface</em>'.
	 * @generated
	 */
	Preface createPreface();

	/**
	 * Returns a new object of class '<em>Epilogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Epilogue</em>'.
	 * @generated
	 */
	Epilogue createEpilogue();

	/**
	 * Returns a new object of class '<em>Segment With Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment With Table</em>'.
	 * @generated
	 */
	SegmentWithTable createSegmentWithTable();

	/**
	 * Returns a new object of class '<em>Change History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change History</em>'.
	 * @generated
	 */
	ChangeHistory createChangeHistory();

	/**
	 * Returns a new object of class '<em>Change Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Description</em>'.
	 * @generated
	 */
	ChangeDescription createChangeDescription();

	/**
	 * Returns a new object of class '<em>TOC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOC</em>'.
	 * @generated
	 */
	TOC createTOC();

	/**
	 * Returns a new object of class '<em>Abbreviations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abbreviations</em>'.
	 * @generated
	 */
	Abbreviations createAbbreviations();

	/**
	 * Returns a new object of class '<em>Abbreviation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abbreviation</em>'.
	 * @generated
	 */
	Abbreviation createAbbreviation();

	/**
	 * Returns a new object of class '<em>List Of Tables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Tables</em>'.
	 * @generated
	 */
	ListOfTables createListOfTables();

	/**
	 * Returns a new object of class '<em>List Of Figures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Figures</em>'.
	 * @generated
	 */
	ListOfFigures createListOfFigures();

	/**
	 * Returns a new object of class '<em>Bibliography</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bibliography</em>'.
	 * @generated
	 */
	Bibliography createBibliography();

	/**
	 * Returns a new object of class '<em>Bibliography Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bibliography Entry</em>'.
	 * @generated
	 */
	BibliographyEntry createBibliographyEntry();

	/**
	 * Returns a new object of class '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossary</em>'.
	 * @generated
	 */
	Glossary createGlossary();

	/**
	 * Returns a new object of class '<em>Glossary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossary Entry</em>'.
	 * @generated
	 */
	GlossaryEntry createGlossaryEntry();

	/**
	 * Returns a new object of class '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index</em>'.
	 * @generated
	 */
	Index createIndex();

	/**
	 * Returns a new object of class '<em>Index Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Entry</em>'.
	 * @generated
	 */
	IndexEntry createIndexEntry();

	/**
	 * Returns a new object of class '<em>Segment Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment Include</em>'.
	 * @generated
	 */
	SegmentInclude createSegmentInclude();

	/**
	 * Returns a new object of class '<em>Publication Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publication Body</em>'.
	 * @generated
	 */
	PublicationBody createPublicationBody();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	Part createPart();

	/**
	 * Returns a new object of class '<em>Appendix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appendix</em>'.
	 * @generated
	 */
	Appendix createAppendix();

	/**
	 * Returns a new object of class '<em>Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chapter</em>'.
	 * @generated
	 */
	Chapter createChapter();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Subsection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsection</em>'.
	 * @generated
	 */
	Subsection createSubsection();

	/**
	 * Returns a new object of class '<em>Subsubsection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsubsection</em>'.
	 * @generated
	 */
	Subsubsection createSubsubsection();

	/**
	 * Returns a new object of class '<em>Admonition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admonition</em>'.
	 * @generated
	 */
	Admonition createAdmonition();

	/**
	 * Returns a new object of class '<em>List2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List2</em>'.
	 * @generated
	 */
	List2 createList2();

	/**
	 * Returns a new object of class '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Item</em>'.
	 * @generated
	 */
	ListItem createListItem();

	/**
	 * Returns a new object of class '<em>Titled Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titled Table</em>'.
	 * @generated
	 */
	TitledTable createTitledTable();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Row</em>'.
	 * @generated
	 */
	TableRow createTableRow();

	/**
	 * Returns a new object of class '<em>Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Cell</em>'.
	 * @generated
	 */
	TableCell createTableCell();

	/**
	 * Returns a new object of class '<em>Provided Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Table</em>'.
	 * @generated
	 */
	ProvidedTable createProvidedTable();

	/**
	 * Returns a new object of class '<em>Provided Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Table Type</em>'.
	 * @generated
	 */
	ProvidedTableType createProvidedTableType();

	/**
	 * Returns a new object of class '<em>Titled Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titled Figure</em>'.
	 * @generated
	 */
	TitledFigure createTitledFigure();

	/**
	 * Returns a new object of class '<em>Included Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Included Figure</em>'.
	 * @generated
	 */
	IncludedFigure createIncludedFigure();

	/**
	 * Returns a new object of class '<em>Provided Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Figure</em>'.
	 * @generated
	 */
	ProvidedFigure createProvidedFigure();

	/**
	 * Returns a new object of class '<em>Provided Diagram Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Diagram Type</em>'.
	 * @generated
	 */
	ProvidedDiagramType createProvidedDiagramType();

	/**
	 * Returns a new object of class '<em>Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equation</em>'.
	 * @generated
	 */
	Equation createEquation();

	/**
	 * Returns a new object of class '<em>Titled Code Listing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titled Code Listing</em>'.
	 * @generated
	 */
	TitledCodeListing createTitledCodeListing();

	/**
	 * Returns a new object of class '<em>Rich Text Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich Text Paragraph</em>'.
	 * @generated
	 */
	RichTextParagraph createRichTextParagraph();

	/**
	 * Returns a new object of class '<em>Rich Text Referencing Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich Text Referencing Paragraph</em>'.
	 * @generated
	 */
	RichTextReferencingParagraph createRichTextReferencingParagraph();

	/**
	 * Returns a new object of class '<em>Unformatted Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unformatted Paragraph</em>'.
	 * @generated
	 */
	UnformattedParagraph createUnformattedParagraph();

	/**
	 * Returns a new object of class '<em>Footnote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Footnote</em>'.
	 * @generated
	 */
	Footnote createFootnote();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PubPackage getPubPackage();

} //PubFactory
