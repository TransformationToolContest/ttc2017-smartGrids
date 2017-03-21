/**
 */
package CIM.IEC61968.PaymentMetering.impl;

import CIM.IEC61968.PaymentMetering.BankAccountDetail;
import CIM.IEC61968.PaymentMetering.Cheque;
import CIM.IEC61968.PaymentMetering.ChequeKind;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import CIM.IEC61968.PaymentMetering.Tender;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cheque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.ChequeImpl#getMicrNumber <em>Micr Number</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.ChequeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.ChequeImpl#getChequeNumber <em>Cheque Number</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.ChequeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.ChequeImpl#getBankAccountDetail <em>Bank Account Detail</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.ChequeImpl#getTender <em>Tender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChequeImpl extends ElementImpl implements Cheque {
	/**
	 * The default value of the '{@link #getMicrNumber() <em>Micr Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String MICR_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMicrNumber() <em>Micr Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrNumber()
	 * @generated
	 * @ordered
	 */
	protected String micrNumber = MICR_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChequeNumber() <em>Cheque Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChequeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEQUE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChequeNumber() <em>Cheque Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChequeNumber()
	 * @generated
	 * @ordered
	 */
	protected String chequeNumber = CHEQUE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ChequeKind KIND_EDEFAULT = ChequeKind.BANK_ORDER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ChequeKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBankAccountDetail() <em>Bank Account Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAccountDetail()
	 * @generated
	 * @ordered
	 */
	protected BankAccountDetail bankAccountDetail;

	/**
	 * The cached value of the '{@link #getTender() <em>Tender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTender()
	 * @generated
	 * @ordered
	 */
	protected Tender tender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CHEQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMicrNumber() {
		return micrNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicrNumber(String newMicrNumber) {
		String oldMicrNumber = micrNumber;
		micrNumber = newMicrNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHEQUE__MICR_NUMBER, oldMicrNumber, micrNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHEQUE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChequeNumber() {
		return chequeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChequeNumber(String newChequeNumber) {
		String oldChequeNumber = chequeNumber;
		chequeNumber = newChequeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER, oldChequeNumber, chequeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequeKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ChequeKind newKind) {
		ChequeKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHEQUE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccountDetail getBankAccountDetail() {
		if (bankAccountDetail != null && bankAccountDetail.eIsProxy()) {
			InternalEObject oldBankAccountDetail = (InternalEObject)bankAccountDetail;
			bankAccountDetail = (BankAccountDetail)eResolveProxy(oldBankAccountDetail);
			if (bankAccountDetail != oldBankAccountDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL, oldBankAccountDetail, bankAccountDetail));
			}
		}
		return bankAccountDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccountDetail basicGetBankAccountDetail() {
		return bankAccountDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankAccountDetail(BankAccountDetail newBankAccountDetail) {
		BankAccountDetail oldBankAccountDetail = bankAccountDetail;
		bankAccountDetail = newBankAccountDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL, oldBankAccountDetail, bankAccountDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tender getTender() {
		if (tender != null && tender.eIsProxy()) {
			InternalEObject oldTender = (InternalEObject)tender;
			tender = (Tender)eResolveProxy(oldTender);
			if (tender != oldTender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CHEQUE__TENDER, oldTender, tender));
			}
		}
		return tender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tender basicGetTender() {
		return tender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTender(Tender newTender, NotificationChain msgs) {
		Tender oldTender = tender;
		tender = newTender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHEQUE__TENDER, oldTender, newTender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTender(Tender newTender) {
		if (newTender != tender) {
			NotificationChain msgs = null;
			if (tender != null)
				msgs = ((InternalEObject)tender).eInverseRemove(this, PaymentMeteringPackage.TENDER__CHEQUE, Tender.class, msgs);
			if (newTender != null)
				msgs = ((InternalEObject)newTender).eInverseAdd(this, PaymentMeteringPackage.TENDER__CHEQUE, Tender.class, msgs);
			msgs = basicSetTender(newTender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CHEQUE__TENDER, newTender, newTender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentMeteringPackage.CHEQUE__TENDER:
				if (tender != null)
					msgs = ((InternalEObject)tender).eInverseRemove(this, PaymentMeteringPackage.TENDER__CHEQUE, Tender.class, msgs);
				return basicSetTender((Tender)otherEnd, msgs);
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
			case PaymentMeteringPackage.CHEQUE__TENDER:
				return basicSetTender(null, msgs);
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
			case PaymentMeteringPackage.CHEQUE__MICR_NUMBER:
				return getMicrNumber();
			case PaymentMeteringPackage.CHEQUE__DATE:
				return getDate();
			case PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER:
				return getChequeNumber();
			case PaymentMeteringPackage.CHEQUE__KIND:
				return getKind();
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				if (resolve) return getBankAccountDetail();
				return basicGetBankAccountDetail();
			case PaymentMeteringPackage.CHEQUE__TENDER:
				if (resolve) return getTender();
				return basicGetTender();
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
			case PaymentMeteringPackage.CHEQUE__MICR_NUMBER:
				setMicrNumber((String)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__DATE:
				setDate((String)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER:
				setChequeNumber((String)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__KIND:
				setKind((ChequeKind)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				setBankAccountDetail((BankAccountDetail)newValue);
				return;
			case PaymentMeteringPackage.CHEQUE__TENDER:
				setTender((Tender)newValue);
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
			case PaymentMeteringPackage.CHEQUE__MICR_NUMBER:
				setMicrNumber(MICR_NUMBER_EDEFAULT);
				return;
			case PaymentMeteringPackage.CHEQUE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER:
				setChequeNumber(CHEQUE_NUMBER_EDEFAULT);
				return;
			case PaymentMeteringPackage.CHEQUE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				setBankAccountDetail((BankAccountDetail)null);
				return;
			case PaymentMeteringPackage.CHEQUE__TENDER:
				setTender((Tender)null);
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
			case PaymentMeteringPackage.CHEQUE__MICR_NUMBER:
				return MICR_NUMBER_EDEFAULT == null ? micrNumber != null : !MICR_NUMBER_EDEFAULT.equals(micrNumber);
			case PaymentMeteringPackage.CHEQUE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case PaymentMeteringPackage.CHEQUE__CHEQUE_NUMBER:
				return CHEQUE_NUMBER_EDEFAULT == null ? chequeNumber != null : !CHEQUE_NUMBER_EDEFAULT.equals(chequeNumber);
			case PaymentMeteringPackage.CHEQUE__KIND:
				return kind != KIND_EDEFAULT;
			case PaymentMeteringPackage.CHEQUE__BANK_ACCOUNT_DETAIL:
				return bankAccountDetail != null;
			case PaymentMeteringPackage.CHEQUE__TENDER:
				return tender != null;
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
		result.append(" (micrNumber: ");
		result.append(micrNumber);
		result.append(", date: ");
		result.append(date);
		result.append(", chequeNumber: ");
		result.append(chequeNumber);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ChequeImpl
