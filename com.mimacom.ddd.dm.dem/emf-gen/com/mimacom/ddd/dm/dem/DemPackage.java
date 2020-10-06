/**
 */
package com.mimacom.ddd.dm.dem;

import com.mimacom.ddd.dm.base.base.BasePackage;

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
 * @see com.mimacom.ddd.dm.dem.DemFactory
 * @model kind="package"
 * @generated
 */
public interface DemPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/dem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemPackage eINSTANCE = com.mimacom.ddd.dm.dem.impl.DemPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl <em>Domain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemDomainEvent()
	 * @generated
	 */
	int DEM_DOMAIN_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__NAME = BasePackage.DMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__ALIASES = BasePackage.DMODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__DESCRIPTION = BasePackage.DMODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__NAVIGABLE_MEMBERS = BasePackage.DMODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__CONTEXT = BasePackage.DMODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__TRIGGERS = BasePackage.DMODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preconditions CNF</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__PRECONDITIONS_CNF = BasePackage.DMODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Postconditions DNF</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF = BasePackage.DMODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT__NOTIFICATIONS = BasePackage.DMODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT_FEATURE_COUNT = BasePackage.DMODEL_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Domain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_DOMAIN_EVENT_OPERATION_COUNT = BasePackage.DMODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemCaseConjunctionImpl <em>Case Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemCaseConjunctionImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemCaseConjunction()
	 * @generated
	 */
	int DEM_CASE_CONJUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_CASE_CONJUNCTION__NAME = BasePackage.DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_CASE_CONJUNCTION__ALIASES = BasePackage.DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_CASE_CONJUNCTION__DESCRIPTION = BasePackage.DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_CASE_CONJUNCTION__SELECTOR = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_CASE_CONJUNCTION__OTHERWISE = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_CASE_CONJUNCTION__PREDICATES = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_CASE_CONJUNCTION_FEATURE_COUNT = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Case Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_CASE_CONJUNCTION_OPERATION_COUNT = BasePackage.DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemNotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemNotificationImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemNotification()
	 * @generated
	 */
	int DEM_NOTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__ALIASES = BasePackage.DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__NAVIGABLE_MEMBERS = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__MESSAGE = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION__NOTIFIED = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_NOTIFICATION_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemMessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemMessageImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemMessage()
	 * @generated
	 */
	int DEM_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE__ALIASES = BasePackage.DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MESSAGE_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemActorModelImpl <em>Actor Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemActorModelImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemActorModel()
	 * @generated
	 */
	int DEM_ACTOR_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__NAME = BasePackage.DMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__ALIASES = BasePackage.DMODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__DESCRIPTION = BasePackage.DMODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__ACTORS = BasePackage.DMODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL_FEATURE_COUNT = BasePackage.DMODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL_OPERATION_COUNT = BasePackage.DMODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemActorImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemActor()
	 * @generated
	 */
	int DEM_ACTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR__ALIASES = BasePackage.DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemHumanActorRoleImpl <em>Human Actor Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemHumanActorRoleImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemHumanActorRole()
	 * @generated
	 */
	int DEM_HUMAN_ACTOR_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE__NAME = DEM_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE__ALIASES = DEM_ACTOR__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE__DESCRIPTION = DEM_ACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE__TYPE = DEM_ACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE__MULTIPLICITY = DEM_ACTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE__OPTIONAL = DEM_ACTOR__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE__COLLECTION = DEM_ACTOR__COLLECTION;

	/**
	 * The number of structural features of the '<em>Human Actor Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE_FEATURE_COUNT = DEM_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Human Actor Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_HUMAN_ACTOR_ROLE_OPERATION_COUNT = DEM_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemServiceImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemService()
	 * @generated
	 */
	int DEM_SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE__NAME = DEM_ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE__ALIASES = DEM_ACTOR__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE__DESCRIPTION = DEM_ACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE__TYPE = DEM_ACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE__MULTIPLICITY = DEM_ACTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE__OPTIONAL = DEM_ACTOR__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE__COLLECTION = DEM_ACTOR__COLLECTION;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE_FEATURE_COUNT = DEM_ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_SERVICE_OPERATION_COUNT = DEM_ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemEventsOverviewModelImpl <em>Events Overview Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemEventsOverviewModelImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemEventsOverviewModel()
	 * @generated
	 */
	int DEM_EVENTS_OVERVIEW_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_EVENTS_OVERVIEW_MODEL__NAME = BasePackage.DMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_EVENTS_OVERVIEW_MODEL__ALIASES = BasePackage.DMODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_EVENTS_OVERVIEW_MODEL__DESCRIPTION = BasePackage.DMODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_EVENTS_OVERVIEW_MODEL__ALL = BasePackage.DMODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_EVENTS_OVERVIEW_MODEL__INCLUDE = BasePackage.DMODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_EVENTS_OVERVIEW_MODEL__EXCLUDE = BasePackage.DMODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Events Overview Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_EVENTS_OVERVIEW_MODEL_FEATURE_COUNT = BasePackage.DMODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Events Overview Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_EVENTS_OVERVIEW_MODEL_OPERATION_COUNT = BasePackage.DMODEL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemDomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Event</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemDomainEvent
	 * @generated
	 */
	EClass getDemDomainEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemDomainEvent#getContext()
	 * @see #getDemDomainEvent()
	 * @generated
	 */
	EReference getDemDomainEvent_Context();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggers</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemDomainEvent#getTriggers()
	 * @see #getDemDomainEvent()
	 * @generated
	 */
	EReference getDemDomainEvent_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getPreconditionsCNF <em>Preconditions CNF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions CNF</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemDomainEvent#getPreconditionsCNF()
	 * @see #getDemDomainEvent()
	 * @generated
	 */
	EReference getDemDomainEvent_PreconditionsCNF();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getPostconditionsDNF <em>Postconditions DNF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postconditions DNF</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemDomainEvent#getPostconditionsDNF()
	 * @see #getDemDomainEvent()
	 * @generated
	 */
	EReference getDemDomainEvent_PostconditionsDNF();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifications</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemDomainEvent#getNotifications()
	 * @see #getDemDomainEvent()
	 * @generated
	 */
	EReference getDemDomainEvent_Notifications();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemCaseConjunction <em>Case Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Conjunction</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemCaseConjunction
	 * @generated
	 */
	EClass getDemCaseConjunction();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dem.DemCaseConjunction#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemCaseConjunction#getSelector()
	 * @see #getDemCaseConjunction()
	 * @generated
	 */
	EReference getDemCaseConjunction_Selector();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dem.DemCaseConjunction#isOtherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Otherwise</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemCaseConjunction#isOtherwise()
	 * @see #getDemCaseConjunction()
	 * @generated
	 */
	EAttribute getDemCaseConjunction_Otherwise();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DemCaseConjunction#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemCaseConjunction#getPredicates()
	 * @see #getDemCaseConjunction()
	 * @generated
	 */
	EReference getDemCaseConjunction_Predicates();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemNotification
	 * @generated
	 */
	EClass getDemNotification();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dem.DemNotification#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemNotification#getMessage()
	 * @see #getDemNotification()
	 * @generated
	 */
	EReference getDemNotification_Message();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dem.DemNotification#getNotified <em>Notified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notified</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemNotification#getNotified()
	 * @see #getDemNotification()
	 * @generated
	 */
	EReference getDemNotification_Notified();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemMessage
	 * @generated
	 */
	EClass getDemMessage();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemActorModel <em>Actor Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Model</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemActorModel
	 * @generated
	 */
	EClass getDemActorModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DemActorModel#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemActorModel#getActors()
	 * @see #getDemActorModel()
	 * @generated
	 */
	EReference getDemActorModel_Actors();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemActor
	 * @generated
	 */
	EClass getDemActor();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemHumanActorRole <em>Human Actor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Actor Role</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemHumanActorRole
	 * @generated
	 */
	EClass getDemHumanActorRole();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemService
	 * @generated
	 */
	EClass getDemService();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel <em>Events Overview Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Events Overview Model</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemEventsOverviewModel
	 * @generated
	 */
	EClass getDemEventsOverviewModel();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel#isAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemEventsOverviewModel#isAll()
	 * @see #getDemEventsOverviewModel()
	 * @generated
	 */
	EAttribute getDemEventsOverviewModel_All();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Include</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemEventsOverviewModel#getInclude()
	 * @see #getDemEventsOverviewModel()
	 * @generated
	 */
	EReference getDemEventsOverviewModel_Include();

	/**
	 * Returns the meta object for the reference list '{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclude</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemEventsOverviewModel#getExclude()
	 * @see #getDemEventsOverviewModel()
	 * @generated
	 */
	EReference getDemEventsOverviewModel_Exclude();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DemFactory getDemFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl <em>Domain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemDomainEvent()
		 * @generated
		 */
		EClass DEM_DOMAIN_EVENT = eINSTANCE.getDemDomainEvent();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_DOMAIN_EVENT__CONTEXT = eINSTANCE.getDemDomainEvent_Context();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_DOMAIN_EVENT__TRIGGERS = eINSTANCE.getDemDomainEvent_Triggers();

		/**
		 * The meta object literal for the '<em><b>Preconditions CNF</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_DOMAIN_EVENT__PRECONDITIONS_CNF = eINSTANCE.getDemDomainEvent_PreconditionsCNF();

		/**
		 * The meta object literal for the '<em><b>Postconditions DNF</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF = eINSTANCE.getDemDomainEvent_PostconditionsDNF();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_DOMAIN_EVENT__NOTIFICATIONS = eINSTANCE.getDemDomainEvent_Notifications();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemCaseConjunctionImpl <em>Case Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemCaseConjunctionImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemCaseConjunction()
		 * @generated
		 */
		EClass DEM_CASE_CONJUNCTION = eINSTANCE.getDemCaseConjunction();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_CASE_CONJUNCTION__SELECTOR = eINSTANCE.getDemCaseConjunction_Selector();

		/**
		 * The meta object literal for the '<em><b>Otherwise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEM_CASE_CONJUNCTION__OTHERWISE = eINSTANCE.getDemCaseConjunction_Otherwise();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_CASE_CONJUNCTION__PREDICATES = eINSTANCE.getDemCaseConjunction_Predicates();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemNotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemNotificationImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemNotification()
		 * @generated
		 */
		EClass DEM_NOTIFICATION = eINSTANCE.getDemNotification();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_NOTIFICATION__MESSAGE = eINSTANCE.getDemNotification_Message();

		/**
		 * The meta object literal for the '<em><b>Notified</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_NOTIFICATION__NOTIFIED = eINSTANCE.getDemNotification_Notified();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemMessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemMessageImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemMessage()
		 * @generated
		 */
		EClass DEM_MESSAGE = eINSTANCE.getDemMessage();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemActorModelImpl <em>Actor Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemActorModelImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemActorModel()
		 * @generated
		 */
		EClass DEM_ACTOR_MODEL = eINSTANCE.getDemActorModel();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_ACTOR_MODEL__ACTORS = eINSTANCE.getDemActorModel_Actors();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemActorImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemActor()
		 * @generated
		 */
		EClass DEM_ACTOR = eINSTANCE.getDemActor();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemHumanActorRoleImpl <em>Human Actor Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemHumanActorRoleImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemHumanActorRole()
		 * @generated
		 */
		EClass DEM_HUMAN_ACTOR_ROLE = eINSTANCE.getDemHumanActorRole();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemServiceImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemService()
		 * @generated
		 */
		EClass DEM_SERVICE = eINSTANCE.getDemService();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemEventsOverviewModelImpl <em>Events Overview Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemEventsOverviewModelImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemEventsOverviewModel()
		 * @generated
		 */
		EClass DEM_EVENTS_OVERVIEW_MODEL = eINSTANCE.getDemEventsOverviewModel();

		/**
		 * The meta object literal for the '<em><b>All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEM_EVENTS_OVERVIEW_MODEL__ALL = eINSTANCE.getDemEventsOverviewModel_All();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_EVENTS_OVERVIEW_MODEL__INCLUDE = eINSTANCE.getDemEventsOverviewModel_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEM_EVENTS_OVERVIEW_MODEL__EXCLUDE = eINSTANCE.getDemEventsOverviewModel_Exclude();

	}

} //DemPackage
