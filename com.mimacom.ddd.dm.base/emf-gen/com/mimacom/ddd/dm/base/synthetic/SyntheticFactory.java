/**
 */
package com.mimacom.ddd.dm.base.synthetic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.synthetic.SyntheticPackage
 * @generated
 */
public interface SyntheticFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyntheticFactory eINSTANCE = com.mimacom.ddd.dm.base.synthetic.impl.SyntheticFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TSynthetic Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Aggregate</em>'.
	 * @generated
	 */
	TSyntheticAggregate createTSyntheticAggregate();

	/**
	 * Returns a new object of class '<em>TSynthetic Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Primitive</em>'.
	 * @generated
	 */
	TSyntheticPrimitive createTSyntheticPrimitive();

	/**
	 * Returns a new object of class '<em>TSynthetic Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Enumeration</em>'.
	 * @generated
	 */
	TSyntheticEnumeration createTSyntheticEnumeration();

	/**
	 * Returns a new object of class '<em>TSynthetic Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Literal</em>'.
	 * @generated
	 */
	TSyntheticLiteral createTSyntheticLiteral();

	/**
	 * Returns a new object of class '<em>TSynthetic Detail Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Detail Type</em>'.
	 * @generated
	 */
	TSyntheticDetailType createTSyntheticDetailType();

	/**
	 * Returns a new object of class '<em>TSynthetic Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Entity Type</em>'.
	 * @generated
	 */
	TSyntheticEntityType createTSyntheticEntityType();

	/**
	 * Returns a new object of class '<em>TSynthetic Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Association</em>'.
	 * @generated
	 */
	TSyntheticAssociation createTSyntheticAssociation();

	/**
	 * Returns a new object of class '<em>TSynthetic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Attribute</em>'.
	 * @generated
	 */
	TSyntheticAttribute createTSyntheticAttribute();

	/**
	 * Returns a new object of class '<em>TSynthetic Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Query</em>'.
	 * @generated
	 */
	TSyntheticQuery createTSyntheticQuery();

	/**
	 * Returns a new object of class '<em>TSynthetic Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSynthetic Query Parameter</em>'.
	 * @generated
	 */
	TSyntheticQueryParameter createTSyntheticQueryParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SyntheticPackage getSyntheticPackage();

} //SyntheticFactory
