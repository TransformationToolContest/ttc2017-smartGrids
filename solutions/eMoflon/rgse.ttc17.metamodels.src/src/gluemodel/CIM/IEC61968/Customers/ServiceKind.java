/**
 */
package gluemodel.CIM.IEC61968.Customers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.Customers.CustomersPackage#getServiceKind()
 * @model
 * @generated
 */
public enum ServiceKind implements Enumerator {
	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(0, "time", "time"),

	/**
	 * The '<em><b>Gas</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAS(1, "gas", "gas"),

	/**
	 * The '<em><b>Sewerage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEWERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SEWERAGE(2, "sewerage", "sewerage"),

	/**
	 * The '<em><b>Rates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATES_VALUE
	 * @generated
	 * @ordered
	 */
	RATES(3, "rates", "rates"),

	/**
	 * The '<em><b>Electricity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICITY_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICITY(4, "electricity", "electricity"),

	/**
	 * The '<em><b>Tv Licence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TV_LICENCE_VALUE
	 * @generated
	 * @ordered
	 */
	TV_LICENCE(5, "tvLicence", "tvLicence"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "other", "other"),

	/**
	 * The '<em><b>Refuse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUSE_VALUE
	 * @generated
	 * @ordered
	 */
	REFUSE(7, "refuse", "refuse"),

	/**
	 * The '<em><b>Water</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_VALUE
	 * @generated
	 * @ordered
	 */
	WATER(8, "water", "water"),

	/**
	 * The '<em><b>Internet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNET_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNET(9, "internet", "internet"),

	/**
	 * The '<em><b>Heat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT(10, "heat", "heat");

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 0;

	/**
	 * The '<em><b>Gas</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gas</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAS
	 * @model name="gas"
	 * @generated
	 * @ordered
	 */
	public static final int GAS_VALUE = 1;

	/**
	 * The '<em><b>Sewerage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sewerage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEWERAGE
	 * @model name="sewerage"
	 * @generated
	 * @ordered
	 */
	public static final int SEWERAGE_VALUE = 2;

	/**
	 * The '<em><b>Rates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rates</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATES
	 * @model name="rates"
	 * @generated
	 * @ordered
	 */
	public static final int RATES_VALUE = 3;

	/**
	 * The '<em><b>Electricity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electricity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICITY
	 * @model name="electricity"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICITY_VALUE = 4;

	/**
	 * The '<em><b>Tv Licence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tv Licence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TV_LICENCE
	 * @model name="tvLicence"
	 * @generated
	 * @ordered
	 */
	public static final int TV_LICENCE_VALUE = 5;

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
	public static final int OTHER_VALUE = 6;

	/**
	 * The '<em><b>Refuse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Refuse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFUSE
	 * @model name="refuse"
	 * @generated
	 * @ordered
	 */
	public static final int REFUSE_VALUE = 7;

	/**
	 * The '<em><b>Water</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Water</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATER
	 * @model name="water"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_VALUE = 8;

	/**
	 * The '<em><b>Internet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Internet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNET
	 * @model name="internet"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNET_VALUE = 9;

	/**
	 * The '<em><b>Heat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Heat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEAT
	 * @model name="heat"
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_VALUE = 10;

	/**
	 * An array of all the '<em><b>Service Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceKind[] VALUES_ARRAY =
		new ServiceKind[] {
			TIME,
			GAS,
			SEWERAGE,
			RATES,
			ELECTRICITY,
			TV_LICENCE,
			OTHER,
			REFUSE,
			WATER,
			INTERNET,
			HEAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServiceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServiceKind get(int value) {
		switch (value) {
			case TIME_VALUE: return TIME;
			case GAS_VALUE: return GAS;
			case SEWERAGE_VALUE: return SEWERAGE;
			case RATES_VALUE: return RATES;
			case ELECTRICITY_VALUE: return ELECTRICITY;
			case TV_LICENCE_VALUE: return TV_LICENCE;
			case OTHER_VALUE: return OTHER;
			case REFUSE_VALUE: return REFUSE;
			case WATER_VALUE: return WATER;
			case INTERNET_VALUE: return INTERNET;
			case HEAT_VALUE: return HEAT;
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
	private ServiceKind(int value, String name, String literal) {
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
	
} //ServiceKind
