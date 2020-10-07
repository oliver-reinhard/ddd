/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.transpose.TInformationModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SInformation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SInformationModel#isGenerate <em>Generate</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel()
 * @model
 * @generated
 */
public interface SInformationModel extends TInformationModel
{
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.sm.sim.SInformationModelKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SInformationModelKind
	 * @see #setKind(SInformationModelKind)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Kind()
	 * @model
	 * @generated
	 */
	SInformationModelKind getKind();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SInformationModel#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SInformationModelKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SInformationModelKind value);

	/**
	 * Returns the value of the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate</em>' attribute.
	 * @see #setGenerate(boolean)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSInformationModel_Generate()
	 * @model
	 * @generated
	 */
	boolean isGenerate();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SInformationModel#isGenerate <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate</em>' attribute.
	 * @see #isGenerate()
	 * @generated
	 */
	void setGenerate(boolean value);

} // SInformationModel
