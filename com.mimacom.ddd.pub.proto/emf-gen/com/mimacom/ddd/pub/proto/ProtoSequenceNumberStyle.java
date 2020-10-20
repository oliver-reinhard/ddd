/**
 */
package com.mimacom.ddd.pub.proto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sequence Number Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoSequenceNumberStyle()
 * @model
 * @generated
 */
public enum ProtoSequenceNumberStyle implements Enumerator {
	/**
	 * The '<em><b>Arabic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARABIC_VALUE
	 * @generated
	 * @ordered
	 */
	ARABIC(0, "Arabic", "Arabic"),

	/**
	 * The '<em><b>Capital Roman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPITAL_ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	CAPITAL_ROMAN(0, "CapitalRoman", "CapitalRoman"),

	/**
	 * The '<em><b>Small Roman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_ROMAN(0, "SmallRoman", "SmallRoman"),

	/**
	 * The '<em><b>Capital Letter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPITAL_LETTER_VALUE
	 * @generated
	 * @ordered
	 */
	CAPITAL_LETTER(0, "CapitalLetter", "CapitalLetter"),

	/**
	 * The '<em><b>Small Letter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_LETTER_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_LETTER(0, "SmallLetter", "SmallLetter"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None");

	/**
	 * The '<em><b>Arabic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARABIC
	 * @model name="Arabic"
	 * @generated
	 * @ordered
	 */
	public static final int ARABIC_VALUE = 0;

	/**
	 * The '<em><b>Capital Roman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPITAL_ROMAN
	 * @model name="CapitalRoman"
	 * @generated
	 * @ordered
	 */
	public static final int CAPITAL_ROMAN_VALUE = 0;

	/**
	 * The '<em><b>Small Roman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_ROMAN
	 * @model name="SmallRoman"
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_ROMAN_VALUE = 0;

	/**
	 * The '<em><b>Capital Letter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPITAL_LETTER
	 * @model name="CapitalLetter"
	 * @generated
	 * @ordered
	 */
	public static final int CAPITAL_LETTER_VALUE = 0;

	/**
	 * The '<em><b>Small Letter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_LETTER
	 * @model name="SmallLetter"
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_LETTER_VALUE = 0;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Sequence Number Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtoSequenceNumberStyle[] VALUES_ARRAY =
		new ProtoSequenceNumberStyle[] {
			ARABIC,
			CAPITAL_ROMAN,
			SMALL_ROMAN,
			CAPITAL_LETTER,
			SMALL_LETTER,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Sequence Number Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtoSequenceNumberStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sequence Number Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtoSequenceNumberStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtoSequenceNumberStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sequence Number Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtoSequenceNumberStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtoSequenceNumberStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sequence Number Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtoSequenceNumberStyle get(int value) {
		switch (value) {
			case ARABIC_VALUE: return ARABIC;
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
	private ProtoSequenceNumberStyle(int value, String name, String literal) {
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
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProtoSequenceNumberStyle
