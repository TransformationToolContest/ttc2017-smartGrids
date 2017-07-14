/**
 */
package gluemodel.substationStandard.Enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Switch Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.Enumerations.EnumerationsPackage#getSwitchTypeKind()
 * @model
 * @generated
 */
public enum SwitchTypeKind implements Enumerator {
	/**
	 * The '<em><b>Load Break</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_BREAK_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_BREAK(0, "loadBreak", "loadBreak"),

	/**
	 * The '<em><b>Disconnector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONNECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DISCONNECTOR(0, "disconnector", "disconnector"),

	/**
	 * The '<em><b>Earthing Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHING_SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	EARTHING_SWITCH(0, "earthingSwitch", "earthingSwitch"),

	/**
	 * The '<em><b>High Speed Earthing Switch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_EARTHING_SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_SPEED_EARTHING_SWITCH(0, "highSpeedEarthingSwitch", "highSpeedEarthingSwitch");

	/**
	 * The '<em><b>Load Break</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load Break</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_BREAK
	 * @model name="loadBreak"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BREAK_VALUE = 0;

	/**
	 * The '<em><b>Disconnector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disconnector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCONNECTOR
	 * @model name="disconnector"
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTOR_VALUE = 0;

	/**
	 * The '<em><b>Earthing Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Earthing Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARTHING_SWITCH
	 * @model name="earthingSwitch"
	 * @generated
	 * @ordered
	 */
	public static final int EARTHING_SWITCH_VALUE = 0;

	/**
	 * The '<em><b>High Speed Earthing Switch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Speed Earthing Switch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_EARTHING_SWITCH
	 * @model name="highSpeedEarthingSwitch"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_SPEED_EARTHING_SWITCH_VALUE = 0;

	/**
	 * An array of all the '<em><b>Switch Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SwitchTypeKind[] VALUES_ARRAY =
		new SwitchTypeKind[] {
			LOAD_BREAK,
			DISCONNECTOR,
			EARTHING_SWITCH,
			HIGH_SPEED_EARTHING_SWITCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Switch Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SwitchTypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Switch Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchTypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SwitchTypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Switch Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchTypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SwitchTypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Switch Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchTypeKind get(int value) {
		switch (value) {
			case LOAD_BREAK_VALUE: return LOAD_BREAK;
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
	private SwitchTypeKind(int value, String name, String literal) {
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
	
} //SwitchTypeKind
