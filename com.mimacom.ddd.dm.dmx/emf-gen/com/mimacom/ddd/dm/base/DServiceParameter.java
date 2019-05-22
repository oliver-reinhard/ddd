/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DService Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DServiceParameter#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDServiceParameter()
 * @model
 * @generated
 */
public interface DServiceParameter extends DTypedMember
{
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.DDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DDirection
	 * @see #setDirection(DDirection)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDServiceParameter_Direction()
	 * @model
	 * @generated
	 */
	DDirection getDirection();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DServiceParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DDirection value);

} // DServiceParameter
