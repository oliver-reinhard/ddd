/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.BasePackage
 * @generated
 */
public interface BaseFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaseFactory eINSTANCE = com.mimacom.ddd.dm.base.impl.BaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DText Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DText Segment</em>'.
	 * @generated
	 */
	DTextSegment createDTextSegment();

	/**
	 * Returns a new object of class '<em>DRich Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DRich Text</em>'.
	 * @generated
	 */
	DRichText createDRichText();

	/**
	 * Returns a new object of class '<em>DImport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DImport</em>'.
	 * @generated
	 */
	DImport createDImport();

	/**
	 * Returns a new object of class '<em>DDomain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDomain</em>'.
	 * @generated
	 */
	DDomain createDDomain();

	/**
	 * Returns a new object of class '<em>DAggregate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAggregate</em>'.
	 * @generated
	 */
	DAggregate createDAggregate();

	/**
	 * Returns a new object of class '<em>DNamed Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DNamed Predicate</em>'.
	 * @generated
	 */
	DNamedPredicate createDNamedPredicate();

	/**
	 * Returns a new object of class '<em>DPrimitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DPrimitive</em>'.
	 * @generated
	 */
	DPrimitive createDPrimitive();

	/**
	 * Returns a new object of class '<em>DEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DEnumeration</em>'.
	 * @generated
	 */
	DEnumeration createDEnumeration();

	/**
	 * Returns a new object of class '<em>DLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DLiteral</em>'.
	 * @generated
	 */
	DLiteral createDLiteral();

	/**
	 * Returns a new object of class '<em>DDetail Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDetail Type</em>'.
	 * @generated
	 */
	DDetailType createDDetailType();

	/**
	 * Returns a new object of class '<em>DEntity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DEntity Type</em>'.
	 * @generated
	 */
	DEntityType createDEntityType();

	/**
	 * Returns a new object of class '<em>DAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAssociation</em>'.
	 * @generated
	 */
	DAssociation createDAssociation();

	/**
	 * Returns a new object of class '<em>DMultiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMultiplicity</em>'.
	 * @generated
	 */
	DMultiplicity createDMultiplicity();

	/**
	 * Returns a new object of class '<em>DAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAttribute</em>'.
	 * @generated
	 */
	DAttribute createDAttribute();

	/**
	 * Returns a new object of class '<em>DQuery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DQuery</em>'.
	 * @generated
	 */
	DQuery createDQuery();

	/**
	 * Returns a new object of class '<em>DQuery Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DQuery Parameter</em>'.
	 * @generated
	 */
	DQueryParameter createDQueryParameter();

	/**
	 * Returns a new object of class '<em>DState</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DState</em>'.
	 * @generated
	 */
	DState createDState();

	/**
	 * Returns a new object of class '<em>DState Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DState Event</em>'.
	 * @generated
	 */
	DStateEvent createDStateEvent();

	/**
	 * Returns a new object of class '<em>DContext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DContext</em>'.
	 * @generated
	 */
	DContext createDContext();

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
	BasePackage getBasePackage();

} //BaseFactory
