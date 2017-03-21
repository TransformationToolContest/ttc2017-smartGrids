/**
 */
package CIM.IEC61970.Informative.InfOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Switching Step Status Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfOperations.InfOperationsPackage#getSwitchingStepStatusKind()
 * @model
 * @generated
 */
public enum SwitchingStepStatusKind implements Enumerator {
	/**
	 * The '<em><b>Skipped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIPPED_VALUE
	 * @generated
	 * @ordered
	 */
	SKIPPED(0, "skipped", "skipped"),

	/**
	 * The '<em><b>Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSED(1, "proposed", "proposed"),

	/**
	 * The '<em><b>Confirmed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIRMED(2, "confirmed", "confirmed"),

	/**
	 * The '<em><b>Aborted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTED_VALUE
	 * @generated
	 * @ordered
	 */
	ABORTED(3, "aborted", "aborted"),

	/**
	 * The '<em><b>Instructed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTED_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUCTED(4, "instructed", "instructed");

	/**
	 * The '<em><b>Skipped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Skipped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKIPPED
	 * @model name="skipped"
	 * @generated
	 * @ordered
	 */
	public static final int SKIPPED_VALUE = 0;

	/**
	 * The '<em><b>Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proposed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPOSED
	 * @model name="proposed"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSED_VALUE = 1;

	/**
	 * The '<em><b>Confirmed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Confirmed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED
	 * @model name="confirmed"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIRMED_VALUE = 2;

	/**
	 * The '<em><b>Aborted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aborted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORTED
	 * @model name="aborted"
	 * @generated
	 * @ordered
	 */
	public static final int ABORTED_VALUE = 3;

	/**
	 * The '<em><b>Instructed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instructed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTED
	 * @model name="instructed"
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUCTED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Switching Step Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SwitchingStepStatusKind[] VALUES_ARRAY =
		new SwitchingStepStatusKind[] {
			SKIPPED,
			PROPOSED,
			CONFIRMED,
			ABORTED,
			INSTRUCTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Switching Step Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SwitchingStepStatusKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Switching Step Status Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchingStepStatusKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SwitchingStepStatusKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Switching Step Status Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchingStepStatusKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SwitchingStepStatusKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Switching Step Status Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SwitchingStepStatusKind get(int value) {
		switch (value) {
			case SKIPPED_VALUE: return SKIPPED;
			case PROPOSED_VALUE: return PROPOSED;
			case CONFIRMED_VALUE: return CONFIRMED;
			case ABORTED_VALUE: return ABORTED;
			case INSTRUCTED_VALUE: return INSTRUCTED;
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
	private SwitchingStepStatusKind(int value, String name, String literal) {
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
	
} //SwitchingStepStatusKind
