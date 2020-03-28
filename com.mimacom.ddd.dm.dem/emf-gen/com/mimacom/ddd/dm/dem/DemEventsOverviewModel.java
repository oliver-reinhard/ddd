/**
 */
package com.mimacom.ddd.dm.dem;

import com.mimacom.ddd.dm.base.DModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Events Overview Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel#isAll <em>All</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel#getInclude <em>Include</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemEventsOverviewModel()
 * @model
 * @generated
 */
public interface DemEventsOverviewModel extends DModel
{
	/**
	 * Returns the value of the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All</em>' attribute.
	 * @see #setAll(boolean)
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemEventsOverviewModel_All()
	 * @model
	 * @generated
	 */
	boolean isAll();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel#isAll <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' attribute.
	 * @see #isAll()
	 * @generated
	 */
	void setAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dem.DemDomainEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemEventsOverviewModel_Include()
	 * @model
	 * @generated
	 */
	EList<DemDomainEvent> getInclude();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dem.DemDomainEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemEventsOverviewModel_Exclude()
	 * @model
	 * @generated
	 */
	EList<DemDomainEvent> getExclude();

} // DemEventsOverviewModel
