/**
 */
package com.mimacom.ddd.sm.sim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SAggregate#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SAggregate#getRoots <em>Roots</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SAggregate#getDerivedName <em>Derived Name</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSAggregate()
 * @model
 * @generated
 */
public interface SAggregate extends SDeducibleElement
{
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sim.SType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSAggregate_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<SType> getTypes();

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sim.SEntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSAggregate_Roots()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<SEntityType> getRoots();

	/**
	 * Returns the value of the '<em><b>Derived Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Name</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSAggregate_DerivedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDerivedName();

} // SAggregate
