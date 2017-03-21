/**
 */
package CIM.IEC61970.Domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monetary Amount Rate</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Domain.DomainPackage#getMonetaryAmountRate()
 * @model
 * @generated
 */
public enum MonetaryAmountRate implements Enumerator {
	/**
	 * The '<em><b>EUR per s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUR_PER_S_VALUE
	 * @generated
	 * @ordered
	 */
	EUR_PER_S(0, "EUR_per_s", "EUR_per_s"),

	/**
	 * The '<em><b>USD per s</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USD_PER_S_VALUE
	 * @generated
	 * @ordered
	 */
	USD_PER_S(1, "USD_per_s", "USD_per_s");

	/**
	 * The '<em><b>EUR per s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUR per s</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUR_PER_S
	 * @model name="EUR_per_s"
	 * @generated
	 * @ordered
	 */
	public static final int EUR_PER_S_VALUE = 0;

	/**
	 * The '<em><b>USD per s</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USD per s</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USD_PER_S
	 * @model name="USD_per_s"
	 * @generated
	 * @ordered
	 */
	public static final int USD_PER_S_VALUE = 1;

	/**
	 * An array of all the '<em><b>Monetary Amount Rate</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonetaryAmountRate[] VALUES_ARRAY =
		new MonetaryAmountRate[] {
			EUR_PER_S,
			USD_PER_S,
		};

	/**
	 * A public read-only list of all the '<em><b>Monetary Amount Rate</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonetaryAmountRate> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monetary Amount Rate</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonetaryAmountRate get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonetaryAmountRate result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monetary Amount Rate</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonetaryAmountRate getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonetaryAmountRate result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monetary Amount Rate</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonetaryAmountRate get(int value) {
		switch (value) {
			case EUR_PER_S_VALUE: return EUR_PER_S;
			case USD_PER_S_VALUE: return USD_PER_S;
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
	private MonetaryAmountRate(int value, String name, String literal) {
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
	
} //MonetaryAmountRate
