/**
 */
package com.mimacom.ddd.dm.base.transpose;

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
 * @see com.mimacom.ddd.dm.base.transpose.TransposeFactory
 * @model kind="package"
 * @generated
 */
public interface TransposePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transpose";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/transpose";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "transpose";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransposePackage eINSTANCE = com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TInformationModelImpl <em>TInformation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TInformationModelImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTInformationModel()
	 * @generated
	 */
	int TINFORMATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL__NAME = BasePackage.DINFORMATION_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL__ALIASES = BasePackage.DINFORMATION_MODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL__DESCRIPTION = BasePackage.DINFORMATION_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL__AGGREGATES = BasePackage.DINFORMATION_MODEL__AGGREGATES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL__TYPES = BasePackage.DINFORMATION_MODEL__TYPES;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL__TRANSPOSED_BY = BasePackage.DINFORMATION_MODEL__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL__SYNTHETIC = BasePackage.DINFORMATION_MODEL__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Indexing Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL__INDEXING_HELPER = BasePackage.DINFORMATION_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TInformation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL_FEATURE_COUNT = BasePackage.DINFORMATION_MODEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Allows Identity Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL___ALLOWS_IDENTITY_TYPES = BasePackage.DINFORMATION_MODEL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TInformation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_MODEL_OPERATION_COUNT = BasePackage.DINFORMATION_MODEL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TTypeMappingImpl <em>TType Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TTypeMappingImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTTypeMapping()
	 * @generated
	 */
	int TTYPE_MAPPING = 1;

	/**
	 * The number of structural features of the '<em>TType Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_MAPPING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>TType Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TAggregateTranspositionImpl <em>TAggregate Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TAggregateTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTAggregateTransposition()
	 * @generated
	 */
	int TAGGREGATE_TRANSPOSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__NAME = BasePackage.DAGGREGATE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__ALIASES = BasePackage.DAGGREGATE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__DESCRIPTION = BasePackage.DAGGREGATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__TYPES = BasePackage.DAGGREGATE__TYPES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__FEATURES = BasePackage.DAGGREGATE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__NAVIGABLE_MEMBERS = BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DAGGREGATE__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__SYNTHETIC = BasePackage.DAGGREGATE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__ROOTS = BasePackage.DAGGREGATE__ROOTS;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DAGGREGATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DAGGREGATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TAggregate Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION_FEATURE_COUNT = BasePackage.DAGGREGATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TAggregate Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGREGATE_TRANSPOSITION_OPERATION_COUNT = BasePackage.DAGGREGATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.TTypeTransposition <em>TType Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.TTypeTransposition
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTTypeTransposition()
	 * @generated
	 */
	int TTYPE_TRANSPOSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_TRANSPOSITION__NAME = BasePackage.DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_TRANSPOSITION__ALIASES = BasePackage.DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_TRANSPOSITION__DESCRIPTION = BasePackage.DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TType Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_TRANSPOSITION_FEATURE_COUNT = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TType Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_TRANSPOSITION_OPERATION_COUNT = BasePackage.DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TPrimitiveTranspositionImpl <em>TPrimitive Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TPrimitiveTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTPrimitiveTransposition()
	 * @generated
	 */
	int TPRIMITIVE_TRANSPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__NAME = BasePackage.DPRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__ALIASES = BasePackage.DPRIMITIVE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__DESCRIPTION = BasePackage.DPRIMITIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DPRIMITIVE__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__SYNTHETIC = BasePackage.DPRIMITIVE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__CONSTRAINTS = BasePackage.DPRIMITIVE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__PRIMITIVE = BasePackage.DPRIMITIVE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__REDEFINES = BasePackage.DPRIMITIVE__REDEFINES;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DPRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DPRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPrimitive Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION_FEATURE_COUNT = BasePackage.DPRIMITIVE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPrimitive Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPRIMITIVE_TRANSPOSITION_OPERATION_COUNT = BasePackage.DPRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TEnumerationTranspositionImpl <em>TEnumeration Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TEnumerationTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTEnumerationTransposition()
	 * @generated
	 */
	int TENUMERATION_TRANSPOSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__NAME = BasePackage.DENUMERATION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__ALIASES = BasePackage.DENUMERATION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__DESCRIPTION = BasePackage.DENUMERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DENUMERATION__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__SYNTHETIC = BasePackage.DENUMERATION__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__CONSTRAINTS = BasePackage.DENUMERATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__PRIMITIVE = BasePackage.DENUMERATION__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__NAVIGABLE_MEMBERS = BasePackage.DENUMERATION__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__LITERALS = BasePackage.DENUMERATION__LITERALS;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DENUMERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TEnumeration Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION_FEATURE_COUNT = BasePackage.DENUMERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TEnumeration Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUMERATION_TRANSPOSITION_OPERATION_COUNT = BasePackage.DENUMERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TLiteralTranspositionImpl <em>TLiteral Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TLiteralTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTLiteralTransposition()
	 * @generated
	 */
	int TLITERAL_TRANSPOSITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__NAME = BasePackage.DLITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__ALIASES = BasePackage.DLITERAL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__DESCRIPTION = BasePackage.DLITERAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__TYPE = BasePackage.DLITERAL__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__MULTIPLICITY = BasePackage.DLITERAL__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__OPTIONAL = BasePackage.DLITERAL__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__COLLECTION = BasePackage.DLITERAL__COLLECTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DLITERAL__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__SYNTHETIC = BasePackage.DLITERAL__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DLITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DLITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TLiteral Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION_FEATURE_COUNT = BasePackage.DLITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TLiteral Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_TRANSPOSITION_OPERATION_COUNT = BasePackage.DLITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition <em>TComplex Type Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTComplexTypeTransposition()
	 * @generated
	 */
	int TCOMPLEX_TYPE_TRANSPOSITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_TRANSPOSITION__NAME = TTYPE_TRANSPOSITION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_TRANSPOSITION__ALIASES = TTYPE_TRANSPOSITION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_TRANSPOSITION__DESCRIPTION = TTYPE_TRANSPOSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_TRANSPOSITION__TRANSPOSITION_RULE = TTYPE_TRANSPOSITION__TRANSPOSITION_RULE;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = TTYPE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS;

	/**
	 * The number of structural features of the '<em>TComplex Type Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_TRANSPOSITION_FEATURE_COUNT = TTYPE_TRANSPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TComplex Type Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_TRANSPOSITION_OPERATION_COUNT = TTYPE_TRANSPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TDetailTypeTranspositionImpl <em>TDetail Type Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TDetailTypeTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTDetailTypeTransposition()
	 * @generated
	 */
	int TDETAIL_TYPE_TRANSPOSITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__NAME = BasePackage.DDETAIL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__ALIASES = BasePackage.DDETAIL_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__DESCRIPTION = BasePackage.DDETAIL_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DDETAIL_TYPE__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__SYNTHETIC = BasePackage.DDETAIL_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__CONSTRAINTS = BasePackage.DDETAIL_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__PRIMITIVE = BasePackage.DDETAIL_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__FEATURES = BasePackage.DDETAIL_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__NAVIGABLE_MEMBERS = BasePackage.DDETAIL_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__ABSTRACT = BasePackage.DDETAIL_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__SUPER_TYPE = BasePackage.DDETAIL_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TDetail Type Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION_FEATURE_COUNT = BasePackage.DDETAIL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TDetail Type Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDETAIL_TYPE_TRANSPOSITION_OPERATION_COUNT = BasePackage.DDETAIL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TEntityTypeTranspositionImpl <em>TEntity Type Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TEntityTypeTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTEntityTypeTransposition()
	 * @generated
	 */
	int TENTITY_TYPE_TRANSPOSITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__NAME = BasePackage.DENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__ALIASES = BasePackage.DENTITY_TYPE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__DESCRIPTION = BasePackage.DENTITY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DENTITY_TYPE__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__SYNTHETIC = BasePackage.DENTITY_TYPE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__CONSTRAINTS = BasePackage.DENTITY_TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__PRIMITIVE = BasePackage.DENTITY_TYPE__PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__FEATURES = BasePackage.DENTITY_TYPE__FEATURES;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__NAVIGABLE_MEMBERS = BasePackage.DENTITY_TYPE__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__ABSTRACT = BasePackage.DENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__SUPER_TYPE = BasePackage.DENTITY_TYPE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__ROOT = BasePackage.DENTITY_TYPE__ROOT;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__NATURE = BasePackage.DENTITY_TYPE__NATURE;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__STATES = BasePackage.DENTITY_TYPE__STATES;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__EVENTS = BasePackage.DENTITY_TYPE__EVENTS;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TEntity Type Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION_FEATURE_COUNT = BasePackage.DENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TEntity Type Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_TRANSPOSITION_OPERATION_COUNT = BasePackage.DENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.TFeatureTransposition <em>TFeature Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTFeatureTransposition()
	 * @generated
	 */
	int TFEATURE_TRANSPOSITION = 10;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEATURE_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.ITRANSPOSITION__TRANSPOSITION_RULE;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEATURE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.ITRANSPOSITION__IMPLIED_TRANSPOSITIONS;

	/**
	 * The number of structural features of the '<em>TFeature Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEATURE_TRANSPOSITION_FEATURE_COUNT = BasePackage.ITRANSPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TFeature Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFEATURE_TRANSPOSITION_OPERATION_COUNT = BasePackage.ITRANSPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TAssociationTranspositionImpl <em>TAssociation Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TAssociationTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTAssociationTransposition()
	 * @generated
	 */
	int TASSOCIATION_TRANSPOSITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__NAME = BasePackage.DASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__ALIASES = BasePackage.DASSOCIATION__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__DESCRIPTION = BasePackage.DASSOCIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__TYPE = BasePackage.DASSOCIATION__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__MULTIPLICITY = BasePackage.DASSOCIATION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__OPTIONAL = BasePackage.DASSOCIATION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__COLLECTION = BasePackage.DASSOCIATION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DASSOCIATION__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__SYNTHETIC = BasePackage.DASSOCIATION__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__KIND = BasePackage.DASSOCIATION__KIND;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__DERIVED = BasePackage.DASSOCIATION__DERIVED;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__SOURCE_TYPE = BasePackage.DASSOCIATION__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TAssociation Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION_FEATURE_COUNT = BasePackage.DASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Target Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION___GET_TARGET_TYPE = BasePackage.DASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TAssociation Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_TRANSPOSITION_OPERATION_COUNT = BasePackage.DASSOCIATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TAttributeTranspositionImpl <em>TAttribute Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TAttributeTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTAttributeTransposition()
	 * @generated
	 */
	int TATTRIBUTE_TRANSPOSITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__NAME = BasePackage.DATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__ALIASES = BasePackage.DATTRIBUTE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__DESCRIPTION = BasePackage.DATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__TYPE = BasePackage.DATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__MULTIPLICITY = BasePackage.DATTRIBUTE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__OPTIONAL = BasePackage.DATTRIBUTE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__COLLECTION = BasePackage.DATTRIBUTE__COLLECTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DATTRIBUTE__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__SYNTHETIC = BasePackage.DATTRIBUTE__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__DETAIL = BasePackage.DATTRIBUTE__DETAIL;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__KEY = BasePackage.DATTRIBUTE__KEY;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TAttribute Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION_FEATURE_COUNT = BasePackage.DATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TAttribute Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATTRIBUTE_TRANSPOSITION_OPERATION_COUNT = BasePackage.DATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TQueryTranspositionImpl <em>TQuery Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TQueryTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTQueryTransposition()
	 * @generated
	 */
	int TQUERY_TRANSPOSITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__NAME = BasePackage.DQUERY__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__ALIASES = BasePackage.DQUERY__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__DESCRIPTION = BasePackage.DQUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__TYPE = BasePackage.DQUERY__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__MULTIPLICITY = BasePackage.DQUERY__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__OPTIONAL = BasePackage.DQUERY__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__COLLECTION = BasePackage.DQUERY__COLLECTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DQUERY__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__SYNTHETIC = BasePackage.DQUERY__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__NAVIGABLE_MEMBERS = BasePackage.DQUERY__NAVIGABLE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__PARAMETERS = BasePackage.DQUERY__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__RETURNS = BasePackage.DQUERY__RETURNS;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DQUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DQUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TQuery Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION_FEATURE_COUNT = BasePackage.DQUERY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TQuery Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_TRANSPOSITION_OPERATION_COUNT = BasePackage.DQUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TQueryParameterTranspositionImpl <em>TQuery Parameter Transposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TQueryParameterTranspositionImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTQueryParameterTransposition()
	 * @generated
	 */
	int TQUERY_PARAMETER_TRANSPOSITION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__NAME = BasePackage.DQUERY_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__ALIASES = BasePackage.DQUERY_PARAMETER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__DESCRIPTION = BasePackage.DQUERY_PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__TYPE = BasePackage.DQUERY_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__MULTIPLICITY = BasePackage.DQUERY_PARAMETER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__OPTIONAL = BasePackage.DQUERY_PARAMETER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__COLLECTION = BasePackage.DQUERY_PARAMETER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__TRANSPOSED_BY = BasePackage.DQUERY_PARAMETER__TRANSPOSED_BY;

	/**
	 * The feature id for the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__SYNTHETIC = BasePackage.DQUERY_PARAMETER__SYNTHETIC;

	/**
	 * The feature id for the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__TRANSPOSITION_RULE = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION__IMPLIED_TRANSPOSITIONS = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TQuery Parameter Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION_FEATURE_COUNT = BasePackage.DQUERY_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TQuery Parameter Transposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUERY_PARAMETER_TRANSPOSITION_OPERATION_COUNT = BasePackage.DQUERY_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TRenameRuleImpl <em>TRename Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TRenameRuleImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTRenameRule()
	 * @generated
	 */
	int TRENAME_RULE = 15;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENAME_RULE__SOURCE = BasePackage.TTRANSPOSITION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENAME_RULE__NAMED_SOURCE = BasePackage.TTRANSPOSITION_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENAME_RULE__RENAME_TO = BasePackage.TTRANSPOSITION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRename Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENAME_RULE_FEATURE_COUNT = BasePackage.TTRANSPOSITION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TRename Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENAME_RULE_OPERATION_COUNT = BasePackage.TTRANSPOSITION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TGrabRuleImpl <em>TGrab Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TGrabRuleImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTGrabRule()
	 * @generated
	 */
	int TGRAB_RULE = 16;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_RULE__SOURCE = TRENAME_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_RULE__NAMED_SOURCE = TRENAME_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_RULE__RENAME_TO = TRENAME_RULE__RENAME_TO;

	/**
	 * The number of structural features of the '<em>TGrab Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_RULE_FEATURE_COUNT = TRENAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TGrab Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_RULE_OPERATION_COUNT = TRENAME_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TDitchRuleImpl <em>TDitch Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TDitchRuleImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTDitchRule()
	 * @generated
	 */
	int TDITCH_RULE = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDITCH_RULE__SOURCE = BasePackage.TTRANSPOSITION_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDITCH_RULE__NAMED_SOURCE = BasePackage.TTRANSPOSITION_RULE__NAMED_SOURCE;

	/**
	 * The number of structural features of the '<em>TDitch Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDITCH_RULE_FEATURE_COUNT = BasePackage.TTRANSPOSITION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TDitch Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDITCH_RULE_OPERATION_COUNT = BasePackage.TTRANSPOSITION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TStructureChangingRuleImpl <em>TStructure Changing Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TStructureChangingRuleImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTStructureChangingRule()
	 * @generated
	 */
	int TSTRUCTURE_CHANGING_RULE = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE__SOURCE = TRENAME_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE__NAMED_SOURCE = TRENAME_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE__RENAME_TO = TRENAME_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE__ABSTRACT = TRENAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY = TRENAME_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE__DETAIL = TRENAME_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE__EXTEND_FROM = TRENAME_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TStructure Changing Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE_FEATURE_COUNT = TRENAME_RULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TStructure Changing Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRUCTURE_CHANGING_RULE_OPERATION_COUNT = TRENAME_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TMorphRuleImpl <em>TMorph Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TMorphRuleImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTMorphRule()
	 * @generated
	 */
	int TMORPH_RULE = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__SOURCE = TSTRUCTURE_CHANGING_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__NAMED_SOURCE = TSTRUCTURE_CHANGING_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__RENAME_TO = TSTRUCTURE_CHANGING_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__ABSTRACT = TSTRUCTURE_CHANGING_RULE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__ROOT_ENTITY = TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__DETAIL = TSTRUCTURE_CHANGING_RULE__DETAIL;

	/**
	 * The feature id for the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__EXTEND_FROM = TSTRUCTURE_CHANGING_RULE__EXTEND_FROM;

	/**
	 * The feature id for the '<em><b>Retype To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__RETYPE_TO = TSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remultiply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE__REMULTIPLY_TO = TSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMorph Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE_FEATURE_COUNT = TSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMorph Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMORPH_RULE_OPERATION_COUNT = TSTRUCTURE_CHANGING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TFuseRuleImpl <em>TFuse Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TFuseRuleImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTFuseRule()
	 * @generated
	 */
	int TFUSE_RULE = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE__SOURCE = TSTRUCTURE_CHANGING_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE__NAMED_SOURCE = TSTRUCTURE_CHANGING_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE__RENAME_TO = TSTRUCTURE_CHANGING_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE__ABSTRACT = TSTRUCTURE_CHANGING_RULE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Root Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE__ROOT_ENTITY = TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE__DETAIL = TSTRUCTURE_CHANGING_RULE__DETAIL;

	/**
	 * The feature id for the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE__EXTEND_FROM = TSTRUCTURE_CHANGING_RULE__EXTEND_FROM;

	/**
	 * The feature id for the '<em><b>Other Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE__OTHER_SOURCES = TSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TFuse Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE_FEATURE_COUNT = TSTRUCTURE_CHANGING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TFuse Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUSE_RULE_OPERATION_COUNT = TSTRUCTURE_CHANGING_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TGrabAggregateRuleImpl <em>TGrab Aggregate Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TGrabAggregateRuleImpl
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTGrabAggregateRule()
	 * @generated
	 */
	int TGRAB_AGGREGATE_RULE = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_AGGREGATE_RULE__SOURCE = TRENAME_RULE__SOURCE;

	/**
	 * The feature id for the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_AGGREGATE_RULE__NAMED_SOURCE = TRENAME_RULE__NAMED_SOURCE;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_AGGREGATE_RULE__RENAME_TO = TRENAME_RULE__RENAME_TO;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_AGGREGATE_RULE__AGGREGATE = TRENAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGrab Aggregate Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_AGGREGATE_RULE_FEATURE_COUNT = TRENAME_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGrab Aggregate Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGRAB_AGGREGATE_RULE_OPERATION_COUNT = TRENAME_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.base.transpose.TTristate <em>TTristate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.base.transpose.TTristate
	 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTTristate()
	 * @generated
	 */
	int TTRISTATE = 22;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TInformationModel <em>TInformation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInformation Model</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TInformationModel
	 * @generated
	 */
	EClass getTInformationModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.transpose.TInformationModel#getIndexingHelper <em>Indexing Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indexing Helper</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TInformationModel#getIndexingHelper()
	 * @see #getTInformationModel()
	 * @generated
	 */
	EReference getTInformationModel_IndexingHelper();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.dm.base.transpose.TInformationModel#allowsIdentityTypes() <em>Allows Identity Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allows Identity Types</em>' operation.
	 * @see com.mimacom.ddd.dm.base.transpose.TInformationModel#allowsIdentityTypes()
	 * @generated
	 */
	EOperation getTInformationModel__AllowsIdentityTypes();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TTypeMapping <em>TType Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TType Mapping</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TTypeMapping
	 * @generated
	 */
	EClass getTTypeMapping();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TAggregateTransposition <em>TAggregate Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAggregate Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
	 * @generated
	 */
	EClass getTAggregateTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TTypeTransposition <em>TType Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TType Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TTypeTransposition
	 * @generated
	 */
	EClass getTTypeTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition <em>TPrimitive Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPrimitive Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition
	 * @generated
	 */
	EClass getTPrimitiveTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition <em>TEnumeration Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnumeration Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition
	 * @generated
	 */
	EClass getTEnumerationTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TLiteralTransposition <em>TLiteral Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLiteral Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TLiteralTransposition
	 * @generated
	 */
	EClass getTLiteralTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition <em>TComplex Type Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TComplex Type Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition
	 * @generated
	 */
	EClass getTComplexTypeTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TDetailTypeTransposition <em>TDetail Type Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDetail Type Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TDetailTypeTransposition
	 * @generated
	 */
	EClass getTDetailTypeTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition <em>TEntity Type Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Type Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition
	 * @generated
	 */
	EClass getTEntityTypeTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TFeatureTransposition <em>TFeature Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFeature Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
	 * @generated
	 */
	EClass getTFeatureTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TAssociationTransposition <em>TAssociation Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAssociation Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TAssociationTransposition
	 * @generated
	 */
	EClass getTAssociationTransposition();

	/**
	 * Returns the meta object for the '{@link com.mimacom.ddd.dm.base.transpose.TAssociationTransposition#getTargetType() <em>Get Target Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Type</em>' operation.
	 * @see com.mimacom.ddd.dm.base.transpose.TAssociationTransposition#getTargetType()
	 * @generated
	 */
	EOperation getTAssociationTransposition__GetTargetType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TAttributeTransposition <em>TAttribute Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAttribute Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TAttributeTransposition
	 * @generated
	 */
	EClass getTAttributeTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TQueryTransposition <em>TQuery Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TQuery Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TQueryTransposition
	 * @generated
	 */
	EClass getTQueryTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition <em>TQuery Parameter Transposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TQuery Parameter Transposition</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition
	 * @generated
	 */
	EClass getTQueryParameterTransposition();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TRenameRule <em>TRename Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRename Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TRenameRule
	 * @generated
	 */
	EClass getTRenameRule();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.transpose.TRenameRule#getRenameTo <em>Rename To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename To</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TRenameRule#getRenameTo()
	 * @see #getTRenameRule()
	 * @generated
	 */
	EAttribute getTRenameRule_RenameTo();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TGrabRule <em>TGrab Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGrab Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TGrabRule
	 * @generated
	 */
	EClass getTGrabRule();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TDitchRule <em>TDitch Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDitch Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TDitchRule
	 * @generated
	 */
	EClass getTDitchRule();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule <em>TStructure Changing Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TStructure Changing Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TStructureChangingRule
	 * @generated
	 */
	EClass getTStructureChangingRule();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getAbstract()
	 * @see #getTStructureChangingRule()
	 * @generated
	 */
	EAttribute getTStructureChangingRule_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getRootEntity <em>Root Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Entity</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getRootEntity()
	 * @see #getTStructureChangingRule()
	 * @generated
	 */
	EAttribute getTStructureChangingRule_RootEntity();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getDetail()
	 * @see #getTStructureChangingRule()
	 * @generated
	 */
	EAttribute getTStructureChangingRule_Detail();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getExtendFrom <em>Extend From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extend From</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getExtendFrom()
	 * @see #getTStructureChangingRule()
	 * @generated
	 */
	EReference getTStructureChangingRule_ExtendFrom();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TMorphRule <em>TMorph Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMorph Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TMorphRule
	 * @generated
	 */
	EClass getTMorphRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.transpose.TMorphRule#getRetypeTo <em>Retype To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Retype To</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TMorphRule#getRetypeTo()
	 * @see #getTMorphRule()
	 * @generated
	 */
	EReference getTMorphRule_RetypeTo();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.base.transpose.TMorphRule#getRemultiplyTo <em>Remultiply To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remultiply To</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TMorphRule#getRemultiplyTo()
	 * @see #getTMorphRule()
	 * @generated
	 */
	EReference getTMorphRule_RemultiplyTo();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TFuseRule <em>TFuse Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFuse Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TFuseRule
	 * @generated
	 */
	EClass getTFuseRule();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.dm.base.transpose.TFuseRule#getOtherSources <em>Other Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Other Sources</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TFuseRule#getOtherSources()
	 * @see #getTFuseRule()
	 * @generated
	 */
	EReference getTFuseRule_OtherSources();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule <em>TGrab Aggregate Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGrab Aggregate Rule</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule
	 * @generated
	 */
	EClass getTGrabAggregateRule();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule#getAggregate()
	 * @see #getTGrabAggregateRule()
	 * @generated
	 */
	EReference getTGrabAggregateRule_Aggregate();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.base.transpose.TTristate <em>TTristate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TTristate</em>'.
	 * @see com.mimacom.ddd.dm.base.transpose.TTristate
	 * @generated
	 */
	EEnum getTTristate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransposeFactory getTransposeFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TInformationModelImpl <em>TInformation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TInformationModelImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTInformationModel()
		 * @generated
		 */
		EClass TINFORMATION_MODEL = eINSTANCE.getTInformationModel();

		/**
		 * The meta object literal for the '<em><b>Indexing Helper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINFORMATION_MODEL__INDEXING_HELPER = eINSTANCE.getTInformationModel_IndexingHelper();

		/**
		 * The meta object literal for the '<em><b>Allows Identity Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TINFORMATION_MODEL___ALLOWS_IDENTITY_TYPES = eINSTANCE.getTInformationModel__AllowsIdentityTypes();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TTypeMappingImpl <em>TType Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TTypeMappingImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTTypeMapping()
		 * @generated
		 */
		EClass TTYPE_MAPPING = eINSTANCE.getTTypeMapping();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TAggregateTranspositionImpl <em>TAggregate Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TAggregateTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTAggregateTransposition()
		 * @generated
		 */
		EClass TAGGREGATE_TRANSPOSITION = eINSTANCE.getTAggregateTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.TTypeTransposition <em>TType Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.TTypeTransposition
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTTypeTransposition()
		 * @generated
		 */
		EClass TTYPE_TRANSPOSITION = eINSTANCE.getTTypeTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TPrimitiveTranspositionImpl <em>TPrimitive Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TPrimitiveTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTPrimitiveTransposition()
		 * @generated
		 */
		EClass TPRIMITIVE_TRANSPOSITION = eINSTANCE.getTPrimitiveTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TEnumerationTranspositionImpl <em>TEnumeration Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TEnumerationTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTEnumerationTransposition()
		 * @generated
		 */
		EClass TENUMERATION_TRANSPOSITION = eINSTANCE.getTEnumerationTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TLiteralTranspositionImpl <em>TLiteral Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TLiteralTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTLiteralTransposition()
		 * @generated
		 */
		EClass TLITERAL_TRANSPOSITION = eINSTANCE.getTLiteralTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition <em>TComplex Type Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTComplexTypeTransposition()
		 * @generated
		 */
		EClass TCOMPLEX_TYPE_TRANSPOSITION = eINSTANCE.getTComplexTypeTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TDetailTypeTranspositionImpl <em>TDetail Type Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TDetailTypeTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTDetailTypeTransposition()
		 * @generated
		 */
		EClass TDETAIL_TYPE_TRANSPOSITION = eINSTANCE.getTDetailTypeTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TEntityTypeTranspositionImpl <em>TEntity Type Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TEntityTypeTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTEntityTypeTransposition()
		 * @generated
		 */
		EClass TENTITY_TYPE_TRANSPOSITION = eINSTANCE.getTEntityTypeTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.TFeatureTransposition <em>TFeature Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTFeatureTransposition()
		 * @generated
		 */
		EClass TFEATURE_TRANSPOSITION = eINSTANCE.getTFeatureTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TAssociationTranspositionImpl <em>TAssociation Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TAssociationTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTAssociationTransposition()
		 * @generated
		 */
		EClass TASSOCIATION_TRANSPOSITION = eINSTANCE.getTAssociationTransposition();

		/**
		 * The meta object literal for the '<em><b>Get Target Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASSOCIATION_TRANSPOSITION___GET_TARGET_TYPE = eINSTANCE.getTAssociationTransposition__GetTargetType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TAttributeTranspositionImpl <em>TAttribute Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TAttributeTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTAttributeTransposition()
		 * @generated
		 */
		EClass TATTRIBUTE_TRANSPOSITION = eINSTANCE.getTAttributeTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TQueryTranspositionImpl <em>TQuery Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TQueryTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTQueryTransposition()
		 * @generated
		 */
		EClass TQUERY_TRANSPOSITION = eINSTANCE.getTQueryTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TQueryParameterTranspositionImpl <em>TQuery Parameter Transposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TQueryParameterTranspositionImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTQueryParameterTransposition()
		 * @generated
		 */
		EClass TQUERY_PARAMETER_TRANSPOSITION = eINSTANCE.getTQueryParameterTransposition();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TRenameRuleImpl <em>TRename Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TRenameRuleImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTRenameRule()
		 * @generated
		 */
		EClass TRENAME_RULE = eINSTANCE.getTRenameRule();

		/**
		 * The meta object literal for the '<em><b>Rename To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRENAME_RULE__RENAME_TO = eINSTANCE.getTRenameRule_RenameTo();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TGrabRuleImpl <em>TGrab Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TGrabRuleImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTGrabRule()
		 * @generated
		 */
		EClass TGRAB_RULE = eINSTANCE.getTGrabRule();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TDitchRuleImpl <em>TDitch Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TDitchRuleImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTDitchRule()
		 * @generated
		 */
		EClass TDITCH_RULE = eINSTANCE.getTDitchRule();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TStructureChangingRuleImpl <em>TStructure Changing Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TStructureChangingRuleImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTStructureChangingRule()
		 * @generated
		 */
		EClass TSTRUCTURE_CHANGING_RULE = eINSTANCE.getTStructureChangingRule();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTRUCTURE_CHANGING_RULE__ABSTRACT = eINSTANCE.getTStructureChangingRule_Abstract();

		/**
		 * The meta object literal for the '<em><b>Root Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY = eINSTANCE.getTStructureChangingRule_RootEntity();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTRUCTURE_CHANGING_RULE__DETAIL = eINSTANCE.getTStructureChangingRule_Detail();

		/**
		 * The meta object literal for the '<em><b>Extend From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSTRUCTURE_CHANGING_RULE__EXTEND_FROM = eINSTANCE.getTStructureChangingRule_ExtendFrom();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TMorphRuleImpl <em>TMorph Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TMorphRuleImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTMorphRule()
		 * @generated
		 */
		EClass TMORPH_RULE = eINSTANCE.getTMorphRule();

		/**
		 * The meta object literal for the '<em><b>Retype To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMORPH_RULE__RETYPE_TO = eINSTANCE.getTMorphRule_RetypeTo();

		/**
		 * The meta object literal for the '<em><b>Remultiply To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMORPH_RULE__REMULTIPLY_TO = eINSTANCE.getTMorphRule_RemultiplyTo();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TFuseRuleImpl <em>TFuse Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TFuseRuleImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTFuseRule()
		 * @generated
		 */
		EClass TFUSE_RULE = eINSTANCE.getTFuseRule();

		/**
		 * The meta object literal for the '<em><b>Other Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFUSE_RULE__OTHER_SOURCES = eINSTANCE.getTFuseRule_OtherSources();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.impl.TGrabAggregateRuleImpl <em>TGrab Aggregate Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TGrabAggregateRuleImpl
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTGrabAggregateRule()
		 * @generated
		 */
		EClass TGRAB_AGGREGATE_RULE = eINSTANCE.getTGrabAggregateRule();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGRAB_AGGREGATE_RULE__AGGREGATE = eINSTANCE.getTGrabAggregateRule_Aggregate();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.base.transpose.TTristate <em>TTristate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.base.transpose.TTristate
		 * @see com.mimacom.ddd.dm.base.transpose.impl.TransposePackageImpl#getTTristate()
		 * @generated
		 */
		EEnum TTRISTATE = eINSTANCE.getTTristate();

	}

} //TransposePackage
