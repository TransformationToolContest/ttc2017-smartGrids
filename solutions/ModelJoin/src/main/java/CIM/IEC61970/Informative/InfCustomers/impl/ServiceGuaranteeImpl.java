/**
 */
package CIM.IEC61970.Informative.InfCustomers.impl;

import CIM.IEC61968.Common.DateTimeInterval;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Informative.InfCustomers.InfCustomersPackage;
import CIM.IEC61970.Informative.InfCustomers.ServiceGuarantee;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Guarantee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.ServiceGuaranteeImpl#getPayAmount <em>Pay Amount</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.ServiceGuaranteeImpl#getApplicationPeriod <em>Application Period</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.ServiceGuaranteeImpl#isAutomaticPay <em>Automatic Pay</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfCustomers.impl.ServiceGuaranteeImpl#getServiceRequirement <em>Service Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceGuaranteeImpl extends DocumentImpl implements ServiceGuarantee {
	/**
	 * The default value of the '{@link #getPayAmount() <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float PAY_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPayAmount() <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayAmount()
	 * @generated
	 * @ordered
	 */
	protected float payAmount = PAY_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicationPeriod() <em>Application Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationPeriod()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval applicationPeriod;

	/**
	 * The default value of the '{@link #isAutomaticPay() <em>Automatic Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticPay()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATIC_PAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutomaticPay() <em>Automatic Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticPay()
	 * @generated
	 * @ordered
	 */
	protected boolean automaticPay = AUTOMATIC_PAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceRequirement() <em>Service Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_REQUIREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceRequirement() <em>Service Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRequirement()
	 * @generated
	 * @ordered
	 */
	protected String serviceRequirement = SERVICE_REQUIREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceGuaranteeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfCustomersPackage.Literals.SERVICE_GUARANTEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPayAmount() {
		return payAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayAmount(float newPayAmount) {
		float oldPayAmount = payAmount;
		payAmount = newPayAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT, oldPayAmount, payAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval getApplicationPeriod() {
		if (applicationPeriod != null && applicationPeriod.eIsProxy()) {
			InternalEObject oldApplicationPeriod = (InternalEObject)applicationPeriod;
			applicationPeriod = (DateTimeInterval)eResolveProxy(oldApplicationPeriod);
			if (applicationPeriod != oldApplicationPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD, oldApplicationPeriod, applicationPeriod));
			}
		}
		return applicationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeInterval basicGetApplicationPeriod() {
		return applicationPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationPeriod(DateTimeInterval newApplicationPeriod) {
		DateTimeInterval oldApplicationPeriod = applicationPeriod;
		applicationPeriod = newApplicationPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD, oldApplicationPeriod, applicationPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutomaticPay() {
		return automaticPay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticPay(boolean newAutomaticPay) {
		boolean oldAutomaticPay = automaticPay;
		automaticPay = newAutomaticPay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY, oldAutomaticPay, automaticPay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceRequirement() {
		return serviceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRequirement(String newServiceRequirement) {
		String oldServiceRequirement = serviceRequirement;
		serviceRequirement = newServiceRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT, oldServiceRequirement, serviceRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT:
				return getPayAmount();
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				if (resolve) return getApplicationPeriod();
				return basicGetApplicationPeriod();
			case InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY:
				return isAutomaticPay();
			case InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT:
				return getServiceRequirement();
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
			case InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT:
				setPayAmount((Float)newValue);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				setApplicationPeriod((DateTimeInterval)newValue);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY:
				setAutomaticPay((Boolean)newValue);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT:
				setServiceRequirement((String)newValue);
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
			case InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT:
				setPayAmount(PAY_AMOUNT_EDEFAULT);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				setApplicationPeriod((DateTimeInterval)null);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY:
				setAutomaticPay(AUTOMATIC_PAY_EDEFAULT);
				return;
			case InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT:
				setServiceRequirement(SERVICE_REQUIREMENT_EDEFAULT);
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
			case InfCustomersPackage.SERVICE_GUARANTEE__PAY_AMOUNT:
				return payAmount != PAY_AMOUNT_EDEFAULT;
			case InfCustomersPackage.SERVICE_GUARANTEE__APPLICATION_PERIOD:
				return applicationPeriod != null;
			case InfCustomersPackage.SERVICE_GUARANTEE__AUTOMATIC_PAY:
				return automaticPay != AUTOMATIC_PAY_EDEFAULT;
			case InfCustomersPackage.SERVICE_GUARANTEE__SERVICE_REQUIREMENT:
				return SERVICE_REQUIREMENT_EDEFAULT == null ? serviceRequirement != null : !SERVICE_REQUIREMENT_EDEFAULT.equals(serviceRequirement);
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
		result.append(" (payAmount: ");
		result.append(payAmount);
		result.append(", automaticPay: ");
		result.append(automaticPay);
		result.append(", serviceRequirement: ");
		result.append(serviceRequirement);
		result.append(')');
		return result.toString();
	}

} //ServiceGuaranteeImpl
