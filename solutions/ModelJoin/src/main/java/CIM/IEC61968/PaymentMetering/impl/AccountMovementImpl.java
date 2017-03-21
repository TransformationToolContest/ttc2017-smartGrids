/**
 */
package CIM.IEC61968.PaymentMetering.impl;

import CIM.IEC61968.PaymentMetering.AccountMovement;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

import CIM.impl.ElementImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Movement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AccountMovementImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AccountMovementImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.AccountMovementImpl#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountMovementImpl extends ElementImpl implements AccountMovement {
	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountMovementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.ACCOUNT_MOVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.ACCOUNT_MOVEMENT__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.ACCOUNT_MOVEMENT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.ACCOUNT_MOVEMENT__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__REASON:
				return getReason();
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__AMOUNT:
				return getAmount();
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__DATE_TIME:
				return getDateTime();
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
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__REASON:
				setReason((String)newValue);
				return;
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__AMOUNT:
				setAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__DATE_TIME:
				setDateTime((Date)newValue);
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
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
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
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case PaymentMeteringPackage.ACCOUNT_MOVEMENT__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
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
		result.append(" (reason: ");
		result.append(reason);
		result.append(", amount: ");
		result.append(amount);
		result.append(", dateTime: ");
		result.append(dateTime);
		result.append(')');
		return result.toString();
	}

} //AccountMovementImpl
