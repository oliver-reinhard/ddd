/**
 */
package com.mimacom.ddd.dm.dmx;

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
 * @see com.mimacom.ddd.dm.dmx.DmxFactory
 * @model kind="package"
 * @generated
 */
public interface DmxPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/dmx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmxPackage eINSTANCE = com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxNamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxNamespaceImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxNamespace()
	 * @generated
	 */
	int DMX_NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE__NAME = BasePackage.DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE__ALIASES = BasePackage.DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE__DESCRIPTION = BasePackage.DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE__TYPES = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE__IMPORTS = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE__FILTERS = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE__TESTS = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE_FEATURE_COUNT = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NAMESPACE_OPERATION_COUNT = BasePackage.DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxTestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxTestImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxTest()
	 * @generated
	 */
	int DMX_TEST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST__NAME = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST__CONTEXT = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST__EXPR = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_FEATURE_COUNT = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_OPERATION_COUNT = BasePackage.INAVIGABLE_MEMBER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl <em>Archetype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxArchetype()
	 * @generated
	 */
	int DMX_ARCHETYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__NAME = BasePackage.DPRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__ALIASES = BasePackage.DPRIMITIVE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__DESCRIPTION = BasePackage.DPRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__DEDUCED_FROM = BasePackage.DPRIMITIVE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__SYNTHETIC = BasePackage.DPRIMITIVE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__CONSTRAINTS = BasePackage.DPRIMITIVE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__PRIMITIVE = BasePackage.DPRIMITIVE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__REDEFINES = BasePackage.DPRIMITIVE__REDEFINES;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__BASE_TYPE = BasePackage.DPRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Archetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE_FEATURE_COUNT = BasePackage.DPRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Archetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE_OPERATION_COUNT = BasePackage.DPRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFilter()
	 * @generated
	 */
	int DMX_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__ALIASES = BasePackage.DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__BASE_TYPE = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__BASE_TYPE_COLLECTION = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxFunctionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFunction()
	 * @generated
	 */
	int DMX_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__NAME = DMX_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__ALIASES = DMX_FILTER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__DESCRIPTION = DMX_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__TYPE = DMX_FILTER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__MULTIPLICITY = DMX_FILTER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__OPTIONAL = DMX_FILTER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__COLLECTION = DMX_FILTER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__BASE_TYPE = DMX_FILTER__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Base Type Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__BASE_TYPE_COLLECTION = DMX_FILTER__BASE_TYPE_COLLECTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION__PARAMETERS = DMX_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_FEATURE_COUNT = DMX_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_OPERATION_COUNT = DMX_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxFunctionParameterImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFunctionParameter()
	 * @generated
	 */
	int DMX_FUNCTION_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_PARAMETER__BASE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Base Type Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_PARAMETER__BASE_TYPE_COLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxIteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxIteratorImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxIterator()
	 * @generated
	 */
	int DMX_ITERATOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__NAME = DMX_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__ALIASES = DMX_FILTER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__DESCRIPTION = DMX_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__TYPE = DMX_FILTER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__MULTIPLICITY = DMX_FILTER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__OPTIONAL = DMX_FILTER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__COLLECTION = DMX_FILTER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__BASE_TYPE = DMX_FILTER__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Base Type Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR__BASE_TYPE_COLLECTION = DMX_FILTER__BASE_TYPE_COLLECTION;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR_FEATURE_COUNT = DMX_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ITERATOR_OPERATION_COUNT = DMX_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl <em>DAssignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDAssignment()
	 * @generated
	 */
	int DASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Member Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT__MEMBER_CONTAINER = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assign To Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT__ASSIGN_TO_MEMBER = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DAssignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DAssignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DPredicateImpl <em>DPredicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DPredicateImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDPredicate()
	 * @generated
	 */
	int DPREDICATE = 8;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPREDICATE__VAR = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPREDICATE__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DPredicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPREDICATE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DPredicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPREDICATE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DBinaryOperationImpl <em>DBinary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DBinaryOperationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBinaryOperation()
	 * @generated
	 */
	int DBINARY_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION__LEFT_OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION__OPERATOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION__RIGHT_OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DBinary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DBinary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DInstanceOfExpressionImpl <em>DInstance Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DInstanceOfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDInstanceOfExpression()
	 * @generated
	 */
	int DINSTANCE_OF_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANCE_OF_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANCE_OF_EXPRESSION__TYPE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DInstance Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANCE_OF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DInstance Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANCE_OF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DUnaryOperationImpl <em>DUnary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DUnaryOperationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUnaryOperation()
	 * @generated
	 */
	int DUNARY_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNARY_OPERATION__OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNARY_OPERATION__OPERATOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DUnary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNARY_OPERATION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DUnary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNARY_OPERATION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl <em>Member Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxMemberNavigation()
	 * @generated
	 */
	int DMX_MEMBER_NAVIGATION = 12;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MEMBER_NAVIGATION__MEMBER = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preceding Navigation Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MEMBER_NAVIGATION__EXPLICIT_OPERATION_CALL = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Member Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MEMBER_NAVIGATION__MEMBER_CALL_ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MEMBER_NAVIGATION__BEFORE = BasePackage.DEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Member Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MEMBER_NAVIGATION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Member Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MEMBER_NAVIGATION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DCastExpressionImpl <em>DCast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DCastExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDCastExpression()
	 * @generated
	 */
	int DCAST_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAST_EXPRESSION__TARGET = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAST_EXPRESSION__TYPE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DCast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAST_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DCast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAST_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DSelfExpressionImpl <em>DSelf Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DSelfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDSelfExpression()
	 * @generated
	 */
	int DSELF_EXPRESSION = 14;

	/**
	 * The number of structural features of the '<em>DSelf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSELF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DSelf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSELF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DReturnExpressionImpl <em>DReturn Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DReturnExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDReturnExpression()
	 * @generated
	 */
	int DRETURN_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRETURN_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DReturn Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRETURN_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DReturn Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRETURN_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DRaiseExpressionImpl <em>DRaise Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DRaiseExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDRaiseExpression()
	 * @generated
	 */
	int DRAISE_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAISE_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DRaise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAISE_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DRaise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAISE_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl <em>DFunction Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDFunctionCall()
	 * @generated
	 */
	int DFUNCTION_CALL = 17;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_CALL__FUNCTION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DFunction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_CALL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DFunction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_CALL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl <em>DConstructor Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDConstructorCall()
	 * @generated
	 */
	int DCONSTRUCTOR_CALL = 18;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL__CONSTRUCTOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explicit Constructor Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL__ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DConstructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DConstructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxStaticReferenceImpl <em>Static Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxStaticReferenceImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxStaticReference()
	 * @generated
	 */
	int DMX_STATIC_REFERENCE = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STATIC_REFERENCE__TARGET = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STATIC_REFERENCE__MEMBER = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STATIC_REFERENCE__DISPLAY_NAME = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plural</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STATIC_REFERENCE__PLURAL = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Static Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STATIC_REFERENCE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Static Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STATIC_REFERENCE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxContextReferenceImpl <em>Context Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxContextReferenceImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxContextReference()
	 * @generated
	 */
	int DMX_CONTEXT_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONTEXT_REFERENCE__TARGET = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONTEXT_REFERENCE__ALL = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONTEXT_REFERENCE__BEFORE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONTEXT_REFERENCE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Context Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONTEXT_REFERENCE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DIfExpressionImpl <em>DIf Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DIfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDIfExpression()
	 * @generated
	 */
	int DIF_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION__IF = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION__THEN = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION__ELSE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DForLoopExpressionImpl <em>DFor Loop Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DForLoopExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDForLoopExpression()
	 * @generated
	 */
	int DFOR_LOOP_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Declared Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION__DECLARED_PARAM = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION__FOR_EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION__EACH_EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DFor Loop Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DFor Loop Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DBooleanLiteralImpl <em>DBoolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DBooleanLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBooleanLiteral()
	 * @generated
	 */
	int DBOOLEAN_LITERAL = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBOOLEAN_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DBoolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBOOLEAN_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DBoolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBOOLEAN_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DStringLiteralImpl <em>DString Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DStringLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDStringLiteral()
	 * @generated
	 */
	int DSTRING_LITERAL = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTRING_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DString Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTRING_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DString Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTRING_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DNaturalLiteralImpl <em>DNatural Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DNaturalLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDNaturalLiteral()
	 * @generated
	 */
	int DNATURAL_LITERAL = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNATURAL_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DNatural Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNATURAL_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DNatural Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNATURAL_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DDecimalLiteralImpl <em>DDecimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DDecimalLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDDecimalLiteral()
	 * @generated
	 */
	int DDECIMAL_LITERAL = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDECIMAL_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DDecimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDECIMAL_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DDecimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDECIMAL_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DDateLiteralImpl <em>DDate Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DDateLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDDateLiteral()
	 * @generated
	 */
	int DDATE_LITERAL = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATE_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DDate Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATE_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DDate Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATE_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DUndefinedLiteralImpl <em>DUndefined Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DUndefinedLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUndefinedLiteral()
	 * @generated
	 */
	int DUNDEFINED_LITERAL = 28;

	/**
	 * The number of structural features of the '<em>DUndefined Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNDEFINED_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DUndefined Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNDEFINED_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DmxBaseType <em>Base Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBaseType()
	 * @generated
	 */
	int DMX_BASE_TYPE = 29;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DBinaryOperator <em>DBinary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperator
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBinaryOperator()
	 * @generated
	 */
	int DBINARY_OPERATOR = 30;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DUnaryOperator <em>DUnary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperator
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUnaryOperator()
	 * @generated
	 */
	int DUNARY_OPERATOR = 31;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxNamespace
	 * @generated
	 */
	EClass getDmxNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxNamespace#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxNamespace#getImports()
	 * @see #getDmxNamespace()
	 * @generated
	 */
	EReference getDmxNamespace_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxNamespace#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxNamespace#getFilters()
	 * @see #getDmxNamespace()
	 * @generated
	 */
	EReference getDmxNamespace_Filters();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxNamespace#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxNamespace#getTests()
	 * @see #getDmxNamespace()
	 * @generated
	 */
	EReference getDmxNamespace_Tests();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxTest
	 * @generated
	 */
	EClass getDmxTest();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxTest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxTest#getName()
	 * @see #getDmxTest()
	 * @generated
	 */
	EAttribute getDmxTest_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxTest#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxTest#getContext()
	 * @see #getDmxTest()
	 * @generated
	 */
	EReference getDmxTest_Context();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxTest#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxTest#getExpr()
	 * @see #getDmxTest()
	 * @generated
	 */
	EReference getDmxTest_Expr();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxArchetype <em>Archetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxArchetype
	 * @generated
	 */
	EClass getDmxArchetype();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxArchetype#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxArchetype#getBaseType()
	 * @see #getDmxArchetype()
	 * @generated
	 */
	EAttribute getDmxArchetype_BaseType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilter
	 * @generated
	 */
	EClass getDmxFilter();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFilter#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilter#getBaseType()
	 * @see #getDmxFilter()
	 * @generated
	 */
	EAttribute getDmxFilter_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFilter#isBaseTypeCollection <em>Base Type Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type Collection</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilter#isBaseTypeCollection()
	 * @see #getDmxFilter()
	 * @generated
	 */
	EAttribute getDmxFilter_BaseTypeCollection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunction
	 * @generated
	 */
	EClass getDmxFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunction#getParameters()
	 * @see #getDmxFunction()
	 * @generated
	 */
	EReference getDmxFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionParameter
	 * @generated
	 */
	EClass getDmxFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getName()
	 * @see #getDmxFunctionParameter()
	 * @generated
	 */
	EAttribute getDmxFunctionParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getBaseType()
	 * @see #getDmxFunctionParameter()
	 * @generated
	 */
	EAttribute getDmxFunctionParameter_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#isBaseTypeCollection <em>Base Type Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type Collection</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionParameter#isBaseTypeCollection()
	 * @see #getDmxFunctionParameter()
	 * @generated
	 */
	EAttribute getDmxFunctionParameter_BaseTypeCollection();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxIterator
	 * @generated
	 */
	EClass getDmxIterator();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DAssignment <em>DAssignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAssignment</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment
	 * @generated
	 */
	EClass getDAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DAssignment#getMemberContainer <em>Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member Container</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment#getMemberContainer()
	 * @see #getDAssignment()
	 * @generated
	 */
	EReference getDAssignment_MemberContainer();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DAssignment#getAssignToMember <em>Assign To Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assign To Member</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment#getAssignToMember()
	 * @see #getDAssignment()
	 * @generated
	 */
	EReference getDAssignment_AssignToMember();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment#getValue()
	 * @see #getDAssignment()
	 * @generated
	 */
	EReference getDAssignment_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DPredicate <em>DPredicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPredicate</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DPredicate
	 * @generated
	 */
	EClass getDPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DPredicate#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DPredicate#getVar()
	 * @see #getDPredicate()
	 * @generated
	 */
	EReference getDPredicate_Var();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DPredicate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DPredicate#getValue()
	 * @see #getDPredicate()
	 * @generated
	 */
	EReference getDPredicate_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation <em>DBinary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBinary Operation</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation
	 * @generated
	 */
	EClass getDBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation#getLeftOperand()
	 * @see #getDBinaryOperation()
	 * @generated
	 */
	EReference getDBinaryOperation_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation#getOperator()
	 * @see #getDBinaryOperation()
	 * @generated
	 */
	EAttribute getDBinaryOperation_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation#getRightOperand()
	 * @see #getDBinaryOperation()
	 * @generated
	 */
	EReference getDBinaryOperation_RightOperand();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DInstanceOfExpression <em>DInstance Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DInstance Of Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DInstanceOfExpression
	 * @generated
	 */
	EClass getDInstanceOfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DInstanceOfExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DInstanceOfExpression#getExpression()
	 * @see #getDInstanceOfExpression()
	 * @generated
	 */
	EReference getDInstanceOfExpression_Expression();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DInstanceOfExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DInstanceOfExpression#getType()
	 * @see #getDInstanceOfExpression()
	 * @generated
	 */
	EReference getDInstanceOfExpression_Type();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DUnaryOperation <em>DUnary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DUnary Operation</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperation
	 * @generated
	 */
	EClass getDUnaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DUnaryOperation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperation#getOperand()
	 * @see #getDUnaryOperation()
	 * @generated
	 */
	EReference getDUnaryOperation_Operand();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DUnaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperation#getOperator()
	 * @see #getDUnaryOperation()
	 * @generated
	 */
	EAttribute getDUnaryOperation_Operator();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation <em>Member Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Navigation</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxMemberNavigation
	 * @generated
	 */
	EClass getDmxMemberNavigation();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getMember()
	 * @see #getDmxMemberNavigation()
	 * @generated
	 */
	EReference getDmxMemberNavigation_Member();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getPrecedingNavigationSegment <em>Preceding Navigation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preceding Navigation Segment</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getPrecedingNavigationSegment()
	 * @see #getDmxMemberNavigation()
	 * @generated
	 */
	EReference getDmxMemberNavigation_PrecedingNavigationSegment();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#isExplicitOperationCall <em>Explicit Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Operation Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxMemberNavigation#isExplicitOperationCall()
	 * @see #getDmxMemberNavigation()
	 * @generated
	 */
	EAttribute getDmxMemberNavigation_ExplicitOperationCall();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getMemberCallArguments <em>Member Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Call Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getMemberCallArguments()
	 * @see #getDmxMemberNavigation()
	 * @generated
	 */
	EReference getDmxMemberNavigation_MemberCallArguments();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#isBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxMemberNavigation#isBefore()
	 * @see #getDmxMemberNavigation()
	 * @generated
	 */
	EAttribute getDmxMemberNavigation_Before();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DCastExpression <em>DCast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCast Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DCastExpression
	 * @generated
	 */
	EClass getDCastExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DCastExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DCastExpression#getTarget()
	 * @see #getDCastExpression()
	 * @generated
	 */
	EReference getDCastExpression_Target();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DCastExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DCastExpression#getType()
	 * @see #getDCastExpression()
	 * @generated
	 */
	EReference getDCastExpression_Type();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DSelfExpression <em>DSelf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSelf Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DSelfExpression
	 * @generated
	 */
	EClass getDSelfExpression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DReturnExpression <em>DReturn Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DReturn Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DReturnExpression
	 * @generated
	 */
	EClass getDReturnExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DReturnExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DReturnExpression#getExpression()
	 * @see #getDReturnExpression()
	 * @generated
	 */
	EReference getDReturnExpression_Expression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DRaiseExpression <em>DRaise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRaise Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DRaiseExpression
	 * @generated
	 */
	EClass getDRaiseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DRaiseExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DRaiseExpression#getExpression()
	 * @see #getDRaiseExpression()
	 * @generated
	 */
	EReference getDRaiseExpression_Expression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DFunctionCall <em>DFunction Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFunction Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DFunctionCall
	 * @generated
	 */
	EClass getDFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DFunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DFunctionCall#getFunction()
	 * @see #getDFunctionCall()
	 * @generated
	 */
	EReference getDFunctionCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DFunctionCall#getFunctionCallArguments <em>Function Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Call Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DFunctionCall#getFunctionCallArguments()
	 * @see #getDFunctionCall()
	 * @generated
	 */
	EReference getDFunctionCall_FunctionCallArguments();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DConstructorCall <em>DConstructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DConstructor Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall
	 * @generated
	 */
	EClass getDConstructorCall();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DConstructorCall#getConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constructor</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall#getConstructor()
	 * @see #getDConstructorCall()
	 * @generated
	 */
	EReference getDConstructorCall_Constructor();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Constructor Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall#isExplicitConstructorCall()
	 * @see #getDConstructorCall()
	 * @generated
	 */
	EAttribute getDConstructorCall_ExplicitConstructorCall();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DConstructorCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall#getArguments()
	 * @see #getDConstructorCall()
	 * @generated
	 */
	EReference getDConstructorCall_Arguments();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference <em>Static Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Reference</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxStaticReference
	 * @generated
	 */
	EClass getDmxStaticReference();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxStaticReference#getTarget()
	 * @see #getDmxStaticReference()
	 * @generated
	 */
	EReference getDmxStaticReference_Target();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxStaticReference#getMember()
	 * @see #getDmxStaticReference()
	 * @generated
	 */
	EReference getDmxStaticReference_Member();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxStaticReference#getDisplayName()
	 * @see #getDmxStaticReference()
	 * @generated
	 */
	EAttribute getDmxStaticReference_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#isPlural <em>Plural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plural</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxStaticReference#isPlural()
	 * @see #getDmxStaticReference()
	 * @generated
	 */
	EAttribute getDmxStaticReference_Plural();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxContextReference <em>Context Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Reference</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxContextReference
	 * @generated
	 */
	EClass getDmxContextReference();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxContextReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxContextReference#getTarget()
	 * @see #getDmxContextReference()
	 * @generated
	 */
	EReference getDmxContextReference_Target();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxContextReference#isAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxContextReference#isAll()
	 * @see #getDmxContextReference()
	 * @generated
	 */
	EAttribute getDmxContextReference_All();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxContextReference#isBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxContextReference#isBefore()
	 * @see #getDmxContextReference()
	 * @generated
	 */
	EAttribute getDmxContextReference_Before();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DIfExpression <em>DIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIf Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression
	 * @generated
	 */
	EClass getDIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression#getIf()
	 * @see #getDIfExpression()
	 * @generated
	 */
	EReference getDIfExpression_If();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression#getThen()
	 * @see #getDIfExpression()
	 * @generated
	 */
	EReference getDIfExpression_Then();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression#getElse()
	 * @see #getDIfExpression()
	 * @generated
	 */
	EReference getDIfExpression_Else();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression <em>DFor Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFor Loop Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression
	 * @generated
	 */
	EClass getDForLoopExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression#getDeclaredParam <em>Declared Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Param</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression#getDeclaredParam()
	 * @see #getDForLoopExpression()
	 * @generated
	 */
	EAttribute getDForLoopExpression_DeclaredParam();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression#getForExpression <em>For Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression#getForExpression()
	 * @see #getDForLoopExpression()
	 * @generated
	 */
	EReference getDForLoopExpression_ForExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression#getEachExpression <em>Each Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Each Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression#getEachExpression()
	 * @see #getDForLoopExpression()
	 * @generated
	 */
	EReference getDForLoopExpression_EachExpression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DBooleanLiteral <em>DBoolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBoolean Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBooleanLiteral
	 * @generated
	 */
	EClass getDBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DBooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBooleanLiteral#isValue()
	 * @see #getDBooleanLiteral()
	 * @generated
	 */
	EAttribute getDBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DStringLiteral <em>DString Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DString Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DStringLiteral
	 * @generated
	 */
	EClass getDStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DStringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DStringLiteral#getValue()
	 * @see #getDStringLiteral()
	 * @generated
	 */
	EAttribute getDStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DNaturalLiteral <em>DNatural Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNatural Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNaturalLiteral
	 * @generated
	 */
	EClass getDNaturalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DNaturalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNaturalLiteral#getValue()
	 * @see #getDNaturalLiteral()
	 * @generated
	 */
	EAttribute getDNaturalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DDecimalLiteral <em>DDecimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDecimal Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DDecimalLiteral
	 * @generated
	 */
	EClass getDDecimalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DDecimalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DDecimalLiteral#getValue()
	 * @see #getDDecimalLiteral()
	 * @generated
	 */
	EAttribute getDDecimalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DDateLiteral <em>DDate Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDate Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DDateLiteral
	 * @generated
	 */
	EClass getDDateLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DDateLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DDateLiteral#getValue()
	 * @see #getDDateLiteral()
	 * @generated
	 */
	EAttribute getDDateLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DUndefinedLiteral <em>DUndefined Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DUndefined Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUndefinedLiteral
	 * @generated
	 */
	EClass getDUndefinedLiteral();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.dmx.DmxBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Base Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @generated
	 */
	EEnum getDmxBaseType();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.dmx.DBinaryOperator <em>DBinary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DBinary Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperator
	 * @generated
	 */
	EEnum getDBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.dmx.DUnaryOperator <em>DUnary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DUnary Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperator
	 * @generated
	 */
	EEnum getDUnaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DmxFactory getDmxFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxNamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxNamespaceImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxNamespace()
		 * @generated
		 */
		EClass DMX_NAMESPACE = eINSTANCE.getDmxNamespace();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_NAMESPACE__IMPORTS = eINSTANCE.getDmxNamespace_Imports();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_NAMESPACE__FILTERS = eINSTANCE.getDmxNamespace_Filters();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_NAMESPACE__TESTS = eINSTANCE.getDmxNamespace_Tests();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxTestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxTestImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxTest()
		 * @generated
		 */
		EClass DMX_TEST = eINSTANCE.getDmxTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_TEST__NAME = eINSTANCE.getDmxTest_Name();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_TEST__CONTEXT = eINSTANCE.getDmxTest_Context();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_TEST__EXPR = eINSTANCE.getDmxTest_Expr();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl <em>Archetype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxArchetype()
		 * @generated
		 */
		EClass DMX_ARCHETYPE = eINSTANCE.getDmxArchetype();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_ARCHETYPE__BASE_TYPE = eINSTANCE.getDmxArchetype_BaseType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFilter()
		 * @generated
		 */
		EClass DMX_FILTER = eINSTANCE.getDmxFilter();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FILTER__BASE_TYPE = eINSTANCE.getDmxFilter_BaseType();

		/**
		 * The meta object literal for the '<em><b>Base Type Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FILTER__BASE_TYPE_COLLECTION = eINSTANCE.getDmxFilter_BaseTypeCollection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxFunctionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFunction()
		 * @generated
		 */
		EClass DMX_FUNCTION = eINSTANCE.getDmxFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FUNCTION__PARAMETERS = eINSTANCE.getDmxFunction_Parameters();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxFunctionParameterImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFunctionParameter()
		 * @generated
		 */
		EClass DMX_FUNCTION_PARAMETER = eINSTANCE.getDmxFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FUNCTION_PARAMETER__NAME = eINSTANCE.getDmxFunctionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FUNCTION_PARAMETER__BASE_TYPE = eINSTANCE.getDmxFunctionParameter_BaseType();

		/**
		 * The meta object literal for the '<em><b>Base Type Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FUNCTION_PARAMETER__BASE_TYPE_COLLECTION = eINSTANCE.getDmxFunctionParameter_BaseTypeCollection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxIteratorImpl <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxIteratorImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxIterator()
		 * @generated
		 */
		EClass DMX_ITERATOR = eINSTANCE.getDmxIterator();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl <em>DAssignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDAssignment()
		 * @generated
		 */
		EClass DASSIGNMENT = eINSTANCE.getDAssignment();

		/**
		 * The meta object literal for the '<em><b>Member Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASSIGNMENT__MEMBER_CONTAINER = eINSTANCE.getDAssignment_MemberContainer();

		/**
		 * The meta object literal for the '<em><b>Assign To Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASSIGNMENT__ASSIGN_TO_MEMBER = eINSTANCE.getDAssignment_AssignToMember();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASSIGNMENT__VALUE = eINSTANCE.getDAssignment_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DPredicateImpl <em>DPredicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DPredicateImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDPredicate()
		 * @generated
		 */
		EClass DPREDICATE = eINSTANCE.getDPredicate();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPREDICATE__VAR = eINSTANCE.getDPredicate_Var();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPREDICATE__VALUE = eINSTANCE.getDPredicate_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DBinaryOperationImpl <em>DBinary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DBinaryOperationImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBinaryOperation()
		 * @generated
		 */
		EClass DBINARY_OPERATION = eINSTANCE.getDBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBINARY_OPERATION__LEFT_OPERAND = eINSTANCE.getDBinaryOperation_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBINARY_OPERATION__OPERATOR = eINSTANCE.getDBinaryOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBINARY_OPERATION__RIGHT_OPERAND = eINSTANCE.getDBinaryOperation_RightOperand();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DInstanceOfExpressionImpl <em>DInstance Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DInstanceOfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDInstanceOfExpression()
		 * @generated
		 */
		EClass DINSTANCE_OF_EXPRESSION = eINSTANCE.getDInstanceOfExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINSTANCE_OF_EXPRESSION__EXPRESSION = eINSTANCE.getDInstanceOfExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINSTANCE_OF_EXPRESSION__TYPE = eINSTANCE.getDInstanceOfExpression_Type();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DUnaryOperationImpl <em>DUnary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DUnaryOperationImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUnaryOperation()
		 * @generated
		 */
		EClass DUNARY_OPERATION = eINSTANCE.getDUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNARY_OPERATION__OPERAND = eINSTANCE.getDUnaryOperation_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUNARY_OPERATION__OPERATOR = eINSTANCE.getDUnaryOperation_Operator();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl <em>Member Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxMemberNavigation()
		 * @generated
		 */
		EClass DMX_MEMBER_NAVIGATION = eINSTANCE.getDmxMemberNavigation();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_MEMBER_NAVIGATION__MEMBER = eINSTANCE.getDmxMemberNavigation_Member();

		/**
		 * The meta object literal for the '<em><b>Preceding Navigation Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT = eINSTANCE.getDmxMemberNavigation_PrecedingNavigationSegment();

		/**
		 * The meta object literal for the '<em><b>Explicit Operation Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_MEMBER_NAVIGATION__EXPLICIT_OPERATION_CALL = eINSTANCE.getDmxMemberNavigation_ExplicitOperationCall();

		/**
		 * The meta object literal for the '<em><b>Member Call Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_MEMBER_NAVIGATION__MEMBER_CALL_ARGUMENTS = eINSTANCE.getDmxMemberNavigation_MemberCallArguments();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_MEMBER_NAVIGATION__BEFORE = eINSTANCE.getDmxMemberNavigation_Before();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DCastExpressionImpl <em>DCast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DCastExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDCastExpression()
		 * @generated
		 */
		EClass DCAST_EXPRESSION = eINSTANCE.getDCastExpression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAST_EXPRESSION__TARGET = eINSTANCE.getDCastExpression_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAST_EXPRESSION__TYPE = eINSTANCE.getDCastExpression_Type();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DSelfExpressionImpl <em>DSelf Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DSelfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDSelfExpression()
		 * @generated
		 */
		EClass DSELF_EXPRESSION = eINSTANCE.getDSelfExpression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DReturnExpressionImpl <em>DReturn Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DReturnExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDReturnExpression()
		 * @generated
		 */
		EClass DRETURN_EXPRESSION = eINSTANCE.getDReturnExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRETURN_EXPRESSION__EXPRESSION = eINSTANCE.getDReturnExpression_Expression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DRaiseExpressionImpl <em>DRaise Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DRaiseExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDRaiseExpression()
		 * @generated
		 */
		EClass DRAISE_EXPRESSION = eINSTANCE.getDRaiseExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAISE_EXPRESSION__EXPRESSION = eINSTANCE.getDRaiseExpression_Expression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl <em>DFunction Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDFunctionCall()
		 * @generated
		 */
		EClass DFUNCTION_CALL = eINSTANCE.getDFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFUNCTION_CALL__FUNCTION = eINSTANCE.getDFunctionCall_Function();

		/**
		 * The meta object literal for the '<em><b>Function Call Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS = eINSTANCE.getDFunctionCall_FunctionCallArguments();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl <em>DConstructor Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDConstructorCall()
		 * @generated
		 */
		EClass DCONSTRUCTOR_CALL = eINSTANCE.getDConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONSTRUCTOR_CALL__CONSTRUCTOR = eINSTANCE.getDConstructorCall_Constructor();

		/**
		 * The meta object literal for the '<em><b>Explicit Constructor Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = eINSTANCE.getDConstructorCall_ExplicitConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONSTRUCTOR_CALL__ARGUMENTS = eINSTANCE.getDConstructorCall_Arguments();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxStaticReferenceImpl <em>Static Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxStaticReferenceImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxStaticReference()
		 * @generated
		 */
		EClass DMX_STATIC_REFERENCE = eINSTANCE.getDmxStaticReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_STATIC_REFERENCE__TARGET = eINSTANCE.getDmxStaticReference_Target();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_STATIC_REFERENCE__MEMBER = eINSTANCE.getDmxStaticReference_Member();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_STATIC_REFERENCE__DISPLAY_NAME = eINSTANCE.getDmxStaticReference_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Plural</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_STATIC_REFERENCE__PLURAL = eINSTANCE.getDmxStaticReference_Plural();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxContextReferenceImpl <em>Context Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxContextReferenceImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxContextReference()
		 * @generated
		 */
		EClass DMX_CONTEXT_REFERENCE = eINSTANCE.getDmxContextReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_CONTEXT_REFERENCE__TARGET = eINSTANCE.getDmxContextReference_Target();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CONTEXT_REFERENCE__ALL = eINSTANCE.getDmxContextReference_All();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CONTEXT_REFERENCE__BEFORE = eINSTANCE.getDmxContextReference_Before();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DIfExpressionImpl <em>DIf Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DIfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDIfExpression()
		 * @generated
		 */
		EClass DIF_EXPRESSION = eINSTANCE.getDIfExpression();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIF_EXPRESSION__IF = eINSTANCE.getDIfExpression_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIF_EXPRESSION__THEN = eINSTANCE.getDIfExpression_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIF_EXPRESSION__ELSE = eINSTANCE.getDIfExpression_Else();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DForLoopExpressionImpl <em>DFor Loop Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DForLoopExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDForLoopExpression()
		 * @generated
		 */
		EClass DFOR_LOOP_EXPRESSION = eINSTANCE.getDForLoopExpression();

		/**
		 * The meta object literal for the '<em><b>Declared Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFOR_LOOP_EXPRESSION__DECLARED_PARAM = eINSTANCE.getDForLoopExpression_DeclaredParam();

		/**
		 * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFOR_LOOP_EXPRESSION__FOR_EXPRESSION = eINSTANCE.getDForLoopExpression_ForExpression();

		/**
		 * The meta object literal for the '<em><b>Each Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFOR_LOOP_EXPRESSION__EACH_EXPRESSION = eINSTANCE.getDForLoopExpression_EachExpression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DBooleanLiteralImpl <em>DBoolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DBooleanLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBooleanLiteral()
		 * @generated
		 */
		EClass DBOOLEAN_LITERAL = eINSTANCE.getDBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBOOLEAN_LITERAL__VALUE = eINSTANCE.getDBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DStringLiteralImpl <em>DString Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DStringLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDStringLiteral()
		 * @generated
		 */
		EClass DSTRING_LITERAL = eINSTANCE.getDStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTRING_LITERAL__VALUE = eINSTANCE.getDStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DNaturalLiteralImpl <em>DNatural Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DNaturalLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDNaturalLiteral()
		 * @generated
		 */
		EClass DNATURAL_LITERAL = eINSTANCE.getDNaturalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNATURAL_LITERAL__VALUE = eINSTANCE.getDNaturalLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DDecimalLiteralImpl <em>DDecimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DDecimalLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDDecimalLiteral()
		 * @generated
		 */
		EClass DDECIMAL_LITERAL = eINSTANCE.getDDecimalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDECIMAL_LITERAL__VALUE = eINSTANCE.getDDecimalLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DDateLiteralImpl <em>DDate Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DDateLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDDateLiteral()
		 * @generated
		 */
		EClass DDATE_LITERAL = eINSTANCE.getDDateLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDATE_LITERAL__VALUE = eINSTANCE.getDDateLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DUndefinedLiteralImpl <em>DUndefined Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DUndefinedLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUndefinedLiteral()
		 * @generated
		 */
		EClass DUNDEFINED_LITERAL = eINSTANCE.getDUndefinedLiteral();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.DmxBaseType <em>Base Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBaseType()
		 * @generated
		 */
		EEnum DMX_BASE_TYPE = eINSTANCE.getDmxBaseType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.DBinaryOperator <em>DBinary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.DBinaryOperator
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBinaryOperator()
		 * @generated
		 */
		EEnum DBINARY_OPERATOR = eINSTANCE.getDBinaryOperator();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.DUnaryOperator <em>DUnary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.DUnaryOperator
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUnaryOperator()
		 * @generated
		 */
		EEnum DUNARY_OPERATOR = eINSTANCE.getDUnaryOperator();

	}

} //DmxPackage
