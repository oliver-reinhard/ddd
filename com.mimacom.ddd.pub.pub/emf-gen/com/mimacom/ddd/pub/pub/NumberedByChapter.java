/**
 */
package com.mimacom.ddd.pub.pub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numbered By Chapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.NumberedByChapter#getLogicalContainer <em>Logical Container</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.NumberedByChapter#getSequenceNumberInChapter <em>Sequence Number In Chapter</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getNumberedByChapter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NumberedByChapter extends Numbered {
	/**
	 * Returns the value of the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Container</em>' reference.
	 * @see #setLogicalContainer(Chapter)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getNumberedByChapter_LogicalContainer()
	 * @model transient="true"
	 * @generated
	 */
	Chapter getLogicalContainer();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.NumberedByChapter#getLogicalContainer <em>Logical Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Container</em>' reference.
	 * @see #getLogicalContainer()
	 * @generated
	 */
	void setLogicalContainer(Chapter value);

	/**
	 * Returns the value of the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number In Chapter</em>' attribute.
	 * @see #setSequenceNumberInChapter(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getNumberedByChapter_SequenceNumberInChapter()
	 * @model default="-1" unique="false" transient="true"
	 * @generated
	 */
	int getSequenceNumberInChapter();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.NumberedByChapter#getSequenceNumberInChapter <em>Sequence Number In Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number In Chapter</em>' attribute.
	 * @see #getSequenceNumberInChapter()
	 * @generated
	 */
	void setSequenceNumberInChapter(int value);

} // NumberedByChapter
