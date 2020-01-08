/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.ChangeHistory#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getChangeHistory()
 * @model
 * @generated
 */
public interface ChangeHistory extends SegmentWithTable {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.ChangeDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getChangeHistory_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangeDescription> getEntries();

} // ChangeHistory
