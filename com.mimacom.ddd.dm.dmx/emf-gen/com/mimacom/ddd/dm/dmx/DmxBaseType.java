/**
 */
package com.mimacom.ddd.dm.dmx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Base Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxBaseType()
 * @model
 * @generated
 */
public enum DmxBaseType implements Enumerator
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
	 * The '<em><b>AMBIGUOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMBIGUOUS_VALUE
	 * @generated
	 * @ordered
	 */
	AMBIGUOUS(1, "AMBIGUOUS", "AMBIGUOUS"),

	/**
	 * The '<em><b>VOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOID_VALUE
	 * @generated
	 * @ordered
	 */
	VOID(2, "VOID", "VOID"),

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(3, "BOOLEAN", "BOOLEAN"),

	/**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(4, "NUMBER", "NUMBER"),

	/**
	 * The '<em><b>TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(5, "TEXT", "TEXT"),

	/**
	 * The '<em><b>IDENTIFIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(6, "IDENTIFIER", "IDENTIFIER"),

	/**
	 * The '<em><b>TIMEPOINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMEPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	TIMEPOINT(7, "TIMEPOINT", "TIMEPOINT"),

	/**
	 * The '<em><b>ENUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM(101, "ENUM", "ENUM"),

	/**
	 * The '<em><b>STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE(102, "STATE", "STATE"),

	/**
	 * The '<em><b>STATE EVENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_EVENT(103, "STATE_EVENT", "STATE_EVENT"),

	/**
	 * The '<em><b>COMPLEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEX(104, "COMPLEX", "COMPLEX"),

	/**
	 * The '<em><b>AGGREGATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATE_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATE(105, "AGGREGATE", "AGGREGATE"),

	/**
	 * The '<em><b>NOTIFICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATION(106, "NOTIFICATION", "NOTIFICATION"),

	/**
	 * The '<em><b>SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(107, "SERVICE", "SERVICE");

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>AMBIGUOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMBIGUOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMBIGUOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMBIGUOUS_VALUE = 1;

	/**
	 * The '<em><b>VOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOID_VALUE = 2;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 3;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 4;

	/**
	 * The '<em><b>TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 5;

	/**
	 * The '<em><b>IDENTIFIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDENTIFIER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 6;

	/**
	 * The '<em><b>TIMEPOINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMEPOINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMEPOINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMEPOINT_VALUE = 7;

	/**
	 * The '<em><b>ENUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VALUE = 101;

	/**
	 * The '<em><b>STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VALUE = 102;

	/**
	 * The '<em><b>STATE EVENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATE EVENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATE_EVENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATE_EVENT_VALUE = 103;

	/**
	 * The '<em><b>COMPLEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLEX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEX_VALUE = 104;

	/**
	 * The '<em><b>AGGREGATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGGREGATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATE_VALUE = 105;

	/**
	 * The '<em><b>NOTIFICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTIFICATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATION_VALUE = 106;

	/**
	 * The '<em><b>SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 107;

	/**
	 * An array of all the '<em><b>Base Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DmxBaseType[] VALUES_ARRAY =
		new DmxBaseType[]
		{
			UNDEFINED,
			AMBIGUOUS,
			VOID,
			BOOLEAN,
			NUMBER,
			TEXT,
			IDENTIFIER,
			TIMEPOINT,
			ENUM,
			STATE,
			STATE_EVENT,
			COMPLEX,
			AGGREGATE,
			NOTIFICATION,
			SERVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Base Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DmxBaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Base Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DmxBaseType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DmxBaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Base Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DmxBaseType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DmxBaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Base Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DmxBaseType get(int value)
	{
		switch (value)
		{
			case UNDEFINED_VALUE: return UNDEFINED;
			case AMBIGUOUS_VALUE: return AMBIGUOUS;
			case VOID_VALUE: return VOID;
			case BOOLEAN_VALUE: return BOOLEAN;
			case NUMBER_VALUE: return NUMBER;
			case TEXT_VALUE: return TEXT;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case TIMEPOINT_VALUE: return TIMEPOINT;
			case ENUM_VALUE: return ENUM;
			case STATE_VALUE: return STATE;
			case STATE_EVENT_VALUE: return STATE_EVENT;
			case COMPLEX_VALUE: return COMPLEX;
			case AGGREGATE_VALUE: return AGGREGATE;
			case NOTIFICATION_VALUE: return NOTIFICATION;
			case SERVICE_VALUE: return SERVICE;
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
	private DmxBaseType(int value, String name, String literal)
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
	
} //DmxBaseType
