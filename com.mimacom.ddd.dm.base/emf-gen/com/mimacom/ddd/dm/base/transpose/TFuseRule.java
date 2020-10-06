/**
 */
package com.mimacom.ddd.dm.base.transpose;

import com.mimacom.ddd.dm.base.base.DNamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TFuse Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TFuseRule#getOtherSources <em>Other Sources</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTFuseRule()
 * @model
 * @generated
 */
public interface TFuseRule extends TStructureChangingRule
{
	/**
	 * Returns the value of the '<em><b>Other Sources</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.DNamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Sources</em>' reference list.
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTFuseRule_OtherSources()
	 * @model
	 * @generated
	 */
	EList<DNamedElement> getOtherSources();

} // TFuseRule
