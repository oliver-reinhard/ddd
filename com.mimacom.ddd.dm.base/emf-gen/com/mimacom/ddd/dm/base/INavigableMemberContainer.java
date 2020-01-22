/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INavigable Member Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.INavigableMemberContainer#getNavigableMembers <em>Navigable Members</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getINavigableMemberContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface INavigableMemberContainer extends EObject
{
	/**
	 * Returns the value of the '<em><b>Navigable Members</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNavigableMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigable Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigable Members</em>' reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getINavigableMemberContainer_NavigableMembers()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DNavigableMember> getNavigableMembers();

} // INavigableMemberContainer
