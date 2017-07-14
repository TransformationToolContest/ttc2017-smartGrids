/**
 */
package gluemodel.COSEM.Datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Disconnect Control State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.COSEM.Datatypes.DatatypesPackage#getDisconnectControlState()
 * @model
 * @generated
 */
public enum DisconnectControlState implements Enumerator {
	/**
	 * The '<em><b>Disconnected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONNECTED_VALUE
	 * @generated
	 * @ordered
	 */
	DISCONNECTED(0, "Disconnected", "Disconnected"),

	/**
	 * The '<em><b>Connected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTED_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTED(1, "Connected", "Connected"),

	/**
	 * The '<em><b>Ready for reconnection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_RECONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	READY_FOR_RECONNECTION(2, "Ready_for_reconnection", "Ready_for_reconnection");

	/**
	 * The '<em><b>Disconnected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disconnected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCONNECTED
	 * @model name="Disconnected"
	 * @generated
	 * @ordered
	 */
	public static final int DISCONNECTED_VALUE = 0;

	/**
	 * The '<em><b>Connected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTED
	 * @model name="Connected"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTED_VALUE = 1;

	/**
	 * The '<em><b>Ready for reconnection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ready for reconnection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READY_FOR_RECONNECTION
	 * @model name="Ready_for_reconnection"
	 * @generated
	 * @ordered
	 */
	public static final int READY_FOR_RECONNECTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Disconnect Control State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DisconnectControlState[] VALUES_ARRAY =
		new DisconnectControlState[] {
			DISCONNECTED,
			CONNECTED,
			READY_FOR_RECONNECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Disconnect Control State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DisconnectControlState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Disconnect Control State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisconnectControlState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisconnectControlState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Disconnect Control State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisconnectControlState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisconnectControlState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Disconnect Control State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisconnectControlState get(int value) {
		switch (value) {
			case DISCONNECTED_VALUE: return DISCONNECTED;
			case CONNECTED_VALUE: return CONNECTED;
			case READY_FOR_RECONNECTION_VALUE: return READY_FOR_RECONNECTION;
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
	private DisconnectControlState(int value, String name, String literal) {
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
	
} //DisconnectControlState
