/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.AbstractTable#getWidthPercent <em>Width Percent</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.AbstractTable#getGridlines <em>Gridlines</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getAbstractTable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Width Percent</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Percent</em>' attribute.
	 * @see #setWidthPercent(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getAbstractTable_WidthPercent()
	 * @model default="100" unique="false"
	 * @generated
	 */
	int getWidthPercent();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.AbstractTable#getWidthPercent <em>Width Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Percent</em>' attribute.
	 * @see #getWidthPercent()
	 * @generated
	 */
	void setWidthPercent(int value);

	/**
	 * Returns the value of the '<em><b>Gridlines</b></em>' attribute.
	 * The default value is <code>"HORIZONTAL"</code>.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.pub.GridLines}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridlines</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.GridLines
	 * @see #setGridlines(GridLines)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getAbstractTable_Gridlines()
	 * @model default="HORIZONTAL" unique="false"
	 * @generated
	 */
	GridLines getGridlines();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.AbstractTable#getGridlines <em>Gridlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gridlines</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.GridLines
	 * @see #getGridlines()
	 * @generated
	 */
	void setGridlines(GridLines value);

} // AbstractTable
