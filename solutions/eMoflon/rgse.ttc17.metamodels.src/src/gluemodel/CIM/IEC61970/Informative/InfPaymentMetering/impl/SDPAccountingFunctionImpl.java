/**
 */
package gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl;

import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.ServiceCategory;

import gluemodel.CIM.IEC61968.Metering.impl.DeviceFunctionImpl;

import gluemodel.CIM.IEC61968.PaymentMetering.AccountingUnit;

import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.ChargeRegister;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.CreditRegister;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.InfPaymentMeteringPackage;
import gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.SDPAccountingFunction;

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
 * An implementation of the model object '<em><b>SDP Accounting Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl#getAvailableCredit <em>Available Credit</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl#getCreditRegisters <em>Credit Registers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl#getChargeRegisters <em>Charge Registers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl#getLowCreditWarningLevel <em>Low Credit Warning Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl#getCreditExpiryLevel <em>Credit Expiry Level</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfPaymentMetering.impl.SDPAccountingFunctionImpl#getServiceKind <em>Service Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDPAccountingFunctionImpl extends DeviceFunctionImpl implements SDPAccountingFunction {
	/**
	 * The cached value of the '{@link #getAvailableCredit() <em>Available Credit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCredit()
	 * @generated
	 * @ordered
	 */
	protected AccountingUnit availableCredit;

	/**
	 * The cached value of the '{@link #getCreditRegisters() <em>Credit Registers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<CreditRegister> creditRegisters;

	/**
	 * The cached value of the '{@link #getChargeRegisters() <em>Charge Registers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<ChargeRegister> chargeRegisters;

	/**
	 * The cached value of the '{@link #getLowCreditWarningLevel() <em>Low Credit Warning Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowCreditWarningLevel()
	 * @generated
	 * @ordered
	 */
	protected AccountingUnit lowCreditWarningLevel;

	/**
	 * The cached value of the '{@link #getCreditExpiryLevel() <em>Credit Expiry Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditExpiryLevel()
	 * @generated
	 * @ordered
	 */
	protected AccountingUnit creditExpiryLevel;

	/**
	 * The cached value of the '{@link #getServiceKind() <em>Service Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceKind()
	 * @generated
	 * @ordered
	 */
	protected ServiceCategory serviceKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDPAccountingFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfPaymentMeteringPackage.Literals.SDP_ACCOUNTING_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit getAvailableCredit() {
		if (availableCredit != null && availableCredit.eIsProxy()) {
			InternalEObject oldAvailableCredit = (InternalEObject)availableCredit;
			availableCredit = (AccountingUnit)eResolveProxy(oldAvailableCredit);
			if (availableCredit != oldAvailableCredit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__AVAILABLE_CREDIT, oldAvailableCredit, availableCredit));
			}
		}
		return availableCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit basicGetAvailableCredit() {
		return availableCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableCredit(AccountingUnit newAvailableCredit) {
		AccountingUnit oldAvailableCredit = availableCredit;
		availableCredit = newAvailableCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__AVAILABLE_CREDIT, oldAvailableCredit, availableCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreditRegister> getCreditRegisters() {
		if (creditRegisters == null) {
			creditRegisters = new EObjectWithInverseResolvingEList<CreditRegister>(CreditRegister.class, this, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS, InfPaymentMeteringPackage.CREDIT_REGISTER__SDP_ACCOUNTING_FUNCTION);
		}
		return creditRegisters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChargeRegister> getChargeRegisters() {
		if (chargeRegisters == null) {
			chargeRegisters = new EObjectWithInverseResolvingEList<ChargeRegister>(ChargeRegister.class, this, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS, InfPaymentMeteringPackage.CHARGE_REGISTER__SP_ACCOUNTING_FUNCTION);
		}
		return chargeRegisters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit getLowCreditWarningLevel() {
		if (lowCreditWarningLevel != null && lowCreditWarningLevel.eIsProxy()) {
			InternalEObject oldLowCreditWarningLevel = (InternalEObject)lowCreditWarningLevel;
			lowCreditWarningLevel = (AccountingUnit)eResolveProxy(oldLowCreditWarningLevel);
			if (lowCreditWarningLevel != oldLowCreditWarningLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__LOW_CREDIT_WARNING_LEVEL, oldLowCreditWarningLevel, lowCreditWarningLevel));
			}
		}
		return lowCreditWarningLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit basicGetLowCreditWarningLevel() {
		return lowCreditWarningLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowCreditWarningLevel(AccountingUnit newLowCreditWarningLevel) {
		AccountingUnit oldLowCreditWarningLevel = lowCreditWarningLevel;
		lowCreditWarningLevel = newLowCreditWarningLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__LOW_CREDIT_WARNING_LEVEL, oldLowCreditWarningLevel, lowCreditWarningLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit getCreditExpiryLevel() {
		if (creditExpiryLevel != null && creditExpiryLevel.eIsProxy()) {
			InternalEObject oldCreditExpiryLevel = (InternalEObject)creditExpiryLevel;
			creditExpiryLevel = (AccountingUnit)eResolveProxy(oldCreditExpiryLevel);
			if (creditExpiryLevel != oldCreditExpiryLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_EXPIRY_LEVEL, oldCreditExpiryLevel, creditExpiryLevel));
			}
		}
		return creditExpiryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountingUnit basicGetCreditExpiryLevel() {
		return creditExpiryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditExpiryLevel(AccountingUnit newCreditExpiryLevel) {
		AccountingUnit oldCreditExpiryLevel = creditExpiryLevel;
		creditExpiryLevel = newCreditExpiryLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_EXPIRY_LEVEL, oldCreditExpiryLevel, creditExpiryLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory getServiceKind() {
		if (serviceKind != null && serviceKind.eIsProxy()) {
			InternalEObject oldServiceKind = (InternalEObject)serviceKind;
			serviceKind = (ServiceCategory)eResolveProxy(oldServiceKind);
			if (serviceKind != oldServiceKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND, oldServiceKind, serviceKind));
			}
		}
		return serviceKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCategory basicGetServiceKind() {
		return serviceKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceKind(ServiceCategory newServiceKind, NotificationChain msgs) {
		ServiceCategory oldServiceKind = serviceKind;
		serviceKind = newServiceKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND, oldServiceKind, newServiceKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceKind(ServiceCategory newServiceKind) {
		if (newServiceKind != serviceKind) {
			NotificationChain msgs = null;
			if (serviceKind != null)
				msgs = ((InternalEObject)serviceKind).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS, ServiceCategory.class, msgs);
			if (newServiceKind != null)
				msgs = ((InternalEObject)newServiceKind).eInverseAdd(this, CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS, ServiceCategory.class, msgs);
			msgs = basicSetServiceKind(newServiceKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND, newServiceKind, newServiceKind));
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
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCreditRegisters()).basicAdd(otherEnd, msgs);
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChargeRegisters()).basicAdd(otherEnd, msgs);
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND:
				if (serviceKind != null)
					msgs = ((InternalEObject)serviceKind).eInverseRemove(this, CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS, ServiceCategory.class, msgs);
				return basicSetServiceKind((ServiceCategory)otherEnd, msgs);
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
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS:
				return ((InternalEList<?>)getCreditRegisters()).basicRemove(otherEnd, msgs);
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS:
				return ((InternalEList<?>)getChargeRegisters()).basicRemove(otherEnd, msgs);
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND:
				return basicSetServiceKind(null, msgs);
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
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__AVAILABLE_CREDIT:
				if (resolve) return getAvailableCredit();
				return basicGetAvailableCredit();
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS:
				return getCreditRegisters();
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS:
				return getChargeRegisters();
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__LOW_CREDIT_WARNING_LEVEL:
				if (resolve) return getLowCreditWarningLevel();
				return basicGetLowCreditWarningLevel();
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_EXPIRY_LEVEL:
				if (resolve) return getCreditExpiryLevel();
				return basicGetCreditExpiryLevel();
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND:
				if (resolve) return getServiceKind();
				return basicGetServiceKind();
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
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__AVAILABLE_CREDIT:
				setAvailableCredit((AccountingUnit)newValue);
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS:
				getCreditRegisters().clear();
				getCreditRegisters().addAll((Collection<? extends CreditRegister>)newValue);
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS:
				getChargeRegisters().clear();
				getChargeRegisters().addAll((Collection<? extends ChargeRegister>)newValue);
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__LOW_CREDIT_WARNING_LEVEL:
				setLowCreditWarningLevel((AccountingUnit)newValue);
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_EXPIRY_LEVEL:
				setCreditExpiryLevel((AccountingUnit)newValue);
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND:
				setServiceKind((ServiceCategory)newValue);
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
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__AVAILABLE_CREDIT:
				setAvailableCredit((AccountingUnit)null);
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS:
				getCreditRegisters().clear();
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS:
				getChargeRegisters().clear();
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__LOW_CREDIT_WARNING_LEVEL:
				setLowCreditWarningLevel((AccountingUnit)null);
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_EXPIRY_LEVEL:
				setCreditExpiryLevel((AccountingUnit)null);
				return;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND:
				setServiceKind((ServiceCategory)null);
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
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__AVAILABLE_CREDIT:
				return availableCredit != null;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_REGISTERS:
				return creditRegisters != null && !creditRegisters.isEmpty();
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CHARGE_REGISTERS:
				return chargeRegisters != null && !chargeRegisters.isEmpty();
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__LOW_CREDIT_WARNING_LEVEL:
				return lowCreditWarningLevel != null;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__CREDIT_EXPIRY_LEVEL:
				return creditExpiryLevel != null;
			case InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND:
				return serviceKind != null;
		}
		return super.eIsSet(featureID);
	}

} //SDPAccountingFunctionImpl
