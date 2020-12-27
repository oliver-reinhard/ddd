/**
 */
package com.mimacom.ddd.dm.dem;

import com.mimacom.ddd.dm.base.base.INoteContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemTrigger#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemTrigger()
 * @model
 * @generated
 */
public interface DemTrigger extends INoteContainer
{
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(DemActor)
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemTrigger_Actor()
	 * @model required="true"
	 * @generated
	 */
	DemActor getActor();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dem.DemTrigger#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(DemActor value);

} // DemTrigger
