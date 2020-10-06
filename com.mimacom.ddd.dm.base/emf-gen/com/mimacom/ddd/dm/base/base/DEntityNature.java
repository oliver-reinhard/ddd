/**
 */
package com.mimacom.ddd.dm.base.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DEntity Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDEntityNature()
 * @model
 * @generated
 */
public enum DEntityNature implements Enumerator
{
	/**
	 * The '<em><b>CONTROLLED ENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLED_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLED_ENTITY(0, "CONTROLLED_ENTITY", "CONTROLLED_ENTITY"),

	/**
	 * The '<em><b>AUTONOMOUS ENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTONOMOUS_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	AUTONOMOUS_ENTITY(1, "AUTONOMOUS_ENTITY", "AUTONOMOUS_ENTITY"),

	/**
	 * The '<em><b>RELATIONSHIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIONSHIP(3, "RELATIONSHIP", "RELATIONSHIP");

	/**
	 * The '<em><b>CONTROLLED ENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLED_ENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLED_ENTITY_VALUE = 0;

	/**
	 * The '<em><b>AUTONOMOUS ENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTONOMOUS_ENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMOUS_ENTITY_VALUE = 1;

	/**
	 * The '<em><b>RELATIONSHIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONSHIP_VALUE = 3;

	/**
	 * An array of all the '<em><b>DEntity Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DEntityNature[] VALUES_ARRAY =
		new DEntityNature[]
		{
			CONTROLLED_ENTITY,
			AUTONOMOUS_ENTITY,
			RELATIONSHIP,
		};

	/**
	 * A public read-only list of all the '<em><b>DEntity Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DEntityNature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DEntity Nature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DEntityNature get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DEntityNature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DEntity Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DEntityNature getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DEntityNature result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DEntity Nature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DEntityNature get(int value)
	{
		switch (value)
		{
			case CONTROLLED_ENTITY_VALUE: return CONTROLLED_ENTITY;
			case AUTONOMOUS_ENTITY_VALUE: return AUTONOMOUS_ENTITY;
			case RELATIONSHIP_VALUE: return RELATIONSHIP;
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
	private DEntityNature(int value, String name, String literal)
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
	
} //DEntityNature
