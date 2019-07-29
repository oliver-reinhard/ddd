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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.INamespace <em>INamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.INamespace
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getINamespace()
	 * @generated
	 */
	int INAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>INamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMESPACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>INamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.ITypeContainer <em>IType Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.ITypeContainer
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getITypeContainer()
	 * @generated
	 */
	int ITYPE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_CONTAINER__TYPES = INAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IType Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_CONTAINER_FEATURE_COUNT = INAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IType Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_CONTAINER_OPERATION_COUNT = INAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IDeductionDefinition <em>IDeduction Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IDeductionDefinition
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIDeductionDefinition()
	 * @generated
	 */
	int IDEDUCTION_DEFINITION = 2;

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
	int IDEDUCIBLE_ELEMENT = 3;

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
	int DDEDUCTION_RULE = 4;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNamedElementImpl <em>DNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNamedElementImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNamedElement()
	 * @generated
	 */
	int DNAMED_ELEMENT = 5;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNavigableMemberImpl <em>DNavigable Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNavigableMemberImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNavigableMember()
	 * @generated
	 */
	int DNAVIGABLE_MEMBER = 6;

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
	int INAVIGABLE_MEMBER_CONTAINER = 7;

	/**
	 * The number of structural features of the '<em>INavigable Member Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT = INAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>INavigable Member Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAVIGABLE_MEMBER_CONTAINER_OPERATION_COUNT = INAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IStaticReferenceTarget <em>IStatic Reference Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IStaticReferenceTarget
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIStaticReferenceTarget()
	 * @generated
	 */
	int ISTATIC_REFERENCE_TARGET = 8;

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
	int IRICH_TEXT_SEGMENT = 9;

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
	int DTEXT_SEGMENT = 10;

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
	int DEXPRESSION = 11;

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
	int DRICH_TEXT = 12;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DImportImpl <em>DImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DImportImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDImport()
	 * @generated
	 */
	int DIMPORT = 13;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DDomainImpl <em>DDomain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DDomainImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDomain()
	 * @generated
	 */
	int DDOMAIN = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__TYPES = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__DEDUCED_FROM = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__SYNTHETIC = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__IMPORTS = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__AGGREGATES = DNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__STATE_MODELS = DNAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__APPLICATIONS = DNAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__EVENTS = DNAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__ACTORS = DNAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>DDomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>DDomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl <em>DAggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DAggregateImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAggregate()
	 * @generated
	 */
	int DAGGREGATE = 15;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__TYPES = ITYPE_CONTAINER__TYPES;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__DEDUCED_FROM = ITYPE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__SYNTHETIC = ITYPE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__DESCRIPTION = ITYPE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__ROOTS = ITYPE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Derived Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__DERIVED_NAME = ITYPE_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>DAggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE_FEATURE_COUNT = ITYPE_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>DAggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE_OPERATION_COUNT = ITYPE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IIdentityType <em>IIdentity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IIdentityType
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIIdentityType()
	 * @generated
	 */
	int IIDENTITY_TYPE = 16;

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
	int IVALUE_TYPE = 17;

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
	int DTYPE = 18;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DConditionImpl <em>DCondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DConditionImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDCondition()
	 * @generated
	 */
	int DCONDITION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONDITION__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONDITION__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONDITION__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONDITION__CONDITION = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONDITION_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONDITION_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DSimpleTypeImpl <em>DSimple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DSimpleTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDSimpleType()
	 * @generated
	 */
	int DSIMPLE_TYPE = 20;

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
	int DPRIMITIVE = 21;

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
	int DENUMERATION = 22;

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
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__LITERALS = DSIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION_FEATURE_COUNT = DSIMPLE_TYPE_FEATURE_COUNT + 1;

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
	int DLITERAL = 23;

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
	int DCOMPLEX_TYPE = 24;

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
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__ABSTRACT = DTYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__SUPER_TYPE = DTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__FEATURES = DTYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DComplex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE_FEATURE_COUNT = DTYPE_FEATURE_COUNT + 3;

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
	int DDETAIL_TYPE = 25;

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
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__FEATURES = DCOMPLEX_TYPE__FEATURES;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DIdentityTypeImpl <em>DIdentity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DIdentityTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDIdentityType()
	 * @generated
	 */
	int DIDENTITY_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__NAME = DCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__ALIASES = DCOMPLEX_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__DESCRIPTION = DCOMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__DEDUCED_FROM = DCOMPLEX_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__SYNTHETIC = DCOMPLEX_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__CONSTRAINTS = DCOMPLEX_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__PRIMITIVE = DCOMPLEX_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__ABSTRACT = DCOMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__SUPER_TYPE = DCOMPLEX_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__FEATURES = DCOMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__ROOT = DCOMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DIdentity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE_FEATURE_COUNT = DCOMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DIdentity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE_OPERATION_COUNT = DCOMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IIdentityStateModel <em>IIdentity State Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IIdentityStateModel
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIIdentityStateModel()
	 * @generated
	 */
	int IIDENTITY_STATE_MODEL = 27;

	/**
	 * The feature id for the '<em><b>For Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTITY_STATE_MODEL__FOR_TYPE = 0;

	/**
	 * The number of structural features of the '<em>IIdentity State Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTITY_STATE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IIdentity State Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IIDENTITY_STATE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DEntityTypeImpl <em>DEntity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DEntityTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDEntityType()
	 * @generated
	 */
	int DENTITY_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__NAME = DIDENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__ALIASES = DIDENTITY_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__DESCRIPTION = DIDENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__DEDUCED_FROM = DIDENTITY_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__SYNTHETIC = DIDENTITY_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__CONSTRAINTS = DIDENTITY_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__PRIMITIVE = DIDENTITY_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__ABSTRACT = DIDENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__SUPER_TYPE = DIDENTITY_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__FEATURES = DIDENTITY_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE__ROOT = DIDENTITY_TYPE__ROOT;

	/**
	 * The number of structural features of the '<em>DEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE_FEATURE_COUNT = DIDENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENTITY_TYPE_OPERATION_COUNT = DIDENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DRelationshipImpl <em>DRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DRelationshipImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDRelationship()
	 * @generated
	 */
	int DRELATIONSHIP = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__NAME = DIDENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__ALIASES = DIDENTITY_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__DESCRIPTION = DIDENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__DEDUCED_FROM = DIDENTITY_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__SYNTHETIC = DIDENTITY_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__CONSTRAINTS = DIDENTITY_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__PRIMITIVE = DIDENTITY_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__ABSTRACT = DIDENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__SUPER_TYPE = DIDENTITY_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__FEATURES = DIDENTITY_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__ROOT = DIDENTITY_TYPE__ROOT;

	/**
	 * The number of structural features of the '<em>DRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP_FEATURE_COUNT = DIDENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP_OPERATION_COUNT = DIDENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DFeatureImpl <em>DFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DFeatureImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDFeature()
	 * @generated
	 */
	int DFEATURE = 30;

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
	int DASSOCIATION = 31;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DMultiplicityImpl <em>DMultiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DMultiplicityImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDMultiplicity()
	 * @generated
	 */
	int DMULTIPLICITY = 32;

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
	 * The number of structural features of the '<em>DMultiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMULTIPLICITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DMultiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DAttributeImpl <em>DAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DAttributeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAttribute()
	 * @generated
	 */
	int DATTRIBUTE = 33;

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
	int DQUERY = 34;

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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__PARAMETERS = DFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__RETURNS = DFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_FEATURE_COUNT = DFEATURE_FEATURE_COUNT + 2;

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
	int DQUERY_PARAMETER = 35;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DDomainEventImpl <em>DDomain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DDomainEventImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDomainEvent()
	 * @generated
	 */
	int DDOMAIN_EVENT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Before</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__BEFORE = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__AFTER = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__TRIGGER = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__NOTIFICATIONS = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__CONTEXT = DNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>DDomain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>DDomain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DContextImpl <em>DContext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DContextImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDContext()
	 * @generated
	 */
	int DCONTEXT = 37;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNotificationImpl <em>DNotification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNotificationImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNotification()
	 * @generated
	 */
	int DNOTIFICATION = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__NAME = DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__ALIASES = DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__DESCRIPTION = DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__TYPE = DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__MULTIPLICITY = DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__OPTIONAL = DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__COLLECTION = DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Notified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__NOTIFIED = DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DNotification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION_FEATURE_COUNT = DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DNotification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION_OPERATION_COUNT = DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DActorImpl <em>DActor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DActorImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDActor()
	 * @generated
	 */
	int DACTOR = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>DActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DHumanImpl <em>DHuman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DHumanImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDHuman()
	 * @generated
	 */
	int DHUMAN = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN__NAME = DACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN__ALIASES = DACTOR__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN__DESCRIPTION = DACTOR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>DHuman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_FEATURE_COUNT = DACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DHuman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_OPERATION_COUNT = DACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DServiceImpl <em>DService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DServiceImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDService()
	 * @generated
	 */
	int DSERVICE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__NAME = DACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__ALIASES = DACTOR__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__DESCRIPTION = DACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__TYPES = DACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__KIND = DACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__PARAMETERS = DACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Raises</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__RAISES = DACTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__GUARDS = DACTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__EFFECTS = DACTOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>DService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_FEATURE_COUNT = DACTOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>DService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_OPERATION_COUNT = DACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DServiceParameterImpl <em>DService Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DServiceParameterImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDServiceParameter()
	 * @generated
	 */
	int DSERVICE_PARAMETER = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__NAME = DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__ALIASES = DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__DESCRIPTION = DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__TYPE = DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__MULTIPLICITY = DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__OPTIONAL = DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__COLLECTION = DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__DIRECTION = DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DService Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER_FEATURE_COUNT = DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DService Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER_OPERATION_COUNT = DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DTimeImpl <em>DTime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DTimeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDTime()
	 * @generated
	 */
	int DTIME = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTIME__NAME = DACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTIME__ALIASES = DACTOR__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTIME__DESCRIPTION = DACTOR__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>DTime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTIME_FEATURE_COUNT = DACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DTime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTIME_OPERATION_COUNT = DACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DExistingApplicationImpl <em>DExisting Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DExistingApplicationImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDExistingApplication()
	 * @generated
	 */
	int DEXISTING_APPLICATION = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION__TYPES = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION__SERVICES = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION__EXCEPTIONS = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DExisting Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DExisting Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DExceptionImpl <em>DException</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DExceptionImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDException()
	 * @generated
	 */
	int DEXCEPTION = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXCEPTION__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXCEPTION__ALIASES = DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXCEPTION__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>DException</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXCEPTION_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DException</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXCEPTION_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.DAssociationKind <em>DAssociation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.DAssociationKind
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAssociationKind()
	 * @generated
	 */
	int DASSOCIATION_KIND = 46;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.DDirection <em>DDirection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.DDirection
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDirection()
	 * @generated
	 */
	int DDIRECTION = 47;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.DServiceKind <em>DService Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.DServiceKind
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDServiceKind()
	 * @generated
	 */
	int DSERVICE_KIND = 48;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.INamespace <em>INamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INamespace</em>'.
	 * @see com.mimacom.ddd.dm.base.INamespace
	 * @generated
	 */
	EClass getINamespace();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DDomain <em>DDomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDomain</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain
	 * @generated
	 */
	EClass getDDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomain#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain#getImports()
	 * @see #getDDomain()
	 * @generated
	 */
	EReference getDDomain_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomain#getAggregates <em>Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregates</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain#getAggregates()
	 * @see #getDDomain()
	 * @generated
	 */
	EReference getDDomain_Aggregates();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomain#getStateModels <em>State Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Models</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain#getStateModels()
	 * @see #getDDomain()
	 * @generated
	 */
	EReference getDDomain_StateModels();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomain#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain#getApplications()
	 * @see #getDDomain()
	 * @generated
	 */
	EReference getDDomain_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomain#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain#getEvents()
	 * @see #getDDomain()
	 * @generated
	 */
	EReference getDDomain_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomain#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain#getActors()
	 * @see #getDDomain()
	 * @generated
	 */
	EReference getDDomain_Actors();

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
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DAggregate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see com.mimacom.ddd.dm.base.DAggregate#getDescription()
	 * @see #getDAggregate()
	 * @generated
	 */
	EReference getDAggregate_Description();

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
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DAggregate#getDerivedName <em>Derived Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Name</em>'.
	 * @see com.mimacom.ddd.dm.base.DAggregate#getDerivedName()
	 * @see #getDAggregate()
	 * @generated
	 */
	EAttribute getDAggregate_DerivedName();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DCondition <em>DCondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCondition</em>'.
	 * @see com.mimacom.ddd.dm.base.DCondition
	 * @generated
	 */
	EClass getDCondition();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.mimacom.ddd.dm.base.DCondition#getCondition()
	 * @see #getDCondition()
	 * @generated
	 */
	EReference getDCondition_Condition();

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
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DComplexType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.mimacom.ddd.dm.base.DComplexType#getFeatures()
	 * @see #getDComplexType()
	 * @generated
	 */
	EReference getDComplexType_Features();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DIdentityType <em>DIdentity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIdentity Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DIdentityType
	 * @generated
	 */
	EClass getDIdentityType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DIdentityType#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see com.mimacom.ddd.dm.base.DIdentityType#isRoot()
	 * @see #getDIdentityType()
	 * @generated
	 */
	EAttribute getDIdentityType_Root();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IIdentityStateModel <em>IIdentity State Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IIdentity State Model</em>'.
	 * @see com.mimacom.ddd.dm.base.IIdentityStateModel
	 * @generated
	 */
	EClass getIIdentityStateModel();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.IIdentityStateModel#getForType <em>For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Type</em>'.
	 * @see com.mimacom.ddd.dm.base.IIdentityStateModel#getForType()
	 * @see #getIIdentityStateModel()
	 * @generated
	 */
	EReference getIIdentityStateModel_ForType();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DRelationship <em>DRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRelationship</em>'.
	 * @see com.mimacom.ddd.dm.base.DRelationship
	 * @generated
	 */
	EClass getDRelationship();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DDomainEvent <em>DDomain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDomain Event</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomainEvent
	 * @generated
	 */
	EClass getDDomainEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomainEvent#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Before</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomainEvent#getBefore()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_Before();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomainEvent#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>After</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomainEvent#getAfter()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_After();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DDomainEvent#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomainEvent#getTrigger()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomainEvent#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifications</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomainEvent#getNotifications()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_Notifications();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomainEvent#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomainEvent#getContext()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_Context();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DNotification <em>DNotification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNotification</em>'.
	 * @see com.mimacom.ddd.dm.base.DNotification
	 * @generated
	 */
	EClass getDNotification();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DNotification#getNotified <em>Notified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notified</em>'.
	 * @see com.mimacom.ddd.dm.base.DNotification#getNotified()
	 * @see #getDNotification()
	 * @generated
	 */
	EReference getDNotification_Notified();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DActor <em>DActor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DActor</em>'.
	 * @see com.mimacom.ddd.dm.base.DActor
	 * @generated
	 */
	EClass getDActor();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DHuman <em>DHuman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DHuman</em>'.
	 * @see com.mimacom.ddd.dm.base.DHuman
	 * @generated
	 */
	EClass getDHuman();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DService <em>DService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DService</em>'.
	 * @see com.mimacom.ddd.dm.base.DService
	 * @generated
	 */
	EClass getDService();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DService#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.mimacom.ddd.dm.base.DService#getKind()
	 * @see #getDService()
	 * @generated
	 */
	EAttribute getDService_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DService#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.mimacom.ddd.dm.base.DService#getParameters()
	 * @see #getDService()
	 * @generated
	 */
	EReference getDService_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.dm.base.DService#getRaises <em>Raises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Raises</em>'.
	 * @see com.mimacom.ddd.dm.base.DService#getRaises()
	 * @see #getDService()
	 * @generated
	 */
	EReference getDService_Raises();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DService#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see com.mimacom.ddd.dm.base.DService#getGuards()
	 * @see #getDService()
	 * @generated
	 */
	EReference getDService_Guards();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DService#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see com.mimacom.ddd.dm.base.DService#getEffects()
	 * @see #getDService()
	 * @generated
	 */
	EReference getDService_Effects();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DServiceParameter <em>DService Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DService Parameter</em>'.
	 * @see com.mimacom.ddd.dm.base.DServiceParameter
	 * @generated
	 */
	EClass getDServiceParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DServiceParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.mimacom.ddd.dm.base.DServiceParameter#getDirection()
	 * @see #getDServiceParameter()
	 * @generated
	 */
	EAttribute getDServiceParameter_Direction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DTime <em>DTime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTime</em>'.
	 * @see com.mimacom.ddd.dm.base.DTime
	 * @generated
	 */
	EClass getDTime();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DExistingApplication <em>DExisting Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DExisting Application</em>'.
	 * @see com.mimacom.ddd.dm.base.DExistingApplication
	 * @generated
	 */
	EClass getDExistingApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DExistingApplication#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see com.mimacom.ddd.dm.base.DExistingApplication#getServices()
	 * @see #getDExistingApplication()
	 * @generated
	 */
	EReference getDExistingApplication_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DExistingApplication#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see com.mimacom.ddd.dm.base.DExistingApplication#getExceptions()
	 * @see #getDExistingApplication()
	 * @generated
	 */
	EReference getDExistingApplication_Exceptions();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DException <em>DException</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DException</em>'.
	 * @see com.mimacom.ddd.dm.base.DException
	 * @generated
	 */
	EClass getDException();

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
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.base.DDirection <em>DDirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DDirection</em>'.
	 * @see com.mimacom.ddd.dm.base.DDirection
	 * @generated
	 */
	EEnum getDDirection();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.base.DServiceKind <em>DService Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DService Kind</em>'.
	 * @see com.mimacom.ddd.dm.base.DServiceKind
	 * @generated
	 */
	EEnum getDServiceKind();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.INamespace <em>INamespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.INamespace
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getINamespace()
		 * @generated
		 */
		EClass INAMESPACE = eINSTANCE.getINamespace();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DDomainImpl <em>DDomain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DDomainImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDomain()
		 * @generated
		 */
		EClass DDOMAIN = eINSTANCE.getDDomain();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__IMPORTS = eINSTANCE.getDDomain_Imports();

		/**
		 * The meta object literal for the '<em><b>Aggregates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__AGGREGATES = eINSTANCE.getDDomain_Aggregates();

		/**
		 * The meta object literal for the '<em><b>State Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__STATE_MODELS = eINSTANCE.getDDomain_StateModels();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__APPLICATIONS = eINSTANCE.getDDomain_Applications();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__EVENTS = eINSTANCE.getDDomain_Events();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__ACTORS = eINSTANCE.getDDomain_Actors();

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
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAGGREGATE__DESCRIPTION = eINSTANCE.getDAggregate_Description();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAGGREGATE__ROOTS = eINSTANCE.getDAggregate_Roots();

		/**
		 * The meta object literal for the '<em><b>Derived Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAGGREGATE__DERIVED_NAME = eINSTANCE.getDAggregate_DerivedName();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DConditionImpl <em>DCondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DConditionImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDCondition()
		 * @generated
		 */
		EClass DCONDITION = eINSTANCE.getDCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONDITION__CONDITION = eINSTANCE.getDCondition_Condition();

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
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCOMPLEX_TYPE__FEATURES = eINSTANCE.getDComplexType_Features();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DIdentityTypeImpl <em>DIdentity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DIdentityTypeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDIdentityType()
		 * @generated
		 */
		EClass DIDENTITY_TYPE = eINSTANCE.getDIdentityType();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIDENTITY_TYPE__ROOT = eINSTANCE.getDIdentityType_Root();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IIdentityStateModel <em>IIdentity State Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IIdentityStateModel
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIIdentityStateModel()
		 * @generated
		 */
		EClass IIDENTITY_STATE_MODEL = eINSTANCE.getIIdentityStateModel();

		/**
		 * The meta object literal for the '<em><b>For Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IIDENTITY_STATE_MODEL__FOR_TYPE = eINSTANCE.getIIdentityStateModel_ForType();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DRelationshipImpl <em>DRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DRelationshipImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDRelationship()
		 * @generated
		 */
		EClass DRELATIONSHIP = eINSTANCE.getDRelationship();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DDomainEventImpl <em>DDomain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DDomainEventImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDomainEvent()
		 * @generated
		 */
		EClass DDOMAIN_EVENT = eINSTANCE.getDDomainEvent();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__BEFORE = eINSTANCE.getDDomainEvent_Before();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__AFTER = eINSTANCE.getDDomainEvent_After();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__TRIGGER = eINSTANCE.getDDomainEvent_Trigger();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__NOTIFICATIONS = eINSTANCE.getDDomainEvent_Notifications();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__CONTEXT = eINSTANCE.getDDomainEvent_Context();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DNotificationImpl <em>DNotification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DNotificationImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNotification()
		 * @generated
		 */
		EClass DNOTIFICATION = eINSTANCE.getDNotification();

		/**
		 * The meta object literal for the '<em><b>Notified</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNOTIFICATION__NOTIFIED = eINSTANCE.getDNotification_Notified();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DActorImpl <em>DActor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DActorImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDActor()
		 * @generated
		 */
		EClass DACTOR = eINSTANCE.getDActor();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DHumanImpl <em>DHuman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DHumanImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDHuman()
		 * @generated
		 */
		EClass DHUMAN = eINSTANCE.getDHuman();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DServiceImpl <em>DService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DServiceImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDService()
		 * @generated
		 */
		EClass DSERVICE = eINSTANCE.getDService();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSERVICE__KIND = eINSTANCE.getDService_Kind();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSERVICE__PARAMETERS = eINSTANCE.getDService_Parameters();

		/**
		 * The meta object literal for the '<em><b>Raises</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSERVICE__RAISES = eINSTANCE.getDService_Raises();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSERVICE__GUARDS = eINSTANCE.getDService_Guards();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSERVICE__EFFECTS = eINSTANCE.getDService_Effects();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DServiceParameterImpl <em>DService Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DServiceParameterImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDServiceParameter()
		 * @generated
		 */
		EClass DSERVICE_PARAMETER = eINSTANCE.getDServiceParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSERVICE_PARAMETER__DIRECTION = eINSTANCE.getDServiceParameter_Direction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DTimeImpl <em>DTime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DTimeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDTime()
		 * @generated
		 */
		EClass DTIME = eINSTANCE.getDTime();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DExistingApplicationImpl <em>DExisting Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DExistingApplicationImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDExistingApplication()
		 * @generated
		 */
		EClass DEXISTING_APPLICATION = eINSTANCE.getDExistingApplication();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEXISTING_APPLICATION__SERVICES = eINSTANCE.getDExistingApplication_Services();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEXISTING_APPLICATION__EXCEPTIONS = eINSTANCE.getDExistingApplication_Exceptions();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DExceptionImpl <em>DException</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DExceptionImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDException()
		 * @generated
		 */
		EClass DEXCEPTION = eINSTANCE.getDException();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.DAssociationKind <em>DAssociation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.DAssociationKind
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAssociationKind()
		 * @generated
		 */
		EEnum DASSOCIATION_KIND = eINSTANCE.getDAssociationKind();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.DDirection <em>DDirection</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.DDirection
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDirection()
		 * @generated
		 */
		EEnum DDIRECTION = eINSTANCE.getDDirection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.DServiceKind <em>DService Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.DServiceKind
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDServiceKind()
		 * @generated
		 */
		EEnum DSERVICE_KIND = eINSTANCE.getDServiceKind();

	}

} //BasePackage