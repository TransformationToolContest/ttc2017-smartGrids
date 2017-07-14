/**
 */
package gluemodel.substationStandard.Enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fault Loop Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.substationStandard.Enumerations.EnumerationsPackage#getFaultLoopKind()
 * @model
 * @generated
 */
public enum FaultLoopKind implements Enumerator {
	/**
	 * The '<em><b>Ph ATo Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_ATO_GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	PH_ATO_GROUND(0, "phAToGround", "phAToGround"),

	/**
	 * The '<em><b>Ph BTo Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_BTO_GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	PH_BTO_GROUND(0, "phBToGround", "phBToGround"),

	/**
	 * The '<em><b>Ph CTo Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_CTO_GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	PH_CTO_GROUND(0, "phCToGround", "phCToGround"),

	/**
	 * The '<em><b>Ph ATo Ph B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_ATO_PH_B_VALUE
	 * @generated
	 * @ordered
	 */
	PH_ATO_PH_B(0, "phAToPhB", "phAToPhB"),

	/**
	 * The '<em><b>Ph BTo Ph C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_BTO_PH_C_VALUE
	 * @generated
	 * @ordered
	 */
	PH_BTO_PH_C(0, "phBToPhC", "phBToPhC"),

	/**
	 * The '<em><b>Ph CTo Ph A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PH_CTO_PH_A_VALUE
	 * @generated
	 * @ordered
	 */
	PH_CTO_PH_A(0, "phCToPhA", "phCToPhA"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "other", "other");

	/**
	 * The '<em><b>Ph ATo Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ph ATo Ground</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PH_ATO_GROUND
	 * @model name="phAToGround"
	 * @generated
	 * @ordered
	 */
	public static final int PH_ATO_GROUND_VALUE = 0;

	/**
	 * The '<em><b>Ph BTo Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ph BTo Ground</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PH_BTO_GROUND
	 * @model name="phBToGround"
	 * @generated
	 * @ordered
	 */
	public static final int PH_BTO_GROUND_VALUE = 0;

	/**
	 * The '<em><b>Ph CTo Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ph CTo Ground</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PH_CTO_GROUND
	 * @model name="phCToGround"
	 * @generated
	 * @ordered
	 */
	public static final int PH_CTO_GROUND_VALUE = 0;

	/**
	 * The '<em><b>Ph ATo Ph B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ph ATo Ph B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PH_ATO_PH_B
	 * @model name="phAToPhB"
	 * @generated
	 * @ordered
	 */
	public static final int PH_ATO_PH_B_VALUE = 0;

	/**
	 * The '<em><b>Ph BTo Ph C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ph BTo Ph C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PH_BTO_PH_C
	 * @model name="phBToPhC"
	 * @generated
	 * @ordered
	 */
	public static final int PH_BTO_PH_C_VALUE = 0;

	/**
	 * The '<em><b>Ph CTo Ph A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ph CTo Ph A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PH_CTO_PH_A
	 * @model name="phCToPhA"
	 * @generated
	 * @ordered
	 */
	public static final int PH_CTO_PH_A_VALUE = 0;

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
	public static final int OTHER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Fault Loop Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FaultLoopKind[] VALUES_ARRAY =
		new FaultLoopKind[] {
			PH_ATO_GROUND,
			PH_BTO_GROUND,
			PH_CTO_GROUND,
			PH_ATO_PH_B,
			PH_BTO_PH_C,
			PH_CTO_PH_A,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Fault Loop Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FaultLoopKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fault Loop Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FaultLoopKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FaultLoopKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fault Loop Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FaultLoopKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FaultLoopKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fault Loop Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FaultLoopKind get(int value) {
		switch (value) {
			case PH_ATO_GROUND_VALUE: return PH_ATO_GROUND;
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
	private FaultLoopKind(int value, String name, String literal) {
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
	
} //FaultLoopKind
