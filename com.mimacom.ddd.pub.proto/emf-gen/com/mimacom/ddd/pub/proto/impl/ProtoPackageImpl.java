/**
 */
package com.mimacom.ddd.pub.proto.impl;

import com.mimacom.ddd.pub.proto.ProtoAbbreviations;
import com.mimacom.ddd.pub.proto.ProtoAbstract;
import com.mimacom.ddd.pub.proto.ProtoAppendix;
import com.mimacom.ddd.pub.proto.ProtoBibliography;
import com.mimacom.ddd.pub.proto.ProtoChangeHistory;
import com.mimacom.ddd.pub.proto.ProtoChapter;
import com.mimacom.ddd.pub.proto.ProtoDivision;
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.proto.ProtoEpilogue;
import com.mimacom.ddd.pub.proto.ProtoFactory;
import com.mimacom.ddd.pub.proto.ProtoGlossary;
import com.mimacom.ddd.pub.proto.ProtoIndex;
import com.mimacom.ddd.pub.proto.ProtoListOfFigures;
import com.mimacom.ddd.pub.proto.ProtoListOfTables;
import com.mimacom.ddd.pub.proto.ProtoPackage;
import com.mimacom.ddd.pub.proto.ProtoPart;
import com.mimacom.ddd.pub.proto.ProtoPreface;
import com.mimacom.ddd.pub.proto.ProtoPublicationBody;
import com.mimacom.ddd.pub.proto.ProtoSection;
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;
import com.mimacom.ddd.pub.proto.ProtoSubsection;
import com.mimacom.ddd.pub.proto.ProtoSubsubsection;
import com.mimacom.ddd.pub.proto.ProtoTOC;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.proto.PublicationNature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class ProtoPackageImpl extends EPackageImpl implements ProtoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoDocumentSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoPrefaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoEpilogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoPublicationBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoChangeHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoTOCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoAbbreviationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoListOfTablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoListOfFiguresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoBibliographyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoGlossaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoDivisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoAppendixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoChapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoSubsectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protoSubsubsectionEClass = null;

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
	private EEnum protoSequenceNumberStyleEEnum = null;

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
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProtoPackageImpl() {
		super(eNS_URI, ProtoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProtoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProtoPackage init() {
		if (isInited) return (ProtoPackage)EPackage.Registry.INSTANCE.getEPackage(ProtoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProtoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProtoPackageImpl theProtoPackage = registeredProtoPackage instanceof ProtoPackageImpl ? (ProtoPackageImpl)registeredProtoPackage : new ProtoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProtoPackage.createPackageContents();

		// Initialize created meta-data
		theProtoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProtoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProtoPackage.eNS_URI, theProtoPackage);
		return theProtoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationClass() {
		return publicationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationClass_Name() {
		return (EAttribute)publicationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationClass_Title() {
		return (EAttribute)publicationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationClass_Nature() {
		return (EAttribute)publicationClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationClass_Segments() {
		return (EReference)publicationClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationClass_Divisions() {
		return (EReference)publicationClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoDocumentSegment() {
		return protoDocumentSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtoDocumentSegment_Name() {
		return (EAttribute)protoDocumentSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtoDocumentSegment_Title() {
		return (EAttribute)protoDocumentSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtoDocumentSegment_Optional() {
		return (EAttribute)protoDocumentSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtoDocumentSegment_Parent() {
		return (EReference)protoDocumentSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoAbstract() {
		return protoAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoPreface() {
		return protoPrefaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoEpilogue() {
		return protoEpilogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoPublicationBody() {
		return protoPublicationBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtoPublicationBody_AllowParts() {
		return (EAttribute)protoPublicationBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtoPublicationBody_AllowAppendix() {
		return (EAttribute)protoPublicationBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoChangeHistory() {
		return protoChangeHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoTOC() {
		return protoTOCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtoTOC_MaxLevel() {
		return (EAttribute)protoTOCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoAbbreviations() {
		return protoAbbreviationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoListOfTables() {
		return protoListOfTablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoListOfFigures() {
		return protoListOfFiguresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoBibliography() {
		return protoBibliographyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoGlossary() {
		return protoGlossaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoIndex() {
		return protoIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoDivision() {
		return protoDivisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtoDivision_Name() {
		return (EAttribute)protoDivisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtoDivision_NumberingStyle() {
		return (EAttribute)protoDivisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoPart() {
		return protoPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoAppendix() {
		return protoAppendixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoChapter() {
		return protoChapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoSection() {
		return protoSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoSubsection() {
		return protoSubsectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtoSubsubsection() {
		return protoSubsubsectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPublicationNature() {
		return publicationNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtoSequenceNumberStyle() {
		return protoSequenceNumberStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoFactory getProtoFactory() {
		return (ProtoFactory)getEFactoryInstance();
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
		publicationClassEClass = createEClass(PUBLICATION_CLASS);
		createEAttribute(publicationClassEClass, PUBLICATION_CLASS__NAME);
		createEAttribute(publicationClassEClass, PUBLICATION_CLASS__TITLE);
		createEAttribute(publicationClassEClass, PUBLICATION_CLASS__NATURE);
		createEReference(publicationClassEClass, PUBLICATION_CLASS__SEGMENTS);
		createEReference(publicationClassEClass, PUBLICATION_CLASS__DIVISIONS);

		protoDocumentSegmentEClass = createEClass(PROTO_DOCUMENT_SEGMENT);
		createEAttribute(protoDocumentSegmentEClass, PROTO_DOCUMENT_SEGMENT__NAME);
		createEAttribute(protoDocumentSegmentEClass, PROTO_DOCUMENT_SEGMENT__TITLE);
		createEAttribute(protoDocumentSegmentEClass, PROTO_DOCUMENT_SEGMENT__OPTIONAL);
		createEReference(protoDocumentSegmentEClass, PROTO_DOCUMENT_SEGMENT__PARENT);

		protoAbstractEClass = createEClass(PROTO_ABSTRACT);

		protoPrefaceEClass = createEClass(PROTO_PREFACE);

		protoEpilogueEClass = createEClass(PROTO_EPILOGUE);

		protoPublicationBodyEClass = createEClass(PROTO_PUBLICATION_BODY);
		createEAttribute(protoPublicationBodyEClass, PROTO_PUBLICATION_BODY__ALLOW_PARTS);
		createEAttribute(protoPublicationBodyEClass, PROTO_PUBLICATION_BODY__ALLOW_APPENDIX);

		protoChangeHistoryEClass = createEClass(PROTO_CHANGE_HISTORY);

		protoTOCEClass = createEClass(PROTO_TOC);
		createEAttribute(protoTOCEClass, PROTO_TOC__MAX_LEVEL);

		protoAbbreviationsEClass = createEClass(PROTO_ABBREVIATIONS);

		protoListOfTablesEClass = createEClass(PROTO_LIST_OF_TABLES);

		protoListOfFiguresEClass = createEClass(PROTO_LIST_OF_FIGURES);

		protoBibliographyEClass = createEClass(PROTO_BIBLIOGRAPHY);

		protoGlossaryEClass = createEClass(PROTO_GLOSSARY);

		protoIndexEClass = createEClass(PROTO_INDEX);

		protoDivisionEClass = createEClass(PROTO_DIVISION);
		createEAttribute(protoDivisionEClass, PROTO_DIVISION__NAME);
		createEAttribute(protoDivisionEClass, PROTO_DIVISION__NUMBERING_STYLE);

		protoPartEClass = createEClass(PROTO_PART);

		protoAppendixEClass = createEClass(PROTO_APPENDIX);

		protoChapterEClass = createEClass(PROTO_CHAPTER);

		protoSectionEClass = createEClass(PROTO_SECTION);

		protoSubsectionEClass = createEClass(PROTO_SUBSECTION);

		protoSubsubsectionEClass = createEClass(PROTO_SUBSUBSECTION);

		// Create enums
		publicationNatureEEnum = createEEnum(PUBLICATION_NATURE);
		protoSequenceNumberStyleEEnum = createEEnum(PROTO_SEQUENCE_NUMBER_STYLE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		protoAbstractEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoPrefaceEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoEpilogueEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoPublicationBodyEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoChangeHistoryEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoTOCEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoAbbreviationsEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoListOfTablesEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoListOfFiguresEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoBibliographyEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoGlossaryEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoIndexEClass.getESuperTypes().add(this.getProtoDocumentSegment());
		protoPartEClass.getESuperTypes().add(this.getProtoDivision());
		protoAppendixEClass.getESuperTypes().add(this.getProtoPart());
		protoChapterEClass.getESuperTypes().add(this.getProtoDivision());
		protoSectionEClass.getESuperTypes().add(this.getProtoDivision());
		protoSubsectionEClass.getESuperTypes().add(this.getProtoDivision());
		protoSubsubsectionEClass.getESuperTypes().add(this.getProtoDivision());

		// Initialize classes, features, and operations; add parameters
		initEClass(publicationClassEClass, PublicationClass.class, "PublicationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicationClass_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PublicationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicationClass_Title(), theEcorePackage.getEString(), "title", null, 0, 1, PublicationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicationClass_Nature(), this.getPublicationNature(), "nature", null, 0, 1, PublicationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicationClass_Segments(), this.getProtoDocumentSegment(), this.getProtoDocumentSegment_Parent(), "segments", null, 0, -1, PublicationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicationClass_Divisions(), this.getProtoDivision(), null, "divisions", null, 0, -1, PublicationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protoDocumentSegmentEClass, ProtoDocumentSegment.class, "ProtoDocumentSegment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtoDocumentSegment_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ProtoDocumentSegment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtoDocumentSegment_Title(), theEcorePackage.getEString(), "title", null, 0, 1, ProtoDocumentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtoDocumentSegment_Optional(), theEcorePackage.getEBoolean(), "optional", "false", 0, 1, ProtoDocumentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtoDocumentSegment_Parent(), this.getPublicationClass(), this.getPublicationClass_Segments(), "parent", null, 0, 1, ProtoDocumentSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protoAbstractEClass, ProtoAbstract.class, "ProtoAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoPrefaceEClass, ProtoPreface.class, "ProtoPreface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoEpilogueEClass, ProtoEpilogue.class, "ProtoEpilogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoPublicationBodyEClass, ProtoPublicationBody.class, "ProtoPublicationBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtoPublicationBody_AllowParts(), theEcorePackage.getEBoolean(), "allowParts", "false", 0, 1, ProtoPublicationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtoPublicationBody_AllowAppendix(), theEcorePackage.getEBoolean(), "allowAppendix", "false", 0, 1, ProtoPublicationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protoChangeHistoryEClass, ProtoChangeHistory.class, "ProtoChangeHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoTOCEClass, ProtoTOC.class, "ProtoTOC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtoTOC_MaxLevel(), theEcorePackage.getEInt(), "maxLevel", "3", 0, 1, ProtoTOC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protoAbbreviationsEClass, ProtoAbbreviations.class, "ProtoAbbreviations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoListOfTablesEClass, ProtoListOfTables.class, "ProtoListOfTables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoListOfFiguresEClass, ProtoListOfFigures.class, "ProtoListOfFigures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoBibliographyEClass, ProtoBibliography.class, "ProtoBibliography", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoGlossaryEClass, ProtoGlossary.class, "ProtoGlossary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoIndexEClass, ProtoIndex.class, "ProtoIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoDivisionEClass, ProtoDivision.class, "ProtoDivision", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtoDivision_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ProtoDivision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtoDivision_NumberingStyle(), this.getProtoSequenceNumberStyle(), "numberingStyle", null, 0, 1, ProtoDivision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protoPartEClass, ProtoPart.class, "ProtoPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoAppendixEClass, ProtoAppendix.class, "ProtoAppendix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoChapterEClass, ProtoChapter.class, "ProtoChapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoSectionEClass, ProtoSection.class, "ProtoSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoSubsectionEClass, ProtoSubsection.class, "ProtoSubsection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protoSubsubsectionEClass, ProtoSubsubsection.class, "ProtoSubsubsection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(publicationNatureEEnum, PublicationNature.class, "PublicationNature");
		addEEnumLiteral(publicationNatureEEnum, PublicationNature.PRINT);
		addEEnumLiteral(publicationNatureEEnum, PublicationNature.WEB);

		initEEnum(protoSequenceNumberStyleEEnum, ProtoSequenceNumberStyle.class, "ProtoSequenceNumberStyle");
		addEEnumLiteral(protoSequenceNumberStyleEEnum, ProtoSequenceNumberStyle.ARABIC);
		addEEnumLiteral(protoSequenceNumberStyleEEnum, ProtoSequenceNumberStyle.CAPITAL_ROMAN);
		addEEnumLiteral(protoSequenceNumberStyleEEnum, ProtoSequenceNumberStyle.SMALL_ROMAN);
		addEEnumLiteral(protoSequenceNumberStyleEEnum, ProtoSequenceNumberStyle.CAPITAL_LETTER);
		addEEnumLiteral(protoSequenceNumberStyleEEnum, ProtoSequenceNumberStyle.SMALL_LETTER);
		addEEnumLiteral(protoSequenceNumberStyleEEnum, ProtoSequenceNumberStyle.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //ProtoPackageImpl
