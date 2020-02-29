/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numbered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Numbered#getLevel <em>Level</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Numbered#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getNumbered()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Numbered extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getNumbered_Level()
	 * @model default="-1" unique="false" transient="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Numbered#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getNumbered_SequenceNumber()
	 * @model default="-1" unique="false" transient="true"
	 * @generated
	 */
	int getSequenceNumber();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Numbered#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(int value);

} // Numbered
