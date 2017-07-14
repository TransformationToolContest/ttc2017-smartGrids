/**
 */
package gluemodel.CIM.IEC61968.PaymentMetering.impl;

import gluemodel.CIM.IEC61968.Common.impl.OrganisationImpl;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61968.PaymentMetering.PaymentMeteringPackage;
import gluemodel.CIM.IEC61968.PaymentMetering.ServiceSupplier;
import gluemodel.CIM.IEC61968.PaymentMetering.SupplierKind;

import gluemodel.CIM.IEC61970.Informative.InfCommon.BankAccount;
import gluemodel.CIM.IEC61970.Informative.InfCommon.InfCommonPackage;

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
 * An implementation of the model object '<em><b>Service Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl#getBankAccounts <em>Bank Accounts</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl#getIssuerIdentificationNumber <em>Issuer Identification Number</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.PaymentMetering.impl.ServiceSupplierImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSupplierImpl extends OrganisationImpl implements ServiceSupplier {
	/**
	 * The cached value of the '{@link #getServiceDeliveryPoints() <em>Service Delivery Points</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDeliveryPoint> serviceDeliveryPoints;

	/**
	 * The cached value of the '{@link #getBankAccounts() <em>Bank Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<BankAccount> bankAccounts;

	/**
	 * The default value of the '{@link #getIssuerIdentificationNumber() <em>Issuer Identification Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerIdentificationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_IDENTIFICATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuerIdentificationNumber() <em>Issuer Identification Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerIdentificationNumber()
	 * @generated
	 * @ordered
	 */
	protected String issuerIdentificationNumber = ISSUER_IDENTIFICATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SupplierKind KIND_EDEFAULT = SupplierKind.RETAILER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SupplierKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAgreement> customerAgreements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentMeteringPackage.Literals.SERVICE_SUPPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_SUPPLIER);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankAccount> getBankAccounts() {
		if (bankAccounts == null) {
			bankAccounts = new EObjectWithInverseResolvingEList<BankAccount>(BankAccount.class, this, PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS, InfCommonPackage.BANK_ACCOUNT__SERVICE_SUPPLIER);
		}
		return bankAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssuerIdentificationNumber() {
		return issuerIdentificationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuerIdentificationNumber(String newIssuerIdentificationNumber) {
		String oldIssuerIdentificationNumber = issuerIdentificationNumber;
		issuerIdentificationNumber = newIssuerIdentificationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER, oldIssuerIdentificationNumber, issuerIdentificationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(SupplierKind newKind) {
		SupplierKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentMeteringPackage.SERVICE_SUPPLIER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new EObjectWithInverseResolvingEList<CustomerAgreement>(CustomerAgreement.class, this, PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_SUPPLIER);
		}
		return customerAgreements;
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBankAccounts()).basicAdd(otherEnd, msgs);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				return ((InternalEList<?>)getBankAccounts()).basicRemove(otherEnd, msgs);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				return getBankAccounts();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
				return getIssuerIdentificationNumber();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__KIND:
				return getKind();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				getBankAccounts().clear();
				getBankAccounts().addAll((Collection<? extends BankAccount>)newValue);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
				setIssuerIdentificationNumber((String)newValue);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__KIND:
				setKind((SupplierKind)newValue);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				getBankAccounts().clear();
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
				setIssuerIdentificationNumber(ISSUER_IDENTIFICATION_NUMBER_EDEFAULT);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
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
			case PaymentMeteringPackage.SERVICE_SUPPLIER__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__BANK_ACCOUNTS:
				return bankAccounts != null && !bankAccounts.isEmpty();
			case PaymentMeteringPackage.SERVICE_SUPPLIER__ISSUER_IDENTIFICATION_NUMBER:
				return ISSUER_IDENTIFICATION_NUMBER_EDEFAULT == null ? issuerIdentificationNumber != null : !ISSUER_IDENTIFICATION_NUMBER_EDEFAULT.equals(issuerIdentificationNumber);
			case PaymentMeteringPackage.SERVICE_SUPPLIER__KIND:
				return kind != KIND_EDEFAULT;
			case PaymentMeteringPackage.SERVICE_SUPPLIER__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
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
		result.append(" (issuerIdentificationNumber: ");
		result.append(issuerIdentificationNumber);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ServiceSupplierImpl
