/**
 */
package com.mimacom.ddd.dm.base.synthetic;

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
 * @see com.mimacom.ddd.dm.base.synthetic.SyntheticFactory
 * @model kind="package"
 * @generated
 */
public interface SyntheticPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "synthetic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/synthetic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "synthetic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyntheticPackage eINSTANCE = com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAggregateImpl <em>TSynthetic Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAggregateImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticAggregate()
	 * @generated
	 */
	int TSYNTHETIC_AGGREGATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE__NAME = BasePackage.DAGGREGATE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE__ALIASES = BasePackage.DAGGREGATE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE__DESCRIPTION = BasePackage.DAGGREGATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE__TYPES = BasePackage.DAGGREGATE__TYPES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE__FEATURES = BasePackage.DAGGREGATE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE__NAVIGABLE_MEMBERS = BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE__ROOTS = BasePackage.DAGGREGATE__ROOTS;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE__RECIPE = BasePackage.DAGGREGATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE_FEATURE_COUNT = BasePackage.DAGGREGATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_AGGREGATE_OPERATION_COUNT = BasePackage.DAGGREGATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticTypeImpl <em>TSynthetic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticTypeImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticType()
	 * @generated
	 */
	int TSYNTHETIC_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_TYPE__NAME = BasePackage.DTYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_TYPE__ALIASES = BasePackage.DTYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_TYPE__DESCRIPTION = BasePackage.DTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_TYPE__CONSTRAINTS = BasePackage.DTYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_TYPE__PRIMITIVE = BasePackage.DTYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_TYPE__RECIPE = BasePackage.DTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_TYPE_FEATURE_COUNT = BasePackage.DTYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_TYPE_OPERATION_COUNT = BasePackage.DTYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticPrimitiveImpl <em>TSynthetic Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticPrimitiveImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticPrimitive()
	 * @generated
	 */
	int TSYNTHETIC_PRIMITIVE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE__NAME = BasePackage.DPRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE__ALIASES = BasePackage.DPRIMITIVE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE__DESCRIPTION = BasePackage.DPRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE__CONSTRAINTS = BasePackage.DPRIMITIVE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE__PRIMITIVE = BasePackage.DPRIMITIVE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE__REDEFINES = BasePackage.DPRIMITIVE__REDEFINES;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE__RECIPE = BasePackage.DPRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE_FEATURE_COUNT = BasePackage.DPRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_PRIMITIVE_OPERATION_COUNT = BasePackage.DPRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticEnumerationImpl <em>TSynthetic Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticEnumerationImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticEnumeration()
	 * @generated
	 */
	int TSYNTHETIC_ENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION__NAME = BasePackage.DENUMERATION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION__ALIASES = BasePackage.DENUMERATION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION__DESCRIPTION = BasePackage.DENUMERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION__CONSTRAINTS = BasePackage.DENUMERATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION__PRIMITIVE = BasePackage.DENUMERATION__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION__NAVIGABLE_MEMBERS = BasePackage.DENUMERATION__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION__LITERALS = BasePackage.DENUMERATION__LITERALS;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION__RECIPE = BasePackage.DENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION_FEATURE_COUNT = BasePackage.DENUMERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENUMERATION_OPERATION_COUNT = BasePackage.DENUMERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticLiteralImpl <em>TSynthetic Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticLiteralImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticLiteral()
	 * @generated
	 */
	int TSYNTHETIC_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL__NAME = BasePackage.DLITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL__ALIASES = BasePackage.DLITERAL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL__DESCRIPTION = BasePackage.DLITERAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL__TYPE = BasePackage.DLITERAL__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL__MULTIPLICITY = BasePackage.DLITERAL__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL__OPTIONAL = BasePackage.DLITERAL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL__COLLECTION = BasePackage.DLITERAL__COLLECTION;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL__RECIPE = BasePackage.DLITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL_FEATURE_COUNT = BasePackage.DLITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_LITERAL_OPERATION_COUNT = BasePackage.DLITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticComplexTypeImpl <em>TSynthetic Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticComplexTypeImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticComplexType()
	 * @generated
	 */
	int TSYNTHETIC_COMPLEX_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__NAME = BasePackage.DCOMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__ALIASES = BasePackage.DCOMPLEX_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__DESCRIPTION = BasePackage.DCOMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__CONSTRAINTS = BasePackage.DCOMPLEX_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__PRIMITIVE = BasePackage.DCOMPLEX_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__FEATURES = BasePackage.DCOMPLEX_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__NAVIGABLE_MEMBERS = BasePackage.DCOMPLEX_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__ABSTRACT = BasePackage.DCOMPLEX_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__SUPER_TYPE = BasePackage.DCOMPLEX_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE__RECIPE = BasePackage.DCOMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE_FEATURE_COUNT = BasePackage.DCOMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_COMPLEX_TYPE_OPERATION_COUNT = BasePackage.DCOMPLEX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticDetailTypeImpl <em>TSynthetic Detail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticDetailTypeImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticDetailType()
	 * @generated
	 */
	int TSYNTHETIC_DETAIL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__NAME = BasePackage.DDETAIL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__ALIASES = BasePackage.DDETAIL_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__DESCRIPTION = BasePackage.DDETAIL_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__CONSTRAINTS = BasePackage.DDETAIL_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__PRIMITIVE = BasePackage.DDETAIL_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__FEATURES = BasePackage.DDETAIL_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__NAVIGABLE_MEMBERS = BasePackage.DDETAIL_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__ABSTRACT = BasePackage.DDETAIL_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__SUPER_TYPE = BasePackage.DDETAIL_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE__RECIPE = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Detail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE_FEATURE_COUNT = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Detail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_DETAIL_TYPE_OPERATION_COUNT = BasePackage.DDETAIL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticEntityTypeImpl <em>TSynthetic Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticEntityTypeImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticEntityType()
	 * @generated
	 */
	int TSYNTHETIC_ENTITY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__NAME = BasePackage.DENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__ALIASES = BasePackage.DENTITY_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__DESCRIPTION = BasePackage.DENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__CONSTRAINTS = BasePackage.DENTITY_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__PRIMITIVE = BasePackage.DENTITY_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__FEATURES = BasePackage.DENTITY_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__NAVIGABLE_MEMBERS = BasePackage.DENTITY_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__ABSTRACT = BasePackage.DENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__SUPER_TYPE = BasePackage.DENTITY_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__ROOT = BasePackage.DENTITY_TYPE__ROOT;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__NATURE = BasePackage.DENTITY_TYPE__NATURE;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__STATES = BasePackage.DENTITY_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__EVENTS = BasePackage.DENTITY_TYPE__EVENTS;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE__RECIPE = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE_FEATURE_COUNT = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ENTITY_TYPE_OPERATION_COUNT = BasePackage.DENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticFeatureImpl <em>TSynthetic Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticFeatureImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticFeature()
	 * @generated
	 */
	int TSYNTHETIC_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE__NAME = BasePackage.DFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE__ALIASES = BasePackage.DFEATURE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE__DESCRIPTION = BasePackage.DFEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE__TYPE = BasePackage.DFEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE__MULTIPLICITY = BasePackage.DFEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE__OPTIONAL = BasePackage.DFEATURE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE__COLLECTION = BasePackage.DFEATURE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE__RECIPE = BasePackage.DFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE_FEATURE_COUNT = BasePackage.DFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_FEATURE_OPERATION_COUNT = BasePackage.DFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAssociationImpl <em>TSynthetic Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAssociationImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticAssociation()
	 * @generated
	 */
	int TSYNTHETIC_ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__NAME = BasePackage.DASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__ALIASES = BasePackage.DASSOCIATION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__DESCRIPTION = BasePackage.DASSOCIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__TYPE = BasePackage.DASSOCIATION__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__MULTIPLICITY = BasePackage.DASSOCIATION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__OPTIONAL = BasePackage.DASSOCIATION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__COLLECTION = BasePackage.DASSOCIATION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__KIND = BasePackage.DASSOCIATION__KIND;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__DERIVED = BasePackage.DASSOCIATION__DERIVED;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__SOURCE_TYPE = BasePackage.DASSOCIATION__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION__RECIPE = BasePackage.DASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION_FEATURE_COUNT = BasePackage.DASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Target Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION___GET_TARGET_TYPE = BasePackage.DASSOCIATION___GET_TARGET_TYPE;

	/**
	 * The number of operations of the '<em>TSynthetic Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ASSOCIATION_OPERATION_COUNT = BasePackage.DASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAttributeImpl <em>TSynthetic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAttributeImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticAttribute()
	 * @generated
	 */
	int TSYNTHETIC_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__NAME = BasePackage.DATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__ALIASES = BasePackage.DATTRIBUTE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__DESCRIPTION = BasePackage.DATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__TYPE = BasePackage.DATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__MULTIPLICITY = BasePackage.DATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__OPTIONAL = BasePackage.DATTRIBUTE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__COLLECTION = BasePackage.DATTRIBUTE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__DETAIL = BasePackage.DATTRIBUTE__DETAIL;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__KEY = BasePackage.DATTRIBUTE__KEY;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE__RECIPE = BasePackage.DATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE_FEATURE_COUNT = BasePackage.DATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_ATTRIBUTE_OPERATION_COUNT = BasePackage.DATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticQueryImpl <em>TSynthetic Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticQueryImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticQuery()
	 * @generated
	 */
	int TSYNTHETIC_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__NAME = BasePackage.DQUERY__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__ALIASES = BasePackage.DQUERY__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__DESCRIPTION = BasePackage.DQUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__TYPE = BasePackage.DQUERY__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__MULTIPLICITY = BasePackage.DQUERY__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__OPTIONAL = BasePackage.DQUERY__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__COLLECTION = BasePackage.DQUERY__COLLECTION;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__NAVIGABLE_MEMBERS = BasePackage.DQUERY__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__PARAMETERS = BasePackage.DQUERY__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__RETURNS = BasePackage.DQUERY__RETURNS;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY__RECIPE = BasePackage.DQUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_FEATURE_COUNT = BasePackage.DQUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_OPERATION_COUNT = BasePackage.DQUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticQueryParameterImpl <em>TSynthetic Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticQueryParameterImpl
	 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticQueryParameter()
	 * @generated
	 */
	int TSYNTHETIC_QUERY_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER__NAME = BasePackage.DQUERY_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER__ALIASES = BasePackage.DQUERY_PARAMETER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER__DESCRIPTION = BasePackage.DQUERY_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER__TYPE = BasePackage.DQUERY_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER__MULTIPLICITY = BasePackage.DQUERY_PARAMETER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER__OPTIONAL = BasePackage.DQUERY_PARAMETER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER__COLLECTION = BasePackage.DQUERY_PARAMETER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER__RECIPE = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSynthetic Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER_FEATURE_COUNT = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSynthetic Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSYNTHETIC_QUERY_PARAMETER_OPERATION_COUNT = BasePackage.DQUERY_PARAMETER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate <em>TSynthetic Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Aggregate</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate
	 * @generated
	 */
	EClass getTSyntheticAggregate();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticType <em>TSynthetic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Type</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticType
	 * @generated
	 */
	EClass getTSyntheticType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive <em>TSynthetic Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Primitive</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive
	 * @generated
	 */
	EClass getTSyntheticPrimitive();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration <em>TSynthetic Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Enumeration</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration
	 * @generated
	 */
	EClass getTSyntheticEnumeration();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticLiteral <em>TSynthetic Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Literal</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticLiteral
	 * @generated
	 */
	EClass getTSyntheticLiteral();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticComplexType <em>TSynthetic Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Complex Type</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticComplexType
	 * @generated
	 */
	EClass getTSyntheticComplexType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticDetailType <em>TSynthetic Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Detail Type</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticDetailType
	 * @generated
	 */
	EClass getTSyntheticDetailType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticEntityType <em>TSynthetic Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Entity Type</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticEntityType
	 * @generated
	 */
	EClass getTSyntheticEntityType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticFeature <em>TSynthetic Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Feature</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticFeature
	 * @generated
	 */
	EClass getTSyntheticFeature();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticAssociation <em>TSynthetic Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Association</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticAssociation
	 * @generated
	 */
	EClass getTSyntheticAssociation();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticAttribute <em>TSynthetic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Attribute</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticAttribute
	 * @generated
	 */
	EClass getTSyntheticAttribute();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticQuery <em>TSynthetic Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Query</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticQuery
	 * @generated
	 */
	EClass getTSyntheticQuery();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.synthetic.TSyntheticQueryParameter <em>TSynthetic Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSynthetic Query Parameter</em>'.
	 * @see com.mimacom.ddd.dm.base.synthetic.TSyntheticQueryParameter
	 * @generated
	 */
	EClass getTSyntheticQueryParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SyntheticFactory getSyntheticFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAggregateImpl <em>TSynthetic Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAggregateImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticAggregate()
		 * @generated
		 */
		EClass TSYNTHETIC_AGGREGATE = eINSTANCE.getTSyntheticAggregate();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticTypeImpl <em>TSynthetic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticTypeImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticType()
		 * @generated
		 */
		EClass TSYNTHETIC_TYPE = eINSTANCE.getTSyntheticType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticPrimitiveImpl <em>TSynthetic Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticPrimitiveImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticPrimitive()
		 * @generated
		 */
		EClass TSYNTHETIC_PRIMITIVE = eINSTANCE.getTSyntheticPrimitive();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticEnumerationImpl <em>TSynthetic Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticEnumerationImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticEnumeration()
		 * @generated
		 */
		EClass TSYNTHETIC_ENUMERATION = eINSTANCE.getTSyntheticEnumeration();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticLiteralImpl <em>TSynthetic Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticLiteralImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticLiteral()
		 * @generated
		 */
		EClass TSYNTHETIC_LITERAL = eINSTANCE.getTSyntheticLiteral();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticComplexTypeImpl <em>TSynthetic Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticComplexTypeImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticComplexType()
		 * @generated
		 */
		EClass TSYNTHETIC_COMPLEX_TYPE = eINSTANCE.getTSyntheticComplexType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticDetailTypeImpl <em>TSynthetic Detail Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticDetailTypeImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticDetailType()
		 * @generated
		 */
		EClass TSYNTHETIC_DETAIL_TYPE = eINSTANCE.getTSyntheticDetailType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticEntityTypeImpl <em>TSynthetic Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticEntityTypeImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticEntityType()
		 * @generated
		 */
		EClass TSYNTHETIC_ENTITY_TYPE = eINSTANCE.getTSyntheticEntityType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticFeatureImpl <em>TSynthetic Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticFeatureImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticFeature()
		 * @generated
		 */
		EClass TSYNTHETIC_FEATURE = eINSTANCE.getTSyntheticFeature();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAssociationImpl <em>TSynthetic Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAssociationImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticAssociation()
		 * @generated
		 */
		EClass TSYNTHETIC_ASSOCIATION = eINSTANCE.getTSyntheticAssociation();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAttributeImpl <em>TSynthetic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAttributeImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticAttribute()
		 * @generated
		 */
		EClass TSYNTHETIC_ATTRIBUTE = eINSTANCE.getTSyntheticAttribute();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticQueryImpl <em>TSynthetic Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticQueryImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticQuery()
		 * @generated
		 */
		EClass TSYNTHETIC_QUERY = eINSTANCE.getTSyntheticQuery();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticQueryParameterImpl <em>TSynthetic Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticQueryParameterImpl
		 * @see com.mimacom.ddd.dm.base.synthetic.impl.SyntheticPackageImpl#getTSyntheticQueryParameter()
		 * @generated
		 */
		EClass TSYNTHETIC_QUERY_PARAMETER = eINSTANCE.getTSyntheticQueryParameter();

	}

} //SyntheticPackage
