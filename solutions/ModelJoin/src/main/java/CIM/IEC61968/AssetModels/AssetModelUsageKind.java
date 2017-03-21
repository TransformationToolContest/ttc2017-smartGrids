/**
 */
package CIM.IEC61968.AssetModels;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Asset Model Usage Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getAssetModelUsageKind()
 * @model
 * @generated
 */
public enum AssetModelUsageKind implements Enumerator {
	/**
	 * The '<em><b>Streetlight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREETLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	STREETLIGHT(0, "streetlight", "streetlight"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "other", "other"),

	/**
	 * The '<em><b>Substation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTATION(2, "substation", "substation"),

	/**
	 * The '<em><b>Customer Substation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_SUBSTATION_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOMER_SUBSTATION(3, "customerSubstation", "customerSubstation"),

	/**
	 * The '<em><b>Distribution Underground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_UNDERGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION_UNDERGROUND(4, "distributionUnderground", "distributionUnderground"),

	/**
	 * The '<em><b>Distribution Overhead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_OVERHEAD_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION_OVERHEAD(5, "distributionOverhead", "distributionOverhead"),

	/**
	 * The '<em><b>Transmission</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION(6, "transmission", "transmission"), /**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(7, "unknown", "unknown");

	/**
	 * The '<em><b>Streetlight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Streetlight</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STREETLIGHT
	 * @model name="streetlight"
	 * @generated
	 * @ordered
	 */
	public static final int STREETLIGHT_VALUE = 0;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>Substation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTATION
	 * @model name="substation"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTATION_VALUE = 2;

	/**
	 * The '<em><b>Customer Substation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Customer Substation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_SUBSTATION
	 * @model name="customerSubstation"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER_SUBSTATION_VALUE = 3;

	/**
	 * The '<em><b>Distribution Underground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distribution Underground</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_UNDERGROUND
	 * @model name="distributionUnderground"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_UNDERGROUND_VALUE = 4;

	/**
	 * The '<em><b>Distribution Overhead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distribution Overhead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_OVERHEAD
	 * @model name="distributionOverhead"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_OVERHEAD_VALUE = 5;

	/**
	 * The '<em><b>Transmission</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION
	 * @model name="transmission"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_VALUE = 6;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Asset Model Usage Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssetModelUsageKind[] VALUES_ARRAY =
		new AssetModelUsageKind[] {
			STREETLIGHT,
			OTHER,
			SUBSTATION,
			CUSTOMER_SUBSTATION,
			DISTRIBUTION_UNDERGROUND,
			DISTRIBUTION_OVERHEAD,
			TRANSMISSION,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Asset Model Usage Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssetModelUsageKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Asset Model Usage Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetModelUsageKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssetModelUsageKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Asset Model Usage Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetModelUsageKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssetModelUsageKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Asset Model Usage Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetModelUsageKind get(int value) {
		switch (value) {
			case STREETLIGHT_VALUE: return STREETLIGHT;
			case OTHER_VALUE: return OTHER;
			case SUBSTATION_VALUE: return SUBSTATION;
			case CUSTOMER_SUBSTATION_VALUE: return CUSTOMER_SUBSTATION;
			case DISTRIBUTION_UNDERGROUND_VALUE: return DISTRIBUTION_UNDERGROUND;
			case DISTRIBUTION_OVERHEAD_VALUE: return DISTRIBUTION_OVERHEAD;
			case TRANSMISSION_VALUE: return TRANSMISSION;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private AssetModelUsageKind(int value, String name, String literal) {
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
	
} //AssetModelUsageKind
