/**
 */
package CIM.IEC61970.Informative.InfWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Factor Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61970.Informative.InfWork.InfWorkPackage#getConditionFactorKind()
 * @model
 * @generated
 */
public enum ConditionFactorKind implements Enumerator {
	/**
	 * The '<em><b>Labor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABOR_VALUE
	 * @generated
	 * @ordered
	 */
	LABOR(0, "labor", "labor"),

	/**
	 * The '<em><b>Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	MATERIAL(1, "material", "material"),

	/**
	 * The '<em><b>Travel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVEL_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVEL(2, "travel", "travel"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "other", "other"),

	/**
	 * The '<em><b>Account Allocation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_ALLOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT_ALLOCATION(4, "accountAllocation", "accountAllocation");

	/**
	 * The '<em><b>Labor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Labor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABOR
	 * @model name="labor"
	 * @generated
	 * @ordered
	 */
	public static final int LABOR_VALUE = 0;

	/**
	 * The '<em><b>Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Material</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATERIAL
	 * @model name="material"
	 * @generated
	 * @ordered
	 */
	public static final int MATERIAL_VALUE = 1;

	/**
	 * The '<em><b>Travel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Travel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVEL
	 * @model name="travel"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVEL_VALUE = 2;

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
	public static final int OTHER_VALUE = 3;

	/**
	 * The '<em><b>Account Allocation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Account Allocation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_ALLOCATION
	 * @model name="accountAllocation"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_ALLOCATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Condition Factor Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionFactorKind[] VALUES_ARRAY =
		new ConditionFactorKind[] {
			LABOR,
			MATERIAL,
			TRAVEL,
			OTHER,
			ACCOUNT_ALLOCATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Factor Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionFactorKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Factor Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionFactorKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionFactorKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Factor Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionFactorKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionFactorKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Factor Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionFactorKind get(int value) {
		switch (value) {
			case LABOR_VALUE: return LABOR;
			case MATERIAL_VALUE: return MATERIAL;
			case TRAVEL_VALUE: return TRAVEL;
			case OTHER_VALUE: return OTHER;
			case ACCOUNT_ALLOCATION_VALUE: return ACCOUNT_ALLOCATION;
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
	private ConditionFactorKind(int value, String name, String literal) {
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
	
} //ConditionFactorKind
