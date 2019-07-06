/**
 */
package com.mimacom.ddd.sm.sim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SComplex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SComplexType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SComplexType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SComplexType#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSComplexType()
 * @model
 * @generated
 */
public interface SComplexType extends SType
{
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSComplexType_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SComplexType#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(SComplexType)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSComplexType_SuperType()
	 * @model
	 * @generated
	 */
	SComplexType getSuperType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SComplexType#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(SComplexType value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sim.SFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSComplexType_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<SFeature> getFeatures();

} // SComplexType
