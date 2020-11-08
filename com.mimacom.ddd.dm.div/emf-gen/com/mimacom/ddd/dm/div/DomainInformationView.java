/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.div;

import com.mimacom.ddd.dm.base.transpose.TInformationModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Information View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.div.DomainInformationView#isReadOnlyView <em>Read Only View</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.div.DivPackage#getDomainInformationView()
 * @model
 * @generated
 */
public interface DomainInformationView extends TInformationModel
{
	/**
	 * Returns the value of the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only View</em>' attribute.
	 * @see #setReadOnlyView(boolean)
	 * @see com.mimacom.ddd.dm.div.DivPackage#getDomainInformationView_ReadOnlyView()
	 * @model
	 * @generated
	 */
	boolean isReadOnlyView();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.div.DomainInformationView#isReadOnlyView <em>Read Only View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only View</em>' attribute.
	 * @see #isReadOnlyView()
	 * @generated
	 */
	void setReadOnlyView(boolean value);

} // DomainInformationView
