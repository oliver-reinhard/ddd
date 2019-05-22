/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DExisting Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DExistingApplication#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DExistingApplication#getServices <em>Services</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DExistingApplication#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDExistingApplication()
 * @model
 * @generated
 */
public interface DExistingApplication extends DNamedElement, INamespace, IPrimaryNavigationTarget
{
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDExistingApplication_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DType> getTypes();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDExistingApplication_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<DService> getServices();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DException}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDExistingApplication_Exceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DException> getExceptions();

} // DExistingApplication
