/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimPackageImpl extends EPackageImpl implements SimPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sInformationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sInformationModelKindEEnum = null;

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
	 * @see com.mimacom.ddd.sm.sim.SimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimPackageImpl()
	{
		super(eNS_URI, SimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimPackage init()
	{
		if (isInited) return (SimPackage)EPackage.Registry.INSTANCE.getEPackage(SimPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimPackageImpl theSimPackage = registeredSimPackage instanceof SimPackageImpl ? (SimPackageImpl)registeredSimPackage : new SimPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		TransposePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimPackage.createPackageContents();

		// Initialize created meta-data
		theSimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimPackage.eNS_URI, theSimPackage);
		return theSimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSInformationModel()
	{
		return sInformationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSInformationModel_Kind()
	{
		return (EAttribute)sInformationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSInformationModel_Generate()
	{
		return (EAttribute)sInformationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSInformationModelKind()
	{
		return sInformationModelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimFactory getSimFactory()
	{
		return (SimFactory)getEFactoryInstance();
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
		sInformationModelEClass = createEClass(SINFORMATION_MODEL);
		createEAttribute(sInformationModelEClass, SINFORMATION_MODEL__KIND);
		createEAttribute(sInformationModelEClass, SINFORMATION_MODEL__GENERATE);

		// Create enums
		sInformationModelKindEEnum = createEEnum(SINFORMATION_MODEL_KIND);
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
		TransposePackage theTransposePackage = (TransposePackage)EPackage.Registry.INSTANCE.getEPackage(TransposePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sInformationModelEClass.getESuperTypes().add(theTransposePackage.getTInformationModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(sInformationModelEClass, SInformationModel.class, "SInformationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSInformationModel_Kind(), this.getSInformationModelKind(), "kind", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSInformationModel_Generate(), ecorePackage.getEBoolean(), "generate", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sInformationModelKindEEnum, SInformationModelKind.class, "SInformationModelKind");
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.BASE);
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.INTERFACE);
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.CORE);

		// Create resource
		createResource(eNS_URI);
	}

} //SimPackageImpl
