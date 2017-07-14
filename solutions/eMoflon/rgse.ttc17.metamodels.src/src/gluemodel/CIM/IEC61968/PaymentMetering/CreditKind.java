/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Credit Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getCreditKind()
 * @model
 * @generated
 */
public enum CreditKind implements Enumerator {
	/**
	 * The '<em><b>Token Credit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_CREDIT(0, "tokenCredit", "tokenCredit"),

	/**
	 * The '<em><b>Lifeline Credit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFELINE_CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	LIFELINE_CREDIT(1, "lifelineCredit", "lifelineCredit"),

	/**
	 * The '<em><b>Grant Credit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRANT_CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	GRANT_CREDIT(2, "grantCredit", "grantCredit"),

	/**
	 * The '<em><b>Reserve Credit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVE_CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVE_CREDIT(3, "reserveCredit", "reserveCredit"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other"),

	/**
	 * The '<em><b>Advance Credit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVANCE_CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	ADVANCE_CREDIT(5, "advanceCredit", "advanceCredit");

	/**
	 * The '<em><b>Token Credit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Credit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_CREDIT
	 * @model name="tokenCredit"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_CREDIT_VALUE = 0;

	/**
	 * The '<em><b>Lifeline Credit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lifeline Credit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIFELINE_CREDIT
	 * @model name="lifelineCredit"
	 * @generated
	 * @ordered
	 */
	public static final int LIFELINE_CREDIT_VALUE = 1;

	/**
	 * The '<em><b>Grant Credit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grant Credit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRANT_CREDIT
	 * @model name="grantCredit"
	 * @generated
	 * @ordered
	 */
	public static final int GRANT_CREDIT_VALUE = 2;

	/**
	 * The '<em><b>Reserve Credit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reserve Credit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESERVE_CREDIT
	 * @model name="reserveCredit"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVE_CREDIT_VALUE = 3;

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
	public static final int OTHER_VALUE = 4;

	/**
	 * The '<em><b>Advance Credit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Advance Credit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADVANCE_CREDIT
	 * @model name="advanceCredit"
	 * @generated
	 * @ordered
	 */
	public static final int ADVANCE_CREDIT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Credit Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CreditKind[] VALUES_ARRAY =
		new CreditKind[] {
			TOKEN_CREDIT,
			LIFELINE_CREDIT,
			GRANT_CREDIT,
			RESERVE_CREDIT,
			OTHER,
			ADVANCE_CREDIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Credit Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CreditKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Credit Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CreditKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credit Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CreditKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credit Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditKind get(int value) {
		switch (value) {
			case TOKEN_CREDIT_VALUE: return TOKEN_CREDIT;
			case LIFELINE_CREDIT_VALUE: return LIFELINE_CREDIT;
			case GRANT_CREDIT_VALUE: return GRANT_CREDIT;
			case RESERVE_CREDIT_VALUE: return RESERVE_CREDIT;
			case OTHER_VALUE: return OTHER;
			case ADVANCE_CREDIT_VALUE: return ADVANCE_CREDIT;
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
	private CreditKind(int value, String name, String literal) {
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
	
} //CreditKind
