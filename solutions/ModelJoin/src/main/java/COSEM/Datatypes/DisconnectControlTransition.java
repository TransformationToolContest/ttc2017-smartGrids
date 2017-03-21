/**
 */
package COSEM.Datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Disconnect Control Transition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see COSEM.Datatypes.DatatypesPackage#getDisconnectControlTransition()
 * @model
 * @generated
 */
public enum DisconnectControlTransition implements Enumerator {
	/**
	 * The '<em><b>Remote reconnect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_RECONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_RECONNECT(0, "remote_reconnect", "remote_reconnect"),

	/**
	 * The '<em><b>Remote disconnect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_DISCONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_DISCONNECT(0, "remote_disconnect", "remote_disconnect"),

	/**
	 * The '<em><b>Manual reconnect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_RECONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_RECONNECT(0, "manual_reconnect", "manual_reconnect"),

	/**
	 * The '<em><b>Manual disconnect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_DISCONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_DISCONNECT(0, "manual_disconnect", "manual_disconnect"),

	/**
	 * The '<em><b>Local disconnect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_DISCONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_DISCONNECT(0, "local_disconnect", "local_disconnect"),

	/**
	 * The '<em><b>Local reconnect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_RECONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_RECONNECT(0, "local_reconnect", "local_reconnect");

	/**
	 * The '<em><b>Remote reconnect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote reconnect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_RECONNECT
	 * @model name="remote_reconnect"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_RECONNECT_VALUE = 0;

	/**
	 * The '<em><b>Remote disconnect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote disconnect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_DISCONNECT
	 * @model name="remote_disconnect"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_DISCONNECT_VALUE = 0;

	/**
	 * The '<em><b>Manual reconnect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual reconnect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_RECONNECT
	 * @model name="manual_reconnect"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_RECONNECT_VALUE = 0;

	/**
	 * The '<em><b>Manual disconnect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual disconnect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_DISCONNECT
	 * @model name="manual_disconnect"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_DISCONNECT_VALUE = 0;

	/**
	 * The '<em><b>Local disconnect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local disconnect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_DISCONNECT
	 * @model name="local_disconnect"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_DISCONNECT_VALUE = 0;

	/**
	 * The '<em><b>Local reconnect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local reconnect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_RECONNECT
	 * @model name="local_reconnect"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_RECONNECT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Disconnect Control Transition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DisconnectControlTransition[] VALUES_ARRAY =
		new DisconnectControlTransition[] {
			REMOTE_RECONNECT,
			REMOTE_DISCONNECT,
			MANUAL_RECONNECT,
			MANUAL_DISCONNECT,
			LOCAL_DISCONNECT,
			LOCAL_RECONNECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Disconnect Control Transition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DisconnectControlTransition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Disconnect Control Transition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisconnectControlTransition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisconnectControlTransition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Disconnect Control Transition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisconnectControlTransition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisconnectControlTransition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Disconnect Control Transition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisconnectControlTransition get(int value) {
		switch (value) {
			case REMOTE_RECONNECT_VALUE: return REMOTE_RECONNECT;
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
	private DisconnectControlTransition(int value, String name, String literal) {
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
	
} //DisconnectControlTransition
