/**
 */
package com.mimacom.ddd.sm.sim;

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
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl <em>SInformation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SInformationModelImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSInformationModel()
	 * @generated
	 */
	int SINFORMATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__NAME = BasePackage.DMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__ALIASES = BasePackage.DMODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__DESCRIPTION = BasePackage.DMODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__AGGREGATES = BasePackage.DMODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__TYPES = BasePackage.DMODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__GENERATE = BasePackage.DMODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__KIND = BasePackage.DMODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL__DOMAIN_PROXIES = BasePackage.DMODEL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SInformation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL_FEATURE_COUNT = BasePackage.DMODEL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>SInformation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINFORMATION_MODEL_OPERATION_COUNT = BasePackage.DMODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SImplicitElementDeductionImpl <em>SImplicit Element Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SImplicitElementDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSImplicitElementDeduction()
	 * @generated
	 */
	int SIMPLICIT_ELEMENT_DEDUCTION = 1;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE = BasePackage.IDEDUCTION_DEFINITION__DEDUCTION_RULE;

	/**
	 * The feature id for the '<em><b>Original Deduction Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION = BasePackage.IDEDUCTION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SImplicit Element Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLICIT_ELEMENT_DEDUCTION_FEATURE_COUNT = BasePackage.IDEDUCTION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SImplicit Element Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLICIT_ELEMENT_DEDUCTION_OPERATION_COUNT = BasePackage.IDEDUCTION_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SDomainDeductionImpl <em>SDomain Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SDomainDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDomainDeduction()
	 * @generated
	 */
	int SDOMAIN_DEDUCTION = 2;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOMAIN_DEDUCTION__DEDUCTION_RULE = BasePackage.IDEDUCTION_DEFINITION__DEDUCTION_RULE;

	/**
	 * The number of structural features of the '<em>SDomain Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOMAIN_DEDUCTION_FEATURE_COUNT = BasePackage.IDEDUCTION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SDomain Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDOMAIN_DEDUCTION_OPERATION_COUNT = BasePackage.IDEDUCTION_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SAggregateDeductionImpl <em>SAggregate Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SAggregateDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAggregateDeduction()
	 * @generated
	 */
	int SAGGREGATE_DEDUCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__NAME = BasePackage.DAGGREGATE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__ALIASES = BasePackage.DAGGREGATE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__DESCRIPTION = BasePackage.DAGGREGATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__TYPES = BasePackage.DAGGREGATE__TYPES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__FEATURES = BasePackage.DAGGREGATE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__NAVIGABLE_MEMBERS = BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__DEDUCED_FROM = BasePackage.DAGGREGATE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__SYNTHETIC = BasePackage.DAGGREGATE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__ROOTS = BasePackage.DAGGREGATE__ROOTS;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION__DEDUCTION_RULE = BasePackage.DAGGREGATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SAggregate Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION_FEATURE_COUNT = BasePackage.DAGGREGATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SAggregate Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGGREGATE_DEDUCTION_OPERATION_COUNT = BasePackage.DAGGREGATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.STypeDeduction <em>SType Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.STypeDeduction
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSTypeDeduction()
	 * @generated
	 */
	int STYPE_DEDUCTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE_DEDUCTION__NAME = BasePackage.DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE_DEDUCTION__ALIASES = BasePackage.DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE_DEDUCTION__DESCRIPTION = BasePackage.DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE_DEDUCTION__DEDUCTION_RULE = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SType Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE_DEDUCTION_FEATURE_COUNT = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SType Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYPE_DEDUCTION_OPERATION_COUNT = BasePackage.DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SPrimitiveDeductionImpl <em>SPrimitive Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SPrimitiveDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSPrimitiveDeduction()
	 * @generated
	 */
	int SPRIMITIVE_DEDUCTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__NAME = BasePackage.DPRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__ALIASES = BasePackage.DPRIMITIVE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__DESCRIPTION = BasePackage.DPRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__DEDUCED_FROM = BasePackage.DPRIMITIVE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__SYNTHETIC = BasePackage.DPRIMITIVE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__CONSTRAINTS = BasePackage.DPRIMITIVE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__PRIMITIVE = BasePackage.DPRIMITIVE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__REDEFINES = BasePackage.DPRIMITIVE__REDEFINES;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION__DEDUCTION_RULE = BasePackage.DPRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SPrimitive Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION_FEATURE_COUNT = BasePackage.DPRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SPrimitive Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRIMITIVE_DEDUCTION_OPERATION_COUNT = BasePackage.DPRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SEnumerationDeductionImpl <em>SEnumeration Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SEnumerationDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSEnumerationDeduction()
	 * @generated
	 */
	int SENUMERATION_DEDUCTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__NAME = BasePackage.DENUMERATION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__ALIASES = BasePackage.DENUMERATION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__DESCRIPTION = BasePackage.DENUMERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__DEDUCED_FROM = BasePackage.DENUMERATION__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__SYNTHETIC = BasePackage.DENUMERATION__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__CONSTRAINTS = BasePackage.DENUMERATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__PRIMITIVE = BasePackage.DENUMERATION__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__NAVIGABLE_MEMBERS = BasePackage.DENUMERATION__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__LITERALS = BasePackage.DENUMERATION__LITERALS;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION__DEDUCTION_RULE = BasePackage.DENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SEnumeration Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION_FEATURE_COUNT = BasePackage.DENUMERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SEnumeration Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENUMERATION_DEDUCTION_OPERATION_COUNT = BasePackage.DENUMERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SLiteralDeductionImpl <em>SLiteral Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SLiteralDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSLiteralDeduction()
	 * @generated
	 */
	int SLITERAL_DEDUCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__NAME = BasePackage.DLITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__ALIASES = BasePackage.DLITERAL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__DESCRIPTION = BasePackage.DLITERAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__TYPE = BasePackage.DLITERAL__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__MULTIPLICITY = BasePackage.DLITERAL__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__OPTIONAL = BasePackage.DLITERAL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__COLLECTION = BasePackage.DLITERAL__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__DEDUCED_FROM = BasePackage.DLITERAL__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__SYNTHETIC = BasePackage.DLITERAL__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION__DEDUCTION_RULE = BasePackage.DLITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SLiteral Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION_FEATURE_COUNT = BasePackage.DLITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SLiteral Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLITERAL_DEDUCTION_OPERATION_COUNT = BasePackage.DLITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SComplexTypeDeduction <em>SComplex Type Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SComplexTypeDeduction
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSComplexTypeDeduction()
	 * @generated
	 */
	int SCOMPLEX_TYPE_DEDUCTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE_DEDUCTION__NAME = STYPE_DEDUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE_DEDUCTION__ALIASES = STYPE_DEDUCTION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE_DEDUCTION__DESCRIPTION = STYPE_DEDUCTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE_DEDUCTION__DEDUCTION_RULE = STYPE_DEDUCTION__DEDUCTION_RULE;

	/**
	 * The number of structural features of the '<em>SComplex Type Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE_DEDUCTION_FEATURE_COUNT = STYPE_DEDUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SComplex Type Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOMPLEX_TYPE_DEDUCTION_OPERATION_COUNT = STYPE_DEDUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SDetailTypeDeductionImpl <em>SDetail Type Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SDetailTypeDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDetailTypeDeduction()
	 * @generated
	 */
	int SDETAIL_TYPE_DEDUCTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__NAME = BasePackage.DDETAIL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__ALIASES = BasePackage.DDETAIL_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__DESCRIPTION = BasePackage.DDETAIL_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__DEDUCED_FROM = BasePackage.DDETAIL_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__SYNTHETIC = BasePackage.DDETAIL_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__CONSTRAINTS = BasePackage.DDETAIL_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__PRIMITIVE = BasePackage.DDETAIL_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__FEATURES = BasePackage.DDETAIL_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__NAVIGABLE_MEMBERS = BasePackage.DDETAIL_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__ABSTRACT = BasePackage.DDETAIL_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__SUPER_TYPE = BasePackage.DDETAIL_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SDetail Type Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION_FEATURE_COUNT = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SDetail Type Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDETAIL_TYPE_DEDUCTION_OPERATION_COUNT = BasePackage.DDETAIL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SEntityTypeDeductionImpl <em>SEntity Type Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SEntityTypeDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSEntityTypeDeduction()
	 * @generated
	 */
	int SENTITY_TYPE_DEDUCTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__NAME = BasePackage.DENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__ALIASES = BasePackage.DENTITY_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__DESCRIPTION = BasePackage.DENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__DEDUCED_FROM = BasePackage.DENTITY_TYPE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__SYNTHETIC = BasePackage.DENTITY_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__CONSTRAINTS = BasePackage.DENTITY_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__PRIMITIVE = BasePackage.DENTITY_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__FEATURES = BasePackage.DENTITY_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__NAVIGABLE_MEMBERS = BasePackage.DENTITY_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__ABSTRACT = BasePackage.DENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__SUPER_TYPE = BasePackage.DENTITY_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__ROOT = BasePackage.DENTITY_TYPE__ROOT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__ORIGIN = BasePackage.DENTITY_TYPE__ORIGIN;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__STATES = BasePackage.DENTITY_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__EVENTS = BasePackage.DENTITY_TYPE__EVENTS;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION__DEDUCTION_RULE = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SEntity Type Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION_FEATURE_COUNT = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SEntity Type Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTITY_TYPE_DEDUCTION_OPERATION_COUNT = BasePackage.DENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SFeatureDeduction <em>SFeature Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SFeatureDeduction
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSFeatureDeduction()
	 * @generated
	 */
	int SFEATURE_DEDUCTION = 11;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE_DEDUCTION__DEDUCTION_RULE = BasePackage.IDEDUCTION_DEFINITION__DEDUCTION_RULE;

	/**
	 * The number of structural features of the '<em>SFeature Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE_DEDUCTION_FEATURE_COUNT = BasePackage.IDEDUCTION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SFeature Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFEATURE_DEDUCTION_OPERATION_COUNT = BasePackage.IDEDUCTION_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SAssociationDeductionImpl <em>SAssociation Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SAssociationDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAssociationDeduction()
	 * @generated
	 */
	int SASSOCIATION_DEDUCTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__NAME = BasePackage.DASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__ALIASES = BasePackage.DASSOCIATION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__DESCRIPTION = BasePackage.DASSOCIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__TYPE = BasePackage.DASSOCIATION__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__MULTIPLICITY = BasePackage.DASSOCIATION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__OPTIONAL = BasePackage.DASSOCIATION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__COLLECTION = BasePackage.DASSOCIATION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__DEDUCED_FROM = BasePackage.DASSOCIATION__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__SYNTHETIC = BasePackage.DASSOCIATION__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__KIND = BasePackage.DASSOCIATION__KIND;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__DERIVED = BasePackage.DASSOCIATION__DERIVED;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__SOURCE_TYPE = BasePackage.DASSOCIATION__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION__DEDUCTION_RULE = BasePackage.DASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SAssociation Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION_FEATURE_COUNT = BasePackage.DASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Target Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION___GET_TARGET_TYPE = BasePackage.DASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SAssociation Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SASSOCIATION_DEDUCTION_OPERATION_COUNT = BasePackage.DASSOCIATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SAttributeDeductionImpl <em>SAttribute Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SAttributeDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAttributeDeduction()
	 * @generated
	 */
	int SATTRIBUTE_DEDUCTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__NAME = BasePackage.DATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__ALIASES = BasePackage.DATTRIBUTE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__DESCRIPTION = BasePackage.DATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__TYPE = BasePackage.DATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__MULTIPLICITY = BasePackage.DATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__OPTIONAL = BasePackage.DATTRIBUTE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__COLLECTION = BasePackage.DATTRIBUTE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__DEDUCED_FROM = BasePackage.DATTRIBUTE__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__SYNTHETIC = BasePackage.DATTRIBUTE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__DETAIL = BasePackage.DATTRIBUTE__DETAIL;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__KEY = BasePackage.DATTRIBUTE__KEY;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION__DEDUCTION_RULE = BasePackage.DATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SAttribute Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION_FEATURE_COUNT = BasePackage.DATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SAttribute Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_DEDUCTION_OPERATION_COUNT = BasePackage.DATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SQueryDeductionImpl <em>SQuery Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SQueryDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSQueryDeduction()
	 * @generated
	 */
	int SQUERY_DEDUCTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__NAME = BasePackage.DQUERY__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__ALIASES = BasePackage.DQUERY__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__DESCRIPTION = BasePackage.DQUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__TYPE = BasePackage.DQUERY__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__MULTIPLICITY = BasePackage.DQUERY__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__OPTIONAL = BasePackage.DQUERY__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__COLLECTION = BasePackage.DQUERY__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__DEDUCED_FROM = BasePackage.DQUERY__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__SYNTHETIC = BasePackage.DQUERY__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__NAVIGABLE_MEMBERS = BasePackage.DQUERY__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__PARAMETERS = BasePackage.DQUERY__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__RETURNS = BasePackage.DQUERY__RETURNS;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION__DEDUCTION_RULE = BasePackage.DQUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SQuery Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION_FEATURE_COUNT = BasePackage.DQUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SQuery Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_DEDUCTION_OPERATION_COUNT = BasePackage.DQUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SQueryParameterDeductionImpl <em>SQuery Parameter Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SQueryParameterDeductionImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSQueryParameterDeduction()
	 * @generated
	 */
	int SQUERY_PARAMETER_DEDUCTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__NAME = BasePackage.DQUERY_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__ALIASES = BasePackage.DQUERY_PARAMETER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__DESCRIPTION = BasePackage.DQUERY_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__TYPE = BasePackage.DQUERY_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__MULTIPLICITY = BasePackage.DQUERY_PARAMETER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__OPTIONAL = BasePackage.DQUERY_PARAMETER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__COLLECTION = BasePackage.DQUERY_PARAMETER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__DEDUCED_FROM = BasePackage.DQUERY_PARAMETER__DEDUCED_FROM;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__SYNTHETIC = BasePackage.DQUERY_PARAMETER__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION__DEDUCTION_RULE = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SQuery Parameter Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION_FEATURE_COUNT = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SQuery Parameter Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUERY_PARAMETER_DEDUCTION_OPERATION_COUNT = BasePackage.DQUERY_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SRenameRuleImpl <em>SRename Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SRenameRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSRenameRule()
	 * @generated
	 */
	int SRENAME_RULE = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRENAME_RULE__SOURCE = BasePackage.DDEDUCTION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRENAME_RULE__NAMED_SOURCE = BasePackage.DDEDUCTION_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRENAME_RULE__RENAME_TO = BasePackage.DDEDUCTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SRename Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRENAME_RULE_FEATURE_COUNT = BasePackage.DDEDUCTION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SRename Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRENAME_RULE_OPERATION_COUNT = BasePackage.DDEDUCTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabRuleImpl <em>SGrab Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SGrabRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabRule()
	 * @generated
	 */
	int SGRAB_RULE = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE__SOURCE = SRENAME_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE__NAMED_SOURCE = SRENAME_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE__RENAME_TO = SRENAME_RULE__RENAME_TO;

	/**
	 * The number of structural features of the '<em>SGrab Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE_FEATURE_COUNT = SRENAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SGrab Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_RULE_OPERATION_COUNT = SRENAME_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SDitchRuleImpl <em>SDitch Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SDitchRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDitchRule()
	 * @generated
	 */
	int SDITCH_RULE = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDITCH_RULE__SOURCE = BasePackage.DDEDUCTION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDITCH_RULE__NAMED_SOURCE = BasePackage.DDEDUCTION_RULE__NAMED_SOURCE;

	/**
	 * The number of structural features of the '<em>SDitch Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDITCH_RULE_FEATURE_COUNT = BasePackage.DDEDUCTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SDitch Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDITCH_RULE_OPERATION_COUNT = BasePackage.DDEDUCTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl <em>SStructure Changing Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSStructureChangingRule()
	 * @generated
	 */
	int SSTRUCTURE_CHANGING_RULE = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__SOURCE = SRENAME_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__NAMED_SOURCE = SRENAME_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__RENAME_TO = SRENAME_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__ABSTRACT = SRENAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY = SRENAME_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__DETAIL = SRENAME_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE__EXTEND_FROM = SRENAME_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>SStructure Changing Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE_FEATURE_COUNT = SRENAME_RULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>SStructure Changing Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTRUCTURE_CHANGING_RULE_OPERATION_COUNT = SRENAME_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SMorphRuleImpl <em>SMorph Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SMorphRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSMorphRule()
	 * @generated
	 */
	int SMORPH_RULE = 20;

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
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMORPH_RULE__DETAIL = SSTRUCTURE_CHANGING_RULE__DETAIL;

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
	int SFUSE_RULE = 21;

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
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFUSE_RULE__DETAIL = SSTRUCTURE_CHANGING_RULE__DETAIL;

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
	int SGRAB_AGGREGATE_RULE = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE__SOURCE = SRENAME_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE__NAMED_SOURCE = SRENAME_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE__RENAME_TO = SRENAME_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE__AGGREGATE = SRENAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SGrab Aggregate Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE_FEATURE_COUNT = SRENAME_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SGrab Aggregate Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_AGGREGATE_RULE_OPERATION_COUNT = SRENAME_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabModelRuleImpl <em>SGrab Model Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SGrabModelRuleImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabModelRule()
	 * @generated
	 */
	int SGRAB_MODEL_RULE = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_MODEL_RULE__SOURCE = BasePackage.DDEDUCTION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_MODEL_RULE__NAMED_SOURCE = BasePackage.DDEDUCTION_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>DModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_MODEL_RULE__DMODEL = BasePackage.DDEDUCTION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SGrab Model Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_MODEL_RULE_FEATURE_COUNT = BasePackage.DDEDUCTION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SGrab Model Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRAB_MODEL_RULE_OPERATION_COUNT = BasePackage.DDEDUCTION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SInformationModelKind <em>SInformation Model Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SInformationModelKind
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSInformationModelKind()
	 * @generated
	 */
	int SINFORMATION_MODEL_KIND = 24;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.STristate <em>STristate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.STristate
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSTristate()
	 * @generated
	 */
	int STRISTATE = 25;


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
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SImplicitElementDeduction <em>SImplicit Element Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SImplicit Element Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SImplicitElementDeduction
	 * @generated
	 */
	EClass getSImplicitElementDeduction();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SImplicitElementDeduction#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Deduction Definition</em>'.
	 * @see com.mimacom.ddd.sm.sim.SImplicitElementDeduction#getOriginalDeductionDefinition()
	 * @see #getSImplicitElementDeduction()
	 * @generated
	 */
	EReference getSImplicitElementDeduction_OriginalDeductionDefinition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SDomainDeduction <em>SDomain Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDomain Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDomainDeduction
	 * @generated
	 */
	EClass getSDomainDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SAggregateDeduction <em>SAggregate Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAggregate Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAggregateDeduction
	 * @generated
	 */
	EClass getSAggregateDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.STypeDeduction <em>SType Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SType Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.STypeDeduction
	 * @generated
	 */
	EClass getSTypeDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SPrimitiveDeduction <em>SPrimitive Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPrimitive Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SPrimitiveDeduction
	 * @generated
	 */
	EClass getSPrimitiveDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SEnumerationDeduction <em>SEnumeration Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEnumeration Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SEnumerationDeduction
	 * @generated
	 */
	EClass getSEnumerationDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SLiteralDeduction <em>SLiteral Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLiteral Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SLiteralDeduction
	 * @generated
	 */
	EClass getSLiteralDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SComplexTypeDeduction <em>SComplex Type Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SComplex Type Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SComplexTypeDeduction
	 * @generated
	 */
	EClass getSComplexTypeDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SDetailTypeDeduction <em>SDetail Type Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDetail Type Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SDetailTypeDeduction
	 * @generated
	 */
	EClass getSDetailTypeDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SEntityTypeDeduction <em>SEntity Type Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SEntity Type Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SEntityTypeDeduction
	 * @generated
	 */
	EClass getSEntityTypeDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SFeatureDeduction <em>SFeature Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFeature Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SFeatureDeduction
	 * @generated
	 */
	EClass getSFeatureDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SAssociationDeduction <em>SAssociation Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAssociation Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAssociationDeduction
	 * @generated
	 */
	EClass getSAssociationDeduction();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.sm.sim.SAssociationDeduction#getTargetType() <em>Get Target Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Type</em>' operation.
	 * @see com.mimacom.ddd.sm.sim.SAssociationDeduction#getTargetType()
	 * @generated
	 */
	EOperation getSAssociationDeduction__GetTargetType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SAttributeDeduction <em>SAttribute Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAttribute Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SAttributeDeduction
	 * @generated
	 */
	EClass getSAttributeDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SQueryDeduction <em>SQuery Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQuery Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SQueryDeduction
	 * @generated
	 */
	EClass getSQueryDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SQueryParameterDeduction <em>SQuery Parameter Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQuery Parameter Deduction</em>'.
	 * @see com.mimacom.ddd.sm.sim.SQueryParameterDeduction
	 * @generated
	 */
	EClass getSQueryParameterDeduction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SRenameRule <em>SRename Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRename Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SRenameRule
	 * @generated
	 */
	EClass getSRenameRule();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SRenameRule#getRenameTo <em>Rename To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename To</em>'.
	 * @see com.mimacom.ddd.sm.sim.SRenameRule#getRenameTo()
	 * @see #getSRenameRule()
	 * @generated
	 */
	EAttribute getSRenameRule_RenameTo();

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
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see com.mimacom.ddd.sm.sim.SStructureChangingRule#getDetail()
	 * @see #getSStructureChangingRule()
	 * @generated
	 */
	EAttribute getSStructureChangingRule_Detail();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SGrabModelRule <em>SGrab Model Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGrab Model Rule</em>'.
	 * @see com.mimacom.ddd.sm.sim.SGrabModelRule
	 * @generated
	 */
	EClass getSGrabModelRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sim.SGrabModelRule#getDModel <em>DModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DModel</em>'.
	 * @see com.mimacom.ddd.sm.sim.SGrabModelRule#getDModel()
	 * @see #getSGrabModelRule()
	 * @generated
	 */
	EReference getSGrabModelRule_DModel();

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
		 * The meta object literal for the '<em><b>Domain Proxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINFORMATION_MODEL__DOMAIN_PROXIES = eINSTANCE.getSInformationModel_DomainProxies();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SImplicitElementDeductionImpl <em>SImplicit Element Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SImplicitElementDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSImplicitElementDeduction()
		 * @generated
		 */
		EClass SIMPLICIT_ELEMENT_DEDUCTION = eINSTANCE.getSImplicitElementDeduction();

		/**
		 * The meta object literal for the '<em><b>Original Deduction Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION = eINSTANCE.getSImplicitElementDeduction_OriginalDeductionDefinition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SDomainDeductionImpl <em>SDomain Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SDomainDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDomainDeduction()
		 * @generated
		 */
		EClass SDOMAIN_DEDUCTION = eINSTANCE.getSDomainDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SAggregateDeductionImpl <em>SAggregate Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SAggregateDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAggregateDeduction()
		 * @generated
		 */
		EClass SAGGREGATE_DEDUCTION = eINSTANCE.getSAggregateDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.STypeDeduction <em>SType Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.STypeDeduction
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSTypeDeduction()
		 * @generated
		 */
		EClass STYPE_DEDUCTION = eINSTANCE.getSTypeDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SPrimitiveDeductionImpl <em>SPrimitive Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SPrimitiveDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSPrimitiveDeduction()
		 * @generated
		 */
		EClass SPRIMITIVE_DEDUCTION = eINSTANCE.getSPrimitiveDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SEnumerationDeductionImpl <em>SEnumeration Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SEnumerationDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSEnumerationDeduction()
		 * @generated
		 */
		EClass SENUMERATION_DEDUCTION = eINSTANCE.getSEnumerationDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SLiteralDeductionImpl <em>SLiteral Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SLiteralDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSLiteralDeduction()
		 * @generated
		 */
		EClass SLITERAL_DEDUCTION = eINSTANCE.getSLiteralDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SComplexTypeDeduction <em>SComplex Type Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SComplexTypeDeduction
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSComplexTypeDeduction()
		 * @generated
		 */
		EClass SCOMPLEX_TYPE_DEDUCTION = eINSTANCE.getSComplexTypeDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SDetailTypeDeductionImpl <em>SDetail Type Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SDetailTypeDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSDetailTypeDeduction()
		 * @generated
		 */
		EClass SDETAIL_TYPE_DEDUCTION = eINSTANCE.getSDetailTypeDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SEntityTypeDeductionImpl <em>SEntity Type Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SEntityTypeDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSEntityTypeDeduction()
		 * @generated
		 */
		EClass SENTITY_TYPE_DEDUCTION = eINSTANCE.getSEntityTypeDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SFeatureDeduction <em>SFeature Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SFeatureDeduction
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSFeatureDeduction()
		 * @generated
		 */
		EClass SFEATURE_DEDUCTION = eINSTANCE.getSFeatureDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SAssociationDeductionImpl <em>SAssociation Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SAssociationDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAssociationDeduction()
		 * @generated
		 */
		EClass SASSOCIATION_DEDUCTION = eINSTANCE.getSAssociationDeduction();

		/**
		 * The meta object literal for the '<em><b>Get Target Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SASSOCIATION_DEDUCTION___GET_TARGET_TYPE = eINSTANCE.getSAssociationDeduction__GetTargetType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SAttributeDeductionImpl <em>SAttribute Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SAttributeDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSAttributeDeduction()
		 * @generated
		 */
		EClass SATTRIBUTE_DEDUCTION = eINSTANCE.getSAttributeDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SQueryDeductionImpl <em>SQuery Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SQueryDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSQueryDeduction()
		 * @generated
		 */
		EClass SQUERY_DEDUCTION = eINSTANCE.getSQueryDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SQueryParameterDeductionImpl <em>SQuery Parameter Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SQueryParameterDeductionImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSQueryParameterDeduction()
		 * @generated
		 */
		EClass SQUERY_PARAMETER_DEDUCTION = eINSTANCE.getSQueryParameterDeduction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SRenameRuleImpl <em>SRename Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SRenameRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSRenameRule()
		 * @generated
		 */
		EClass SRENAME_RULE = eINSTANCE.getSRenameRule();

		/**
		 * The meta object literal for the '<em><b>Rename To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRENAME_RULE__RENAME_TO = eINSTANCE.getSRenameRule_RenameTo();

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
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSTRUCTURE_CHANGING_RULE__DETAIL = eINSTANCE.getSStructureChangingRule_Detail();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SGrabModelRuleImpl <em>SGrab Model Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SGrabModelRuleImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSGrabModelRule()
		 * @generated
		 */
		EClass SGRAB_MODEL_RULE = eINSTANCE.getSGrabModelRule();

		/**
		 * The meta object literal for the '<em><b>DModel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SGRAB_MODEL_RULE__DMODEL = eINSTANCE.getSGrabModelRule_DModel();

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
