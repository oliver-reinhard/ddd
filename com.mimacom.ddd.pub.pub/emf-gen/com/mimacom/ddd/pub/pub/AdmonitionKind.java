/**
 */
package com.mimacom.ddd.pub.pub;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Admonition Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.pub.pub.PubPackage#getAdmonitionKind()
 * @model
 * @generated
 */
public enum AdmonitionKind implements Enumerator {
	/**
	 * The '<em><b>Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(0, "Note", "Note"),

	/**
	 * The '<em><b>Tip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIP_VALUE
	 * @generated
	 * @ordered
	 */
	TIP(0, "Tip", "Tip"),

	/**
	 * The '<em><b>Caution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUTION_VALUE
	 * @generated
	 * @ordered
	 */
	CAUTION(0, "Caution", "Caution"),

	/**
	 * The '<em><b>Important</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTANT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPORTANT(0, "Important", "Important");

	/**
	 * The '<em><b>Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE
	 * @model name="Note"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 0;

	/**
	 * The '<em><b>Tip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIP
	 * @model name="Tip"
	 * @generated
	 * @ordered
	 */
	public static final int TIP_VALUE = 0;

	/**
	 * The '<em><b>Caution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUTION
	 * @model name="Caution"
	 * @generated
	 * @ordered
	 */
	public static final int CAUTION_VALUE = 0;

	/**
	 * The '<em><b>Important</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTANT
	 * @model name="Important"
	 * @generated
	 * @ordered
	 */
	public static final int IMPORTANT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Admonition Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdmonitionKind[] VALUES_ARRAY =
		new AdmonitionKind[] {
			NOTE,
			TIP,
			CAUTION,
			IMPORTANT,
		};

	/**
	 * A public read-only list of all the '<em><b>Admonition Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdmonitionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Admonition Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdmonitionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdmonitionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Admonition Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdmonitionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdmonitionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Admonition Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdmonitionKind get(int value) {
		switch (value) {
			case NOTE_VALUE: return NOTE;
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
	private AdmonitionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //AdmonitionKind
