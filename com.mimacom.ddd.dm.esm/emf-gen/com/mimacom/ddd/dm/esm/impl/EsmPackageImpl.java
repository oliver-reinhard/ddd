/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.dm.esm.EsmDomain;
import com.mimacom.ddd.dm.esm.EsmEntityStateModel;
import com.mimacom.ddd.dm.esm.EsmFactory;
import com.mimacom.ddd.dm.esm.EsmPackage;
import com.mimacom.ddd.dm.esm.EsmState;
import com.mimacom.ddd.dm.esm.EsmTransition;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsmPackageImpl extends EPackageImpl implements EsmPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmEntityStateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmTransitionEClass = null;

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
	 * @see com.mimacom.ddd.dm.esm.EsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EsmPackageImpl()
	{
		super(eNS_URI, EsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EsmPackage init()
	{
		if (isInited) return (EsmPackage)EPackage.Registry.INSTANCE.getEPackage(EsmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEsmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EsmPackageImpl theEsmPackage = registeredEsmPackage instanceof EsmPackageImpl ? (EsmPackageImpl)registeredEsmPackage : new EsmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEsmPackage.createPackageContents();

		// Initialize created meta-data
		theEsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEsmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EsmPackage.eNS_URI, theEsmPackage);
		return theEsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEsmDomain()
	{
		return esmDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmDomain_Imports()
	{
		return (EReference)esmDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmDomain_StateModel()
	{
		return (EReference)esmDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEsmEntityStateModel()
	{
		return esmEntityStateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmEntityStateModel_States()
	{
		return (EReference)esmEntityStateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmEntityStateModel_ForType()
	{
		return (EReference)esmEntityStateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmEntityStateModel_Transition()
	{
		return (EReference)esmEntityStateModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEsmState()
	{
		return esmStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmState_State()
	{
		return (EReference)esmStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmState_Expression()
	{
		return (EReference)esmStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEsmTransition()
	{
		return esmTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmTransition_From()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmTransition_To()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmTransition_Event()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEsmTransition_Guard()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EsmFactory getEsmFactory()
	{
		return (EsmFactory)getEFactoryInstance();
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
		esmDomainEClass = createEClass(ESM_DOMAIN);
		createEReference(esmDomainEClass, ESM_DOMAIN__IMPORTS);
		createEReference(esmDomainEClass, ESM_DOMAIN__STATE_MODEL);

		esmEntityStateModelEClass = createEClass(ESM_ENTITY_STATE_MODEL);
		createEReference(esmEntityStateModelEClass, ESM_ENTITY_STATE_MODEL__STATES);
		createEReference(esmEntityStateModelEClass, ESM_ENTITY_STATE_MODEL__FOR_TYPE);
		createEReference(esmEntityStateModelEClass, ESM_ENTITY_STATE_MODEL__TRANSITION);

		esmStateEClass = createEClass(ESM_STATE);
		createEReference(esmStateEClass, ESM_STATE__STATE);
		createEReference(esmStateEClass, ESM_STATE__EXPRESSION);

		esmTransitionEClass = createEClass(ESM_TRANSITION);
		createEReference(esmTransitionEClass, ESM_TRANSITION__FROM);
		createEReference(esmTransitionEClass, ESM_TRANSITION__TO);
		createEReference(esmTransitionEClass, ESM_TRANSITION__EVENT);
		createEReference(esmTransitionEClass, ESM_TRANSITION__GUARD);
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
		esmDomainEClass.getESuperTypes().add(theBasePackage.getDNamedElement());
		esmEntityStateModelEClass.getESuperTypes().add(theBasePackage.getDNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(esmDomainEClass, EsmDomain.class, "EsmDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsmDomain_Imports(), theBasePackage.getDImport(), null, "imports", null, 0, -1, EsmDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmDomain_StateModel(), this.getEsmEntityStateModel(), null, "stateModel", null, 0, 1, EsmDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmEntityStateModelEClass, EsmEntityStateModel.class, "EsmEntityStateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsmEntityStateModel_States(), this.getEsmState(), null, "states", null, 0, -1, EsmEntityStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmEntityStateModel_ForType(), theBasePackage.getDEntityType(), null, "forType", null, 0, 1, EsmEntityStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmEntityStateModel_Transition(), this.getEsmTransition(), null, "transition", null, 0, -1, EsmEntityStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmStateEClass, EsmState.class, "EsmState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsmState_State(), theBasePackage.getDState(), null, "state", null, 0, 1, EsmState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmState_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, EsmState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmTransitionEClass, EsmTransition.class, "EsmTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsmTransition_From(), this.getEsmState(), null, "from", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmTransition_To(), this.getEsmState(), null, "to", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmTransition_Event(), theBasePackage.getDStateEvent(), null, "event", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmTransition_Guard(), theBasePackage.getDExpression(), null, "guard", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EsmPackageImpl
