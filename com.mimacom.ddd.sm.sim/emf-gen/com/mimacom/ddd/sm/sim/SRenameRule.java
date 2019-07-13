/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DDeductionRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRename Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SRenameRule#getRenameTo <em>Rename To</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSRenameRule()
 * @model abstract="true"
 * @generated
 */
public interface SRenameRule extends DDeductionRule
{
	/**
	 * Returns the value of the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rename To</em>' attribute.
	 * @see #setRenameTo(String)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSRenameRule_RenameTo()
	 * @model
	 * @generated
	 */
	String getRenameTo();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SRenameRule#getRenameTo <em>Rename To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename To</em>' attribute.
	 * @see #getRenameTo()
	 * @generated
	 */
	void setRenameTo(String value);

} // SRenameRule
