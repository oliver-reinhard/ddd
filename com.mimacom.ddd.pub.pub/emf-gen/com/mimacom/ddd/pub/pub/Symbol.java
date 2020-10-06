/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Symbol#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends DNamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DRichText)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getSymbol_Value()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getValue();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Symbol#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DRichText value);

} // Symbol
