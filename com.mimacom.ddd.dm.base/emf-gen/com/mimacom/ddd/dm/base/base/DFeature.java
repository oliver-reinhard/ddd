/**
 */
package com.mimacom.ddd.dm.base.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFeature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DFeature#isReadOnlyView <em>Read Only View</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDFeature()
 * @model abstract="true"
 * @generated
 */
public interface DFeature extends DNavigableMember
{
	/**
	 * Returns the value of the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only View</em>' attribute.
	 * @see #setReadOnlyView(boolean)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDFeature_ReadOnlyView()
	 * @model
	 * @generated
	 */
	boolean isReadOnlyView();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DFeature#isReadOnlyView <em>Read Only View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only View</em>' attribute.
	 * @see #isReadOnlyView()
	 * @generated
	 */
	void setReadOnlyView(boolean value);

} // DFeature
