/**
 */
package com.mimacom.ddd.pub.proto;

import com.mimacom.ddd.dm.base.BasePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.proto.ProtoFactory
 * @model kind="package"
 * @generated
 */
public interface ProtoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/pub/proto";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProtoPackage eINSTANCE = com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.PublicationClassImpl <em>Publication Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.PublicationClassImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getPublicationClass()
	 * @generated
	 */
	int PUBLICATION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS__NATURE = 1;

	/**
	 * The feature id for the '<em><b>La Te XClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS__LA_TE_XCLASS = 2;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS__SYMBOLS = 3;

	/**
	 * The feature id for the '<em><b>La Te XPreamble</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS__LA_TE_XPREAMBLE = 4;

	/**
	 * The feature id for the '<em><b>Html Preamble</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS__HTML_PREAMBLE = 5;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS__SEGMENTS = 6;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS__DIVISIONS = 7;

	/**
	 * The number of structural features of the '<em>Publication Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Publication Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoSymbolImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSymbol()
	 * @generated
	 */
	int PROTO_SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SYMBOL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SYMBOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSymbolReferenceImpl <em>Symbol Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoSymbolReferenceImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSymbolReference()
	 * @generated
	 */
	int PROTO_SYMBOL_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SYMBOL_REFERENCE__TARGET = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SYMBOL_REFERENCE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symbol Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SYMBOL_REFERENCE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoDocumentSegmentImpl <em>Document Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoDocumentSegmentImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoDocumentSegment()
	 * @generated
	 */
	int PROTO_DOCUMENT_SEGMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DOCUMENT_SEGMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DOCUMENT_SEGMENT__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DOCUMENT_SEGMENT__OPTIONAL = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DOCUMENT_SEGMENT__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Document Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoAbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoAbstractImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoAbstract()
	 * @generated
	 */
	int PROTO_ABSTRACT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABSTRACT__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABSTRACT__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABSTRACT__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABSTRACT__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABSTRACT_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABSTRACT_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoPrefaceImpl <em>Preface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPrefaceImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoPreface()
	 * @generated
	 */
	int PROTO_PREFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PREFACE__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PREFACE__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PREFACE__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PREFACE__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Preface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PREFACE_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Preface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PREFACE_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoEpilogueImpl <em>Epilogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoEpilogueImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoEpilogue()
	 * @generated
	 */
	int PROTO_EPILOGUE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_EPILOGUE__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_EPILOGUE__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_EPILOGUE__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_EPILOGUE__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Epilogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_EPILOGUE_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Epilogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_EPILOGUE_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoPublicationBodyImpl <em>Publication Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPublicationBodyImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoPublicationBody()
	 * @generated
	 */
	int PROTO_PUBLICATION_BODY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PUBLICATION_BODY__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PUBLICATION_BODY__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PUBLICATION_BODY__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PUBLICATION_BODY__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Allow Parts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PUBLICATION_BODY__ALLOW_PARTS = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Appendix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PUBLICATION_BODY__ALLOW_APPENDIX = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Publication Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PUBLICATION_BODY_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Publication Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PUBLICATION_BODY_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoChangeHistoryImpl <em>Change History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoChangeHistoryImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoChangeHistory()
	 * @generated
	 */
	int PROTO_CHANGE_HISTORY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHANGE_HISTORY__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHANGE_HISTORY__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHANGE_HISTORY__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHANGE_HISTORY__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Change History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHANGE_HISTORY_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Change History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHANGE_HISTORY_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoTOCImpl <em>TOC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoTOCImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoTOC()
	 * @generated
	 */
	int PROTO_TOC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_TOC__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_TOC__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_TOC__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_TOC__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Max Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_TOC__MAX_LEVEL = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_TOC_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_TOC_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoAbbreviationsImpl <em>Abbreviations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoAbbreviationsImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoAbbreviations()
	 * @generated
	 */
	int PROTO_ABBREVIATIONS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABBREVIATIONS__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABBREVIATIONS__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABBREVIATIONS__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABBREVIATIONS__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABBREVIATIONS_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_ABBREVIATIONS_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoListOfTablesImpl <em>List Of Tables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoListOfTablesImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoListOfTables()
	 * @generated
	 */
	int PROTO_LIST_OF_TABLES = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_TABLES__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_TABLES__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_TABLES__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_TABLES__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>List Of Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_TABLES_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Of Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_TABLES_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoListOfFiguresImpl <em>List Of Figures</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoListOfFiguresImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoListOfFigures()
	 * @generated
	 */
	int PROTO_LIST_OF_FIGURES = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_FIGURES__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_FIGURES__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_FIGURES__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_FIGURES__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>List Of Figures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_FIGURES_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Of Figures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_LIST_OF_FIGURES_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoBibliographyImpl <em>Bibliography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoBibliographyImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoBibliography()
	 * @generated
	 */
	int PROTO_BIBLIOGRAPHY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_BIBLIOGRAPHY__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_BIBLIOGRAPHY__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_BIBLIOGRAPHY__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_BIBLIOGRAPHY__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Bibliography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_BIBLIOGRAPHY_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bibliography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_BIBLIOGRAPHY_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoGlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoGlossaryImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoGlossary()
	 * @generated
	 */
	int PROTO_GLOSSARY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_GLOSSARY__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_GLOSSARY__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_GLOSSARY__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_GLOSSARY__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_GLOSSARY_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_GLOSSARY_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoIndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoIndexImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoIndex()
	 * @generated
	 */
	int PROTO_INDEX = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_INDEX__NAME = PROTO_DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_INDEX__TITLE = PROTO_DOCUMENT_SEGMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_INDEX__OPTIONAL = PROTO_DOCUMENT_SEGMENT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_INDEX__PARENT = PROTO_DOCUMENT_SEGMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_INDEX_FEATURE_COUNT = PROTO_DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_INDEX_OPERATION_COUNT = PROTO_DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoDivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoDivisionImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoDivision()
	 * @generated
	 */
	int PROTO_DIVISION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DIVISION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Numbering Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DIVISION__NUMBERING_STYLE = 1;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DIVISION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_DIVISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoPartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPartImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoPart()
	 * @generated
	 */
	int PROTO_PART = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PART__NAME = PROTO_DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Numbering Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PART__NUMBERING_STYLE = PROTO_DIVISION__NUMBERING_STYLE;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PART_FEATURE_COUNT = PROTO_DIVISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_PART_OPERATION_COUNT = PROTO_DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoAppendixImpl <em>Appendix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoAppendixImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoAppendix()
	 * @generated
	 */
	int PROTO_APPENDIX = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_APPENDIX__NAME = PROTO_PART__NAME;

	/**
	 * The feature id for the '<em><b>Numbering Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_APPENDIX__NUMBERING_STYLE = PROTO_PART__NUMBERING_STYLE;

	/**
	 * The number of structural features of the '<em>Appendix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_APPENDIX_FEATURE_COUNT = PROTO_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Appendix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_APPENDIX_OPERATION_COUNT = PROTO_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoChapterImpl <em>Chapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoChapterImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoChapter()
	 * @generated
	 */
	int PROTO_CHAPTER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHAPTER__NAME = PROTO_DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Numbering Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHAPTER__NUMBERING_STYLE = PROTO_DIVISION__NUMBERING_STYLE;

	/**
	 * The number of structural features of the '<em>Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHAPTER_FEATURE_COUNT = PROTO_DIVISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_CHAPTER_OPERATION_COUNT = PROTO_DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoSectionImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSection()
	 * @generated
	 */
	int PROTO_SECTION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SECTION__NAME = PROTO_DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Numbering Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SECTION__NUMBERING_STYLE = PROTO_DIVISION__NUMBERING_STYLE;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SECTION_FEATURE_COUNT = PROTO_DIVISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SECTION_OPERATION_COUNT = PROTO_DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSubsectionImpl <em>Subsection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoSubsectionImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSubsection()
	 * @generated
	 */
	int PROTO_SUBSECTION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SUBSECTION__NAME = PROTO_DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Numbering Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SUBSECTION__NUMBERING_STYLE = PROTO_DIVISION__NUMBERING_STYLE;

	/**
	 * The number of structural features of the '<em>Subsection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SUBSECTION_FEATURE_COUNT = PROTO_DIVISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subsection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SUBSECTION_OPERATION_COUNT = PROTO_DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSubsubsectionImpl <em>Subsubsection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoSubsubsectionImpl
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSubsubsection()
	 * @generated
	 */
	int PROTO_SUBSUBSECTION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SUBSUBSECTION__NAME = PROTO_DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Numbering Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SUBSUBSECTION__NUMBERING_STYLE = PROTO_DIVISION__NUMBERING_STYLE;

	/**
	 * The number of structural features of the '<em>Subsubsection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SUBSUBSECTION_FEATURE_COUNT = PROTO_DIVISION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subsubsection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTO_SUBSUBSECTION_OPERATION_COUNT = PROTO_DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.PublicationNature <em>Publication Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.PublicationNature
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getPublicationNature()
	 * @generated
	 */
	int PUBLICATION_NATURE = 23;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle <em>Sequence Number Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
	 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSequenceNumberStyle()
	 * @generated
	 */
	int PROTO_SEQUENCE_NUMBER_STYLE = 24;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.PublicationClass <em>Publication Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication Class</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass
	 * @generated
	 */
	EClass getPublicationClass();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.PublicationClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getName()
	 * @see #getPublicationClass()
	 * @generated
	 */
	EAttribute getPublicationClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.PublicationClass#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getNature()
	 * @see #getPublicationClass()
	 * @generated
	 */
	EAttribute getPublicationClass_Nature();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.PublicationClass#getLaTeXClass <em>La Te XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>La Te XClass</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getLaTeXClass()
	 * @see #getPublicationClass()
	 * @generated
	 */
	EAttribute getPublicationClass_LaTeXClass();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.proto.PublicationClass#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbols</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getSymbols()
	 * @see #getPublicationClass()
	 * @generated
	 */
	EReference getPublicationClass_Symbols();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.proto.PublicationClass#getLaTeXPreamble <em>La Te XPreamble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>La Te XPreamble</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getLaTeXPreamble()
	 * @see #getPublicationClass()
	 * @generated
	 */
	EReference getPublicationClass_LaTeXPreamble();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.proto.PublicationClass#getHtmlPreamble <em>Html Preamble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Html Preamble</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getHtmlPreamble()
	 * @see #getPublicationClass()
	 * @generated
	 */
	EReference getPublicationClass_HtmlPreamble();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.proto.PublicationClass#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getSegments()
	 * @see #getPublicationClass()
	 * @generated
	 */
	EReference getPublicationClass_Segments();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.proto.PublicationClass#getDivisions <em>Divisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divisions</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getDivisions()
	 * @see #getPublicationClass()
	 * @generated
	 */
	EReference getPublicationClass_Divisions();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoSymbol
	 * @generated
	 */
	EClass getProtoSymbol();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoSymbol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoSymbol#getName()
	 * @see #getProtoSymbol()
	 * @generated
	 */
	EAttribute getProtoSymbol_Name();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoSymbolReference <em>Symbol Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Reference</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoSymbolReference
	 * @generated
	 */
	EClass getProtoSymbolReference();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.proto.ProtoSymbolReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoSymbolReference#getTarget()
	 * @see #getProtoSymbolReference()
	 * @generated
	 */
	EReference getProtoSymbolReference_Target();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment <em>Document Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Segment</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoDocumentSegment
	 * @generated
	 */
	EClass getProtoDocumentSegment();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getName()
	 * @see #getProtoDocumentSegment()
	 * @generated
	 */
	EAttribute getProtoDocumentSegment_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getTitle()
	 * @see #getProtoDocumentSegment()
	 * @generated
	 */
	EAttribute getProtoDocumentSegment_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoDocumentSegment#isOptional()
	 * @see #getProtoDocumentSegment()
	 * @generated
	 */
	EAttribute getProtoDocumentSegment_Optional();

	/**
	 * Returns the meta object for the container reference '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getParent()
	 * @see #getProtoDocumentSegment()
	 * @generated
	 */
	EReference getProtoDocumentSegment_Parent();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoAbstract
	 * @generated
	 */
	EClass getProtoAbstract();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoPreface <em>Preface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preface</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoPreface
	 * @generated
	 */
	EClass getProtoPreface();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoEpilogue <em>Epilogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epilogue</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoEpilogue
	 * @generated
	 */
	EClass getProtoEpilogue();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoPublicationBody <em>Publication Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication Body</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoPublicationBody
	 * @generated
	 */
	EClass getProtoPublicationBody();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoPublicationBody#isAllowParts <em>Allow Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Parts</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoPublicationBody#isAllowParts()
	 * @see #getProtoPublicationBody()
	 * @generated
	 */
	EAttribute getProtoPublicationBody_AllowParts();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoPublicationBody#isAllowAppendix <em>Allow Appendix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Appendix</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoPublicationBody#isAllowAppendix()
	 * @see #getProtoPublicationBody()
	 * @generated
	 */
	EAttribute getProtoPublicationBody_AllowAppendix();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoChangeHistory <em>Change History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change History</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoChangeHistory
	 * @generated
	 */
	EClass getProtoChangeHistory();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoTOC <em>TOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOC</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoTOC
	 * @generated
	 */
	EClass getProtoTOC();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoTOC#getMaxLevel <em>Max Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Level</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoTOC#getMaxLevel()
	 * @see #getProtoTOC()
	 * @generated
	 */
	EAttribute getProtoTOC_MaxLevel();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoAbbreviations <em>Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbreviations</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoAbbreviations
	 * @generated
	 */
	EClass getProtoAbbreviations();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoListOfTables <em>List Of Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Tables</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoListOfTables
	 * @generated
	 */
	EClass getProtoListOfTables();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoListOfFigures <em>List Of Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Figures</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoListOfFigures
	 * @generated
	 */
	EClass getProtoListOfFigures();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoBibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliography</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoBibliography
	 * @generated
	 */
	EClass getProtoBibliography();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoGlossary
	 * @generated
	 */
	EClass getProtoGlossary();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoIndex
	 * @generated
	 */
	EClass getProtoIndex();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoDivision <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoDivision
	 * @generated
	 */
	EClass getProtoDivision();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoDivision#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoDivision#getName()
	 * @see #getProtoDivision()
	 * @generated
	 */
	EAttribute getProtoDivision_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.proto.ProtoDivision#getNumberingStyle <em>Numbering Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbering Style</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoDivision#getNumberingStyle()
	 * @see #getProtoDivision()
	 * @generated
	 */
	EAttribute getProtoDivision_NumberingStyle();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoPart
	 * @generated
	 */
	EClass getProtoPart();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoAppendix <em>Appendix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appendix</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoAppendix
	 * @generated
	 */
	EClass getProtoAppendix();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoChapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoChapter
	 * @generated
	 */
	EClass getProtoChapter();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoSection
	 * @generated
	 */
	EClass getProtoSection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoSubsection <em>Subsection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsection</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoSubsection
	 * @generated
	 */
	EClass getProtoSubsection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.proto.ProtoSubsubsection <em>Subsubsection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsubsection</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoSubsubsection
	 * @generated
	 */
	EClass getProtoSubsubsection();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.proto.PublicationNature <em>Publication Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Publication Nature</em>'.
	 * @see com.mimacom.ddd.pub.proto.PublicationNature
	 * @generated
	 */
	EEnum getPublicationNature();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle <em>Sequence Number Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sequence Number Style</em>'.
	 * @see com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
	 * @generated
	 */
	EEnum getProtoSequenceNumberStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProtoFactory getProtoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.PublicationClassImpl <em>Publication Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.PublicationClassImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getPublicationClass()
		 * @generated
		 */
		EClass PUBLICATION_CLASS = eINSTANCE.getPublicationClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION_CLASS__NAME = eINSTANCE.getPublicationClass_Name();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION_CLASS__NATURE = eINSTANCE.getPublicationClass_Nature();

		/**
		 * The meta object literal for the '<em><b>La Te XClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION_CLASS__LA_TE_XCLASS = eINSTANCE.getPublicationClass_LaTeXClass();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_CLASS__SYMBOLS = eINSTANCE.getPublicationClass_Symbols();

		/**
		 * The meta object literal for the '<em><b>La Te XPreamble</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_CLASS__LA_TE_XPREAMBLE = eINSTANCE.getPublicationClass_LaTeXPreamble();

		/**
		 * The meta object literal for the '<em><b>Html Preamble</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_CLASS__HTML_PREAMBLE = eINSTANCE.getPublicationClass_HtmlPreamble();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_CLASS__SEGMENTS = eINSTANCE.getPublicationClass_Segments();

		/**
		 * The meta object literal for the '<em><b>Divisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_CLASS__DIVISIONS = eINSTANCE.getPublicationClass_Divisions();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoSymbolImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSymbol()
		 * @generated
		 */
		EClass PROTO_SYMBOL = eINSTANCE.getProtoSymbol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_SYMBOL__NAME = eINSTANCE.getProtoSymbol_Name();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSymbolReferenceImpl <em>Symbol Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoSymbolReferenceImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSymbolReference()
		 * @generated
		 */
		EClass PROTO_SYMBOL_REFERENCE = eINSTANCE.getProtoSymbolReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTO_SYMBOL_REFERENCE__TARGET = eINSTANCE.getProtoSymbolReference_Target();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoDocumentSegmentImpl <em>Document Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoDocumentSegmentImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoDocumentSegment()
		 * @generated
		 */
		EClass PROTO_DOCUMENT_SEGMENT = eINSTANCE.getProtoDocumentSegment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_DOCUMENT_SEGMENT__NAME = eINSTANCE.getProtoDocumentSegment_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_DOCUMENT_SEGMENT__TITLE = eINSTANCE.getProtoDocumentSegment_Title();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_DOCUMENT_SEGMENT__OPTIONAL = eINSTANCE.getProtoDocumentSegment_Optional();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTO_DOCUMENT_SEGMENT__PARENT = eINSTANCE.getProtoDocumentSegment_Parent();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoAbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoAbstractImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoAbstract()
		 * @generated
		 */
		EClass PROTO_ABSTRACT = eINSTANCE.getProtoAbstract();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoPrefaceImpl <em>Preface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPrefaceImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoPreface()
		 * @generated
		 */
		EClass PROTO_PREFACE = eINSTANCE.getProtoPreface();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoEpilogueImpl <em>Epilogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoEpilogueImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoEpilogue()
		 * @generated
		 */
		EClass PROTO_EPILOGUE = eINSTANCE.getProtoEpilogue();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoPublicationBodyImpl <em>Publication Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPublicationBodyImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoPublicationBody()
		 * @generated
		 */
		EClass PROTO_PUBLICATION_BODY = eINSTANCE.getProtoPublicationBody();

		/**
		 * The meta object literal for the '<em><b>Allow Parts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_PUBLICATION_BODY__ALLOW_PARTS = eINSTANCE.getProtoPublicationBody_AllowParts();

		/**
		 * The meta object literal for the '<em><b>Allow Appendix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_PUBLICATION_BODY__ALLOW_APPENDIX = eINSTANCE.getProtoPublicationBody_AllowAppendix();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoChangeHistoryImpl <em>Change History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoChangeHistoryImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoChangeHistory()
		 * @generated
		 */
		EClass PROTO_CHANGE_HISTORY = eINSTANCE.getProtoChangeHistory();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoTOCImpl <em>TOC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoTOCImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoTOC()
		 * @generated
		 */
		EClass PROTO_TOC = eINSTANCE.getProtoTOC();

		/**
		 * The meta object literal for the '<em><b>Max Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_TOC__MAX_LEVEL = eINSTANCE.getProtoTOC_MaxLevel();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoAbbreviationsImpl <em>Abbreviations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoAbbreviationsImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoAbbreviations()
		 * @generated
		 */
		EClass PROTO_ABBREVIATIONS = eINSTANCE.getProtoAbbreviations();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoListOfTablesImpl <em>List Of Tables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoListOfTablesImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoListOfTables()
		 * @generated
		 */
		EClass PROTO_LIST_OF_TABLES = eINSTANCE.getProtoListOfTables();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoListOfFiguresImpl <em>List Of Figures</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoListOfFiguresImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoListOfFigures()
		 * @generated
		 */
		EClass PROTO_LIST_OF_FIGURES = eINSTANCE.getProtoListOfFigures();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoBibliographyImpl <em>Bibliography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoBibliographyImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoBibliography()
		 * @generated
		 */
		EClass PROTO_BIBLIOGRAPHY = eINSTANCE.getProtoBibliography();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoGlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoGlossaryImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoGlossary()
		 * @generated
		 */
		EClass PROTO_GLOSSARY = eINSTANCE.getProtoGlossary();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoIndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoIndexImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoIndex()
		 * @generated
		 */
		EClass PROTO_INDEX = eINSTANCE.getProtoIndex();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoDivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoDivisionImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoDivision()
		 * @generated
		 */
		EClass PROTO_DIVISION = eINSTANCE.getProtoDivision();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_DIVISION__NAME = eINSTANCE.getProtoDivision_Name();

		/**
		 * The meta object literal for the '<em><b>Numbering Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTO_DIVISION__NUMBERING_STYLE = eINSTANCE.getProtoDivision_NumberingStyle();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoPartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPartImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoPart()
		 * @generated
		 */
		EClass PROTO_PART = eINSTANCE.getProtoPart();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoAppendixImpl <em>Appendix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoAppendixImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoAppendix()
		 * @generated
		 */
		EClass PROTO_APPENDIX = eINSTANCE.getProtoAppendix();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoChapterImpl <em>Chapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoChapterImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoChapter()
		 * @generated
		 */
		EClass PROTO_CHAPTER = eINSTANCE.getProtoChapter();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoSectionImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSection()
		 * @generated
		 */
		EClass PROTO_SECTION = eINSTANCE.getProtoSection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSubsectionImpl <em>Subsection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoSubsectionImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSubsection()
		 * @generated
		 */
		EClass PROTO_SUBSECTION = eINSTANCE.getProtoSubsection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.impl.ProtoSubsubsectionImpl <em>Subsubsection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoSubsubsectionImpl
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSubsubsection()
		 * @generated
		 */
		EClass PROTO_SUBSUBSECTION = eINSTANCE.getProtoSubsubsection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.PublicationNature <em>Publication Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.PublicationNature
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getPublicationNature()
		 * @generated
		 */
		EEnum PUBLICATION_NATURE = eINSTANCE.getPublicationNature();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle <em>Sequence Number Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
		 * @see com.mimacom.ddd.pub.proto.impl.ProtoPackageImpl#getProtoSequenceNumberStyle()
		 * @generated
		 */
		EEnum PROTO_SEQUENCE_NUMBER_STYLE = eINSTANCE.getProtoSequenceNumberStyle();

	}

} //ProtoPackage
