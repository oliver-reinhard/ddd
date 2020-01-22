/**
 */
package com.mimacom.ddd.pub.pub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.TableCell#getWidth <em>Width</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TableCell#getHeight <em>Height</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TableCell#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends BlockContainer {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableCell_Width()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TableCell#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableCell_Height()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TableCell#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.pub.TableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' container reference.
	 * @see #setRow(TableRow)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableCell_Row()
	 * @see com.mimacom.ddd.pub.pub.TableRow#getCells
	 * @model opposite="cells" transient="false"
	 * @generated
	 */
	TableRow getRow();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TableCell#getRow <em>Row</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' container reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(TableRow value);

} // TableCell
