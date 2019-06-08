/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DRich Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DRichText#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDRichText()
 * @model
 * @generated
 */
public interface DRichText extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.IRichTextSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDRichText_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<IRichTextSegment> getSegments();

} // DRichText
