/**
 */
package CIM.IEC61968.Common.impl;

import CIM.IEC61968.Common.Agreement;
import CIM.IEC61968.Common.CommonPackage;
import CIM.IEC61968.Common.DateTimeInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Common.impl.AgreementImpl#getSignDate <em>Sign Date</em>}</li>
 *   <li>{@link CIM.IEC61968.Common.impl.AgreementImpl#getValidityInterval <em>Validity Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementImpl extends DocumentImpl implements Agreement {
	/**
	 * The default value of the '{@link #getSignDate() <em>Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignDate()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignDate() <em>Sign Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignDate()
	 * @generated
	 * @ordered
	 */
	protected String signDate = SIGN_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidityInterval() <em>Validity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval validityInterval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignDate() {
		return signDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignDate(String newSignDate) {
		String oldSignDate = signDate;
		signDate = newSignDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.AGREEMENT__SIGN_DATE, oldSignDate, signDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getValidityInterval() {
		if (validityInterval != null && validityInterval.eIsProxy()) {
			InternalEObject oldValidityInterval = (InternalEObject)validityInterval;
			validityInterval = (DateTimeInterval)eResolveProxy(oldValidityInterval);
			if (validityInterval != oldValidityInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.AGREEMENT__VALIDITY_INTERVAL, oldValidityInterval, validityInterval));
			}
		}
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetValidityInterval() {
		return validityInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityInterval(DateTimeInterval newValidityInterval) {
		DateTimeInterval oldValidityInterval = validityInterval;
		validityInterval = newValidityInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.AGREEMENT__VALIDITY_INTERVAL, oldValidityInterval, validityInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.AGREEMENT__SIGN_DATE:
				return getSignDate();
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				if (resolve) return getValidityInterval();
				return basicGetValidityInterval();
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
			case CommonPackage.AGREEMENT__SIGN_DATE:
				setSignDate((String)newValue);
				return;
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)newValue);
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
			case CommonPackage.AGREEMENT__SIGN_DATE:
				setSignDate(SIGN_DATE_EDEFAULT);
				return;
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)null);
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
			case CommonPackage.AGREEMENT__SIGN_DATE:
				return SIGN_DATE_EDEFAULT == null ? signDate != null : !SIGN_DATE_EDEFAULT.equals(signDate);
			case CommonPackage.AGREEMENT__VALIDITY_INTERVAL:
				return validityInterval != null;
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
		result.append(" (signDate: ");
		result.append(signDate);
		result.append(')');
		return result.toString();
	}

} //AgreementImpl
