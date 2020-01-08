/**
 */
package com.mimacom.ddd.dm.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DMultiplicity Shorthand</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.BasePackage#getDMultiplicityShorthand()
 * @model
 * @generated
 */
public enum DMultiplicityShorthand implements Enumerator
{
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>ZERO OR ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_OR_ONE(1, "ZERO_OR_ONE", "ZERO_OR_ONE"),

	/**
	 * The '<em><b>ONE OR MORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MORE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_OR_MORE(2, "ONE_OR_MORE", "ONE_OR_MORE"),

	/**
	 * The '<em><b>ZERO OR MORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_MORE_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_OR_MORE(3, "ZERO_OR_MORE", "ZERO_OR_MORE");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>ZERO OR ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_OR_ONE_VALUE = 1;

	/**
	 * The '<em><b>ONE OR MORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_OR_MORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_OR_MORE_VALUE = 2;

	/**
	 * The '<em><b>ZERO OR MORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_OR_MORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_OR_MORE_VALUE = 3;

	/**
	 * An array of all the '<em><b>DMultiplicity Shorthand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DMultiplicityShorthand[] VALUES_ARRAY =
		new DMultiplicityShorthand[]
		{
			NONE,
			ZERO_OR_ONE,
			ONE_OR_MORE,
			ZERO_OR_MORE,
		};

	/**
	 * A public read-only list of all the '<em><b>DMultiplicity Shorthand</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DMultiplicityShorthand> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DMultiplicity Shorthand</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DMultiplicityShorthand get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DMultiplicityShorthand result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DMultiplicity Shorthand</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DMultiplicityShorthand getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DMultiplicityShorthand result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DMultiplicity Shorthand</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DMultiplicityShorthand get(int value)
	{
		switch (value)
		{
			case NONE_VALUE: return NONE;
			case ZERO_OR_ONE_VALUE: return ZERO_OR_ONE;
			case ONE_OR_MORE_VALUE: return ONE_OR_MORE;
			case ZERO_OR_MORE_VALUE: return ZERO_OR_MORE;
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
	private DMultiplicityShorthand(int value, String name, String literal)
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
	
} //DMultiplicityShorthand
