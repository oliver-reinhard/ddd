/**
 */
package com.mimacom.ddd.dm.base.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNote#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNote#getText <em>Text</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNote#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNote()
 * @model
 * @generated
 */
public interface DNote extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNote_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNote#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(DRichText)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNote_Text()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNote#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(DRichText value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.base.DNoteColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.base.DNoteColor
	 * @see #setColor(DNoteColor)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNote_Color()
	 * @model
	 * @generated
	 */
	DNoteColor getColor();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNote#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.base.DNoteColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(DNoteColor value);

} // DNote
