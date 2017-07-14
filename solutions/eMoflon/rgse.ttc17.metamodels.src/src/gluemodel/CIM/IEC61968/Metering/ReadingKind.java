/**
 */
package gluemodel.CIM.IEC61968.Metering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reading Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.Metering.MeteringPackage#getReadingKind()
 * @model
 * @generated
 */
public enum ReadingKind implements Enumerator {
	/**
	 * The '<em><b>Voltage Angle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_ANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE_ANGLE(0, "voltageAngle", "voltageAngle"),

	/**
	 * The '<em><b>Power Factor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_FACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_FACTOR(1, "powerFactor", "powerFactor"),

	/**
	 * The '<em><b>Demand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMAND_VALUE
	 * @generated
	 * @ordered
	 */
	DEMAND(2, "demand", "demand"),

	/**
	 * The '<em><b>Current</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT(3, "current", "current"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(4, "date", "date"),

	/**
	 * The '<em><b>Current Angle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_ANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT_ANGLE(5, "currentAngle", "currentAngle"),

	/**
	 * The '<em><b>Power</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_VALUE
	 * @generated
	 * @ordered
	 */
	POWER(6, "power", "power"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(7, "time", "time"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(8, "other", "other"),

	/**
	 * The '<em><b>Voltage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTAGE(9, "voltage", "voltage"),

	/**
	 * The '<em><b>Energy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGY_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGY(10, "energy", "energy"),

	/**
	 * The '<em><b>Frequency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENCY(11, "frequency", "frequency"),

	/**
	 * The '<em><b>Pressure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSURE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSURE(12, "pressure", "pressure"),

	/**
	 * The '<em><b>Volume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLUME_VALUE
	 * @generated
	 * @ordered
	 */
	VOLUME(13, "volume", "volume"),

	/**
	 * The '<em><b>Phase Angle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASE_ANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	PHASE_ANGLE(14, "phaseAngle", "phaseAngle");

	/**
	 * The '<em><b>Voltage Angle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Voltage Angle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTAGE_ANGLE
	 * @model name="voltageAngle"
	 * @generated
	 * @ordered
	 */
	public static final int VOLTAGE_ANGLE_VALUE = 0;

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
	public static final int POWER_FACTOR_VALUE = 1;

	/**
	 * The '<em><b>Demand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Demand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEMAND
	 * @model name="demand"
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_VALUE = 2;

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
	public static final int CURRENT_VALUE = 3;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 4;

	/**
	 * The '<em><b>Current Angle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Current Angle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURRENT_ANGLE
	 * @model name="currentAngle"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_ANGLE_VALUE = 5;

	/**
	 * The '<em><b>Power</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER
	 * @model name="power"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_VALUE = 6;

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
	public static final int TIME_VALUE = 7;

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
	public static final int OTHER_VALUE = 8;

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
	public static final int VOLTAGE_VALUE = 9;

	/**
	 * The '<em><b>Energy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Energy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENERGY
	 * @model name="energy"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGY_VALUE = 10;

	/**
	 * The '<em><b>Frequency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Frequency</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY
	 * @model name="frequency"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_VALUE = 11;

	/**
	 * The '<em><b>Pressure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pressure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESSURE
	 * @model name="pressure"
	 * @generated
	 * @ordered
	 */
	public static final int PRESSURE_VALUE = 12;

	/**
	 * The '<em><b>Volume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Volume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLUME
	 * @model name="volume"
	 * @generated
	 * @ordered
	 */
	public static final int VOLUME_VALUE = 13;

	/**
	 * The '<em><b>Phase Angle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phase Angle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHASE_ANGLE
	 * @model name="phaseAngle"
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_ANGLE_VALUE = 14;

	/**
	 * An array of all the '<em><b>Reading Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReadingKind[] VALUES_ARRAY =
		new ReadingKind[] {
			VOLTAGE_ANGLE,
			POWER_FACTOR,
			DEMAND,
			CURRENT,
			DATE,
			CURRENT_ANGLE,
			POWER,
			TIME,
			OTHER,
			VOLTAGE,
			ENERGY,
			FREQUENCY,
			PRESSURE,
			VOLUME,
			PHASE_ANGLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Reading Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReadingKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reading Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReadingKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReadingKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reading Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReadingKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReadingKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reading Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReadingKind get(int value) {
		switch (value) {
			case VOLTAGE_ANGLE_VALUE: return VOLTAGE_ANGLE;
			case POWER_FACTOR_VALUE: return POWER_FACTOR;
			case DEMAND_VALUE: return DEMAND;
			case CURRENT_VALUE: return CURRENT;
			case DATE_VALUE: return DATE;
			case CURRENT_ANGLE_VALUE: return CURRENT_ANGLE;
			case POWER_VALUE: return POWER;
			case TIME_VALUE: return TIME;
			case OTHER_VALUE: return OTHER;
			case VOLTAGE_VALUE: return VOLTAGE;
			case ENERGY_VALUE: return ENERGY;
			case FREQUENCY_VALUE: return FREQUENCY;
			case PRESSURE_VALUE: return PRESSURE;
			case VOLUME_VALUE: return VOLUME;
			case PHASE_ANGLE_VALUE: return PHASE_ANGLE;
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
	private ReadingKind(int value, String name, String literal) {
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
	
} //ReadingKind
