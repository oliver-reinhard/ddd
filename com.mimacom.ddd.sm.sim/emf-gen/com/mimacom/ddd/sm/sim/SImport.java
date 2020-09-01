/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DImport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SImport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SImport#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSImport()
 * @model
 * @generated
 */
public interface SImport extends DImport
{
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(SInformationModel)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSImport_Model()
	 * @model
	 * @generated
	 */
	SInformationModel getModel();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SImport#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(SInformationModel value);

} // SImport
