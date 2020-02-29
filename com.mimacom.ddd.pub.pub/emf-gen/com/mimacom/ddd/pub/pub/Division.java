/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Division#getStartNumberingAt <em>Start Numbering At</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Division#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Division#getInclude <em>Include</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Division#getLogicalContainer <em>Logical Container</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getDivision()
 * @model abstract="true"
 * @generated
 */
public interface Division extends DivisionContainer, BlockContainer, Numbered, ReferenceTarget {
	/**
	 * Returns the value of the '<em><b>Start Numbering At</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Numbering At</em>' attribute.
	 * @see #setStartNumberingAt(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDivision_StartNumberingAt()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getStartNumberingAt();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Division#getStartNumberingAt <em>Start Numbering At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Numbering At</em>' attribute.
	 * @see #getStartNumberingAt()
	 * @generated
	 */
	void setStartNumberingAt(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(DRichText)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDivision_Title()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Division#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(DRichText value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' reference.
	 * @see #setInclude(Division)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDivision_Include()
	 * @model
	 * @generated
	 */
	Division getInclude();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Division#getInclude <em>Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(Division value);

	/**
	 * Returns the value of the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Container</em>' reference.
	 * @see #setLogicalContainer(Division)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDivision_LogicalContainer()
	 * @model transient="true"
	 * @generated
	 */
	Division getLogicalContainer();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Division#getLogicalContainer <em>Logical Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Container</em>' reference.
	 * @see #getLogicalContainer()
	 * @generated
	 */
	void setLogicalContainer(Division value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Division parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Document getDocument();

} // Division
