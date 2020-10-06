/**
 */
package com.mimacom.ddd.dm.base.transpose;

import com.mimacom.ddd.dm.base.base.DType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TStructure Changing Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getRootEntity <em>Root Entity</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getDetail <em>Detail</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getExtendFrom <em>Extend From</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTStructureChangingRule()
 * @model abstract="true"
 * @generated
 */
public interface TStructureChangingRule extends TRenameRule
{
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.transpose.TTristate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.transpose.TTristate
	 * @see #setAbstract(TTristate)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTStructureChangingRule_Abstract()
	 * @model
	 * @generated
	 */
	TTristate getAbstract();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.transpose.TTristate
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(TTristate value);

	/**
	 * Returns the value of the '<em><b>Root Entity</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.transpose.TTristate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Entity</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.transpose.TTristate
	 * @see #setRootEntity(TTristate)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTStructureChangingRule_RootEntity()
	 * @model
	 * @generated
	 */
	TTristate getRootEntity();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getRootEntity <em>Root Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Entity</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.transpose.TTristate
	 * @see #getRootEntity()
	 * @generated
	 */
	void setRootEntity(TTristate value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.transpose.TTristate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.transpose.TTristate
	 * @see #setDetail(TTristate)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTStructureChangingRule_Detail()
	 * @model
	 * @generated
	 */
	TTristate getDetail();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getDetail <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.transpose.TTristate
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(TTristate value);

	/**
	 * Returns the value of the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend From</em>' reference.
	 * @see #setExtendFrom(DType)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTStructureChangingRule_ExtendFrom()
	 * @model
	 * @generated
	 */
	DType getExtendFrom();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.TStructureChangingRule#getExtendFrom <em>Extend From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend From</em>' reference.
	 * @see #getExtendFrom()
	 * @generated
	 */
	void setExtendFrom(DType value);

} // TStructureChangingRule
