/**
 */
package COSEM.COSEMObjects.impl;

import COSEM.COSEMObjects.BillingPeriodValues;
import COSEM.COSEMObjects.COSEMObjectsPackage;

import COSEM.InterfaceClasses.impl.DataImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing Period Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link COSEM.COSEMObjects.impl.BillingPeriodValuesImpl#getBillingPeriodCounter <em>Billing Period Counter</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BillingPeriodValuesImpl#getNumberAvailableBillingPeriods <em>Number Available Billing Periods</em>}</li>
 *   <li>{@link COSEM.COSEMObjects.impl.BillingPeriodValuesImpl#getTimestampRecentBillingPeriod <em>Timestamp Recent Billing Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillingPeriodValuesImpl extends DataImpl implements BillingPeriodValues {
	/**
	 * The default value of the '{@link #getBillingPeriodCounter() <em>Billing Period Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingPeriodCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int BILLING_PERIOD_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBillingPeriodCounter() <em>Billing Period Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingPeriodCounter()
	 * @generated
	 * @ordered
	 */
	protected int billingPeriodCounter = BILLING_PERIOD_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberAvailableBillingPeriods() <em>Number Available Billing Periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberAvailableBillingPeriods()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_AVAILABLE_BILLING_PERIODS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberAvailableBillingPeriods() <em>Number Available Billing Periods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberAvailableBillingPeriods()
	 * @generated
	 * @ordered
	 */
	protected int numberAvailableBillingPeriods = NUMBER_AVAILABLE_BILLING_PERIODS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestampRecentBillingPeriod() <em>Timestamp Recent Billing Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampRecentBillingPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESTAMP_RECENT_BILLING_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestampRecentBillingPeriod() <em>Timestamp Recent Billing Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampRecentBillingPeriod()
	 * @generated
	 * @ordered
	 */
	protected String timestampRecentBillingPeriod = TIMESTAMP_RECENT_BILLING_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingPeriodValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return COSEMObjectsPackage.eINSTANCE.getBillingPeriodValues();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBillingPeriodCounter() {
		return billingPeriodCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingPeriodCounter(int newBillingPeriodCounter) {
		int oldBillingPeriodCounter = billingPeriodCounter;
		billingPeriodCounter = newBillingPeriodCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BILLING_PERIOD_VALUES__BILLING_PERIOD_COUNTER, oldBillingPeriodCounter, billingPeriodCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberAvailableBillingPeriods() {
		return numberAvailableBillingPeriods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberAvailableBillingPeriods(int newNumberAvailableBillingPeriods) {
		int oldNumberAvailableBillingPeriods = numberAvailableBillingPeriods;
		numberAvailableBillingPeriods = newNumberAvailableBillingPeriods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BILLING_PERIOD_VALUES__NUMBER_AVAILABLE_BILLING_PERIODS, oldNumberAvailableBillingPeriods, numberAvailableBillingPeriods));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimestampRecentBillingPeriod() {
		return timestampRecentBillingPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampRecentBillingPeriod(String newTimestampRecentBillingPeriod) {
		String oldTimestampRecentBillingPeriod = timestampRecentBillingPeriod;
		timestampRecentBillingPeriod = newTimestampRecentBillingPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, COSEMObjectsPackage.BILLING_PERIOD_VALUES__TIMESTAMP_RECENT_BILLING_PERIOD, oldTimestampRecentBillingPeriod, timestampRecentBillingPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__BILLING_PERIOD_COUNTER:
				return getBillingPeriodCounter();
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__NUMBER_AVAILABLE_BILLING_PERIODS:
				return getNumberAvailableBillingPeriods();
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__TIMESTAMP_RECENT_BILLING_PERIOD:
				return getTimestampRecentBillingPeriod();
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
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__BILLING_PERIOD_COUNTER:
				setBillingPeriodCounter((Integer)newValue);
				return;
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__NUMBER_AVAILABLE_BILLING_PERIODS:
				setNumberAvailableBillingPeriods((Integer)newValue);
				return;
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__TIMESTAMP_RECENT_BILLING_PERIOD:
				setTimestampRecentBillingPeriod((String)newValue);
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
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__BILLING_PERIOD_COUNTER:
				setBillingPeriodCounter(BILLING_PERIOD_COUNTER_EDEFAULT);
				return;
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__NUMBER_AVAILABLE_BILLING_PERIODS:
				setNumberAvailableBillingPeriods(NUMBER_AVAILABLE_BILLING_PERIODS_EDEFAULT);
				return;
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__TIMESTAMP_RECENT_BILLING_PERIOD:
				setTimestampRecentBillingPeriod(TIMESTAMP_RECENT_BILLING_PERIOD_EDEFAULT);
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
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__BILLING_PERIOD_COUNTER:
				return billingPeriodCounter != BILLING_PERIOD_COUNTER_EDEFAULT;
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__NUMBER_AVAILABLE_BILLING_PERIODS:
				return numberAvailableBillingPeriods != NUMBER_AVAILABLE_BILLING_PERIODS_EDEFAULT;
			case COSEMObjectsPackage.BILLING_PERIOD_VALUES__TIMESTAMP_RECENT_BILLING_PERIOD:
				return TIMESTAMP_RECENT_BILLING_PERIOD_EDEFAULT == null ? timestampRecentBillingPeriod != null : !TIMESTAMP_RECENT_BILLING_PERIOD_EDEFAULT.equals(timestampRecentBillingPeriod);
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
		result.append(" (BillingPeriodCounter: ");
		result.append(billingPeriodCounter);
		result.append(", NumberAvailableBillingPeriods: ");
		result.append(numberAvailableBillingPeriods);
		result.append(", TimestampRecentBillingPeriod: ");
		result.append(timestampRecentBillingPeriod);
		result.append(')');
		return result.toString();
	}

} //BillingPeriodValuesImpl
