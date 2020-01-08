/**
 */
package com.mimacom.ddd.dm.styledText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DStyled Text Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getStyle <em>Style</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getStartPos <em>Start Pos</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getEndPos <em>End Pos</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getSubspans <em>Subspans</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getHighlightColor <em>Highlight Color</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getParent <em>Parent</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan()
 * @model
 * @generated
 */
public interface DStyledTextSpan extends EObject
{
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.styledText.DTextStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see com.mimacom.ddd.dm.styledText.DTextStyle
	 * @see #setStyle(DTextStyle)
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_Style()
	 * @model
	 * @generated
	 */
	DTextStyle getStyle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see com.mimacom.ddd.dm.styledText.DTextStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(DTextStyle value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.styledText.DTextAttribute}.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.styledText.DTextAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute list.
	 * @see com.mimacom.ddd.dm.styledText.DTextAttribute
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_Attributes()
	 * @model
	 * @generated
	 */
	EList<DTextAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Start Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Pos</em>' attribute.
	 * @see #setStartPos(int)
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_StartPos()
	 * @model
	 * @generated
	 */
	int getStartPos();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getStartPos <em>Start Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Pos</em>' attribute.
	 * @see #getStartPos()
	 * @generated
	 */
	void setStartPos(int value);

	/**
	 * Returns the value of the '<em><b>End Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Pos</em>' attribute.
	 * @see #setEndPos(int)
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_EndPos()
	 * @model
	 * @generated
	 */
	int getEndPos();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getEndPos <em>End Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Pos</em>' attribute.
	 * @see #getEndPos()
	 * @generated
	 */
	void setEndPos(int value);

	/**
	 * Returns the value of the '<em><b>Subspans</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.styledText.DStyledTextSpan}.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subspans</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_Subspans()
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<DStyledTextSpan> getSubspans();

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.styledText.DColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see com.mimacom.ddd.dm.styledText.DColor
	 * @see #setTextColor(DColor)
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_TextColor()
	 * @model
	 * @generated
	 */
	DColor getTextColor();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see com.mimacom.ddd.dm.styledText.DColor
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(DColor value);

	/**
	 * Returns the value of the '<em><b>Highlight Color</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.styledText.DColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlight Color</em>' attribute.
	 * @see com.mimacom.ddd.dm.styledText.DColor
	 * @see #setHighlightColor(DColor)
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_HighlightColor()
	 * @model
	 * @generated
	 */
	DColor getHighlightColor();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getHighlightColor <em>Highlight Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highlight Color</em>' attribute.
	 * @see com.mimacom.ddd.dm.styledText.DColor
	 * @see #getHighlightColor()
	 * @generated
	 */
	void setHighlightColor(DColor value);

	/**
	 * Returns the value of the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf</em>' attribute.
	 * @see #setLeaf(boolean)
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_Leaf()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isLeaf();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#isLeaf <em>Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leaf</em>' attribute.
	 * @see #isLeaf()
	 * @generated
	 */
	void setLeaf(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getSubspans <em>Subspans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(DStyledTextSpan)
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_Parent()
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getSubspans
	 * @model opposite="subspans" transient="false"
	 * @generated
	 */
	DStyledTextSpan getParent();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DStyledTextSpan value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDStyledTextSpan_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // DStyledTextSpan
