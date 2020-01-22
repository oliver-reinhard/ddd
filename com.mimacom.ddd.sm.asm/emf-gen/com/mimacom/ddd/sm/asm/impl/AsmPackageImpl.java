/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.sm.asm.AsmFactory;
import com.mimacom.ddd.sm.asm.AsmPackage;
import com.mimacom.ddd.sm.asm.Model;
import com.mimacom.ddd.sm.asm.SActor;
import com.mimacom.ddd.sm.asm.SApplication;
import com.mimacom.ddd.sm.asm.SDirection;
import com.mimacom.ddd.sm.asm.SException;
import com.mimacom.ddd.sm.asm.SHuman;
import com.mimacom.ddd.sm.asm.SServiceInterface;
import com.mimacom.ddd.sm.asm.SServiceKind;
import com.mimacom.ddd.sm.asm.SServiceOperation;
import com.mimacom.ddd.sm.asm.SServiceParameter;
import com.mimacom.ddd.sm.asm.SWatchdog;

import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsmPackageImpl extends EPackageImpl implements AsmPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sServiceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sWatchdogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sHumanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sServiceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sServiceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sServiceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sDirectionEEnum = null;

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
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AsmPackageImpl()
	{
		super(eNS_URI, AsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AsmPackage init()
	{
		if (isInited) return (AsmPackage)EPackage.Registry.INSTANCE.getEPackage(AsmPackage.eNS_URI);

		// Obtain or create and register package
		AsmPackageImpl theAsmPackage = (AsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAsmPackage.createPackageContents();

		// Initialize created meta-data
		theAsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAsmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AsmPackage.eNS_URI, theAsmPackage);
		return theAsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel()
	{
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	@Override
=======
>>>>>>> refs/heads/master
	public EClass getSApplication()
	{
		return sApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSApplication_Model()
	{
		return (EReference)sApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSApplication_Services()
	{
		return (EReference)sApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSApplication_Actors()
	{
		return (EReference)sApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSServiceInterface()
	{
		return sServiceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSServiceInterface_Interface()
	{
		return (EReference)sServiceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSServiceInterface_Core()
	{
		return (EReference)sServiceInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSServiceInterface_Exceptions()
	{
		return (EReference)sServiceInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSServiceInterface_Operations()
	{
		return (EReference)sServiceInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSException()
	{
		return sExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSActor()
	{
		return sActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSActor_Name()
	{
		return (EAttribute)sActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSWatchdog()
	{
		return sWatchdogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSHuman()
	{
		return sHumanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSServiceOperation()
	{
		return sServiceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSServiceOperation_Name()
	{
		return (EAttribute)sServiceOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSServiceOperation_Parameters()
	{
		return (EReference)sServiceOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSServiceOperation_Raises()
	{
		return (EReference)sServiceOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSServiceOperation_Guards()
	{
		return (EReference)sServiceOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSServiceOperation_Effects()
	{
		return (EReference)sServiceOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSServiceParameter()
	{
		return sServiceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSServiceParameter_Direction()
	{
		return (EAttribute)sServiceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSServiceKind()
	{
		return sServiceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSDirection()
	{
		return sDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsmFactory getAsmFactory()
	{
		return (AsmFactory)getEFactoryInstance();
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
		modelEClass = createEClass(MODEL);

		sApplicationEClass = createEClass(SAPPLICATION);
		createEReference(sApplicationEClass, SAPPLICATION__MODEL);
		createEReference(sApplicationEClass, SAPPLICATION__SERVICES);
		createEReference(sApplicationEClass, SAPPLICATION__ACTORS);

		sServiceInterfaceEClass = createEClass(SSERVICE_INTERFACE);
		createEReference(sServiceInterfaceEClass, SSERVICE_INTERFACE__INTERFACE);
		createEReference(sServiceInterfaceEClass, SSERVICE_INTERFACE__CORE);
		createEReference(sServiceInterfaceEClass, SSERVICE_INTERFACE__EXCEPTIONS);
		createEReference(sServiceInterfaceEClass, SSERVICE_INTERFACE__OPERATIONS);

		sExceptionEClass = createEClass(SEXCEPTION);

		sActorEClass = createEClass(SACTOR);
		createEAttribute(sActorEClass, SACTOR__NAME);

		sWatchdogEClass = createEClass(SWATCHDOG);

		sHumanEClass = createEClass(SHUMAN);

		sServiceOperationEClass = createEClass(SSERVICE_OPERATION);
		createEAttribute(sServiceOperationEClass, SSERVICE_OPERATION__NAME);
		createEReference(sServiceOperationEClass, SSERVICE_OPERATION__PARAMETERS);
		createEReference(sServiceOperationEClass, SSERVICE_OPERATION__RAISES);
		createEReference(sServiceOperationEClass, SSERVICE_OPERATION__GUARDS);
		createEReference(sServiceOperationEClass, SSERVICE_OPERATION__EFFECTS);

		sServiceParameterEClass = createEClass(SSERVICE_PARAMETER);
		createEAttribute(sServiceParameterEClass, SSERVICE_PARAMETER__DIRECTION);

		// Create enums
		sServiceKindEEnum = createEEnum(SSERVICE_KIND);
		sDirectionEEnum = createEEnum(SDIRECTION);
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
		SimPackage theSimPackage = (SimPackage)EPackage.Registry.INSTANCE.getEPackage(SimPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelEClass.getESuperTypes().add(theBasePackage.getDNamespace());
		modelEClass.getESuperTypes().add(theBasePackage.getIStaticReferenceTarget());
		sApplicationEClass.getESuperTypes().add(this.getModel());
		sServiceInterfaceEClass.getESuperTypes().add(this.getModel());
		sExceptionEClass.getESuperTypes().add(theBasePackage.getDNamedElement());
		sWatchdogEClass.getESuperTypes().add(this.getSActor());
		sHumanEClass.getESuperTypes().add(this.getSActor());
		sServiceOperationEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		sServiceParameterEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sApplicationEClass, SApplication.class, "SApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSApplication_Model(), theSimPackage.getSInformationModel(), null, "model", null, 0, 1, SApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSApplication_Services(), this.getSServiceInterface(), null, "services", null, 0, -1, SApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSApplication_Actors(), this.getSActor(), null, "actors", null, 0, -1, SApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sServiceInterfaceEClass, SServiceInterface.class, "SServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSServiceInterface_Interface(), theSimPackage.getSInformationModel(), null, "interface", null, 0, 1, SServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSServiceInterface_Core(), theSimPackage.getSInformationModel(), null, "core", null, 0, 1, SServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSServiceInterface_Exceptions(), this.getSException(), null, "exceptions", null, 0, -1, SServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSServiceInterface_Operations(), this.getSServiceOperation(), null, "operations", null, 0, -1, SServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sExceptionEClass, SException.class, "SException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sActorEClass, SActor.class, "SActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSActor_Name(), ecorePackage.getEString(), "name", null, 0, 1, SActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sWatchdogEClass, SWatchdog.class, "SWatchdog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sHumanEClass, SHuman.class, "SHuman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sServiceOperationEClass, SServiceOperation.class, "SServiceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSServiceOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, SServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSServiceOperation_Parameters(), this.getSServiceParameter(), null, "parameters", null, 0, -1, SServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSServiceOperation_Raises(), this.getSException(), null, "raises", null, 0, -1, SServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSServiceOperation_Guards(), theBasePackage.getDExpression(), null, "guards", null, 0, -1, SServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSServiceOperation_Effects(), theBasePackage.getDExpression(), null, "effects", null, 0, -1, SServiceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sServiceParameterEClass, SServiceParameter.class, "SServiceParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSServiceParameter_Direction(), this.getSDirection(), "direction", null, 0, 1, SServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sServiceKindEEnum, SServiceKind.class, "SServiceKind");
		addEEnumLiteral(sServiceKindEEnum, SServiceKind.SYNCHRONOUS);
		addEEnumLiteral(sServiceKindEEnum, SServiceKind.ASYNCHRONOUS);

		initEEnum(sDirectionEEnum, SDirection.class, "SDirection");
		addEEnumLiteral(sDirectionEEnum, SDirection.INBOUND);
		addEEnumLiteral(sDirectionEEnum, SDirection.OUTBOUND);

		// Create resource
		createResource(eNS_URI);
	}

} //AsmPackageImpl
