/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm;

import com.mimacom.ddd.sm.sim.SInformationModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SApplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.asm.SApplication#getModel <em>Model</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.SApplication#getServices <em>Services</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.SApplication#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSApplication()
 * @model
 * @generated
 */
public interface SApplication extends Model
{
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(SInformationModel)
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSApplication_Model()
	 * @model
	 * @generated
	 */
	SInformationModel getModel();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.asm.SApplication#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(SInformationModel value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.asm.SServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSApplication_Services()
	 * @model
	 * @generated
	 */
	EList<SServiceInterface> getServices();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.asm.SActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSApplication_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<SActor> getActors();

} // SApplication
