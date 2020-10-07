/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TAssociationTransposition;
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition;
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TDetailTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TDitchRule;
import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition;
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition;
import com.mimacom.ddd.dm.base.transpose.TFuseRule;
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule;
import com.mimacom.ddd.dm.base.transpose.TGrabRule;
import com.mimacom.ddd.dm.base.transpose.TInformationModel;
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition;
import com.mimacom.ddd.dm.base.transpose.TMorphRule;
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition;
import com.mimacom.ddd.dm.base.transpose.TRenameRule;
import com.mimacom.ddd.dm.base.transpose.TStructureChangingRule;
import com.mimacom.ddd.dm.base.transpose.TTristate;
import com.mimacom.ddd.dm.base.transpose.TTypeMapping;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
import com.mimacom.ddd.dm.base.transpose.TransposeFactory;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransposePackageImpl extends EPackageImpl implements TransposePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInformationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTypeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAggregateTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTypeTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPrimitiveTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEnumerationTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tLiteralTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tComplexTypeTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDetailTypeTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEntityTypeTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFeatureTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAssociationTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAttributeTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tQueryTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tQueryParameterTranspositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRenameRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tGrabRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDitchRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tStructureChangingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMorphRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFuseRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tGrabAggregateRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tTristateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransposePackageImpl()
	{
		super(eNS_URI, TransposeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TransposePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransposePackage init()
	{
		if (isInited) return (TransposePackage)EPackage.Registry.INSTANCE.getEPackage(TransposePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTransposePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TransposePackageImpl theTransposePackage = registeredTransposePackage instanceof TransposePackageImpl ? (TransposePackageImpl)registeredTransposePackage : new TransposePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTransposePackage.createPackageContents();

		// Initialize created meta-data
		theTransposePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransposePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransposePackage.eNS_URI, theTransposePackage);
		return theTransposePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInformationModel()
	{
		return tInformationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInformationModel_IndexingHelper()
	{
		return (EReference)tInformationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTInformationModel__AllowsIdentityTypes()
	{
		return tInformationModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTypeMapping()
	{
		return tTypeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAggregateTransposition()
	{
		return tAggregateTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTypeTransposition()
	{
		return tTypeTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPrimitiveTransposition()
	{
		return tPrimitiveTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEnumerationTransposition()
	{
		return tEnumerationTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLiteralTransposition()
	{
		return tLiteralTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTComplexTypeTransposition()
	{
		return tComplexTypeTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDetailTypeTransposition()
	{
		return tDetailTypeTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEntityTypeTransposition()
	{
		return tEntityTypeTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFeatureTransposition()
	{
		return tFeatureTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAssociationTransposition()
	{
		return tAssociationTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTAssociationTransposition__GetTargetType()
	{
		return tAssociationTranspositionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAttributeTransposition()
	{
		return tAttributeTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTQueryTransposition()
	{
		return tQueryTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTQueryParameterTransposition()
	{
		return tQueryParameterTranspositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRenameRule()
	{
		return tRenameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRenameRule_RenameTo()
	{
		return (EAttribute)tRenameRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTGrabRule()
	{
		return tGrabRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDitchRule()
	{
		return tDitchRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTStructureChangingRule()
	{
		return tStructureChangingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTStructureChangingRule_Abstract()
	{
		return (EAttribute)tStructureChangingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTStructureChangingRule_RootEntity()
	{
		return (EAttribute)tStructureChangingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTStructureChangingRule_Detail()
	{
		return (EAttribute)tStructureChangingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTStructureChangingRule_ExtendFrom()
	{
		return (EReference)tStructureChangingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMorphRule()
	{
		return tMorphRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMorphRule_RetypeTo()
	{
		return (EReference)tMorphRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTMorphRule_RemultiplyTo()
	{
		return (EReference)tMorphRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFuseRule()
	{
		return tFuseRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFuseRule_OtherSources()
	{
		return (EReference)tFuseRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTGrabAggregateRule()
	{
		return tGrabAggregateRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTGrabAggregateRule_Aggregate()
	{
		return (EReference)tGrabAggregateRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTTristate()
	{
		return tTristateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransposeFactory getTransposeFactory()
	{
		return (TransposeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tInformationModelEClass = createEClass(TINFORMATION_MODEL);
		createEReference(tInformationModelEClass, TINFORMATION_MODEL__INDEXING_HELPER);
		createEOperation(tInformationModelEClass, TINFORMATION_MODEL___ALLOWS_IDENTITY_TYPES);

		tTypeMappingEClass = createEClass(TTYPE_MAPPING);

		tAggregateTranspositionEClass = createEClass(TAGGREGATE_TRANSPOSITION);

		tTypeTranspositionEClass = createEClass(TTYPE_TRANSPOSITION);

		tPrimitiveTranspositionEClass = createEClass(TPRIMITIVE_TRANSPOSITION);

		tEnumerationTranspositionEClass = createEClass(TENUMERATION_TRANSPOSITION);

		tLiteralTranspositionEClass = createEClass(TLITERAL_TRANSPOSITION);

		tComplexTypeTranspositionEClass = createEClass(TCOMPLEX_TYPE_TRANSPOSITION);

		tDetailTypeTranspositionEClass = createEClass(TDETAIL_TYPE_TRANSPOSITION);

		tEntityTypeTranspositionEClass = createEClass(TENTITY_TYPE_TRANSPOSITION);

		tFeatureTranspositionEClass = createEClass(TFEATURE_TRANSPOSITION);

		tAssociationTranspositionEClass = createEClass(TASSOCIATION_TRANSPOSITION);
		createEOperation(tAssociationTranspositionEClass, TASSOCIATION_TRANSPOSITION___GET_TARGET_TYPE);

		tAttributeTranspositionEClass = createEClass(TATTRIBUTE_TRANSPOSITION);

		tQueryTranspositionEClass = createEClass(TQUERY_TRANSPOSITION);

		tQueryParameterTranspositionEClass = createEClass(TQUERY_PARAMETER_TRANSPOSITION);

		tRenameRuleEClass = createEClass(TRENAME_RULE);
		createEAttribute(tRenameRuleEClass, TRENAME_RULE__RENAME_TO);

		tGrabRuleEClass = createEClass(TGRAB_RULE);

		tDitchRuleEClass = createEClass(TDITCH_RULE);

		tStructureChangingRuleEClass = createEClass(TSTRUCTURE_CHANGING_RULE);
		createEAttribute(tStructureChangingRuleEClass, TSTRUCTURE_CHANGING_RULE__ABSTRACT);
		createEAttribute(tStructureChangingRuleEClass, TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY);
		createEAttribute(tStructureChangingRuleEClass, TSTRUCTURE_CHANGING_RULE__DETAIL);
		createEReference(tStructureChangingRuleEClass, TSTRUCTURE_CHANGING_RULE__EXTEND_FROM);

		tMorphRuleEClass = createEClass(TMORPH_RULE);
		createEReference(tMorphRuleEClass, TMORPH_RULE__RETYPE_TO);
		createEReference(tMorphRuleEClass, TMORPH_RULE__REMULTIPLY_TO);

		tFuseRuleEClass = createEClass(TFUSE_RULE);
		createEReference(tFuseRuleEClass, TFUSE_RULE__OTHER_SOURCES);

		tGrabAggregateRuleEClass = createEClass(TGRAB_AGGREGATE_RULE);
		createEReference(tGrabAggregateRuleEClass, TGRAB_AGGREGATE_RULE__AGGREGATE);

		// Create enums
		tTristateEEnum = createEEnum(TTRISTATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tInformationModelEClass.getESuperTypes().add(theBasePackage.getDInformationModel());
		tAggregateTranspositionEClass.getESuperTypes().add(theBasePackage.getDAggregate());
		tAggregateTranspositionEClass.getESuperTypes().add(theBasePackage.getITransposition());
		tTypeTranspositionEClass.getESuperTypes().add(theBasePackage.getDNamedElement());
		tTypeTranspositionEClass.getESuperTypes().add(theBasePackage.getITransposition());
		tPrimitiveTranspositionEClass.getESuperTypes().add(theBasePackage.getDPrimitive());
		tPrimitiveTranspositionEClass.getESuperTypes().add(this.getTTypeTransposition());
		tEnumerationTranspositionEClass.getESuperTypes().add(theBasePackage.getDEnumeration());
		tEnumerationTranspositionEClass.getESuperTypes().add(this.getTTypeTransposition());
		tLiteralTranspositionEClass.getESuperTypes().add(theBasePackage.getDLiteral());
		tLiteralTranspositionEClass.getESuperTypes().add(theBasePackage.getITransposition());
		tComplexTypeTranspositionEClass.getESuperTypes().add(this.getTTypeTransposition());
		tDetailTypeTranspositionEClass.getESuperTypes().add(theBasePackage.getDDetailType());
		tDetailTypeTranspositionEClass.getESuperTypes().add(this.getTComplexTypeTransposition());
		tEntityTypeTranspositionEClass.getESuperTypes().add(theBasePackage.getDEntityType());
		tEntityTypeTranspositionEClass.getESuperTypes().add(this.getTComplexTypeTransposition());
		tFeatureTranspositionEClass.getESuperTypes().add(theBasePackage.getITransposition());
		tAssociationTranspositionEClass.getESuperTypes().add(theBasePackage.getDAssociation());
		tAssociationTranspositionEClass.getESuperTypes().add(this.getTFeatureTransposition());
		tAttributeTranspositionEClass.getESuperTypes().add(theBasePackage.getDAttribute());
		tAttributeTranspositionEClass.getESuperTypes().add(this.getTFeatureTransposition());
		tQueryTranspositionEClass.getESuperTypes().add(theBasePackage.getDQuery());
		tQueryTranspositionEClass.getESuperTypes().add(this.getTFeatureTransposition());
		tQueryParameterTranspositionEClass.getESuperTypes().add(theBasePackage.getDQueryParameter());
		tQueryParameterTranspositionEClass.getESuperTypes().add(theBasePackage.getITransposition());
		tRenameRuleEClass.getESuperTypes().add(theBasePackage.getTTranspositionRule());
		tGrabRuleEClass.getESuperTypes().add(this.getTRenameRule());
		tDitchRuleEClass.getESuperTypes().add(theBasePackage.getTTranspositionRule());
		tStructureChangingRuleEClass.getESuperTypes().add(this.getTRenameRule());
		tMorphRuleEClass.getESuperTypes().add(this.getTStructureChangingRule());
		tFuseRuleEClass.getESuperTypes().add(this.getTStructureChangingRule());
		tGrabAggregateRuleEClass.getESuperTypes().add(this.getTRenameRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(tInformationModelEClass, TInformationModel.class, "TInformationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInformationModel_IndexingHelper(), this.getTTypeMapping(), null, "indexingHelper", null, 0, 1, TInformationModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTInformationModel__AllowsIdentityTypes(), ecorePackage.getEBoolean(), "allowsIdentityTypes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tTypeMappingEClass, TTypeMapping.class, "TTypeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tAggregateTranspositionEClass, TAggregateTransposition.class, "TAggregateTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tTypeTranspositionEClass, TTypeTransposition.class, "TTypeTransposition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tPrimitiveTranspositionEClass, TPrimitiveTransposition.class, "TPrimitiveTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tEnumerationTranspositionEClass, TEnumerationTransposition.class, "TEnumerationTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tLiteralTranspositionEClass, TLiteralTransposition.class, "TLiteralTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tComplexTypeTranspositionEClass, TComplexTypeTransposition.class, "TComplexTypeTransposition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tDetailTypeTranspositionEClass, TDetailTypeTransposition.class, "TDetailTypeTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tEntityTypeTranspositionEClass, TEntityTypeTransposition.class, "TEntityTypeTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tFeatureTranspositionEClass, TFeatureTransposition.class, "TFeatureTransposition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tAssociationTranspositionEClass, TAssociationTransposition.class, "TAssociationTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getTAssociationTransposition__GetTargetType(), this.getTEntityTypeTransposition(), "getTargetType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tAttributeTranspositionEClass, TAttributeTransposition.class, "TAttributeTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tQueryTranspositionEClass, TQueryTransposition.class, "TQueryTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tQueryParameterTranspositionEClass, TQueryParameterTransposition.class, "TQueryParameterTransposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tRenameRuleEClass, TRenameRule.class, "TRenameRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRenameRule_RenameTo(), ecorePackage.getEString(), "renameTo", null, 0, 1, TRenameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tGrabRuleEClass, TGrabRule.class, "TGrabRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tDitchRuleEClass, TDitchRule.class, "TDitchRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tStructureChangingRuleEClass, TStructureChangingRule.class, "TStructureChangingRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTStructureChangingRule_Abstract(), this.getTTristate(), "abstract", null, 0, 1, TStructureChangingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTStructureChangingRule_RootEntity(), this.getTTristate(), "rootEntity", null, 0, 1, TStructureChangingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTStructureChangingRule_Detail(), this.getTTristate(), "detail", null, 0, 1, TStructureChangingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTStructureChangingRule_ExtendFrom(), theBasePackage.getDType(), null, "extendFrom", null, 0, 1, TStructureChangingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMorphRuleEClass, TMorphRule.class, "TMorphRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMorphRule_RetypeTo(), theBasePackage.getDType(), null, "retypeTo", null, 0, 1, TMorphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMorphRule_RemultiplyTo(), theBasePackage.getDMultiplicity(), null, "remultiplyTo", null, 0, 1, TMorphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFuseRuleEClass, TFuseRule.class, "TFuseRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFuseRule_OtherSources(), theBasePackage.getDNamedElement(), null, "otherSources", null, 0, -1, TFuseRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tGrabAggregateRuleEClass, TGrabAggregateRule.class, "TGrabAggregateRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTGrabAggregateRule_Aggregate(), theBasePackage.getDAggregate(), null, "aggregate", null, 0, 1, TGrabAggregateRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tTristateEEnum, TTristate.class, "TTristate");
		addEEnumLiteral(tTristateEEnum, TTristate.DONT_CARE);
		addEEnumLiteral(tTristateEEnum, TTristate.FALSE);
		addEEnumLiteral(tTristateEEnum, TTristate.TRUE);

		// Create resource
		createResource(eNS_URI);
	}

} //TransposePackageImpl
