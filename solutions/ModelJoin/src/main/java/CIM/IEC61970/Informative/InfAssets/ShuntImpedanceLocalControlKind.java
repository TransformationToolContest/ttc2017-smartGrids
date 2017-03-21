/**
 */
package CIM.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shunt Impedance Local Control Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getShuntImpedanceLocalControlKind()
 * @model
 * @generated
 */
public enum ShuntImpedanceLocalControlKind implements Enumerator {
	/**
	 * The '<em><b>Current</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT(0, "current", "current"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(1, "none", "none"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(2, "time", "time"),

	/**
	 * The '<em><b>Power Factor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_FACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_FACTOR(3, "powerFactor", "powerFactor"),

	/**
	 * The '<em><b>Reactive Power</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REACTIVE_POWER_VALUE
	 * @generated
	 * @ordered
	 */
	REACTIVE_POWER(4, "reactivePower", "reactivePower"),

	/**
	 * The '<em><b>Voltage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE(5, "voltage", "voltage"),

	/**
	 * The '<em><b>Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(6, "temperature", "temperature");

	/**
	 * The '<em><b>Current</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Current</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURRENT
	 * @model name="current"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_VALUE = 0;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 1;

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
	public static final int TIME_VALUE = 2;

	/**
	 * The '<em><b>Power Factor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Factor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER_FACTOR
	 * @model name="powerFactor"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_FACTOR_VALUE = 3;

	/**
	 * The '<em><b>Reactive Power</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reactive Power</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REACTIVE_POWER
	 * @model name="reactivePower"
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVE_POWER_VALUE = 4;

	/**
	 * The '<em><b>Voltage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voltage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE
	 * @model name="voltage"
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_VALUE = 5;

	/**
	 * The '<em><b>Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temperature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model name="temperature"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Shunt Impedance Local Control Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ShuntImpedanceLocalControlKind[] VALUES_ARRAY =
		new ShuntImpedanceLocalControlKind[] {
			CURRENT,
			NONE,
			TIME,
			POWER_FACTOR,
			REACTIVE_POWER,
			VOLTAGE,
			TEMPERATURE,
		};

	/**
	 * A public read-only list of all the '<em><b>Shunt Impedance Local Control Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ShuntImpedanceLocalControlKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shunt Impedance Local Control Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ShuntImpedanceLocalControlKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShuntImpedanceLocalControlKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shunt Impedance Local Control Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ShuntImpedanceLocalControlKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ShuntImpedanceLocalControlKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shunt Impedance Local Control Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ShuntImpedanceLocalControlKind get(int value) {
		switch (value) {
			case CURRENT_VALUE: return CURRENT;
			case NONE_VALUE: return NONE;
			case TIME_VALUE: return TIME;
			case POWER_FACTOR_VALUE: return POWER_FACTOR;
			case REACTIVE_POWER_VALUE: return REACTIVE_POWER;
			case VOLTAGE_VALUE: return VOLTAGE;
			case TEMPERATURE_VALUE: return TEMPERATURE;
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
	private ShuntImpedanceLocalControlKind(int value, String name, String literal) {
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
	
} //ShuntImpedanceLocalControlKind
