/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.pub.proto.ProtoPackage;

import com.mimacom.ddd.pub.pub.Abbreviation;
import com.mimacom.ddd.pub.pub.Abbreviations;
import com.mimacom.ddd.pub.pub.Abstract;
import com.mimacom.ddd.pub.pub.AbstractFigure;
import com.mimacom.ddd.pub.pub.AbstractTable;
import com.mimacom.ddd.pub.pub.Admonition;
import com.mimacom.ddd.pub.pub.AdmonitionKind;
import com.mimacom.ddd.pub.pub.Appendix;
import com.mimacom.ddd.pub.pub.Bibliography;
import com.mimacom.ddd.pub.pub.BibliographyEntry;
import com.mimacom.ddd.pub.pub.BlockContainer;
import com.mimacom.ddd.pub.pub.ChangeDescription;
import com.mimacom.ddd.pub.pub.ChangeHistory;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.CodeLanguage;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.ContentBlock;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.DivisionContainer;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.Epilogue;
import com.mimacom.ddd.pub.pub.Equation;
import com.mimacom.ddd.pub.pub.FigureRenderer;
import com.mimacom.ddd.pub.pub.Glossary;
import com.mimacom.ddd.pub.pub.GlossaryEntry;
import com.mimacom.ddd.pub.pub.IncludedFigure;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.IndexEntry;
import com.mimacom.ddd.pub.pub.List;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.ListOfFigures;
import com.mimacom.ddd.pub.pub.ListOfTables;
import com.mimacom.ddd.pub.pub.ListStyle;
import com.mimacom.ddd.pub.pub.NumberedElement;
import com.mimacom.ddd.pub.pub.Paragraph;
import com.mimacom.ddd.pub.pub.ParagraphStyle;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.Preface;
import com.mimacom.ddd.pub.pub.ProvidedFigure;
import com.mimacom.ddd.pub.pub.ProvidedTable;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.Publication;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.PublicationNature;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.ReferenceScope;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import com.mimacom.ddd.pub.pub.RichTextParagraph;
import com.mimacom.ddd.pub.pub.RichTextReferencingParagraph;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.SegmentInclude;
import com.mimacom.ddd.pub.pub.SegmentWithTable;
import com.mimacom.ddd.pub.pub.SegmentWithText;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRenderer;
import com.mimacom.ddd.pub.pub.TableRow;
import com.mimacom.ddd.pub.pub.TitledBlock;
import com.mimacom.ddd.pub.pub.TitledCodeListing;
import com.mimacom.ddd.pub.pub.TitledFigure;
import com.mimacom.ddd.pub.pub.TitledTable;
import com.mimacom.ddd.pub.pub.UnformattedParagraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PubPackageImpl extends EPackageImpl implements PubPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pubModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentWithTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epilogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentWithTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbreviationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbreviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfTablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfFiguresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliographyEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsubsectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass admonitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titledBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titledTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRendererEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titledFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedFigureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureRendererEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titledCodeListingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextParagraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextReferencingParagraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unformattedParagraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum publicationNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum admonitionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paragraphStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.mimacom.ddd.pub.pub.PubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PubPackageImpl() {
		super(eNS_URI, PubFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PubPackage init() {
		if (isInited) return (PubPackage)EPackage.Registry.INSTANCE.getEPackage(PubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PubPackageImpl thePubPackage = registeredPubPackage instanceof PubPackageImpl ? (PubPackageImpl)registeredPubPackage : new PubPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ProtoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePubPackage.createPackageContents();

		// Initialize created meta-data
		thePubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PubPackage.eNS_URI, thePubPackage);
		return thePubPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPubModel() {
		return pubModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubModel_Imports() {
		return (EReference)pubModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubModel_Document() {
		return (EReference)pubModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubModel_FigureRenderers() {
		return (EReference)pubModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPubModel_TableRenderers() {
		return (EReference)pubModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_Title() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_PublicationClass() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublication() {
		return publicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPublication_Includes() {
		return (EReference)publicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Segments() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceTarget() {
		return referenceTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceTarget_Name() {
		return (EAttribute)referenceTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceTarget_Id() {
		return (EAttribute)referenceTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Scope() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Target() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentSegment() {
		return documentSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentSegment_Parent() {
		return (EReference)documentSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDocumentSegment__GetName() {
		return documentSegmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDocumentSegment__SetName__String() {
		return documentSegmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockContainer() {
		return blockContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockContainer_Contents() {
		return (EReference)blockContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSegmentWithText() {
		return segmentWithTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstract() {
		return abstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreface() {
		return prefaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEpilogue() {
		return epilogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSegmentWithTable() {
		return segmentWithTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeHistory() {
		return changeHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChangeHistory_Entries() {
		return (EReference)changeHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChangeDescription() {
		return changeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeDescription_Version() {
		return (EAttribute)changeDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeDescription_Date() {
		return (EAttribute)changeDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeDescription_Author() {
		return (EAttribute)changeDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChangeDescription_Description() {
		return (EAttribute)changeDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOC() {
		return tocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbbreviations() {
		return abbreviationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbbreviations_Entries() {
		return (EReference)abbreviationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbbreviation() {
		return abbreviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbreviation_Name() {
		return (EAttribute)abbreviationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbbreviation_LongForm() {
		return (EAttribute)abbreviationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListOfTables() {
		return listOfTablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListOfFigures() {
		return listOfFiguresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBibliography() {
		return bibliographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBibliography_Entries() {
		return (EReference)bibliographyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBibliographyEntry() {
		return bibliographyEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBibliographyEntry_Name() {
		return (EAttribute)bibliographyEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBibliographyEntry_Authors() {
		return (EAttribute)bibliographyEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBibliographyEntry_Title() {
		return (EAttribute)bibliographyEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBibliographyEntry_Publisher() {
		return (EAttribute)bibliographyEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBibliographyEntry_Date() {
		return (EAttribute)bibliographyEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBibliographyEntry_Comment() {
		return (EAttribute)bibliographyEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlossary() {
		return glossaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlossary_Entries() {
		return (EReference)glossaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlossaryEntry() {
		return glossaryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlossaryEntry_Name() {
		return (EAttribute)glossaryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlossaryEntry_Text() {
		return (EAttribute)glossaryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlossaryEntry_Comment() {
		return (EAttribute)glossaryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndex_Entries() {
		return (EReference)indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndexEntry() {
		return indexEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndexEntry_Text() {
		return (EAttribute)indexEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndexEntry_References() {
		return (EReference)indexEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSegmentInclude() {
		return segmentIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSegmentInclude_Include() {
		return (EReference)segmentIncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicationBody() {
		return publicationBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberedElement() {
		return numberedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberedElement_Level() {
		return (EAttribute)numberedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberedElement_SequenceNumber() {
		return (EAttribute)numberedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivisionContainer() {
		return divisionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivisionContainer_Divisions() {
		return (EReference)divisionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDivision() {
		return divisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDivision_StartNumberingAt() {
		return (EAttribute)divisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivision_Title() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivision_Include() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDivision_LogicalContainer() {
		return (EReference)divisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDivision__GetId() {
		return divisionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDivision__Parent() {
		return divisionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDivision__GetDocument() {
		return divisionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppendix() {
		return appendixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChapter() {
		return chapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubsection() {
		return subsectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubsubsection() {
		return subsubsectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentBlock() {
		return contentBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmonition() {
		return admonitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdmonition_Kind() {
		return (EAttribute)admonitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdmonition_Title() {
		return (EReference)admonitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_Style() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_NumberingStyle() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getList_Level() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getList_Items() {
		return (EReference)listEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListItem_Title() {
		return (EReference)listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListItem_List() {
		return (EReference)listItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getListItem__GetLevel() {
		return listItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getListItem__GetSequenceNumber() {
		return listItemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitledBlock() {
		return titledBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitledBlock_Title() {
		return (EReference)titledBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitledBlock_LogicalContainer() {
		return (EReference)titledBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitledBlock_SequenceNumberInChapter() {
		return (EAttribute)titledBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTitledBlock__GetId() {
		return titledBlockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTitledBlock__Parent() {
		return titledBlockEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitledTable() {
		return titledTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitledTable_Table() {
		return (EReference)titledTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTable() {
		return abstractTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractTable_WidthPercent() {
		return (EAttribute)abstractTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Columns() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Rows() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_HideGrid() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableRow_Height() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableRow_IsHeading() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableRow_Cells() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableRow_Table() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableCell() {
		return tableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_Width() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_Height() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableCell_Row() {
		return (EReference)tableCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedTable() {
		return providedTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedTable_DiagramRoot() {
		return (EReference)providedTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedTable_Renderer() {
		return (EReference)providedTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableRenderer() {
		return tableRendererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableRenderer_Name() {
		return (EAttribute)tableRendererEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableRenderer_TableName() {
		return (EAttribute)tableRendererEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitledFigure() {
		return titledFigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitledFigure_Figure() {
		return (EReference)titledFigureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractFigure() {
		return abstractFigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncludedFigure() {
		return includedFigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludedFigure_FileUri() {
		return (EAttribute)includedFigureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedFigure() {
		return providedFigureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedFigure_DiagramRoot() {
		return (EReference)providedFigureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedFigure_Renderer() {
		return (EReference)providedFigureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFigureRenderer() {
		return figureRendererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFigureRenderer_Name() {
		return (EAttribute)figureRendererEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFigureRenderer_DiagramName() {
		return (EAttribute)figureRendererEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquation() {
		return equationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquation_FileUri() {
		return (EAttribute)equationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitledCodeListing() {
		return titledCodeListingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitledCodeListing_Format() {
		return (EAttribute)titledCodeListingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitledCodeListing_CodeLines() {
		return (EAttribute)titledCodeListingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTitledCodeListing_Include() {
		return (EReference)titledCodeListingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRichTextParagraph() {
		return richTextParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRichTextParagraph_Style() {
		return (EAttribute)richTextParagraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRichTextParagraph_Text() {
		return (EReference)richTextParagraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRichTextReferencingParagraph() {
		return richTextReferencingParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRichTextReferencingParagraph_Text() {
		return (EReference)richTextReferencingParagraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnformattedParagraph() {
		return unformattedParagraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnformattedParagraph_Text() {
		return (EAttribute)unformattedParagraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPublicationNature() {
		return publicationNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReferenceScope() {
		return referenceScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdmonitionKind() {
		return admonitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getListStyle() {
		return listStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCodeLanguage() {
		return codeLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParagraphStyle() {
		return paragraphStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PubFactory getPubFactory() {
		return (PubFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pubModelEClass = createEClass(PUB_MODEL);
		createEReference(pubModelEClass, PUB_MODEL__IMPORTS);
		createEReference(pubModelEClass, PUB_MODEL__DOCUMENT);
		createEReference(pubModelEClass, PUB_MODEL__FIGURE_RENDERERS);
		createEReference(pubModelEClass, PUB_MODEL__TABLE_RENDERERS);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__TITLE);
		createEReference(documentEClass, DOCUMENT__PUBLICATION_CLASS);

		publicationEClass = createEClass(PUBLICATION);
		createEReference(publicationEClass, PUBLICATION__INCLUDES);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__SEGMENTS);

		referenceTargetEClass = createEClass(REFERENCE_TARGET);
		createEAttribute(referenceTargetEClass, REFERENCE_TARGET__NAME);
		createEAttribute(referenceTargetEClass, REFERENCE_TARGET__ID);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__SCOPE);
		createEReference(referenceEClass, REFERENCE__TARGET);

		documentSegmentEClass = createEClass(DOCUMENT_SEGMENT);
		createEReference(documentSegmentEClass, DOCUMENT_SEGMENT__PARENT);
		createEOperation(documentSegmentEClass, DOCUMENT_SEGMENT___GET_NAME);
		createEOperation(documentSegmentEClass, DOCUMENT_SEGMENT___SET_NAME__STRING);

		blockContainerEClass = createEClass(BLOCK_CONTAINER);
		createEReference(blockContainerEClass, BLOCK_CONTAINER__CONTENTS);

		segmentWithTextEClass = createEClass(SEGMENT_WITH_TEXT);

		abstractEClass = createEClass(ABSTRACT);

		prefaceEClass = createEClass(PREFACE);

		epilogueEClass = createEClass(EPILOGUE);

		segmentWithTableEClass = createEClass(SEGMENT_WITH_TABLE);

		changeHistoryEClass = createEClass(CHANGE_HISTORY);
		createEReference(changeHistoryEClass, CHANGE_HISTORY__ENTRIES);

		changeDescriptionEClass = createEClass(CHANGE_DESCRIPTION);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__VERSION);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__DATE);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__AUTHOR);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__DESCRIPTION);

		tocEClass = createEClass(TOC);

		abbreviationsEClass = createEClass(ABBREVIATIONS);
		createEReference(abbreviationsEClass, ABBREVIATIONS__ENTRIES);

		abbreviationEClass = createEClass(ABBREVIATION);
		createEAttribute(abbreviationEClass, ABBREVIATION__NAME);
		createEAttribute(abbreviationEClass, ABBREVIATION__LONG_FORM);

		listOfTablesEClass = createEClass(LIST_OF_TABLES);

		listOfFiguresEClass = createEClass(LIST_OF_FIGURES);

		bibliographyEClass = createEClass(BIBLIOGRAPHY);
		createEReference(bibliographyEClass, BIBLIOGRAPHY__ENTRIES);

		bibliographyEntryEClass = createEClass(BIBLIOGRAPHY_ENTRY);
		createEAttribute(bibliographyEntryEClass, BIBLIOGRAPHY_ENTRY__NAME);
		createEAttribute(bibliographyEntryEClass, BIBLIOGRAPHY_ENTRY__AUTHORS);
		createEAttribute(bibliographyEntryEClass, BIBLIOGRAPHY_ENTRY__TITLE);
		createEAttribute(bibliographyEntryEClass, BIBLIOGRAPHY_ENTRY__PUBLISHER);
		createEAttribute(bibliographyEntryEClass, BIBLIOGRAPHY_ENTRY__DATE);
		createEAttribute(bibliographyEntryEClass, BIBLIOGRAPHY_ENTRY__COMMENT);

		glossaryEClass = createEClass(GLOSSARY);
		createEReference(glossaryEClass, GLOSSARY__ENTRIES);

		glossaryEntryEClass = createEClass(GLOSSARY_ENTRY);
		createEAttribute(glossaryEntryEClass, GLOSSARY_ENTRY__NAME);
		createEAttribute(glossaryEntryEClass, GLOSSARY_ENTRY__TEXT);
		createEAttribute(glossaryEntryEClass, GLOSSARY_ENTRY__COMMENT);

		indexEClass = createEClass(INDEX);
		createEReference(indexEClass, INDEX__ENTRIES);

		indexEntryEClass = createEClass(INDEX_ENTRY);
		createEAttribute(indexEntryEClass, INDEX_ENTRY__TEXT);
		createEReference(indexEntryEClass, INDEX_ENTRY__REFERENCES);

		segmentIncludeEClass = createEClass(SEGMENT_INCLUDE);
		createEReference(segmentIncludeEClass, SEGMENT_INCLUDE__INCLUDE);

		publicationBodyEClass = createEClass(PUBLICATION_BODY);

		numberedElementEClass = createEClass(NUMBERED_ELEMENT);
		createEAttribute(numberedElementEClass, NUMBERED_ELEMENT__LEVEL);
		createEAttribute(numberedElementEClass, NUMBERED_ELEMENT__SEQUENCE_NUMBER);

		divisionContainerEClass = createEClass(DIVISION_CONTAINER);
		createEReference(divisionContainerEClass, DIVISION_CONTAINER__DIVISIONS);

		divisionEClass = createEClass(DIVISION);
		createEAttribute(divisionEClass, DIVISION__START_NUMBERING_AT);
		createEReference(divisionEClass, DIVISION__TITLE);
		createEReference(divisionEClass, DIVISION__INCLUDE);
		createEReference(divisionEClass, DIVISION__LOGICAL_CONTAINER);
		createEOperation(divisionEClass, DIVISION___GET_ID);
		createEOperation(divisionEClass, DIVISION___PARENT);
		createEOperation(divisionEClass, DIVISION___GET_DOCUMENT);

		partEClass = createEClass(PART);

		appendixEClass = createEClass(APPENDIX);

		chapterEClass = createEClass(CHAPTER);

		sectionEClass = createEClass(SECTION);

		subsectionEClass = createEClass(SUBSECTION);

		subsubsectionEClass = createEClass(SUBSUBSECTION);

		contentBlockEClass = createEClass(CONTENT_BLOCK);

		admonitionEClass = createEClass(ADMONITION);
		createEAttribute(admonitionEClass, ADMONITION__KIND);
		createEReference(admonitionEClass, ADMONITION__TITLE);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__STYLE);
		createEAttribute(listEClass, LIST__NUMBERING_STYLE);
		createEAttribute(listEClass, LIST__LEVEL);
		createEReference(listEClass, LIST__ITEMS);

		listItemEClass = createEClass(LIST_ITEM);
		createEReference(listItemEClass, LIST_ITEM__TITLE);
		createEReference(listItemEClass, LIST_ITEM__LIST);
		createEOperation(listItemEClass, LIST_ITEM___GET_LEVEL);
		createEOperation(listItemEClass, LIST_ITEM___GET_SEQUENCE_NUMBER);

		titledBlockEClass = createEClass(TITLED_BLOCK);
		createEReference(titledBlockEClass, TITLED_BLOCK__TITLE);
		createEReference(titledBlockEClass, TITLED_BLOCK__LOGICAL_CONTAINER);
		createEAttribute(titledBlockEClass, TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER);
		createEOperation(titledBlockEClass, TITLED_BLOCK___GET_ID);
		createEOperation(titledBlockEClass, TITLED_BLOCK___PARENT);

		titledTableEClass = createEClass(TITLED_TABLE);
		createEReference(titledTableEClass, TITLED_TABLE__TABLE);

		abstractTableEClass = createEClass(ABSTRACT_TABLE);
		createEAttribute(abstractTableEClass, ABSTRACT_TABLE__WIDTH_PERCENT);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__ROWS);
		createEAttribute(tableEClass, TABLE__HIDE_GRID);

		tableRowEClass = createEClass(TABLE_ROW);
		createEAttribute(tableRowEClass, TABLE_ROW__HEIGHT);
		createEAttribute(tableRowEClass, TABLE_ROW__IS_HEADING);
		createEReference(tableRowEClass, TABLE_ROW__CELLS);
		createEReference(tableRowEClass, TABLE_ROW__TABLE);

		tableCellEClass = createEClass(TABLE_CELL);
		createEAttribute(tableCellEClass, TABLE_CELL__WIDTH);
		createEAttribute(tableCellEClass, TABLE_CELL__HEIGHT);
		createEReference(tableCellEClass, TABLE_CELL__ROW);

		providedTableEClass = createEClass(PROVIDED_TABLE);
		createEReference(providedTableEClass, PROVIDED_TABLE__DIAGRAM_ROOT);
		createEReference(providedTableEClass, PROVIDED_TABLE__RENDERER);

		tableRendererEClass = createEClass(TABLE_RENDERER);
		createEAttribute(tableRendererEClass, TABLE_RENDERER__NAME);
		createEAttribute(tableRendererEClass, TABLE_RENDERER__TABLE_NAME);

		titledFigureEClass = createEClass(TITLED_FIGURE);
		createEReference(titledFigureEClass, TITLED_FIGURE__FIGURE);

		abstractFigureEClass = createEClass(ABSTRACT_FIGURE);

		includedFigureEClass = createEClass(INCLUDED_FIGURE);
		createEAttribute(includedFigureEClass, INCLUDED_FIGURE__FILE_URI);

		providedFigureEClass = createEClass(PROVIDED_FIGURE);
		createEReference(providedFigureEClass, PROVIDED_FIGURE__DIAGRAM_ROOT);
		createEReference(providedFigureEClass, PROVIDED_FIGURE__RENDERER);

		figureRendererEClass = createEClass(FIGURE_RENDERER);
		createEAttribute(figureRendererEClass, FIGURE_RENDERER__NAME);
		createEAttribute(figureRendererEClass, FIGURE_RENDERER__DIAGRAM_NAME);

		equationEClass = createEClass(EQUATION);
		createEAttribute(equationEClass, EQUATION__FILE_URI);

		titledCodeListingEClass = createEClass(TITLED_CODE_LISTING);
		createEAttribute(titledCodeListingEClass, TITLED_CODE_LISTING__FORMAT);
		createEAttribute(titledCodeListingEClass, TITLED_CODE_LISTING__CODE_LINES);
		createEReference(titledCodeListingEClass, TITLED_CODE_LISTING__INCLUDE);

		paragraphEClass = createEClass(PARAGRAPH);

		richTextParagraphEClass = createEClass(RICH_TEXT_PARAGRAPH);
		createEAttribute(richTextParagraphEClass, RICH_TEXT_PARAGRAPH__STYLE);
		createEReference(richTextParagraphEClass, RICH_TEXT_PARAGRAPH__TEXT);

		richTextReferencingParagraphEClass = createEClass(RICH_TEXT_REFERENCING_PARAGRAPH);
		createEReference(richTextReferencingParagraphEClass, RICH_TEXT_REFERENCING_PARAGRAPH__TEXT);

		unformattedParagraphEClass = createEClass(UNFORMATTED_PARAGRAPH);
		createEAttribute(unformattedParagraphEClass, UNFORMATTED_PARAGRAPH__TEXT);

		// Create enums
		publicationNatureEEnum = createEEnum(PUBLICATION_NATURE);
		referenceScopeEEnum = createEEnum(REFERENCE_SCOPE);
		admonitionKindEEnum = createEEnum(ADMONITION_KIND);
		listStyleEEnum = createEEnum(LIST_STYLE);
		codeLanguageEEnum = createEEnum(CODE_LANGUAGE);
		paragraphStyleEEnum = createEEnum(PARAGRAPH_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ProtoPackage theProtoPackage = (ProtoPackage)EPackage.Registry.INSTANCE.getEPackage(ProtoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentEClass.getESuperTypes().add(this.getReferenceTarget());
		publicationEClass.getESuperTypes().add(this.getDocument());
		componentEClass.getESuperTypes().add(this.getDocument());
		referenceEClass.getESuperTypes().add(theBasePackage.getDExpression());
		documentSegmentEClass.getESuperTypes().add(this.getReferenceTarget());
		segmentWithTextEClass.getESuperTypes().add(this.getDocumentSegment());
		segmentWithTextEClass.getESuperTypes().add(this.getBlockContainer());
		abstractEClass.getESuperTypes().add(this.getSegmentWithText());
		prefaceEClass.getESuperTypes().add(this.getSegmentWithText());
		epilogueEClass.getESuperTypes().add(this.getSegmentWithText());
		segmentWithTableEClass.getESuperTypes().add(this.getDocumentSegment());
		segmentWithTableEClass.getESuperTypes().add(this.getBlockContainer());
		changeHistoryEClass.getESuperTypes().add(this.getSegmentWithTable());
		tocEClass.getESuperTypes().add(this.getSegmentWithTable());
		abbreviationsEClass.getESuperTypes().add(this.getSegmentWithTable());
		listOfTablesEClass.getESuperTypes().add(this.getSegmentWithTable());
		listOfFiguresEClass.getESuperTypes().add(this.getSegmentWithTable());
		bibliographyEClass.getESuperTypes().add(this.getSegmentWithTable());
		glossaryEClass.getESuperTypes().add(this.getSegmentWithTable());
		indexEClass.getESuperTypes().add(this.getDocumentSegment());
		segmentIncludeEClass.getESuperTypes().add(this.getDocumentSegment());
		publicationBodyEClass.getESuperTypes().add(this.getDocumentSegment());
		publicationBodyEClass.getESuperTypes().add(this.getDivisionContainer());
		divisionEClass.getESuperTypes().add(this.getDivisionContainer());
		divisionEClass.getESuperTypes().add(this.getBlockContainer());
		divisionEClass.getESuperTypes().add(this.getNumberedElement());
		divisionEClass.getESuperTypes().add(this.getReferenceTarget());
		partEClass.getESuperTypes().add(this.getDivision());
		appendixEClass.getESuperTypes().add(this.getPart());
		chapterEClass.getESuperTypes().add(this.getDivision());
		sectionEClass.getESuperTypes().add(this.getDivision());
		subsectionEClass.getESuperTypes().add(this.getDivision());
		subsubsectionEClass.getESuperTypes().add(this.getDivision());
		admonitionEClass.getESuperTypes().add(this.getContentBlock());
		admonitionEClass.getESuperTypes().add(this.getBlockContainer());
		admonitionEClass.getESuperTypes().add(this.getReferenceTarget());
		listEClass.getESuperTypes().add(this.getContentBlock());
		listEClass.getESuperTypes().add(this.getReferenceTarget());
		listItemEClass.getESuperTypes().add(this.getBlockContainer());
		listItemEClass.getESuperTypes().add(this.getNumberedElement());
		listItemEClass.getESuperTypes().add(this.getReferenceTarget());
		titledBlockEClass.getESuperTypes().add(this.getContentBlock());
		titledBlockEClass.getESuperTypes().add(this.getNumberedElement());
		titledBlockEClass.getESuperTypes().add(this.getReferenceTarget());
		titledTableEClass.getESuperTypes().add(this.getTitledBlock());
		tableEClass.getESuperTypes().add(this.getAbstractTable());
		tableCellEClass.getESuperTypes().add(this.getBlockContainer());
		providedTableEClass.getESuperTypes().add(this.getAbstractTable());
		titledFigureEClass.getESuperTypes().add(this.getTitledBlock());
		includedFigureEClass.getESuperTypes().add(this.getAbstractFigure());
		providedFigureEClass.getESuperTypes().add(this.getAbstractFigure());
		equationEClass.getESuperTypes().add(this.getTitledBlock());
		titledCodeListingEClass.getESuperTypes().add(this.getTitledBlock());
		paragraphEClass.getESuperTypes().add(this.getContentBlock());
		richTextParagraphEClass.getESuperTypes().add(this.getParagraph());
		richTextReferencingParagraphEClass.getESuperTypes().add(this.getContentBlock());
		unformattedParagraphEClass.getESuperTypes().add(this.getParagraph());

		// Initialize classes, features, and operations; add parameters
		initEClass(pubModelEClass, PubModel.class, "PubModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPubModel_Imports(), theBasePackage.getDImport(), null, "imports", null, 0, -1, PubModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubModel_Document(), this.getDocument(), null, "document", null, 0, 1, PubModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubModel_FigureRenderers(), this.getFigureRenderer(), null, "figureRenderers", null, 0, -1, PubModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPubModel_TableRenderers(), this.getTableRenderer(), null, "tableRenderers", null, 0, -1, PubModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_PublicationClass(), theProtoPackage.getPublicationClass(), null, "publicationClass", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicationEClass, Publication.class, "Publication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublication_Includes(), this.getComponent(), null, "includes", null, 0, -1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Segments(), this.getDocumentSegment(), this.getDocumentSegment_Parent(), "segments", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTargetEClass, ReferenceTarget.class, "ReferenceTarget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceTarget_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ReferenceTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceTarget_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ReferenceTarget.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Scope(), this.getReferenceScope(), "scope", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Target(), this.getReferenceTarget(), null, "target", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentSegmentEClass, DocumentSegment.class, "DocumentSegment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentSegment_Parent(), this.getComponent(), this.getComponent_Segments(), "parent", null, 0, 1, DocumentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDocumentSegment__GetName(), theEcorePackage.getEString(), "getName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDocumentSegment__SetName__String(), null, "setName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(blockContainerEClass, BlockContainer.class, "BlockContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockContainer_Contents(), this.getContentBlock(), null, "contents", null, 0, -1, BlockContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentWithTextEClass, SegmentWithText.class, "SegmentWithText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractEClass, Abstract.class, "Abstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prefaceEClass, Preface.class, "Preface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(epilogueEClass, Epilogue.class, "Epilogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(segmentWithTableEClass, SegmentWithTable.class, "SegmentWithTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeHistoryEClass, ChangeHistory.class, "ChangeHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeHistory_Entries(), this.getChangeDescription(), null, "entries", null, 0, -1, ChangeHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeDescriptionEClass, ChangeDescription.class, "ChangeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeDescription_Version(), theEcorePackage.getEString(), "version", null, 0, 1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeDescription_Date(), theEcorePackage.getEString(), "date", null, 0, 1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeDescription_Author(), theEcorePackage.getEString(), "author", null, 0, 1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeDescription_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tocEClass, com.mimacom.ddd.pub.pub.TOC.class, "TOC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abbreviationsEClass, Abbreviations.class, "Abbreviations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbbreviations_Entries(), this.getAbbreviation(), null, "entries", null, 0, -1, Abbreviations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abbreviationEClass, Abbreviation.class, "Abbreviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbbreviation_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Abbreviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbreviation_LongForm(), theEcorePackage.getEString(), "longForm", null, 0, 1, Abbreviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfTablesEClass, ListOfTables.class, "ListOfTables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listOfFiguresEClass, ListOfFigures.class, "ListOfFigures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bibliographyEClass, Bibliography.class, "Bibliography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBibliography_Entries(), this.getBibliographyEntry(), null, "entries", null, 0, -1, Bibliography.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bibliographyEntryEClass, BibliographyEntry.class, "BibliographyEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBibliographyEntry_Name(), theEcorePackage.getEString(), "name", null, 0, 1, BibliographyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBibliographyEntry_Authors(), theEcorePackage.getEString(), "authors", null, 0, 1, BibliographyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBibliographyEntry_Title(), theEcorePackage.getEString(), "title", null, 0, 1, BibliographyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBibliographyEntry_Publisher(), theEcorePackage.getEString(), "publisher", null, 0, 1, BibliographyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBibliographyEntry_Date(), theEcorePackage.getEString(), "date", null, 0, 1, BibliographyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBibliographyEntry_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, BibliographyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glossaryEClass, Glossary.class, "Glossary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlossary_Entries(), this.getGlossaryEntry(), null, "entries", null, 0, -1, Glossary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glossaryEntryEClass, GlossaryEntry.class, "GlossaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlossaryEntry_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GlossaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossaryEntry_Text(), theEcorePackage.getEString(), "text", null, 0, 1, GlossaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossaryEntry_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, GlossaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndex_Entries(), this.getIndexEntry(), null, "entries", null, 0, -1, Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexEntryEClass, IndexEntry.class, "IndexEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexEntry_Text(), theEcorePackage.getEString(), "text", null, 0, 1, IndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexEntry_References(), this.getDivision(), null, "references", null, 0, -1, IndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentIncludeEClass, SegmentInclude.class, "SegmentInclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSegmentInclude_Include(), this.getDocumentSegment(), null, "include", null, 0, 1, SegmentInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicationBodyEClass, PublicationBody.class, "PublicationBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberedElementEClass, NumberedElement.class, "NumberedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberedElement_Level(), theEcorePackage.getEInt(), "level", "-1", 0, 1, NumberedElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberedElement_SequenceNumber(), theEcorePackage.getEInt(), "sequenceNumber", "-1", 0, 1, NumberedElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divisionContainerEClass, DivisionContainer.class, "DivisionContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDivisionContainer_Divisions(), this.getDivision(), null, "divisions", null, 0, -1, DivisionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divisionEClass, Division.class, "Division", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDivision_StartNumberingAt(), theEcorePackage.getEInt(), "startNumberingAt", "1", 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Title(), theBasePackage.getDRichText(), null, "title", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_Include(), this.getDivision(), null, "include", null, 0, 1, Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivision_LogicalContainer(), this.getDivision(), null, "logicalContainer", null, 0, 1, Division.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDivision__GetId(), theEcorePackage.getEString(), "getId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDivision__Parent(), this.getDivision(), "parent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getDivision__GetDocument(), this.getDocument(), "getDocument", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appendixEClass, Appendix.class, "Appendix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chapterEClass, Chapter.class, "Chapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsectionEClass, Subsection.class, "Subsection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsubsectionEClass, Subsubsection.class, "Subsubsection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentBlockEClass, ContentBlock.class, "ContentBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(admonitionEClass, Admonition.class, "Admonition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdmonition_Kind(), this.getAdmonitionKind(), "kind", null, 0, 1, Admonition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdmonition_Title(), theBasePackage.getDRichText(), null, "title", null, 0, 1, Admonition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_Style(), this.getListStyle(), "style", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_NumberingStyle(), theProtoPackage.getProtoSequenceNumberStyle(), "numberingStyle", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_Level(), theEcorePackage.getEInt(), "level", null, 0, 1, List.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getList_Items(), this.getListItem(), this.getListItem_List(), "items", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListItem_Title(), theBasePackage.getDRichText(), null, "title", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListItem_List(), this.getList(), this.getList_Items(), "list", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getListItem__GetLevel(), theEcorePackage.getEInt(), "getLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getListItem__GetSequenceNumber(), theEcorePackage.getEInt(), "getSequenceNumber", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(titledBlockEClass, TitledBlock.class, "TitledBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTitledBlock_Title(), theBasePackage.getDRichText(), null, "title", null, 0, 1, TitledBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTitledBlock_LogicalContainer(), this.getChapter(), null, "logicalContainer", null, 0, 1, TitledBlock.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitledBlock_SequenceNumberInChapter(), theEcorePackage.getEInt(), "sequenceNumberInChapter", "-1", 0, 1, TitledBlock.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTitledBlock__GetId(), theEcorePackage.getEString(), "getId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTitledBlock__Parent(), this.getDivision(), "parent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(titledTableEClass, TitledTable.class, "TitledTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTitledTable_Table(), this.getAbstractTable(), null, "table", null, 0, 1, TitledTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTableEClass, AbstractTable.class, "AbstractTable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTable_WidthPercent(), theEcorePackage.getEInt(), "widthPercent", "100", 0, 1, AbstractTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Columns(), theEcorePackage.getEInt(), "columns", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Rows(), this.getTableRow(), this.getTableRow_Table(), "rows", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_HideGrid(), theEcorePackage.getEBoolean(), "hideGrid", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableRow_Height(), theEcorePackage.getEInt(), "height", "1", 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_IsHeading(), theEcorePackage.getEBoolean(), "isHeading", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableRow_Cells(), this.getTableCell(), this.getTableCell_Row(), "cells", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableRow_Table(), this.getTable(), this.getTable_Rows(), "table", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCellEClass, TableCell.class, "TableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableCell_Width(), theEcorePackage.getEInt(), "width", "1", 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_Height(), theEcorePackage.getEInt(), "height", "1", 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableCell_Row(), this.getTableRow(), this.getTableRow_Cells(), "row", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedTableEClass, ProvidedTable.class, "ProvidedTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedTable_DiagramRoot(), theBasePackage.getIDiagramRoot(), null, "diagramRoot", null, 0, 1, ProvidedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedTable_Renderer(), this.getTableRenderer(), null, "renderer", null, 0, 1, ProvidedTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRendererEClass, TableRenderer.class, "TableRenderer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableRenderer_Name(), theEcorePackage.getEString(), "name", null, 0, 1, TableRenderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRenderer_TableName(), theEcorePackage.getEString(), "tableName", null, 0, 1, TableRenderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titledFigureEClass, TitledFigure.class, "TitledFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTitledFigure_Figure(), this.getAbstractFigure(), null, "figure", null, 0, 1, TitledFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFigureEClass, AbstractFigure.class, "AbstractFigure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includedFigureEClass, IncludedFigure.class, "IncludedFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludedFigure_FileUri(), theEcorePackage.getEString(), "fileUri", null, 0, 1, IncludedFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedFigureEClass, ProvidedFigure.class, "ProvidedFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedFigure_DiagramRoot(), theBasePackage.getIDiagramRoot(), null, "diagramRoot", null, 0, 1, ProvidedFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvidedFigure_Renderer(), this.getFigureRenderer(), null, "renderer", null, 0, 1, ProvidedFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(figureRendererEClass, FigureRenderer.class, "FigureRenderer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFigureRenderer_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FigureRenderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigureRenderer_DiagramName(), theEcorePackage.getEString(), "diagramName", null, 0, 1, FigureRenderer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equationEClass, Equation.class, "Equation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquation_FileUri(), theEcorePackage.getEString(), "fileUri", null, 0, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titledCodeListingEClass, TitledCodeListing.class, "TitledCodeListing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitledCodeListing_Format(), this.getCodeLanguage(), "format", null, 0, 1, TitledCodeListing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitledCodeListing_CodeLines(), theEcorePackage.getEString(), "codeLines", null, 0, -1, TitledCodeListing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTitledCodeListing_Include(), theEcorePackage.getEObject(), null, "include", null, 0, 1, TitledCodeListing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richTextParagraphEClass, RichTextParagraph.class, "RichTextParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichTextParagraph_Style(), this.getParagraphStyle(), "style", null, 0, 1, RichTextParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichTextParagraph_Text(), theBasePackage.getDRichText(), null, "text", null, 0, 1, RichTextParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richTextReferencingParagraphEClass, RichTextReferencingParagraph.class, "RichTextReferencingParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichTextReferencingParagraph_Text(), theBasePackage.getDRichText(), null, "text", null, 0, 1, RichTextReferencingParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unformattedParagraphEClass, UnformattedParagraph.class, "UnformattedParagraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnformattedParagraph_Text(), theEcorePackage.getEString(), "text", null, 0, 1, UnformattedParagraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(publicationNatureEEnum, PublicationNature.class, "PublicationNature");
		addEEnumLiteral(publicationNatureEEnum, PublicationNature.PRINT);
		addEEnumLiteral(publicationNatureEEnum, PublicationNature.WEB);

		initEEnum(referenceScopeEEnum, ReferenceScope.class, "ReferenceScope");
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.DEFAULT);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.DOCUMENT_SEGMENT);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.DIVISION);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.PART);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.APPENDIX);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.CHAPTER);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.SECTION);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.SUBSECTION);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.SUBSUBSECTION);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.TABLE);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.FIGURE);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.EQUATION);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.CODE_LISTING);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.ADMONITION);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.ABBREVIATION);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.GLOSSARY);
		addEEnumLiteral(referenceScopeEEnum, ReferenceScope.BIBLIOGRAPHY);

		initEEnum(admonitionKindEEnum, AdmonitionKind.class, "AdmonitionKind");
		addEEnumLiteral(admonitionKindEEnum, AdmonitionKind.NOTE);
		addEEnumLiteral(admonitionKindEEnum, AdmonitionKind.TIP);
		addEEnumLiteral(admonitionKindEEnum, AdmonitionKind.CAUTION);
		addEEnumLiteral(admonitionKindEEnum, AdmonitionKind.IMPORTANT);

		initEEnum(listStyleEEnum, ListStyle.class, "ListStyle");
		addEEnumLiteral(listStyleEEnum, ListStyle.BULLET);
		addEEnumLiteral(listStyleEEnum, ListStyle.SEQUENCE);
		addEEnumLiteral(listStyleEEnum, ListStyle.TITLE);

		initEEnum(codeLanguageEEnum, CodeLanguage.class, "CodeLanguage");
		addEEnumLiteral(codeLanguageEEnum, CodeLanguage.JAVA);
		addEEnumLiteral(codeLanguageEEnum, CodeLanguage.JAVA_SCRIPT);
		addEEnumLiteral(codeLanguageEEnum, CodeLanguage.HTML);
		addEEnumLiteral(codeLanguageEEnum, CodeLanguage.XML);

		initEEnum(paragraphStyleEEnum, ParagraphStyle.class, "ParagraphStyle");
		addEEnumLiteral(paragraphStyleEEnum, ParagraphStyle.PLAIN);
		addEEnumLiteral(paragraphStyleEEnum, ParagraphStyle.QUOTE);

		// Create resource
		createResource(eNS_URI);
	}

} //PubPackageImpl
