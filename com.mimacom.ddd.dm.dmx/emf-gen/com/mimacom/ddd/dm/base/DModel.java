/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DModel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DModel#getGlobalTypes <em>Global Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DModel#getGlobalFunctions <em>Global Functions</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DModel#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDModel()
 * @model
 * @generated
 */
public interface DModel extends INamespace
{
	/**
	 * Returns the value of the '<em><b>Global Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.IValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Types</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDModel_GlobalTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<IValueType> getGlobalTypes();

	/**
	 * Returns the value of the '<em><b>Global Functions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Functions</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDModel_GlobalFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFunction> getGlobalFunctions();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(DDomain)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDModel_Domain()
	 * @model containment="true"
	 * @generated
	 */
	DDomain getDomain();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DModel#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DDomain value);

} // DModel
