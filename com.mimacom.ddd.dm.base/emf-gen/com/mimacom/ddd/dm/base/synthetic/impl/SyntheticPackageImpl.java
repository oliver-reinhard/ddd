/**
 */
package com.mimacom.ddd.dm.base.synthetic.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory;
import com.mimacom.ddd.dm.base.synthetic.SyntheticPackage;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAssociation;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAttribute;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticComplexType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticDetailType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEntityType;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticFeature;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticLiteral;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQuery;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQueryParameter;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticType;

import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyntheticPackageImpl extends EPackageImpl implements SyntheticPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticAggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticDetailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSyntheticQueryParameterEClass = null;

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
	 * @see com.mimacom.ddd.dm.base.synthetic.SyntheticPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SyntheticPackageImpl()
	{
		super(eNS_URI, SyntheticFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SyntheticPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SyntheticPackage init()
	{
		if (isInited) return (SyntheticPackage)EPackage.Registry.INSTANCE.getEPackage(SyntheticPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSyntheticPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SyntheticPackageImpl theSyntheticPackage = registeredSyntheticPackage instanceof SyntheticPackageImpl ? (SyntheticPackageImpl)registeredSyntheticPackage : new SyntheticPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		TransposePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSyntheticPackage.createPackageContents();

		// Initialize created meta-data
		theSyntheticPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSyntheticPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SyntheticPackage.eNS_URI, theSyntheticPackage);
		return theSyntheticPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticAggregate()
	{
		return tSyntheticAggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticType()
	{
		return tSyntheticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticPrimitive()
	{
		return tSyntheticPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticEnumeration()
	{
		return tSyntheticEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticLiteral()
	{
		return tSyntheticLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticComplexType()
	{
		return tSyntheticComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticDetailType()
	{
		return tSyntheticDetailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticEntityType()
	{
		return tSyntheticEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticFeature()
	{
		return tSyntheticFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticAssociation()
	{
		return tSyntheticAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticAttribute()
	{
		return tSyntheticAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticQuery()
	{
		return tSyntheticQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSyntheticQueryParameter()
	{
		return tSyntheticQueryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyntheticFactory getSyntheticFactory()
	{
		return (SyntheticFactory)getEFactoryInstance();
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
		tSyntheticAggregateEClass = createEClass(TSYNTHETIC_AGGREGATE);

		tSyntheticTypeEClass = createEClass(TSYNTHETIC_TYPE);

		tSyntheticPrimitiveEClass = createEClass(TSYNTHETIC_PRIMITIVE);

		tSyntheticEnumerationEClass = createEClass(TSYNTHETIC_ENUMERATION);

		tSyntheticLiteralEClass = createEClass(TSYNTHETIC_LITERAL);

		tSyntheticComplexTypeEClass = createEClass(TSYNTHETIC_COMPLEX_TYPE);

		tSyntheticDetailTypeEClass = createEClass(TSYNTHETIC_DETAIL_TYPE);

		tSyntheticEntityTypeEClass = createEClass(TSYNTHETIC_ENTITY_TYPE);

		tSyntheticFeatureEClass = createEClass(TSYNTHETIC_FEATURE);

		tSyntheticAssociationEClass = createEClass(TSYNTHETIC_ASSOCIATION);

		tSyntheticAttributeEClass = createEClass(TSYNTHETIC_ATTRIBUTE);

		tSyntheticQueryEClass = createEClass(TSYNTHETIC_QUERY);

		tSyntheticQueryParameterEClass = createEClass(TSYNTHETIC_QUERY_PARAMETER);
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
		TransposePackage theTransposePackage = (TransposePackage)EPackage.Registry.INSTANCE.getEPackage(TransposePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tSyntheticAggregateEClass.getESuperTypes().add(theBasePackage.getDAggregate());
		tSyntheticAggregateEClass.getESuperTypes().add(theTransposePackage.getISyntheticElement());
		tSyntheticTypeEClass.getESuperTypes().add(theBasePackage.getDType());
		tSyntheticTypeEClass.getESuperTypes().add(theTransposePackage.getISyntheticElement());
		tSyntheticPrimitiveEClass.getESuperTypes().add(theBasePackage.getDPrimitive());
		tSyntheticPrimitiveEClass.getESuperTypes().add(this.getTSyntheticType());
		tSyntheticEnumerationEClass.getESuperTypes().add(theBasePackage.getDEnumeration());
		tSyntheticEnumerationEClass.getESuperTypes().add(this.getTSyntheticType());
		tSyntheticLiteralEClass.getESuperTypes().add(theBasePackage.getDLiteral());
		tSyntheticLiteralEClass.getESuperTypes().add(theTransposePackage.getISyntheticElement());
		tSyntheticComplexTypeEClass.getESuperTypes().add(theBasePackage.getDComplexType());
		tSyntheticComplexTypeEClass.getESuperTypes().add(this.getTSyntheticType());
		tSyntheticDetailTypeEClass.getESuperTypes().add(theBasePackage.getDDetailType());
		tSyntheticDetailTypeEClass.getESuperTypes().add(this.getTSyntheticComplexType());
		tSyntheticEntityTypeEClass.getESuperTypes().add(theBasePackage.getDEntityType());
		tSyntheticEntityTypeEClass.getESuperTypes().add(this.getTSyntheticComplexType());
		tSyntheticFeatureEClass.getESuperTypes().add(theBasePackage.getDFeature());
		tSyntheticFeatureEClass.getESuperTypes().add(theTransposePackage.getISyntheticElement());
		tSyntheticAssociationEClass.getESuperTypes().add(theBasePackage.getDAssociation());
		tSyntheticAssociationEClass.getESuperTypes().add(this.getTSyntheticFeature());
		tSyntheticAttributeEClass.getESuperTypes().add(theBasePackage.getDAttribute());
		tSyntheticAttributeEClass.getESuperTypes().add(this.getTSyntheticFeature());
		tSyntheticQueryEClass.getESuperTypes().add(theBasePackage.getDQuery());
		tSyntheticQueryEClass.getESuperTypes().add(this.getTSyntheticFeature());
		tSyntheticQueryParameterEClass.getESuperTypes().add(theBasePackage.getDQueryParameter());
		tSyntheticQueryParameterEClass.getESuperTypes().add(theTransposePackage.getISyntheticElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tSyntheticAggregateEClass, TSyntheticAggregate.class, "TSyntheticAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticTypeEClass, TSyntheticType.class, "TSyntheticType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticPrimitiveEClass, TSyntheticPrimitive.class, "TSyntheticPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticEnumerationEClass, TSyntheticEnumeration.class, "TSyntheticEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticLiteralEClass, TSyntheticLiteral.class, "TSyntheticLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticComplexTypeEClass, TSyntheticComplexType.class, "TSyntheticComplexType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticDetailTypeEClass, TSyntheticDetailType.class, "TSyntheticDetailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticEntityTypeEClass, TSyntheticEntityType.class, "TSyntheticEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticFeatureEClass, TSyntheticFeature.class, "TSyntheticFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticAssociationEClass, TSyntheticAssociation.class, "TSyntheticAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticAttributeEClass, TSyntheticAttribute.class, "TSyntheticAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticQueryEClass, TSyntheticQuery.class, "TSyntheticQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tSyntheticQueryParameterEClass, TSyntheticQueryParameter.class, "TSyntheticQueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SyntheticPackageImpl
