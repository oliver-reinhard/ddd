/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm;

import com.mimacom.ddd.dm.base.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.esm.EsmFactory
 * @model kind="package"
 * @generated
 */
public interface EsmPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/esm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "esm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EsmPackage eINSTANCE = com.mimacom.ddd.dm.esm.impl.EsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl <em>Entity State Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmEntityStateModel()
	 * @generated
	 */
	int ESM_ENTITY_STATE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__NAME = BasePackage.DMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__ALIASES = BasePackage.DMODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__DESCRIPTION = BasePackage.DMODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__NOTES = BasePackage.DMODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__DIRECTION = BasePackage.DMODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__STATES = BasePackage.DMODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__TRANSITIONS = BasePackage.DMODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__NAVIGABLE_MEMBERS = BasePackage.DMODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>For Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL__FOR_TYPE = BasePackage.DMODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Entity State Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_ENTITY_STATE_MODEL_FEATURE_COUNT = BasePackage.DMODEL_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.IEsmLayout <em>IEsm Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.IEsmLayout
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getIEsmLayout()
	 * @generated
	 */
	int IESM_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_LAYOUT__DIRECTION = 0;

	/**
	 * The number of structural features of the '<em>IEsm Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_LAYOUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.IEsmStateModel <em>IEsm State Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.IEsmStateModel
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getIEsmStateModel()
	 * @generated
	 */
	int IESM_STATE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE_MODEL__DIRECTION = IESM_LAYOUT__DIRECTION;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE_MODEL__STATES = IESM_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE_MODEL__TRANSITIONS = IESM_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IEsm State Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE_MODEL_FEATURE_COUNT = IESM_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.impl.IEsmStateImpl <em>IEsm State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.impl.IEsmStateImpl
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getIEsmState()
	 * @generated
	 */
	int IESM_STATE = 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE__NOTES = BasePackage.INOTE_CONTAINER__NOTES;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE__STATE = BasePackage.INOTE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE__KIND = BasePackage.INOTE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE__DESCRIPTION = BasePackage.INOTE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IEsm State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IESM_STATE_FEATURE_COUNT = BasePackage.INOTE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.impl.EsmStateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.impl.EsmStateImpl
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmState()
	 * @generated
	 */
	int ESM_STATE = 4;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_STATE__NOTES = IESM_STATE__NOTES;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_STATE__STATE = IESM_STATE__STATE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_STATE__KIND = IESM_STATE__KIND;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_STATE__DESCRIPTION = IESM_STATE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_STATE_FEATURE_COUNT = IESM_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.impl.EsmDerivedStateImpl <em>Derived State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.impl.EsmDerivedStateImpl
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmDerivedState()
	 * @generated
	 */
	int ESM_DERIVED_STATE = 5;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_DERIVED_STATE__NOTES = ESM_STATE__NOTES;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_DERIVED_STATE__STATE = ESM_STATE__STATE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_DERIVED_STATE__KIND = ESM_STATE__KIND;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_DERIVED_STATE__DESCRIPTION = ESM_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_DERIVED_STATE__EXPRESSION = ESM_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_DERIVED_STATE_FEATURE_COUNT = ESM_STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.impl.EsmCompositeStateImpl <em>Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.impl.EsmCompositeStateImpl
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmCompositeState()
	 * @generated
	 */
	int ESM_COMPOSITE_STATE = 6;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_COMPOSITE_STATE__NOTES = IESM_STATE__NOTES;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_COMPOSITE_STATE__STATE = IESM_STATE__STATE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_COMPOSITE_STATE__KIND = IESM_STATE__KIND;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_COMPOSITE_STATE__DESCRIPTION = IESM_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_COMPOSITE_STATE__DIRECTION = IESM_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_COMPOSITE_STATE__STATES = IESM_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_COMPOSITE_STATE__TRANSITIONS = IESM_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_COMPOSITE_STATE_FEATURE_COUNT = IESM_STATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.impl.EsmConcurrentStateImpl <em>Concurrent State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.impl.EsmConcurrentStateImpl
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmConcurrentState()
	 * @generated
	 */
	int ESM_CONCURRENT_STATE = 7;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_CONCURRENT_STATE__NOTES = IESM_STATE__NOTES;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_CONCURRENT_STATE__STATE = IESM_STATE__STATE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_CONCURRENT_STATE__KIND = IESM_STATE__KIND;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_CONCURRENT_STATE__DESCRIPTION = IESM_STATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sub States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_CONCURRENT_STATE__SUB_STATES = IESM_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concurrent State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_CONCURRENT_STATE_FEATURE_COUNT = IESM_STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.impl.EsmSubStateModelImpl <em>Sub State Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.impl.EsmSubStateModelImpl
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmSubStateModel()
	 * @generated
	 */
	int ESM_SUB_STATE_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_SUB_STATE_MODEL__DIRECTION = IESM_STATE_MODEL__DIRECTION;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_SUB_STATE_MODEL__STATES = IESM_STATE_MODEL__STATES;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_SUB_STATE_MODEL__TRANSITIONS = IESM_STATE_MODEL__TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Sub State Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_SUB_STATE_MODEL_FEATURE_COUNT = IESM_STATE_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmTransition()
	 * @generated
	 */
	int ESM_TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_TRANSITION__DIRECTION = IESM_LAYOUT__DIRECTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_TRANSITION__NOTES = IESM_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_TRANSITION__FROM = IESM_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_TRANSITION__TO = IESM_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_TRANSITION__EVENT = IESM_LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_TRANSITION__GUARD = IESM_LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_TRANSITION__DESCRIPTION = IESM_LAYOUT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESM_TRANSITION_FEATURE_COUNT = IESM_LAYOUT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.EsmLayoutDirection <em>Layout Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.EsmLayoutDirection
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmLayoutDirection()
	 * @generated
	 */
	int ESM_LAYOUT_DIRECTION = 10;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.esm.EsmStateKind <em>State Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.esm.EsmStateKind
	 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmStateKind()
	 * @generated
	 */
	int ESM_STATE_KIND = 11;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.EsmEntityStateModel <em>Entity State Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity State Model</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmEntityStateModel
	 * @generated
	 */
	EClass getEsmEntityStateModel();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.esm.EsmEntityStateModel#getForType <em>For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Type</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmEntityStateModel#getForType()
	 * @see #getEsmEntityStateModel()
	 * @generated
	 */
	EReference getEsmEntityStateModel_ForType();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.IEsmLayout <em>IEsm Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEsm Layout</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmLayout
	 * @generated
	 */
	EClass getIEsmLayout();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.esm.IEsmLayout#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmLayout#getDirection()
	 * @see #getIEsmLayout()
	 * @generated
	 */
	EAttribute getIEsmLayout_Direction();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.IEsmStateModel <em>IEsm State Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEsm State Model</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmStateModel
	 * @generated
	 */
	EClass getIEsmStateModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.esm.IEsmStateModel#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmStateModel#getStates()
	 * @see #getIEsmStateModel()
	 * @generated
	 */
	EReference getIEsmStateModel_States();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.esm.IEsmStateModel#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmStateModel#getTransitions()
	 * @see #getIEsmStateModel()
	 * @generated
	 */
	EReference getIEsmStateModel_Transitions();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.IEsmState <em>IEsm State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEsm State</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmState
	 * @generated
	 */
	EClass getIEsmState();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.esm.IEsmState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmState#getState()
	 * @see #getIEsmState()
	 * @generated
	 */
	EReference getIEsmState_State();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.esm.IEsmState#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmState#getKind()
	 * @see #getIEsmState()
	 * @generated
	 */
	EAttribute getIEsmState_Kind();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.esm.IEsmState#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see com.mimacom.ddd.dm.esm.IEsmState#getDescription()
	 * @see #getIEsmState()
	 * @generated
	 */
	EReference getIEsmState_Description();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.EsmState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmState
	 * @generated
	 */
	EClass getEsmState();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.EsmDerivedState <em>Derived State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived State</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmDerivedState
	 * @generated
	 */
	EClass getEsmDerivedState();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.esm.EsmDerivedState#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmDerivedState#getExpression()
	 * @see #getEsmDerivedState()
	 * @generated
	 */
	EReference getEsmDerivedState_Expression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.EsmCompositeState <em>Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite State</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmCompositeState
	 * @generated
	 */
	EClass getEsmCompositeState();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.EsmConcurrentState <em>Concurrent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrent State</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmConcurrentState
	 * @generated
	 */
	EClass getEsmConcurrentState();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.esm.EsmConcurrentState#getSubStates <em>Sub States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub States</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmConcurrentState#getSubStates()
	 * @see #getEsmConcurrentState()
	 * @generated
	 */
	EReference getEsmConcurrentState_SubStates();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.EsmSubStateModel <em>Sub State Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub State Model</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmSubStateModel
	 * @generated
	 */
	EClass getEsmSubStateModel();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.esm.EsmTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmTransition
	 * @generated
	 */
	EClass getEsmTransition();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.esm.EsmTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmTransition#getFrom()
	 * @see #getEsmTransition()
	 * @generated
	 */
	EReference getEsmTransition_From();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.esm.EsmTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmTransition#getTo()
	 * @see #getEsmTransition()
	 * @generated
	 */
	EReference getEsmTransition_To();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.esm.EsmTransition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmTransition#getEvent()
	 * @see #getEsmTransition()
	 * @generated
	 */
	EReference getEsmTransition_Event();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.esm.EsmTransition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmTransition#getGuard()
	 * @see #getEsmTransition()
	 * @generated
	 */
	EReference getEsmTransition_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.esm.EsmTransition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmTransition#getDescription()
	 * @see #getEsmTransition()
	 * @generated
	 */
	EReference getEsmTransition_Description();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.esm.EsmLayoutDirection <em>Layout Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Direction</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmLayoutDirection
	 * @generated
	 */
	EEnum getEsmLayoutDirection();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.esm.EsmStateKind <em>State Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Kind</em>'.
	 * @see com.mimacom.ddd.dm.esm.EsmStateKind
	 * @generated
	 */
	EEnum getEsmStateKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EsmFactory getEsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl <em>Entity State Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmEntityStateModel()
		 * @generated
		 */
		EClass ESM_ENTITY_STATE_MODEL = eINSTANCE.getEsmEntityStateModel();

		/**
		 * The meta object literal for the '<em><b>For Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESM_ENTITY_STATE_MODEL__FOR_TYPE = eINSTANCE.getEsmEntityStateModel_ForType();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.IEsmLayout <em>IEsm Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.IEsmLayout
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getIEsmLayout()
		 * @generated
		 */
		EClass IESM_LAYOUT = eINSTANCE.getIEsmLayout();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IESM_LAYOUT__DIRECTION = eINSTANCE.getIEsmLayout_Direction();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.IEsmStateModel <em>IEsm State Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.IEsmStateModel
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getIEsmStateModel()
		 * @generated
		 */
		EClass IESM_STATE_MODEL = eINSTANCE.getIEsmStateModel();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IESM_STATE_MODEL__STATES = eINSTANCE.getIEsmStateModel_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IESM_STATE_MODEL__TRANSITIONS = eINSTANCE.getIEsmStateModel_Transitions();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.impl.IEsmStateImpl <em>IEsm State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.impl.IEsmStateImpl
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getIEsmState()
		 * @generated
		 */
		EClass IESM_STATE = eINSTANCE.getIEsmState();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IESM_STATE__STATE = eINSTANCE.getIEsmState_State();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IESM_STATE__KIND = eINSTANCE.getIEsmState_Kind();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IESM_STATE__DESCRIPTION = eINSTANCE.getIEsmState_Description();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.impl.EsmStateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.impl.EsmStateImpl
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmState()
		 * @generated
		 */
		EClass ESM_STATE = eINSTANCE.getEsmState();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.impl.EsmDerivedStateImpl <em>Derived State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.impl.EsmDerivedStateImpl
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmDerivedState()
		 * @generated
		 */
		EClass ESM_DERIVED_STATE = eINSTANCE.getEsmDerivedState();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESM_DERIVED_STATE__EXPRESSION = eINSTANCE.getEsmDerivedState_Expression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.impl.EsmCompositeStateImpl <em>Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.impl.EsmCompositeStateImpl
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmCompositeState()
		 * @generated
		 */
		EClass ESM_COMPOSITE_STATE = eINSTANCE.getEsmCompositeState();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.impl.EsmConcurrentStateImpl <em>Concurrent State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.impl.EsmConcurrentStateImpl
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmConcurrentState()
		 * @generated
		 */
		EClass ESM_CONCURRENT_STATE = eINSTANCE.getEsmConcurrentState();

		/**
		 * The meta object literal for the '<em><b>Sub States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESM_CONCURRENT_STATE__SUB_STATES = eINSTANCE.getEsmConcurrentState_SubStates();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.impl.EsmSubStateModelImpl <em>Sub State Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.impl.EsmSubStateModelImpl
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmSubStateModel()
		 * @generated
		 */
		EClass ESM_SUB_STATE_MODEL = eINSTANCE.getEsmSubStateModel();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmTransition()
		 * @generated
		 */
		EClass ESM_TRANSITION = eINSTANCE.getEsmTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESM_TRANSITION__FROM = eINSTANCE.getEsmTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESM_TRANSITION__TO = eINSTANCE.getEsmTransition_To();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESM_TRANSITION__EVENT = eINSTANCE.getEsmTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESM_TRANSITION__GUARD = eINSTANCE.getEsmTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESM_TRANSITION__DESCRIPTION = eINSTANCE.getEsmTransition_Description();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.EsmLayoutDirection <em>Layout Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.EsmLayoutDirection
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmLayoutDirection()
		 * @generated
		 */
		EEnum ESM_LAYOUT_DIRECTION = eINSTANCE.getEsmLayoutDirection();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.esm.EsmStateKind <em>State Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.esm.EsmStateKind
		 * @see com.mimacom.ddd.dm.esm.impl.EsmPackageImpl#getEsmStateKind()
		 * @generated
		 */
		EEnum ESM_STATE_KIND = eINSTANCE.getEsmStateKind();

	}

} //EsmPackage
