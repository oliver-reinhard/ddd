/**
 */
package com.mimacom.ddd.dm.dem;

import com.mimacom.ddd.dm.base.DNamespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemModel#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemModel()
 * @model abstract="true"
 * @generated
 */
public interface DemModel extends DNamespace
{
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemModel_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dem.DemModel#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

} // DemModel
