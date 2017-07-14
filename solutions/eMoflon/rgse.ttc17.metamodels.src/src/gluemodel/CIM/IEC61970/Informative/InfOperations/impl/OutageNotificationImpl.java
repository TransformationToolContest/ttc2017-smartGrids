/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Customers.Customer;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageNotification;

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
 * An implementation of the model object '<em><b>Outage Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageNotificationImpl#getExpectedInterruptionCount <em>Expected Interruption Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageNotificationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageNotificationImpl#getCustomerDatas <em>Customer Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.OutageNotificationImpl#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageNotificationImpl extends DocumentImpl implements OutageNotification {
	/**
	 * The default value of the '{@link #getExpectedInterruptionCount() <em>Expected Interruption Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedInterruptionCount()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPECTED_INTERRUPTION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpectedInterruptionCount() <em>Expected Interruption Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedInterruptionCount()
	 * @generated
	 * @ordered
	 */
	protected int expectedInterruptionCount = EXPECTED_INTERRUPTION_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerDatas() <em>Customer Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customerDatas;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpectedInterruptionCount() {
		return expectedInterruptionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedInterruptionCount(int newExpectedInterruptionCount) {
		int oldExpectedInterruptionCount = expectedInterruptionCount;
		expectedInterruptionCount = newExpectedInterruptionCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT, oldExpectedInterruptionCount, expectedInterruptionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomerDatas() {
		if (customerDatas == null) {
			customerDatas = new EObjectWithInverseResolvingEList.ManyInverse<Customer>(Customer.class, this, InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS, CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS);
		}
		return customerDatas;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_NOTIFICATION__REASON, oldReason, reason));
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerDatas()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				return ((InternalEList<?>)getCustomerDatas()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT:
				return getExpectedInterruptionCount();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION:
				return getDuration();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				return getCustomerDatas();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__REASON:
				return getReason();
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT:
				setExpectedInterruptionCount((Integer)newValue);
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION:
				setDuration((Float)newValue);
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				getCustomerDatas().clear();
				getCustomerDatas().addAll((Collection<? extends Customer>)newValue);
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__REASON:
				setReason((String)newValue);
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT:
				setExpectedInterruptionCount(EXPECTED_INTERRUPTION_COUNT_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				getCustomerDatas().clear();
				return;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__REASON:
				setReason(REASON_EDEFAULT);
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
			case InfOperationsPackage.OUTAGE_NOTIFICATION__EXPECTED_INTERRUPTION_COUNT:
				return expectedInterruptionCount != EXPECTED_INTERRUPTION_COUNT_EDEFAULT;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__DURATION:
				return duration != DURATION_EDEFAULT;
			case InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS:
				return customerDatas != null && !customerDatas.isEmpty();
			case InfOperationsPackage.OUTAGE_NOTIFICATION__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
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
		result.append(" (expectedInterruptionCount: ");
		result.append(expectedInterruptionCount);
		result.append(", duration: ");
		result.append(duration);
		result.append(", reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //OutageNotificationImpl
