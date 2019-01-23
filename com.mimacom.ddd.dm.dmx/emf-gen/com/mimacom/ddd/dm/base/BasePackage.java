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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IIdentityType <em>IIdentity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IIdentityType
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIIdentityType()
	 * @generated
	 */
	int IIDENTITY_TYPE = 0;

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
	int IVALUE_TYPE = 1;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IRichTextElement <em>IRich Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IRichTextElement
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIRichTextElement()
	 * @generated
	 */
	int IRICH_TEXT_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>IRich Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRICH_TEXT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IRich Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRICH_TEXT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.INamespace <em>INamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.INamespace
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getINamespace()
	 * @generated
	 */
	int INAMESPACE = 3;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNamedElementImpl <em>DNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNamedElementImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNamedElement()
	 * @generated
	 */
	int DNAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>DNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DTypedMemberImpl <em>DTyped Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DTypedMemberImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDTypedMember()
	 * @generated
	 */
	int DTYPED_MEMBER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPED_MEMBER__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPED_MEMBER__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPED_MEMBER__TYPE = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPED_MEMBER__MULTIPLICITY = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPED_MEMBER__OPTIONAL = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPED_MEMBER__COLLECTION = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DTyped Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPED_MEMBER_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DTyped Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPED_MEMBER_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.ITypedMemberContainer <em>ITyped Member Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.ITypedMemberContainer
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getITypedMemberContainer()
	 * @generated
	 */
	int ITYPED_MEMBER_CONTAINER = 6;

	/**
	 * The number of structural features of the '<em>ITyped Member Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED_MEMBER_CONTAINER_FEATURE_COUNT = INAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ITyped Member Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED_MEMBER_CONTAINER_OPERATION_COUNT = INAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.IPrimaryNavigationTarget <em>IPrimary Navigation Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.IPrimaryNavigationTarget
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIPrimaryNavigationTarget()
	 * @generated
	 */
	int IPRIMARY_NAVIGATION_TARGET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRIMARY_NAVIGATION_TARGET__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRIMARY_NAVIGATION_TARGET__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>IPrimary Navigation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRIMARY_NAVIGATION_TARGET_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPrimary Navigation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPRIMARY_NAVIGATION_TARGET_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DRichTextImpl <em>DRich Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DRichTextImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDRichText()
	 * @generated
	 */
	int DRICH_TEXT = 8;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRICH_TEXT__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>DRich Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRICH_TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DRich Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRICH_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DTextImpl <em>DText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DTextImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDText()
	 * @generated
	 */
	int DTEXT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT__VALUE = IRICH_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_FEATURE_COUNT = IRICH_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTEXT_OPERATION_COUNT = IRICH_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DExpressionImpl <em>DExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DExpressionImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDExpression()
	 * @generated
	 */
	int DEXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>DExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXPRESSION_FEATURE_COUNT = IRICH_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXPRESSION_OPERATION_COUNT = IRICH_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DDomainImpl <em>DDomain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DDomainImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDomain()
	 * @generated
	 */
	int DDOMAIN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__IMPORTS = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__TYPES = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__FUNCTIONS = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__AGGREGATES = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__APPLICATIONS = DNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__EVENTS = DNAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN__ACTORS = DNAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>DDomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>DDomain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DImportImpl <em>DImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DImportImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDImport()
	 * @generated
	 */
	int DIMPORT = 12;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DFunctionImpl <em>DFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DFunctionImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDFunction()
	 * @generated
	 */
	int DFUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION__NAME = DTYPED_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION__DESCRIPTION = DTYPED_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION__TYPE = DTYPED_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION__MULTIPLICITY = DTYPED_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION__OPTIONAL = DTYPED_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION__COLLECTION = DTYPED_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION__PARAMETER_NAMES = DTYPED_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_FEATURE_COUNT = DTYPED_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_OPERATION_COUNT = DTYPED_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl <em>DAggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DAggregateImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAggregate()
	 * @generated
	 */
	int DAGGREGATE = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__ROOT = 2;

	/**
	 * The feature id for the '<em><b>Root Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE__ROOT_NAME = 3;

	/**
	 * The number of structural features of the '<em>DAggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DAggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAGGREGATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DTypeImpl <em>DType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDType()
	 * @generated
	 */
	int DTYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__CONSTRAINTS = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE__PRIMITIVE = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTYPE_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 2;

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
	int DCONDITION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONDITION__NAME = DNAMED_ELEMENT__NAME;

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
	int DSIMPLE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__NAME = DTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSIMPLE_TYPE__DESCRIPTION = DTYPE__DESCRIPTION;

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
	int DPRIMITIVE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__NAME = DSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPRIMITIVE__DESCRIPTION = DSIMPLE_TYPE__DESCRIPTION;

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
	int DENUMERATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__NAME = DSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENUMERATION__DESCRIPTION = DSIMPLE_TYPE__DESCRIPTION;

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
	int DLITERAL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__NAME = DTYPED_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__DESCRIPTION = DTYPED_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__TYPE = DTYPED_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__MULTIPLICITY = DTYPED_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__OPTIONAL = DTYPED_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL__COLLECTION = DTYPED_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>DLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL_FEATURE_COUNT = DTYPED_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DLITERAL_OPERATION_COUNT = DTYPED_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DComplexTypeImpl <em>DComplex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DComplexTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDComplexType()
	 * @generated
	 */
	int DCOMPLEX_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__NAME = DTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__DESCRIPTION = DTYPE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__FEATURES = DTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCOMPLEX_TYPE__SUPER_TYPE = DTYPE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DIdentityTypeImpl <em>DIdentity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DIdentityTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDIdentityType()
	 * @generated
	 */
	int DIDENTITY_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__NAME = DCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__DESCRIPTION = DCOMPLEX_TYPE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__FEATURES = DCOMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE__SUPER_TYPE = DCOMPLEX_TYPE__SUPER_TYPE;

	/**
	 * The number of structural features of the '<em>DIdentity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE_FEATURE_COUNT = DCOMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DIdentity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDENTITY_TYPE_OPERATION_COUNT = DCOMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DDetailTypeImpl <em>DDetail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DDetailTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDetailType()
	 * @generated
	 */
	int DDETAIL_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__NAME = DCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__DESCRIPTION = DCOMPLEX_TYPE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDETAIL_TYPE__FEATURES = DCOMPLEX_TYPE__FEATURES;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DRootTypeImpl <em>DRoot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DRootTypeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDRootType()
	 * @generated
	 */
	int DROOT_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE__NAME = DIDENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE__DESCRIPTION = DIDENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE__CONSTRAINTS = DIDENTITY_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE__PRIMITIVE = DIDENTITY_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE__ABSTRACT = DIDENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE__FEATURES = DIDENTITY_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE__SUPER_TYPE = DIDENTITY_TYPE__SUPER_TYPE;

	/**
	 * The number of structural features of the '<em>DRoot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE_FEATURE_COUNT = DIDENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DRoot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROOT_TYPE_OPERATION_COUNT = DIDENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DRelationshipImpl <em>DRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DRelationshipImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDRelationship()
	 * @generated
	 */
	int DRELATIONSHIP = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__NAME = DIDENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__DESCRIPTION = DIDENTITY_TYPE__DESCRIPTION;

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
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__FEATURES = DIDENTITY_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRELATIONSHIP__SUPER_TYPE = DIDENTITY_TYPE__SUPER_TYPE;

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
	int DFEATURE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__NAME = DTYPED_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__DESCRIPTION = DTYPED_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__TYPE = DTYPED_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__MULTIPLICITY = DTYPED_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__OPTIONAL = DTYPED_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE__COLLECTION = DTYPED_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>DFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE_FEATURE_COUNT = DTYPED_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFEATURE_OPERATION_COUNT = DTYPED_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DAssociationImpl <em>DAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DAssociationImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDAssociation()
	 * @generated
	 */
	int DASSOCIATION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSOCIATION__NAME = DFEATURE__NAME;

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
	int DMULTIPLICITY = 28;

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
	int DATTRIBUTE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__NAME = DFEATURE__NAME;

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
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE__KEY = DFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATTRIBUTE_FEATURE_COUNT = DFEATURE_FEATURE_COUNT + 1;

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
	int DQUERY = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY__NAME = DFEATURE__NAME;

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
	int DQUERY_PARAMETER = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__NAME = DTYPED_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__DESCRIPTION = DTYPED_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__TYPE = DTYPED_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__MULTIPLICITY = DTYPED_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__OPTIONAL = DTYPED_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER__COLLECTION = DTYPED_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>DQuery Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER_FEATURE_COUNT = DTYPED_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DQuery Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DQUERY_PARAMETER_OPERATION_COUNT = DTYPED_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DDomainEventImpl <em>DDomain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DDomainEventImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDomainEvent()
	 * @generated
	 */
	int DDOMAIN_EVENT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__NAME = DNAMED_ELEMENT__NAME;

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
	int DCONTEXT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__NAME = DTYPED_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__DESCRIPTION = DTYPED_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__TYPE = DTYPED_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__MULTIPLICITY = DTYPED_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__OPTIONAL = DTYPED_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT__COLLECTION = DTYPED_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>DContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT_FEATURE_COUNT = DTYPED_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT_OPERATION_COUNT = DTYPED_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DNotificationImpl <em>DNotification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DNotificationImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDNotification()
	 * @generated
	 */
	int DNOTIFICATION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__NAME = DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__DESCRIPTION = DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__NOTIFIED = DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__TYPE = DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__MULTIPLICITY = DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DNotification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION_FEATURE_COUNT = DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DNotification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION_OPERATION_COUNT = DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DActorImpl <em>DActor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DActorImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDActor()
	 * @generated
	 */
	int DACTOR = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__NAME = DNAMED_ELEMENT__NAME;

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
	int DHUMAN = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN__NAME = DACTOR__NAME;

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
	int DSERVICE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__NAME = DACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__DESCRIPTION = DACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__KIND = DACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__PARAMETERS = DACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Raises</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__RAISES = DACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__PRECONDITION = DACTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__POSTCONDITION = DACTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__TYPES = DACTOR_FEATURE_COUNT + 5;

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
	int DSERVICE_PARAMETER = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__NAME = DTYPED_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__DESCRIPTION = DTYPED_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__TYPE = DTYPED_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__MULTIPLICITY = DTYPED_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__OPTIONAL = DTYPED_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__COLLECTION = DTYPED_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER__DIRECTION = DTYPED_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DService Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER_FEATURE_COUNT = DTYPED_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DService Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_PARAMETER_OPERATION_COUNT = DTYPED_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.impl.DTimeImpl <em>DTime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.impl.DTimeImpl
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDTime()
	 * @generated
	 */
	int DTIME = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTIME__NAME = DACTOR__NAME;

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
	int DEXISTING_APPLICATION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXISTING_APPLICATION__NAME = DNAMED_ELEMENT__NAME;

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
	int DEXCEPTION = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEXCEPTION__NAME = DNAMED_ELEMENT__NAME;

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
	int DASSOCIATION_KIND = 42;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.DDirection <em>DDirection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.DDirection
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDirection()
	 * @generated
	 */
	int DDIRECTION = 43;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.DServiceKind <em>DService Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.DServiceKind
	 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDServiceKind()
	 * @generated
	 */
	int DSERVICE_KIND = 44;


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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IRichTextElement <em>IRich Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRich Text Element</em>'.
	 * @see com.mimacom.ddd.dm.base.IRichTextElement
	 * @generated
	 */
	EClass getIRichTextElement();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DTypedMember <em>DTyped Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTyped Member</em>'.
	 * @see com.mimacom.ddd.dm.base.DTypedMember
	 * @generated
	 */
	EClass getDTypedMember();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DTypedMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DTypedMember#getType()
	 * @see #getDTypedMember()
	 * @generated
	 */
	EReference getDTypedMember_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DTypedMember#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see com.mimacom.ddd.dm.base.DTypedMember#getMultiplicity()
	 * @see #getDTypedMember()
	 * @generated
	 */
	EReference getDTypedMember_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DTypedMember#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see com.mimacom.ddd.dm.base.DTypedMember#isOptional()
	 * @see #getDTypedMember()
	 * @generated
	 */
	EAttribute getDTypedMember_Optional();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DTypedMember#isCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see com.mimacom.ddd.dm.base.DTypedMember#isCollection()
	 * @see #getDTypedMember()
	 * @generated
	 */
	EAttribute getDTypedMember_Collection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.ITypedMemberContainer <em>ITyped Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITyped Member Container</em>'.
	 * @see com.mimacom.ddd.dm.base.ITypedMemberContainer
	 * @generated
	 */
	EClass getITypedMemberContainer();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.IPrimaryNavigationTarget <em>IPrimary Navigation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPrimary Navigation Target</em>'.
	 * @see com.mimacom.ddd.dm.base.IPrimaryNavigationTarget
	 * @generated
	 */
	EClass getIPrimaryNavigationTarget();

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
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DRichText#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.mimacom.ddd.dm.base.DRichText#getElements()
	 * @see #getDRichText()
	 * @generated
	 */
	EReference getDRichText_Elements();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DText <em>DText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DText</em>'.
	 * @see com.mimacom.ddd.dm.base.DText
	 * @generated
	 */
	EClass getDText();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DText#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.base.DText#getValue()
	 * @see #getDText()
	 * @generated
	 */
	EAttribute getDText_Value();

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
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomain#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain#getTypes()
	 * @see #getDDomain()
	 * @generated
	 */
	EReference getDDomain_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DDomain#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see com.mimacom.ddd.dm.base.DDomain#getFunctions()
	 * @see #getDDomain()
	 * @generated
	 */
	EReference getDDomain_Functions();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DFunction <em>DFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFunction</em>'.
	 * @see com.mimacom.ddd.dm.base.DFunction
	 * @generated
	 */
	EClass getDFunction();

	/**
	 * Returns the meta object for the attribute list '{@link com.mimacom.ddd.dm.base.DFunction#getParameterNames <em>Parameter Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Names</em>'.
	 * @see com.mimacom.ddd.dm.base.DFunction#getParameterNames()
	 * @see #getDFunction()
	 * @generated
	 */
	EAttribute getDFunction_ParameterNames();

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
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DAggregate#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.mimacom.ddd.dm.base.DAggregate#getTypes()
	 * @see #getDAggregate()
	 * @generated
	 */
	EReference getDAggregate_Types();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DAggregate#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see com.mimacom.ddd.dm.base.DAggregate#getRoot()
	 * @see #getDAggregate()
	 * @generated
	 */
	EReference getDAggregate_Root();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.DAggregate#getRootName <em>Root Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Name</em>'.
	 * @see com.mimacom.ddd.dm.base.DAggregate#getRootName()
	 * @see #getDAggregate()
	 * @generated
	 */
	EAttribute getDAggregate_RootName();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DIdentityType <em>DIdentity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIdentity Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DIdentityType
	 * @generated
	 */
	EClass getDIdentityType();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.DRootType <em>DRoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRoot Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DRootType
	 * @generated
	 */
	EClass getDRootType();

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
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.DNotification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.base.DNotification#getType()
	 * @see #getDNotification()
	 * @generated
	 */
	EReference getDNotification_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DNotification#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see com.mimacom.ddd.dm.base.DNotification#getMultiplicity()
	 * @see #getDNotification()
	 * @generated
	 */
	EReference getDNotification_Multiplicity();

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
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DService#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see com.mimacom.ddd.dm.base.DService#getPrecondition()
	 * @see #getDService()
	 * @generated
	 */
	EReference getDService_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.DService#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcondition</em>'.
	 * @see com.mimacom.ddd.dm.base.DService#getPostcondition()
	 * @see #getDService()
	 * @generated
	 */
	EReference getDService_Postcondition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DService#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.mimacom.ddd.dm.base.DService#getTypes()
	 * @see #getDService()
	 * @generated
	 */
	EReference getDService_Types();

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
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.base.DExistingApplication#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.mimacom.ddd.dm.base.DExistingApplication#getTypes()
	 * @see #getDExistingApplication()
	 * @generated
	 */
	EReference getDExistingApplication_Types();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IRichTextElement <em>IRich Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IRichTextElement
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIRichTextElement()
		 * @generated
		 */
		EClass IRICH_TEXT_ELEMENT = eINSTANCE.getIRichTextElement();

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
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAMED_ELEMENT__DESCRIPTION = eINSTANCE.getDNamedElement_Description();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DTypedMemberImpl <em>DTyped Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DTypedMemberImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDTypedMember()
		 * @generated
		 */
		EClass DTYPED_MEMBER = eINSTANCE.getDTypedMember();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTYPED_MEMBER__TYPE = eINSTANCE.getDTypedMember_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTYPED_MEMBER__MULTIPLICITY = eINSTANCE.getDTypedMember_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTYPED_MEMBER__OPTIONAL = eINSTANCE.getDTypedMember_Optional();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTYPED_MEMBER__COLLECTION = eINSTANCE.getDTypedMember_Collection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.ITypedMemberContainer <em>ITyped Member Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.ITypedMemberContainer
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getITypedMemberContainer()
		 * @generated
		 */
		EClass ITYPED_MEMBER_CONTAINER = eINSTANCE.getITypedMemberContainer();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.IPrimaryNavigationTarget <em>IPrimary Navigation Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.IPrimaryNavigationTarget
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getIPrimaryNavigationTarget()
		 * @generated
		 */
		EClass IPRIMARY_NAVIGATION_TARGET = eINSTANCE.getIPrimaryNavigationTarget();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRICH_TEXT__ELEMENTS = eINSTANCE.getDRichText_Elements();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DTextImpl <em>DText</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DTextImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDText()
		 * @generated
		 */
		EClass DTEXT = eINSTANCE.getDText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTEXT__VALUE = eINSTANCE.getDText_Value();

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
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__TYPES = eINSTANCE.getDDomain_Types();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__FUNCTIONS = eINSTANCE.getDDomain_Functions();

		/**
		 * The meta object literal for the '<em><b>Aggregates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN__AGGREGATES = eINSTANCE.getDDomain_Aggregates();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DFunctionImpl <em>DFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DFunctionImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDFunction()
		 * @generated
		 */
		EClass DFUNCTION = eINSTANCE.getDFunction();

		/**
		 * The meta object literal for the '<em><b>Parameter Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFUNCTION__PARAMETER_NAMES = eINSTANCE.getDFunction_ParameterNames();

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
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAGGREGATE__TYPES = eINSTANCE.getDAggregate_Types();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAGGREGATE__ROOT = eINSTANCE.getDAggregate_Root();

		/**
		 * The meta object literal for the '<em><b>Root Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAGGREGATE__ROOT_NAME = eINSTANCE.getDAggregate_RootName();

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
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCOMPLEX_TYPE__FEATURES = eINSTANCE.getDComplexType_Features();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCOMPLEX_TYPE__SUPER_TYPE = eINSTANCE.getDComplexType_SuperType();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DDetailTypeImpl <em>DDetail Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DDetailTypeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDDetailType()
		 * @generated
		 */
		EClass DDETAIL_TYPE = eINSTANCE.getDDetailType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.impl.DRootTypeImpl <em>DRoot Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.impl.DRootTypeImpl
		 * @see com.mimacom.ddd.dm.base.impl.BasePackageImpl#getDRootType()
		 * @generated
		 */
		EClass DROOT_TYPE = eINSTANCE.getDRootType();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNOTIFICATION__TYPE = eINSTANCE.getDNotification_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNOTIFICATION__MULTIPLICITY = eINSTANCE.getDNotification_Multiplicity();

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
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSERVICE__PRECONDITION = eINSTANCE.getDService_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSERVICE__POSTCONDITION = eINSTANCE.getDService_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSERVICE__TYPES = eINSTANCE.getDService_Types();

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
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEXISTING_APPLICATION__TYPES = eINSTANCE.getDExistingApplication_Types();

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
