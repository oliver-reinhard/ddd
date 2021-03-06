/**
 */
package com.mimacom.ddd.dm.dem;

import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.INoteContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemActorModel#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemActorModel()
 * @model
 * @generated
 */
public interface DemActorModel extends DModel, INoteContainer
{
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dem.DemActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemActorModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DemActor> getActors();

} // DemActorModel
