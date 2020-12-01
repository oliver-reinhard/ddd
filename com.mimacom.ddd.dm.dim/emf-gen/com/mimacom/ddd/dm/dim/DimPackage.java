/**
 */
package com.mimacom.ddd.dm.dim;

import com.mimacom.ddd.dm.base.base.BasePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.mimacom.ddd.dm.dim.DimFactory
 * @model kind="package"
 * @generated
 */
public interface DimPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/dim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DimPackage eINSTANCE = com.mimacom.ddd.dm.dim.impl.DimPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DomainInformationModelImpl <em>Domain Information Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DomainInformationModelImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDomainInformationModel()
	 * @generated
	 */
	int DOMAIN_INFORMATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL__NAME = BasePackage.DINFORMATION_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL__ALIASES = BasePackage.DINFORMATION_MODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL__DESCRIPTION = BasePackage.DINFORMATION_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL__NOTES = BasePackage.DINFORMATION_MODEL__NOTES;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL__AGGREGATES = BasePackage.DINFORMATION_MODEL__AGGREGATES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL__TYPES = BasePackage.DINFORMATION_MODEL__TYPES;

	/**
	 * The number of structural features of the '<em>Domain Information Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL_FEATURE_COUNT = BasePackage.DINFORMATION_MODEL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Allows Identity Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL___ALLOWS_IDENTITY_TYPES = BasePackage.DINFORMATION_MODEL___ALLOWS_IDENTITY_TYPES;

	/**
	 * The number of operations of the '<em>Domain Information Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_MODEL_OPERATION_COUNT = BasePackage.DINFORMATION_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimAggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimAggregateImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimAggregate()
	 * @generated
	 */
	int DIM_AGGREGATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__NAME = BasePackage.DAGGREGATE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__ALIASES = BasePackage.DAGGREGATE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__DESCRIPTION = BasePackage.DAGGREGATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__NOTES = BasePackage.DAGGREGATE__NOTES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__TYPES = BasePackage.DAGGREGATE__TYPES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__FEATURES = BasePackage.DAGGREGATE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__NAVIGABLE_MEMBERS = BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__ROOTS = BasePackage.DAGGREGATE__ROOTS;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__READ_ONLY_VIEW = BasePackage.DAGGREGATE__READ_ONLY_VIEW;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE__TRANSPOSED_BY = BasePackage.DAGGREGATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE_FEATURE_COUNT = BasePackage.DAGGREGATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_AGGREGATE_OPERATION_COUNT = BasePackage.DAGGREGATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimTypeImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimType()
	 * @generated
	 */
	int DIM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__NAME = BasePackage.DTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__ALIASES = BasePackage.DTYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__DESCRIPTION = BasePackage.DTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__NOTES = BasePackage.DTYPE__NOTES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__CONSTRAINTS = BasePackage.DTYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__PRIMITIVE = BasePackage.DTYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE__TRANSPOSED_BY = BasePackage.DTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE_FEATURE_COUNT = BasePackage.DTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_TYPE_OPERATION_COUNT = BasePackage.DTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimSimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimSimpleTypeImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimSimpleType()
	 * @generated
	 */
	int DIM_SIMPLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE__NAME = BasePackage.DSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE__ALIASES = BasePackage.DSIMPLE_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE__DESCRIPTION = BasePackage.DSIMPLE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE__NOTES = BasePackage.DSIMPLE_TYPE__NOTES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE__CONSTRAINTS = BasePackage.DSIMPLE_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE__PRIMITIVE = BasePackage.DSIMPLE_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE__TRANSPOSED_BY = BasePackage.DSIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE_FEATURE_COUNT = BasePackage.DSIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_SIMPLE_TYPE_OPERATION_COUNT = BasePackage.DSIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimPrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimPrimitiveImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimPrimitive()
	 * @generated
	 */
	int DIM_PRIMITIVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE__NAME = BasePackage.DPRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE__ALIASES = BasePackage.DPRIMITIVE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE__DESCRIPTION = BasePackage.DPRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE__NOTES = BasePackage.DPRIMITIVE__NOTES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE__CONSTRAINTS = BasePackage.DPRIMITIVE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE__PRIMITIVE = BasePackage.DPRIMITIVE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE__REDEFINES = BasePackage.DPRIMITIVE__REDEFINES;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE__TRANSPOSED_BY = BasePackage.DPRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE_FEATURE_COUNT = BasePackage.DPRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_PRIMITIVE_OPERATION_COUNT = BasePackage.DPRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimEnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimEnumerationImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimEnumeration()
	 * @generated
	 */
	int DIM_ENUMERATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__NAME = BasePackage.DENUMERATION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__ALIASES = BasePackage.DENUMERATION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__DESCRIPTION = BasePackage.DENUMERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__NOTES = BasePackage.DENUMERATION__NOTES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__CONSTRAINTS = BasePackage.DENUMERATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__PRIMITIVE = BasePackage.DENUMERATION__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__NAVIGABLE_MEMBERS = BasePackage.DENUMERATION__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__LITERALS = BasePackage.DENUMERATION__LITERALS;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION__TRANSPOSED_BY = BasePackage.DENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION_FEATURE_COUNT = BasePackage.DENUMERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENUMERATION_OPERATION_COUNT = BasePackage.DENUMERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimLiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimLiteralImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimLiteral()
	 * @generated
	 */
	int DIM_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__NAME = BasePackage.DLITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__ALIASES = BasePackage.DLITERAL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__DESCRIPTION = BasePackage.DLITERAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__NOTES = BasePackage.DLITERAL__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__TYPE = BasePackage.DLITERAL__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__MULTIPLICITY = BasePackage.DLITERAL__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__OPTIONAL = BasePackage.DLITERAL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__COLLECTION = BasePackage.DLITERAL__COLLECTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL__TRANSPOSED_BY = BasePackage.DLITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL_FEATURE_COUNT = BasePackage.DLITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_LITERAL_OPERATION_COUNT = BasePackage.DLITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimComplexTypeImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimComplexType()
	 * @generated
	 */
	int DIM_COMPLEX_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__NAME = BasePackage.DCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__ALIASES = BasePackage.DCOMPLEX_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__DESCRIPTION = BasePackage.DCOMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__NOTES = BasePackage.DCOMPLEX_TYPE__NOTES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__CONSTRAINTS = BasePackage.DCOMPLEX_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__PRIMITIVE = BasePackage.DCOMPLEX_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__FEATURES = BasePackage.DCOMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__NAVIGABLE_MEMBERS = BasePackage.DCOMPLEX_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__ABSTRACT = BasePackage.DCOMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__SUPER_TYPE = BasePackage.DCOMPLEX_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__READ_ONLY_VIEW = BasePackage.DCOMPLEX_TYPE__READ_ONLY_VIEW;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE__TRANSPOSED_BY = BasePackage.DCOMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE_FEATURE_COUNT = BasePackage.DCOMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_COMPLEX_TYPE_OPERATION_COUNT = BasePackage.DCOMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimDetailTypeImpl <em>Detail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimDetailTypeImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimDetailType()
	 * @generated
	 */
	int DIM_DETAIL_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__NAME = BasePackage.DDETAIL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__ALIASES = BasePackage.DDETAIL_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__DESCRIPTION = BasePackage.DDETAIL_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__NOTES = BasePackage.DDETAIL_TYPE__NOTES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__CONSTRAINTS = BasePackage.DDETAIL_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__PRIMITIVE = BasePackage.DDETAIL_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__FEATURES = BasePackage.DDETAIL_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__NAVIGABLE_MEMBERS = BasePackage.DDETAIL_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__ABSTRACT = BasePackage.DDETAIL_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__SUPER_TYPE = BasePackage.DDETAIL_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__READ_ONLY_VIEW = BasePackage.DDETAIL_TYPE__READ_ONLY_VIEW;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE__TRANSPOSED_BY = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Detail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE_FEATURE_COUNT = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Detail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_DETAIL_TYPE_OPERATION_COUNT = BasePackage.DDETAIL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimEntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimEntityTypeImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimEntityType()
	 * @generated
	 */
	int DIM_ENTITY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__NAME = BasePackage.DENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__ALIASES = BasePackage.DENTITY_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__DESCRIPTION = BasePackage.DENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__NOTES = BasePackage.DENTITY_TYPE__NOTES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__CONSTRAINTS = BasePackage.DENTITY_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__PRIMITIVE = BasePackage.DENTITY_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__FEATURES = BasePackage.DENTITY_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__NAVIGABLE_MEMBERS = BasePackage.DENTITY_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__ABSTRACT = BasePackage.DENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__SUPER_TYPE = BasePackage.DENTITY_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__READ_ONLY_VIEW = BasePackage.DENTITY_TYPE__READ_ONLY_VIEW;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__ROOT = BasePackage.DENTITY_TYPE__ROOT;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__NATURE = BasePackage.DENTITY_TYPE__NATURE;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__STATES = BasePackage.DENTITY_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__EVENTS = BasePackage.DENTITY_TYPE__EVENTS;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE__TRANSPOSED_BY = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE_FEATURE_COUNT = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ENTITY_TYPE_OPERATION_COUNT = BasePackage.DENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimFeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimFeatureImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimFeature()
	 * @generated
	 */
	int DIM_FEATURE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__NAME = BasePackage.DFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__ALIASES = BasePackage.DFEATURE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__DESCRIPTION = BasePackage.DFEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__NOTES = BasePackage.DFEATURE__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__TYPE = BasePackage.DFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__MULTIPLICITY = BasePackage.DFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__OPTIONAL = BasePackage.DFEATURE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__COLLECTION = BasePackage.DFEATURE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__READ_ONLY_VIEW = BasePackage.DFEATURE__READ_ONLY_VIEW;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE__TRANSPOSED_BY = BasePackage.DFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE_FEATURE_COUNT = BasePackage.DFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_FEATURE_OPERATION_COUNT = BasePackage.DFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimAssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimAssociationImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimAssociation()
	 * @generated
	 */
	int DIM_ASSOCIATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__NAME = BasePackage.DASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__ALIASES = BasePackage.DASSOCIATION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__DESCRIPTION = BasePackage.DASSOCIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__NOTES = BasePackage.DASSOCIATION__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__TYPE = BasePackage.DASSOCIATION__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__MULTIPLICITY = BasePackage.DASSOCIATION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__OPTIONAL = BasePackage.DASSOCIATION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__COLLECTION = BasePackage.DASSOCIATION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__READ_ONLY_VIEW = BasePackage.DASSOCIATION__READ_ONLY_VIEW;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__KIND = BasePackage.DASSOCIATION__KIND;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__DERIVED = BasePackage.DASSOCIATION__DERIVED;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__SOURCE_TYPE = BasePackage.DASSOCIATION__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION__TRANSPOSED_BY = BasePackage.DASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION_FEATURE_COUNT = BasePackage.DASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Target Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION___GET_TARGET_TYPE = BasePackage.DASSOCIATION___GET_TARGET_TYPE;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ASSOCIATION_OPERATION_COUNT = BasePackage.DASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimAttributeImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimAttribute()
	 * @generated
	 */
	int DIM_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__NAME = BasePackage.DATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__ALIASES = BasePackage.DATTRIBUTE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__DESCRIPTION = BasePackage.DATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__NOTES = BasePackage.DATTRIBUTE__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__TYPE = BasePackage.DATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__MULTIPLICITY = BasePackage.DATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__OPTIONAL = BasePackage.DATTRIBUTE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__COLLECTION = BasePackage.DATTRIBUTE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__READ_ONLY_VIEW = BasePackage.DATTRIBUTE__READ_ONLY_VIEW;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__DETAIL = BasePackage.DATTRIBUTE__DETAIL;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__KEY = BasePackage.DATTRIBUTE__KEY;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE__TRANSPOSED_BY = BasePackage.DATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE_FEATURE_COUNT = BasePackage.DATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_ATTRIBUTE_OPERATION_COUNT = BasePackage.DATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimQueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimQueryImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimQuery()
	 * @generated
	 */
	int DIM_QUERY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__NAME = BasePackage.DQUERY__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__ALIASES = BasePackage.DQUERY__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__DESCRIPTION = BasePackage.DQUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__NOTES = BasePackage.DQUERY__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__TYPE = BasePackage.DQUERY__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__MULTIPLICITY = BasePackage.DQUERY__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__OPTIONAL = BasePackage.DQUERY__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__COLLECTION = BasePackage.DQUERY__COLLECTION;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__READ_ONLY_VIEW = BasePackage.DQUERY__READ_ONLY_VIEW;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__NAVIGABLE_MEMBERS = BasePackage.DQUERY__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__PARAMETERS = BasePackage.DQUERY__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__RETURNS = BasePackage.DQUERY__RETURNS;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY__TRANSPOSED_BY = BasePackage.DQUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_FEATURE_COUNT = BasePackage.DQUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_OPERATION_COUNT = BasePackage.DQUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dim.impl.DimQueryParameterImpl <em>Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dim.impl.DimQueryParameterImpl
	 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimQueryParameter()
	 * @generated
	 */
	int DIM_QUERY_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__NAME = BasePackage.DQUERY_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__ALIASES = BasePackage.DQUERY_PARAMETER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__DESCRIPTION = BasePackage.DQUERY_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__NOTES = BasePackage.DQUERY_PARAMETER__NOTES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__TYPE = BasePackage.DQUERY_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__MULTIPLICITY = BasePackage.DQUERY_PARAMETER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__OPTIONAL = BasePackage.DQUERY_PARAMETER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__COLLECTION = BasePackage.DQUERY_PARAMETER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER__TRANSPOSED_BY = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER_FEATURE_COUNT = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIM_QUERY_PARAMETER_OPERATION_COUNT = BasePackage.DQUERY_PARAMETER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DomainInformationModel <em>Domain Information Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Information Model</em>'.
	 * @see com.mimacom.ddd.dm.dim.DomainInformationModel
	 * @generated
	 */
	EClass getDomainInformationModel();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimAggregate
	 * @generated
	 */
	EClass getDimAggregate();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimType
	 * @generated
	 */
	EClass getDimType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimSimpleType
	 * @generated
	 */
	EClass getDimSimpleType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimPrimitive
	 * @generated
	 */
	EClass getDimPrimitive();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimEnumeration
	 * @generated
	 */
	EClass getDimEnumeration();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimLiteral
	 * @generated
	 */
	EClass getDimLiteral();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimComplexType
	 * @generated
	 */
	EClass getDimComplexType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimDetailType <em>Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail Type</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimDetailType
	 * @generated
	 */
	EClass getDimDetailType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimEntityType
	 * @generated
	 */
	EClass getDimEntityType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimFeature
	 * @generated
	 */
	EClass getDimFeature();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimAssociation
	 * @generated
	 */
	EClass getDimAssociation();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimAttribute
	 * @generated
	 */
	EClass getDimAttribute();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimQuery
	 * @generated
	 */
	EClass getDimQuery();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dim.DimQueryParameter <em>Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parameter</em>'.
	 * @see com.mimacom.ddd.dm.dim.DimQueryParameter
	 * @generated
	 */
	EClass getDimQueryParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DimFactory getDimFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DomainInformationModelImpl <em>Domain Information Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DomainInformationModelImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDomainInformationModel()
		 * @generated
		 */
		EClass DOMAIN_INFORMATION_MODEL = eINSTANCE.getDomainInformationModel();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimAggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimAggregateImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimAggregate()
		 * @generated
		 */
		EClass DIM_AGGREGATE = eINSTANCE.getDimAggregate();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimTypeImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimType()
		 * @generated
		 */
		EClass DIM_TYPE = eINSTANCE.getDimType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimSimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimSimpleTypeImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimSimpleType()
		 * @generated
		 */
		EClass DIM_SIMPLE_TYPE = eINSTANCE.getDimSimpleType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimPrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimPrimitiveImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimPrimitive()
		 * @generated
		 */
		EClass DIM_PRIMITIVE = eINSTANCE.getDimPrimitive();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimEnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimEnumerationImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimEnumeration()
		 * @generated
		 */
		EClass DIM_ENUMERATION = eINSTANCE.getDimEnumeration();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimLiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimLiteralImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimLiteral()
		 * @generated
		 */
		EClass DIM_LITERAL = eINSTANCE.getDimLiteral();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimComplexTypeImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimComplexType()
		 * @generated
		 */
		EClass DIM_COMPLEX_TYPE = eINSTANCE.getDimComplexType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimDetailTypeImpl <em>Detail Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimDetailTypeImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimDetailType()
		 * @generated
		 */
		EClass DIM_DETAIL_TYPE = eINSTANCE.getDimDetailType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimEntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimEntityTypeImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimEntityType()
		 * @generated
		 */
		EClass DIM_ENTITY_TYPE = eINSTANCE.getDimEntityType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimFeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimFeatureImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimFeature()
		 * @generated
		 */
		EClass DIM_FEATURE = eINSTANCE.getDimFeature();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimAssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimAssociationImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimAssociation()
		 * @generated
		 */
		EClass DIM_ASSOCIATION = eINSTANCE.getDimAssociation();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimAttributeImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimAttribute()
		 * @generated
		 */
		EClass DIM_ATTRIBUTE = eINSTANCE.getDimAttribute();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimQueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimQueryImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimQuery()
		 * @generated
		 */
		EClass DIM_QUERY = eINSTANCE.getDimQuery();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dim.impl.DimQueryParameterImpl <em>Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dim.impl.DimQueryParameterImpl
		 * @see com.mimacom.ddd.dm.dim.impl.DimPackageImpl#getDimQueryParameter()
		 * @generated
		 */
		EClass DIM_QUERY_PARAMETER = eINSTANCE.getDimQueryParameter();

	}

} //DimPackage
