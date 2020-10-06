/**
 */
package com.mimacom.ddd.sm.sim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.sm.sim.SimPackage
 * @generated
 */
public interface SimFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimFactory eINSTANCE = com.mimacom.ddd.sm.sim.impl.SimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SInformation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SInformation Model</em>'.
	 * @generated
	 */
	SInformationModel createSInformationModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimPackage getSimPackage();

} //SimFactory
