/**
 */
package com.mimacom.ddd.dm.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DIdentity Origin</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.BasePackage#getDIdentityOrigin()
 * @model
 * @generated
 */
public enum DIdentityOrigin implements Enumerator
{
	/**
	 * The '<em><b>REAL WORLD OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_WORLD_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	REAL_WORLD_OBJECT(0, "REAL_WORLD_OBJECT", "REAL_WORLD_OBJECT"),

	/**
	 * The '<em><b>VIRTUAL CONCEPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_CONCEPT(1, "VIRTUAL_CONCEPT", "VIRTUAL_CONCEPT"),

	/**
	 * The '<em><b>GENERIC ENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_ENTITY(2, "GENERIC_ENTITY", "GENERIC_ENTITY");

	/**
	 * The '<em><b>REAL WORLD OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_WORLD_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_WORLD_OBJECT_VALUE = 0;

	/**
	 * The '<em><b>VIRTUAL CONCEPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_CONCEPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_CONCEPT_VALUE = 1;

	/**
	 * The '<em><b>GENERIC ENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_ENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ENTITY_VALUE = 2;

	/**
	 * An array of all the '<em><b>DIdentity Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DIdentityOrigin[] VALUES_ARRAY =
		new DIdentityOrigin[]
		{
			REAL_WORLD_OBJECT,
			VIRTUAL_CONCEPT,
			GENERIC_ENTITY,
		};

	/**
	 * A public read-only list of all the '<em><b>DIdentity Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DIdentityOrigin> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DIdentity Origin</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DIdentityOrigin get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DIdentityOrigin result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DIdentity Origin</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DIdentityOrigin getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DIdentityOrigin result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DIdentity Origin</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DIdentityOrigin get(int value)
	{
		switch (value)
		{
			case REAL_WORLD_OBJECT_VALUE: return REAL_WORLD_OBJECT;
			case VIRTUAL_CONCEPT_VALUE: return VIRTUAL_CONCEPT;
			case GENERIC_ENTITY_VALUE: return GENERIC_ENTITY;
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
	private DIdentityOrigin(int value, String name, String literal)
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
	
} //DIdentityOrigin
