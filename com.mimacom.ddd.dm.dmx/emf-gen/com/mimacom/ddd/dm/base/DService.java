/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DService</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DService#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DService#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DService#getRaises <em>Raises</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DService#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DService#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DService#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDService()
 * @model
 * @generated
 */
public interface DService extends DActor, ITypedMemberContainer, IPrimaryNavigationTarget
{
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.DServiceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DServiceKind
	 * @see #setKind(DServiceKind)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDService_Kind()
	 * @model
	 * @generated
	 */
	DServiceKind getKind();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DService#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DServiceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DServiceKind value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DServiceParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDService_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DServiceParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Raises</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DException}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raises</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raises</em>' reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDService_Raises()
	 * @model
	 * @generated
	 */
	EList<DException> getRaises();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(DExpression)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDService_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getPrecondition();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DService#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(DExpression value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference.
	 * @see #setPostcondition(DExpression)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDService_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getPostcondition();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DService#getPostcondition <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' containment reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(DExpression value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDService_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DType> getTypes();

} // DService
