/**
 */
package com.mimacom.ddd.dm.styledText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DText Attribute</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage#getDTextAttribute()
 * @model
 * @generated
 */
public enum DTextAttribute implements Enumerator
{
	/**
	 * The '<em><b>Underline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINE(1, "Underline", "Underline"),

	/**
	 * The '<em><b>Strikethrough</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRIKETHROUGH_VALUE
	 * @generated
	 * @ordered
	 */
	STRIKETHROUGH(2, "Strikethrough", "Strikethrough"),

	/**
	 * The '<em><b>Superscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERSCRIPT(3, "Superscript", "Superscript"),

	/**
	 * The '<em><b>Subscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPT(4, "Subscript", "Subscript");

	/**
	 * The '<em><b>Underline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Underline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE
	 * @model name="Underline"
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINE_VALUE = 1;

	/**
	 * The '<em><b>Strikethrough</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strikethrough</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRIKETHROUGH
	 * @model name="Strikethrough"
	 * @generated
	 * @ordered
	 */
	public static final int STRIKETHROUGH_VALUE = 2;

	/**
	 * The '<em><b>Superscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Superscript</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPERSCRIPT
	 * @model name="Superscript"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERSCRIPT_VALUE = 3;

	/**
	 * The '<em><b>Subscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subscript</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPT
	 * @model name="Subscript"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPT_VALUE = 4;

	/**
	 * An array of all the '<em><b>DText Attribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DTextAttribute[] VALUES_ARRAY =
		new DTextAttribute[]
		{
			UNDERLINE,
			STRIKETHROUGH,
			SUPERSCRIPT,
			SUBSCRIPT,
		};

	/**
	 * A public read-only list of all the '<em><b>DText Attribute</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DTextAttribute> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DText Attribute</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DTextAttribute get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DTextAttribute result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DText Attribute</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DTextAttribute getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DTextAttribute result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DText Attribute</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DTextAttribute get(int value)
	{
		switch (value)
		{
			case UNDERLINE_VALUE: return UNDERLINE;
			case STRIKETHROUGH_VALUE: return STRIKETHROUGH;
			case SUPERSCRIPT_VALUE: return SUPERSCRIPT;
			case SUBSCRIPT_VALUE: return SUBSCRIPT;
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
	private DTextAttribute(int value, String name, String literal)
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
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //DTextAttribute
