/**
 */
package CIM.IEC61970.Wires;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Winding Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Wires.WiresPackage#getWindingType()
 * @model
 * @generated
 */
public enum WindingType implements Enumerator {
	/**
	 * The '<em><b>Tertiary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERTIARY_VALUE
	 * @generated
	 * @ordered
	 */
	TERTIARY(0, "tertiary", "tertiary"),

	/**
	 * The '<em><b>Quaternary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUATERNARY_VALUE
	 * @generated
	 * @ordered
	 */
	QUATERNARY(1, "quaternary", "quaternary"),

	/**
	 * The '<em><b>Primary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY(2, "primary", "primary"),

	/**
	 * The '<em><b>Secondary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDARY(3, "secondary", "secondary");

	/**
	 * The '<em><b>Tertiary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tertiary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERTIARY
	 * @model name="tertiary"
	 * @generated
	 * @ordered
	 */
	public static final int TERTIARY_VALUE = 0;

	/**
	 * The '<em><b>Quaternary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quaternary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUATERNARY
	 * @model name="quaternary"
	 * @generated
	 * @ordered
	 */
	public static final int QUATERNARY_VALUE = 1;

	/**
	 * The '<em><b>Primary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Primary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMARY
	 * @model name="primary"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_VALUE = 2;

	/**
	 * The '<em><b>Secondary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Secondary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECONDARY
	 * @model name="secondary"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDARY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Winding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WindingType[] VALUES_ARRAY =
		new WindingType[] {
			TERTIARY,
			QUATERNARY,
			PRIMARY,
			SECONDARY,
		};

	/**
	 * A public read-only list of all the '<em><b>Winding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WindingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Winding Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WindingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Winding Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WindingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Winding Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindingType get(int value) {
		switch (value) {
			case TERTIARY_VALUE: return TERTIARY;
			case QUATERNARY_VALUE: return QUATERNARY;
			case PRIMARY_VALUE: return PRIMARY;
			case SECONDARY_VALUE: return SECONDARY;
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
	private WindingType(int value, String name, String literal) {
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
	
} //WindingType
