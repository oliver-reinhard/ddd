/**
 */
package com.mimacom.ddd.pub.pub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titled Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.TitledFigure#getFigure <em>Figure</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledFigure()
 * @model
 * @generated
 */
public interface TitledFigure extends TitledBlock {
	/**
	 * Returns the value of the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure</em>' containment reference.
	 * @see #setFigure(AbstractFigure)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledFigure_Figure()
	 * @model containment="true"
	 * @generated
	 */
	AbstractFigure getFigure();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TitledFigure#getFigure <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure</em>' containment reference.
	 * @see #getFigure()
	 * @generated
	 */
	void setFigure(AbstractFigure value);

} // TitledFigure
