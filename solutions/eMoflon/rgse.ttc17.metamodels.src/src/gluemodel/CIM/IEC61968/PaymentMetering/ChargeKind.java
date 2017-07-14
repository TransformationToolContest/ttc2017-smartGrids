/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Charge Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getChargeKind()
 * @model
 * @generated
 */
public enum ChargeKind implements Enumerator {
	/**
	 * The '<em><b>Auxiliary Charge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_CHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	AUXILIARY_CHARGE(0, "auxiliaryCharge", "auxiliaryCharge"),

	/**
	 * The '<em><b>Consumption Charge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUMPTION_CHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUMPTION_CHARGE(1, "consumptionCharge", "consumptionCharge"),

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
	 * The '<em><b>Demand Charge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMAND_CHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	DEMAND_CHARGE(3, "demandCharge", "demandCharge"),

	/**
	 * The '<em><b>Tax Charge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_CHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_CHARGE(4, "taxCharge", "taxCharge");

	/**
	 * The '<em><b>Auxiliary Charge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auxiliary Charge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_CHARGE
	 * @model name="auxiliaryCharge"
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_CHARGE_VALUE = 0;

	/**
	 * The '<em><b>Consumption Charge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consumption Charge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUMPTION_CHARGE
	 * @model name="consumptionCharge"
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMPTION_CHARGE_VALUE = 1;

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
	 * The '<em><b>Demand Charge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Demand Charge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEMAND_CHARGE
	 * @model name="demandCharge"
	 * @generated
	 * @ordered
	 */
	public static final int DEMAND_CHARGE_VALUE = 3;

	/**
	 * The '<em><b>Tax Charge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax Charge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX_CHARGE
	 * @model name="taxCharge"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_CHARGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Charge Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChargeKind[] VALUES_ARRAY =
		new ChargeKind[] {
			AUXILIARY_CHARGE,
			CONSUMPTION_CHARGE,
			OTHER,
			DEMAND_CHARGE,
			TAX_CHARGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Charge Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChargeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Charge Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charge Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChargeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charge Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChargeKind get(int value) {
		switch (value) {
			case AUXILIARY_CHARGE_VALUE: return AUXILIARY_CHARGE;
			case CONSUMPTION_CHARGE_VALUE: return CONSUMPTION_CHARGE;
			case OTHER_VALUE: return OTHER;
			case DEMAND_CHARGE_VALUE: return DEMAND_CHARGE;
			case TAX_CHARGE_VALUE: return TAX_CHARGE;
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
	private ChargeKind(int value, String name, String literal) {
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
	
} //ChargeKind
