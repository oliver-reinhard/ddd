/**
 */
package com.mimacom.ddd.dm.dem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dem.DemPackage
 * @generated
 */
public interface DemFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemFactory eINSTANCE = com.mimacom.ddd.dm.dem.impl.DemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Event</em>'.
	 * @generated
	 */
	DemDomainEvent createDemDomainEvent();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	DemTrigger createDemTrigger();

	/**
	 * Returns a new object of class '<em>Case Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Conjunction</em>'.
	 * @generated
	 */
	DemCaseConjunction createDemCaseConjunction();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	DemNotification createDemNotification();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	DemMessage createDemMessage();

	/**
	 * Returns a new object of class '<em>Actor Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Model</em>'.
	 * @generated
	 */
	DemActorModel createDemActorModel();

	/**
	 * Returns a new object of class '<em>Human Actor Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Actor Role</em>'.
	 * @generated
	 */
	DemHumanActorRole createDemHumanActorRole();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	DemService createDemService();

	/**
	 * Returns a new object of class '<em>Events Overview Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Events Overview Model</em>'.
	 * @generated
	 */
	DemEventsOverviewModel createDemEventsOverviewModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DemPackage getDemPackage();

} //DemFactory
