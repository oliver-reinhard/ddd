/**
 */
package com.mimacom.ddd.dm.dem;

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
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemModelImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemModel()
	 * @generated
	 */
	int DEM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MODEL__NAME = BasePackage.DNAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MODEL__ALIASES = BasePackage.DNAMESPACE__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MODEL__DESCRIPTION = BasePackage.DNAMESPACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MODEL__IMPORTS = BasePackage.DNAMESPACE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MODEL__DOMAIN = BasePackage.DNAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MODEL_FEATURE_COUNT = BasePackage.DNAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_MODEL_OPERATION_COUNT = BasePackage.DNAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DDomainEventImpl <em>DDomain Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DDomainEventImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDDomainEvent()
	 * @generated
	 */
	int DDOMAIN_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__NAME = DEM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__ALIASES = DEM_MODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__DESCRIPTION = DEM_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__IMPORTS = DEM_MODEL__IMPORTS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__DOMAIN = DEM_MODEL__DOMAIN;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__NAVIGABLE_MEMBERS = DEM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__CONTEXT = DEM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__TRIGGER = DEM_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preconditions CNF</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__PRECONDITIONS_CNF = DEM_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Postconditions DNF</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__POSTCONDITIONS_DNF = DEM_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT__NOTIFICATIONS = DEM_MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>DDomain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT_FEATURE_COUNT = DEM_MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>DDomain Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDOMAIN_EVENT_OPERATION_COUNT = DEM_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DCaseConjunctionImpl <em>DCase Conjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DCaseConjunctionImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDCaseConjunction()
	 * @generated
	 */
	int DCASE_CONJUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCASE_CONJUNCTION__NAME = BasePackage.DNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCASE_CONJUNCTION__ALIASES = BasePackage.DNAMED_ELEMENT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCASE_CONJUNCTION__DESCRIPTION = BasePackage.DNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCASE_CONJUNCTION__SELECTOR = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Otherwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCASE_CONJUNCTION__OTHERWISE = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCASE_CONJUNCTION__PREDICATES = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DCase Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCASE_CONJUNCTION_FEATURE_COUNT = BasePackage.DNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DCase Conjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCASE_CONJUNCTION_OPERATION_COUNT = BasePackage.DNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DNotificationImpl <em>DNotification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DNotificationImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDNotification()
	 * @generated
	 */
	int DNOTIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__ALIASES = BasePackage.DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The feature id for the '<em><b>Navigable Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__NAVIGABLE_MEMBERS = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__MESSAGE = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION__NOTIFIED = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DNotification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DNotification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNOTIFICATION_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DMessageImpl <em>DMessage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DMessageImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDMessage()
	 * @generated
	 */
	int DMESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE__ALIASES = BasePackage.DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>DMessage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DMessage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMESSAGE_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DemActorModelImpl <em>Actor Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DemActorModelImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemActorModel()
	 * @generated
	 */
	int DEM_ACTOR_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__NAME = DEM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__ALIASES = DEM_MODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__DESCRIPTION = DEM_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__IMPORTS = DEM_MODEL__IMPORTS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__DOMAIN = DEM_MODEL__DOMAIN;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL__ACTORS = DEM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL_FEATURE_COUNT = DEM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEM_ACTOR_MODEL_OPERATION_COUNT = DEM_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DActorImpl <em>DActor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DActorImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDActor()
	 * @generated
	 */
	int DACTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__ALIASES = BasePackage.DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>DActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DACTOR_OPERATION_COUNT = BasePackage.DNAVIGABLE_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DHumanActorRoleImpl <em>DHuman Actor Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DHumanActorRoleImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDHumanActorRole()
	 * @generated
	 */
	int DHUMAN_ACTOR_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE__NAME = DACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE__ALIASES = DACTOR__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE__DESCRIPTION = DACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE__TYPE = DACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE__MULTIPLICITY = DACTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE__OPTIONAL = DACTOR__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE__COLLECTION = DACTOR__COLLECTION;

	/**
	 * The number of structural features of the '<em>DHuman Actor Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE_FEATURE_COUNT = DACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DHuman Actor Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DHUMAN_ACTOR_ROLE_OPERATION_COUNT = DACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dem.impl.DServiceImpl <em>DService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dem.impl.DServiceImpl
	 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDService()
	 * @generated
	 */
	int DSERVICE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__NAME = DACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__ALIASES = DACTOR__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__DESCRIPTION = DACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__TYPE = DACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__MULTIPLICITY = DACTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__OPTIONAL = DACTOR__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE__COLLECTION = DACTOR__COLLECTION;

	/**
	 * The number of structural features of the '<em>DService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_FEATURE_COUNT = DACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSERVICE_OPERATION_COUNT = DACTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DemModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemModel
	 * @generated
	 */
	EClass getDemModel();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dem.DemModel#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.mimacom.ddd.dm.dem.DemModel#getDomain()
	 * @see #getDemModel()
	 * @generated
	 */
	EAttribute getDemModel_Domain();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DDomainEvent <em>DDomain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDomain Event</em>'.
	 * @see com.mimacom.ddd.dm.dem.DDomainEvent
	 * @generated
	 */
	EClass getDDomainEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DDomainEvent#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see com.mimacom.ddd.dm.dem.DDomainEvent#getContext()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_Context();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dem.DDomainEvent#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see com.mimacom.ddd.dm.dem.DDomainEvent#getTrigger()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DDomainEvent#getPreconditionsCNF <em>Preconditions CNF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions CNF</em>'.
	 * @see com.mimacom.ddd.dm.dem.DDomainEvent#getPreconditionsCNF()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_PreconditionsCNF();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DDomainEvent#getPostconditionsDNF <em>Postconditions DNF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postconditions DNF</em>'.
	 * @see com.mimacom.ddd.dm.dem.DDomainEvent#getPostconditionsDNF()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_PostconditionsDNF();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DDomainEvent#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifications</em>'.
	 * @see com.mimacom.ddd.dm.dem.DDomainEvent#getNotifications()
	 * @see #getDDomainEvent()
	 * @generated
	 */
	EReference getDDomainEvent_Notifications();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DCaseConjunction <em>DCase Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCase Conjunction</em>'.
	 * @see com.mimacom.ddd.dm.dem.DCaseConjunction
	 * @generated
	 */
	EClass getDCaseConjunction();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dem.DCaseConjunction#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see com.mimacom.ddd.dm.dem.DCaseConjunction#getSelector()
	 * @see #getDCaseConjunction()
	 * @generated
	 */
	EReference getDCaseConjunction_Selector();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dem.DCaseConjunction#isOtherwise <em>Otherwise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Otherwise</em>'.
	 * @see com.mimacom.ddd.dm.dem.DCaseConjunction#isOtherwise()
	 * @see #getDCaseConjunction()
	 * @generated
	 */
	EAttribute getDCaseConjunction_Otherwise();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dem.DCaseConjunction#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see com.mimacom.ddd.dm.dem.DCaseConjunction#getPredicates()
	 * @see #getDCaseConjunction()
	 * @generated
	 */
	EReference getDCaseConjunction_Predicates();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DNotification <em>DNotification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNotification</em>'.
	 * @see com.mimacom.ddd.dm.dem.DNotification
	 * @generated
	 */
	EClass getDNotification();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dem.DNotification#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see com.mimacom.ddd.dm.dem.DNotification#getMessage()
	 * @see #getDNotification()
	 * @generated
	 */
	EReference getDNotification_Message();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dem.DNotification#getNotified <em>Notified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notified</em>'.
	 * @see com.mimacom.ddd.dm.dem.DNotification#getNotified()
	 * @see #getDNotification()
	 * @generated
	 */
	EReference getDNotification_Notified();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DMessage <em>DMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMessage</em>'.
	 * @see com.mimacom.ddd.dm.dem.DMessage
	 * @generated
	 */
	EClass getDMessage();

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
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DActor <em>DActor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DActor</em>'.
	 * @see com.mimacom.ddd.dm.dem.DActor
	 * @generated
	 */
	EClass getDActor();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DHumanActorRole <em>DHuman Actor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DHuman Actor Role</em>'.
	 * @see com.mimacom.ddd.dm.dem.DHumanActorRole
	 * @generated
	 */
	EClass getDHumanActorRole();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dem.DService <em>DService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DService</em>'.
	 * @see com.mimacom.ddd.dm.dem.DService
	 * @generated
	 */
	EClass getDService();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DemModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DemModelImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDemModel()
		 * @generated
		 */
		EClass DEM_MODEL = eINSTANCE.getDemModel();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEM_MODEL__DOMAIN = eINSTANCE.getDemModel_Domain();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DDomainEventImpl <em>DDomain Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DDomainEventImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDDomainEvent()
		 * @generated
		 */
		EClass DDOMAIN_EVENT = eINSTANCE.getDDomainEvent();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__CONTEXT = eINSTANCE.getDDomainEvent_Context();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__TRIGGER = eINSTANCE.getDDomainEvent_Trigger();

		/**
		 * The meta object literal for the '<em><b>Preconditions CNF</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__PRECONDITIONS_CNF = eINSTANCE.getDDomainEvent_PreconditionsCNF();

		/**
		 * The meta object literal for the '<em><b>Postconditions DNF</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__POSTCONDITIONS_DNF = eINSTANCE.getDDomainEvent_PostconditionsDNF();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDOMAIN_EVENT__NOTIFICATIONS = eINSTANCE.getDDomainEvent_Notifications();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DCaseConjunctionImpl <em>DCase Conjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DCaseConjunctionImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDCaseConjunction()
		 * @generated
		 */
		EClass DCASE_CONJUNCTION = eINSTANCE.getDCaseConjunction();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCASE_CONJUNCTION__SELECTOR = eINSTANCE.getDCaseConjunction_Selector();

		/**
		 * The meta object literal for the '<em><b>Otherwise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCASE_CONJUNCTION__OTHERWISE = eINSTANCE.getDCaseConjunction_Otherwise();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCASE_CONJUNCTION__PREDICATES = eINSTANCE.getDCaseConjunction_Predicates();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DNotificationImpl <em>DNotification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DNotificationImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDNotification()
		 * @generated
		 */
		EClass DNOTIFICATION = eINSTANCE.getDNotification();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNOTIFICATION__MESSAGE = eINSTANCE.getDNotification_Message();

		/**
		 * The meta object literal for the '<em><b>Notified</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNOTIFICATION__NOTIFIED = eINSTANCE.getDNotification_Notified();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DMessageImpl <em>DMessage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DMessageImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDMessage()
		 * @generated
		 */
		EClass DMESSAGE = eINSTANCE.getDMessage();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DActorImpl <em>DActor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DActorImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDActor()
		 * @generated
		 */
		EClass DACTOR = eINSTANCE.getDActor();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DHumanActorRoleImpl <em>DHuman Actor Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DHumanActorRoleImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDHumanActorRole()
		 * @generated
		 */
		EClass DHUMAN_ACTOR_ROLE = eINSTANCE.getDHumanActorRole();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dem.impl.DServiceImpl <em>DService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dem.impl.DServiceImpl
		 * @see com.mimacom.ddd.dm.dem.impl.DemPackageImpl#getDService()
		 * @generated
		 */
		EClass DSERVICE = eINSTANCE.getDService();

	}

} //DemPackage
