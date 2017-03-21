/**
 */
package CIM.IEC61970.Informative.InfERPSupport.impl;

import CIM.IEC61970.Informative.InfCommon.impl.BankAccountImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpBankAccount;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Bank Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfERPSupport.impl.ErpBankAccountImpl#getBankABA <em>Bank ABA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpBankAccountImpl extends BankAccountImpl implements ErpBankAccount {
	/**
	 * The default value of the '{@link #getBankABA() <em>Bank ABA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankABA()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_ABA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankABA() <em>Bank ABA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankABA()
	 * @generated
	 * @ordered
	 */
	protected String bankABA = BANK_ABA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpBankAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfERPSupportPackage.Literals.ERP_BANK_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBankABA() {
		return bankABA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankABA(String newBankABA) {
		String oldBankABA = bankABA;
		bankABA = newBankABA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA, oldBankABA, bankABA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA:
				return getBankABA();
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
			case InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA:
				setBankABA((String)newValue);
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
			case InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA:
				setBankABA(BANK_ABA_EDEFAULT);
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
			case InfERPSupportPackage.ERP_BANK_ACCOUNT__BANK_ABA:
				return BANK_ABA_EDEFAULT == null ? bankABA != null : !BANK_ABA_EDEFAULT.equals(bankABA);
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
		result.append(" (bankABA: ");
		result.append(bankABA);
		result.append(')');
		return result.toString();
	}

} //ErpBankAccountImpl
