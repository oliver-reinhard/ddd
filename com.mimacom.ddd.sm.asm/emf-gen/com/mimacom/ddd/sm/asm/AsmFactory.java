/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.sm.asm.AsmPackage
 * @generated
 */
public interface AsmFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsmFactory eINSTANCE = com.mimacom.ddd.sm.asm.impl.AsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>SApplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SApplication</em>'.
	 * @generated
	 */
	SApplication createSApplication();

	/**
	 * Returns a new object of class '<em>SService Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SService Interface</em>'.
	 * @generated
	 */
	SServiceInterface createSServiceInterface();

	/**
	 * Returns a new object of class '<em>SWatchdog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SWatchdog</em>'.
	 * @generated
	 */
	SWatchdog createSWatchdog();

	/**
	 * Returns a new object of class '<em>SHuman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SHuman</em>'.
	 * @generated
	 */
	SHuman createSHuman();

	/**
	 * Returns a new object of class '<em>SService Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SService Operation</em>'.
	 * @generated
	 */
	SServiceOperation createSServiceOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AsmPackage getAsmPackage();

} //AsmFactory
