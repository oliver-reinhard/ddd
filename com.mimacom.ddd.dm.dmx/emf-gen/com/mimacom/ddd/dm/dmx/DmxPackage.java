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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxAssignment()
	 * @generated
	 */
	int DMX_ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Preceding Navigation Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assign To Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ASSIGNMENT__ASSIGN_TO_MEMBER = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ASSIGNMENT__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ASSIGNMENT_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ASSIGNMENT_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxPredicateWithCorrelationVariableImpl <em>Predicate With Correlation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPredicateWithCorrelationVariableImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxPredicateWithCorrelationVariable()
	 * @generated
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Correlation Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predicate With Correlation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Predicate With Correlation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl <em>Member Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxMemberNavigation()
	 * @generated
	 */
	int DMX_MEMBER_NAVIGATION = 9;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBinaryOperation()
	 * @generated
	 */
	int DMX_BINARY_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BINARY_OPERATION__LEFT_OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BINARY_OPERATION__OPERATOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BINARY_OPERATION__RIGHT_OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BINARY_OPERATION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BINARY_OPERATION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxInstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxInstanceOfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxInstanceOfExpression()
	 * @generated
	 */
	int DMX_INSTANCE_OF_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_INSTANCE_OF_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_INSTANCE_OF_EXPRESSION__TYPE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_INSTANCE_OF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_INSTANCE_OF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxUnaryOperationImpl <em>Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxUnaryOperationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUnaryOperation()
	 * @generated
	 */
	int DMX_UNARY_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNARY_OPERATION__OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNARY_OPERATION__OPERATOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNARY_OPERATION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNARY_OPERATION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxCastExpressionImpl <em>Cast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxCastExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxCastExpression()
	 * @generated
	 */
	int DMX_CAST_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CAST_EXPRESSION__TARGET = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CAST_EXPRESSION__TYPE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CAST_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CAST_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxSelfExpressionImpl <em>Self Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxSelfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxSelfExpression()
	 * @generated
	 */
	int DMX_SELF_EXPRESSION = 14;

	/**
	 * The number of structural features of the '<em>Self Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_SELF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Self Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_SELF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxReturnExpressionImpl <em>Return Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxReturnExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxReturnExpression()
	 * @generated
	 */
	int DMX_RETURN_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_RETURN_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_RETURN_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_RETURN_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxRaiseExpressionImpl <em>Raise Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxRaiseExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxRaiseExpression()
	 * @generated
	 */
	int DMX_RAISE_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_RAISE_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_RAISE_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_RAISE_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFunctionCall()
	 * @generated
	 */
	int DMX_FUNCTION_CALL = 17;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_CALL__FUNCTION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_CALL__FUNCTION_CALL_ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_CALL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_CALL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl <em>Constructor Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxConstructorCall()
	 * @generated
	 */
	int DMX_CONSTRUCTOR_CALL = 18;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONSTRUCTOR_CALL__CONSTRUCTOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explicit Constructor Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONSTRUCTOR_CALL__ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONSTRUCTOR_CALL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Constructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CONSTRUCTOR_CALL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxIfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxIfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxIfExpression()
	 * @generated
	 */
	int DMX_IF_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_IF_EXPRESSION__IF = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_IF_EXPRESSION__THEN = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_IF_EXPRESSION__ELSE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_IF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_IF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxForLoopExpressionImpl <em>For Loop Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxForLoopExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxForLoopExpression()
	 * @generated
	 */
	int DMX_FOR_LOOP_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Declared Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FOR_LOOP_EXPRESSION__DECLARED_PARAM = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Loop Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FOR_LOOP_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>For Loop Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FOR_LOOP_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxBooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxBooleanLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBooleanLiteral()
	 * @generated
	 */
	int DMX_BOOLEAN_LITERAL = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BOOLEAN_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BOOLEAN_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BOOLEAN_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxStringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxStringLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxStringLiteral()
	 * @generated
	 */
	int DMX_STRING_LITERAL = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STRING_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STRING_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_STRING_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxNaturalLiteralImpl <em>Natural Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxNaturalLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxNaturalLiteral()
	 * @generated
	 */
	int DMX_NATURAL_LITERAL = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NATURAL_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Natural Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NATURAL_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Natural Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_NATURAL_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxDecimalLiteralImpl <em>Decimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxDecimalLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxDecimalLiteral()
	 * @generated
	 */
	int DMX_DECIMAL_LITERAL = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DECIMAL_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DECIMAL_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DECIMAL_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxDateLiteralImpl <em>Date Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxDateLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxDateLiteral()
	 * @generated
	 */
	int DMX_DATE_LITERAL = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DATE_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DATE_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DATE_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxUndefinedLiteralImpl <em>Undefined Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxUndefinedLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUndefinedLiteral()
	 * @generated
	 */
	int DMX_UNDEFINED_LITERAL = 28;

	/**
	 * The number of structural features of the '<em>Undefined Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNDEFINED_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undefined Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNDEFINED_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperator
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBinaryOperator()
	 * @generated
	 */
	int DMX_BINARY_OPERATOR = 30;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperator
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUnaryOperator()
	 * @generated
	 */
	int DMX_UNARY_OPERATOR = 31;


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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxAssignment
	 * @generated
	 */
	EClass getDmxAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxAssignment#getPrecedingNavigationSegment <em>Preceding Navigation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preceding Navigation Segment</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxAssignment#getPrecedingNavigationSegment()
	 * @see #getDmxAssignment()
	 * @generated
	 */
	EReference getDmxAssignment_PrecedingNavigationSegment();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxAssignment#getAssignToMember <em>Assign To Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assign To Member</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxAssignment#getAssignToMember()
	 * @see #getDmxAssignment()
	 * @generated
	 */
	EReference getDmxAssignment_AssignToMember();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxAssignment#getValue()
	 * @see #getDmxAssignment()
	 * @generated
	 */
	EReference getDmxAssignment_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable <em>Predicate With Correlation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate With Correlation Variable</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable
	 * @generated
	 */
	EClass getDmxPredicateWithCorrelationVariable();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getCorrelationVariable <em>Correlation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Variable</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getCorrelationVariable()
	 * @see #getDmxPredicateWithCorrelationVariable()
	 * @generated
	 */
	EReference getDmxPredicateWithCorrelationVariable_CorrelationVariable();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getValue()
	 * @see #getDmxPredicateWithCorrelationVariable()
	 * @generated
	 */
	EReference getDmxPredicateWithCorrelationVariable_Value();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operation</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperation
	 * @generated
	 */
	EClass getDmxBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperation#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperation#getLeftOperand()
	 * @see #getDmxBinaryOperation()
	 * @generated
	 */
	EReference getDmxBinaryOperation_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperation#getOperator()
	 * @see #getDmxBinaryOperation()
	 * @generated
	 */
	EAttribute getDmxBinaryOperation_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperation#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperation#getRightOperand()
	 * @see #getDmxBinaryOperation()
	 * @generated
	 */
	EReference getDmxBinaryOperation_RightOperand();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression <em>Instance Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Of Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression
	 * @generated
	 */
	EClass getDmxInstanceOfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression#getExpression()
	 * @see #getDmxInstanceOfExpression()
	 * @generated
	 */
	EReference getDmxInstanceOfExpression_Expression();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression#getType()
	 * @see #getDmxInstanceOfExpression()
	 * @generated
	 */
	EReference getDmxInstanceOfExpression_Type();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operation</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperation
	 * @generated
	 */
	EClass getDmxUnaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperation#getOperand()
	 * @see #getDmxUnaryOperation()
	 * @generated
	 */
	EReference getDmxUnaryOperation_Operand();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperation#getOperator()
	 * @see #getDmxUnaryOperation()
	 * @generated
	 */
	EAttribute getDmxUnaryOperation_Operator();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxCastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxCastExpression
	 * @generated
	 */
	EClass getDmxCastExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxCastExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxCastExpression#getTarget()
	 * @see #getDmxCastExpression()
	 * @generated
	 */
	EReference getDmxCastExpression_Target();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxCastExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxCastExpression#getType()
	 * @see #getDmxCastExpression()
	 * @generated
	 */
	EReference getDmxCastExpression_Type();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxSelfExpression <em>Self Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxSelfExpression
	 * @generated
	 */
	EClass getDmxSelfExpression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxReturnExpression <em>Return Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxReturnExpression
	 * @generated
	 */
	EClass getDmxReturnExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxReturnExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxReturnExpression#getExpression()
	 * @see #getDmxReturnExpression()
	 * @generated
	 */
	EReference getDmxReturnExpression_Expression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxRaiseExpression <em>Raise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxRaiseExpression
	 * @generated
	 */
	EClass getDmxRaiseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxRaiseExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxRaiseExpression#getExpression()
	 * @see #getDmxRaiseExpression()
	 * @generated
	 */
	EReference getDmxRaiseExpression_Expression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionCall
	 * @generated
	 */
	EClass getDmxFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionCall#getFunction()
	 * @see #getDmxFunctionCall()
	 * @generated
	 */
	EReference getDmxFunctionCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall#getFunctionCallArguments <em>Function Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Call Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionCall#getFunctionCallArguments()
	 * @see #getDmxFunctionCall()
	 * @generated
	 */
	EReference getDmxFunctionCall_FunctionCallArguments();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall <em>Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxConstructorCall
	 * @generated
	 */
	EClass getDmxConstructorCall();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall#getConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constructor</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxConstructorCall#getConstructor()
	 * @see #getDmxConstructorCall()
	 * @generated
	 */
	EReference getDmxConstructorCall_Constructor();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Constructor Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxConstructorCall#isExplicitConstructorCall()
	 * @see #getDmxConstructorCall()
	 * @generated
	 */
	EAttribute getDmxConstructorCall_ExplicitConstructorCall();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxConstructorCall#getArguments()
	 * @see #getDmxConstructorCall()
	 * @generated
	 */
	EReference getDmxConstructorCall_Arguments();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxIfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxIfExpression
	 * @generated
	 */
	EClass getDmxIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxIfExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxIfExpression#getIf()
	 * @see #getDmxIfExpression()
	 * @generated
	 */
	EReference getDmxIfExpression_If();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxIfExpression#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxIfExpression#getThen()
	 * @see #getDmxIfExpression()
	 * @generated
	 */
	EReference getDmxIfExpression_Then();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxIfExpression#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxIfExpression#getElse()
	 * @see #getDmxIfExpression()
	 * @generated
	 */
	EReference getDmxIfExpression_Else();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression <em>For Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxForLoopExpression
	 * @generated
	 */
	EClass getDmxForLoopExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getDeclaredParam <em>Declared Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Param</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getDeclaredParam()
	 * @see #getDmxForLoopExpression()
	 * @generated
	 */
	EAttribute getDmxForLoopExpression_DeclaredParam();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getForExpression <em>For Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getForExpression()
	 * @see #getDmxForLoopExpression()
	 * @generated
	 */
	EReference getDmxForLoopExpression_ForExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getEachExpression <em>Each Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Each Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getEachExpression()
	 * @see #getDmxForLoopExpression()
	 * @generated
	 */
	EReference getDmxForLoopExpression_EachExpression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxBooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBooleanLiteral
	 * @generated
	 */
	EClass getDmxBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxBooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBooleanLiteral#isValue()
	 * @see #getDmxBooleanLiteral()
	 * @generated
	 */
	EAttribute getDmxBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxStringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxStringLiteral
	 * @generated
	 */
	EClass getDmxStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxStringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxStringLiteral#getValue()
	 * @see #getDmxStringLiteral()
	 * @generated
	 */
	EAttribute getDmxStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxNaturalLiteral <em>Natural Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxNaturalLiteral
	 * @generated
	 */
	EClass getDmxNaturalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxNaturalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxNaturalLiteral#getValue()
	 * @see #getDmxNaturalLiteral()
	 * @generated
	 */
	EAttribute getDmxNaturalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxDecimalLiteral <em>Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxDecimalLiteral
	 * @generated
	 */
	EClass getDmxDecimalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxDecimalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxDecimalLiteral#getValue()
	 * @see #getDmxDecimalLiteral()
	 * @generated
	 */
	EAttribute getDmxDecimalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxDateLiteral <em>Date Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxDateLiteral
	 * @generated
	 */
	EClass getDmxDateLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxDateLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxDateLiteral#getValue()
	 * @see #getDmxDateLiteral()
	 * @generated
	 */
	EAttribute getDmxDateLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral <em>Undefined Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undefined Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral
	 * @generated
	 */
	EClass getDmxUndefinedLiteral();

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
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperator
	 * @generated
	 */
	EEnum getDmxBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperator
	 * @generated
	 */
	EEnum getDmxUnaryOperator();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxAssignment()
		 * @generated
		 */
		EClass DMX_ASSIGNMENT = eINSTANCE.getDmxAssignment();

		/**
		 * The meta object literal for the '<em><b>Preceding Navigation Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT = eINSTANCE.getDmxAssignment_PrecedingNavigationSegment();

		/**
		 * The meta object literal for the '<em><b>Assign To Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_ASSIGNMENT__ASSIGN_TO_MEMBER = eINSTANCE.getDmxAssignment_AssignToMember();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_ASSIGNMENT__VALUE = eINSTANCE.getDmxAssignment_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxPredicateWithCorrelationVariableImpl <em>Predicate With Correlation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPredicateWithCorrelationVariableImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxPredicateWithCorrelationVariable()
		 * @generated
		 */
		EClass DMX_PREDICATE_WITH_CORRELATION_VARIABLE = eINSTANCE.getDmxPredicateWithCorrelationVariable();

		/**
		 * The meta object literal for the '<em><b>Correlation Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE = eINSTANCE.getDmxPredicateWithCorrelationVariable_CorrelationVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE = eINSTANCE.getDmxPredicateWithCorrelationVariable_Value();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl <em>Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBinaryOperation()
		 * @generated
		 */
		EClass DMX_BINARY_OPERATION = eINSTANCE.getDmxBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_BINARY_OPERATION__LEFT_OPERAND = eINSTANCE.getDmxBinaryOperation_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_BINARY_OPERATION__OPERATOR = eINSTANCE.getDmxBinaryOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_BINARY_OPERATION__RIGHT_OPERAND = eINSTANCE.getDmxBinaryOperation_RightOperand();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxInstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxInstanceOfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxInstanceOfExpression()
		 * @generated
		 */
		EClass DMX_INSTANCE_OF_EXPRESSION = eINSTANCE.getDmxInstanceOfExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_INSTANCE_OF_EXPRESSION__EXPRESSION = eINSTANCE.getDmxInstanceOfExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_INSTANCE_OF_EXPRESSION__TYPE = eINSTANCE.getDmxInstanceOfExpression_Type();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxUnaryOperationImpl <em>Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxUnaryOperationImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUnaryOperation()
		 * @generated
		 */
		EClass DMX_UNARY_OPERATION = eINSTANCE.getDmxUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_UNARY_OPERATION__OPERAND = eINSTANCE.getDmxUnaryOperation_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_UNARY_OPERATION__OPERATOR = eINSTANCE.getDmxUnaryOperation_Operator();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxCastExpressionImpl <em>Cast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxCastExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxCastExpression()
		 * @generated
		 */
		EClass DMX_CAST_EXPRESSION = eINSTANCE.getDmxCastExpression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_CAST_EXPRESSION__TARGET = eINSTANCE.getDmxCastExpression_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_CAST_EXPRESSION__TYPE = eINSTANCE.getDmxCastExpression_Type();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxSelfExpressionImpl <em>Self Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxSelfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxSelfExpression()
		 * @generated
		 */
		EClass DMX_SELF_EXPRESSION = eINSTANCE.getDmxSelfExpression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxReturnExpressionImpl <em>Return Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxReturnExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxReturnExpression()
		 * @generated
		 */
		EClass DMX_RETURN_EXPRESSION = eINSTANCE.getDmxReturnExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_RETURN_EXPRESSION__EXPRESSION = eINSTANCE.getDmxReturnExpression_Expression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxRaiseExpressionImpl <em>Raise Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxRaiseExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxRaiseExpression()
		 * @generated
		 */
		EClass DMX_RAISE_EXPRESSION = eINSTANCE.getDmxRaiseExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_RAISE_EXPRESSION__EXPRESSION = eINSTANCE.getDmxRaiseExpression_Expression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFunctionCall()
		 * @generated
		 */
		EClass DMX_FUNCTION_CALL = eINSTANCE.getDmxFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FUNCTION_CALL__FUNCTION = eINSTANCE.getDmxFunctionCall_Function();

		/**
		 * The meta object literal for the '<em><b>Function Call Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FUNCTION_CALL__FUNCTION_CALL_ARGUMENTS = eINSTANCE.getDmxFunctionCall_FunctionCallArguments();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl <em>Constructor Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxConstructorCall()
		 * @generated
		 */
		EClass DMX_CONSTRUCTOR_CALL = eINSTANCE.getDmxConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_CONSTRUCTOR_CALL__CONSTRUCTOR = eINSTANCE.getDmxConstructorCall_Constructor();

		/**
		 * The meta object literal for the '<em><b>Explicit Constructor Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = eINSTANCE.getDmxConstructorCall_ExplicitConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_CONSTRUCTOR_CALL__ARGUMENTS = eINSTANCE.getDmxConstructorCall_Arguments();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxIfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxIfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxIfExpression()
		 * @generated
		 */
		EClass DMX_IF_EXPRESSION = eINSTANCE.getDmxIfExpression();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_IF_EXPRESSION__IF = eINSTANCE.getDmxIfExpression_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_IF_EXPRESSION__THEN = eINSTANCE.getDmxIfExpression_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_IF_EXPRESSION__ELSE = eINSTANCE.getDmxIfExpression_Else();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxForLoopExpressionImpl <em>For Loop Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxForLoopExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxForLoopExpression()
		 * @generated
		 */
		EClass DMX_FOR_LOOP_EXPRESSION = eINSTANCE.getDmxForLoopExpression();

		/**
		 * The meta object literal for the '<em><b>Declared Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FOR_LOOP_EXPRESSION__DECLARED_PARAM = eINSTANCE.getDmxForLoopExpression_DeclaredParam();

		/**
		 * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION = eINSTANCE.getDmxForLoopExpression_ForExpression();

		/**
		 * The meta object literal for the '<em><b>Each Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION = eINSTANCE.getDmxForLoopExpression_EachExpression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxBooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxBooleanLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBooleanLiteral()
		 * @generated
		 */
		EClass DMX_BOOLEAN_LITERAL = eINSTANCE.getDmxBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_BOOLEAN_LITERAL__VALUE = eINSTANCE.getDmxBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxStringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxStringLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxStringLiteral()
		 * @generated
		 */
		EClass DMX_STRING_LITERAL = eINSTANCE.getDmxStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_STRING_LITERAL__VALUE = eINSTANCE.getDmxStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxNaturalLiteralImpl <em>Natural Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxNaturalLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxNaturalLiteral()
		 * @generated
		 */
		EClass DMX_NATURAL_LITERAL = eINSTANCE.getDmxNaturalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_NATURAL_LITERAL__VALUE = eINSTANCE.getDmxNaturalLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxDecimalLiteralImpl <em>Decimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxDecimalLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxDecimalLiteral()
		 * @generated
		 */
		EClass DMX_DECIMAL_LITERAL = eINSTANCE.getDmxDecimalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_DECIMAL_LITERAL__VALUE = eINSTANCE.getDmxDecimalLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxDateLiteralImpl <em>Date Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxDateLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxDateLiteral()
		 * @generated
		 */
		EClass DMX_DATE_LITERAL = eINSTANCE.getDmxDateLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_DATE_LITERAL__VALUE = eINSTANCE.getDmxDateLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxUndefinedLiteralImpl <em>Undefined Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxUndefinedLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUndefinedLiteral()
		 * @generated
		 */
		EClass DMX_UNDEFINED_LITERAL = eINSTANCE.getDmxUndefinedLiteral();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperator
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBinaryOperator()
		 * @generated
		 */
		EEnum DMX_BINARY_OPERATOR = eINSTANCE.getDmxBinaryOperator();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperator
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUnaryOperator()
		 * @generated
		 */
		EEnum DMX_UNARY_OPERATOR = eINSTANCE.getDmxUnaryOperator();

	}

} //DmxPackage
