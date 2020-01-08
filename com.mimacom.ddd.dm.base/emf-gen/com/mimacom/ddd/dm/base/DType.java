/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DType#isPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDType()
 * @model abstract="true"
 * @generated
 */
public interface DType extends DNamedElement, IDeducibleElement, IStaticReferenceTarget
{
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNamedPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNamedPredicate> getConstraints();

	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see #setPrimitive(boolean)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDType_Primitive()
	 * @model default="true"
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DType#isPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see #isPrimitive()
	 * @generated
	 */
	void setPrimitive(boolean value);

} // DType
