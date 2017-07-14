/**
 */
package gluemodel.CIM.IEC61968.Customers.impl;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.PricingStructure;
import gluemodel.CIM.IEC61968.Customers.ServiceCategory;
import gluemodel.CIM.IEC61968.Customers.ServiceKind;

import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Service Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl#getSPAccountingFunctions <em>SP Accounting Functions</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceCategoryImpl#getPricingStructures <em>Pricing Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceCategoryImpl extends IdentifiedObjectImpl implements ServiceCategory {
	/**
	 * The cached value of the '{@link #getSPAccountingFunctions() <em>SP Accounting Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPAccountingFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SDPAccountingFunction> spAccountingFunctions;

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
	 * The cached value of the '{@link #getCustomerAgreements() <em>Customer Agreements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAgreements()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerAgreement> customerAgreements;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceKind KIND_EDEFAULT = ServiceKind.TIME;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ServiceKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPricingStructures() <em>Pricing Structures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<PricingStructure> pricingStructures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.SERVICE_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SDPAccountingFunction> getSPAccountingFunctions() {
		if (spAccountingFunctions == null) {
			spAccountingFunctions = new EObjectWithInverseResolvingEList<SDPAccountingFunction>(SDPAccountingFunction.class, this, CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS, InfPaymentMeteringPackage.SDP_ACCOUNTING_FUNCTION__SERVICE_KIND);
		}
		return spAccountingFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_CATEGORY);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new EObjectWithInverseResolvingEList<CustomerAgreement>(CustomerAgreement.class, this, CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_CATEGORY);
		}
		return customerAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ServiceKind newKind) {
		ServiceKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.SERVICE_CATEGORY__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PricingStructure> getPricingStructures() {
		if (pricingStructures == null) {
			pricingStructures = new EObjectWithInverseResolvingEList<PricingStructure>(PricingStructure.class, this, CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES, CustomersPackage.PRICING_STRUCTURE__SERVICE_CATEGORY);
		}
		return pricingStructures;
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
			case CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSPAccountingFunctions()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPricingStructures()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS:
				return ((InternalEList<?>)getSPAccountingFunctions()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES:
				return ((InternalEList<?>)getPricingStructures()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS:
				return getSPAccountingFunctions();
			case CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.SERVICE_CATEGORY__KIND:
				return getKind();
			case CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES:
				return getPricingStructures();
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
			case CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS:
				getSPAccountingFunctions().clear();
				getSPAccountingFunctions().addAll((Collection<? extends SDPAccountingFunction>)newValue);
				return;
			case CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.SERVICE_CATEGORY__KIND:
				setKind((ServiceKind)newValue);
				return;
			case CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES:
				getPricingStructures().clear();
				getPricingStructures().addAll((Collection<? extends PricingStructure>)newValue);
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
			case CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS:
				getSPAccountingFunctions().clear();
				return;
			case CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.SERVICE_CATEGORY__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES:
				getPricingStructures().clear();
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
			case CustomersPackage.SERVICE_CATEGORY__SP_ACCOUNTING_FUNCTIONS:
				return spAccountingFunctions != null && !spAccountingFunctions.isEmpty();
			case CustomersPackage.SERVICE_CATEGORY__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case CustomersPackage.SERVICE_CATEGORY__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.SERVICE_CATEGORY__KIND:
				return kind != KIND_EDEFAULT;
			case CustomersPackage.SERVICE_CATEGORY__PRICING_STRUCTURES:
				return pricingStructures != null && !pricingStructures.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ServiceCategoryImpl
