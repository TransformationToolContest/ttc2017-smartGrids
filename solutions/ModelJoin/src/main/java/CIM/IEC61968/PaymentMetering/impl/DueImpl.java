/**
 */
package CIM.IEC61968.PaymentMetering.impl;

import CIM.IEC61968.PaymentMetering.Due;
import CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Due</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.DueImpl#getInterest <em>Interest</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.DueImpl#getPrinciple <em>Principle</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.DueImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.DueImpl#getArrears <em>Arrears</em>}</li>
 *   <li>{@link CIM.IEC61968.PaymentMetering.impl.DueImpl#getCharges <em>Charges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DueImpl extends ElementImpl implements Due {
	/**
	 * The default value of the '{@link #getInterest() <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterest()
	 * @generated
	 * @ordered
	 */
	protected static final float INTEREST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInterest() <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterest()
	 * @generated
	 * @ordered
	 */
	protected float interest = INTEREST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrinciple() <em>Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinciple()
	 * @generated
	 * @ordered
	 */
	protected static final float PRINCIPLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrinciple() <em>Principle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinciple()
	 * @generated
	 * @ordered
	 */
	protected float principle = PRINCIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected float current = CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrears() <em>Arrears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrears()
	 * @generated
	 * @ordered
	 */
	protected static final float ARREARS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getArrears() <em>Arrears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrears()
	 * @generated
	 * @ordered
	 */
	protected float arrears = ARREARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharges() <em>Charges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected static final float CHARGES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCharges() <em>Charges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected float charges = CHARGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.DUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInterest() {
		return interest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterest(float newInterest) {
		float oldInterest = interest;
		interest = newInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.DUE__INTEREST, oldInterest, interest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrinciple() {
		return principle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrinciple(float newPrinciple) {
		float oldPrinciple = principle;
		principle = newPrinciple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.DUE__PRINCIPLE, oldPrinciple, principle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(float newCurrent) {
		float oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.DUE__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getArrears() {
		return arrears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrears(float newArrears) {
		float oldArrears = arrears;
		arrears = newArrears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.DUE__ARREARS, oldArrears, arrears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCharges() {
		return charges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharges(float newCharges) {
		float oldCharges = charges;
		charges = newCharges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.DUE__CHARGES, oldCharges, charges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentMeteringPackage.DUE__INTEREST:
				return getInterest();
			case PaymentMeteringPackage.DUE__PRINCIPLE:
				return getPrinciple();
			case PaymentMeteringPackage.DUE__CURRENT:
				return getCurrent();
			case PaymentMeteringPackage.DUE__ARREARS:
				return getArrears();
			case PaymentMeteringPackage.DUE__CHARGES:
				return getCharges();
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
			case PaymentMeteringPackage.DUE__INTEREST:
				setInterest((Float)newValue);
				return;
			case PaymentMeteringPackage.DUE__PRINCIPLE:
				setPrinciple((Float)newValue);
				return;
			case PaymentMeteringPackage.DUE__CURRENT:
				setCurrent((Float)newValue);
				return;
			case PaymentMeteringPackage.DUE__ARREARS:
				setArrears((Float)newValue);
				return;
			case PaymentMeteringPackage.DUE__CHARGES:
				setCharges((Float)newValue);
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
			case PaymentMeteringPackage.DUE__INTEREST:
				setInterest(INTEREST_EDEFAULT);
				return;
			case PaymentMeteringPackage.DUE__PRINCIPLE:
				setPrinciple(PRINCIPLE_EDEFAULT);
				return;
			case PaymentMeteringPackage.DUE__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
				return;
			case PaymentMeteringPackage.DUE__ARREARS:
				setArrears(ARREARS_EDEFAULT);
				return;
			case PaymentMeteringPackage.DUE__CHARGES:
				setCharges(CHARGES_EDEFAULT);
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
			case PaymentMeteringPackage.DUE__INTEREST:
				return interest != INTEREST_EDEFAULT;
			case PaymentMeteringPackage.DUE__PRINCIPLE:
				return principle != PRINCIPLE_EDEFAULT;
			case PaymentMeteringPackage.DUE__CURRENT:
				return current != CURRENT_EDEFAULT;
			case PaymentMeteringPackage.DUE__ARREARS:
				return arrears != ARREARS_EDEFAULT;
			case PaymentMeteringPackage.DUE__CHARGES:
				return charges != CHARGES_EDEFAULT;
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
		result.append(" (interest: ");
		result.append(interest);
		result.append(", principle: ");
		result.append(principle);
		result.append(", current: ");
		result.append(current);
		result.append(", arrears: ");
		result.append(arrears);
		result.append(", charges: ");
		result.append(charges);
		result.append(')');
		return result.toString();
	}

} //DueImpl
