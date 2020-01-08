/**
 */
package com.mimacom.ddd.dm.styledText;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.styledText.StyledTextFactory
 * @model kind="package"
 * @generated
 */
public interface StyledTextPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "styledText";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/styledText";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "styledText";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StyledTextPackage eINSTANCE = com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl <em>DStyled Text Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl
	 * @see com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl#getDStyledTextSpan()
	 * @generated
	 */
	int DSTYLED_TEXT_SPAN = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__STYLE = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Start Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__START_POS = 2;

	/**
	 * The feature id for the '<em><b>End Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__END_POS = 3;

	/**
	 * The feature id for the '<em><b>Subspans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__SUBSPANS = 4;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__TEXT_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Highlight Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__HIGHLIGHT_COLOR = 6;

	/**
	 * The feature id for the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__LEAF = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__PARENT = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN__TEXT = 9;

	/**
	 * The number of structural features of the '<em>DStyled Text Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>DStyled Text Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTYLED_TEXT_SPAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.styledText.DTextStyle <em>DText Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.styledText.DTextStyle
	 * @see com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl#getDTextStyle()
	 * @generated
	 */
	int DTEXT_STYLE = 1;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.styledText.DTextAttribute <em>DText Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.styledText.DTextAttribute
	 * @see com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl#getDTextAttribute()
	 * @generated
	 */
	int DTEXT_ATTRIBUTE = 2;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.styledText.DColor <em>DColor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.styledText.DColor
	 * @see com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl#getDColor()
	 * @generated
	 */
	int DCOLOR = 3;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan <em>DStyled Text Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DStyled Text Span</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan
	 * @generated
	 */
	EClass getDStyledTextSpan();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getStyle()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EAttribute getDStyledTextSpan_Style();

	/**
	 * Returns the meta object for the attribute list '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributes</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getAttributes()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EAttribute getDStyledTextSpan_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getStartPos <em>Start Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Pos</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getStartPos()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EAttribute getDStyledTextSpan_StartPos();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getEndPos <em>End Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Pos</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getEndPos()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EAttribute getDStyledTextSpan_EndPos();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getSubspans <em>Subspans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subspans</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getSubspans()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EReference getDStyledTextSpan_Subspans();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getTextColor()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EAttribute getDStyledTextSpan_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getHighlightColor <em>Highlight Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highlight Color</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getHighlightColor()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EAttribute getDStyledTextSpan_HighlightColor();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#isLeaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leaf</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#isLeaf()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EAttribute getDStyledTextSpan_Leaf();

	/**
	 * Returns the meta object for the container reference '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getParent()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EReference getDStyledTextSpan_Parent();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.styledText.DStyledTextSpan#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DStyledTextSpan#getText()
	 * @see #getDStyledTextSpan()
	 * @generated
	 */
	EAttribute getDStyledTextSpan_Text();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.styledText.DTextStyle <em>DText Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DText Style</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DTextStyle
	 * @generated
	 */
	EEnum getDTextStyle();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.styledText.DTextAttribute <em>DText Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DText Attribute</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DTextAttribute
	 * @generated
	 */
	EEnum getDTextAttribute();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.styledText.DColor <em>DColor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DColor</em>'.
	 * @see com.mimacom.ddd.dm.styledText.DColor
	 * @generated
	 */
	EEnum getDColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StyledTextFactory getStyledTextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl <em>DStyled Text Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl
		 * @see com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl#getDStyledTextSpan()
		 * @generated
		 */
		EClass DSTYLED_TEXT_SPAN = eINSTANCE.getDStyledTextSpan();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTYLED_TEXT_SPAN__STYLE = eINSTANCE.getDStyledTextSpan_Style();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTYLED_TEXT_SPAN__ATTRIBUTES = eINSTANCE.getDStyledTextSpan_Attributes();

		/**
		 * The meta object literal for the '<em><b>Start Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTYLED_TEXT_SPAN__START_POS = eINSTANCE.getDStyledTextSpan_StartPos();

		/**
		 * The meta object literal for the '<em><b>End Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTYLED_TEXT_SPAN__END_POS = eINSTANCE.getDStyledTextSpan_EndPos();

		/**
		 * The meta object literal for the '<em><b>Subspans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTYLED_TEXT_SPAN__SUBSPANS = eINSTANCE.getDStyledTextSpan_Subspans();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTYLED_TEXT_SPAN__TEXT_COLOR = eINSTANCE.getDStyledTextSpan_TextColor();

		/**
		 * The meta object literal for the '<em><b>Highlight Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTYLED_TEXT_SPAN__HIGHLIGHT_COLOR = eINSTANCE.getDStyledTextSpan_HighlightColor();

		/**
		 * The meta object literal for the '<em><b>Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTYLED_TEXT_SPAN__LEAF = eINSTANCE.getDStyledTextSpan_Leaf();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTYLED_TEXT_SPAN__PARENT = eINSTANCE.getDStyledTextSpan_Parent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTYLED_TEXT_SPAN__TEXT = eINSTANCE.getDStyledTextSpan_Text();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.styledText.DTextStyle <em>DText Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.styledText.DTextStyle
		 * @see com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl#getDTextStyle()
		 * @generated
		 */
		EEnum DTEXT_STYLE = eINSTANCE.getDTextStyle();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.styledText.DTextAttribute <em>DText Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.styledText.DTextAttribute
		 * @see com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl#getDTextAttribute()
		 * @generated
		 */
		EEnum DTEXT_ATTRIBUTE = eINSTANCE.getDTextAttribute();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.styledText.DColor <em>DColor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.styledText.DColor
		 * @see com.mimacom.ddd.dm.styledText.impl.StyledTextPackageImpl#getDColor()
		 * @generated
		 */
		EEnum DCOLOR = eINSTANCE.getDColor();

	}

} //StyledTextPackage
