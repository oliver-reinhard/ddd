/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dom.DomPackage
 * @generated
 */
public interface DomFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomFactory eINSTANCE = com.mimacom.ddd.dm.dom.impl.DomFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	DomModel createDomModel();

	/**
	 * Returns a new object of class '<em>Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snapshot</em>'.
	 * @generated
	 */
	DomSnapshot createDomSnapshot();

	/**
	 * Returns a new object of class '<em>Named Complex Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Complex Object</em>'.
	 * @generated
	 */
	DomNamedComplexObject createDomNamedComplexObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomPackage getDomPackage();

} //DomFactory
