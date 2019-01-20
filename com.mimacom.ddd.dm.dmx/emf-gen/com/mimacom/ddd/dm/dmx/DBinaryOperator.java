/**
 */
package com.mimacom.ddd.dm.dmx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DBinary Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDBinaryOperator()
 * @model
 * @generated
 */
public enum DBinaryOperator implements Enumerator
{
	/**
	 * The '<em><b>ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(0, "ADD", "ADD"),

	/**
	 * The '<em><b>SUBTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTRACT(1, "SUBTRACT", "SUBTRACT"),

	/**
	 * The '<em><b>MULTIPLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLY(2, "MULTIPLY", "MULTIPLY"),

	/**
	 * The '<em><b>DIVIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	DIVIDE(3, "DIVIDE", "DIVIDE"),

	/**
	 * The '<em><b>POWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_VALUE
	 * @generated
	 * @ordered
	 */
	POWER(4, "POWER", "POWER"),

	/**
	 * The '<em><b>MODULO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULO_VALUE
	 * @generated
	 * @ordered
	 */
	MODULO(5, "MODULO", "MODULO"),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(6, "AND", "AND"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(7, "OR", "OR"),

	/**
	 * The '<em><b>XOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR_VALUE
	 * @generated
	 * @ordered
	 */
	XOR(8, "XOR", "XOR"),

	/**
	 * The '<em><b>EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(9, "EQUAL", "EQUAL"),

	/**
	 * The '<em><b>NOT EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL(10, "NOT_EQUAL", "NOT_EQUAL"),

	/**
	 * The '<em><b>LESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_VALUE
	 * @generated
	 * @ordered
	 */
	LESS(11, "LESS", "LESS"),

	/**
	 * The '<em><b>LESS OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_OR_EQUAL(12, "LESS_OR_EQUAL", "LESS_OR_EQUAL"),

	/**
	 * The '<em><b>GREATER OR EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_OR_EQUAL(13, "GREATER_OR_EQUAL", "GREATER_OR_EQUAL"),

	/**
	 * The '<em><b>GREATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(14, "GREATER", "GREATER"),

	/**
	 * The '<em><b>UNTIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNTIL_VALUE
	 * @generated
	 * @ordered
	 */
	UNTIL(15, "UNTIL", "UNTIL"),

	/**
	 * The '<em><b>SINGLE ARROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_ARROW(16, "SINGLE_ARROW", "SINGLE_ARROW"),

	/**
	 * The '<em><b>DOUBLE ARROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_ARROW(17, "DOUBLE_ARROW", "DOUBLE_ARROW");

	/**
	 * The '<em><b>ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 0;

	/**
	 * The '<em><b>SUBTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACT_VALUE = 1;

	/**
	 * The '<em><b>MULTIPLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLY_VALUE = 2;

	/**
	 * The '<em><b>DIVIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIVIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIVIDE_VALUE = 3;

	/**
	 * The '<em><b>POWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POWER_VALUE = 4;

	/**
	 * The '<em><b>MODULO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODULO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODULO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODULO_VALUE = 5;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 6;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 7;

	/**
	 * The '<em><b>XOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XOR_VALUE = 8;

	/**
	 * The '<em><b>EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 9;

	/**
	 * The '<em><b>NOT EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_VALUE = 10;

	/**
	 * The '<em><b>LESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_VALUE = 11;

	/**
	 * The '<em><b>LESS OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESS OR EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_OR_EQUAL_VALUE = 12;

	/**
	 * The '<em><b>GREATER OR EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATER OR EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_OR_EQUAL_VALUE = 13;

	/**
	 * The '<em><b>GREATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 14;

	/**
	 * The '<em><b>UNTIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNTIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNTIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNTIL_VALUE = 15;

	/**
	 * The '<em><b>SINGLE ARROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE ARROW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_ARROW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_ARROW_VALUE = 16;

	/**
	 * The '<em><b>DOUBLE ARROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE ARROW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_ARROW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_ARROW_VALUE = 17;

	/**
	 * An array of all the '<em><b>DBinary Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DBinaryOperator[] VALUES_ARRAY =
		new DBinaryOperator[]
		{
			ADD,
			SUBTRACT,
			MULTIPLY,
			DIVIDE,
			POWER,
			MODULO,
			AND,
			OR,
			XOR,
			EQUAL,
			NOT_EQUAL,
			LESS,
			LESS_OR_EQUAL,
			GREATER_OR_EQUAL,
			GREATER,
			UNTIL,
			SINGLE_ARROW,
			DOUBLE_ARROW,
		};

	/**
	 * A public read-only list of all the '<em><b>DBinary Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DBinaryOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DBinary Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DBinaryOperator get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DBinaryOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DBinary Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DBinaryOperator getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DBinaryOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DBinary Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DBinaryOperator get(int value)
	{
		switch (value)
		{
			case ADD_VALUE: return ADD;
			case SUBTRACT_VALUE: return SUBTRACT;
			case MULTIPLY_VALUE: return MULTIPLY;
			case DIVIDE_VALUE: return DIVIDE;
			case POWER_VALUE: return POWER;
			case MODULO_VALUE: return MODULO;
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
			case XOR_VALUE: return XOR;
			case EQUAL_VALUE: return EQUAL;
			case NOT_EQUAL_VALUE: return NOT_EQUAL;
			case LESS_VALUE: return LESS;
			case LESS_OR_EQUAL_VALUE: return LESS_OR_EQUAL;
			case GREATER_OR_EQUAL_VALUE: return GREATER_OR_EQUAL;
			case GREATER_VALUE: return GREATER;
			case UNTIL_VALUE: return UNTIL;
			case SINGLE_ARROW_VALUE: return SINGLE_ARROW;
			case DOUBLE_ARROW_VALUE: return DOUBLE_ARROW;
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
	private DBinaryOperator(int value, String name, String literal)
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
	
} //DBinaryOperator
