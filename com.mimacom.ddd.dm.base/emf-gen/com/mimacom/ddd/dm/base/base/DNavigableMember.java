/**
 */
package com.mimacom.ddd.dm.base.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNavigable Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNavigableMember#getType <em>Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNavigableMember#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNavigableMember#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNavigableMember#isCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNavigableMember()
 * @model abstract="true"
 * @generated
 */
public interface DNavigableMember extends DNamedElement, INoteContainer
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DType)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNavigableMember_Type()
	 * @model
	 * @generated
	 */
	DType getType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNavigableMember#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(DMultiplicity)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNavigableMember_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	DMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNavigableMember#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(DMultiplicity value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNavigableMember_Optional()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNavigableMember_Collection()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isCollection();

} // DNavigableMember
