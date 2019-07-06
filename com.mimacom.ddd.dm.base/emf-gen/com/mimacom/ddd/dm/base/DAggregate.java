/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DAggregate#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DAggregate#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DAggregate#getRoots <em>Roots</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DAggregate#getDerivedName <em>Derived Name</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDAggregate()
 * @model
 * @generated
 */
public interface DAggregate extends EObject
{
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DRichText)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDAggregate_Description()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getDescription();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DAggregate#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DRichText value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDAggregate_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DType> getTypes();

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DIdentityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDAggregate_Roots()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DIdentityType> getRoots();

	/**
	 * Returns the value of the '<em><b>Derived Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Name</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDAggregate_DerivedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDerivedName();

} // DAggregate
