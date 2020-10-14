/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.transpose.TInformationModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Information Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SystemInformationModel#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SystemInformationModel#isGenerate <em>Generate</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSystemInformationModel()
 * @model
 * @generated
 */
public interface SystemInformationModel extends TInformationModel
{
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.sm.sim.SystemInformationModelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SystemInformationModelKind
	 * @see #setKind(SystemInformationModelKind)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSystemInformationModel_Kind()
	 * @model
	 * @generated
	 */
	SystemInformationModelKind getKind();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SystemInformationModel#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SystemInformationModelKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SystemInformationModelKind value);

	/**
	 * Returns the value of the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate</em>' attribute.
	 * @see #setGenerate(boolean)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSystemInformationModel_Generate()
	 * @model
	 * @generated
	 */
	boolean isGenerate();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SystemInformationModel#isGenerate <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate</em>' attribute.
	 * @see #isGenerate()
	 * @generated
	 */
	void setGenerate(boolean value);

} // SystemInformationModel
