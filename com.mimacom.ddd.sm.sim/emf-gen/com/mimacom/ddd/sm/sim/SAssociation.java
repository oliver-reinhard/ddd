/**
 */
package com.mimacom.ddd.sm.sim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAssociation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SAssociation#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SAssociation#isDerived <em>Derived</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSAssociation()
 * @model
 * @generated
 */
public interface SAssociation extends SFeature
{
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.sm.sim.SAssociationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SAssociationKind
	 * @see #setKind(SAssociationKind)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSAssociation_Kind()
	 * @model
	 * @generated
	 */
	SAssociationKind getKind();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SAssociation#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SAssociationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SAssociationKind value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSAssociation_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SAssociation#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SEntityType getTargetType();

} // SAssociation
