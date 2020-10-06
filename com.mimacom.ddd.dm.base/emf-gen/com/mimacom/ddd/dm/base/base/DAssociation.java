/**
 */
package com.mimacom.ddd.dm.base.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAssociation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DAssociation#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DAssociation#isDerived <em>Derived</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DAssociation#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDAssociation()
 * @model
 * @generated
 */
public interface DAssociation extends DFeature
{
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.base.DAssociationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.base.DAssociationKind
	 * @see #setKind(DAssociationKind)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDAssociation_Kind()
	 * @model
	 * @generated
	 */
	DAssociationKind getKind();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DAssociation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.base.DAssociationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DAssociationKind value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDAssociation_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DAssociation#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDAssociation_SourceType()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DComplexType getSourceType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DEntityType getTargetType();

} // DAssociation
