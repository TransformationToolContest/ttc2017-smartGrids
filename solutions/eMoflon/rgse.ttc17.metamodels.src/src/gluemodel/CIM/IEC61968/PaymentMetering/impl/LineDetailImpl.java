/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.PaymentMetering.LineDetail;
import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

import gluemodel.CIM.impl.ElementImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.LineDetailImpl#getRounding <em>Rounding</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.LineDetailImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.LineDetailImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.LineDetailImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineDetailImpl extends ElementImpl implements LineDetail {
	/**
	 * The default value of the '{@link #getRounding() <em>Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounding()
	 * @generated
	 * @ordered
	 */
	protected static final float ROUNDING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRounding() <em>Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRounding()
	 * @generated
	 * @ordered
	 */
	protected float rounding = ROUNDING_EDEFAULT;

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
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.LINE_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRounding() {
		return rounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRounding(float newRounding) {
		float oldRounding = rounding;
		rounding = newRounding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.LINE_DETAIL__ROUNDING, oldRounding, rounding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.LINE_DETAIL__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.LINE_DETAIL__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.LINE_DETAIL__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.LINE_DETAIL__ROUNDING:
				return getRounding();
			case PaymentMeteringPackage.LINE_DETAIL__AMOUNT:
				return getAmount();
			case PaymentMeteringPackage.LINE_DETAIL__DATE_TIME:
				return getDateTime();
			case PaymentMeteringPackage.LINE_DETAIL__NOTE:
				return getNote();
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
			case PaymentMeteringPackage.LINE_DETAIL__ROUNDING:
				setRounding((Float)newValue);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__AMOUNT:
				setAmount((Float)newValue);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__DATE_TIME:
				setDateTime((Date)newValue);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__NOTE:
				setNote((String)newValue);
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
			case PaymentMeteringPackage.LINE_DETAIL__ROUNDING:
				setRounding(ROUNDING_EDEFAULT);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case PaymentMeteringPackage.LINE_DETAIL__NOTE:
				setNote(NOTE_EDEFAULT);
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
			case PaymentMeteringPackage.LINE_DETAIL__ROUNDING:
				return rounding != ROUNDING_EDEFAULT;
			case PaymentMeteringPackage.LINE_DETAIL__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case PaymentMeteringPackage.LINE_DETAIL__DATE_TIME:
				return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
			case PaymentMeteringPackage.LINE_DETAIL__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
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
		result.append(" (rounding: ");
		result.append(rounding);
		result.append(", amount: ");
		result.append(amount);
		result.append(", dateTime: ");
		result.append(dateTime);
		result.append(", note: ");
		result.append(note);
		result.append(')');
		return result.toString();
	}

} //LineDetailImpl
