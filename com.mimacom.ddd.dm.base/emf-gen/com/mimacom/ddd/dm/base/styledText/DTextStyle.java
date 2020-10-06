/**
 */
package com.mimacom.ddd.dm.base.styledText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DText Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.styledText.StyledTextPackage#getDTextStyle()
 * @model
 * @generated
 */
public enum DTextStyle implements Enumerator
{
	/**
	 * The '<em><b>Plain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN_VALUE
	 * @generated
	 * @ordered
	 */
	PLAIN(0, "Plain", "Plain"),

	/**
	 * The '<em><b>Emphasis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPHASIS_VALUE
	 * @generated
	 * @ordered
	 */
	EMPHASIS(1, "Emphasis", "Emphasis"),

	/**
	 * The '<em><b>Strong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG_VALUE
	 * @generated
	 * @ordered
	 */
	STRONG(2, "Strong", "Strong"),

	/**
	 * The '<em><b>Keyword</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYWORD_VALUE
	 * @generated
	 * @ordered
	 */
	KEYWORD(3, "Keyword", "Keyword"),

	/**
	 * The '<em><b>Monospace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOSPACE_VALUE
	 * @generated
	 * @ordered
	 */
	MONOSPACE(4, "Monospace", "Monospace"),

	/**
	 * The '<em><b>Expression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESSION(5, "Expression", "Expression");

	/**
	 * The '<em><b>Plain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAIN
	 * @model name="Plain"
	 * @generated
	 * @ordered
	 */
	public static final int PLAIN_VALUE = 0;

	/**
	 * The '<em><b>Emphasis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPHASIS
	 * @model name="Emphasis"
	 * @generated
	 * @ordered
	 */
	public static final int EMPHASIS_VALUE = 1;

	/**
	 * The '<em><b>Strong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG
	 * @model name="Strong"
	 * @generated
	 * @ordered
	 */
	public static final int STRONG_VALUE = 2;

	/**
	 * The '<em><b>Keyword</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYWORD
	 * @model name="Keyword"
	 * @generated
	 * @ordered
	 */
	public static final int KEYWORD_VALUE = 3;

	/**
	 * The '<em><b>Monospace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOSPACE
	 * @model name="Monospace"
	 * @generated
	 * @ordered
	 */
	public static final int MONOSPACE_VALUE = 4;

	/**
	 * The '<em><b>Expression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPRESSION
	 * @model name="Expression"
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESSION_VALUE = 5;

	/**
	 * An array of all the '<em><b>DText Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DTextStyle[] VALUES_ARRAY =
		new DTextStyle[]
		{
			PLAIN,
			EMPHASIS,
			STRONG,
			KEYWORD,
			MONOSPACE,
			EXPRESSION,
		};

	/**
	 * A public read-only list of all the '<em><b>DText Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DTextStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DText Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DTextStyle get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DTextStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DText Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DTextStyle getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DTextStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DText Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DTextStyle get(int value)
	{
		switch (value)
		{
			case PLAIN_VALUE: return PLAIN;
			case EMPHASIS_VALUE: return EMPHASIS;
			case STRONG_VALUE: return STRONG;
			case KEYWORD_VALUE: return KEYWORD;
			case MONOSPACE_VALUE: return MONOSPACE;
			case EXPRESSION_VALUE: return EXPRESSION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DTextStyle(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //DTextStyle
