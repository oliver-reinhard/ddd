/**
 */
package com.mimacom.ddd.dm.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DEntity Origin</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.BasePackage#getDEntityOrigin()
 * @model
 * @generated
 */
public enum DEntityOrigin implements Enumerator
{
	/**
	 * The '<em><b>GENERIC ENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_ENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_ENTITY(0, "GENERIC_ENTITY", "GENERIC_ENTITY"),

	/**
	 * The '<em><b>PHYSICAL OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_OBJECT(1, "PHYSICAL_OBJECT", "PHYSICAL_OBJECT"),

	/**
	 * The '<em><b>VIRTUAL CONCEPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_CONCEPT(2, "VIRTUAL_CONCEPT", "VIRTUAL_CONCEPT"),

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
	 * The '<em><b>GENERIC ENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GENERIC ENTITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC_ENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_ENTITY_VALUE = 0;

	/**
	 * The '<em><b>PHYSICAL OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHYSICAL OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_OBJECT_VALUE = 1;

	/**
	 * The '<em><b>VIRTUAL CONCEPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIRTUAL CONCEPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_CONCEPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_CONCEPT_VALUE = 2;

	/**
	 * The '<em><b>RELATIONSHIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELATIONSHIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONSHIP_VALUE = 3;

	/**
	 * An array of all the '<em><b>DEntity Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DEntityOrigin[] VALUES_ARRAY =
		new DEntityOrigin[]
		{
			GENERIC_ENTITY,
			PHYSICAL_OBJECT,
			VIRTUAL_CONCEPT,
			RELATIONSHIP,
		};

	/**
	 * A public read-only list of all the '<em><b>DEntity Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DEntityOrigin> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DEntity Origin</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DEntityOrigin get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DEntityOrigin result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DEntity Origin</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DEntityOrigin getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DEntityOrigin result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DEntity Origin</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DEntityOrigin get(int value)
	{
		switch (value)
		{
			case GENERIC_ENTITY_VALUE: return GENERIC_ENTITY;
			case PHYSICAL_OBJECT_VALUE: return PHYSICAL_OBJECT;
			case VIRTUAL_CONCEPT_VALUE: return VIRTUAL_CONCEPT;
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
	private DEntityOrigin(int value, String name, String literal)
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
	
} //DEntityOrigin
