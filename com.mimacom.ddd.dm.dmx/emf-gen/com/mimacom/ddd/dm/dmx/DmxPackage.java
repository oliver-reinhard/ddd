/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.BasePackage;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxModelImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxModel()
	 * @generated
	 */
	int DMX_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__NAME = BasePackage.DMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__ALIAS = BasePackage.DMODEL__ALIAS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__DESCRIPTION = BasePackage.DMODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__NOTES = BasePackage.DMODEL__NOTES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__TYPES = BasePackage.DMODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__FILTERS = BasePackage.DMODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__TESTS = BasePackage.DMODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL_FEATURE_COUNT = BasePackage.DMODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL_OPERATION_COUNT = BasePackage.DMODEL_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST__NAVIGABLE_MEMBERS = BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxTestContextImpl <em>Test Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxTestContextImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxTestContext()
	 * @generated
	 */
	int DMX_TEST_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__NAME = BasePackage.DCONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__ALIAS = BasePackage.DCONTEXT__ALIAS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__DESCRIPTION = BasePackage.DCONTEXT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__NOTES = BasePackage.DCONTEXT__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__TYPE = BasePackage.DCONTEXT__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__MULTIPLICITY = BasePackage.DCONTEXT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__OPTIONAL = BasePackage.DCONTEXT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__COLLECTION = BasePackage.DCONTEXT__COLLECTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT__VALUE = BasePackage.DCONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT_FEATURE_COUNT = BasePackage.DCONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_TEST_CONTEXT_OPERATION_COUNT = BasePackage.DCONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxBaseTypeSetImpl <em>Base Type Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxBaseTypeSetImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBaseTypeSet()
	 * @generated
	 */
	int DMX_BASE_TYPE_SET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BASE_TYPE_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BASE_TYPE_SET__MEMBERS = 1;

	/**
	 * The number of structural features of the '<em>Base Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BASE_TYPE_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BASE_TYPE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl <em>Archetype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxArchetype()
	 * @generated
	 */
	int DMX_ARCHETYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__NAME = BasePackage.DPRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__ALIAS = BasePackage.DPRIMITIVE__ALIAS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__DESCRIPTION = BasePackage.DPRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__NOTES = BasePackage.DPRIMITIVE__NOTES;

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
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__TRANSPOSED_BY = BasePackage.DPRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE__BASE_TYPE = BasePackage.DPRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Archetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ARCHETYPE_FEATURE_COUNT = BasePackage.DPRIMITIVE_FEATURE_COUNT + 2;

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
	int DMX_FILTER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__ALIAS = BasePackage.DNAVIGABLE_MEMBER__ALIAS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__NOTES = BasePackage.DNAVIGABLE_MEMBER__NOTES;

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
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__PARAMETERS = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__TYPE_DESC = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>With Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER__WITH_TYPE_SET = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterTypeDescriptorImpl <em>Filter Type Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxFilterTypeDescriptorImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFilterTypeDescriptor()
	 * @generated
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR = 6;

	/**
	 * The feature id for the '<em><b>Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR__SINGLE = 0;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE = 1;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR__COLLECTION = 2;

	/**
	 * The feature id for the '<em><b>Multi Typed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR__MULTI_TYPED = 3;

	/**
	 * The number of structural features of the '<em>Filter Type Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR___IS_COMPATIBLE__DMXBASETYPE_BOOLEAN = 0;

	/**
	 * The operation id for the '<em>Is Compatible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR___IS_COMPATIBLE__DMXBASETYPE = 1;

	/**
	 * The number of operations of the '<em>Filter Type Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_TYPE_DESCRIPTOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterParameterImpl <em>Filter Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxFilterParameterImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFilterParameter()
	 * @generated
	 */
	int DMX_FILTER_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_PARAMETER__TYPE_DESC = 1;

	/**
	 * The number of structural features of the '<em>Filter Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filter Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FILTER_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxAssignment()
	 * @generated
	 */
	int DMX_ASSIGNMENT = 8;

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
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE__NAVIGABLE_MEMBERS = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Predicate With Correlation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Predicate With Correlation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PREDICATE_WITH_CORRELATION_VARIABLE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxCorrelationVariableImpl <em>Correlation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxCorrelationVariableImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxCorrelationVariable()
	 * @generated
	 */
	int DMX_CORRELATION_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE__ALIAS = BasePackage.DNAVIGABLE_MEMBER__ALIAS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE__NOTES = BasePackage.DNAVIGABLE_MEMBER__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>Correlation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Correlation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CORRELATION_VARIABLE_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl <em>Member Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxMemberNavigation()
	 * @generated
	 */
	int DMX_MEMBER_NAVIGATION = 11;

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
	 * The feature id for the '<em><b>Call Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MEMBER_NAVIGATION__CALL_ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxCallArgumentsImpl <em>Call Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxCallArgumentsImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxCallArguments()
	 * @generated
	 */
	int DMX_CALL_ARGUMENTS = 12;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CALL_ARGUMENTS__ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Call Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CALL_ARGUMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Call Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CALL_ARGUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFunctionCall()
	 * @generated
	 */
	int DMX_FUNCTION_CALL = 13;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_CALL__FUNCTION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FUNCTION_CALL__CALL_ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl <em>Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxBinaryOperationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBinaryOperation()
	 * @generated
	 */
	int DMX_BINARY_OPERATION = 14;

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
	int DMX_INSTANCE_OF_EXPRESSION = 15;

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
	int DMX_UNARY_OPERATION = 16;

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
	int DMX_CAST_EXPRESSION = 17;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxListExpressionImpl <em>List Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxListExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxListExpression()
	 * @generated
	 */
	int DMX_LIST_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_LIST_EXPRESSION__ELEMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_LIST_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_LIST_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxBooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxBooleanLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBooleanLiteral()
	 * @generated
	 */
	int DMX_BOOLEAN_LITERAL = 22;

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
	int DMX_STRING_LITERAL = 23;

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
	int DMX_NATURAL_LITERAL = 24;

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
	int DMX_DECIMAL_LITERAL = 25;

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
	int DMX_DATE_LITERAL = 26;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxUrlLiteralImpl <em>Url Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxUrlLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUrlLiteral()
	 * @generated
	 */
	int DMX_URL_LITERAL = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_URL_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_URL_LITERAL__DISPLAY = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Url Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_URL_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Url Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_URL_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxComplexObjectImpl <em>Complex Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxComplexObjectImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxComplexObject()
	 * @generated
	 */
	int DMX_COMPLEX_OBJECT = 29;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_COMPLEX_OBJECT__NAVIGABLE_MEMBERS = BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_COMPLEX_OBJECT__TYPE = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_COMPLEX_OBJECT__FIELDS = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_COMPLEX_OBJECT_FEATURE_COUNT = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Complex Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_COMPLEX_OBJECT_OPERATION_COUNT = BasePackage.INAVIGABLE_MEMBER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxFieldImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxField()
	 * @generated
	 */
	int DMX_FIELD = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__ALIAS = BasePackage.DNAVIGABLE_MEMBER__ALIAS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__NOTES = BasePackage.DNAVIGABLE_MEMBER__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__FEATURE = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD__VALUE = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIELD_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxEntityImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxEntity()
	 * @generated
	 */
	int DMX_ENTITY = 31;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ENTITY__NAVIGABLE_MEMBERS = DMX_COMPLEX_OBJECT__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ENTITY__TYPE = DMX_COMPLEX_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ENTITY__FIELDS = DMX_COMPLEX_OBJECT__FIELDS;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ENTITY_FEATURE_COUNT = DMX_COMPLEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_ENTITY_OPERATION_COUNT = DMX_COMPLEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxDetailImpl <em>Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxDetailImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxDetail()
	 * @generated
	 */
	int DMX_DETAIL = 32;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DETAIL__NAVIGABLE_MEMBERS = DMX_COMPLEX_OBJECT__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DETAIL__TYPE = DMX_COMPLEX_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DETAIL__FIELDS = DMX_COMPLEX_OBJECT__FIELDS;

	/**
	 * The number of structural features of the '<em>Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DETAIL_FEATURE_COUNT = DMX_COMPLEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DETAIL_OPERATION_COUNT = DMX_COMPLEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DmxBaseType <em>Base Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBaseType()
	 * @generated
	 */
	int DMX_BASE_TYPE = 33;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperator
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBinaryOperator()
	 * @generated
	 */
	int DMX_BINARY_OPERATOR = 34;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperator
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUnaryOperator()
	 * @generated
	 */
	int DMX_UNARY_OPERATOR = 35;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxModel
	 * @generated
	 */
	EClass getDmxModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxModel#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxModel#getFilters()
	 * @see #getDmxModel()
	 * @generated
	 */
	EReference getDmxModel_Filters();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxModel#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxModel#getTests()
	 * @see #getDmxModel()
	 * @generated
	 */
	EReference getDmxModel_Tests();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxTestContext <em>Test Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Context</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxTestContext
	 * @generated
	 */
	EClass getDmxTestContext();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxTestContext#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxTestContext#getValue()
	 * @see #getDmxTestContext()
	 * @generated
	 */
	EReference getDmxTestContext_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxBaseTypeSet <em>Base Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Type Set</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseTypeSet
	 * @generated
	 */
	EClass getDmxBaseTypeSet();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxBaseTypeSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseTypeSet#getName()
	 * @see #getDmxBaseTypeSet()
	 * @generated
	 */
	EAttribute getDmxBaseTypeSet_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.mimacom.ddd.dm.dmx.DmxBaseTypeSet#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Members</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseTypeSet#getMembers()
	 * @see #getDmxBaseTypeSet()
	 * @generated
	 */
	EAttribute getDmxBaseTypeSet_Members();

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
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxFilter#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilter#getParameters()
	 * @see #getDmxFilter()
	 * @generated
	 */
	EReference getDmxFilter_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxFilter#getTypeDesc <em>Type Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Desc</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilter#getTypeDesc()
	 * @see #getDmxFilter()
	 * @generated
	 */
	EReference getDmxFilter_TypeDesc();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxFilter#getWithTypeSet <em>With Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>With Type Set</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilter#getWithTypeSet()
	 * @see #getDmxFilter()
	 * @generated
	 */
	EReference getDmxFilter_WithTypeSet();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor <em>Filter Type Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type Descriptor</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor
	 * @generated
	 */
	EClass getDmxFilterTypeDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#getSingle <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#getSingle()
	 * @see #getDmxFilterTypeDescriptor()
	 * @generated
	 */
	EAttribute getDmxFilterTypeDescriptor_Single();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#getMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multiple</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#getMultiple()
	 * @see #getDmxFilterTypeDescriptor()
	 * @generated
	 */
	EReference getDmxFilterTypeDescriptor_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isCollection()
	 * @see #getDmxFilterTypeDescriptor()
	 * @generated
	 */
	EAttribute getDmxFilterTypeDescriptor_Collection();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isMultiTyped <em>Multi Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Typed</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isMultiTyped()
	 * @see #getDmxFilterTypeDescriptor()
	 * @generated
	 */
	EAttribute getDmxFilterTypeDescriptor_MultiTyped();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isCompatible(com.mimacom.ddd.dm.dmx.DmxBaseType, boolean) <em>Is Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible</em>' operation.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isCompatible(com.mimacom.ddd.dm.dmx.DmxBaseType, boolean)
	 * @generated
	 */
	EOperation getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType_boolean();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isCompatible(com.mimacom.ddd.dm.dmx.DmxBaseType) <em>Is Compatible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible</em>' operation.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor#isCompatible(com.mimacom.ddd.dm.dmx.DmxBaseType)
	 * @generated
	 */
	EOperation getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxFilterParameter <em>Filter Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Parameter</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterParameter
	 * @generated
	 */
	EClass getDmxFilterParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxFilterParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterParameter#getName()
	 * @see #getDmxFilterParameter()
	 * @generated
	 */
	EAttribute getDmxFilterParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxFilterParameter#getTypeDesc <em>Type Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Desc</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterParameter#getTypeDesc()
	 * @see #getDmxFilterParameter()
	 * @generated
	 */
	EReference getDmxFilterParameter_TypeDesc();

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
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicate</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getPredicate()
	 * @see #getDmxPredicateWithCorrelationVariable()
	 * @generated
	 */
	EReference getDmxPredicateWithCorrelationVariable_Predicate();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxCorrelationVariable <em>Correlation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Variable</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxCorrelationVariable
	 * @generated
	 */
	EClass getDmxCorrelationVariable();

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
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getCallArguments <em>Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getCallArguments()
	 * @see #getDmxMemberNavigation()
	 * @generated
	 */
	EReference getDmxMemberNavigation_CallArguments();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxCallArguments <em>Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxCallArguments
	 * @generated
	 */
	EClass getDmxCallArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxCallArguments#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxCallArguments#getArguments()
	 * @see #getDmxCallArguments()
	 * @generated
	 */
	EReference getDmxCallArguments_Arguments();

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
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall#getCallArguments <em>Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionCall#getCallArguments()
	 * @see #getDmxFunctionCall()
	 * @generated
	 */
	EReference getDmxFunctionCall_CallArguments();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxListExpression <em>List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxListExpression
	 * @generated
	 */
	EClass getDmxListExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxListExpression#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxListExpression#getElements()
	 * @see #getDmxListExpression()
	 * @generated
	 */
	EReference getDmxListExpression_Elements();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxUrlLiteral <em>Url Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxUrlLiteral
	 * @generated
	 */
	EClass getDmxUrlLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxUrlLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxUrlLiteral#getValue()
	 * @see #getDmxUrlLiteral()
	 * @generated
	 */
	EAttribute getDmxUrlLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DmxUrlLiteral#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxUrlLiteral#getDisplay()
	 * @see #getDmxUrlLiteral()
	 * @generated
	 */
	EAttribute getDmxUrlLiteral_Display();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxComplexObject <em>Complex Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Object</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxComplexObject
	 * @generated
	 */
	EClass getDmxComplexObject();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxComplexObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxComplexObject#getType()
	 * @see #getDmxComplexObject()
	 * @generated
	 */
	EReference getDmxComplexObject_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxComplexObject#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxComplexObject#getFields()
	 * @see #getDmxComplexObject()
	 * @generated
	 */
	EReference getDmxComplexObject_Fields();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxField
	 * @generated
	 */
	EClass getDmxField();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DmxField#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxField#getFeature()
	 * @see #getDmxField()
	 * @generated
	 */
	EReference getDmxField_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DmxField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxField#getValue()
	 * @see #getDmxField()
	 * @generated
	 */
	EReference getDmxField_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxEntity
	 * @generated
	 */
	EClass getDmxEntity();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxDetail
	 * @generated
	 */
	EClass getDmxDetail();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxModelImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxModel()
		 * @generated
		 */
		EClass DMX_MODEL = eINSTANCE.getDmxModel();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_MODEL__FILTERS = eINSTANCE.getDmxModel_Filters();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_MODEL__TESTS = eINSTANCE.getDmxModel_Tests();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxTestContextImpl <em>Test Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxTestContextImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxTestContext()
		 * @generated
		 */
		EClass DMX_TEST_CONTEXT = eINSTANCE.getDmxTestContext();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_TEST_CONTEXT__VALUE = eINSTANCE.getDmxTestContext_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxBaseTypeSetImpl <em>Base Type Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxBaseTypeSetImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxBaseTypeSet()
		 * @generated
		 */
		EClass DMX_BASE_TYPE_SET = eINSTANCE.getDmxBaseTypeSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_BASE_TYPE_SET__NAME = eINSTANCE.getDmxBaseTypeSet_Name();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_BASE_TYPE_SET__MEMBERS = eINSTANCE.getDmxBaseTypeSet_Members();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FILTER__PARAMETERS = eINSTANCE.getDmxFilter_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type Desc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FILTER__TYPE_DESC = eINSTANCE.getDmxFilter_TypeDesc();

		/**
		 * The meta object literal for the '<em><b>With Type Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FILTER__WITH_TYPE_SET = eINSTANCE.getDmxFilter_WithTypeSet();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterTypeDescriptorImpl <em>Filter Type Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxFilterTypeDescriptorImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFilterTypeDescriptor()
		 * @generated
		 */
		EClass DMX_FILTER_TYPE_DESCRIPTOR = eINSTANCE.getDmxFilterTypeDescriptor();

		/**
		 * The meta object literal for the '<em><b>Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FILTER_TYPE_DESCRIPTOR__SINGLE = eINSTANCE.getDmxFilterTypeDescriptor_Single();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE = eINSTANCE.getDmxFilterTypeDescriptor_Multiple();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FILTER_TYPE_DESCRIPTOR__COLLECTION = eINSTANCE.getDmxFilterTypeDescriptor_Collection();

		/**
		 * The meta object literal for the '<em><b>Multi Typed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FILTER_TYPE_DESCRIPTOR__MULTI_TYPED = eINSTANCE.getDmxFilterTypeDescriptor_MultiTyped();

		/**
		 * The meta object literal for the '<em><b>Is Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DMX_FILTER_TYPE_DESCRIPTOR___IS_COMPATIBLE__DMXBASETYPE_BOOLEAN = eINSTANCE.getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType_boolean();

		/**
		 * The meta object literal for the '<em><b>Is Compatible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DMX_FILTER_TYPE_DESCRIPTOR___IS_COMPATIBLE__DMXBASETYPE = eINSTANCE.getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterParameterImpl <em>Filter Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxFilterParameterImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxFilterParameter()
		 * @generated
		 */
		EClass DMX_FILTER_PARAMETER = eINSTANCE.getDmxFilterParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FILTER_PARAMETER__NAME = eINSTANCE.getDmxFilterParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type Desc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FILTER_PARAMETER__TYPE_DESC = eINSTANCE.getDmxFilterParameter_TypeDesc();

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
		 * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE = eINSTANCE.getDmxPredicateWithCorrelationVariable_Predicate();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxCorrelationVariableImpl <em>Correlation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxCorrelationVariableImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxCorrelationVariable()
		 * @generated
		 */
		EClass DMX_CORRELATION_VARIABLE = eINSTANCE.getDmxCorrelationVariable();

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
		 * The meta object literal for the '<em><b>Call Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_MEMBER_NAVIGATION__CALL_ARGUMENTS = eINSTANCE.getDmxMemberNavigation_CallArguments();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_MEMBER_NAVIGATION__BEFORE = eINSTANCE.getDmxMemberNavigation_Before();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxCallArgumentsImpl <em>Call Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxCallArgumentsImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxCallArguments()
		 * @generated
		 */
		EClass DMX_CALL_ARGUMENTS = eINSTANCE.getDmxCallArguments();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_CALL_ARGUMENTS__ARGUMENTS = eINSTANCE.getDmxCallArguments_Arguments();

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
		 * The meta object literal for the '<em><b>Call Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FUNCTION_CALL__CALL_ARGUMENTS = eINSTANCE.getDmxFunctionCall_CallArguments();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxListExpressionImpl <em>List Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxListExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxListExpression()
		 * @generated
		 */
		EClass DMX_LIST_EXPRESSION = eINSTANCE.getDmxListExpression();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_LIST_EXPRESSION__ELEMENTS = eINSTANCE.getDmxListExpression_Elements();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxUrlLiteralImpl <em>Url Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxUrlLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxUrlLiteral()
		 * @generated
		 */
		EClass DMX_URL_LITERAL = eINSTANCE.getDmxUrlLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_URL_LITERAL__VALUE = eINSTANCE.getDmxUrlLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_URL_LITERAL__DISPLAY = eINSTANCE.getDmxUrlLiteral_Display();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxComplexObjectImpl <em>Complex Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxComplexObjectImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxComplexObject()
		 * @generated
		 */
		EClass DMX_COMPLEX_OBJECT = eINSTANCE.getDmxComplexObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_COMPLEX_OBJECT__TYPE = eINSTANCE.getDmxComplexObject_Type();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_COMPLEX_OBJECT__FIELDS = eINSTANCE.getDmxComplexObject_Fields();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxFieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxFieldImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxField()
		 * @generated
		 */
		EClass DMX_FIELD = eINSTANCE.getDmxField();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FIELD__FEATURE = eINSTANCE.getDmxField_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FIELD__VALUE = eINSTANCE.getDmxField_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxEntityImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxEntity()
		 * @generated
		 */
		EClass DMX_ENTITY = eINSTANCE.getDmxEntity();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxDetailImpl <em>Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxDetailImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxDetail()
		 * @generated
		 */
		EClass DMX_DETAIL = eINSTANCE.getDmxDetail();

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
