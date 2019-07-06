/**
 */
package com.mimacom.ddd.sm.sim;

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
 * @see com.mimacom.ddd.sm.sim.SimFactory
 * @model kind="package"
 * @generated
 */
public interface SimPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/sm/sim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimPackage eINSTANCE = com.mimacom.ddd.sm.sim.impl.SimPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SIdentityType <em>SIdentity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SIdentityType
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSIdentityType()
	 * @generated
	 */
	int SIDENTITY_TYPE = 0;

	/**
	 * The number of structural features of the '<em>SIdentity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDENTITY_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>SIdentity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDENTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SValueType <em>SValue Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SValueType
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSValueType()
	 * @generated
	 */
	int SVALUE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>SValue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVALUE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>SValue Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl <em>SInformation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SInformationModelImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSInformationModel()
	 * @generated
	 */
	int SINFORMATION_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__GENERATE = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__KIND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__IMPORTS = 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__TYPES = 4;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__AGGREGATES = 5;

	/**
	 * The feature id for the '<em><b>Domain Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__DOMAIN_PROXIES = 6;

	/**
	 * The number of structural features of the '<em>SInformation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>SInformation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SNamedElementImpl <em>SNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SNamedElementImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSNamedElement()
	 * @generated
	 */
	int SNAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>SNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SDeducibleElement <em>SDeducible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SDeducibleElement
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDeducibleElement()
	 * @generated
	 */
	int SDEDUCIBLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCIBLE_ELEMENT__DEDUCTION_RULE = 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCIBLE_ELEMENT__NATURE = 1;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCIBLE_ELEMENT__SYNTHETIC = 2;

	/**
	 * The number of structural features of the '<em>SDeducible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCIBLE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SDeducible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCIBLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SNamedDeducibleElementImpl <em>SNamed Deducible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SNamedDeducibleElementImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSNamedDeducibleElement()
	 * @generated
	 */
	int SNAMED_DEDUCIBLE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_DEDUCIBLE_ELEMENT__NAME = SNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE = SNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_DEDUCIBLE_ELEMENT__NATURE = SNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC = SNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SNamed Deducible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT = SNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SNamed Deducible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_DEDUCIBLE_ELEMENT_OPERATION_COUNT = SNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SExpressionImpl <em>SExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SExpressionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSExpression()
	 * @generated
	 */
	int SEXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEXPRESSION__EXPR = 0;

	/**
	 * The number of structural features of the '<em>SExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SImportImpl <em>SImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SImportImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSImport()
	 * @generated
	 */
	int SIMPORT = 7;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>SImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SDomainProxyImpl <em>SDomain Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SDomainProxyImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDomainProxy()
	 * @generated
	 */
	int SDOMAIN_PROXY = 8;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOMAIN_PROXY__DEDUCTION_RULE = SDEDUCIBLE_ELEMENT__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOMAIN_PROXY__NATURE = SDEDUCIBLE_ELEMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOMAIN_PROXY__SYNTHETIC = SDEDUCIBLE_ELEMENT__SYNTHETIC;

	/**
	 * The number of structural features of the '<em>SDomain Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOMAIN_PROXY_FEATURE_COUNT = SDEDUCIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SDomain Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOMAIN_PROXY_OPERATION_COUNT = SDEDUCIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SAggregateImpl <em>SAggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SAggregateImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAggregate()
	 * @generated
	 */
	int SAGGREGATE = 9;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE__DEDUCTION_RULE = SDEDUCIBLE_ELEMENT__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE__NATURE = SDEDUCIBLE_ELEMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE__SYNTHETIC = SDEDUCIBLE_ELEMENT__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE__TYPES = SDEDUCIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE__ROOTS = SDEDUCIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE__DERIVED_NAME = SDEDUCIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SAggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_FEATURE_COUNT = SDEDUCIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SAggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_OPERATION_COUNT = SDEDUCIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.STypeImpl <em>SType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.STypeImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSType()
	 * @generated
	 */
	int STYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE__NAME = SNAMED_DEDUCIBLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE__DEDUCTION_RULE = SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE__NATURE = SNAMED_DEDUCIBLE_ELEMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE__SYNTHETIC = SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE__CONSTRAINTS = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE_FEATURE_COUNT = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE_OPERATION_COUNT = SNAMED_DEDUCIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SConditionImpl <em>SCondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SConditionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSCondition()
	 * @generated
	 */
	int SCONDITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONDITION__NAME = SNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONDITION__CONDITION = SNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONDITION_FEATURE_COUNT = SNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONDITION_OPERATION_COUNT = SNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SSimpleTypeImpl <em>SSimple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SSimpleTypeImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSSimpleType()
	 * @generated
	 */
	int SSIMPLE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSIMPLE_TYPE__NAME = STYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSIMPLE_TYPE__DEDUCTION_RULE = STYPE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSIMPLE_TYPE__NATURE = STYPE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSIMPLE_TYPE__SYNTHETIC = STYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSIMPLE_TYPE__CONSTRAINTS = STYPE__CONSTRAINTS;

	/**
	 * The number of structural features of the '<em>SSimple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSIMPLE_TYPE_FEATURE_COUNT = STYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SSimple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSIMPLE_TYPE_OPERATION_COUNT = STYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SPrimitiveImpl <em>SPrimitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SPrimitiveImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSPrimitive()
	 * @generated
	 */
	int SPRIMITIVE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE__NAME = SSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE__DEDUCTION_RULE = SSIMPLE_TYPE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE__NATURE = SSIMPLE_TYPE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE__SYNTHETIC = SSIMPLE_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE__CONSTRAINTS = SSIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE__REDEFINES = SSIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE__ARCHETYPE = SSIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SPrimitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_FEATURE_COUNT = SSIMPLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SPrimitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_OPERATION_COUNT = SSIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SEnumerationImpl <em>SEnumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SEnumerationImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSEnumeration()
	 * @generated
	 */
	int SENUMERATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION__NAME = SSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION__DEDUCTION_RULE = SSIMPLE_TYPE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION__NATURE = SSIMPLE_TYPE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION__SYNTHETIC = SSIMPLE_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION__CONSTRAINTS = SSIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION__LITERALS = SSIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_FEATURE_COUNT = SSIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SEnumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_OPERATION_COUNT = SSIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SLiteralImpl <em>SLiteral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SLiteralImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSLiteral()
	 * @generated
	 */
	int SLITERAL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL__NAME = SNAMED_DEDUCIBLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL__DEDUCTION_RULE = SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL__NATURE = SNAMED_DEDUCIBLE_ELEMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL__SYNTHETIC = SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC;

	/**
	 * The number of structural features of the '<em>SLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_FEATURE_COUNT = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SLiteral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_OPERATION_COUNT = SNAMED_DEDUCIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SComplexTypeImpl <em>SComplex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SComplexTypeImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSComplexType()
	 * @generated
	 */
	int SCOMPLEX_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE__NAME = STYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE__DEDUCTION_RULE = STYPE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE__NATURE = STYPE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE__SYNTHETIC = STYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE__CONSTRAINTS = STYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE__ABSTRACT = STYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE__SUPER_TYPE = STYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE__FEATURES = STYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SComplex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE_FEATURE_COUNT = STYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SComplex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE_OPERATION_COUNT = STYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SDetailTypeImpl <em>SDetail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SDetailTypeImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDetailType()
	 * @generated
	 */
	int SDETAIL_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE__NAME = SCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE__DEDUCTION_RULE = SCOMPLEX_TYPE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE__NATURE = SCOMPLEX_TYPE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE__SYNTHETIC = SCOMPLEX_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE__CONSTRAINTS = SCOMPLEX_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE__ABSTRACT = SCOMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE__SUPER_TYPE = SCOMPLEX_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE__FEATURES = SCOMPLEX_TYPE__FEATURES;

	/**
	 * The number of structural features of the '<em>SDetail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_FEATURE_COUNT = SCOMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SDetail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_OPERATION_COUNT = SCOMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SEntityTypeImpl <em>SEntity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SEntityTypeImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSEntityType()
	 * @generated
	 */
	int SENTITY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__NAME = SCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__DEDUCTION_RULE = SCOMPLEX_TYPE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__NATURE = SCOMPLEX_TYPE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__SYNTHETIC = SCOMPLEX_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__CONSTRAINTS = SCOMPLEX_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__ABSTRACT = SCOMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__SUPER_TYPE = SCOMPLEX_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__FEATURES = SCOMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE__ROOT = SCOMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_FEATURE_COUNT = SCOMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_OPERATION_COUNT = SCOMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SFeatureImpl <em>SFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SFeatureImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSFeature()
	 * @generated
	 */
	int SFEATURE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE__NAME = SNAMED_DEDUCIBLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE__DEDUCTION_RULE = SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE__NATURE = SNAMED_DEDUCIBLE_ELEMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE__SYNTHETIC = SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE__TYPE = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE__MULTIPLICITY = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE_FEATURE_COUNT = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE_OPERATION_COUNT = SNAMED_DEDUCIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SAssociationImpl <em>SAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SAssociationImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAssociation()
	 * @generated
	 */
	int SASSOCIATION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION__NAME = SFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION__DEDUCTION_RULE = SFEATURE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION__NATURE = SFEATURE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION__SYNTHETIC = SFEATURE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION__TYPE = SFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION__MULTIPLICITY = SFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION__KIND = SFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION__DERIVED = SFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_FEATURE_COUNT = SFEATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Target Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION___GET_TARGET_TYPE = SFEATURE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_OPERATION_COUNT = SFEATURE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SMultiplicityImpl <em>SMultiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SMultiplicityImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSMultiplicity()
	 * @generated
	 */
	int SMULTIPLICITY = 21;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMULTIPLICITY__MIN_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMULTIPLICITY__MAX_OCCURS = 1;

	/**
	 * The number of structural features of the '<em>SMultiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMULTIPLICITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SMultiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SAttributeImpl <em>SAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SAttributeImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAttribute()
	 * @generated
	 */
	int SATTRIBUTE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__NAME = SFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__DEDUCTION_RULE = SFEATURE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__NATURE = SFEATURE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__SYNTHETIC = SFEATURE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__TYPE = SFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__MULTIPLICITY = SFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__DETAIL = SFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__KEY = SFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_FEATURE_COUNT = SFEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_OPERATION_COUNT = SFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SQueryImpl <em>SQuery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SQueryImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSQuery()
	 * @generated
	 */
	int SQUERY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY__NAME = SFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY__DEDUCTION_RULE = SFEATURE__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY__NATURE = SFEATURE__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY__SYNTHETIC = SFEATURE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY__TYPE = SFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY__MULTIPLICITY = SFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY__PARAMETERS = SFEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY__RETURNS = SFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_FEATURE_COUNT = SFEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_OPERATION_COUNT = SFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SQueryParameterImpl <em>SQuery Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SQueryParameterImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSQueryParameter()
	 * @generated
	 */
	int SQUERY_PARAMETER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER__NAME = SNAMED_DEDUCIBLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER__DEDUCTION_RULE = SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER__NATURE = SNAMED_DEDUCIBLE_ELEMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER__SYNTHETIC = SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER__TYPE = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER__MULTIPLICITY = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SQuery Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_FEATURE_COUNT = SNAMED_DEDUCIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SQuery Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_OPERATION_COUNT = SNAMED_DEDUCIBLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SDeductionRuleImpl <em>SDeduction Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SDeductionRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDeductionRule()
	 * @generated
	 */
	int SDEDUCTION_RULE = 25;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCTION_RULE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCTION_RULE__NAMED_SOURCE = 1;

	/**
	 * The number of structural features of the '<em>SDeduction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCTION_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SDeduction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDEDUCTION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabRuleImpl <em>SGrab Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SGrabRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabRule()
	 * @generated
	 */
	int SGRAB_RULE = 26;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE__SOURCE = SDEDUCTION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE__NAMED_SOURCE = SDEDUCTION_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE__RENAME_TO = SDEDUCTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SGrab Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE_FEATURE_COUNT = SDEDUCTION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SGrab Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE_OPERATION_COUNT = SDEDUCTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SDitchRuleImpl <em>SDitch Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SDitchRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDitchRule()
	 * @generated
	 */
	int SDITCH_RULE = 27;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDITCH_RULE__SOURCE = SDEDUCTION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDITCH_RULE__NAMED_SOURCE = SDEDUCTION_RULE__NAMED_SOURCE;

	/**
	 * The number of structural features of the '<em>SDitch Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDITCH_RULE_FEATURE_COUNT = SDEDUCTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SDitch Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDITCH_RULE_OPERATION_COUNT = SDEDUCTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl <em>SStructure Changing Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSStructureChangingRule()
	 * @generated
	 */
	int SSTRUCTURE_CHANGING_RULE = 28;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__SOURCE = SGRAB_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__NAMED_SOURCE = SGRAB_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__RENAME_TO = SGRAB_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__ABSTRACT = SGRAB_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY = SGRAB_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__EXTEND_FROM = SGRAB_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SStructure Changing Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE_FEATURE_COUNT = SGRAB_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SStructure Changing Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE_OPERATION_COUNT = SGRAB_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SMorphRuleImpl <em>SMorph Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SMorphRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSMorphRule()
	 * @generated
	 */
	int SMORPH_RULE = 29;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__SOURCE = SSTRUCTURE_CHANGING_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__NAMED_SOURCE = SSTRUCTURE_CHANGING_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__RENAME_TO = SSTRUCTURE_CHANGING_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__ABSTRACT = SSTRUCTURE_CHANGING_RULE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__ROOT_ENTITY = SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY;

	/**
	 * The feature id for the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__EXTEND_FROM = SSTRUCTURE_CHANGING_RULE__EXTEND_FROM;

	/**
	 * The feature id for the '<em><b>Retype To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__RETYPE_TO = SSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remultiply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__REMULTIPLY_TO = SSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SMorph Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE_FEATURE_COUNT = SSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SMorph Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE_OPERATION_COUNT = SSTRUCTURE_CHANGING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SFuseRuleImpl <em>SFuse Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SFuseRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSFuseRule()
	 * @generated
	 */
	int SFUSE_RULE = 30;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE__SOURCE = SSTRUCTURE_CHANGING_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE__NAMED_SOURCE = SSTRUCTURE_CHANGING_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE__RENAME_TO = SSTRUCTURE_CHANGING_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE__ABSTRACT = SSTRUCTURE_CHANGING_RULE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE__ROOT_ENTITY = SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY;

	/**
	 * The feature id for the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE__EXTEND_FROM = SSTRUCTURE_CHANGING_RULE__EXTEND_FROM;

	/**
	 * The feature id for the '<em><b>Other Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE__OTHER_SOURCES = SSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SFuse Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE_FEATURE_COUNT = SSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SFuse Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE_OPERATION_COUNT = SSTRUCTURE_CHANGING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabAggregateRuleImpl <em>SGrab Aggregate Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SGrabAggregateRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabAggregateRule()
	 * @generated
	 */
	int SGRAB_AGGREGATE_RULE = 31;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE__SOURCE = SDEDUCTION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE__NAMED_SOURCE = SDEDUCTION_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE__AGGREGATE = SDEDUCTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SGrab Aggregate Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE_FEATURE_COUNT = SDEDUCTION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SGrab Aggregate Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE_OPERATION_COUNT = SDEDUCTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabDomainRuleImpl <em>SGrab Domain Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SGrabDomainRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabDomainRule()
	 * @generated
	 */
	int SGRAB_DOMAIN_RULE = 32;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_DOMAIN_RULE__SOURCE = SDEDUCTION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_DOMAIN_RULE__NAMED_SOURCE = SDEDUCTION_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_DOMAIN_RULE__DOMAIN = SDEDUCTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SGrab Domain Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_DOMAIN_RULE_FEATURE_COUNT = SDEDUCTION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SGrab Domain Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_DOMAIN_RULE_OPERATION_COUNT = SDEDUCTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SSyntheticDeductionRuleImpl <em>SSynthetic Deduction Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SSyntheticDeductionRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSSyntheticDeductionRule()
	 * @generated
	 */
	int SSYNTHETIC_DEDUCTION_RULE = 33;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSYNTHETIC_DEDUCTION_RULE__SOURCE = SDEDUCTION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSYNTHETIC_DEDUCTION_RULE__NAMED_SOURCE = SDEDUCTION_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Element With Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE = SDEDUCTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SSynthetic Deduction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSYNTHETIC_DEDUCTION_RULE_FEATURE_COUNT = SDEDUCTION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SSynthetic Deduction Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSYNTHETIC_DEDUCTION_RULE_OPERATION_COUNT = SDEDUCTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SInformationModelKind <em>SInformation Model Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SInformationModelKind
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSInformationModelKind()
	 * @generated
	 */
	int SINFORMATION_MODEL_KIND = 34;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SElementNature <em>SElement Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SElementNature
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSElementNature()
	 * @generated
	 */
	int SELEMENT_NATURE = 35;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SAssociationKind <em>SAssociation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SAssociationKind
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAssociationKind()
	 * @generated
	 */
	int SASSOCIATION_KIND = 36;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.STristate <em>STristate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.STristate
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSTristate()
	 * @generated
	 */
	int STRISTATE = 37;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SIdentityType <em>SIdentity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIdentity Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SIdentityType
	 * @generated
	 */
	EClass getSIdentityType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SValueType <em>SValue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SValue Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SValueType
	 * @generated
	 */
	EClass getSValueType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SInformationModel <em>SInformation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SInformation Model</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel
	 * @generated
	 */
	EClass getSInformationModel();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SInformationModel#isGenerate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel#isGenerate()
	 * @see #getSInformationModel()
	 * @generated
	 */
	EAttribute getSInformationModel_Generate();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SInformationModel#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel#getKind()
	 * @see #getSInformationModel()
	 * @generated
	 */
	EAttribute getSInformationModel_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SInformationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel#getName()
	 * @see #getSInformationModel()
	 * @generated
	 */
	EAttribute getSInformationModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SInformationModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel#getImports()
	 * @see #getSInformationModel()
	 * @generated
	 */
	EReference getSInformationModel_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SInformationModel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel#getTypes()
	 * @see #getSInformationModel()
	 * @generated
	 */
	EReference getSInformationModel_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SInformationModel#getAggregates <em>Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregates</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel#getAggregates()
	 * @see #getSInformationModel()
	 * @generated
	 */
	EReference getSInformationModel_Aggregates();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SInformationModel#getDomainProxies <em>Domain Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Proxies</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel#getDomainProxies()
	 * @see #getSInformationModel()
	 * @generated
	 */
	EReference getSInformationModel_DomainProxies();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SNamedElement <em>SNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SNamed Element</em>'.
	 * @see com.mimacom.ddd.sm.sim.SNamedElement
	 * @generated
	 */
	EClass getSNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.sm.sim.SNamedElement#getName()
	 * @see #getSNamedElement()
	 * @generated
	 */
	EAttribute getSNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SDeducibleElement <em>SDeducible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDeducible Element</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDeducibleElement
	 * @generated
	 */
	EClass getSDeducibleElement();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.sm.sim.SDeducibleElement#getDeductionRule <em>Deduction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deduction Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDeducibleElement#getDeductionRule()
	 * @see #getSDeducibleElement()
	 * @generated
	 */
	EReference getSDeducibleElement_DeductionRule();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SDeducibleElement#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDeducibleElement#getNature()
	 * @see #getSDeducibleElement()
	 * @generated
	 */
	EAttribute getSDeducibleElement_Nature();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SDeducibleElement#isSynthetic <em>Synthetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthetic</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDeducibleElement#isSynthetic()
	 * @see #getSDeducibleElement()
	 * @generated
	 */
	EAttribute getSDeducibleElement_Synthetic();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SNamedDeducibleElement <em>SNamed Deducible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SNamed Deducible Element</em>'.
	 * @see com.mimacom.ddd.sm.sim.SNamedDeducibleElement
	 * @generated
	 */
	EClass getSNamedDeducibleElement();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SExpression <em>SExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SExpression</em>'.
	 * @see com.mimacom.ddd.sm.sim.SExpression
	 * @generated
	 */
	EClass getSExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see com.mimacom.ddd.sm.sim.SExpression#getExpr()
	 * @see #getSExpression()
	 * @generated
	 */
	EAttribute getSExpression_Expr();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SImport <em>SImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SImport</em>'.
	 * @see com.mimacom.ddd.sm.sim.SImport
	 * @generated
	 */
	EClass getSImport();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see com.mimacom.ddd.sm.sim.SImport#getImportedNamespace()
	 * @see #getSImport()
	 * @generated
	 */
	EAttribute getSImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SDomainProxy <em>SDomain Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDomain Proxy</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDomainProxy
	 * @generated
	 */
	EClass getSDomainProxy();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SAggregate <em>SAggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAggregate</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAggregate
	 * @generated
	 */
	EClass getSAggregate();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SAggregate#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAggregate#getTypes()
	 * @see #getSAggregate()
	 * @generated
	 */
	EReference getSAggregate_Types();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.sm.sim.SAggregate#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roots</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAggregate#getRoots()
	 * @see #getSAggregate()
	 * @generated
	 */
	EReference getSAggregate_Roots();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SAggregate#getDerivedName <em>Derived Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Name</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAggregate#getDerivedName()
	 * @see #getSAggregate()
	 * @generated
	 */
	EAttribute getSAggregate_DerivedName();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SType <em>SType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SType</em>'.
	 * @see com.mimacom.ddd.sm.sim.SType
	 * @generated
	 */
	EClass getSType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see com.mimacom.ddd.sm.sim.SType#getConstraints()
	 * @see #getSType()
	 * @generated
	 */
	EReference getSType_Constraints();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SCondition <em>SCondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCondition</em>'.
	 * @see com.mimacom.ddd.sm.sim.SCondition
	 * @generated
	 */
	EClass getSCondition();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.sm.sim.SCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.mimacom.ddd.sm.sim.SCondition#getCondition()
	 * @see #getSCondition()
	 * @generated
	 */
	EReference getSCondition_Condition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SSimpleType <em>SSimple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSimple Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SSimpleType
	 * @generated
	 */
	EClass getSSimpleType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SPrimitive <em>SPrimitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPrimitive</em>'.
	 * @see com.mimacom.ddd.sm.sim.SPrimitive
	 * @generated
	 */
	EClass getSPrimitive();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SPrimitive#getRedefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefines</em>'.
	 * @see com.mimacom.ddd.sm.sim.SPrimitive#getRedefines()
	 * @see #getSPrimitive()
	 * @generated
	 */
	EReference getSPrimitive_Redefines();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SPrimitive#isArchetype <em>Archetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archetype</em>'.
	 * @see com.mimacom.ddd.sm.sim.SPrimitive#isArchetype()
	 * @see #getSPrimitive()
	 * @generated
	 */
	EAttribute getSPrimitive_Archetype();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SEnumeration <em>SEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEnumeration</em>'.
	 * @see com.mimacom.ddd.sm.sim.SEnumeration
	 * @generated
	 */
	EClass getSEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see com.mimacom.ddd.sm.sim.SEnumeration#getLiterals()
	 * @see #getSEnumeration()
	 * @generated
	 */
	EReference getSEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SLiteral <em>SLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLiteral</em>'.
	 * @see com.mimacom.ddd.sm.sim.SLiteral
	 * @generated
	 */
	EClass getSLiteral();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SComplexType <em>SComplex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SComplex Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SComplexType
	 * @generated
	 */
	EClass getSComplexType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SComplexType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.mimacom.ddd.sm.sim.SComplexType#isAbstract()
	 * @see #getSComplexType()
	 * @generated
	 */
	EAttribute getSComplexType_Abstract();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SComplexType#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SComplexType#getSuperType()
	 * @see #getSComplexType()
	 * @generated
	 */
	EReference getSComplexType_SuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SComplexType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.mimacom.ddd.sm.sim.SComplexType#getFeatures()
	 * @see #getSComplexType()
	 * @generated
	 */
	EReference getSComplexType_Features();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SDetailType <em>SDetail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDetail Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDetailType
	 * @generated
	 */
	EClass getSDetailType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SEntityType <em>SEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEntity Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SEntityType
	 * @generated
	 */
	EClass getSEntityType();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SEntityType#isRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see com.mimacom.ddd.sm.sim.SEntityType#isRoot()
	 * @see #getSEntityType()
	 * @generated
	 */
	EAttribute getSEntityType_Root();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SFeature <em>SFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFeature</em>'.
	 * @see com.mimacom.ddd.sm.sim.SFeature
	 * @generated
	 */
	EClass getSFeature();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SFeature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SFeature#getType()
	 * @see #getSFeature()
	 * @generated
	 */
	EReference getSFeature_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.sm.sim.SFeature#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see com.mimacom.ddd.sm.sim.SFeature#getMultiplicity()
	 * @see #getSFeature()
	 * @generated
	 */
	EReference getSFeature_Multiplicity();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SAssociation <em>SAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAssociation</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAssociation
	 * @generated
	 */
	EClass getSAssociation();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SAssociation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAssociation#getKind()
	 * @see #getSAssociation()
	 * @generated
	 */
	EAttribute getSAssociation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SAssociation#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAssociation#isDerived()
	 * @see #getSAssociation()
	 * @generated
	 */
	EAttribute getSAssociation_Derived();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.sm.sim.SAssociation#getTargetType() <em>Get Target Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Type</em>' operation.
	 * @see com.mimacom.ddd.sm.sim.SAssociation#getTargetType()
	 * @generated
	 */
	EOperation getSAssociation__GetTargetType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SMultiplicity <em>SMultiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMultiplicity</em>'.
	 * @see com.mimacom.ddd.sm.sim.SMultiplicity
	 * @generated
	 */
	EClass getSMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SMultiplicity#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see com.mimacom.ddd.sm.sim.SMultiplicity#getMinOccurs()
	 * @see #getSMultiplicity()
	 * @generated
	 */
	EAttribute getSMultiplicity_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SMultiplicity#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see com.mimacom.ddd.sm.sim.SMultiplicity#getMaxOccurs()
	 * @see #getSMultiplicity()
	 * @generated
	 */
	EAttribute getSMultiplicity_MaxOccurs();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SAttribute <em>SAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAttribute</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAttribute
	 * @generated
	 */
	EClass getSAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SAttribute#isDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAttribute#isDetail()
	 * @see #getSAttribute()
	 * @generated
	 */
	EAttribute getSAttribute_Detail();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SAttribute#isKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAttribute#isKey()
	 * @see #getSAttribute()
	 * @generated
	 */
	EAttribute getSAttribute_Key();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SQuery <em>SQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQuery</em>'.
	 * @see com.mimacom.ddd.sm.sim.SQuery
	 * @generated
	 */
	EClass getSQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sim.SQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.mimacom.ddd.sm.sim.SQuery#getParameters()
	 * @see #getSQuery()
	 * @generated
	 */
	EReference getSQuery_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.sm.sim.SQuery#getReturns <em>Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returns</em>'.
	 * @see com.mimacom.ddd.sm.sim.SQuery#getReturns()
	 * @see #getSQuery()
	 * @generated
	 */
	EReference getSQuery_Returns();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SQueryParameter <em>SQuery Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQuery Parameter</em>'.
	 * @see com.mimacom.ddd.sm.sim.SQueryParameter
	 * @generated
	 */
	EClass getSQueryParameter();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SQueryParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.sm.sim.SQueryParameter#getType()
	 * @see #getSQueryParameter()
	 * @generated
	 */
	EReference getSQueryParameter_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.sm.sim.SQueryParameter#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see com.mimacom.ddd.sm.sim.SQueryParameter#getMultiplicity()
	 * @see #getSQueryParameter()
	 * @generated
	 */
	EReference getSQueryParameter_Multiplicity();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SDeductionRule <em>SDeduction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDeduction Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDeductionRule
	 * @generated
	 */
	EClass getSDeductionRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SDeductionRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDeductionRule#getSource()
	 * @see #getSDeductionRule()
	 * @generated
	 */
	EReference getSDeductionRule_Source();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SDeductionRule#getNamedSource <em>Named Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Named Source</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDeductionRule#getNamedSource()
	 * @see #getSDeductionRule()
	 * @generated
	 */
	EReference getSDeductionRule_NamedSource();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SGrabRule <em>SGrab Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGrab Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SGrabRule
	 * @generated
	 */
	EClass getSGrabRule();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SGrabRule#getRenameTo <em>Rename To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename To</em>'.
	 * @see com.mimacom.ddd.sm.sim.SGrabRule#getRenameTo()
	 * @see #getSGrabRule()
	 * @generated
	 */
	EAttribute getSGrabRule_RenameTo();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SDitchRule <em>SDitch Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDitch Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDitchRule
	 * @generated
	 */
	EClass getSDitchRule();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule <em>SStructure Changing Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SStructure Changing Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SStructureChangingRule
	 * @generated
	 */
	EClass getSStructureChangingRule();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.mimacom.ddd.sm.sim.SStructureChangingRule#getAbstract()
	 * @see #getSStructureChangingRule()
	 * @generated
	 */
	EAttribute getSStructureChangingRule_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getRootEntity <em>Root Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Entity</em>'.
	 * @see com.mimacom.ddd.sm.sim.SStructureChangingRule#getRootEntity()
	 * @see #getSStructureChangingRule()
	 * @generated
	 */
	EAttribute getSStructureChangingRule_RootEntity();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getExtendFrom <em>Extend From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extend From</em>'.
	 * @see com.mimacom.ddd.sm.sim.SStructureChangingRule#getExtendFrom()
	 * @see #getSStructureChangingRule()
	 * @generated
	 */
	EReference getSStructureChangingRule_ExtendFrom();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SMorphRule <em>SMorph Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMorph Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SMorphRule
	 * @generated
	 */
	EClass getSMorphRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SMorphRule#getRetypeTo <em>Retype To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Retype To</em>'.
	 * @see com.mimacom.ddd.sm.sim.SMorphRule#getRetypeTo()
	 * @see #getSMorphRule()
	 * @generated
	 */
	EReference getSMorphRule_RetypeTo();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.sm.sim.SMorphRule#getRemultiplyTo <em>Remultiply To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remultiply To</em>'.
	 * @see com.mimacom.ddd.sm.sim.SMorphRule#getRemultiplyTo()
	 * @see #getSMorphRule()
	 * @generated
	 */
	EReference getSMorphRule_RemultiplyTo();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SFuseRule <em>SFuse Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFuse Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SFuseRule
	 * @generated
	 */
	EClass getSFuseRule();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.sm.sim.SFuseRule#getOtherSources <em>Other Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Other Sources</em>'.
	 * @see com.mimacom.ddd.sm.sim.SFuseRule#getOtherSources()
	 * @see #getSFuseRule()
	 * @generated
	 */
	EReference getSFuseRule_OtherSources();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SGrabAggregateRule <em>SGrab Aggregate Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGrab Aggregate Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SGrabAggregateRule
	 * @generated
	 */
	EClass getSGrabAggregateRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SGrabAggregateRule#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate</em>'.
	 * @see com.mimacom.ddd.sm.sim.SGrabAggregateRule#getAggregate()
	 * @see #getSGrabAggregateRule()
	 * @generated
	 */
	EReference getSGrabAggregateRule_Aggregate();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SGrabDomainRule <em>SGrab Domain Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGrab Domain Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SGrabDomainRule
	 * @generated
	 */
	EClass getSGrabDomainRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SGrabDomainRule#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see com.mimacom.ddd.sm.sim.SGrabDomainRule#getDomain()
	 * @see #getSGrabDomainRule()
	 * @generated
	 */
	EReference getSGrabDomainRule_Domain();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SSyntheticDeductionRule <em>SSynthetic Deduction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSynthetic Deduction Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SSyntheticDeductionRule
	 * @generated
	 */
	EClass getSSyntheticDeductionRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SSyntheticDeductionRule#getElementWithRule <em>Element With Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element With Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SSyntheticDeductionRule#getElementWithRule()
	 * @see #getSSyntheticDeductionRule()
	 * @generated
	 */
	EReference getSSyntheticDeductionRule_ElementWithRule();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.sm.sim.SInformationModelKind <em>SInformation Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SInformation Model Kind</em>'.
	 * @see com.mimacom.ddd.sm.sim.SInformationModelKind
	 * @generated
	 */
	EEnum getSInformationModelKind();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.sm.sim.SElementNature <em>SElement Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SElement Nature</em>'.
	 * @see com.mimacom.ddd.sm.sim.SElementNature
	 * @generated
	 */
	EEnum getSElementNature();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.sm.sim.SAssociationKind <em>SAssociation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SAssociation Kind</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAssociationKind
	 * @generated
	 */
	EEnum getSAssociationKind();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.sm.sim.STristate <em>STristate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STristate</em>'.
	 * @see com.mimacom.ddd.sm.sim.STristate
	 * @generated
	 */
	EEnum getSTristate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimFactory getSimFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SIdentityType <em>SIdentity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SIdentityType
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSIdentityType()
		 * @generated
		 */
		EClass SIDENTITY_TYPE = eINSTANCE.getSIdentityType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SValueType <em>SValue Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SValueType
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSValueType()
		 * @generated
		 */
		EClass SVALUE_TYPE = eINSTANCE.getSValueType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl <em>SInformation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SInformationModelImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSInformationModel()
		 * @generated
		 */
		EClass SINFORMATION_MODEL = eINSTANCE.getSInformationModel();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINFORMATION_MODEL__GENERATE = eINSTANCE.getSInformationModel_Generate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINFORMATION_MODEL__KIND = eINSTANCE.getSInformationModel_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINFORMATION_MODEL__NAME = eINSTANCE.getSInformationModel_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINFORMATION_MODEL__IMPORTS = eINSTANCE.getSInformationModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINFORMATION_MODEL__TYPES = eINSTANCE.getSInformationModel_Types();

		/**
		 * The meta object literal for the '<em><b>Aggregates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINFORMATION_MODEL__AGGREGATES = eINSTANCE.getSInformationModel_Aggregates();

		/**
		 * The meta object literal for the '<em><b>Domain Proxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINFORMATION_MODEL__DOMAIN_PROXIES = eINSTANCE.getSInformationModel_DomainProxies();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SNamedElementImpl <em>SNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SNamedElementImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSNamedElement()
		 * @generated
		 */
		EClass SNAMED_ELEMENT = eINSTANCE.getSNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNAMED_ELEMENT__NAME = eINSTANCE.getSNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SDeducibleElement <em>SDeducible Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SDeducibleElement
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDeducibleElement()
		 * @generated
		 */
		EClass SDEDUCIBLE_ELEMENT = eINSTANCE.getSDeducibleElement();

		/**
		 * The meta object literal for the '<em><b>Deduction Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDEDUCIBLE_ELEMENT__DEDUCTION_RULE = eINSTANCE.getSDeducibleElement_DeductionRule();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDEDUCIBLE_ELEMENT__NATURE = eINSTANCE.getSDeducibleElement_Nature();

		/**
		 * The meta object literal for the '<em><b>Synthetic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SDEDUCIBLE_ELEMENT__SYNTHETIC = eINSTANCE.getSDeducibleElement_Synthetic();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SNamedDeducibleElementImpl <em>SNamed Deducible Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SNamedDeducibleElementImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSNamedDeducibleElement()
		 * @generated
		 */
		EClass SNAMED_DEDUCIBLE_ELEMENT = eINSTANCE.getSNamedDeducibleElement();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SExpressionImpl <em>SExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SExpressionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSExpression()
		 * @generated
		 */
		EClass SEXPRESSION = eINSTANCE.getSExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEXPRESSION__EXPR = eINSTANCE.getSExpression_Expr();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SImportImpl <em>SImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SImportImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSImport()
		 * @generated
		 */
		EClass SIMPORT = eINSTANCE.getSImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPORT__IMPORTED_NAMESPACE = eINSTANCE.getSImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SDomainProxyImpl <em>SDomain Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SDomainProxyImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDomainProxy()
		 * @generated
		 */
		EClass SDOMAIN_PROXY = eINSTANCE.getSDomainProxy();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SAggregateImpl <em>SAggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SAggregateImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAggregate()
		 * @generated
		 */
		EClass SAGGREGATE = eINSTANCE.getSAggregate();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGGREGATE__TYPES = eINSTANCE.getSAggregate_Types();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGGREGATE__ROOTS = eINSTANCE.getSAggregate_Roots();

		/**
		 * The meta object literal for the '<em><b>Derived Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAGGREGATE__DERIVED_NAME = eINSTANCE.getSAggregate_DerivedName();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.STypeImpl <em>SType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.STypeImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSType()
		 * @generated
		 */
		EClass STYPE = eINSTANCE.getSType();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYPE__CONSTRAINTS = eINSTANCE.getSType_Constraints();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SConditionImpl <em>SCondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SConditionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSCondition()
		 * @generated
		 */
		EClass SCONDITION = eINSTANCE.getSCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONDITION__CONDITION = eINSTANCE.getSCondition_Condition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SSimpleTypeImpl <em>SSimple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SSimpleTypeImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSSimpleType()
		 * @generated
		 */
		EClass SSIMPLE_TYPE = eINSTANCE.getSSimpleType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SPrimitiveImpl <em>SPrimitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SPrimitiveImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSPrimitive()
		 * @generated
		 */
		EClass SPRIMITIVE = eINSTANCE.getSPrimitive();

		/**
		 * The meta object literal for the '<em><b>Redefines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRIMITIVE__REDEFINES = eINSTANCE.getSPrimitive_Redefines();

		/**
		 * The meta object literal for the '<em><b>Archetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRIMITIVE__ARCHETYPE = eINSTANCE.getSPrimitive_Archetype();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SEnumerationImpl <em>SEnumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SEnumerationImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSEnumeration()
		 * @generated
		 */
		EClass SENUMERATION = eINSTANCE.getSEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENUMERATION__LITERALS = eINSTANCE.getSEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SLiteralImpl <em>SLiteral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SLiteralImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSLiteral()
		 * @generated
		 */
		EClass SLITERAL = eINSTANCE.getSLiteral();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SComplexTypeImpl <em>SComplex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SComplexTypeImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSComplexType()
		 * @generated
		 */
		EClass SCOMPLEX_TYPE = eINSTANCE.getSComplexType();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOMPLEX_TYPE__ABSTRACT = eINSTANCE.getSComplexType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOMPLEX_TYPE__SUPER_TYPE = eINSTANCE.getSComplexType_SuperType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOMPLEX_TYPE__FEATURES = eINSTANCE.getSComplexType_Features();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SDetailTypeImpl <em>SDetail Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SDetailTypeImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDetailType()
		 * @generated
		 */
		EClass SDETAIL_TYPE = eINSTANCE.getSDetailType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SEntityTypeImpl <em>SEntity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SEntityTypeImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSEntityType()
		 * @generated
		 */
		EClass SENTITY_TYPE = eINSTANCE.getSEntityType();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTITY_TYPE__ROOT = eINSTANCE.getSEntityType_Root();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SFeatureImpl <em>SFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SFeatureImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSFeature()
		 * @generated
		 */
		EClass SFEATURE = eINSTANCE.getSFeature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFEATURE__TYPE = eINSTANCE.getSFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFEATURE__MULTIPLICITY = eINSTANCE.getSFeature_Multiplicity();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SAssociationImpl <em>SAssociation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SAssociationImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAssociation()
		 * @generated
		 */
		EClass SASSOCIATION = eINSTANCE.getSAssociation();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SASSOCIATION__KIND = eINSTANCE.getSAssociation_Kind();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SASSOCIATION__DERIVED = eINSTANCE.getSAssociation_Derived();

		/**
		 * The meta object literal for the '<em><b>Get Target Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SASSOCIATION___GET_TARGET_TYPE = eINSTANCE.getSAssociation__GetTargetType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SMultiplicityImpl <em>SMultiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SMultiplicityImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSMultiplicity()
		 * @generated
		 */
		EClass SMULTIPLICITY = eINSTANCE.getSMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMULTIPLICITY__MIN_OCCURS = eINSTANCE.getSMultiplicity_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMULTIPLICITY__MAX_OCCURS = eINSTANCE.getSMultiplicity_MaxOccurs();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SAttributeImpl <em>SAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SAttributeImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAttribute()
		 * @generated
		 */
		EClass SATTRIBUTE = eINSTANCE.getSAttribute();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATTRIBUTE__DETAIL = eINSTANCE.getSAttribute_Detail();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATTRIBUTE__KEY = eINSTANCE.getSAttribute_Key();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SQueryImpl <em>SQuery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SQueryImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSQuery()
		 * @generated
		 */
		EClass SQUERY = eINSTANCE.getSQuery();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUERY__PARAMETERS = eINSTANCE.getSQuery_Parameters();

		/**
		 * The meta object literal for the '<em><b>Returns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUERY__RETURNS = eINSTANCE.getSQuery_Returns();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SQueryParameterImpl <em>SQuery Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SQueryParameterImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSQueryParameter()
		 * @generated
		 */
		EClass SQUERY_PARAMETER = eINSTANCE.getSQueryParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUERY_PARAMETER__TYPE = eINSTANCE.getSQueryParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUERY_PARAMETER__MULTIPLICITY = eINSTANCE.getSQueryParameter_Multiplicity();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SDeductionRuleImpl <em>SDeduction Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SDeductionRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDeductionRule()
		 * @generated
		 */
		EClass SDEDUCTION_RULE = eINSTANCE.getSDeductionRule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDEDUCTION_RULE__SOURCE = eINSTANCE.getSDeductionRule_Source();

		/**
		 * The meta object literal for the '<em><b>Named Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDEDUCTION_RULE__NAMED_SOURCE = eINSTANCE.getSDeductionRule_NamedSource();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabRuleImpl <em>SGrab Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SGrabRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabRule()
		 * @generated
		 */
		EClass SGRAB_RULE = eINSTANCE.getSGrabRule();

		/**
		 * The meta object literal for the '<em><b>Rename To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SGRAB_RULE__RENAME_TO = eINSTANCE.getSGrabRule_RenameTo();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SDitchRuleImpl <em>SDitch Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SDitchRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDitchRule()
		 * @generated
		 */
		EClass SDITCH_RULE = eINSTANCE.getSDitchRule();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl <em>SStructure Changing Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSStructureChangingRule()
		 * @generated
		 */
		EClass SSTRUCTURE_CHANGING_RULE = eINSTANCE.getSStructureChangingRule();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURE_CHANGING_RULE__ABSTRACT = eINSTANCE.getSStructureChangingRule_Abstract();

		/**
		 * The meta object literal for the '<em><b>Root Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY = eINSTANCE.getSStructureChangingRule_RootEntity();

		/**
		 * The meta object literal for the '<em><b>Extend From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSTRUCTURE_CHANGING_RULE__EXTEND_FROM = eINSTANCE.getSStructureChangingRule_ExtendFrom();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SMorphRuleImpl <em>SMorph Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SMorphRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSMorphRule()
		 * @generated
		 */
		EClass SMORPH_RULE = eINSTANCE.getSMorphRule();

		/**
		 * The meta object literal for the '<em><b>Retype To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMORPH_RULE__RETYPE_TO = eINSTANCE.getSMorphRule_RetypeTo();

		/**
		 * The meta object literal for the '<em><b>Remultiply To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMORPH_RULE__REMULTIPLY_TO = eINSTANCE.getSMorphRule_RemultiplyTo();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SFuseRuleImpl <em>SFuse Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SFuseRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSFuseRule()
		 * @generated
		 */
		EClass SFUSE_RULE = eINSTANCE.getSFuseRule();

		/**
		 * The meta object literal for the '<em><b>Other Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFUSE_RULE__OTHER_SOURCES = eINSTANCE.getSFuseRule_OtherSources();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabAggregateRuleImpl <em>SGrab Aggregate Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SGrabAggregateRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabAggregateRule()
		 * @generated
		 */
		EClass SGRAB_AGGREGATE_RULE = eINSTANCE.getSGrabAggregateRule();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SGRAB_AGGREGATE_RULE__AGGREGATE = eINSTANCE.getSGrabAggregateRule_Aggregate();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabDomainRuleImpl <em>SGrab Domain Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SGrabDomainRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabDomainRule()
		 * @generated
		 */
		EClass SGRAB_DOMAIN_RULE = eINSTANCE.getSGrabDomainRule();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SGRAB_DOMAIN_RULE__DOMAIN = eINSTANCE.getSGrabDomainRule_Domain();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SSyntheticDeductionRuleImpl <em>SSynthetic Deduction Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SSyntheticDeductionRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSSyntheticDeductionRule()
		 * @generated
		 */
		EClass SSYNTHETIC_DEDUCTION_RULE = eINSTANCE.getSSyntheticDeductionRule();

		/**
		 * The meta object literal for the '<em><b>Element With Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE = eINSTANCE.getSSyntheticDeductionRule_ElementWithRule();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SInformationModelKind <em>SInformation Model Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SInformationModelKind
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSInformationModelKind()
		 * @generated
		 */
		EEnum SINFORMATION_MODEL_KIND = eINSTANCE.getSInformationModelKind();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SElementNature <em>SElement Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SElementNature
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSElementNature()
		 * @generated
		 */
		EEnum SELEMENT_NATURE = eINSTANCE.getSElementNature();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SAssociationKind <em>SAssociation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SAssociationKind
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAssociationKind()
		 * @generated
		 */
		EEnum SASSOCIATION_KIND = eINSTANCE.getSAssociationKind();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.STristate <em>STristate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.STristate
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSTristate()
		 * @generated
		 */
		EEnum STRISTATE = eINSTANCE.getSTristate();

	}

} //SimPackage
