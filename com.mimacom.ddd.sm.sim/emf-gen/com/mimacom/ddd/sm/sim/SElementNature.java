/**
 */
package com.mimacom.ddd.sm.sim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SElement Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSElementNature()
 * @model
 * @generated
 */
public enum SElementNature implements Enumerator
{
	/**
	 * The '<em><b>GENUINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENUINE_VALUE
	 * @generated
	 * @ordered
	 */
	GENUINE(0, "GENUINE", "GENUINE"),

	/**
	 * The '<em><b>DEDUCTION RULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDUCTION_RULE_VALUE
	 * @generated
	 * @ordered
	 */
	DEDUCTION_RULE(1, "DEDUCTION_RULE", "DEDUCTION_RULE"),

	/**
	 * The '<em><b>SYNTHETIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNTHETIC_VALUE
	 * @generated
	 * @ordered
	 */
	SYNTHETIC(2, "SYNTHETIC", "SYNTHETIC");

	/**
	 * The '<em><b>GENUINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENUINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENUINE_VALUE = 0;

	/**
	 * The '<em><b>DEDUCTION RULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDUCTION_RULE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEDUCTION_RULE_VALUE = 1;

	/**
	 * The '<em><b>SYNTHETIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNTHETIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYNTHETIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>SElement Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SElementNature[] VALUES_ARRAY =
		new SElementNature[]
		{
			GENUINE,
			DEDUCTION_RULE,
			SYNTHETIC,
		};

	/**
	 * A public read-only list of all the '<em><b>SElement Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SElementNature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SElement Nature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SElementNature get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			SElementNature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SElement Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SElementNature getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			SElementNature result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SElement Nature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SElementNature get(int value)
	{
		switch (value)
		{
			case GENUINE_VALUE: return GENUINE;
			case DEDUCTION_RULE_VALUE: return DEDUCTION_RULE;
			case SYNTHETIC_VALUE: return SYNTHETIC;
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
	private SElementNature(int value, String name, String literal)
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
	
} //SElementNature
