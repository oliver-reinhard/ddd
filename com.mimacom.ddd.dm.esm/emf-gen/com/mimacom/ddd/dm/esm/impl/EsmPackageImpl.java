/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.dim.DimPackage;

import com.mimacom.ddd.dm.esm.EsmCompositeState;
import com.mimacom.ddd.dm.esm.EsmConcurrentState;
import com.mimacom.ddd.dm.esm.EsmDerivedState;
import com.mimacom.ddd.dm.esm.EsmEntityStateModel;
import com.mimacom.ddd.dm.esm.EsmFactory;
import com.mimacom.ddd.dm.esm.EsmLayoutDirection;
import com.mimacom.ddd.dm.esm.EsmPackage;
import com.mimacom.ddd.dm.esm.EsmState;
import com.mimacom.ddd.dm.esm.EsmStateKind;
import com.mimacom.ddd.dm.esm.EsmSubStateModel;
import com.mimacom.ddd.dm.esm.EsmTransition;
import com.mimacom.ddd.dm.esm.IEsmLayout;
import com.mimacom.ddd.dm.esm.IEsmState;
import com.mimacom.ddd.dm.esm.IEsmStateModel;

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
public class EsmPackageImpl extends EPackageImpl implements EsmPackage
{
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
	private EClass iEsmLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEsmStateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iEsmStateEClass = null;

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
	private EClass esmDerivedStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmCompositeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmConcurrentStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmSubStateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum esmLayoutDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum esmStateKindEEnum = null;

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
		EsmPackageImpl theEsmPackage = (EsmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EsmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EsmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DimPackage.eINSTANCE.eClass();

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
	public EClass getEsmEntityStateModel()
	{
		return esmEntityStateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsmEntityStateModel_ForType()
	{
		return (EReference)esmEntityStateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEsmLayout()
	{
		return iEsmLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIEsmLayout_Direction()
	{
		return (EAttribute)iEsmLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEsmStateModel()
	{
		return iEsmStateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEsmStateModel_States()
	{
		return (EReference)iEsmStateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEsmStateModel_Transitions()
	{
		return (EReference)iEsmStateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEsmState()
	{
		return iEsmStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEsmState_State()
	{
		return (EReference)iEsmStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIEsmState_Kind()
	{
		return (EAttribute)iEsmStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEsmState_Description()
	{
		return (EReference)iEsmStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsmState()
	{
		return esmStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsmDerivedState()
	{
		return esmDerivedStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsmDerivedState_Expression()
	{
		return (EReference)esmDerivedStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsmCompositeState()
	{
		return esmCompositeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsmConcurrentState()
	{
		return esmConcurrentStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsmConcurrentState_SubStates()
	{
		return (EReference)esmConcurrentStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsmSubStateModel()
	{
		return esmSubStateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsmTransition()
	{
		return esmTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsmTransition_From()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsmTransition_To()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsmTransition_Event()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsmTransition_Guard()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsmTransition_Description()
	{
		return (EReference)esmTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEsmLayoutDirection()
	{
		return esmLayoutDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEsmStateKind()
	{
		return esmStateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		esmEntityStateModelEClass = createEClass(ESM_ENTITY_STATE_MODEL);
		createEReference(esmEntityStateModelEClass, ESM_ENTITY_STATE_MODEL__FOR_TYPE);

		iEsmLayoutEClass = createEClass(IESM_LAYOUT);
		createEAttribute(iEsmLayoutEClass, IESM_LAYOUT__DIRECTION);

		iEsmStateModelEClass = createEClass(IESM_STATE_MODEL);
		createEReference(iEsmStateModelEClass, IESM_STATE_MODEL__STATES);
		createEReference(iEsmStateModelEClass, IESM_STATE_MODEL__TRANSITIONS);

		iEsmStateEClass = createEClass(IESM_STATE);
		createEReference(iEsmStateEClass, IESM_STATE__STATE);
		createEAttribute(iEsmStateEClass, IESM_STATE__KIND);
		createEReference(iEsmStateEClass, IESM_STATE__DESCRIPTION);

		esmStateEClass = createEClass(ESM_STATE);

		esmDerivedStateEClass = createEClass(ESM_DERIVED_STATE);
		createEReference(esmDerivedStateEClass, ESM_DERIVED_STATE__EXPRESSION);

		esmCompositeStateEClass = createEClass(ESM_COMPOSITE_STATE);

		esmConcurrentStateEClass = createEClass(ESM_CONCURRENT_STATE);
		createEReference(esmConcurrentStateEClass, ESM_CONCURRENT_STATE__SUB_STATES);

		esmSubStateModelEClass = createEClass(ESM_SUB_STATE_MODEL);

		esmTransitionEClass = createEClass(ESM_TRANSITION);
		createEReference(esmTransitionEClass, ESM_TRANSITION__FROM);
		createEReference(esmTransitionEClass, ESM_TRANSITION__TO);
		createEReference(esmTransitionEClass, ESM_TRANSITION__EVENT);
		createEReference(esmTransitionEClass, ESM_TRANSITION__GUARD);
		createEReference(esmTransitionEClass, ESM_TRANSITION__DESCRIPTION);

		// Create enums
		esmLayoutDirectionEEnum = createEEnum(ESM_LAYOUT_DIRECTION);
		esmStateKindEEnum = createEEnum(ESM_STATE_KIND);
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
		DimPackage theDimPackage = (DimPackage)EPackage.Registry.INSTANCE.getEPackage(DimPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		esmEntityStateModelEClass.getESuperTypes().add(theBasePackage.getDModel());
		esmEntityStateModelEClass.getESuperTypes().add(this.getIEsmStateModel());
		esmEntityStateModelEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		esmEntityStateModelEClass.getESuperTypes().add(theBasePackage.getIStaticReferenceTarget());
		esmEntityStateModelEClass.getESuperTypes().add(theBasePackage.getIDiagramRoot());
		iEsmStateModelEClass.getESuperTypes().add(this.getIEsmLayout());
		iEsmStateEClass.getESuperTypes().add(theBasePackage.getINoteContainer());
		esmStateEClass.getESuperTypes().add(this.getIEsmState());
		esmDerivedStateEClass.getESuperTypes().add(this.getEsmState());
		esmCompositeStateEClass.getESuperTypes().add(this.getIEsmState());
		esmCompositeStateEClass.getESuperTypes().add(this.getIEsmStateModel());
		esmConcurrentStateEClass.getESuperTypes().add(this.getIEsmState());
		esmSubStateModelEClass.getESuperTypes().add(this.getIEsmStateModel());
		esmTransitionEClass.getESuperTypes().add(this.getIEsmLayout());
		esmTransitionEClass.getESuperTypes().add(theBasePackage.getINoteContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(esmEntityStateModelEClass, EsmEntityStateModel.class, "EsmEntityStateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsmEntityStateModel_ForType(), theDimPackage.getDimEntityType(), null, "forType", null, 0, 1, EsmEntityStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iEsmLayoutEClass, IEsmLayout.class, "IEsmLayout", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIEsmLayout_Direction(), this.getEsmLayoutDirection(), "direction", null, 0, 1, IEsmLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iEsmStateModelEClass, IEsmStateModel.class, "IEsmStateModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIEsmStateModel_States(), this.getIEsmState(), null, "states", null, 0, -1, IEsmStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIEsmStateModel_Transitions(), this.getEsmTransition(), null, "transitions", null, 0, -1, IEsmStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iEsmStateEClass, IEsmState.class, "IEsmState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIEsmState_State(), theBasePackage.getDState(), null, "state", null, 0, 1, IEsmState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEsmState_Kind(), this.getEsmStateKind(), "kind", null, 0, 1, IEsmState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIEsmState_Description(), theBasePackage.getDRichText(), null, "description", null, 0, 1, IEsmState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmStateEClass, EsmState.class, "EsmState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmDerivedStateEClass, EsmDerivedState.class, "EsmDerivedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsmDerivedState_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, EsmDerivedState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmCompositeStateEClass, EsmCompositeState.class, "EsmCompositeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmConcurrentStateEClass, EsmConcurrentState.class, "EsmConcurrentState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsmConcurrentState_SubStates(), this.getEsmSubStateModel(), null, "subStates", null, 0, -1, EsmConcurrentState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmSubStateModelEClass, EsmSubStateModel.class, "EsmSubStateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmTransitionEClass, EsmTransition.class, "EsmTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEsmTransition_From(), theBasePackage.getDState(), null, "from", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmTransition_To(), theBasePackage.getDState(), null, "to", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmTransition_Event(), theBasePackage.getDStateEvent(), null, "event", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmTransition_Guard(), theBasePackage.getDExpression(), null, "guard", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsmTransition_Description(), theBasePackage.getDRichText(), null, "description", null, 0, 1, EsmTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(esmLayoutDirectionEEnum, EsmLayoutDirection.class, "EsmLayoutDirection");
		addEEnumLiteral(esmLayoutDirectionEEnum, EsmLayoutDirection.DEFAULT);
		addEEnumLiteral(esmLayoutDirectionEEnum, EsmLayoutDirection.DOWN);
		addEEnumLiteral(esmLayoutDirectionEEnum, EsmLayoutDirection.LEFT);
		addEEnumLiteral(esmLayoutDirectionEEnum, EsmLayoutDirection.UP);
		addEEnumLiteral(esmLayoutDirectionEEnum, EsmLayoutDirection.RIGHT);

		initEEnum(esmStateKindEEnum, EsmStateKind.class, "EsmStateKind");
		addEEnumLiteral(esmStateKindEEnum, EsmStateKind.NORMAL);
		addEEnumLiteral(esmStateKindEEnum, EsmStateKind.INITIAL);
		addEEnumLiteral(esmStateKindEEnum, EsmStateKind.FINAL);

		// Create resource
		createResource(eNS_URI);
	}

} //EsmPackageImpl
