/**
 */
package com.mimacom.ddd.dm.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DSystem Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.BasePackage#getDSystemType()
 * @model
 * @generated
 */
public enum DSystemType implements Enumerator
{
	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

	/**
	 * The '<em><b>VOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID_VALUE
	 * @generated
	 * @ordered
	 */
	VOID(1, "VOID", "VOID"),

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(2, "BOOLEAN", "BOOLEAN"),

	/**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(3, "NUMBER", "NUMBER"),

	/**
	 * The '<em><b>TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(4, "TEXT", "TEXT"),

	/**
	 * The '<em><b>ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(5, "ID", "ID"),

	/**
	 * The '<em><b>TIMEPOINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEPOINT(6, "TIMEPOINT", "TIMEPOINT"),

	/**
	 * The '<em><b>TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE(10, "TYPE", "TYPE"),

	/**
	 * The '<em><b>OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT(11, "OBJECT", "OBJECT"),

	/**
	 * The '<em><b>ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR(12, "ACTOR", "ACTOR"),

	/**
	 * The '<em><b>OPERATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION(13, "OPERATION", "OPERATION"),

	/**
	 * The '<em><b>LAMBDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAMBDA_VALUE
	 * @generated
	 * @ordered
	 */
	LAMBDA(14, "LAMBDA", "LAMBDA");

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>VOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOID_VALUE = 1;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 2;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 3;

	/**
	 * The '<em><b>TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 4;

	/**
	 * The '<em><b>ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 5;

	/**
	 * The '<em><b>TIMEPOINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEPOINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEPOINT_VALUE = 6;

	/**
	 * The '<em><b>TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_VALUE = 10;

	/**
	 * The '<em><b>OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_VALUE = 11;

	/**
	 * The '<em><b>ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_VALUE = 12;

	/**
	 * The '<em><b>OPERATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_VALUE = 13;

	/**
	 * The '<em><b>LAMBDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAMBDA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAMBDA_VALUE = 14;

	/**
	 * An array of all the '<em><b>DSystem Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DSystemType[] VALUES_ARRAY =
		new DSystemType[]
		{
			UNDEFINED,
			VOID,
			BOOLEAN,
			NUMBER,
			TEXT,
			ID,
			TIMEPOINT,
			TYPE,
			OBJECT,
			ACTOR,
			OPERATION,
			LAMBDA,
		};

	/**
	 * A public read-only list of all the '<em><b>DSystem Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DSystemType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DSystem Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DSystemType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DSystemType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DSystem Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DSystemType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DSystemType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DSystem Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DSystemType get(int value)
	{
		switch (value)
		{
			case UNDEFINED_VALUE: return UNDEFINED;
			case VOID_VALUE: return VOID;
			case BOOLEAN_VALUE: return BOOLEAN;
			case NUMBER_VALUE: return NUMBER;
			case TEXT_VALUE: return TEXT;
			case ID_VALUE: return ID;
			case TIMEPOINT_VALUE: return TIMEPOINT;
			case TYPE_VALUE: return TYPE;
			case OBJECT_VALUE: return OBJECT;
			case ACTOR_VALUE: return ACTOR;
			case OPERATION_VALUE: return OPERATION;
			case LAMBDA_VALUE: return LAMBDA;
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
	private DSystemType(int value, String name, String literal)
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
	
} //DSystemType
