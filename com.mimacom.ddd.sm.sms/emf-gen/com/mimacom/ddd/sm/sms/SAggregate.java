/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sms.SAggregate#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSAggregate()
 * @model
 * @generated
 */
public interface SAggregate extends EObject
{
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sms.SType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSAggregate_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<SType> getTypes();

} // SAggregate