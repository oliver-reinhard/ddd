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
	 * Returns a new object of class '<em>DDomain Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDomain Event</em>'.
	 * @generated
	 */
	DDomainEvent createDDomainEvent();

	/**
	 * Returns a new object of class '<em>DCase Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCase Conjunction</em>'.
	 * @generated
	 */
	DCaseConjunction createDCaseConjunction();

	/**
	 * Returns a new object of class '<em>DNotification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DNotification</em>'.
	 * @generated
	 */
	DNotification createDNotification();

	/**
	 * Returns a new object of class '<em>DMessage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMessage</em>'.
	 * @generated
	 */
	DMessage createDMessage();

	/**
	 * Returns a new object of class '<em>DHuman Actor Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DHuman Actor Role</em>'.
	 * @generated
	 */
	DHumanActorRole createDHumanActorRole();

	/**
	 * Returns a new object of class '<em>DService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DService</em>'.
	 * @generated
	 */
	DService createDService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DemPackage getDemPackage();

} //DemFactory
