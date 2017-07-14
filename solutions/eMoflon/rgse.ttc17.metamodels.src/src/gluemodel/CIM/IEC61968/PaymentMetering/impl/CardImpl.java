/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.Card;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.Tender;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CardImpl#getCvNumber <em>Cv Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CardImpl#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CardImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CardImpl#getAccountHolderName <em>Account Holder Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.CardImpl#getTender <em>Tender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends ElementImpl implements Card {
	/**
	 * The default value of the '{@link #getCvNumber() <em>Cv Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CV_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCvNumber() <em>Cv Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvNumber()
	 * @generated
	 * @ordered
	 */
	protected String cvNumber = CV_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected String expiryDate = EXPIRY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPan() <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPan()
	 * @generated
	 * @ordered
	 */
	protected static final String PAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPan() <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPan()
	 * @generated
	 * @ordered
	 */
	protected String pan = PAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountHolderName() <em>Account Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountHolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_HOLDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountHolderName() <em>Account Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountHolderName()
	 * @generated
	 * @ordered
	 */
	protected String accountHolderName = ACCOUNT_HOLDER_NAME_EDEFAULT;

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
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCvNumber() {
		return cvNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCvNumber(String newCvNumber) {
		String oldCvNumber = cvNumber;
		cvNumber = newCvNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CARD__CV_NUMBER, oldCvNumber, cvNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryDate(String newExpiryDate) {
		String oldExpiryDate = expiryDate;
		expiryDate = newExpiryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CARD__EXPIRY_DATE, oldExpiryDate, expiryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPan(String newPan) {
		String oldPan = pan;
		pan = newPan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CARD__PAN, oldPan, pan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountHolderName(String newAccountHolderName) {
		String oldAccountHolderName = accountHolderName;
		accountHolderName = newAccountHolderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME, oldAccountHolderName, accountHolderName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentMeteringPackage.CARD__TENDER, oldTender, tender));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CARD__TENDER, oldTender, newTender);
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
				msgs = ((InternalEObject)tender).eInverseRemove(this, PaymentMeteringPackage.TENDER__CARD, Tender.class, msgs);
			if (newTender != null)
				msgs = ((InternalEObject)newTender).eInverseAdd(this, PaymentMeteringPackage.TENDER__CARD, Tender.class, msgs);
			msgs = basicSetTender(newTender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.CARD__TENDER, newTender, newTender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaymentMeteringPackage.CARD__TENDER:
				if (tender != null)
					msgs = ((InternalEObject)tender).eInverseRemove(this, PaymentMeteringPackage.TENDER__CARD, Tender.class, msgs);
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
			case PaymentMeteringPackage.CARD__TENDER:
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
			case PaymentMeteringPackage.CARD__CV_NUMBER:
				return getCvNumber();
			case PaymentMeteringPackage.CARD__EXPIRY_DATE:
				return getExpiryDate();
			case PaymentMeteringPackage.CARD__PAN:
				return getPan();
			case PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME:
				return getAccountHolderName();
			case PaymentMeteringPackage.CARD__TENDER:
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
			case PaymentMeteringPackage.CARD__CV_NUMBER:
				setCvNumber((String)newValue);
				return;
			case PaymentMeteringPackage.CARD__EXPIRY_DATE:
				setExpiryDate((String)newValue);
				return;
			case PaymentMeteringPackage.CARD__PAN:
				setPan((String)newValue);
				return;
			case PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME:
				setAccountHolderName((String)newValue);
				return;
			case PaymentMeteringPackage.CARD__TENDER:
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
			case PaymentMeteringPackage.CARD__CV_NUMBER:
				setCvNumber(CV_NUMBER_EDEFAULT);
				return;
			case PaymentMeteringPackage.CARD__EXPIRY_DATE:
				setExpiryDate(EXPIRY_DATE_EDEFAULT);
				return;
			case PaymentMeteringPackage.CARD__PAN:
				setPan(PAN_EDEFAULT);
				return;
			case PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME:
				setAccountHolderName(ACCOUNT_HOLDER_NAME_EDEFAULT);
				return;
			case PaymentMeteringPackage.CARD__TENDER:
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
			case PaymentMeteringPackage.CARD__CV_NUMBER:
				return CV_NUMBER_EDEFAULT == null ? cvNumber != null : !CV_NUMBER_EDEFAULT.equals(cvNumber);
			case PaymentMeteringPackage.CARD__EXPIRY_DATE:
				return EXPIRY_DATE_EDEFAULT == null ? expiryDate != null : !EXPIRY_DATE_EDEFAULT.equals(expiryDate);
			case PaymentMeteringPackage.CARD__PAN:
				return PAN_EDEFAULT == null ? pan != null : !PAN_EDEFAULT.equals(pan);
			case PaymentMeteringPackage.CARD__ACCOUNT_HOLDER_NAME:
				return ACCOUNT_HOLDER_NAME_EDEFAULT == null ? accountHolderName != null : !ACCOUNT_HOLDER_NAME_EDEFAULT.equals(accountHolderName);
			case PaymentMeteringPackage.CARD__TENDER:
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
		result.append(" (cvNumber: ");
		result.append(cvNumber);
		result.append(", expiryDate: ");
		result.append(expiryDate);
		result.append(", pan: ");
		result.append(pan);
		result.append(", accountHolderName: ");
		result.append(accountHolderName);
		result.append(')');
		return result.toString();
	}

} //CardImpl
