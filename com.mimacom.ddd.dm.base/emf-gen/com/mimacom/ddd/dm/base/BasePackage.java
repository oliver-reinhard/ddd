/**
 */
package com.mimacom.ddd.dm.base;

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
 * @see com.mimacom.ddd.dm.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = com.mimacom.ddd.dm.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNamedElementImpl <em>DNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNamedElementImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNamedElement()
	 * @generated
	 */
	int DNAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT__ALIASES = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>DNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DImportImpl <em>DImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DImportImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDImport()
	 * @generated
	 */
	int DIMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>DImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNamespaceImpl <em>DNamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNamespaceImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNamespace()
	 * @generated
	 */
	int DNAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE__IMPORTS = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE__MODEL = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DNamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DNamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMESPACE_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DModelImpl <em>DModel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DModelImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDModel()
	 * @generated
	 */
	int DMODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>DModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DModel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMODEL_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IDiagramRoot <em>IDiagram Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IDiagramRoot
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIDiagramRoot()
	 * @generated
	 */
	int IDIAGRAM_ROOT = 4;

	/**
	 * The number of structural features of the '<em>IDiagram Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIAGRAM_ROOT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IDiagram Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDIAGRAM_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IStaticReferenceTarget <em>IStatic Reference Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IStaticReferenceTarget
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIStaticReferenceTarget()
	 * @generated
	 */
	int ISTATIC_REFERENCE_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATIC_REFERENCE_TARGET__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATIC_REFERENCE_TARGET__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATIC_REFERENCE_TARGET__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>IStatic Reference Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATIC_REFERENCE_TARGET_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IStatic Reference Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATIC_REFERENCE_TARGET_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IRichTextSegment <em>IRich Text Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IRichTextSegment
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIRichTextSegment()
	 * @generated
	 */
	int IRICH_TEXT_SEGMENT = 6;

	/**
	 * The number of structural features of the '<em>IRich Text Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRICH_TEXT_SEGMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IRich Text Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRICH_TEXT_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DTextSegmentImpl <em>DText Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DTextSegmentImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDTextSegment()
	 * @generated
	 */
	int DTEXT_SEGMENT = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_SEGMENT__VALUE = IRICH_TEXT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DText Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_SEGMENT_FEATURE_COUNT = IRICH_TEXT_SEGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DText Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_SEGMENT_OPERATION_COUNT = IRICH_TEXT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DExpressionImpl <em>DExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DExpressionImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDExpression()
	 * @generated
	 */
	int DEXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>DExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXPRESSION_FEATURE_COUNT = IRICH_TEXT_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXPRESSION_OPERATION_COUNT = IRICH_TEXT_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DRichTextImpl <em>DRich Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DRichTextImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDRichText()
	 * @generated
	 */
	int DRICH_TEXT = 9;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRICH_TEXT__SEGMENTS = DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DRich Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRICH_TEXT_FEATURE_COUNT = DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DRich Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRICH_TEXT_OPERATION_COUNT = DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IDeductionDefinition <em>IDeduction Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IDeductionDefinition
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIDeductionDefinition()
	 * @generated
	 */
	int IDEDUCTION_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEDUCTION_DEFINITION__DEDUCTION_RULE = 0;

	/**
	 * The number of structural features of the '<em>IDeduction Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEDUCTION_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IDeduction Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEDUCTION_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IDeducibleElement <em>IDeducible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IDeducibleElement
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIDeducibleElement()
	 * @generated
	 */
	int IDEDUCIBLE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEDUCIBLE_ELEMENT__DEDUCED_FROM = 0;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEDUCIBLE_ELEMENT__SYNTHETIC = 1;

	/**
	 * The number of structural features of the '<em>IDeducible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEDUCIBLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IDeducible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEDUCIBLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DDeductionRuleImpl <em>DDeduction Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DDeductionRuleImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDeductionRule()
	 * @generated
	 */
	int DDEDUCTION_RULE = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDEDUCTION_RULE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDEDUCTION_RULE__NAMED_SOURCE = 1;

	/**
	 * The number of structural features of the '<em>DDeduction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDEDUCTION_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DDeduction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDEDUCTION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DInformationModelImpl <em>DInformation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DInformationModelImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDInformationModel()
	 * @generated
	 */
	int DINFORMATION_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL__NAME = DMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL__ALIASES = DMODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL__DESCRIPTION = DMODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL__AGGREGATES = DMODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL__TYPES = DMODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL__DEDUCED_FROM = DMODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL__SYNTHETIC = DMODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DInformation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL_FEATURE_COUNT = DMODEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DInformation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINFORMATION_MODEL_OPERATION_COUNT = DMODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IAggregateContainer <em>IAggregate Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IAggregateContainer
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIAggregateContainer()
	 * @generated
	 */
	int IAGGREGATE_CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAGGREGATE_CONTAINER__AGGREGATES = 0;

	/**
	 * The number of structural features of the '<em>IAggregate Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAGGREGATE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IAggregate Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAGGREGATE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.ITypeContainer <em>IType Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.ITypeContainer
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getITypeContainer()
	 * @generated
	 */
	int ITYPE_CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_CONTAINER__TYPES = 0;

	/**
	 * The number of structural features of the '<em>IType Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IType Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IFeatureContainer <em>IFeature Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IFeatureContainer
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIFeatureContainer()
	 * @generated
	 */
	int IFEATURE_CONTAINER = 16;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEATURE_CONTAINER__FEATURES = 0;

	/**
	 * The number of structural features of the '<em>IFeature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEATURE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IFeature Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFEATURE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl <em>DAggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DAggregateImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAggregate()
	 * @generated
	 */
	int DAGGREGATE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__TYPES = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__FEATURES = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__NAVIGABLE_MEMBERS = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__DEDUCED_FROM = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__SYNTHETIC = DNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__ROOTS = DNAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>DAggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>DAggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNavigableMemberImpl <em>DNavigable Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNavigableMemberImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNavigableMember()
	 * @generated
	 */
	int DNAVIGABLE_MEMBER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER__TYPE = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER__MULTIPLICITY = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER__OPTIONAL = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER__COLLECTION = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DNavigable Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DNavigable Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.INavigableMemberContainer <em>INavigable Member Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.INavigableMemberContainer
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getINavigableMemberContainer()
	 * @generated
	 */
	int INAVIGABLE_MEMBER_CONTAINER = 19;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>INavigable Member Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>INavigable Member Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAVIGABLE_MEMBER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DContextImpl <em>DContext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DContextImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDContext()
	 * @generated
	 */
	int DCONTEXT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__NAME = DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__ALIASES = DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__DESCRIPTION = DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__TYPE = DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__MULTIPLICITY = DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__OPTIONAL = DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__COLLECTION = DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>DContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT_FEATURE_COUNT = DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT_OPERATION_COUNT = DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DMultiplicityImpl <em>DMultiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DMultiplicityImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDMultiplicity()
	 * @generated
	 */
	int DMULTIPLICITY = 21;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMULTIPLICITY__MIN_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMULTIPLICITY__MAX_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Shorthand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMULTIPLICITY__SHORTHAND = 2;

	/**
	 * The number of structural features of the '<em>DMultiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMULTIPLICITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DMultiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IIdentityType <em>IIdentity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IIdentityType
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIIdentityType()
	 * @generated
	 */
	int IIDENTITY_TYPE = 22;

	/**
	 * The number of structural features of the '<em>IIdentity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTITY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IIdentity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IValueType <em>IValue Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IValueType
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIValueType()
	 * @generated
	 */
	int IVALUE_TYPE = 23;

	/**
	 * The number of structural features of the '<em>IValue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IValue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DTypeImpl <em>DType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDType()
	 * @generated
	 */
	int DTYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__DEDUCED_FROM = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__SYNTHETIC = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__CONSTRAINTS = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__PRIMITIVE = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNamedPredicateImpl <em>DNamed Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNamedPredicateImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNamedPredicate()
	 * @generated
	 */
	int DNAMED_PREDICATE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_PREDICATE__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_PREDICATE__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_PREDICATE__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_PREDICATE__PREDICATE = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DNamed Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_PREDICATE_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DNamed Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_PREDICATE_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DSimpleTypeImpl <em>DSimple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DSimpleTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDSimpleType()
	 * @generated
	 */
	int DSIMPLE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__NAME = DTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__ALIASES = DTYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__DESCRIPTION = DTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__DEDUCED_FROM = DTYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__SYNTHETIC = DTYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__CONSTRAINTS = DTYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__PRIMITIVE = DTYPE__PRIMITIVE;

	/**
	 * The number of structural features of the '<em>DSimple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE_FEATURE_COUNT = DTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DSimple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE_OPERATION_COUNT = DTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DPrimitiveImpl <em>DPrimitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DPrimitiveImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDPrimitive()
	 * @generated
	 */
	int DPRIMITIVE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__NAME = DSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__ALIASES = DSIMPLE_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__DESCRIPTION = DSIMPLE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__DEDUCED_FROM = DSIMPLE_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__SYNTHETIC = DSIMPLE_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__CONSTRAINTS = DSIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__PRIMITIVE = DSIMPLE_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__REDEFINES = DSIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DPrimitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE_FEATURE_COUNT = DSIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DPrimitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE_OPERATION_COUNT = DSIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DEnumerationImpl <em>DEnumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DEnumerationImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDEnumeration()
	 * @generated
	 */
	int DENUMERATION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__NAME = DSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__ALIASES = DSIMPLE_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__DESCRIPTION = DSIMPLE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__DEDUCED_FROM = DSIMPLE_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__SYNTHETIC = DSIMPLE_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__CONSTRAINTS = DSIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__PRIMITIVE = DSIMPLE_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__NAVIGABLE_MEMBERS = DSIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__LITERALS = DSIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION_FEATURE_COUNT = DSIMPLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION_OPERATION_COUNT = DSIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DLiteralImpl <em>DLiteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DLiteralImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDLiteral()
	 * @generated
	 */
	int DLITERAL = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__NAME = DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__ALIASES = DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__DESCRIPTION = DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__TYPE = DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__MULTIPLICITY = DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__OPTIONAL = DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__COLLECTION = DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__DEDUCED_FROM = DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__SYNTHETIC = DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL_FEATURE_COUNT = DNAVIGABLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL_OPERATION_COUNT = DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DComplexTypeImpl <em>DComplex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DComplexTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDComplexType()
	 * @generated
	 */
	int DCOMPLEX_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__NAME = DTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__ALIASES = DTYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__DESCRIPTION = DTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__DEDUCED_FROM = DTYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__SYNTHETIC = DTYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__CONSTRAINTS = DTYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__PRIMITIVE = DTYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__FEATURES = DTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__NAVIGABLE_MEMBERS = DTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__ABSTRACT = DTYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__SUPER_TYPE = DTYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DComplex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE_FEATURE_COUNT = DTYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DComplex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE_OPERATION_COUNT = DTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DDetailTypeImpl <em>DDetail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DDetailTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDetailType()
	 * @generated
	 */
	int DDETAIL_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__NAME = DCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__ALIASES = DCOMPLEX_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__DESCRIPTION = DCOMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__DEDUCED_FROM = DCOMPLEX_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__SYNTHETIC = DCOMPLEX_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__CONSTRAINTS = DCOMPLEX_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__PRIMITIVE = DCOMPLEX_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__FEATURES = DCOMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__NAVIGABLE_MEMBERS = DCOMPLEX_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__ABSTRACT = DCOMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__SUPER_TYPE = DCOMPLEX_TYPE__SUPER_TYPE;

	/**
	 * The number of structural features of the '<em>DDetail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE_FEATURE_COUNT = DCOMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DDetail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE_OPERATION_COUNT = DCOMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DEntityTypeImpl <em>DEntity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DEntityTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDEntityType()
	 * @generated
	 */
	int DENTITY_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__NAME = DCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__ALIASES = DCOMPLEX_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__DESCRIPTION = DCOMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__DEDUCED_FROM = DCOMPLEX_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__SYNTHETIC = DCOMPLEX_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__CONSTRAINTS = DCOMPLEX_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__PRIMITIVE = DCOMPLEX_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__FEATURES = DCOMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__NAVIGABLE_MEMBERS = DCOMPLEX_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__ABSTRACT = DCOMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__SUPER_TYPE = DCOMPLEX_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__ROOT = DCOMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__ORIGIN = DCOMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__STATES = DCOMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__EVENTS = DCOMPLEX_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE_FEATURE_COUNT = DCOMPLEX_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE_OPERATION_COUNT = DCOMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DFeatureImpl <em>DFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DFeatureImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDFeature()
	 * @generated
	 */
	int DFEATURE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__NAME = DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__ALIASES = DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__DESCRIPTION = DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__TYPE = DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__MULTIPLICITY = DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__OPTIONAL = DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__COLLECTION = DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__DEDUCED_FROM = DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__SYNTHETIC = DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE_FEATURE_COUNT = DNAVIGABLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE_OPERATION_COUNT = DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DAssociationImpl <em>DAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DAssociationImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAssociation()
	 * @generated
	 */
	int DASSOCIATION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__NAME = DFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__ALIASES = DFEATURE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__DESCRIPTION = DFEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__TYPE = DFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__MULTIPLICITY = DFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__OPTIONAL = DFEATURE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__COLLECTION = DFEATURE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__DEDUCED_FROM = DFEATURE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__SYNTHETIC = DFEATURE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__KIND = DFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__DERIVED = DFEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__SOURCE_TYPE = DFEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION_FEATURE_COUNT = DFEATURE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Target Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION___GET_TARGET_TYPE = DFEATURE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>DAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION_OPERATION_COUNT = DFEATURE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DAttributeImpl <em>DAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DAttributeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAttribute()
	 * @generated
	 */
	int DATTRIBUTE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__NAME = DFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__ALIASES = DFEATURE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__DESCRIPTION = DFEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__TYPE = DFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__MULTIPLICITY = DFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__OPTIONAL = DFEATURE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__COLLECTION = DFEATURE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__DEDUCED_FROM = DFEATURE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__SYNTHETIC = DFEATURE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__DETAIL = DFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__KEY = DFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE_FEATURE_COUNT = DFEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE_OPERATION_COUNT = DFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DQueryImpl <em>DQuery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DQueryImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDQuery()
	 * @generated
	 */
	int DQUERY = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__NAME = DFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__ALIASES = DFEATURE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__DESCRIPTION = DFEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__TYPE = DFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__MULTIPLICITY = DFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__OPTIONAL = DFEATURE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__COLLECTION = DFEATURE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__DEDUCED_FROM = DFEATURE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__SYNTHETIC = DFEATURE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__NAVIGABLE_MEMBERS = DFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__PARAMETERS = DFEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__RETURNS = DFEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_FEATURE_COUNT = DFEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_OPERATION_COUNT = DFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DQueryParameterImpl <em>DQuery Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DQueryParameterImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDQueryParameter()
	 * @generated
	 */
	int DQUERY_PARAMETER = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__NAME = DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__ALIASES = DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__DESCRIPTION = DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__TYPE = DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__MULTIPLICITY = DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__OPTIONAL = DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__COLLECTION = DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__DEDUCED_FROM = DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__SYNTHETIC = DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DQuery Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER_FEATURE_COUNT = DNAVIGABLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DQuery Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER_OPERATION_COUNT = DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DStateImpl <em>DState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DStateImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDState()
	 * @generated
	 */
	int DSTATE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__NAME = DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__ALIASES = DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__DESCRIPTION = DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__TYPE = DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__MULTIPLICITY = DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__OPTIONAL = DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE__COLLECTION = DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>DState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_FEATURE_COUNT = DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DState</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_OPERATION_COUNT = DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DStateEventImpl <em>DState Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DStateEventImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDStateEvent()
	 * @generated
	 */
	int DSTATE_EVENT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_EVENT__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_EVENT__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_EVENT__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>DState Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_EVENT_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DState Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTATE_EVENT_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.DMultiplicityShorthand <em>DMultiplicity Shorthand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.DMultiplicityShorthand
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDMultiplicityShorthand()
	 * @generated
	 */
	int DMULTIPLICITY_SHORTHAND = 40;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.DEntityOrigin <em>DEntity Origin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.DEntityOrigin
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDEntityOrigin()
	 * @generated
	 */
	int DENTITY_ORIGIN = 41;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.DAssociationKind <em>DAssociation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.DAssociationKind
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAssociationKind()
	 * @generated
	 */
	int DASSOCIATION_KIND = 42;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DNamedElement <em>DNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNamed Element</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamedElement
	 * @generated
	 */
	EClass getDNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamedElement#getName()
	 * @see #getDNamedElement()
	 * @generated
	 */
	EAttribute getDNamedElement_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.mimacom.ddd.dm.base.DNamedElement#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Aliases</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamedElement#getAliases()
	 * @see #getDNamedElement()
	 * @generated
	 */
	EAttribute getDNamedElement_Aliases();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DNamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamedElement#getDescription()
	 * @see #getDNamedElement()
	 * @generated
	 */
	EReference getDNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DImport <em>DImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DImport</em>'.
	 * @see com.mimacom.ddd.dm.base.DImport
	 * @generated
	 */
	EClass getDImport();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see com.mimacom.ddd.dm.base.DImport#getImportedNamespace()
	 * @see #getDImport()
	 * @generated
	 */
	EAttribute getDImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DNamespace <em>DNamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNamespace</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamespace
	 * @generated
	 */
	EClass getDNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DNamespace#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamespace#getImports()
	 * @see #getDNamespace()
	 * @generated
	 */
	EReference getDNamespace_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DNamespace#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamespace#getModel()
	 * @see #getDNamespace()
	 * @generated
	 */
	EReference getDNamespace_Model();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DModel <em>DModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DModel</em>'.
	 * @see com.mimacom.ddd.dm.base.DModel
	 * @generated
	 */
	EClass getDModel();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IDiagramRoot <em>IDiagram Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDiagram Root</em>'.
	 * @see com.mimacom.ddd.dm.base.IDiagramRoot
	 * @generated
	 */
	EClass getIDiagramRoot();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IStaticReferenceTarget <em>IStatic Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStatic Reference Target</em>'.
	 * @see com.mimacom.ddd.dm.base.IStaticReferenceTarget
	 * @generated
	 */
	EClass getIStaticReferenceTarget();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IRichTextSegment <em>IRich Text Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRich Text Segment</em>'.
	 * @see com.mimacom.ddd.dm.base.IRichTextSegment
	 * @generated
	 */
	EClass getIRichTextSegment();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DTextSegment <em>DText Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DText Segment</em>'.
	 * @see com.mimacom.ddd.dm.base.DTextSegment
	 * @generated
	 */
	EClass getDTextSegment();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DTextSegment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.base.DTextSegment#getValue()
	 * @see #getDTextSegment()
	 * @generated
	 */
	EAttribute getDTextSegment_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DExpression <em>DExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DExpression</em>'.
	 * @see com.mimacom.ddd.dm.base.DExpression
	 * @generated
	 */
	EClass getDExpression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DRichText <em>DRich Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRich Text</em>'.
	 * @see com.mimacom.ddd.dm.base.DRichText
	 * @generated
	 */
	EClass getDRichText();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DRichText#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see com.mimacom.ddd.dm.base.DRichText#getSegments()
	 * @see #getDRichText()
	 * @generated
	 */
	EReference getDRichText_Segments();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IDeductionDefinition <em>IDeduction Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDeduction Definition</em>'.
	 * @see com.mimacom.ddd.dm.base.IDeductionDefinition
	 * @generated
	 */
	EClass getIDeductionDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.IDeductionDefinition#getDeductionRule <em>Deduction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deduction Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.IDeductionDefinition#getDeductionRule()
	 * @see #getIDeductionDefinition()
	 * @generated
	 */
	EReference getIDeductionDefinition_DeductionRule();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IDeducibleElement <em>IDeducible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDeducible Element</em>'.
	 * @see com.mimacom.ddd.dm.base.IDeducibleElement
	 * @generated
	 */
	EClass getIDeducibleElement();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.IDeducibleElement#getDeducedFrom <em>Deduced From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deduced From</em>'.
	 * @see com.mimacom.ddd.dm.base.IDeducibleElement#getDeducedFrom()
	 * @see #getIDeducibleElement()
	 * @generated
	 */
	EReference getIDeducibleElement_DeducedFrom();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.IDeducibleElement#isSynthetic <em>Synthetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthetic</em>'.
	 * @see com.mimacom.ddd.dm.base.IDeducibleElement#isSynthetic()
	 * @see #getIDeducibleElement()
	 * @generated
	 */
	EAttribute getIDeducibleElement_Synthetic();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DDeductionRule <em>DDeduction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDeduction Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.DDeductionRule
	 * @generated
	 */
	EClass getDDeductionRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DDeductionRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.mimacom.ddd.dm.base.DDeductionRule#getSource()
	 * @see #getDDeductionRule()
	 * @generated
	 */
	EReference getDDeductionRule_Source();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DDeductionRule#getNamedSource <em>Named Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Named Source</em>'.
	 * @see com.mimacom.ddd.dm.base.DDeductionRule#getNamedSource()
	 * @see #getDDeductionRule()
	 * @generated
	 */
	EReference getDDeductionRule_NamedSource();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DInformationModel <em>DInformation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DInformation Model</em>'.
	 * @see com.mimacom.ddd.dm.base.DInformationModel
	 * @generated
	 */
	EClass getDInformationModel();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IAggregateContainer <em>IAggregate Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAggregate Container</em>'.
	 * @see com.mimacom.ddd.dm.base.IAggregateContainer
	 * @generated
	 */
	EClass getIAggregateContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.IAggregateContainer#getAggregates <em>Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregates</em>'.
	 * @see com.mimacom.ddd.dm.base.IAggregateContainer#getAggregates()
	 * @see #getIAggregateContainer()
	 * @generated
	 */
	EReference getIAggregateContainer_Aggregates();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.ITypeContainer <em>IType Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IType Container</em>'.
	 * @see com.mimacom.ddd.dm.base.ITypeContainer
	 * @generated
	 */
	EClass getITypeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.ITypeContainer#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.mimacom.ddd.dm.base.ITypeContainer#getTypes()
	 * @see #getITypeContainer()
	 * @generated
	 */
	EReference getITypeContainer_Types();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IFeatureContainer <em>IFeature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFeature Container</em>'.
	 * @see com.mimacom.ddd.dm.base.IFeatureContainer
	 * @generated
	 */
	EClass getIFeatureContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.IFeatureContainer#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.mimacom.ddd.dm.base.IFeatureContainer#getFeatures()
	 * @see #getIFeatureContainer()
	 * @generated
	 */
	EReference getIFeatureContainer_Features();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DAggregate <em>DAggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAggregate</em>'.
	 * @see com.mimacom.ddd.dm.base.DAggregate
	 * @generated
	 */
	EClass getDAggregate();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.dm.base.DAggregate#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roots</em>'.
	 * @see com.mimacom.ddd.dm.base.DAggregate#getRoots()
	 * @see #getDAggregate()
	 * @generated
	 */
	EReference getDAggregate_Roots();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DNavigableMember <em>DNavigable Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNavigable Member</em>'.
	 * @see com.mimacom.ddd.dm.base.DNavigableMember
	 * @generated
	 */
	EClass getDNavigableMember();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DNavigableMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DNavigableMember#getType()
	 * @see #getDNavigableMember()
	 * @generated
	 */
	EReference getDNavigableMember_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DNavigableMember#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see com.mimacom.ddd.dm.base.DNavigableMember#getMultiplicity()
	 * @see #getDNavigableMember()
	 * @generated
	 */
	EReference getDNavigableMember_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DNavigableMember#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see com.mimacom.ddd.dm.base.DNavigableMember#isOptional()
	 * @see #getDNavigableMember()
	 * @generated
	 */
	EAttribute getDNavigableMember_Optional();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DNavigableMember#isCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see com.mimacom.ddd.dm.base.DNavigableMember#isCollection()
	 * @see #getDNavigableMember()
	 * @generated
	 */
	EAttribute getDNavigableMember_Collection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.INavigableMemberContainer <em>INavigable Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INavigable Member Container</em>'.
	 * @see com.mimacom.ddd.dm.base.INavigableMemberContainer
	 * @generated
	 */
	EClass getINavigableMemberContainer();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.dm.base.INavigableMemberContainer#getNavigableMembers <em>Navigable Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Navigable Members</em>'.
	 * @see com.mimacom.ddd.dm.base.INavigableMemberContainer#getNavigableMembers()
	 * @see #getINavigableMemberContainer()
	 * @generated
	 */
	EReference getINavigableMemberContainer_NavigableMembers();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DContext <em>DContext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DContext</em>'.
	 * @see com.mimacom.ddd.dm.base.DContext
	 * @generated
	 */
	EClass getDContext();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DMultiplicity <em>DMultiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMultiplicity</em>'.
	 * @see com.mimacom.ddd.dm.base.DMultiplicity
	 * @generated
	 */
	EClass getDMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DMultiplicity#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see com.mimacom.ddd.dm.base.DMultiplicity#getMinOccurs()
	 * @see #getDMultiplicity()
	 * @generated
	 */
	EAttribute getDMultiplicity_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DMultiplicity#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see com.mimacom.ddd.dm.base.DMultiplicity#getMaxOccurs()
	 * @see #getDMultiplicity()
	 * @generated
	 */
	EAttribute getDMultiplicity_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DMultiplicity#getShorthand <em>Shorthand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shorthand</em>'.
	 * @see com.mimacom.ddd.dm.base.DMultiplicity#getShorthand()
	 * @see #getDMultiplicity()
	 * @generated
	 */
	EAttribute getDMultiplicity_Shorthand();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IIdentityType <em>IIdentity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IIdentity Type</em>'.
	 * @see com.mimacom.ddd.dm.base.IIdentityType
	 * @generated
	 */
	EClass getIIdentityType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IValueType <em>IValue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IValue Type</em>'.
	 * @see com.mimacom.ddd.dm.base.IValueType
	 * @generated
	 */
	EClass getIValueType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DType <em>DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DType</em>'.
	 * @see com.mimacom.ddd.dm.base.DType
	 * @generated
	 */
	EClass getDType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see com.mimacom.ddd.dm.base.DType#getConstraints()
	 * @see #getDType()
	 * @generated
	 */
	EReference getDType_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DType#isPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see com.mimacom.ddd.dm.base.DType#isPrimitive()
	 * @see #getDType()
	 * @generated
	 */
	EAttribute getDType_Primitive();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DNamedPredicate <em>DNamed Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNamed Predicate</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamedPredicate
	 * @generated
	 */
	EClass getDNamedPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DNamedPredicate#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see com.mimacom.ddd.dm.base.DNamedPredicate#getPredicate()
	 * @see #getDNamedPredicate()
	 * @generated
	 */
	EReference getDNamedPredicate_Predicate();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DSimpleType <em>DSimple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSimple Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DSimpleType
	 * @generated
	 */
	EClass getDSimpleType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DPrimitive <em>DPrimitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPrimitive</em>'.
	 * @see com.mimacom.ddd.dm.base.DPrimitive
	 * @generated
	 */
	EClass getDPrimitive();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DPrimitive#getRedefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefines</em>'.
	 * @see com.mimacom.ddd.dm.base.DPrimitive#getRedefines()
	 * @see #getDPrimitive()
	 * @generated
	 */
	EReference getDPrimitive_Redefines();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DEnumeration <em>DEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEnumeration</em>'.
	 * @see com.mimacom.ddd.dm.base.DEnumeration
	 * @generated
	 */
	EClass getDEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see com.mimacom.ddd.dm.base.DEnumeration#getLiterals()
	 * @see #getDEnumeration()
	 * @generated
	 */
	EReference getDEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DLiteral <em>DLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DLiteral</em>'.
	 * @see com.mimacom.ddd.dm.base.DLiteral
	 * @generated
	 */
	EClass getDLiteral();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DComplexType <em>DComplex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DComplex Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DComplexType
	 * @generated
	 */
	EClass getDComplexType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DComplexType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.mimacom.ddd.dm.base.DComplexType#isAbstract()
	 * @see #getDComplexType()
	 * @generated
	 */
	EAttribute getDComplexType_Abstract();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DComplexType#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DComplexType#getSuperType()
	 * @see #getDComplexType()
	 * @generated
	 */
	EReference getDComplexType_SuperType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DDetailType <em>DDetail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDetail Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DDetailType
	 * @generated
	 */
	EClass getDDetailType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DEntityType <em>DEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEntity Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DEntityType
	 * @generated
	 */
	EClass getDEntityType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DEntityType#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see com.mimacom.ddd.dm.base.DEntityType#isRoot()
	 * @see #getDEntityType()
	 * @generated
	 */
	EAttribute getDEntityType_Root();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DEntityType#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see com.mimacom.ddd.dm.base.DEntityType#getOrigin()
	 * @see #getDEntityType()
	 * @generated
	 */
	EAttribute getDEntityType_Origin();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DEntityType#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see com.mimacom.ddd.dm.base.DEntityType#getStates()
	 * @see #getDEntityType()
	 * @generated
	 */
	EReference getDEntityType_States();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DEntityType#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see com.mimacom.ddd.dm.base.DEntityType#getEvents()
	 * @see #getDEntityType()
	 * @generated
	 */
	EReference getDEntityType_Events();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DFeature <em>DFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFeature</em>'.
	 * @see com.mimacom.ddd.dm.base.DFeature
	 * @generated
	 */
	EClass getDFeature();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DAssociation <em>DAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAssociation</em>'.
	 * @see com.mimacom.ddd.dm.base.DAssociation
	 * @generated
	 */
	EClass getDAssociation();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DAssociation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.mimacom.ddd.dm.base.DAssociation#getKind()
	 * @see #getDAssociation()
	 * @generated
	 */
	EAttribute getDAssociation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DAssociation#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see com.mimacom.ddd.dm.base.DAssociation#isDerived()
	 * @see #getDAssociation()
	 * @generated
	 */
	EAttribute getDAssociation_Derived();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DAssociation#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DAssociation#getSourceType()
	 * @see #getDAssociation()
	 * @generated
	 */
	EReference getDAssociation_SourceType();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.dm.base.DAssociation#getTargetType() <em>Get Target Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Type</em>' operation.
	 * @see com.mimacom.ddd.dm.base.DAssociation#getTargetType()
	 * @generated
	 */
	EOperation getDAssociation__GetTargetType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DAttribute <em>DAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAttribute</em>'.
	 * @see com.mimacom.ddd.dm.base.DAttribute
	 * @generated
	 */
	EClass getDAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DAttribute#isDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see com.mimacom.ddd.dm.base.DAttribute#isDetail()
	 * @see #getDAttribute()
	 * @generated
	 */
	EAttribute getDAttribute_Detail();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DAttribute#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.mimacom.ddd.dm.base.DAttribute#isKey()
	 * @see #getDAttribute()
	 * @generated
	 */
	EAttribute getDAttribute_Key();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DQuery <em>DQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DQuery</em>'.
	 * @see com.mimacom.ddd.dm.base.DQuery
	 * @generated
	 */
	EClass getDQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.mimacom.ddd.dm.base.DQuery#getParameters()
	 * @see #getDQuery()
	 * @generated
	 */
	EReference getDQuery_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DQuery#getReturns <em>Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returns</em>'.
	 * @see com.mimacom.ddd.dm.base.DQuery#getReturns()
	 * @see #getDQuery()
	 * @generated
	 */
	EReference getDQuery_Returns();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DQueryParameter <em>DQuery Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DQuery Parameter</em>'.
	 * @see com.mimacom.ddd.dm.base.DQueryParameter
	 * @generated
	 */
	EClass getDQueryParameter();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DState <em>DState</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DState</em>'.
	 * @see com.mimacom.ddd.dm.base.DState
	 * @generated
	 */
	EClass getDState();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DStateEvent <em>DState Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DState Event</em>'.
	 * @see com.mimacom.ddd.dm.base.DStateEvent
	 * @generated
	 */
	EClass getDStateEvent();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.base.DMultiplicityShorthand <em>DMultiplicity Shorthand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DMultiplicity Shorthand</em>'.
	 * @see com.mimacom.ddd.dm.base.DMultiplicityShorthand
	 * @generated
	 */
	EEnum getDMultiplicityShorthand();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.base.DEntityOrigin <em>DEntity Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DEntity Origin</em>'.
	 * @see com.mimacom.ddd.dm.base.DEntityOrigin
	 * @generated
	 */
	EEnum getDEntityOrigin();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.base.DAssociationKind <em>DAssociation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DAssociation Kind</em>'.
	 * @see com.mimacom.ddd.dm.base.DAssociationKind
	 * @generated
	 */
	EEnum getDAssociationKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DNamedElementImpl <em>DNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DNamedElementImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNamedElement()
		 * @generated
		 */
		EClass DNAMED_ELEMENT = eINSTANCE.getDNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNAMED_ELEMENT__NAME = eINSTANCE.getDNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNAMED_ELEMENT__ALIASES = eINSTANCE.getDNamedElement_Aliases();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAMED_ELEMENT__DESCRIPTION = eINSTANCE.getDNamedElement_Description();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DImportImpl <em>DImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DImportImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDImport()
		 * @generated
		 */
		EClass DIMPORT = eINSTANCE.getDImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMPORT__IMPORTED_NAMESPACE = eINSTANCE.getDImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DNamespaceImpl <em>DNamespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DNamespaceImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNamespace()
		 * @generated
		 */
		EClass DNAMESPACE = eINSTANCE.getDNamespace();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAMESPACE__IMPORTS = eINSTANCE.getDNamespace_Imports();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAMESPACE__MODEL = eINSTANCE.getDNamespace_Model();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DModelImpl <em>DModel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DModelImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDModel()
		 * @generated
		 */
		EClass DMODEL = eINSTANCE.getDModel();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IDiagramRoot <em>IDiagram Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IDiagramRoot
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIDiagramRoot()
		 * @generated
		 */
		EClass IDIAGRAM_ROOT = eINSTANCE.getIDiagramRoot();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IStaticReferenceTarget <em>IStatic Reference Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IStaticReferenceTarget
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIStaticReferenceTarget()
		 * @generated
		 */
		EClass ISTATIC_REFERENCE_TARGET = eINSTANCE.getIStaticReferenceTarget();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IRichTextSegment <em>IRich Text Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IRichTextSegment
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIRichTextSegment()
		 * @generated
		 */
		EClass IRICH_TEXT_SEGMENT = eINSTANCE.getIRichTextSegment();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DTextSegmentImpl <em>DText Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DTextSegmentImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDTextSegment()
		 * @generated
		 */
		EClass DTEXT_SEGMENT = eINSTANCE.getDTextSegment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTEXT_SEGMENT__VALUE = eINSTANCE.getDTextSegment_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DExpressionImpl <em>DExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DExpressionImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDExpression()
		 * @generated
		 */
		EClass DEXPRESSION = eINSTANCE.getDExpression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DRichTextImpl <em>DRich Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DRichTextImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDRichText()
		 * @generated
		 */
		EClass DRICH_TEXT = eINSTANCE.getDRichText();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRICH_TEXT__SEGMENTS = eINSTANCE.getDRichText_Segments();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IDeductionDefinition <em>IDeduction Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IDeductionDefinition
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIDeductionDefinition()
		 * @generated
		 */
		EClass IDEDUCTION_DEFINITION = eINSTANCE.getIDeductionDefinition();

		/**
		 * The meta object literal for the '<em><b>Deduction Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDEDUCTION_DEFINITION__DEDUCTION_RULE = eINSTANCE.getIDeductionDefinition_DeductionRule();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IDeducibleElement <em>IDeducible Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IDeducibleElement
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIDeducibleElement()
		 * @generated
		 */
		EClass IDEDUCIBLE_ELEMENT = eINSTANCE.getIDeducibleElement();

		/**
		 * The meta object literal for the '<em><b>Deduced From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDEDUCIBLE_ELEMENT__DEDUCED_FROM = eINSTANCE.getIDeducibleElement_DeducedFrom();

		/**
		 * The meta object literal for the '<em><b>Synthetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDEDUCIBLE_ELEMENT__SYNTHETIC = eINSTANCE.getIDeducibleElement_Synthetic();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DDeductionRuleImpl <em>DDeduction Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DDeductionRuleImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDeductionRule()
		 * @generated
		 */
		EClass DDEDUCTION_RULE = eINSTANCE.getDDeductionRule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDEDUCTION_RULE__SOURCE = eINSTANCE.getDDeductionRule_Source();

		/**
		 * The meta object literal for the '<em><b>Named Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDEDUCTION_RULE__NAMED_SOURCE = eINSTANCE.getDDeductionRule_NamedSource();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DInformationModelImpl <em>DInformation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DInformationModelImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDInformationModel()
		 * @generated
		 */
		EClass DINFORMATION_MODEL = eINSTANCE.getDInformationModel();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IAggregateContainer <em>IAggregate Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IAggregateContainer
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIAggregateContainer()
		 * @generated
		 */
		EClass IAGGREGATE_CONTAINER = eINSTANCE.getIAggregateContainer();

		/**
		 * The meta object literal for the '<em><b>Aggregates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IAGGREGATE_CONTAINER__AGGREGATES = eINSTANCE.getIAggregateContainer_Aggregates();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.ITypeContainer <em>IType Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.ITypeContainer
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getITypeContainer()
		 * @generated
		 */
		EClass ITYPE_CONTAINER = eINSTANCE.getITypeContainer();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITYPE_CONTAINER__TYPES = eINSTANCE.getITypeContainer_Types();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IFeatureContainer <em>IFeature Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IFeatureContainer
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIFeatureContainer()
		 * @generated
		 */
		EClass IFEATURE_CONTAINER = eINSTANCE.getIFeatureContainer();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFEATURE_CONTAINER__FEATURES = eINSTANCE.getIFeatureContainer_Features();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl <em>DAggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DAggregateImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAggregate()
		 * @generated
		 */
		EClass DAGGREGATE = eINSTANCE.getDAggregate();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAGGREGATE__ROOTS = eINSTANCE.getDAggregate_Roots();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DNavigableMemberImpl <em>DNavigable Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DNavigableMemberImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNavigableMember()
		 * @generated
		 */
		EClass DNAVIGABLE_MEMBER = eINSTANCE.getDNavigableMember();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAVIGABLE_MEMBER__TYPE = eINSTANCE.getDNavigableMember_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAVIGABLE_MEMBER__MULTIPLICITY = eINSTANCE.getDNavigableMember_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNAVIGABLE_MEMBER__OPTIONAL = eINSTANCE.getDNavigableMember_Optional();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNAVIGABLE_MEMBER__COLLECTION = eINSTANCE.getDNavigableMember_Collection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.INavigableMemberContainer <em>INavigable Member Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.INavigableMemberContainer
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getINavigableMemberContainer()
		 * @generated
		 */
		EClass INAVIGABLE_MEMBER_CONTAINER = eINSTANCE.getINavigableMemberContainer();

		/**
		 * The meta object literal for the '<em><b>Navigable Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS = eINSTANCE.getINavigableMemberContainer_NavigableMembers();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DContextImpl <em>DContext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DContextImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDContext()
		 * @generated
		 */
		EClass DCONTEXT = eINSTANCE.getDContext();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DMultiplicityImpl <em>DMultiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DMultiplicityImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDMultiplicity()
		 * @generated
		 */
		EClass DMULTIPLICITY = eINSTANCE.getDMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMULTIPLICITY__MIN_OCCURS = eINSTANCE.getDMultiplicity_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMULTIPLICITY__MAX_OCCURS = eINSTANCE.getDMultiplicity_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Shorthand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMULTIPLICITY__SHORTHAND = eINSTANCE.getDMultiplicity_Shorthand();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IIdentityType <em>IIdentity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IIdentityType
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIIdentityType()
		 * @generated
		 */
		EClass IIDENTITY_TYPE = eINSTANCE.getIIdentityType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IValueType <em>IValue Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IValueType
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIValueType()
		 * @generated
		 */
		EClass IVALUE_TYPE = eINSTANCE.getIValueType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DTypeImpl <em>DType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DTypeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDType()
		 * @generated
		 */
		EClass DTYPE = eINSTANCE.getDType();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTYPE__CONSTRAINTS = eINSTANCE.getDType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTYPE__PRIMITIVE = eINSTANCE.getDType_Primitive();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DNamedPredicateImpl <em>DNamed Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DNamedPredicateImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNamedPredicate()
		 * @generated
		 */
		EClass DNAMED_PREDICATE = eINSTANCE.getDNamedPredicate();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAMED_PREDICATE__PREDICATE = eINSTANCE.getDNamedPredicate_Predicate();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DSimpleTypeImpl <em>DSimple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DSimpleTypeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDSimpleType()
		 * @generated
		 */
		EClass DSIMPLE_TYPE = eINSTANCE.getDSimpleType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DPrimitiveImpl <em>DPrimitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DPrimitiveImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDPrimitive()
		 * @generated
		 */
		EClass DPRIMITIVE = eINSTANCE.getDPrimitive();

		/**
		 * The meta object literal for the '<em><b>Redefines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPRIMITIVE__REDEFINES = eINSTANCE.getDPrimitive_Redefines();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DEnumerationImpl <em>DEnumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DEnumerationImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDEnumeration()
		 * @generated
		 */
		EClass DENUMERATION = eINSTANCE.getDEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENUMERATION__LITERALS = eINSTANCE.getDEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DLiteralImpl <em>DLiteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DLiteralImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDLiteral()
		 * @generated
		 */
		EClass DLITERAL = eINSTANCE.getDLiteral();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DComplexTypeImpl <em>DComplex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DComplexTypeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDComplexType()
		 * @generated
		 */
		EClass DCOMPLEX_TYPE = eINSTANCE.getDComplexType();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCOMPLEX_TYPE__ABSTRACT = eINSTANCE.getDComplexType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCOMPLEX_TYPE__SUPER_TYPE = eINSTANCE.getDComplexType_SuperType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DDetailTypeImpl <em>DDetail Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DDetailTypeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDetailType()
		 * @generated
		 */
		EClass DDETAIL_TYPE = eINSTANCE.getDDetailType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DEntityTypeImpl <em>DEntity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DEntityTypeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDEntityType()
		 * @generated
		 */
		EClass DENTITY_TYPE = eINSTANCE.getDEntityType();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENTITY_TYPE__ROOT = eINSTANCE.getDEntityType_Root();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENTITY_TYPE__ORIGIN = eINSTANCE.getDEntityType_Origin();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENTITY_TYPE__STATES = eINSTANCE.getDEntityType_States();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENTITY_TYPE__EVENTS = eINSTANCE.getDEntityType_Events();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DFeatureImpl <em>DFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DFeatureImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDFeature()
		 * @generated
		 */
		EClass DFEATURE = eINSTANCE.getDFeature();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DAssociationImpl <em>DAssociation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DAssociationImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAssociation()
		 * @generated
		 */
		EClass DASSOCIATION = eINSTANCE.getDAssociation();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASSOCIATION__KIND = eINSTANCE.getDAssociation_Kind();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASSOCIATION__DERIVED = eINSTANCE.getDAssociation_Derived();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASSOCIATION__SOURCE_TYPE = eINSTANCE.getDAssociation_SourceType();

		/**
		 * The meta object literal for the '<em><b>Get Target Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DASSOCIATION___GET_TARGET_TYPE = eINSTANCE.getDAssociation__GetTargetType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DAttributeImpl <em>DAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DAttributeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAttribute()
		 * @generated
		 */
		EClass DATTRIBUTE = eINSTANCE.getDAttribute();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATTRIBUTE__DETAIL = eINSTANCE.getDAttribute_Detail();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATTRIBUTE__KEY = eINSTANCE.getDAttribute_Key();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DQueryImpl <em>DQuery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DQueryImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDQuery()
		 * @generated
		 */
		EClass DQUERY = eINSTANCE.getDQuery();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DQUERY__PARAMETERS = eINSTANCE.getDQuery_Parameters();

		/**
		 * The meta object literal for the '<em><b>Returns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DQUERY__RETURNS = eINSTANCE.getDQuery_Returns();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DQueryParameterImpl <em>DQuery Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DQueryParameterImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDQueryParameter()
		 * @generated
		 */
		EClass DQUERY_PARAMETER = eINSTANCE.getDQueryParameter();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DStateImpl <em>DState</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DStateImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDState()
		 * @generated
		 */
		EClass DSTATE = eINSTANCE.getDState();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DStateEventImpl <em>DState Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DStateEventImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDStateEvent()
		 * @generated
		 */
		EClass DSTATE_EVENT = eINSTANCE.getDStateEvent();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.DMultiplicityShorthand <em>DMultiplicity Shorthand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.DMultiplicityShorthand
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDMultiplicityShorthand()
		 * @generated
		 */
		EEnum DMULTIPLICITY_SHORTHAND = eINSTANCE.getDMultiplicityShorthand();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.DEntityOrigin <em>DEntity Origin</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.DEntityOrigin
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDEntityOrigin()
		 * @generated
		 */
		EEnum DENTITY_ORIGIN = eINSTANCE.getDEntityOrigin();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.DAssociationKind <em>DAssociation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.DAssociationKind
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAssociationKind()
		 * @generated
		 */
		EEnum DASSOCIATION_KIND = eINSTANCE.getDAssociationKind();

	}

} //BasePackage
