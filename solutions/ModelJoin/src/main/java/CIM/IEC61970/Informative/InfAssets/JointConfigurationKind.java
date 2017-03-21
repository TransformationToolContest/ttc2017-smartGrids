/**
 */
package CIM.IEC61970.Informative.InfAssets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Joint Configuration Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getJointConfigurationKind()
 * @model
 * @generated
 */
public enum JointConfigurationKind implements Enumerator {
	/**
	 * The '<em><b>Wires1to1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRES1TO1_VALUE
	 * @generated
	 * @ordered
	 */
	WIRES1TO1(0, "wires1to1", "wires1to1"),

	/**
	 * The '<em><b>Wires2to1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRES2TO1_VALUE
	 * @generated
	 * @ordered
	 */
	WIRES2TO1(1, "wires2to1", "wires2to1"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(2, "other", "other"),

	/**
	 * The '<em><b>Wires3to1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIRES3TO1_VALUE
	 * @generated
	 * @ordered
	 */
	WIRES3TO1(3, "wires3to1", "wires3to1");

	/**
	 * The '<em><b>Wires1to1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wires1to1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIRES1TO1
	 * @model name="wires1to1"
	 * @generated
	 * @ordered
	 */
	public static final int WIRES1TO1_VALUE = 0;

	/**
	 * The '<em><b>Wires2to1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wires2to1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIRES2TO1
	 * @model name="wires2to1"
	 * @generated
	 * @ordered
	 */
	public static final int WIRES2TO1_VALUE = 1;

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
	public static final int OTHER_VALUE = 2;

	/**
	 * The '<em><b>Wires3to1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wires3to1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIRES3TO1
	 * @model name="wires3to1"
	 * @generated
	 * @ordered
	 */
	public static final int WIRES3TO1_VALUE = 3;

	/**
	 * An array of all the '<em><b>Joint Configuration Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JointConfigurationKind[] VALUES_ARRAY =
		new JointConfigurationKind[] {
			WIRES1TO1,
			WIRES2TO1,
			OTHER,
			WIRES3TO1,
		};

	/**
	 * A public read-only list of all the '<em><b>Joint Configuration Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JointConfigurationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Joint Configuration Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JointConfigurationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JointConfigurationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Joint Configuration Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JointConfigurationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JointConfigurationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Joint Configuration Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JointConfigurationKind get(int value) {
		switch (value) {
			case WIRES1TO1_VALUE: return WIRES1TO1;
			case WIRES2TO1_VALUE: return WIRES2TO1;
			case OTHER_VALUE: return OTHER;
			case WIRES3TO1_VALUE: return WIRES3TO1;
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
	private JointConfigurationKind(int value, String name, String literal) {
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
	
} //JointConfigurationKind
