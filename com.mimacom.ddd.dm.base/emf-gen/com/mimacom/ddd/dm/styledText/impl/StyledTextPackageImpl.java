/**
 */
package com.mimacom.ddd.dm.styledText.impl;

import com.mimacom.ddd.dm.styledText.DColor;
import com.mimacom.ddd.dm.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.styledText.DTextAttribute;
import com.mimacom.ddd.dm.styledText.DTextStyle;
import com.mimacom.ddd.dm.styledText.StyledTextFactory;
import com.mimacom.ddd.dm.styledText.StyledTextPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StyledTextPackageImpl extends EPackageImpl implements StyledTextPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dStyledTextSpanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dTextStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dTextAttributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dColorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StyledTextPackageImpl()
	{
		super(eNS_URI, StyledTextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
<<<<<<< HEAD
	 *
	 * <p>This method is used to initialize {@link StyledTextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StyledTextPackage init()
	{
		if (isInited) return (StyledTextPackage)EPackage.Registry.INSTANCE.getEPackage(StyledTextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStyledTextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StyledTextPackageImpl theStyledTextPackage = registeredStyledTextPackage instanceof StyledTextPackageImpl ? (StyledTextPackageImpl)registeredStyledTextPackage : new StyledTextPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStyledTextPackage.createPackageContents();

		// Initialize created meta-data
		theStyledTextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStyledTextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StyledTextPackage.eNS_URI, theStyledTextPackage);
		return theStyledTextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDStyledTextSpan()
	{
		return dStyledTextSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStyledTextSpan_Style()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStyledTextSpan_Attributes()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStyledTextSpan_StartPos()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStyledTextSpan_EndPos()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDStyledTextSpan_Subspans()
	{
		return (EReference)dStyledTextSpanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStyledTextSpan_TextColor()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStyledTextSpan_HighlightColor()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStyledTextSpan_Leaf()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDStyledTextSpan_Parent()
	{
		return (EReference)dStyledTextSpanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStyledTextSpan_Text()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDTextStyle()
	{
		return dTextStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDTextAttribute()
	{
		return dTextAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDColor()
	{
		return dColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
=======
	 * 
	 * <p>This method is used to initialize {@link StyledTextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StyledTextPackage init()
	{
		if (isInited) return (StyledTextPackage)EPackage.Registry.INSTANCE.getEPackage(StyledTextPackage.eNS_URI);

		// Obtain or create and register package
		StyledTextPackageImpl theStyledTextPackage = (StyledTextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StyledTextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StyledTextPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theStyledTextPackage.createPackageContents();

		// Initialize created meta-data
		theStyledTextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStyledTextPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StyledTextPackage.eNS_URI, theStyledTextPackage);
		return theStyledTextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDStyledTextSpan()
	{
		return dStyledTextSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDStyledTextSpan_Style()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDStyledTextSpan_Attributes()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDStyledTextSpan_StartPos()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDStyledTextSpan_EndPos()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDStyledTextSpan_Subspans()
	{
		return (EReference)dStyledTextSpanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDStyledTextSpan_TextColor()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDStyledTextSpan_HighlightColor()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDStyledTextSpan_Leaf()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDStyledTextSpan_Parent()
	{
		return (EReference)dStyledTextSpanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDStyledTextSpan_Text()
	{
		return (EAttribute)dStyledTextSpanEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDTextStyle()
	{
		return dTextStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDTextAttribute()
	{
		return dTextAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDColor()
	{
		return dColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
>>>>>>> refs/heads/master
	public StyledTextFactory getStyledTextFactory()
	{
		return (StyledTextFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dStyledTextSpanEClass = createEClass(DSTYLED_TEXT_SPAN);
		createEAttribute(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__STYLE);
		createEAttribute(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__ATTRIBUTES);
		createEAttribute(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__START_POS);
		createEAttribute(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__END_POS);
		createEReference(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__SUBSPANS);
		createEAttribute(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__TEXT_COLOR);
		createEAttribute(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__HIGHLIGHT_COLOR);
		createEAttribute(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__LEAF);
		createEReference(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__PARENT);
		createEAttribute(dStyledTextSpanEClass, DSTYLED_TEXT_SPAN__TEXT);

		// Create enums
		dTextStyleEEnum = createEEnum(DTEXT_STYLE);
		dTextAttributeEEnum = createEEnum(DTEXT_ATTRIBUTE);
		dColorEEnum = createEEnum(DCOLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dStyledTextSpanEClass, DStyledTextSpan.class, "DStyledTextSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDStyledTextSpan_Style(), this.getDTextStyle(), "style", null, 0, 1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDStyledTextSpan_Attributes(), this.getDTextAttribute(), "attributes", null, 0, -1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDStyledTextSpan_StartPos(), ecorePackage.getEInt(), "startPos", null, 0, 1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDStyledTextSpan_EndPos(), ecorePackage.getEInt(), "endPos", null, 0, 1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDStyledTextSpan_Subspans(), this.getDStyledTextSpan(), this.getDStyledTextSpan_Parent(), "subspans", null, 0, -1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDStyledTextSpan_TextColor(), this.getDColor(), "textColor", null, 0, 1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDStyledTextSpan_HighlightColor(), this.getDColor(), "highlightColor", null, 0, 1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDStyledTextSpan_Leaf(), ecorePackage.getEBoolean(), "leaf", null, 0, 1, DStyledTextSpan.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDStyledTextSpan_Parent(), this.getDStyledTextSpan(), this.getDStyledTextSpan_Subspans(), "parent", null, 0, 1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDStyledTextSpan_Text(), ecorePackage.getEString(), "text", null, 0, 1, DStyledTextSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dTextStyleEEnum, DTextStyle.class, "DTextStyle");
		addEEnumLiteral(dTextStyleEEnum, DTextStyle.PLAIN);
		addEEnumLiteral(dTextStyleEEnum, DTextStyle.EMPHASIS);
		addEEnumLiteral(dTextStyleEEnum, DTextStyle.STRONG);
		addEEnumLiteral(dTextStyleEEnum, DTextStyle.KEYWORD);
		addEEnumLiteral(dTextStyleEEnum, DTextStyle.MONOSPACE);
		addEEnumLiteral(dTextStyleEEnum, DTextStyle.EXPRESSION);

		initEEnum(dTextAttributeEEnum, DTextAttribute.class, "DTextAttribute");
		addEEnumLiteral(dTextAttributeEEnum, DTextAttribute.UNDERLINE);
		addEEnumLiteral(dTextAttributeEEnum, DTextAttribute.STRIKETHROUGH);
		addEEnumLiteral(dTextAttributeEEnum, DTextAttribute.SUPERSCRIPT);
		addEEnumLiteral(dTextAttributeEEnum, DTextAttribute.SUBSCRIPT);

		initEEnum(dColorEEnum, DColor.class, "DColor");
		addEEnumLiteral(dColorEEnum, DColor.BLACK);
		addEEnumLiteral(dColorEEnum, DColor.BROWN);
		addEEnumLiteral(dColorEEnum, DColor.RED);
		addEEnumLiteral(dColorEEnum, DColor.ORANGE);
		addEEnumLiteral(dColorEEnum, DColor.YELLOW);
		addEEnumLiteral(dColorEEnum, DColor.GREEN);
		addEEnumLiteral(dColorEEnum, DColor.BLUE);
		addEEnumLiteral(dColorEEnum, DColor.PURPLE);
		addEEnumLiteral(dColorEEnum, DColor.GREY);
		addEEnumLiteral(dColorEEnum, DColor.WHITE);

		// Create resource
		createResource(eNS_URI);
	}

} //StyledTextPackageImpl
