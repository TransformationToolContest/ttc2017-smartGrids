/**
 */
package substationStandard.Enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Accuracy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see substationStandard.Enumerations.EnumerationsPackage#getTimeAccuracyKind()
 * @model
 * @generated
 */
public enum TimeAccuracyKind implements Enumerator {
	/**
	 * The '<em><b>T0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T0_VALUE
	 * @generated
	 * @ordered
	 */
	T0(7, "T0", "T0"),

	/**
	 * The '<em><b>T1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T1_VALUE
	 * @generated
	 * @ordered
	 */
	T1(10, "T1", "T1"),

	/**
	 * The '<em><b>T2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T2_VALUE
	 * @generated
	 * @ordered
	 */
	T2(14, "T2", "T2"),

	/**
	 * The '<em><b>T3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T3_VALUE
	 * @generated
	 * @ordered
	 */
	T3(16, "T3", "T3"),

	/**
	 * The '<em><b>T4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T4_VALUE
	 * @generated
	 * @ordered
	 */
	T4(18, "T4", "T4"),

	/**
	 * The '<em><b>T5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T5_VALUE
	 * @generated
	 * @ordered
	 */
	T5(20, "T5", "T5"),

	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(31, "unspecified", "unspecified");

	/**
	 * The '<em><b>T0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T0_VALUE = 7;

	/**
	 * The '<em><b>T1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T1_VALUE = 10;

	/**
	 * The '<em><b>T2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T2_VALUE = 14;

	/**
	 * The '<em><b>T3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T3_VALUE = 16;

	/**
	 * The '<em><b>T4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T4_VALUE = 18;

	/**
	 * The '<em><b>T5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T5_VALUE = 20;

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unspecified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model name="unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 31;

	/**
	 * An array of all the '<em><b>Time Accuracy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeAccuracyKind[] VALUES_ARRAY =
		new TimeAccuracyKind[] {
			T0,
			T1,
			T2,
			T3,
			T4,
			T5,
			UNSPECIFIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Accuracy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeAccuracyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Accuracy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeAccuracyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeAccuracyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Accuracy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeAccuracyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeAccuracyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Accuracy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeAccuracyKind get(int value) {
		switch (value) {
			case T0_VALUE: return T0;
			case T1_VALUE: return T1;
			case T2_VALUE: return T2;
			case T3_VALUE: return T3;
			case T4_VALUE: return T4;
			case T5_VALUE: return T5;
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
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
	private TimeAccuracyKind(int value, String name, String literal) {
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
	
} //TimeAccuracyKind
