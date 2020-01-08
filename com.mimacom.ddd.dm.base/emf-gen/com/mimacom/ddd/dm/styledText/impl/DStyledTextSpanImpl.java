/**
 */
package com.mimacom.ddd.dm.styledText.impl;

import com.mimacom.ddd.dm.styledText.DColor;
import com.mimacom.ddd.dm.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.styledText.DTextAttribute;
import com.mimacom.ddd.dm.styledText.DTextStyle;
import com.mimacom.ddd.dm.styledText.StyledTextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DStyled Text Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getStartPos <em>Start Pos</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getEndPos <em>End Pos</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getSubspans <em>Subspans</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getHighlightColor <em>Highlight Color</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.styledText.impl.DStyledTextSpanImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DStyledTextSpanImpl extends MinimalEObjectImpl.Container implements DStyledTextSpan
{
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final DTextStyle STYLE_EDEFAULT = DTextStyle.PLAIN;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected DTextStyle style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<DTextAttribute> attributes;

	/**
	 * The default value of the '{@link #getStartPos() <em>Start Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPos()
	 * @generated
	 * @ordered
	 */
	protected static final int START_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartPos() <em>Start Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPos()
	 * @generated
	 * @ordered
	 */
	protected int startPos = START_POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPos() <em>End Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPos()
	 * @generated
	 * @ordered
	 */
	protected static final int END_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndPos() <em>End Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPos()
	 * @generated
	 * @ordered
	 */
	protected int endPos = END_POS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubspans() <em>Subspans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubspans()
	 * @generated
	 * @ordered
	 */
	protected EList<DStyledTextSpan> subspans;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final DColor TEXT_COLOR_EDEFAULT = DColor.BLACK;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected DColor textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighlightColor() <em>Highlight Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighlightColor()
	 * @generated
	 * @ordered
	 */
	protected static final DColor HIGHLIGHT_COLOR_EDEFAULT = DColor.BLACK;

	/**
	 * The cached value of the '{@link #getHighlightColor() <em>Highlight Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighlightColor()
	 * @generated
	 * @ordered
	 */
	protected DColor highlightColor = HIGHLIGHT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isLeaf() <em>Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEAF_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DStyledTextSpanImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return StyledTextPackage.Literals.DSTYLED_TEXT_SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTextStyle getStyle()
	{
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(DTextStyle newStyle)
	{
		DTextStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StyledTextPackage.DSTYLED_TEXT_SPAN__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DTextAttribute> getAttributes()
	{
		if (attributes == null)
		{
			attributes = new EDataTypeUniqueEList<DTextAttribute>(DTextAttribute.class, this, StyledTextPackage.DSTYLED_TEXT_SPAN__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartPos()
	{
		return startPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartPos(int newStartPos)
	{
		int oldStartPos = startPos;
		startPos = newStartPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StyledTextPackage.DSTYLED_TEXT_SPAN__START_POS, oldStartPos, startPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndPos()
	{
		return endPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndPos(int newEndPos)
	{
		int oldEndPos = endPos;
		endPos = newEndPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StyledTextPackage.DSTYLED_TEXT_SPAN__END_POS, oldEndPos, endPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DStyledTextSpan> getSubspans()
	{
		if (subspans == null)
		{
			subspans = new EObjectContainmentWithInverseEList<DStyledTextSpan>(DStyledTextSpan.class, this, StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS, StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT);
		}
		return subspans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DColor getTextColor()
	{
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextColor(DColor newTextColor)
	{
		DColor oldTextColor = textColor;
		textColor = newTextColor == null ? TEXT_COLOR_EDEFAULT : newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DColor getHighlightColor()
	{
		return highlightColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighlightColor(DColor newHighlightColor)
	{
		DColor oldHighlightColor = highlightColor;
		highlightColor = newHighlightColor == null ? HIGHLIGHT_COLOR_EDEFAULT : newHighlightColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StyledTextPackage.DSTYLED_TEXT_SPAN__HIGHLIGHT_COLOR, oldHighlightColor, highlightColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLeaf()
	{
		// TODO: implement this method to return the 'Leaf' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaf(boolean newLeaf)
	{
		// TODO: implement this method to set the 'Leaf' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DStyledTextSpan getParent()
	{
		if (eContainerFeatureID() != StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT) return null;
		return (DStyledTextSpan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DStyledTextSpan newParent, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newParent, StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(DStyledTextSpan newParent)
	{
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT && newParent != null))
		{
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS, DStyledTextSpan.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText()
	{
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText)
	{
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubspans()).basicAdd(otherEnd, msgs);
			case StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((DStyledTextSpan)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS:
				return ((InternalEList<?>)getSubspans()).basicRemove(otherEnd, msgs);
			case StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT:
				return eInternalContainer().eInverseRemove(this, StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS, DStyledTextSpan.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case StyledTextPackage.DSTYLED_TEXT_SPAN__STYLE:
				return getStyle();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__ATTRIBUTES:
				return getAttributes();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__START_POS:
				return getStartPos();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__END_POS:
				return getEndPos();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS:
				return getSubspans();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT_COLOR:
				return getTextColor();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__HIGHLIGHT_COLOR:
				return getHighlightColor();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__LEAF:
				return isLeaf();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT:
				return getParent();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT:
				return getText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case StyledTextPackage.DSTYLED_TEXT_SPAN__STYLE:
				setStyle((DTextStyle)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends DTextAttribute>)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__START_POS:
				setStartPos((Integer)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__END_POS:
				setEndPos((Integer)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS:
				getSubspans().clear();
				getSubspans().addAll((Collection<? extends DStyledTextSpan>)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT_COLOR:
				setTextColor((DColor)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__HIGHLIGHT_COLOR:
				setHighlightColor((DColor)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__LEAF:
				setLeaf((Boolean)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT:
				setParent((DStyledTextSpan)newValue);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT:
				setText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case StyledTextPackage.DSTYLED_TEXT_SPAN__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__ATTRIBUTES:
				getAttributes().clear();
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__START_POS:
				setStartPos(START_POS_EDEFAULT);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__END_POS:
				setEndPos(END_POS_EDEFAULT);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS:
				getSubspans().clear();
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__HIGHLIGHT_COLOR:
				setHighlightColor(HIGHLIGHT_COLOR_EDEFAULT);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__LEAF:
				setLeaf(LEAF_EDEFAULT);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT:
				setParent((DStyledTextSpan)null);
				return;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT:
				setText(TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case StyledTextPackage.DSTYLED_TEXT_SPAN__STYLE:
				return style != STYLE_EDEFAULT;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__START_POS:
				return startPos != START_POS_EDEFAULT;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__END_POS:
				return endPos != END_POS_EDEFAULT;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__SUBSPANS:
				return subspans != null && !subspans.isEmpty();
			case StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT_COLOR:
				return textColor != TEXT_COLOR_EDEFAULT;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__HIGHLIGHT_COLOR:
				return highlightColor != HIGHLIGHT_COLOR_EDEFAULT;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__LEAF:
				return isLeaf() != LEAF_EDEFAULT;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__PARENT:
				return getParent() != null;
			case StyledTextPackage.DSTYLED_TEXT_SPAN__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (style: ");
		result.append(style);
		result.append(", attributes: ");
		result.append(attributes);
		result.append(", startPos: ");
		result.append(startPos);
		result.append(", endPos: ");
		result.append(endPos);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(", highlightColor: ");
		result.append(highlightColor);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //DStyledTextSpanImpl
