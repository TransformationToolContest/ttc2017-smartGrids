/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl;

import gluemodel.CIM.IEC61968.Common.impl.OrganisationImpl;

import gluemodel.CIM.IEC61970.Informative.InfCommon.BankAccount;
import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.Bank;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.BankImpl#getBankAccounts <em>Bank Accounts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.BankImpl#getBranchCode <em>Branch Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.BankImpl#getBic <em>Bic</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.BankImpl#getIban <em>Iban</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankImpl extends OrganisationImpl implements Bank {
	/**
	 * The cached value of the '{@link #getBankAccounts() <em>Bank Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<BankAccount> bankAccounts;

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
	 * The default value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected static final String BIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected String bic = BIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected static final String IBAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected String iban = IBAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfPaymentMeteringPackage.Literals.BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankAccount> getBankAccounts() {
		if (bankAccounts == null) {
			bankAccounts = new EObjectWithInverseResolvingEList<BankAccount>(BankAccount.class, this, InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS, InfCommonPackage.BANK_ACCOUNT__BANK);
		}
		return bankAccounts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK__BRANCH_CODE, oldBranchCode, branchCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBic() {
		return bic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBic(String newBic) {
		String oldBic = bic;
		bic = newBic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK__BIC, oldBic, bic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIban(String newIban) {
		String oldIban = iban;
		iban = newIban;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.BANK__IBAN, oldIban, iban));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBankAccounts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS:
				return ((InternalEList<?>)getBankAccounts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS:
				return getBankAccounts();
			case InfPaymentMeteringPackage.BANK__BRANCH_CODE:
				return getBranchCode();
			case InfPaymentMeteringPackage.BANK__BIC:
				return getBic();
			case InfPaymentMeteringPackage.BANK__IBAN:
				return getIban();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS:
				getBankAccounts().clear();
				getBankAccounts().addAll((Collection<? extends BankAccount>)newValue);
				return;
			case InfPaymentMeteringPackage.BANK__BRANCH_CODE:
				setBranchCode((String)newValue);
				return;
			case InfPaymentMeteringPackage.BANK__BIC:
				setBic((String)newValue);
				return;
			case InfPaymentMeteringPackage.BANK__IBAN:
				setIban((String)newValue);
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
			case InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS:
				getBankAccounts().clear();
				return;
			case InfPaymentMeteringPackage.BANK__BRANCH_CODE:
				setBranchCode(BRANCH_CODE_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.BANK__BIC:
				setBic(BIC_EDEFAULT);
				return;
			case InfPaymentMeteringPackage.BANK__IBAN:
				setIban(IBAN_EDEFAULT);
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
			case InfPaymentMeteringPackage.BANK__BANK_ACCOUNTS:
				return bankAccounts != null && !bankAccounts.isEmpty();
			case InfPaymentMeteringPackage.BANK__BRANCH_CODE:
				return BRANCH_CODE_EDEFAULT == null ? branchCode != null : !BRANCH_CODE_EDEFAULT.equals(branchCode);
			case InfPaymentMeteringPackage.BANK__BIC:
				return BIC_EDEFAULT == null ? bic != null : !BIC_EDEFAULT.equals(bic);
			case InfPaymentMeteringPackage.BANK__IBAN:
				return IBAN_EDEFAULT == null ? iban != null : !IBAN_EDEFAULT.equals(iban);
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
		result.append(" (branchCode: ");
		result.append(branchCode);
		result.append(", bic: ");
		result.append(bic);
		result.append(", iban: ");
		result.append(iban);
		result.append(')');
		return result.toString();
	}

} //BankImpl
