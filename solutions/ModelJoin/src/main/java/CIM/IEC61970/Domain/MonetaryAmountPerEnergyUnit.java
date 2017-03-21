/**
 */
package CIM.IEC61970.Domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monetary Amount Per Energy Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Domain.DomainPackage#getMonetaryAmountPerEnergyUnit()
 * @model
 * @generated
 */
public enum MonetaryAmountPerEnergyUnit implements Enumerator {
	/**
	 * The '<em><b>EUR per Wh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUR_PER_WH_VALUE
	 * @generated
	 * @ordered
	 */
	EUR_PER_WH(0, "EUR_per_Wh", "EUR_per_Wh"),

	/**
	 * The '<em><b>USD per Wh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USD_PER_WH_VALUE
	 * @generated
	 * @ordered
	 */
	USD_PER_WH(1, "USD_per_Wh", "USD_per_Wh");

	/**
	 * The '<em><b>EUR per Wh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUR per Wh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUR_PER_WH
	 * @model name="EUR_per_Wh"
	 * @generated
	 * @ordered
	 */
	public static final int EUR_PER_WH_VALUE = 0;

	/**
	 * The '<em><b>USD per Wh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USD per Wh</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USD_PER_WH
	 * @model name="USD_per_Wh"
	 * @generated
	 * @ordered
	 */
	public static final int USD_PER_WH_VALUE = 1;

	/**
	 * An array of all the '<em><b>Monetary Amount Per Energy Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonetaryAmountPerEnergyUnit[] VALUES_ARRAY =
		new MonetaryAmountPerEnergyUnit[] {
			EUR_PER_WH,
			USD_PER_WH,
		};

	/**
	 * A public read-only list of all the '<em><b>Monetary Amount Per Energy Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonetaryAmountPerEnergyUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monetary Amount Per Energy Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonetaryAmountPerEnergyUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonetaryAmountPerEnergyUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monetary Amount Per Energy Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonetaryAmountPerEnergyUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonetaryAmountPerEnergyUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monetary Amount Per Energy Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonetaryAmountPerEnergyUnit get(int value) {
		switch (value) {
			case EUR_PER_WH_VALUE: return EUR_PER_WH;
			case USD_PER_WH_VALUE: return USD_PER_WH;
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
	private MonetaryAmountPerEnergyUnit(int value, String name, String literal) {
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
	
} //MonetaryAmountPerEnergyUnit
