/**
 */
package substationStandard.Enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DP Status Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see substationStandard.Enumerations.EnumerationsPackage#getDPStatusKind()
 * @model
 * @generated
 */
public enum DPStatusKind implements Enumerator {
	/**
	 * The '<em><b>Intermediate State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIATE_STATE(0, "intermediateState", "intermediateState"),

	/**
	 * The '<em><b>Off Or False</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_OR_FALSE_VALUE
	 * @generated
	 * @ordered
	 */
	OFF_OR_FALSE(0, "offOrFalse", "offOrFalse"),

	/**
	 * The '<em><b>On Or True</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_OR_TRUE_VALUE
	 * @generated
	 * @ordered
	 */
	ON_OR_TRUE(0, "onOrTrue", "onOrTrue"),

	/**
	 * The '<em><b>Bad State</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	BAD_STATE(0, "badState", "badState");

	/**
	 * The '<em><b>Intermediate State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intermediate State</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_STATE
	 * @model name="intermediateState"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIATE_STATE_VALUE = 0;

	/**
	 * The '<em><b>Off Or False</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Off Or False</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF_OR_FALSE
	 * @model name="offOrFalse"
	 * @generated
	 * @ordered
	 */
	public static final int OFF_OR_FALSE_VALUE = 0;

	/**
	 * The '<em><b>On Or True</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Or True</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_OR_TRUE
	 * @model name="onOrTrue"
	 * @generated
	 * @ordered
	 */
	public static final int ON_OR_TRUE_VALUE = 0;

	/**
	 * The '<em><b>Bad State</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bad State</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD_STATE
	 * @model name="badState"
	 * @generated
	 * @ordered
	 */
	public static final int BAD_STATE_VALUE = 0;

	/**
	 * An array of all the '<em><b>DP Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DPStatusKind[] VALUES_ARRAY =
		new DPStatusKind[] {
			INTERMEDIATE_STATE,
			OFF_OR_FALSE,
			ON_OR_TRUE,
			BAD_STATE,
		};

	/**
	 * A public read-only list of all the '<em><b>DP Status Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DPStatusKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DP Status Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DPStatusKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DPStatusKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DP Status Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DPStatusKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DPStatusKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DP Status Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DPStatusKind get(int value) {
		switch (value) {
			case INTERMEDIATE_STATE_VALUE: return INTERMEDIATE_STATE;
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
	private DPStatusKind(int value, String name, String literal) {
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
	
} //DPStatusKind
