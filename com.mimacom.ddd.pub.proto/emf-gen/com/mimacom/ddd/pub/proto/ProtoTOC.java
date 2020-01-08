/**
 */
package com.mimacom.ddd.pub.proto;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoTOC#getMaxLevel <em>Max Level</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoTOC()
 * @model
 * @generated
 */
public interface ProtoTOC extends ProtoDocumentSegment {
	/**
	 * Returns the value of the '<em><b>Max Level</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Level</em>' attribute.
	 * @see #setMaxLevel(int)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoTOC_MaxLevel()
	 * @model default="3" unique="false"
	 * @generated
	 */
	int getMaxLevel();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.ProtoTOC#getMaxLevel <em>Max Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Level</em>' attribute.
	 * @see #getMaxLevel()
	 * @generated
	 */
	void setMaxLevel(int value);

} // ProtoTOC
