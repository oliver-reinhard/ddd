/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.mimacom.ddd.pub.pub.PubFactory
 * @model kind="package"
 * @generated
 */
public interface PubPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/pub/pub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pub";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PubPackage eINSTANCE = com.mimacom.ddd.pub.pub.impl.PubPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.PubModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.PubModelImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPubModel()
	 * @generated
	 */
	int PUB_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_MODEL__DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Provided Diagram Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_MODEL__PROVIDED_DIAGRAM_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Provided Table Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_MODEL__PROVIDED_TABLE_TYPES = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUB_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.ReferenceTarget <em>Reference Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.ReferenceTarget
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getReferenceTarget()
	 * @generated
	 */
	int REFERENCE_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TARGET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TARGET__ID = 1;

	/**
	 * The number of structural features of the '<em>Reference Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TARGET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.DocumentImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = REFERENCE_TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = REFERENCE_TARGET__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = REFERENCE_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__GENERATE_HTML = REFERENCE_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generate La Te X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__GENERATE_LA_TE_X = REFERENCE_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generate Markdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__GENERATE_MARKDOWN = REFERENCE_TARGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generate Ascii Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__GENERATE_ASCII_DOC = REFERENCE_TARGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prefer Raster Diagrams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PREFER_RASTER_DIAGRAMS = REFERENCE_TARGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SYMBOLS = REFERENCE_TARGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Publication Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PUBLICATION_CLASS = REFERENCE_TARGET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = REFERENCE_TARGET_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_SYMBOL__STRING = REFERENCE_TARGET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = REFERENCE_TARGET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.SymbolImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = BasePackage.DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__ALIASES = BasePackage.DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__DESCRIPTION = BasePackage.DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__VALUE = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = BasePackage.DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.PublicationImpl <em>Publication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.PublicationImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPublication()
	 * @generated
	 */
	int PUBLICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__ID = DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Generate Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__GENERATE_HTML = DOCUMENT__GENERATE_HTML;

	/**
	 * The feature id for the '<em><b>Generate La Te X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__GENERATE_LA_TE_X = DOCUMENT__GENERATE_LA_TE_X;

	/**
	 * The feature id for the '<em><b>Generate Markdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__GENERATE_MARKDOWN = DOCUMENT__GENERATE_MARKDOWN;

	/**
	 * The feature id for the '<em><b>Generate Ascii Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__GENERATE_ASCII_DOC = DOCUMENT__GENERATE_ASCII_DOC;

	/**
	 * The feature id for the '<em><b>Prefer Raster Diagrams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__PREFER_RASTER_DIAGRAMS = DOCUMENT__PREFER_RASTER_DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__SYMBOLS = DOCUMENT__SYMBOLS;

	/**
	 * The feature id for the '<em><b>Publication Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__PUBLICATION_CLASS = DOCUMENT__PUBLICATION_CLASS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__INCLUDES = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION___GET_SYMBOL__STRING = DOCUMENT___GET_SYMBOL__STRING;

	/**
	 * The number of operations of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ComponentImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Generate Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATE_HTML = DOCUMENT__GENERATE_HTML;

	/**
	 * The feature id for the '<em><b>Generate La Te X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATE_LA_TE_X = DOCUMENT__GENERATE_LA_TE_X;

	/**
	 * The feature id for the '<em><b>Generate Markdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATE_MARKDOWN = DOCUMENT__GENERATE_MARKDOWN;

	/**
	 * The feature id for the '<em><b>Generate Ascii Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATE_ASCII_DOC = DOCUMENT__GENERATE_ASCII_DOC;

	/**
	 * The feature id for the '<em><b>Prefer Raster Diagrams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PREFER_RASTER_DIAGRAMS = DOCUMENT__PREFER_RASTER_DIAGRAMS;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SYMBOLS = DOCUMENT__SYMBOLS;

	/**
	 * The feature id for the '<em><b>Publication Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PUBLICATION_CLASS = DOCUMENT__PUBLICATION_CLASS;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SEGMENTS = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Symbol</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_SYMBOL__STRING = DOCUMENT___GET_SYMBOL__STRING;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ReferenceImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SCOPE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Page Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PAGE_REFERENCE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.DocumentSegmentImpl <em>Document Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.DocumentSegmentImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getDocumentSegment()
	 * @generated
	 */
	int DOCUMENT_SEGMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SEGMENT__NAME = REFERENCE_TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SEGMENT__ID = REFERENCE_TARGET__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SEGMENT__PARENT = REFERENCE_TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SEGMENT_FEATURE_COUNT = REFERENCE_TARGET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SEGMENT___GET_NAME = REFERENCE_TARGET_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SEGMENT___SET_NAME__STRING = REFERENCE_TARGET_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_SEGMENT_OPERATION_COUNT = REFERENCE_TARGET_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.BlockContainerImpl <em>Block Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.BlockContainerImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getBlockContainer()
	 * @generated
	 */
	int BLOCK_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONTAINER__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Block Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.SegmentWithTextImpl <em>Segment With Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.SegmentWithTextImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSegmentWithText()
	 * @generated
	 */
	int SEGMENT_WITH_TEXT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TEXT__NAME = DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TEXT__ID = DOCUMENT_SEGMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TEXT__PARENT = DOCUMENT_SEGMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TEXT__CONTENTS = DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Segment With Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TEXT_FEATURE_COUNT = DOCUMENT_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TEXT___GET_NAME = DOCUMENT_SEGMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TEXT___SET_NAME__STRING = DOCUMENT_SEGMENT___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Segment With Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TEXT_OPERATION_COUNT = DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.AbstractImpl <em>Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.AbstractImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbstract()
	 * @generated
	 */
	int ABSTRACT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__NAME = SEGMENT_WITH_TEXT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__ID = SEGMENT_WITH_TEXT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__PARENT = SEGMENT_WITH_TEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT__CONTENTS = SEGMENT_WITH_TEXT__CONTENTS;

	/**
	 * The number of structural features of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_COUNT = SEGMENT_WITH_TEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___GET_NAME = SEGMENT_WITH_TEXT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT___SET_NAME__STRING = SEGMENT_WITH_TEXT___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPERATION_COUNT = SEGMENT_WITH_TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.PrefaceImpl <em>Preface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.PrefaceImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPreface()
	 * @generated
	 */
	int PREFACE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE__NAME = SEGMENT_WITH_TEXT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE__ID = SEGMENT_WITH_TEXT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE__PARENT = SEGMENT_WITH_TEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE__CONTENTS = SEGMENT_WITH_TEXT__CONTENTS;

	/**
	 * The number of structural features of the '<em>Preface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE_FEATURE_COUNT = SEGMENT_WITH_TEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE___GET_NAME = SEGMENT_WITH_TEXT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE___SET_NAME__STRING = SEGMENT_WITH_TEXT___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Preface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE_OPERATION_COUNT = SEGMENT_WITH_TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.EpilogueImpl <em>Epilogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.EpilogueImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getEpilogue()
	 * @generated
	 */
	int EPILOGUE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPILOGUE__NAME = SEGMENT_WITH_TEXT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPILOGUE__ID = SEGMENT_WITH_TEXT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPILOGUE__PARENT = SEGMENT_WITH_TEXT__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPILOGUE__CONTENTS = SEGMENT_WITH_TEXT__CONTENTS;

	/**
	 * The number of structural features of the '<em>Epilogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPILOGUE_FEATURE_COUNT = SEGMENT_WITH_TEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPILOGUE___GET_NAME = SEGMENT_WITH_TEXT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPILOGUE___SET_NAME__STRING = SEGMENT_WITH_TEXT___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Epilogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPILOGUE_OPERATION_COUNT = SEGMENT_WITH_TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.SegmentWithTableImpl <em>Segment With Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.SegmentWithTableImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSegmentWithTable()
	 * @generated
	 */
	int SEGMENT_WITH_TABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TABLE__NAME = DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TABLE__ID = DOCUMENT_SEGMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TABLE__PARENT = DOCUMENT_SEGMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TABLE__CONTENTS = DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Segment With Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TABLE_FEATURE_COUNT = DOCUMENT_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TABLE___GET_NAME = DOCUMENT_SEGMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TABLE___SET_NAME__STRING = DOCUMENT_SEGMENT___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Segment With Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_WITH_TABLE_OPERATION_COUNT = DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ChangeHistoryImpl <em>Change History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ChangeHistoryImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getChangeHistory()
	 * @generated
	 */
	int CHANGE_HISTORY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY__NAME = SEGMENT_WITH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY__ID = SEGMENT_WITH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY__PARENT = SEGMENT_WITH_TABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY__CONTENTS = SEGMENT_WITH_TABLE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY__ENTRIES = SEGMENT_WITH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY_FEATURE_COUNT = SEGMENT_WITH_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY___GET_NAME = SEGMENT_WITH_TABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY___SET_NAME__STRING = SEGMENT_WITH_TABLE___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Change History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_HISTORY_OPERATION_COUNT = SEGMENT_WITH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ChangeDescriptionImpl <em>Change Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ChangeDescriptionImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getChangeDescription()
	 * @generated
	 */
	int CHANGE_DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__DATE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Change Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Change Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.TOCImpl <em>TOC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.TOCImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTOC()
	 * @generated
	 */
	int TOC = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC__NAME = SEGMENT_WITH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC__ID = SEGMENT_WITH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC__PARENT = SEGMENT_WITH_TABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC__CONTENTS = SEGMENT_WITH_TABLE__CONTENTS;

	/**
	 * The number of structural features of the '<em>TOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_FEATURE_COUNT = SEGMENT_WITH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC___GET_NAME = SEGMENT_WITH_TABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC___SET_NAME__STRING = SEGMENT_WITH_TABLE___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>TOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_OPERATION_COUNT = SEGMENT_WITH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.AbbreviationsImpl <em>Abbreviations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.AbbreviationsImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbbreviations()
	 * @generated
	 */
	int ABBREVIATIONS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS__NAME = SEGMENT_WITH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS__ID = SEGMENT_WITH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS__PARENT = SEGMENT_WITH_TABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS__CONTENTS = SEGMENT_WITH_TABLE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS__ENTRIES = SEGMENT_WITH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS_FEATURE_COUNT = SEGMENT_WITH_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS___GET_NAME = SEGMENT_WITH_TABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS___SET_NAME__STRING = SEGMENT_WITH_TABLE___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Abbreviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATIONS_OPERATION_COUNT = SEGMENT_WITH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.AbbreviationImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbbreviation()
	 * @generated
	 */
	int ABBREVIATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Long Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION__LONG_FORM = 1;

	/**
	 * The number of structural features of the '<em>Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abbreviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ListOfTablesImpl <em>List Of Tables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ListOfTablesImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getListOfTables()
	 * @generated
	 */
	int LIST_OF_TABLES = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TABLES__NAME = SEGMENT_WITH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TABLES__ID = SEGMENT_WITH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TABLES__PARENT = SEGMENT_WITH_TABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TABLES__CONTENTS = SEGMENT_WITH_TABLE__CONTENTS;

	/**
	 * The number of structural features of the '<em>List Of Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TABLES_FEATURE_COUNT = SEGMENT_WITH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TABLES___GET_NAME = SEGMENT_WITH_TABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TABLES___SET_NAME__STRING = SEGMENT_WITH_TABLE___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>List Of Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TABLES_OPERATION_COUNT = SEGMENT_WITH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ListOfFiguresImpl <em>List Of Figures</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ListOfFiguresImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getListOfFigures()
	 * @generated
	 */
	int LIST_OF_FIGURES = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_FIGURES__NAME = SEGMENT_WITH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_FIGURES__ID = SEGMENT_WITH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_FIGURES__PARENT = SEGMENT_WITH_TABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_FIGURES__CONTENTS = SEGMENT_WITH_TABLE__CONTENTS;

	/**
	 * The number of structural features of the '<em>List Of Figures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_FIGURES_FEATURE_COUNT = SEGMENT_WITH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_FIGURES___GET_NAME = SEGMENT_WITH_TABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_FIGURES___SET_NAME__STRING = SEGMENT_WITH_TABLE___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>List Of Figures</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_FIGURES_OPERATION_COUNT = SEGMENT_WITH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.BibliographyImpl <em>Bibliography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.BibliographyImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getBibliography()
	 * @generated
	 */
	int BIBLIOGRAPHY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY__NAME = SEGMENT_WITH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY__ID = SEGMENT_WITH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY__PARENT = SEGMENT_WITH_TABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY__CONTENTS = SEGMENT_WITH_TABLE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY__ENTRIES = SEGMENT_WITH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bibliography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_FEATURE_COUNT = SEGMENT_WITH_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY___GET_NAME = SEGMENT_WITH_TABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY___SET_NAME__STRING = SEGMENT_WITH_TABLE___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Bibliography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_OPERATION_COUNT = SEGMENT_WITH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.BibliographyEntryImpl <em>Bibliography Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.BibliographyEntryImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getBibliographyEntry()
	 * @generated
	 */
	int BIBLIOGRAPHY_ENTRY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_ENTRY__AUTHORS = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_ENTRY__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_ENTRY__PUBLISHER = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_ENTRY__DATE = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_ENTRY__COMMENT = 5;

	/**
	 * The number of structural features of the '<em>Bibliography Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_ENTRY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Bibliography Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOGRAPHY_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.GlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.GlossaryImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getGlossary()
	 * @generated
	 */
	int GLOSSARY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__NAME = SEGMENT_WITH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__ID = SEGMENT_WITH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__PARENT = SEGMENT_WITH_TABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__CONTENTS = SEGMENT_WITH_TABLE__CONTENTS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__ENTRIES = SEGMENT_WITH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_FEATURE_COUNT = SEGMENT_WITH_TABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY___GET_NAME = SEGMENT_WITH_TABLE___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY___SET_NAME__STRING = SEGMENT_WITH_TABLE___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_OPERATION_COUNT = SEGMENT_WITH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.GlossaryEntryImpl <em>Glossary Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.GlossaryEntryImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getGlossaryEntry()
	 * @generated
	 */
	int GLOSSARY_ENTRY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__TEXT = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Glossary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Glossary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.IndexImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ID = DOCUMENT_SEGMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__PARENT = DOCUMENT_SEGMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ENTRIES = DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = DOCUMENT_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX___GET_NAME = DOCUMENT_SEGMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX___SET_NAME__STRING = DOCUMENT_SEGMENT___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.IndexEntryImpl <em>Index Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.IndexEntryImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getIndexEntry()
	 * @generated
	 */
	int INDEX_ENTRY = 26;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__TEXT = 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY__REFERENCES = 1;

	/**
	 * The number of structural features of the '<em>Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.SegmentIncludeImpl <em>Segment Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.SegmentIncludeImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSegmentInclude()
	 * @generated
	 */
	int SEGMENT_INCLUDE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_INCLUDE__NAME = DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_INCLUDE__ID = DOCUMENT_SEGMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_INCLUDE__PARENT = DOCUMENT_SEGMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_INCLUDE__INCLUDE = DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Segment Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_INCLUDE_FEATURE_COUNT = DOCUMENT_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_INCLUDE___GET_NAME = DOCUMENT_SEGMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_INCLUDE___SET_NAME__STRING = DOCUMENT_SEGMENT___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Segment Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_INCLUDE_OPERATION_COUNT = DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.PublicationBodyImpl <em>Publication Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.PublicationBodyImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPublicationBody()
	 * @generated
	 */
	int PUBLICATION_BODY = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_BODY__NAME = DOCUMENT_SEGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_BODY__ID = DOCUMENT_SEGMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_BODY__PARENT = DOCUMENT_SEGMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_BODY__DIVISIONS = DOCUMENT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Publication Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_BODY_FEATURE_COUNT = DOCUMENT_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_BODY___GET_NAME = DOCUMENT_SEGMENT___GET_NAME;

	/**
	 * The operation id for the '<em>Set Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_BODY___SET_NAME__STRING = DOCUMENT_SEGMENT___SET_NAME__STRING;

	/**
	 * The number of operations of the '<em>Publication Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_BODY_OPERATION_COUNT = DOCUMENT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.Numbered <em>Numbered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.Numbered
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getNumbered()
	 * @generated
	 */
	int NUMBERED = 29;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED__SEQUENCE_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Numbered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Numbered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.NumberedByChapter <em>Numbered By Chapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.NumberedByChapter
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getNumberedByChapter()
	 * @generated
	 */
	int NUMBERED_BY_CHAPTER = 30;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED_BY_CHAPTER__LEVEL = NUMBERED__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED_BY_CHAPTER__SEQUENCE_NUMBER = NUMBERED__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED_BY_CHAPTER__LOGICAL_CONTAINER = NUMBERED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED_BY_CHAPTER__SEQUENCE_NUMBER_IN_CHAPTER = NUMBERED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numbered By Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED_BY_CHAPTER_FEATURE_COUNT = NUMBERED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Numbered By Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBERED_BY_CHAPTER_OPERATION_COUNT = NUMBERED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.DivisionContainer <em>Division Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.DivisionContainer
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getDivisionContainer()
	 * @generated
	 */
	int DIVISION_CONTAINER = 31;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_CONTAINER__DIVISIONS = 0;

	/**
	 * The number of structural features of the '<em>Division Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Division Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.DivisionImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 32;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__DIVISIONS = DIVISION_CONTAINER__DIVISIONS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__CONTENTS = DIVISION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LEVEL = DIVISION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__SEQUENCE_NUMBER = DIVISION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__NAME = DIVISION_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__ID = DIVISION_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Numbering At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__START_NUMBERING_AT = DIVISION_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__TITLE = DIVISION_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__INCLUDE = DIVISION_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION__LOGICAL_CONTAINER = DIVISION_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = DIVISION_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_ID = DIVISION_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___PARENT = DIVISION_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION___GET_DOCUMENT = DIVISION_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_OPERATION_COUNT = DIVISION_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.PartImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPart()
	 * @generated
	 */
	int PART = 33;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__DIVISIONS = DIVISION__DIVISIONS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__CONTENTS = DIVISION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__LEVEL = DIVISION__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__SEQUENCE_NUMBER = DIVISION__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ID = DIVISION__ID;

	/**
	 * The feature id for the '<em><b>Start Numbering At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__START_NUMBERING_AT = DIVISION__START_NUMBERING_AT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TITLE = DIVISION__TITLE;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__INCLUDE = DIVISION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__LOGICAL_CONTAINER = DIVISION__LOGICAL_CONTAINER;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___GET_ID = DIVISION___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___PARENT = DIVISION___PARENT;

	/**
	 * The operation id for the '<em>Get Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART___GET_DOCUMENT = DIVISION___GET_DOCUMENT;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.AppendixImpl <em>Appendix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.AppendixImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAppendix()
	 * @generated
	 */
	int APPENDIX = 34;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__DIVISIONS = PART__DIVISIONS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__CONTENTS = PART__CONTENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__LEVEL = PART__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__SEQUENCE_NUMBER = PART__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__NAME = PART__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__ID = PART__ID;

	/**
	 * The feature id for the '<em><b>Start Numbering At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__START_NUMBERING_AT = PART__START_NUMBERING_AT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__TITLE = PART__TITLE;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__INCLUDE = PART__INCLUDE;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX__LOGICAL_CONTAINER = PART__LOGICAL_CONTAINER;

	/**
	 * The number of structural features of the '<em>Appendix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX___GET_ID = PART___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX___PARENT = PART___PARENT;

	/**
	 * The operation id for the '<em>Get Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX___GET_DOCUMENT = PART___GET_DOCUMENT;

	/**
	 * The number of operations of the '<em>Appendix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENDIX_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ChapterImpl <em>Chapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ChapterImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getChapter()
	 * @generated
	 */
	int CHAPTER = 35;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__DIVISIONS = DIVISION__DIVISIONS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__CONTENTS = DIVISION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__LEVEL = DIVISION__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__SEQUENCE_NUMBER = DIVISION__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__ID = DIVISION__ID;

	/**
	 * The feature id for the '<em><b>Start Numbering At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__START_NUMBERING_AT = DIVISION__START_NUMBERING_AT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__TITLE = DIVISION__TITLE;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__INCLUDE = DIVISION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER__LOGICAL_CONTAINER = DIVISION__LOGICAL_CONTAINER;

	/**
	 * The number of structural features of the '<em>Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER___GET_ID = DIVISION___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER___PARENT = DIVISION___PARENT;

	/**
	 * The operation id for the '<em>Get Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER___GET_DOCUMENT = DIVISION___GET_DOCUMENT;

	/**
	 * The number of operations of the '<em>Chapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_OPERATION_COUNT = DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.SectionImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 36;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__DIVISIONS = DIVISION__DIVISIONS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = DIVISION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LEVEL = DIVISION__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SEQUENCE_NUMBER = DIVISION__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = DIVISION__ID;

	/**
	 * The feature id for the '<em><b>Start Numbering At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__START_NUMBERING_AT = DIVISION__START_NUMBERING_AT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = DIVISION__TITLE;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__INCLUDE = DIVISION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__LOGICAL_CONTAINER = DIVISION__LOGICAL_CONTAINER;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___GET_ID = DIVISION___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___PARENT = DIVISION___PARENT;

	/**
	 * The operation id for the '<em>Get Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___GET_DOCUMENT = DIVISION___GET_DOCUMENT;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.SubsectionImpl <em>Subsection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.SubsectionImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSubsection()
	 * @generated
	 */
	int SUBSECTION = 37;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__DIVISIONS = DIVISION__DIVISIONS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__CONTENTS = DIVISION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__LEVEL = DIVISION__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__SEQUENCE_NUMBER = DIVISION__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__ID = DIVISION__ID;

	/**
	 * The feature id for the '<em><b>Start Numbering At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__START_NUMBERING_AT = DIVISION__START_NUMBERING_AT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__TITLE = DIVISION__TITLE;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__INCLUDE = DIVISION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION__LOGICAL_CONTAINER = DIVISION__LOGICAL_CONTAINER;

	/**
	 * The number of structural features of the '<em>Subsection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION___GET_ID = DIVISION___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION___PARENT = DIVISION___PARENT;

	/**
	 * The operation id for the '<em>Get Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION___GET_DOCUMENT = DIVISION___GET_DOCUMENT;

	/**
	 * The number of operations of the '<em>Subsection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_OPERATION_COUNT = DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.SubsubsectionImpl <em>Subsubsection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.SubsubsectionImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSubsubsection()
	 * @generated
	 */
	int SUBSUBSECTION = 38;

	/**
	 * The feature id for the '<em><b>Divisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__DIVISIONS = DIVISION__DIVISIONS;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__CONTENTS = DIVISION__CONTENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__LEVEL = DIVISION__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__SEQUENCE_NUMBER = DIVISION__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__NAME = DIVISION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__ID = DIVISION__ID;

	/**
	 * The feature id for the '<em><b>Start Numbering At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__START_NUMBERING_AT = DIVISION__START_NUMBERING_AT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__TITLE = DIVISION__TITLE;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__INCLUDE = DIVISION__INCLUDE;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION__LOGICAL_CONTAINER = DIVISION__LOGICAL_CONTAINER;

	/**
	 * The number of structural features of the '<em>Subsubsection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION_FEATURE_COUNT = DIVISION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION___GET_ID = DIVISION___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION___PARENT = DIVISION___PARENT;

	/**
	 * The operation id for the '<em>Get Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION___GET_DOCUMENT = DIVISION___GET_DOCUMENT;

	/**
	 * The number of operations of the '<em>Subsubsection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSUBSECTION_OPERATION_COUNT = DIVISION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ContentBlockImpl <em>Content Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ContentBlockImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getContentBlock()
	 * @generated
	 */
	int CONTENT_BLOCK = 39;

	/**
	 * The number of structural features of the '<em>Content Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Content Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.AdmonitionImpl <em>Admonition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.AdmonitionImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAdmonition()
	 * @generated
	 */
	int ADMONITION = 40;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMONITION__CONTENTS = CONTENT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMONITION__NAME = CONTENT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMONITION__ID = CONTENT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMONITION__KIND = CONTENT_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMONITION__TITLE = CONTENT_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Admonition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMONITION_FEATURE_COUNT = CONTENT_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Admonition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMONITION_OPERATION_COUNT = CONTENT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ListImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getList()
	 * @generated
	 */
	int LIST = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = CONTENT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = CONTENT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__STYLE = CONTENT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Numbering Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NUMBERING_STYLE = CONTENT_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LEVEL = CONTENT_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEMS = CONTENT_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = CONTENT_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = CONTENT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ListItemImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 42;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__CONTENTS = BLOCK_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__LEVEL = BLOCK_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__SEQUENCE_NUMBER = BLOCK_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__NAME = BLOCK_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ID = BLOCK_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__TITLE = BLOCK_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__LIST = BLOCK_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = BLOCK_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM___GET_LEVEL = BLOCK_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Sequence Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM___GET_SEQUENCE_NUMBER = BLOCK_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = BLOCK_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl <em>Titled Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.TitledBlockImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTitledBlock()
	 * @generated
	 */
	int TITLED_BLOCK = 43;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK__LEVEL = CONTENT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK__SEQUENCE_NUMBER = CONTENT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK__LOGICAL_CONTAINER = CONTENT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER = CONTENT_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK__NAME = CONTENT_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK__ID = CONTENT_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK__TITLE = CONTENT_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Titled Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK_FEATURE_COUNT = CONTENT_BLOCK_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK___GET_ID = CONTENT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK___PARENT = CONTENT_BLOCK_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Titled Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_BLOCK_OPERATION_COUNT = CONTENT_BLOCK_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.TitledTableImpl <em>Titled Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.TitledTableImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTitledTable()
	 * @generated
	 */
	int TITLED_TABLE = 44;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE__LEVEL = TITLED_BLOCK__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE__SEQUENCE_NUMBER = TITLED_BLOCK__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE__LOGICAL_CONTAINER = TITLED_BLOCK__LOGICAL_CONTAINER;

	/**
	 * The feature id for the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE__SEQUENCE_NUMBER_IN_CHAPTER = TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE__NAME = TITLED_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE__ID = TITLED_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE__TITLE = TITLED_BLOCK__TITLE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE__TABLE = TITLED_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Titled Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE_FEATURE_COUNT = TITLED_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE___GET_ID = TITLED_BLOCK___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE___PARENT = TITLED_BLOCK___PARENT;

	/**
	 * The number of operations of the '<em>Titled Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_TABLE_OPERATION_COUNT = TITLED_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.AbstractTableImpl <em>Abstract Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.AbstractTableImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbstractTable()
	 * @generated
	 */
	int ABSTRACT_TABLE = 45;

	/**
	 * The feature id for the '<em><b>Width Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE__WIDTH_PERCENT = 0;

	/**
	 * The number of structural features of the '<em>Abstract Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.TableImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 46;

	/**
	 * The feature id for the '<em><b>Width Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__WIDTH_PERCENT = ABSTRACT_TABLE__WIDTH_PERCENT;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = ABSTRACT_TABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = ABSTRACT_TABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gridlines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__GRIDLINES = ABSTRACT_TABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ABSTRACT_TABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ABSTRACT_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.TableRowImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 47;

	/**
	 * The feature id for the '<em><b>Is Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__IS_HEADING = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CELLS = 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__TABLE = 2;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.TableCellImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 48;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CONTENTS = BLOCK_CONTAINER__CONTENTS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__WIDTH = BLOCK_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__HEIGHT = BLOCK_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ROW = BLOCK_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = BLOCK_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = BLOCK_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ProvidedTableImpl <em>Provided Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ProvidedTableImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getProvidedTable()
	 * @generated
	 */
	int PROVIDED_TABLE = 49;

	/**
	 * The feature id for the '<em><b>Width Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE__WIDTH_PERCENT = ABSTRACT_TABLE__WIDTH_PERCENT;

	/**
	 * The feature id for the '<em><b>Diagram Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE__DIAGRAM_ROOT = ABSTRACT_TABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE__TABLE_TYPE = ABSTRACT_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provided Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE_FEATURE_COUNT = ABSTRACT_TABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provided Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE_OPERATION_COUNT = ABSTRACT_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ProvidedTableTypeImpl <em>Provided Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ProvidedTableTypeImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getProvidedTableType()
	 * @generated
	 */
	int PROVIDED_TABLE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE_TYPE__TABLE_TYPE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Provided Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Provided Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.TitledFigureImpl <em>Titled Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.TitledFigureImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTitledFigure()
	 * @generated
	 */
	int TITLED_FIGURE = 51;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE__LEVEL = TITLED_BLOCK__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE__SEQUENCE_NUMBER = TITLED_BLOCK__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE__LOGICAL_CONTAINER = TITLED_BLOCK__LOGICAL_CONTAINER;

	/**
	 * The feature id for the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE__SEQUENCE_NUMBER_IN_CHAPTER = TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE__NAME = TITLED_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE__ID = TITLED_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE__TITLE = TITLED_BLOCK__TITLE;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE__FIGURE = TITLED_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Titled Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE_FEATURE_COUNT = TITLED_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE___GET_ID = TITLED_BLOCK___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE___PARENT = TITLED_BLOCK___PARENT;

	/**
	 * The number of operations of the '<em>Titled Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_FIGURE_OPERATION_COUNT = TITLED_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.AbstractFigureImpl <em>Abstract Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.AbstractFigureImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbstractFigure()
	 * @generated
	 */
	int ABSTRACT_FIGURE = 52;

	/**
	 * The feature id for the '<em><b>Width Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE__WIDTH_PERCENT = 0;

	/**
	 * The number of structural features of the '<em>Abstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FIGURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.IncludedFigureImpl <em>Included Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.IncludedFigureImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getIncludedFigure()
	 * @generated
	 */
	int INCLUDED_FIGURE = 53;

	/**
	 * The feature id for the '<em><b>Width Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FIGURE__WIDTH_PERCENT = ABSTRACT_FIGURE__WIDTH_PERCENT;

	/**
	 * The feature id for the '<em><b>File Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FIGURE__FILE_URI = ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Included Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FIGURE_FEATURE_COUNT = ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Included Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_FIGURE_OPERATION_COUNT = ABSTRACT_FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ProvidedFigureImpl <em>Provided Figure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ProvidedFigureImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getProvidedFigure()
	 * @generated
	 */
	int PROVIDED_FIGURE = 54;

	/**
	 * The feature id for the '<em><b>Width Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FIGURE__WIDTH_PERCENT = ABSTRACT_FIGURE__WIDTH_PERCENT;

	/**
	 * The feature id for the '<em><b>Diagram Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FIGURE__DIAGRAM_ROOT = ABSTRACT_FIGURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FIGURE__DIAGRAM_TYPE = ABSTRACT_FIGURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefer Raster Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FIGURE__PREFER_RASTER_DIAGRAM = ABSTRACT_FIGURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Provided Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FIGURE_FEATURE_COUNT = ABSTRACT_FIGURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Provided Figure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FIGURE_OPERATION_COUNT = ABSTRACT_FIGURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ProvidedDiagramTypeImpl <em>Provided Diagram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ProvidedDiagramTypeImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getProvidedDiagramType()
	 * @generated
	 */
	int PROVIDED_DIAGRAM_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DIAGRAM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Diagram Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DIAGRAM_TYPE__DIAGRAM_TYPE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Provided Diagram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DIAGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Provided Diagram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_DIAGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.EquationImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 56;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__LEVEL = TITLED_BLOCK__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__SEQUENCE_NUMBER = TITLED_BLOCK__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__LOGICAL_CONTAINER = TITLED_BLOCK__LOGICAL_CONTAINER;

	/**
	 * The feature id for the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__SEQUENCE_NUMBER_IN_CHAPTER = TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__NAME = TITLED_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__ID = TITLED_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__TITLE = TITLED_BLOCK__TITLE;

	/**
	 * The feature id for the '<em><b>File Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__FILE_URI = TITLED_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = TITLED_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION___GET_ID = TITLED_BLOCK___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION___PARENT = TITLED_BLOCK___PARENT;

	/**
	 * The number of operations of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_OPERATION_COUNT = TITLED_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.TitledCodeListingImpl <em>Titled Code Listing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.TitledCodeListingImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTitledCodeListing()
	 * @generated
	 */
	int TITLED_CODE_LISTING = 57;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__LEVEL = TITLED_BLOCK__LEVEL;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__SEQUENCE_NUMBER = TITLED_BLOCK__SEQUENCE_NUMBER;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__LOGICAL_CONTAINER = TITLED_BLOCK__LOGICAL_CONTAINER;

	/**
	 * The feature id for the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__SEQUENCE_NUMBER_IN_CHAPTER = TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__NAME = TITLED_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__ID = TITLED_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__TITLE = TITLED_BLOCK__TITLE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__FORMAT = TITLED_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Lines</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__CODE_LINES = TITLED_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING__INCLUDE = TITLED_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Titled Code Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING_FEATURE_COUNT = TITLED_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING___GET_ID = TITLED_BLOCK___GET_ID;

	/**
	 * The operation id for the '<em>Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING___PARENT = TITLED_BLOCK___PARENT;

	/**
	 * The number of operations of the '<em>Titled Code Listing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_CODE_LISTING_OPERATION_COUNT = TITLED_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.ParagraphImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 58;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = CONTENT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = CONTENT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.RichTextParagraphImpl <em>Rich Text Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.RichTextParagraphImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getRichTextParagraph()
	 * @generated
	 */
	int RICH_TEXT_PARAGRAPH = 59;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_PARAGRAPH__STYLE = PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_PARAGRAPH__TEXT = PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rich Text Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_PARAGRAPH_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rich Text Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_PARAGRAPH_OPERATION_COUNT = PARAGRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.RichTextReferencingParagraphImpl <em>Rich Text Referencing Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.RichTextReferencingParagraphImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getRichTextReferencingParagraph()
	 * @generated
	 */
	int RICH_TEXT_REFERENCING_PARAGRAPH = 60;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_REFERENCING_PARAGRAPH__TEXT = CONTENT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich Text Referencing Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_REFERENCING_PARAGRAPH_FEATURE_COUNT = CONTENT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rich Text Referencing Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_REFERENCING_PARAGRAPH_OPERATION_COUNT = CONTENT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.UnformattedParagraphImpl <em>Unformatted Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.UnformattedParagraphImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getUnformattedParagraph()
	 * @generated
	 */
	int UNFORMATTED_PARAGRAPH = 61;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNFORMATTED_PARAGRAPH__TEXT = PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unformatted Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNFORMATTED_PARAGRAPH_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unformatted Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNFORMATTED_PARAGRAPH_OPERATION_COUNT = PARAGRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl <em>Footnote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.impl.FootnoteImpl
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getFootnote()
	 * @generated
	 */
	int FOOTNOTE = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__NAME = CONTENT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__ID = CONTENT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__LEVEL = CONTENT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__SEQUENCE_NUMBER = CONTENT_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__LOGICAL_CONTAINER = CONTENT_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__SEQUENCE_NUMBER_IN_CHAPTER = CONTENT_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__TEXT = CONTENT_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Footnote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_FEATURE_COUNT = CONTENT_BLOCK_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Footnote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_OPERATION_COUNT = CONTENT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.PublicationNature <em>Publication Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.PublicationNature
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPublicationNature()
	 * @generated
	 */
	int PUBLICATION_NATURE = 63;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.ReferenceScope <em>Reference Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.ReferenceScope
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getReferenceScope()
	 * @generated
	 */
	int REFERENCE_SCOPE = 64;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.AdmonitionKind <em>Admonition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.AdmonitionKind
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAdmonitionKind()
	 * @generated
	 */
	int ADMONITION_KIND = 65;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.ListStyle <em>List Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.ListStyle
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getListStyle()
	 * @generated
	 */
	int LIST_STYLE = 66;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.GridLines <em>Grid Lines</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.GridLines
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getGridLines()
	 * @generated
	 */
	int GRID_LINES = 67;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.CodeLanguage <em>Code Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.CodeLanguage
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getCodeLanguage()
	 * @generated
	 */
	int CODE_LANGUAGE = 68;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.pub.pub.ParagraphStyle <em>Paragraph Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.pub.pub.ParagraphStyle
	 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getParagraphStyle()
	 * @generated
	 */
	int PARAGRAPH_STYLE = 69;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.PubModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.mimacom.ddd.pub.pub.PubModel
	 * @generated
	 */
	EClass getPubModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.PubModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.mimacom.ddd.pub.pub.PubModel#getImports()
	 * @see #getPubModel()
	 * @generated
	 */
	EReference getPubModel_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.PubModel#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see com.mimacom.ddd.pub.pub.PubModel#getDocument()
	 * @see #getPubModel()
	 * @generated
	 */
	EReference getPubModel_Document();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.PubModel#getProvidedDiagramTypes <em>Provided Diagram Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Diagram Types</em>'.
	 * @see com.mimacom.ddd.pub.pub.PubModel#getProvidedDiagramTypes()
	 * @see #getPubModel()
	 * @generated
	 */
	EReference getPubModel_ProvidedDiagramTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.PubModel#getProvidedTableTypes <em>Provided Table Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Table Types</em>'.
	 * @see com.mimacom.ddd.pub.pub.PubModel#getProvidedTableTypes()
	 * @see #getPubModel()
	 * @generated
	 */
	EReference getPubModel_ProvidedTableTypes();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Document#isGenerateHtml <em>Generate Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Html</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document#isGenerateHtml()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_GenerateHtml();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Document#isGenerateLaTeX <em>Generate La Te X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate La Te X</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document#isGenerateLaTeX()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_GenerateLaTeX();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Document#isGenerateMarkdown <em>Generate Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Markdown</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document#isGenerateMarkdown()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_GenerateMarkdown();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Document#isGenerateAsciiDoc <em>Generate Ascii Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Ascii Doc</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document#isGenerateAsciiDoc()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_GenerateAsciiDoc();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Document#isPreferRasterDiagrams <em>Prefer Raster Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefer Raster Diagrams</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document#isPreferRasterDiagrams()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_PreferRasterDiagrams();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.Document#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbols</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document#getSymbols()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Symbols();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.Document#getPublicationClass <em>Publication Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publication Class</em>'.
	 * @see com.mimacom.ddd.pub.pub.Document#getPublicationClass()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_PublicationClass();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.Document#getSymbol(java.lang.String) <em>Get Symbol</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Symbol</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.Document#getSymbol(java.lang.String)
	 * @generated
	 */
	EOperation getDocument__GetSymbol__String();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see com.mimacom.ddd.pub.pub.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.Symbol#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.mimacom.ddd.pub.pub.Symbol#getValue()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Publication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication</em>'.
	 * @see com.mimacom.ddd.pub.pub.Publication
	 * @generated
	 */
	EClass getPublication();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.pub.pub.Publication#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see com.mimacom.ddd.pub.pub.Publication#getIncludes()
	 * @see #getPublication()
	 * @generated
	 */
	EReference getPublication_Includes();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see com.mimacom.ddd.pub.pub.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.Component#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see com.mimacom.ddd.pub.pub.Component#getSegments()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Segments();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ReferenceTarget <em>Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Target</em>'.
	 * @see com.mimacom.ddd.pub.pub.ReferenceTarget
	 * @generated
	 */
	EClass getReferenceTarget();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ReferenceTarget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.pub.ReferenceTarget#getName()
	 * @see #getReferenceTarget()
	 * @generated
	 */
	EAttribute getReferenceTarget_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ReferenceTarget#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.mimacom.ddd.pub.pub.ReferenceTarget#getId()
	 * @see #getReferenceTarget()
	 * @generated
	 */
	EAttribute getReferenceTarget_Id();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see com.mimacom.ddd.pub.pub.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Reference#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see com.mimacom.ddd.pub.pub.Reference#getScope()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Scope();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.mimacom.ddd.pub.pub.Reference#getTarget()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Target();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Reference#isPageReference <em>Page Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Reference</em>'.
	 * @see com.mimacom.ddd.pub.pub.Reference#isPageReference()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_PageReference();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.DocumentSegment <em>Document Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Segment</em>'.
	 * @see com.mimacom.ddd.pub.pub.DocumentSegment
	 * @generated
	 */
	EClass getDocumentSegment();

	/**
	 * Returns the meta object for the container reference '{@link com.mimacom.ddd.pub.pub.DocumentSegment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see com.mimacom.ddd.pub.pub.DocumentSegment#getParent()
	 * @see #getDocumentSegment()
	 * @generated
	 */
	EReference getDocumentSegment_Parent();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.DocumentSegment#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.DocumentSegment#getName()
	 * @generated
	 */
	EOperation getDocumentSegment__GetName();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.DocumentSegment#setName(java.lang.String) <em>Set Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Name</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.DocumentSegment#setName(java.lang.String)
	 * @generated
	 */
	EOperation getDocumentSegment__SetName__String();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.BlockContainer <em>Block Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Container</em>'.
	 * @see com.mimacom.ddd.pub.pub.BlockContainer
	 * @generated
	 */
	EClass getBlockContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.BlockContainer#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see com.mimacom.ddd.pub.pub.BlockContainer#getContents()
	 * @see #getBlockContainer()
	 * @generated
	 */
	EReference getBlockContainer_Contents();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.SegmentWithText <em>Segment With Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment With Text</em>'.
	 * @see com.mimacom.ddd.pub.pub.SegmentWithText
	 * @generated
	 */
	EClass getSegmentWithText();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Abstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract</em>'.
	 * @see com.mimacom.ddd.pub.pub.Abstract
	 * @generated
	 */
	EClass getAbstract();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Preface <em>Preface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preface</em>'.
	 * @see com.mimacom.ddd.pub.pub.Preface
	 * @generated
	 */
	EClass getPreface();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Epilogue <em>Epilogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epilogue</em>'.
	 * @see com.mimacom.ddd.pub.pub.Epilogue
	 * @generated
	 */
	EClass getEpilogue();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.SegmentWithTable <em>Segment With Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment With Table</em>'.
	 * @see com.mimacom.ddd.pub.pub.SegmentWithTable
	 * @generated
	 */
	EClass getSegmentWithTable();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ChangeHistory <em>Change History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change History</em>'.
	 * @see com.mimacom.ddd.pub.pub.ChangeHistory
	 * @generated
	 */
	EClass getChangeHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.ChangeHistory#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see com.mimacom.ddd.pub.pub.ChangeHistory#getEntries()
	 * @see #getChangeHistory()
	 * @generated
	 */
	EReference getChangeHistory_Entries();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ChangeDescription <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Description</em>'.
	 * @see com.mimacom.ddd.pub.pub.ChangeDescription
	 * @generated
	 */
	EClass getChangeDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ChangeDescription#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.mimacom.ddd.pub.pub.ChangeDescription#getVersion()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ChangeDescription#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.mimacom.ddd.pub.pub.ChangeDescription#getDate()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ChangeDescription#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see com.mimacom.ddd.pub.pub.ChangeDescription#getAuthor()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_Author();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ChangeDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.mimacom.ddd.pub.pub.ChangeDescription#getDescription()
	 * @see #getChangeDescription()
	 * @generated
	 */
	EAttribute getChangeDescription_Description();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.TOC <em>TOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOC</em>'.
	 * @see com.mimacom.ddd.pub.pub.TOC
	 * @generated
	 */
	EClass getTOC();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Abbreviations <em>Abbreviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbreviations</em>'.
	 * @see com.mimacom.ddd.pub.pub.Abbreviations
	 * @generated
	 */
	EClass getAbbreviations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.Abbreviations#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see com.mimacom.ddd.pub.pub.Abbreviations#getEntries()
	 * @see #getAbbreviations()
	 * @generated
	 */
	EReference getAbbreviations_Entries();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Abbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbreviation</em>'.
	 * @see com.mimacom.ddd.pub.pub.Abbreviation
	 * @generated
	 */
	EClass getAbbreviation();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Abbreviation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.pub.Abbreviation#getName()
	 * @see #getAbbreviation()
	 * @generated
	 */
	EAttribute getAbbreviation_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Abbreviation#getLongForm <em>Long Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Form</em>'.
	 * @see com.mimacom.ddd.pub.pub.Abbreviation#getLongForm()
	 * @see #getAbbreviation()
	 * @generated
	 */
	EAttribute getAbbreviation_LongForm();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ListOfTables <em>List Of Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Tables</em>'.
	 * @see com.mimacom.ddd.pub.pub.ListOfTables
	 * @generated
	 */
	EClass getListOfTables();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ListOfFigures <em>List Of Figures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Figures</em>'.
	 * @see com.mimacom.ddd.pub.pub.ListOfFigures
	 * @generated
	 */
	EClass getListOfFigures();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Bibliography <em>Bibliography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliography</em>'.
	 * @see com.mimacom.ddd.pub.pub.Bibliography
	 * @generated
	 */
	EClass getBibliography();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.Bibliography#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see com.mimacom.ddd.pub.pub.Bibliography#getEntries()
	 * @see #getBibliography()
	 * @generated
	 */
	EReference getBibliography_Entries();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.BibliographyEntry <em>Bibliography Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliography Entry</em>'.
	 * @see com.mimacom.ddd.pub.pub.BibliographyEntry
	 * @generated
	 */
	EClass getBibliographyEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.pub.BibliographyEntry#getName()
	 * @see #getBibliographyEntry()
	 * @generated
	 */
	EAttribute getBibliographyEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authors</em>'.
	 * @see com.mimacom.ddd.pub.pub.BibliographyEntry#getAuthors()
	 * @see #getBibliographyEntry()
	 * @generated
	 */
	EAttribute getBibliographyEntry_Authors();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.mimacom.ddd.pub.pub.BibliographyEntry#getTitle()
	 * @see #getBibliographyEntry()
	 * @generated
	 */
	EAttribute getBibliographyEntry_Title();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see com.mimacom.ddd.pub.pub.BibliographyEntry#getPublisher()
	 * @see #getBibliographyEntry()
	 * @generated
	 */
	EAttribute getBibliographyEntry_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.mimacom.ddd.pub.pub.BibliographyEntry#getDate()
	 * @see #getBibliographyEntry()
	 * @generated
	 */
	EAttribute getBibliographyEntry_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.mimacom.ddd.pub.pub.BibliographyEntry#getComment()
	 * @see #getBibliographyEntry()
	 * @generated
	 */
	EAttribute getBibliographyEntry_Comment();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see com.mimacom.ddd.pub.pub.Glossary
	 * @generated
	 */
	EClass getGlossary();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.Glossary#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see com.mimacom.ddd.pub.pub.Glossary#getEntries()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Entries();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.GlossaryEntry <em>Glossary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary Entry</em>'.
	 * @see com.mimacom.ddd.pub.pub.GlossaryEntry
	 * @generated
	 */
	EClass getGlossaryEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.GlossaryEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.pub.GlossaryEntry#getName()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EAttribute getGlossaryEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.GlossaryEntry#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.mimacom.ddd.pub.pub.GlossaryEntry#getText()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EAttribute getGlossaryEntry_Text();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.GlossaryEntry#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.mimacom.ddd.pub.pub.GlossaryEntry#getComment()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EAttribute getGlossaryEntry_Comment();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see com.mimacom.ddd.pub.pub.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.Index#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see com.mimacom.ddd.pub.pub.Index#getEntries()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Entries();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.IndexEntry <em>Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Entry</em>'.
	 * @see com.mimacom.ddd.pub.pub.IndexEntry
	 * @generated
	 */
	EClass getIndexEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.IndexEntry#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.mimacom.ddd.pub.pub.IndexEntry#getText()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EAttribute getIndexEntry_Text();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.pub.pub.IndexEntry#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see com.mimacom.ddd.pub.pub.IndexEntry#getReferences()
	 * @see #getIndexEntry()
	 * @generated
	 */
	EReference getIndexEntry_References();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.SegmentInclude <em>Segment Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment Include</em>'.
	 * @see com.mimacom.ddd.pub.pub.SegmentInclude
	 * @generated
	 */
	EClass getSegmentInclude();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.SegmentInclude#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Include</em>'.
	 * @see com.mimacom.ddd.pub.pub.SegmentInclude#getInclude()
	 * @see #getSegmentInclude()
	 * @generated
	 */
	EReference getSegmentInclude_Include();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.PublicationBody <em>Publication Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication Body</em>'.
	 * @see com.mimacom.ddd.pub.pub.PublicationBody
	 * @generated
	 */
	EClass getPublicationBody();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Numbered <em>Numbered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numbered</em>'.
	 * @see com.mimacom.ddd.pub.pub.Numbered
	 * @generated
	 */
	EClass getNumbered();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Numbered#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see com.mimacom.ddd.pub.pub.Numbered#getLevel()
	 * @see #getNumbered()
	 * @generated
	 */
	EAttribute getNumbered_Level();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Numbered#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see com.mimacom.ddd.pub.pub.Numbered#getSequenceNumber()
	 * @see #getNumbered()
	 * @generated
	 */
	EAttribute getNumbered_SequenceNumber();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.NumberedByChapter <em>Numbered By Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numbered By Chapter</em>'.
	 * @see com.mimacom.ddd.pub.pub.NumberedByChapter
	 * @generated
	 */
	EClass getNumberedByChapter();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.NumberedByChapter#getLogicalContainer <em>Logical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Container</em>'.
	 * @see com.mimacom.ddd.pub.pub.NumberedByChapter#getLogicalContainer()
	 * @see #getNumberedByChapter()
	 * @generated
	 */
	EReference getNumberedByChapter_LogicalContainer();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.NumberedByChapter#getSequenceNumberInChapter <em>Sequence Number In Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number In Chapter</em>'.
	 * @see com.mimacom.ddd.pub.pub.NumberedByChapter#getSequenceNumberInChapter()
	 * @see #getNumberedByChapter()
	 * @generated
	 */
	EAttribute getNumberedByChapter_SequenceNumberInChapter();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.DivisionContainer <em>Division Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division Container</em>'.
	 * @see com.mimacom.ddd.pub.pub.DivisionContainer
	 * @generated
	 */
	EClass getDivisionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.DivisionContainer#getDivisions <em>Divisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divisions</em>'.
	 * @see com.mimacom.ddd.pub.pub.DivisionContainer#getDivisions()
	 * @see #getDivisionContainer()
	 * @generated
	 */
	EReference getDivisionContainer_Divisions();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see com.mimacom.ddd.pub.pub.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Division#getStartNumberingAt <em>Start Numbering At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Numbering At</em>'.
	 * @see com.mimacom.ddd.pub.pub.Division#getStartNumberingAt()
	 * @see #getDivision()
	 * @generated
	 */
	EAttribute getDivision_StartNumberingAt();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.Division#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see com.mimacom.ddd.pub.pub.Division#getTitle()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Title();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.Division#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Include</em>'.
	 * @see com.mimacom.ddd.pub.pub.Division#getInclude()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_Include();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.Division#getLogicalContainer <em>Logical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Container</em>'.
	 * @see com.mimacom.ddd.pub.pub.Division#getLogicalContainer()
	 * @see #getDivision()
	 * @generated
	 */
	EReference getDivision_LogicalContainer();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.Division#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.Division#getId()
	 * @generated
	 */
	EOperation getDivision__GetId();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.Division#parent() <em>Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parent</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.Division#parent()
	 * @generated
	 */
	EOperation getDivision__Parent();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.Division#getDocument() <em>Get Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Document</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.Division#getDocument()
	 * @generated
	 */
	EOperation getDivision__GetDocument();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see com.mimacom.ddd.pub.pub.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Appendix <em>Appendix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appendix</em>'.
	 * @see com.mimacom.ddd.pub.pub.Appendix
	 * @generated
	 */
	EClass getAppendix();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Chapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter</em>'.
	 * @see com.mimacom.ddd.pub.pub.Chapter
	 * @generated
	 */
	EClass getChapter();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see com.mimacom.ddd.pub.pub.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Subsection <em>Subsection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsection</em>'.
	 * @see com.mimacom.ddd.pub.pub.Subsection
	 * @generated
	 */
	EClass getSubsection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Subsubsection <em>Subsubsection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsubsection</em>'.
	 * @see com.mimacom.ddd.pub.pub.Subsubsection
	 * @generated
	 */
	EClass getSubsubsection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ContentBlock <em>Content Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Block</em>'.
	 * @see com.mimacom.ddd.pub.pub.ContentBlock
	 * @generated
	 */
	EClass getContentBlock();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Admonition <em>Admonition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admonition</em>'.
	 * @see com.mimacom.ddd.pub.pub.Admonition
	 * @generated
	 */
	EClass getAdmonition();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Admonition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.mimacom.ddd.pub.pub.Admonition#getKind()
	 * @see #getAdmonition()
	 * @generated
	 */
	EAttribute getAdmonition_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.Admonition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see com.mimacom.ddd.pub.pub.Admonition#getTitle()
	 * @see #getAdmonition()
	 * @generated
	 */
	EReference getAdmonition_Title();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see com.mimacom.ddd.pub.pub.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.List#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see com.mimacom.ddd.pub.pub.List#getStyle()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Style();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.List#getNumberingStyle <em>Numbering Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbering Style</em>'.
	 * @see com.mimacom.ddd.pub.pub.List#getNumberingStyle()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_NumberingStyle();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.List#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see com.mimacom.ddd.pub.pub.List#getLevel()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.List#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see com.mimacom.ddd.pub.pub.List#getItems()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Items();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see com.mimacom.ddd.pub.pub.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.ListItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see com.mimacom.ddd.pub.pub.ListItem#getTitle()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_Title();

	/**
	 * Returns the meta object for the container reference '{@link com.mimacom.ddd.pub.pub.ListItem#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>List</em>'.
	 * @see com.mimacom.ddd.pub.pub.ListItem#getList()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_List();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.ListItem#getLevel() <em>Get Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Level</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.ListItem#getLevel()
	 * @generated
	 */
	EOperation getListItem__GetLevel();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.ListItem#getSequenceNumber() <em>Get Sequence Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sequence Number</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.ListItem#getSequenceNumber()
	 * @generated
	 */
	EOperation getListItem__GetSequenceNumber();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.TitledBlock <em>Titled Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titled Block</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledBlock
	 * @generated
	 */
	EClass getTitledBlock();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.TitledBlock#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledBlock#getTitle()
	 * @see #getTitledBlock()
	 * @generated
	 */
	EReference getTitledBlock_Title();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.TitledBlock#getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Id</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.TitledBlock#getId()
	 * @generated
	 */
	EOperation getTitledBlock__GetId();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.pub.pub.TitledBlock#parent() <em>Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parent</em>' operation.
	 * @see com.mimacom.ddd.pub.pub.TitledBlock#parent()
	 * @generated
	 */
	EOperation getTitledBlock__Parent();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.TitledTable <em>Titled Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titled Table</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledTable
	 * @generated
	 */
	EClass getTitledTable();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.TitledTable#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledTable#getTable()
	 * @see #getTitledTable()
	 * @generated
	 */
	EReference getTitledTable_Table();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.AbstractTable <em>Abstract Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Table</em>'.
	 * @see com.mimacom.ddd.pub.pub.AbstractTable
	 * @generated
	 */
	EClass getAbstractTable();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.AbstractTable#getWidthPercent <em>Width Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Percent</em>'.
	 * @see com.mimacom.ddd.pub.pub.AbstractTable#getWidthPercent()
	 * @see #getAbstractTable()
	 * @generated
	 */
	EAttribute getAbstractTable_WidthPercent();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see com.mimacom.ddd.pub.pub.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see com.mimacom.ddd.pub.pub.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see com.mimacom.ddd.pub.pub.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Table#getGridlines <em>Gridlines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gridlines</em>'.
	 * @see com.mimacom.ddd.pub.pub.Table#getGridlines()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Gridlines();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see com.mimacom.ddd.pub.pub.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.TableRow#isIsHeading <em>Is Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Heading</em>'.
	 * @see com.mimacom.ddd.pub.pub.TableRow#isIsHeading()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_IsHeading();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.pub.pub.TableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see com.mimacom.ddd.pub.pub.TableRow#getCells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Cells();

	/**
	 * Returns the meta object for the container reference '{@link com.mimacom.ddd.pub.pub.TableRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see com.mimacom.ddd.pub.pub.TableRow#getTable()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Table();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see com.mimacom.ddd.pub.pub.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.TableCell#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.mimacom.ddd.pub.pub.TableCell#getWidth()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.TableCell#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.mimacom.ddd.pub.pub.TableCell#getHeight()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Height();

	/**
	 * Returns the meta object for the container reference '{@link com.mimacom.ddd.pub.pub.TableCell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Row</em>'.
	 * @see com.mimacom.ddd.pub.pub.TableCell#getRow()
	 * @see #getTableCell()
	 * @generated
	 */
	EReference getTableCell_Row();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ProvidedTable <em>Provided Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Table</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedTable
	 * @generated
	 */
	EClass getProvidedTable();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.ProvidedTable#getDiagramRoot <em>Diagram Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Root</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedTable#getDiagramRoot()
	 * @see #getProvidedTable()
	 * @generated
	 */
	EReference getProvidedTable_DiagramRoot();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.ProvidedTable#getTableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Type</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedTable#getTableType()
	 * @see #getProvidedTable()
	 * @generated
	 */
	EReference getProvidedTable_TableType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ProvidedTableType <em>Provided Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Table Type</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedTableType
	 * @generated
	 */
	EClass getProvidedTableType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ProvidedTableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedTableType#getName()
	 * @see #getProvidedTableType()
	 * @generated
	 */
	EAttribute getProvidedTableType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ProvidedTableType#getTableTypeName <em>Table Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Type Name</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedTableType#getTableTypeName()
	 * @see #getProvidedTableType()
	 * @generated
	 */
	EAttribute getProvidedTableType_TableTypeName();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.TitledFigure <em>Titled Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titled Figure</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledFigure
	 * @generated
	 */
	EClass getTitledFigure();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.TitledFigure#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Figure</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledFigure#getFigure()
	 * @see #getTitledFigure()
	 * @generated
	 */
	EReference getTitledFigure_Figure();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.AbstractFigure <em>Abstract Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Figure</em>'.
	 * @see com.mimacom.ddd.pub.pub.AbstractFigure
	 * @generated
	 */
	EClass getAbstractFigure();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.AbstractFigure#getWidthPercent <em>Width Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Percent</em>'.
	 * @see com.mimacom.ddd.pub.pub.AbstractFigure#getWidthPercent()
	 * @see #getAbstractFigure()
	 * @generated
	 */
	EAttribute getAbstractFigure_WidthPercent();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.IncludedFigure <em>Included Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Figure</em>'.
	 * @see com.mimacom.ddd.pub.pub.IncludedFigure
	 * @generated
	 */
	EClass getIncludedFigure();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.IncludedFigure#getFileUri <em>File Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Uri</em>'.
	 * @see com.mimacom.ddd.pub.pub.IncludedFigure#getFileUri()
	 * @see #getIncludedFigure()
	 * @generated
	 */
	EAttribute getIncludedFigure_FileUri();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ProvidedFigure <em>Provided Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Figure</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedFigure
	 * @generated
	 */
	EClass getProvidedFigure();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.ProvidedFigure#getDiagramRoot <em>Diagram Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Root</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedFigure#getDiagramRoot()
	 * @see #getProvidedFigure()
	 * @generated
	 */
	EReference getProvidedFigure_DiagramRoot();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.ProvidedFigure#getDiagramType <em>Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Type</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedFigure#getDiagramType()
	 * @see #getProvidedFigure()
	 * @generated
	 */
	EReference getProvidedFigure_DiagramType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ProvidedFigure#isPreferRasterDiagram <em>Prefer Raster Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefer Raster Diagram</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedFigure#isPreferRasterDiagram()
	 * @see #getProvidedFigure()
	 * @generated
	 */
	EAttribute getProvidedFigure_PreferRasterDiagram();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.ProvidedDiagramType <em>Provided Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Diagram Type</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedDiagramType
	 * @generated
	 */
	EClass getProvidedDiagramType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ProvidedDiagramType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedDiagramType#getName()
	 * @see #getProvidedDiagramType()
	 * @generated
	 */
	EAttribute getProvidedDiagramType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.ProvidedDiagramType#getDiagramTypeName <em>Diagram Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagram Type Name</em>'.
	 * @see com.mimacom.ddd.pub.pub.ProvidedDiagramType#getDiagramTypeName()
	 * @see #getProvidedDiagramType()
	 * @generated
	 */
	EAttribute getProvidedDiagramType_DiagramTypeName();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see com.mimacom.ddd.pub.pub.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.Equation#getFileUri <em>File Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Uri</em>'.
	 * @see com.mimacom.ddd.pub.pub.Equation#getFileUri()
	 * @see #getEquation()
	 * @generated
	 */
	EAttribute getEquation_FileUri();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.TitledCodeListing <em>Titled Code Listing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titled Code Listing</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledCodeListing
	 * @generated
	 */
	EClass getTitledCodeListing();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.TitledCodeListing#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledCodeListing#getFormat()
	 * @see #getTitledCodeListing()
	 * @generated
	 */
	EAttribute getTitledCodeListing_Format();

	/**
	 * Returns the meta object for the attribute list '{@link com.mimacom.ddd.pub.pub.TitledCodeListing#getCodeLines <em>Code Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Code Lines</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledCodeListing#getCodeLines()
	 * @see #getTitledCodeListing()
	 * @generated
	 */
	EAttribute getTitledCodeListing_CodeLines();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.TitledCodeListing#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Include</em>'.
	 * @see com.mimacom.ddd.pub.pub.TitledCodeListing#getInclude()
	 * @see #getTitledCodeListing()
	 * @generated
	 */
	EReference getTitledCodeListing_Include();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see com.mimacom.ddd.pub.pub.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.RichTextParagraph <em>Rich Text Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text Paragraph</em>'.
	 * @see com.mimacom.ddd.pub.pub.RichTextParagraph
	 * @generated
	 */
	EClass getRichTextParagraph();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.RichTextParagraph#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see com.mimacom.ddd.pub.pub.RichTextParagraph#getStyle()
	 * @see #getRichTextParagraph()
	 * @generated
	 */
	EAttribute getRichTextParagraph_Style();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.RichTextParagraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see com.mimacom.ddd.pub.pub.RichTextParagraph#getText()
	 * @see #getRichTextParagraph()
	 * @generated
	 */
	EReference getRichTextParagraph_Text();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.RichTextReferencingParagraph <em>Rich Text Referencing Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text Referencing Paragraph</em>'.
	 * @see com.mimacom.ddd.pub.pub.RichTextReferencingParagraph
	 * @generated
	 */
	EClass getRichTextReferencingParagraph();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.pub.pub.RichTextReferencingParagraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Text</em>'.
	 * @see com.mimacom.ddd.pub.pub.RichTextReferencingParagraph#getText()
	 * @see #getRichTextReferencingParagraph()
	 * @generated
	 */
	EReference getRichTextReferencingParagraph_Text();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.UnformattedParagraph <em>Unformatted Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unformatted Paragraph</em>'.
	 * @see com.mimacom.ddd.pub.pub.UnformattedParagraph
	 * @generated
	 */
	EClass getUnformattedParagraph();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.pub.pub.UnformattedParagraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.mimacom.ddd.pub.pub.UnformattedParagraph#getText()
	 * @see #getUnformattedParagraph()
	 * @generated
	 */
	EAttribute getUnformattedParagraph_Text();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.pub.pub.Footnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footnote</em>'.
	 * @see com.mimacom.ddd.pub.pub.Footnote
	 * @generated
	 */
	EClass getFootnote();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.pub.pub.Footnote#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see com.mimacom.ddd.pub.pub.Footnote#getText()
	 * @see #getFootnote()
	 * @generated
	 */
	EReference getFootnote_Text();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.pub.PublicationNature <em>Publication Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Publication Nature</em>'.
	 * @see com.mimacom.ddd.pub.pub.PublicationNature
	 * @generated
	 */
	EEnum getPublicationNature();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.pub.ReferenceScope <em>Reference Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Scope</em>'.
	 * @see com.mimacom.ddd.pub.pub.ReferenceScope
	 * @generated
	 */
	EEnum getReferenceScope();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.pub.AdmonitionKind <em>Admonition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Admonition Kind</em>'.
	 * @see com.mimacom.ddd.pub.pub.AdmonitionKind
	 * @generated
	 */
	EEnum getAdmonitionKind();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.pub.ListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Style</em>'.
	 * @see com.mimacom.ddd.pub.pub.ListStyle
	 * @generated
	 */
	EEnum getListStyle();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.pub.GridLines <em>Grid Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grid Lines</em>'.
	 * @see com.mimacom.ddd.pub.pub.GridLines
	 * @generated
	 */
	EEnum getGridLines();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.pub.CodeLanguage <em>Code Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Code Language</em>'.
	 * @see com.mimacom.ddd.pub.pub.CodeLanguage
	 * @generated
	 */
	EEnum getCodeLanguage();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.pub.pub.ParagraphStyle <em>Paragraph Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Paragraph Style</em>'.
	 * @see com.mimacom.ddd.pub.pub.ParagraphStyle
	 * @generated
	 */
	EEnum getParagraphStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PubFactory getPubFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.PubModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.PubModelImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPubModel()
		 * @generated
		 */
		EClass PUB_MODEL = eINSTANCE.getPubModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUB_MODEL__IMPORTS = eINSTANCE.getPubModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUB_MODEL__DOCUMENT = eINSTANCE.getPubModel_Document();

		/**
		 * The meta object literal for the '<em><b>Provided Diagram Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUB_MODEL__PROVIDED_DIAGRAM_TYPES = eINSTANCE.getPubModel_ProvidedDiagramTypes();

		/**
		 * The meta object literal for the '<em><b>Provided Table Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUB_MODEL__PROVIDED_TABLE_TYPES = eINSTANCE.getPubModel_ProvidedTableTypes();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.DocumentImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

		/**
		 * The meta object literal for the '<em><b>Generate Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__GENERATE_HTML = eINSTANCE.getDocument_GenerateHtml();

		/**
		 * The meta object literal for the '<em><b>Generate La Te X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__GENERATE_LA_TE_X = eINSTANCE.getDocument_GenerateLaTeX();

		/**
		 * The meta object literal for the '<em><b>Generate Markdown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__GENERATE_MARKDOWN = eINSTANCE.getDocument_GenerateMarkdown();

		/**
		 * The meta object literal for the '<em><b>Generate Ascii Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__GENERATE_ASCII_DOC = eINSTANCE.getDocument_GenerateAsciiDoc();

		/**
		 * The meta object literal for the '<em><b>Prefer Raster Diagrams</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__PREFER_RASTER_DIAGRAMS = eINSTANCE.getDocument_PreferRasterDiagrams();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SYMBOLS = eINSTANCE.getDocument_Symbols();

		/**
		 * The meta object literal for the '<em><b>Publication Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__PUBLICATION_CLASS = eINSTANCE.getDocument_PublicationClass();

		/**
		 * The meta object literal for the '<em><b>Get Symbol</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENT___GET_SYMBOL__STRING = eINSTANCE.getDocument__GetSymbol__String();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.SymbolImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__VALUE = eINSTANCE.getSymbol_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.PublicationImpl <em>Publication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.PublicationImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPublication()
		 * @generated
		 */
		EClass PUBLICATION = eINSTANCE.getPublication();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION__INCLUDES = eINSTANCE.getPublication_Includes();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ComponentImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SEGMENTS = eINSTANCE.getComponent_Segments();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.ReferenceTarget <em>Reference Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.ReferenceTarget
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getReferenceTarget()
		 * @generated
		 */
		EClass REFERENCE_TARGET = eINSTANCE.getReferenceTarget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TARGET__NAME = eINSTANCE.getReferenceTarget_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TARGET__ID = eINSTANCE.getReferenceTarget_Id();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ReferenceImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__SCOPE = eINSTANCE.getReference_Scope();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TARGET = eINSTANCE.getReference_Target();

		/**
		 * The meta object literal for the '<em><b>Page Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__PAGE_REFERENCE = eINSTANCE.getReference_PageReference();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.DocumentSegmentImpl <em>Document Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.DocumentSegmentImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getDocumentSegment()
		 * @generated
		 */
		EClass DOCUMENT_SEGMENT = eINSTANCE.getDocumentSegment();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_SEGMENT__PARENT = eINSTANCE.getDocumentSegment_Parent();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENT_SEGMENT___GET_NAME = eINSTANCE.getDocumentSegment__GetName();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENT_SEGMENT___SET_NAME__STRING = eINSTANCE.getDocumentSegment__SetName__String();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.BlockContainerImpl <em>Block Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.BlockContainerImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getBlockContainer()
		 * @generated
		 */
		EClass BLOCK_CONTAINER = eINSTANCE.getBlockContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_CONTAINER__CONTENTS = eINSTANCE.getBlockContainer_Contents();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.SegmentWithTextImpl <em>Segment With Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.SegmentWithTextImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSegmentWithText()
		 * @generated
		 */
		EClass SEGMENT_WITH_TEXT = eINSTANCE.getSegmentWithText();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.AbstractImpl <em>Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.AbstractImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbstract()
		 * @generated
		 */
		EClass ABSTRACT = eINSTANCE.getAbstract();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.PrefaceImpl <em>Preface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.PrefaceImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPreface()
		 * @generated
		 */
		EClass PREFACE = eINSTANCE.getPreface();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.EpilogueImpl <em>Epilogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.EpilogueImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getEpilogue()
		 * @generated
		 */
		EClass EPILOGUE = eINSTANCE.getEpilogue();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.SegmentWithTableImpl <em>Segment With Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.SegmentWithTableImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSegmentWithTable()
		 * @generated
		 */
		EClass SEGMENT_WITH_TABLE = eINSTANCE.getSegmentWithTable();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ChangeHistoryImpl <em>Change History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ChangeHistoryImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getChangeHistory()
		 * @generated
		 */
		EClass CHANGE_HISTORY = eINSTANCE.getChangeHistory();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_HISTORY__ENTRIES = eINSTANCE.getChangeHistory_Entries();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ChangeDescriptionImpl <em>Change Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ChangeDescriptionImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getChangeDescription()
		 * @generated
		 */
		EClass CHANGE_DESCRIPTION = eINSTANCE.getChangeDescription();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__VERSION = eINSTANCE.getChangeDescription_Version();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__DATE = eINSTANCE.getChangeDescription_Date();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__AUTHOR = eINSTANCE.getChangeDescription_Author();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_DESCRIPTION__DESCRIPTION = eINSTANCE.getChangeDescription_Description();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.TOCImpl <em>TOC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.TOCImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTOC()
		 * @generated
		 */
		EClass TOC = eINSTANCE.getTOC();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.AbbreviationsImpl <em>Abbreviations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.AbbreviationsImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbbreviations()
		 * @generated
		 */
		EClass ABBREVIATIONS = eINSTANCE.getAbbreviations();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATIONS__ENTRIES = eINSTANCE.getAbbreviations_Entries();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.AbbreviationImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbbreviation()
		 * @generated
		 */
		EClass ABBREVIATION = eINSTANCE.getAbbreviation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBREVIATION__NAME = eINSTANCE.getAbbreviation_Name();

		/**
		 * The meta object literal for the '<em><b>Long Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBREVIATION__LONG_FORM = eINSTANCE.getAbbreviation_LongForm();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ListOfTablesImpl <em>List Of Tables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ListOfTablesImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getListOfTables()
		 * @generated
		 */
		EClass LIST_OF_TABLES = eINSTANCE.getListOfTables();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ListOfFiguresImpl <em>List Of Figures</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ListOfFiguresImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getListOfFigures()
		 * @generated
		 */
		EClass LIST_OF_FIGURES = eINSTANCE.getListOfFigures();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.BibliographyImpl <em>Bibliography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.BibliographyImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getBibliography()
		 * @generated
		 */
		EClass BIBLIOGRAPHY = eINSTANCE.getBibliography();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOGRAPHY__ENTRIES = eINSTANCE.getBibliography_Entries();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.BibliographyEntryImpl <em>Bibliography Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.BibliographyEntryImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getBibliographyEntry()
		 * @generated
		 */
		EClass BIBLIOGRAPHY_ENTRY = eINSTANCE.getBibliographyEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHY_ENTRY__NAME = eINSTANCE.getBibliographyEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHY_ENTRY__AUTHORS = eINSTANCE.getBibliographyEntry_Authors();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHY_ENTRY__TITLE = eINSTANCE.getBibliographyEntry_Title();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHY_ENTRY__PUBLISHER = eINSTANCE.getBibliographyEntry_Publisher();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHY_ENTRY__DATE = eINSTANCE.getBibliographyEntry_Date();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOGRAPHY_ENTRY__COMMENT = eINSTANCE.getBibliographyEntry_Comment();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.GlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.GlossaryImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getGlossary()
		 * @generated
		 */
		EClass GLOSSARY = eINSTANCE.getGlossary();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__ENTRIES = eINSTANCE.getGlossary_Entries();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.GlossaryEntryImpl <em>Glossary Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.GlossaryEntryImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getGlossaryEntry()
		 * @generated
		 */
		EClass GLOSSARY_ENTRY = eINSTANCE.getGlossaryEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_ENTRY__NAME = eINSTANCE.getGlossaryEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_ENTRY__TEXT = eINSTANCE.getGlossaryEntry_Text();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_ENTRY__COMMENT = eINSTANCE.getGlossaryEntry_Comment();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.IndexImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__ENTRIES = eINSTANCE.getIndex_Entries();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.IndexEntryImpl <em>Index Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.IndexEntryImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getIndexEntry()
		 * @generated
		 */
		EClass INDEX_ENTRY = eINSTANCE.getIndexEntry();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_ENTRY__TEXT = eINSTANCE.getIndexEntry_Text();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ENTRY__REFERENCES = eINSTANCE.getIndexEntry_References();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.SegmentIncludeImpl <em>Segment Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.SegmentIncludeImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSegmentInclude()
		 * @generated
		 */
		EClass SEGMENT_INCLUDE = eINSTANCE.getSegmentInclude();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_INCLUDE__INCLUDE = eINSTANCE.getSegmentInclude_Include();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.PublicationBodyImpl <em>Publication Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.PublicationBodyImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPublicationBody()
		 * @generated
		 */
		EClass PUBLICATION_BODY = eINSTANCE.getPublicationBody();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.Numbered <em>Numbered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.Numbered
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getNumbered()
		 * @generated
		 */
		EClass NUMBERED = eINSTANCE.getNumbered();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBERED__LEVEL = eINSTANCE.getNumbered_Level();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBERED__SEQUENCE_NUMBER = eINSTANCE.getNumbered_SequenceNumber();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.NumberedByChapter <em>Numbered By Chapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.NumberedByChapter
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getNumberedByChapter()
		 * @generated
		 */
		EClass NUMBERED_BY_CHAPTER = eINSTANCE.getNumberedByChapter();

		/**
		 * The meta object literal for the '<em><b>Logical Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBERED_BY_CHAPTER__LOGICAL_CONTAINER = eINSTANCE.getNumberedByChapter_LogicalContainer();

		/**
		 * The meta object literal for the '<em><b>Sequence Number In Chapter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBERED_BY_CHAPTER__SEQUENCE_NUMBER_IN_CHAPTER = eINSTANCE.getNumberedByChapter_SequenceNumberInChapter();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.DivisionContainer <em>Division Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.DivisionContainer
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getDivisionContainer()
		 * @generated
		 */
		EClass DIVISION_CONTAINER = eINSTANCE.getDivisionContainer();

		/**
		 * The meta object literal for the '<em><b>Divisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION_CONTAINER__DIVISIONS = eINSTANCE.getDivisionContainer_Divisions();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.DivisionImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '<em><b>Start Numbering At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIVISION__START_NUMBERING_AT = eINSTANCE.getDivision_StartNumberingAt();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__TITLE = eINSTANCE.getDivision_Title();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__INCLUDE = eINSTANCE.getDivision_Include();

		/**
		 * The meta object literal for the '<em><b>Logical Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVISION__LOGICAL_CONTAINER = eINSTANCE.getDivision_LogicalContainer();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIVISION___GET_ID = eINSTANCE.getDivision__GetId();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIVISION___PARENT = eINSTANCE.getDivision__Parent();

		/**
		 * The meta object literal for the '<em><b>Get Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIVISION___GET_DOCUMENT = eINSTANCE.getDivision__GetDocument();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.PartImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.AppendixImpl <em>Appendix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.AppendixImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAppendix()
		 * @generated
		 */
		EClass APPENDIX = eINSTANCE.getAppendix();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ChapterImpl <em>Chapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ChapterImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getChapter()
		 * @generated
		 */
		EClass CHAPTER = eINSTANCE.getChapter();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.SectionImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.SubsectionImpl <em>Subsection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.SubsectionImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSubsection()
		 * @generated
		 */
		EClass SUBSECTION = eINSTANCE.getSubsection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.SubsubsectionImpl <em>Subsubsection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.SubsubsectionImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getSubsubsection()
		 * @generated
		 */
		EClass SUBSUBSECTION = eINSTANCE.getSubsubsection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ContentBlockImpl <em>Content Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ContentBlockImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getContentBlock()
		 * @generated
		 */
		EClass CONTENT_BLOCK = eINSTANCE.getContentBlock();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.AdmonitionImpl <em>Admonition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.AdmonitionImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAdmonition()
		 * @generated
		 */
		EClass ADMONITION = eINSTANCE.getAdmonition();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMONITION__KIND = eINSTANCE.getAdmonition_Kind();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMONITION__TITLE = eINSTANCE.getAdmonition_Title();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ListImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__STYLE = eINSTANCE.getList_Style();

		/**
		 * The meta object literal for the '<em><b>Numbering Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__NUMBERING_STYLE = eINSTANCE.getList_NumberingStyle();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__LEVEL = eINSTANCE.getList_Level();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ITEMS = eINSTANCE.getList_Items();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ListItemImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__TITLE = eINSTANCE.getListItem_Title();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__LIST = eINSTANCE.getListItem_List();

		/**
		 * The meta object literal for the '<em><b>Get Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_ITEM___GET_LEVEL = eINSTANCE.getListItem__GetLevel();

		/**
		 * The meta object literal for the '<em><b>Get Sequence Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LIST_ITEM___GET_SEQUENCE_NUMBER = eINSTANCE.getListItem__GetSequenceNumber();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl <em>Titled Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.TitledBlockImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTitledBlock()
		 * @generated
		 */
		EClass TITLED_BLOCK = eINSTANCE.getTitledBlock();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLED_BLOCK__TITLE = eINSTANCE.getTitledBlock_Title();

		/**
		 * The meta object literal for the '<em><b>Get Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TITLED_BLOCK___GET_ID = eINSTANCE.getTitledBlock__GetId();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TITLED_BLOCK___PARENT = eINSTANCE.getTitledBlock__Parent();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.TitledTableImpl <em>Titled Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.TitledTableImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTitledTable()
		 * @generated
		 */
		EClass TITLED_TABLE = eINSTANCE.getTitledTable();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLED_TABLE__TABLE = eINSTANCE.getTitledTable_Table();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.AbstractTableImpl <em>Abstract Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.AbstractTableImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbstractTable()
		 * @generated
		 */
		EClass ABSTRACT_TABLE = eINSTANCE.getAbstractTable();

		/**
		 * The meta object literal for the '<em><b>Width Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TABLE__WIDTH_PERCENT = eINSTANCE.getAbstractTable_WidthPercent();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.TableImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Gridlines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__GRIDLINES = eINSTANCE.getTable_Gridlines();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.TableRowImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Is Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__IS_HEADING = eINSTANCE.getTableRow_IsHeading();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__CELLS = eINSTANCE.getTableRow_Cells();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__TABLE = eINSTANCE.getTableRow_Table();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.TableCellImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__WIDTH = eINSTANCE.getTableCell_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__HEIGHT = eINSTANCE.getTableCell_Height();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CELL__ROW = eINSTANCE.getTableCell_Row();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ProvidedTableImpl <em>Provided Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ProvidedTableImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getProvidedTable()
		 * @generated
		 */
		EClass PROVIDED_TABLE = eINSTANCE.getProvidedTable();

		/**
		 * The meta object literal for the '<em><b>Diagram Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_TABLE__DIAGRAM_ROOT = eINSTANCE.getProvidedTable_DiagramRoot();

		/**
		 * The meta object literal for the '<em><b>Table Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_TABLE__TABLE_TYPE = eINSTANCE.getProvidedTable_TableType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ProvidedTableTypeImpl <em>Provided Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ProvidedTableTypeImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getProvidedTableType()
		 * @generated
		 */
		EClass PROVIDED_TABLE_TYPE = eINSTANCE.getProvidedTableType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_TABLE_TYPE__NAME = eINSTANCE.getProvidedTableType_Name();

		/**
		 * The meta object literal for the '<em><b>Table Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_TABLE_TYPE__TABLE_TYPE_NAME = eINSTANCE.getProvidedTableType_TableTypeName();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.TitledFigureImpl <em>Titled Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.TitledFigureImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTitledFigure()
		 * @generated
		 */
		EClass TITLED_FIGURE = eINSTANCE.getTitledFigure();

		/**
		 * The meta object literal for the '<em><b>Figure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLED_FIGURE__FIGURE = eINSTANCE.getTitledFigure_Figure();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.AbstractFigureImpl <em>Abstract Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.AbstractFigureImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAbstractFigure()
		 * @generated
		 */
		EClass ABSTRACT_FIGURE = eINSTANCE.getAbstractFigure();

		/**
		 * The meta object literal for the '<em><b>Width Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_FIGURE__WIDTH_PERCENT = eINSTANCE.getAbstractFigure_WidthPercent();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.IncludedFigureImpl <em>Included Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.IncludedFigureImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getIncludedFigure()
		 * @generated
		 */
		EClass INCLUDED_FIGURE = eINSTANCE.getIncludedFigure();

		/**
		 * The meta object literal for the '<em><b>File Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_FIGURE__FILE_URI = eINSTANCE.getIncludedFigure_FileUri();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ProvidedFigureImpl <em>Provided Figure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ProvidedFigureImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getProvidedFigure()
		 * @generated
		 */
		EClass PROVIDED_FIGURE = eINSTANCE.getProvidedFigure();

		/**
		 * The meta object literal for the '<em><b>Diagram Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_FIGURE__DIAGRAM_ROOT = eINSTANCE.getProvidedFigure_DiagramRoot();

		/**
		 * The meta object literal for the '<em><b>Diagram Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_FIGURE__DIAGRAM_TYPE = eINSTANCE.getProvidedFigure_DiagramType();

		/**
		 * The meta object literal for the '<em><b>Prefer Raster Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_FIGURE__PREFER_RASTER_DIAGRAM = eINSTANCE.getProvidedFigure_PreferRasterDiagram();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ProvidedDiagramTypeImpl <em>Provided Diagram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ProvidedDiagramTypeImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getProvidedDiagramType()
		 * @generated
		 */
		EClass PROVIDED_DIAGRAM_TYPE = eINSTANCE.getProvidedDiagramType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_DIAGRAM_TYPE__NAME = eINSTANCE.getProvidedDiagramType_Name();

		/**
		 * The meta object literal for the '<em><b>Diagram Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_DIAGRAM_TYPE__DIAGRAM_TYPE_NAME = eINSTANCE.getProvidedDiagramType_DiagramTypeName();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.EquationImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '<em><b>File Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUATION__FILE_URI = eINSTANCE.getEquation_FileUri();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.TitledCodeListingImpl <em>Titled Code Listing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.TitledCodeListingImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getTitledCodeListing()
		 * @generated
		 */
		EClass TITLED_CODE_LISTING = eINSTANCE.getTitledCodeListing();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLED_CODE_LISTING__FORMAT = eINSTANCE.getTitledCodeListing_Format();

		/**
		 * The meta object literal for the '<em><b>Code Lines</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLED_CODE_LISTING__CODE_LINES = eINSTANCE.getTitledCodeListing_CodeLines();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLED_CODE_LISTING__INCLUDE = eINSTANCE.getTitledCodeListing_Include();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.ParagraphImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.RichTextParagraphImpl <em>Rich Text Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.RichTextParagraphImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getRichTextParagraph()
		 * @generated
		 */
		EClass RICH_TEXT_PARAGRAPH = eINSTANCE.getRichTextParagraph();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT_PARAGRAPH__STYLE = eINSTANCE.getRichTextParagraph_Style();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_TEXT_PARAGRAPH__TEXT = eINSTANCE.getRichTextParagraph_Text();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.RichTextReferencingParagraphImpl <em>Rich Text Referencing Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.RichTextReferencingParagraphImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getRichTextReferencingParagraph()
		 * @generated
		 */
		EClass RICH_TEXT_REFERENCING_PARAGRAPH = eINSTANCE.getRichTextReferencingParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_TEXT_REFERENCING_PARAGRAPH__TEXT = eINSTANCE.getRichTextReferencingParagraph_Text();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.UnformattedParagraphImpl <em>Unformatted Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.UnformattedParagraphImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getUnformattedParagraph()
		 * @generated
		 */
		EClass UNFORMATTED_PARAGRAPH = eINSTANCE.getUnformattedParagraph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNFORMATTED_PARAGRAPH__TEXT = eINSTANCE.getUnformattedParagraph_Text();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl <em>Footnote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.impl.FootnoteImpl
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getFootnote()
		 * @generated
		 */
		EClass FOOTNOTE = eINSTANCE.getFootnote();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOTNOTE__TEXT = eINSTANCE.getFootnote_Text();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.PublicationNature <em>Publication Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.PublicationNature
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getPublicationNature()
		 * @generated
		 */
		EEnum PUBLICATION_NATURE = eINSTANCE.getPublicationNature();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.ReferenceScope <em>Reference Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.ReferenceScope
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getReferenceScope()
		 * @generated
		 */
		EEnum REFERENCE_SCOPE = eINSTANCE.getReferenceScope();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.AdmonitionKind <em>Admonition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.AdmonitionKind
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getAdmonitionKind()
		 * @generated
		 */
		EEnum ADMONITION_KIND = eINSTANCE.getAdmonitionKind();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.ListStyle <em>List Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.ListStyle
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getListStyle()
		 * @generated
		 */
		EEnum LIST_STYLE = eINSTANCE.getListStyle();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.GridLines <em>Grid Lines</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.GridLines
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getGridLines()
		 * @generated
		 */
		EEnum GRID_LINES = eINSTANCE.getGridLines();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.CodeLanguage <em>Code Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.CodeLanguage
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getCodeLanguage()
		 * @generated
		 */
		EEnum CODE_LANGUAGE = eINSTANCE.getCodeLanguage();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.pub.pub.ParagraphStyle <em>Paragraph Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.pub.pub.ParagraphStyle
		 * @see com.mimacom.ddd.pub.pub.impl.PubPackageImpl#getParagraphStyle()
		 * @generated
		 */
		EEnum PARAGRAPH_STYLE = eINSTANCE.getParagraphStyle();

	}

} //PubPackage
