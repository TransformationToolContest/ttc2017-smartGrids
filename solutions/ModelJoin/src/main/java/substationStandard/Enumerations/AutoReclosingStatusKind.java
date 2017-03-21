/**
 */
package substationStandard.Enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Auto Reclosing Status Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see substationStandard.Enumerations.EnumerationsPackage#getAutoReclosingStatusKind()
 * @model
 * @generated
 */
public enum AutoReclosingStatusKind implements Enumerator {
	/**
	 * The '<em><b>Ready</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_VALUE
	 * @generated
	 * @ordered
	 */
	READY(0, "ready", "ready"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(0, "inProgress", "inProgress"), /**
	 * The '<em><b>Successfull</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESSFULL_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESSFULL(0, "successfull", "successfull");

	/**
	 * The '<em><b>Ready</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ready</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READY
	 * @model name="ready"
	 * @generated
	 * @ordered
	 */
	public static final int READY_VALUE = 0;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Progress</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 0;

	/**
	 * The '<em><b>Successfull</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Successfull</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCESSFULL
	 * @model name="successfull"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESSFULL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Auto Reclosing Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AutoReclosingStatusKind[] VALUES_ARRAY =
		new AutoReclosingStatusKind[] {
			READY,
			IN_PROGRESS,
			SUCCESSFULL,
		};

	/**
	 * A public read-only list of all the '<em><b>Auto Reclosing Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AutoReclosingStatusKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Auto Reclosing Status Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoReclosingStatusKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AutoReclosingStatusKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auto Reclosing Status Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoReclosingStatusKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AutoReclosingStatusKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auto Reclosing Status Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoReclosingStatusKind get(int value) {
		switch (value) {
			case READY_VALUE: return READY;
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
	private AutoReclosingStatusKind(int value, String name, String literal) {
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
	
} //AutoReclosingStatusKind
