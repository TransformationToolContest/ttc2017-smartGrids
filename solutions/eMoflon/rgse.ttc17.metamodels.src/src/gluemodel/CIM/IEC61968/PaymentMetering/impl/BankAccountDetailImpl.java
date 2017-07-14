/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.BankAccountDetail;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank Account Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl#getHolderID <em>Holder ID</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl#getBranchCode <em>Branch Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.BankAccountDetailImpl#getHolderName <em>Holder Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankAccountDetailImpl extends ElementImpl implements BankAccountDetail {
	/**
	 * The default value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected String bankName = BANK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String accountNumber = ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHolderID() <em>Holder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderID()
	 * @generated
	 * @ordered
	 */
	protected static final String HOLDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHolderID() <em>Holder ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderID()
	 * @generated
	 * @ordered
	 */
	protected String holderID = HOLDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBranchCode() <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchCode()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranchCode() <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchCode()
	 * @generated
	 * @ordered
	 */
	protected String branchCode = BRANCH_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHolderName() <em>Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOLDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHolderName() <em>Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolderName()
	 * @generated
	 * @ordered
	 */
	protected String holderName = HOLDER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankAccountDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.BANK_ACCOUNT_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankName(String newBankName) {
		String oldBankName = bankName;
		bankName = newBankName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME, oldBankName, bankName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountNumber(String newAccountNumber) {
		String oldAccountNumber = accountNumber;
		accountNumber = newAccountNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER, oldAccountNumber, accountNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHolderID() {
		return holderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolderID(String newHolderID) {
		String oldHolderID = holderID;
		holderID = newHolderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID, oldHolderID, holderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchCode(String newBranchCode) {
		String oldBranchCode = branchCode;
		branchCode = newBranchCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE, oldBranchCode, branchCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHolderName() {
		return holderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolderName(String newHolderName) {
		String oldHolderName = holderName;
		holderName = newHolderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME, oldHolderName, holderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
				return getBankName();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
				return getAccountNumber();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
				return getHolderID();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
				return getBranchCode();
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
				return getHolderName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
				setBankName((String)newValue);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
				setAccountNumber((String)newValue);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
				setHolderID((String)newValue);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
				setBranchCode((String)newValue);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
				setHolderName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
				setBankName(BANK_NAME_EDEFAULT);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
				setAccountNumber(ACCOUNT_NUMBER_EDEFAULT);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
				setHolderID(HOLDER_ID_EDEFAULT);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
				setBranchCode(BRANCH_CODE_EDEFAULT);
				return;
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
				setHolderName(HOLDER_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
				return BANK_NAME_EDEFAULT == null ? bankName != null : !BANK_NAME_EDEFAULT.equals(bankName);
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
				return ACCOUNT_NUMBER_EDEFAULT == null ? accountNumber != null : !ACCOUNT_NUMBER_EDEFAULT.equals(accountNumber);
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
				return HOLDER_ID_EDEFAULT == null ? holderID != null : !HOLDER_ID_EDEFAULT.equals(holderID);
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
				return BRANCH_CODE_EDEFAULT == null ? branchCode != null : !BRANCH_CODE_EDEFAULT.equals(branchCode);
			case PaymentMeteringPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
				return HOLDER_NAME_EDEFAULT == null ? holderName != null : !HOLDER_NAME_EDEFAULT.equals(holderName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bankName: ");
		result.append(bankName);
		result.append(", accountNumber: ");
		result.append(accountNumber);
		result.append(", holderID: ");
		result.append(holderID);
		result.append(", branchCode: ");
		result.append(branchCode);
		result.append(", holderName: ");
		result.append(holderName);
		result.append(')');
		return result.toString();
	}

} //BankAccountDetailImpl
