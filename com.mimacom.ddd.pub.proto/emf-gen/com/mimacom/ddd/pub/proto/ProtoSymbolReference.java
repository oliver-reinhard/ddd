/**
 */
package com.mimacom.ddd.pub.proto;

import com.mimacom.ddd.dm.base.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoSymbolReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoSymbolReference()
 * @model
 * @generated
 */
public interface ProtoSymbolReference extends DExpression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ProtoSymbol)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoSymbolReference_Target()
	 * @model
	 * @generated
	 */
	ProtoSymbol getTarget();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.ProtoSymbolReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ProtoSymbol value);

} // ProtoSymbolReference
