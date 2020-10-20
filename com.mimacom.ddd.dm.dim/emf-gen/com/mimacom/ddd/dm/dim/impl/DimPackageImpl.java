/**
 */
package com.mimacom.ddd.dm.dim.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import com.mimacom.ddd.dm.dim.DimAggregate;
import com.mimacom.ddd.dm.dim.DimAssociation;
import com.mimacom.ddd.dm.dim.DimAttribute;
import com.mimacom.ddd.dm.dim.DimComplexType;
import com.mimacom.ddd.dm.dim.DimDetailType;
import com.mimacom.ddd.dm.dim.DimEntityType;
import com.mimacom.ddd.dm.dim.DimEnumeration;
import com.mimacom.ddd.dm.dim.DimFactory;
import com.mimacom.ddd.dm.dim.DimFeature;
import com.mimacom.ddd.dm.dim.DimLiteral;
import com.mimacom.ddd.dm.dim.DimPackage;
import com.mimacom.ddd.dm.dim.DimPrimitive;
import com.mimacom.ddd.dm.dim.DimQuery;
import com.mimacom.ddd.dm.dim.DimQueryParameter;
import com.mimacom.ddd.dm.dim.DimSimpleType;
import com.mimacom.ddd.dm.dim.DimType;
import com.mimacom.ddd.dm.dim.DomainInformationModel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimPackageImpl extends EPackageImpl implements DimPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainInformationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimAggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimSimpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimDetailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimQueryParameterEClass = null;

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
	 * @see com.mimacom.ddd.dm.dim.DimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DimPackageImpl()
	{
		super(eNS_URI, DimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DimPackage init()
	{
		if (isInited) return (DimPackage)EPackage.Registry.INSTANCE.getEPackage(DimPackage.eNS_URI);

		// Obtain or create and register package
		DimPackageImpl theDimPackage = (DimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DimPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TransposePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDimPackage.createPackageContents();

		// Initialize created meta-data
		theDimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DimPackage.eNS_URI, theDimPackage);
		return theDimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainInformationModel()
	{
		return domainInformationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimAggregate()
	{
		return dimAggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimType()
	{
		return dimTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimSimpleType()
	{
		return dimSimpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimPrimitive()
	{
		return dimPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimEnumeration()
	{
		return dimEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimLiteral()
	{
		return dimLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimComplexType()
	{
		return dimComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimDetailType()
	{
		return dimDetailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimEntityType()
	{
		return dimEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimFeature()
	{
		return dimFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimAssociation()
	{
		return dimAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimAttribute()
	{
		return dimAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimQuery()
	{
		return dimQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimQueryParameter()
	{
		return dimQueryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimFactory getDimFactory()
	{
		return (DimFactory)getEFactoryInstance();
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
		domainInformationModelEClass = createEClass(DOMAIN_INFORMATION_MODEL);

		dimAggregateEClass = createEClass(DIM_AGGREGATE);

		dimTypeEClass = createEClass(DIM_TYPE);

		dimSimpleTypeEClass = createEClass(DIM_SIMPLE_TYPE);

		dimPrimitiveEClass = createEClass(DIM_PRIMITIVE);

		dimEnumerationEClass = createEClass(DIM_ENUMERATION);

		dimLiteralEClass = createEClass(DIM_LITERAL);

		dimComplexTypeEClass = createEClass(DIM_COMPLEX_TYPE);

		dimDetailTypeEClass = createEClass(DIM_DETAIL_TYPE);

		dimEntityTypeEClass = createEClass(DIM_ENTITY_TYPE);

		dimFeatureEClass = createEClass(DIM_FEATURE);

		dimAssociationEClass = createEClass(DIM_ASSOCIATION);

		dimAttributeEClass = createEClass(DIM_ATTRIBUTE);

		dimQueryEClass = createEClass(DIM_QUERY);

		dimQueryParameterEClass = createEClass(DIM_QUERY_PARAMETER);
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
		domainInformationModelEClass.getESuperTypes().add(theBasePackage.getDInformationModel());
		dimAggregateEClass.getESuperTypes().add(theBasePackage.getDAggregate());
		dimAggregateEClass.getESuperTypes().add(theTransposePackage.getITransposableElement());
		dimAggregateEClass.getESuperTypes().add(theBasePackage.getIDiagramRoot());
		dimTypeEClass.getESuperTypes().add(theBasePackage.getDType());
		dimTypeEClass.getESuperTypes().add(theTransposePackage.getITransposableElement());
		dimSimpleTypeEClass.getESuperTypes().add(theBasePackage.getDSimpleType());
		dimSimpleTypeEClass.getESuperTypes().add(this.getDimType());
		dimPrimitiveEClass.getESuperTypes().add(theBasePackage.getDPrimitive());
		dimPrimitiveEClass.getESuperTypes().add(this.getDimSimpleType());
		dimEnumerationEClass.getESuperTypes().add(theBasePackage.getDEnumeration());
		dimEnumerationEClass.getESuperTypes().add(this.getDimSimpleType());
		dimLiteralEClass.getESuperTypes().add(theBasePackage.getDLiteral());
		dimLiteralEClass.getESuperTypes().add(theTransposePackage.getITransposableElement());
		dimComplexTypeEClass.getESuperTypes().add(theBasePackage.getDComplexType());
		dimComplexTypeEClass.getESuperTypes().add(this.getDimType());
		dimDetailTypeEClass.getESuperTypes().add(theBasePackage.getDDetailType());
		dimDetailTypeEClass.getESuperTypes().add(this.getDimComplexType());
		dimEntityTypeEClass.getESuperTypes().add(theBasePackage.getDEntityType());
		dimEntityTypeEClass.getESuperTypes().add(this.getDimComplexType());
		dimFeatureEClass.getESuperTypes().add(theBasePackage.getDFeature());
		dimFeatureEClass.getESuperTypes().add(theTransposePackage.getITransposableElement());
		dimAssociationEClass.getESuperTypes().add(theBasePackage.getDAssociation());
		dimAssociationEClass.getESuperTypes().add(this.getDimFeature());
		dimAttributeEClass.getESuperTypes().add(theBasePackage.getDAttribute());
		dimAttributeEClass.getESuperTypes().add(this.getDimFeature());
		dimQueryEClass.getESuperTypes().add(theBasePackage.getDQuery());
		dimQueryEClass.getESuperTypes().add(this.getDimFeature());
		dimQueryParameterEClass.getESuperTypes().add(theBasePackage.getDQueryParameter());
		dimQueryParameterEClass.getESuperTypes().add(theTransposePackage.getITransposableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainInformationModelEClass, DomainInformationModel.class, "DomainInformationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimAggregateEClass, DimAggregate.class, "DimAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimTypeEClass, DimType.class, "DimType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimSimpleTypeEClass, DimSimpleType.class, "DimSimpleType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimPrimitiveEClass, DimPrimitive.class, "DimPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimEnumerationEClass, DimEnumeration.class, "DimEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimLiteralEClass, DimLiteral.class, "DimLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimComplexTypeEClass, DimComplexType.class, "DimComplexType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimDetailTypeEClass, DimDetailType.class, "DimDetailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimEntityTypeEClass, DimEntityType.class, "DimEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimFeatureEClass, DimFeature.class, "DimFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimAssociationEClass, DimAssociation.class, "DimAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimAttributeEClass, DimAttribute.class, "DimAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimQueryEClass, DimQuery.class, "DimQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimQueryParameterEClass, DimQueryParameter.class, "DimQueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DimPackageImpl
