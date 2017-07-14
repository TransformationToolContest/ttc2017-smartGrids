/**
 */
package gluemodel.substationStandard.Enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Originator Category Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.Enumerations.EnumerationsPackage#getOriginatorCategoryKind()
 * @model
 * @generated
 */
public enum OriginatorCategoryKind implements Enumerator {
	/**
	 * The '<em><b>Not Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SUPPORTED(0, "notSupported", "notSupported"),

	/**
	 * The '<em><b>Bay Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAY_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	BAY_CONTROL(0, "bayControl", "bayControl"),

	/**
	 * The '<em><b>Station Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATION_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	STATION_CONTROL(0, "stationControl", "stationControl"),

	/**
	 * The '<em><b>Remote Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_CONTROL(0, "remoteControl", "remoteControl"),

	/**
	 * The '<em><b>Automatic Bay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_BAY_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC_BAY(0, "automaticBay", "automaticBay"),

	/**
	 * The '<em><b>Automatic Station</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_STATION_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC_STATION(0, "automaticStation", "automaticStation"),

	/**
	 * The '<em><b>Automatic Remote</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_REMOTE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATIC_REMOTE(0, "automaticRemote", "automaticRemote"),

	/**
	 * The '<em><b>Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTENANCE(0, "maintenance", "maintenance"),

	/**
	 * The '<em><b>Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS(0, "process", "process");

	/**
	 * The '<em><b>Not Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Supported</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_SUPPORTED
	 * @model name="notSupported"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SUPPORTED_VALUE = 0;

	/**
	 * The '<em><b>Bay Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bay Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAY_CONTROL
	 * @model name="bayControl"
	 * @generated
	 * @ordered
	 */
	public static final int BAY_CONTROL_VALUE = 0;

	/**
	 * The '<em><b>Station Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Station Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATION_CONTROL
	 * @model name="stationControl"
	 * @generated
	 * @ordered
	 */
	public static final int STATION_CONTROL_VALUE = 0;

	/**
	 * The '<em><b>Remote Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_CONTROL
	 * @model name="remoteControl"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_CONTROL_VALUE = 0;

	/**
	 * The '<em><b>Automatic Bay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Automatic Bay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_BAY
	 * @model name="automaticBay"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_BAY_VALUE = 0;

	/**
	 * The '<em><b>Automatic Station</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Automatic Station</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_STATION
	 * @model name="automaticStation"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_STATION_VALUE = 0;

	/**
	 * The '<em><b>Automatic Remote</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Automatic Remote</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOMATIC_REMOTE
	 * @model name="automaticRemote"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATIC_REMOTE_VALUE = 0;

	/**
	 * The '<em><b>Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE
	 * @model name="maintenance"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_VALUE = 0;

	/**
	 * The '<em><b>Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Process</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESS
	 * @model name="process"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Originator Category Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OriginatorCategoryKind[] VALUES_ARRAY =
		new OriginatorCategoryKind[] {
			NOT_SUPPORTED,
			BAY_CONTROL,
			STATION_CONTROL,
			REMOTE_CONTROL,
			AUTOMATIC_BAY,
			AUTOMATIC_STATION,
			AUTOMATIC_REMOTE,
			MAINTENANCE,
			PROCESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Originator Category Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OriginatorCategoryKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Originator Category Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OriginatorCategoryKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OriginatorCategoryKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Originator Category Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OriginatorCategoryKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OriginatorCategoryKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Originator Category Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OriginatorCategoryKind get(int value) {
		switch (value) {
			case NOT_SUPPORTED_VALUE: return NOT_SUPPORTED;
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
	private OriginatorCategoryKind(int value, String name, String literal) {
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
	
} //OriginatorCategoryKind
