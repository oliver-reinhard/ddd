/**
 */
package com.mimacom.ddd.pub.proto.impl;

import com.mimacom.ddd.pub.proto.*;

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
public class ProtoFactoryImpl extends EFactoryImpl implements ProtoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtoFactory init() {
		try {
			ProtoFactory theProtoFactory = (ProtoFactory)EPackage.Registry.INSTANCE.getEFactory(ProtoPackage.eNS_URI);
			if (theProtoFactory != null) {
				return theProtoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProtoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoFactoryImpl() {
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
			case ProtoPackage.PUBLICATION_CLASS: return createPublicationClass();
			case ProtoPackage.PROTO_SYMBOL: return createProtoSymbol();
			case ProtoPackage.PROTO_SYMBOL_REFERENCE: return createProtoSymbolReference();
			case ProtoPackage.PROTO_ABSTRACT: return createProtoAbstract();
			case ProtoPackage.PROTO_PREFACE: return createProtoPreface();
			case ProtoPackage.PROTO_EPILOGUE: return createProtoEpilogue();
			case ProtoPackage.PROTO_PUBLICATION_BODY: return createProtoPublicationBody();
			case ProtoPackage.PROTO_CHANGE_HISTORY: return createProtoChangeHistory();
			case ProtoPackage.PROTO_TOC: return createProtoTOC();
			case ProtoPackage.PROTO_ABBREVIATIONS: return createProtoAbbreviations();
			case ProtoPackage.PROTO_LIST_OF_TABLES: return createProtoListOfTables();
			case ProtoPackage.PROTO_LIST_OF_FIGURES: return createProtoListOfFigures();
			case ProtoPackage.PROTO_BIBLIOGRAPHY: return createProtoBibliography();
			case ProtoPackage.PROTO_GLOSSARY: return createProtoGlossary();
			case ProtoPackage.PROTO_INDEX: return createProtoIndex();
			case ProtoPackage.PROTO_PART: return createProtoPart();
			case ProtoPackage.PROTO_APPENDIX: return createProtoAppendix();
			case ProtoPackage.PROTO_CHAPTER: return createProtoChapter();
			case ProtoPackage.PROTO_SECTION: return createProtoSection();
			case ProtoPackage.PROTO_SUBSECTION: return createProtoSubsection();
			case ProtoPackage.PROTO_SUBSUBSECTION: return createProtoSubsubsection();
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
			case ProtoPackage.PUBLICATION_NATURE:
				return createPublicationNatureFromString(eDataType, initialValue);
			case ProtoPackage.PROTO_SEQUENCE_NUMBER_STYLE:
				return createProtoSequenceNumberStyleFromString(eDataType, initialValue);
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
			case ProtoPackage.PUBLICATION_NATURE:
				return convertPublicationNatureToString(eDataType, instanceValue);
			case ProtoPackage.PROTO_SEQUENCE_NUMBER_STYLE:
				return convertProtoSequenceNumberStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationClass createPublicationClass() {
		PublicationClassImpl publicationClass = new PublicationClassImpl();
		return publicationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoSymbol createProtoSymbol() {
		ProtoSymbolImpl protoSymbol = new ProtoSymbolImpl();
		return protoSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoSymbolReference createProtoSymbolReference() {
		ProtoSymbolReferenceImpl protoSymbolReference = new ProtoSymbolReferenceImpl();
		return protoSymbolReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoAbstract createProtoAbstract() {
		ProtoAbstractImpl protoAbstract = new ProtoAbstractImpl();
		return protoAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoPreface createProtoPreface() {
		ProtoPrefaceImpl protoPreface = new ProtoPrefaceImpl();
		return protoPreface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoEpilogue createProtoEpilogue() {
		ProtoEpilogueImpl protoEpilogue = new ProtoEpilogueImpl();
		return protoEpilogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoPublicationBody createProtoPublicationBody() {
		ProtoPublicationBodyImpl protoPublicationBody = new ProtoPublicationBodyImpl();
		return protoPublicationBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoChangeHistory createProtoChangeHistory() {
		ProtoChangeHistoryImpl protoChangeHistory = new ProtoChangeHistoryImpl();
		return protoChangeHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoTOC createProtoTOC() {
		ProtoTOCImpl protoTOC = new ProtoTOCImpl();
		return protoTOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoAbbreviations createProtoAbbreviations() {
		ProtoAbbreviationsImpl protoAbbreviations = new ProtoAbbreviationsImpl();
		return protoAbbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoListOfTables createProtoListOfTables() {
		ProtoListOfTablesImpl protoListOfTables = new ProtoListOfTablesImpl();
		return protoListOfTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoListOfFigures createProtoListOfFigures() {
		ProtoListOfFiguresImpl protoListOfFigures = new ProtoListOfFiguresImpl();
		return protoListOfFigures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoBibliography createProtoBibliography() {
		ProtoBibliographyImpl protoBibliography = new ProtoBibliographyImpl();
		return protoBibliography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoGlossary createProtoGlossary() {
		ProtoGlossaryImpl protoGlossary = new ProtoGlossaryImpl();
		return protoGlossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoIndex createProtoIndex() {
		ProtoIndexImpl protoIndex = new ProtoIndexImpl();
		return protoIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoPart createProtoPart() {
		ProtoPartImpl protoPart = new ProtoPartImpl();
		return protoPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoAppendix createProtoAppendix() {
		ProtoAppendixImpl protoAppendix = new ProtoAppendixImpl();
		return protoAppendix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoChapter createProtoChapter() {
		ProtoChapterImpl protoChapter = new ProtoChapterImpl();
		return protoChapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoSection createProtoSection() {
		ProtoSectionImpl protoSection = new ProtoSectionImpl();
		return protoSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoSubsection createProtoSubsection() {
		ProtoSubsectionImpl protoSubsection = new ProtoSubsectionImpl();
		return protoSubsection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoSubsubsection createProtoSubsubsection() {
		ProtoSubsubsectionImpl protoSubsubsection = new ProtoSubsubsectionImpl();
		return protoSubsubsection;
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
	public ProtoSequenceNumberStyle createProtoSequenceNumberStyleFromString(EDataType eDataType, String initialValue) {
		ProtoSequenceNumberStyle result = ProtoSequenceNumberStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtoSequenceNumberStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtoPackage getProtoPackage() {
		return (ProtoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProtoPackage getPackage() {
		return ProtoPackage.eINSTANCE;
	}

} //ProtoFactoryImpl
