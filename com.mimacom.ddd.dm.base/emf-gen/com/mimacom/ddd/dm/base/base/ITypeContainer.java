/**
 */
package com.mimacom.ddd.dm.base.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IType Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.ITypeContainer#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getITypeContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITypeContainer extends EObject
{
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getITypeContainer_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DType> getTypes();

} // ITypeContainer
