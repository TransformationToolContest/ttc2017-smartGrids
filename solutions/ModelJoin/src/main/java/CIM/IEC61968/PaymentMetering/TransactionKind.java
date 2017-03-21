/**
 */
package CIM.IEC61968.PaymentMetering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transaction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CIM.IEC61968.PaymentMetering.PaymentMeteringPackage#getTransactionKind()
 * @model
 * @generated
 */
public enum TransactionKind implements Enumerator {
	/**
	 * The '<em><b>Token Exchange</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_EXCHANGE(0, "tokenExchange", "tokenExchange"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "other", "other"),

	/**
	 * The '<em><b>Tax Charge Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_CHARGE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_CHARGE_PAYMENT(2, "taxChargePayment", "taxChargePayment"),

	/**
	 * The '<em><b>Token Cancellation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_CANCELLATION_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_CANCELLATION(3, "tokenCancellation", "tokenCancellation"),

	/**
	 * The '<em><b>Token Sale Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_SALE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_SALE_PAYMENT(4, "tokenSalePayment", "tokenSalePayment"),

	/**
	 * The '<em><b>Service Charge Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_CHARGE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_CHARGE_PAYMENT(5, "serviceChargePayment", "serviceChargePayment"),

	/**
	 * The '<em><b>Account Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT_PAYMENT(6, "accountPayment", "accountPayment"),

	/**
	 * The '<em><b>Token Grant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_GRANT_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_GRANT(7, "tokenGrant", "tokenGrant"),

	/**
	 * The '<em><b>Diverse Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVERSE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DIVERSE_PAYMENT(8, "diversePayment", "diversePayment"),

	/**
	 * The '<em><b>Token Free Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOKEN_FREE_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	TOKEN_FREE_ISSUE(9, "tokenFreeIssue", "tokenFreeIssue"), /**
	 * The '<em><b>Meter Configuration Token</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_CONFIGURATION_TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	METER_CONFIGURATION_TOKEN(10, "meterConfigurationToken", "meterConfigurationToken"),

	/**
	 * The '<em><b>Auxiliary Charge Payment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_CHARGE_PAYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	AUXILIARY_CHARGE_PAYMENT(11, "auxiliaryChargePayment", "auxiliaryChargePayment"),

	/**
	 * The '<em><b>Transaction Reversal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_REVERSAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_REVERSAL(12, "transactionReversal", "transactionReversal");

	/**
	 * The '<em><b>Token Exchange</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Exchange</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_EXCHANGE
	 * @model name="tokenExchange"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_EXCHANGE_VALUE = 0;

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
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>Tax Charge Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax Charge Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX_CHARGE_PAYMENT
	 * @model name="taxChargePayment"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_CHARGE_PAYMENT_VALUE = 2;

	/**
	 * The '<em><b>Token Cancellation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Cancellation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_CANCELLATION
	 * @model name="tokenCancellation"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_CANCELLATION_VALUE = 3;

	/**
	 * The '<em><b>Token Sale Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Sale Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_SALE_PAYMENT
	 * @model name="tokenSalePayment"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_SALE_PAYMENT_VALUE = 4;

	/**
	 * The '<em><b>Service Charge Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service Charge Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_CHARGE_PAYMENT
	 * @model name="serviceChargePayment"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_CHARGE_PAYMENT_VALUE = 5;

	/**
	 * The '<em><b>Account Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Account Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_PAYMENT
	 * @model name="accountPayment"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_PAYMENT_VALUE = 6;

	/**
	 * The '<em><b>Token Grant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Grant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_GRANT
	 * @model name="tokenGrant"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_GRANT_VALUE = 7;

	/**
	 * The '<em><b>Diverse Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diverse Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIVERSE_PAYMENT
	 * @model name="diversePayment"
	 * @generated
	 * @ordered
	 */
	public static final int DIVERSE_PAYMENT_VALUE = 8;

	/**
	 * The '<em><b>Token Free Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Token Free Issue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOKEN_FREE_ISSUE
	 * @model name="tokenFreeIssue"
	 * @generated
	 * @ordered
	 */
	public static final int TOKEN_FREE_ISSUE_VALUE = 9;

	/**
	 * The '<em><b>Meter Configuration Token</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meter Configuration Token</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METER_CONFIGURATION_TOKEN
	 * @model name="meterConfigurationToken"
	 * @generated
	 * @ordered
	 */
	public static final int METER_CONFIGURATION_TOKEN_VALUE = 10;

	/**
	 * The '<em><b>Auxiliary Charge Payment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auxiliary Charge Payment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_CHARGE_PAYMENT
	 * @model name="auxiliaryChargePayment"
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_CHARGE_PAYMENT_VALUE = 11;

	/**
	 * The '<em><b>Transaction Reversal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction Reversal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_REVERSAL
	 * @model name="transactionReversal"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_REVERSAL_VALUE = 12;

	/**
	 * An array of all the '<em><b>Transaction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransactionKind[] VALUES_ARRAY =
		new TransactionKind[] {
			TOKEN_EXCHANGE,
			OTHER,
			TAX_CHARGE_PAYMENT,
			TOKEN_CANCELLATION,
			TOKEN_SALE_PAYMENT,
			SERVICE_CHARGE_PAYMENT,
			ACCOUNT_PAYMENT,
			TOKEN_GRANT,
			DIVERSE_PAYMENT,
			TOKEN_FREE_ISSUE,
			METER_CONFIGURATION_TOKEN,
			AUXILIARY_CHARGE_PAYMENT,
			TRANSACTION_REVERSAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Transaction Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransactionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transaction Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransactionKind get(int value) {
		switch (value) {
			case TOKEN_EXCHANGE_VALUE: return TOKEN_EXCHANGE;
			case OTHER_VALUE: return OTHER;
			case TAX_CHARGE_PAYMENT_VALUE: return TAX_CHARGE_PAYMENT;
			case TOKEN_CANCELLATION_VALUE: return TOKEN_CANCELLATION;
			case TOKEN_SALE_PAYMENT_VALUE: return TOKEN_SALE_PAYMENT;
			case SERVICE_CHARGE_PAYMENT_VALUE: return SERVICE_CHARGE_PAYMENT;
			case ACCOUNT_PAYMENT_VALUE: return ACCOUNT_PAYMENT;
			case TOKEN_GRANT_VALUE: return TOKEN_GRANT;
			case DIVERSE_PAYMENT_VALUE: return DIVERSE_PAYMENT;
			case TOKEN_FREE_ISSUE_VALUE: return TOKEN_FREE_ISSUE;
			case METER_CONFIGURATION_TOKEN_VALUE: return METER_CONFIGURATION_TOKEN;
			case AUXILIARY_CHARGE_PAYMENT_VALUE: return AUXILIARY_CHARGE_PAYMENT;
			case TRANSACTION_REVERSAL_VALUE: return TRANSACTION_REVERSAL;
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
	private TransactionKind(int value, String name, String literal) {
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
	
} //TransactionKind
