/**
 */
package gluemodel.CIM.IEC61970.Generation.Production;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hydro Plant Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPlantType()
 * @model
 * @generated
 */
public enum HydroPlantType implements Enumerator {
	/**
	 * The '<em><b>Major Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJOR_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MAJOR_STORAGE(0, "majorStorage", "majorStorage"),

	/**
	 * The '<em><b>Pumped Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUMPED_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PUMPED_STORAGE(1, "pumpedStorage", "pumpedStorage"),

	/**
	 * The '<em><b>Minor Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINOR_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MINOR_STORAGE(2, "minorStorage", "minorStorage"),

	/**
	 * The '<em><b>Run Of River</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUN_OF_RIVER_VALUE
	 * @generated
	 * @ordered
	 */
	RUN_OF_RIVER(3, "runOfRiver", "runOfRiver");

	/**
	 * The '<em><b>Major Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Major Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAJOR_STORAGE
	 * @model name="majorStorage"
	 * @generated
	 * @ordered
	 */
	public static final int MAJOR_STORAGE_VALUE = 0;

	/**
	 * The '<em><b>Pumped Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pumped Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUMPED_STORAGE
	 * @model name="pumpedStorage"
	 * @generated
	 * @ordered
	 */
	public static final int PUMPED_STORAGE_VALUE = 1;

	/**
	 * The '<em><b>Minor Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minor Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINOR_STORAGE
	 * @model name="minorStorage"
	 * @generated
	 * @ordered
	 */
	public static final int MINOR_STORAGE_VALUE = 2;

	/**
	 * The '<em><b>Run Of River</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Run Of River</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUN_OF_RIVER
	 * @model name="runOfRiver"
	 * @generated
	 * @ordered
	 */
	public static final int RUN_OF_RIVER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Hydro Plant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HydroPlantType[] VALUES_ARRAY =
		new HydroPlantType[] {
			MAJOR_STORAGE,
			PUMPED_STORAGE,
			MINOR_STORAGE,
			RUN_OF_RIVER,
		};

	/**
	 * A public read-only list of all the '<em><b>Hydro Plant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HydroPlantType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hydro Plant Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HydroPlantType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HydroPlantType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hydro Plant Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HydroPlantType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HydroPlantType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hydro Plant Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HydroPlantType get(int value) {
		switch (value) {
			case MAJOR_STORAGE_VALUE: return MAJOR_STORAGE;
			case PUMPED_STORAGE_VALUE: return PUMPED_STORAGE;
			case MINOR_STORAGE_VALUE: return MINOR_STORAGE;
			case RUN_OF_RIVER_VALUE: return RUN_OF_RIVER;
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
	private HydroPlantType(int value, String name, String literal) {
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
	
} //HydroPlantType
