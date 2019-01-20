/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMultiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DMultiplicity#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DMultiplicity#getMaxOccurs <em>Max Occurs</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDMultiplicity()
 * @model
 * @generated
 */
public interface DMultiplicity extends EObject
{
	/**
	 * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occurs</em>' attribute.
	 * @see #setMinOccurs(int)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDMultiplicity_MinOccurs()
	 * @model
	 * @generated
	 */
	int getMinOccurs();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DMultiplicity#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurs</em>' attribute.
	 * @see #getMinOccurs()
	 * @generated
	 */
	void setMinOccurs(int value);

	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see #setMaxOccurs(int)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDMultiplicity_MaxOccurs()
	 * @model
	 * @generated
	 */
	int getMaxOccurs();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DMultiplicity#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(int value);

} // DMultiplicity
