/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom;

import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dom.DomSnapshot#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dom.DomPackage#getDomSnapshot()
 * @model
 * @generated
 */
public interface DomSnapshot extends DNamedElement, INavigableMemberContainer, IDiagramRoot
{
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dom.DomObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dom.DomPackage#getDomSnapshot_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomObject> getObjects();

} // DomSnapshot
