/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm;

import com.mimacom.ddd.dm.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.mimacom.ddd.sm.asm.AsmFactory
 * @model kind="package"
 * @generated
 */
public interface AsmPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "asm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/sm/asm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsmPackage eINSTANCE = com.mimacom.ddd.sm.asm.impl.AsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.asm.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.asm.impl.ModelImpl
	 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = BasePackage.IPRIMARY_NAVIGATION_TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ALIASES = BasePackage.IPRIMARY_NAVIGATION_TARGET__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = BasePackage.IPRIMARY_NAVIGATION_TARGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORTS = BasePackage.IPRIMARY_NAVIGATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = BasePackage.IPRIMARY_NAVIGATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = BasePackage.IPRIMARY_NAVIGATION_TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.asm.impl.SApplicationImpl <em>SApplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.asm.impl.SApplicationImpl
	 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSApplication()
	 * @generated
	 */
	int SAPPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION__ALIASES = MODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION__DESCRIPTION = MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION__IMPORTS = MODEL__IMPORTS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION__MODEL = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION__SERVICES = MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION__ACTORS = MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SApplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION_FEATURE_COUNT = MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>SApplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAPPLICATION_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.asm.impl.SServiceInterfaceImpl <em>SService Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.asm.impl.SServiceInterfaceImpl
	 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSServiceInterface()
	 * @generated
	 */
	int SSERVICE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE__ALIASES = MODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE__DESCRIPTION = MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE__IMPORTS = MODEL__IMPORTS;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE__INTERFACE = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE__CORE = MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE__EXCEPTIONS = MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE__OPERATIONS = MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>SService Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>SService Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_INTERFACE_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.asm.impl.SActorImpl <em>SActor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.asm.impl.SActorImpl
	 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSActor()
	 * @generated
	 */
	int SACTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>SActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.asm.impl.SWatchdogImpl <em>SWatchdog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.asm.impl.SWatchdogImpl
	 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSWatchdog()
	 * @generated
	 */
	int SWATCHDOG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWATCHDOG__NAME = SACTOR__NAME;

	/**
	 * The number of structural features of the '<em>SWatchdog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWATCHDOG_FEATURE_COUNT = SACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SWatchdog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWATCHDOG_OPERATION_COUNT = SACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.asm.impl.SHumanImpl <em>SHuman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.asm.impl.SHumanImpl
	 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSHuman()
	 * @generated
	 */
	int SHUMAN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUMAN__NAME = SACTOR__NAME;

	/**
	 * The number of structural features of the '<em>SHuman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUMAN_FEATURE_COUNT = SACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SHuman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUMAN_OPERATION_COUNT = SACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.asm.impl.SServiceOperationImpl <em>SService Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.asm.impl.SServiceOperationImpl
	 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSServiceOperation()
	 * @generated
	 */
	int SSERVICE_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_OPERATION__NAME = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_OPERATION__PARAMETERS = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Raises</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_OPERATION__RAISES = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_OPERATION__GUARDS = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_OPERATION__EFFECTS = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SService Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_OPERATION_FEATURE_COUNT = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>SService Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSERVICE_OPERATION_OPERATION_COUNT = BasePackage.INAVIGABLE_MEMBER_CONTAINER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.asm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.mimacom.ddd.sm.asm.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.asm.Model#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.mimacom.ddd.sm.asm.Model#getImports()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Imports();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.asm.SApplication <em>SApplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SApplication</em>'.
	 * @see com.mimacom.ddd.sm.asm.SApplication
	 * @generated
	 */
	EClass getSApplication();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.asm.SApplication#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.mimacom.ddd.sm.asm.SApplication#getModel()
	 * @see #getSApplication()
	 * @generated
	 */
	EReference getSApplication_Model();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.sm.asm.SApplication#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see com.mimacom.ddd.sm.asm.SApplication#getServices()
	 * @see #getSApplication()
	 * @generated
	 */
	EReference getSApplication_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.asm.SApplication#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see com.mimacom.ddd.sm.asm.SApplication#getActors()
	 * @see #getSApplication()
	 * @generated
	 */
	EReference getSApplication_Actors();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.asm.SServiceInterface <em>SService Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SService Interface</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceInterface
	 * @generated
	 */
	EClass getSServiceInterface();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.asm.SServiceInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceInterface#getInterface()
	 * @see #getSServiceInterface()
	 * @generated
	 */
	EReference getSServiceInterface_Interface();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.asm.SServiceInterface#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceInterface#getCore()
	 * @see #getSServiceInterface()
	 * @generated
	 */
	EReference getSServiceInterface_Core();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.asm.SServiceInterface#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceInterface#getExceptions()
	 * @see #getSServiceInterface()
	 * @generated
	 */
	EReference getSServiceInterface_Exceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.asm.SServiceInterface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceInterface#getOperations()
	 * @see #getSServiceInterface()
	 * @generated
	 */
	EReference getSServiceInterface_Operations();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.asm.SActor <em>SActor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SActor</em>'.
	 * @see com.mimacom.ddd.sm.asm.SActor
	 * @generated
	 */
	EClass getSActor();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.asm.SActor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.sm.asm.SActor#getName()
	 * @see #getSActor()
	 * @generated
	 */
	EAttribute getSActor_Name();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.asm.SWatchdog <em>SWatchdog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SWatchdog</em>'.
	 * @see com.mimacom.ddd.sm.asm.SWatchdog
	 * @generated
	 */
	EClass getSWatchdog();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.asm.SHuman <em>SHuman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SHuman</em>'.
	 * @see com.mimacom.ddd.sm.asm.SHuman
	 * @generated
	 */
	EClass getSHuman();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.asm.SServiceOperation <em>SService Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SService Operation</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceOperation
	 * @generated
	 */
	EClass getSServiceOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.asm.SServiceOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceOperation#getName()
	 * @see #getSServiceOperation()
	 * @generated
	 */
	EAttribute getSServiceOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.asm.SServiceOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceOperation#getParameters()
	 * @see #getSServiceOperation()
	 * @generated
	 */
	EReference getSServiceOperation_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.sm.asm.SServiceOperation#getRaises <em>Raises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Raises</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceOperation#getRaises()
	 * @see #getSServiceOperation()
	 * @generated
	 */
	EReference getSServiceOperation_Raises();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.asm.SServiceOperation#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceOperation#getGuards()
	 * @see #getSServiceOperation()
	 * @generated
	 */
	EReference getSServiceOperation_Guards();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.asm.SServiceOperation#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see com.mimacom.ddd.sm.asm.SServiceOperation#getEffects()
	 * @see #getSServiceOperation()
	 * @generated
	 */
	EReference getSServiceOperation_Effects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AsmFactory getAsmFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.asm.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.asm.impl.ModelImpl
		 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.asm.impl.SApplicationImpl <em>SApplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.asm.impl.SApplicationImpl
		 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSApplication()
		 * @generated
		 */
		EClass SAPPLICATION = eINSTANCE.getSApplication();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAPPLICATION__MODEL = eINSTANCE.getSApplication_Model();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAPPLICATION__SERVICES = eINSTANCE.getSApplication_Services();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAPPLICATION__ACTORS = eINSTANCE.getSApplication_Actors();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.asm.impl.SServiceInterfaceImpl <em>SService Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.asm.impl.SServiceInterfaceImpl
		 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSServiceInterface()
		 * @generated
		 */
		EClass SSERVICE_INTERFACE = eINSTANCE.getSServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSERVICE_INTERFACE__INTERFACE = eINSTANCE.getSServiceInterface_Interface();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSERVICE_INTERFACE__CORE = eINSTANCE.getSServiceInterface_Core();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSERVICE_INTERFACE__EXCEPTIONS = eINSTANCE.getSServiceInterface_Exceptions();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSERVICE_INTERFACE__OPERATIONS = eINSTANCE.getSServiceInterface_Operations();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.asm.impl.SActorImpl <em>SActor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.asm.impl.SActorImpl
		 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSActor()
		 * @generated
		 */
		EClass SACTOR = eINSTANCE.getSActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SACTOR__NAME = eINSTANCE.getSActor_Name();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.asm.impl.SWatchdogImpl <em>SWatchdog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.asm.impl.SWatchdogImpl
		 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSWatchdog()
		 * @generated
		 */
		EClass SWATCHDOG = eINSTANCE.getSWatchdog();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.asm.impl.SHumanImpl <em>SHuman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.asm.impl.SHumanImpl
		 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSHuman()
		 * @generated
		 */
		EClass SHUMAN = eINSTANCE.getSHuman();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.asm.impl.SServiceOperationImpl <em>SService Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.asm.impl.SServiceOperationImpl
		 * @see com.mimacom.ddd.sm.asm.impl.AsmPackageImpl#getSServiceOperation()
		 * @generated
		 */
		EClass SSERVICE_OPERATION = eINSTANCE.getSServiceOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSERVICE_OPERATION__NAME = eINSTANCE.getSServiceOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSERVICE_OPERATION__PARAMETERS = eINSTANCE.getSServiceOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Raises</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSERVICE_OPERATION__RAISES = eINSTANCE.getSServiceOperation_Raises();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSERVICE_OPERATION__GUARDS = eINSTANCE.getSServiceOperation_Guards();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSERVICE_OPERATION__EFFECTS = eINSTANCE.getSServiceOperation_Effects();

	}

} //AsmPackage
