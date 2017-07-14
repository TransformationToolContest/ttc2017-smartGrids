/**
 */
package gluemodel.CIM.IEC61968.Customers.impl;

import gluemodel.CIM.IEC61968.Common.impl.LocationImpl;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;
import gluemodel.CIM.IEC61968.Customers.ServiceLocation;

import gluemodel.CIM.IEC61968.Metering.EndDeviceAsset;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ServiceDeliveryPoint;

import gluemodel.CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import gluemodel.CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

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
 * An implementation of the model object '<em><b>Service Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl#isNeedsInspection <em>Needs Inspection</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl#getServiceDeliveryPoints <em>Service Delivery Points</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl#getSiteAccessProblem <em>Site Access Problem</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Customers.impl.ServiceLocationImpl#getEndDeviceAssets <em>End Device Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLocationImpl extends LocationImpl implements ServiceLocation {
	/**
	 * The default value of the '{@link #isNeedsInspection() <em>Needs Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsInspection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_INSPECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsInspection() <em>Needs Inspection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsInspection()
	 * @generated
	 * @ordered
	 */
	protected boolean needsInspection = NEEDS_INSPECTION_EDEFAULT;

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
	 * The cached value of the '{@link #getErpPersons() <em>Erp Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<ErpPerson> erpPersons;

	/**
	 * The default value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected String accessMethod = ACCESS_METHOD_EDEFAULT;

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
	 * The default value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAccessProblem()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_ACCESS_PROBLEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteAccessProblem() <em>Site Access Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAccessProblem()
	 * @generated
	 * @ordered
	 */
	protected String siteAccessProblem = SITE_ACCESS_PROBLEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndDeviceAssets() <em>End Device Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceAsset> endDeviceAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.SERVICE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsInspection() {
		return needsInspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsInspection(boolean newNeedsInspection) {
		boolean oldNeedsInspection = needsInspection;
		needsInspection = newNeedsInspection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION, oldNeedsInspection, needsInspection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDeliveryPoint> getServiceDeliveryPoints() {
		if (serviceDeliveryPoints == null) {
			serviceDeliveryPoints = new EObjectWithInverseResolvingEList<ServiceDeliveryPoint>(ServiceDeliveryPoint.class, this, CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS, MeteringPackage.SERVICE_DELIVERY_POINT__SERVICE_LOCATION);
		}
		return serviceDeliveryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new EObjectWithInverseResolvingEList<ErpPerson>(ErpPerson.class, this, CustomersPackage.SERVICE_LOCATION__ERP_PERSONS, InfERPSupportPackage.ERP_PERSON__SERVICE_LOCATION);
		}
		return erpPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessMethod() {
		return accessMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMethod(String newAccessMethod) {
		String oldAccessMethod = accessMethod;
		accessMethod = newAccessMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD, oldAccessMethod, accessMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new EObjectWithInverseResolvingEList.ManyInverse<CustomerAgreement>(CustomerAgreement.class, this, CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS, CustomersPackage.CUSTOMER_AGREEMENT__SERVICE_LOCATIONS);
		}
		return customerAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteAccessProblem() {
		return siteAccessProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteAccessProblem(String newSiteAccessProblem) {
		String oldSiteAccessProblem = siteAccessProblem;
		siteAccessProblem = newSiteAccessProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM, oldSiteAccessProblem, siteAccessProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceAsset> getEndDeviceAssets() {
		if (endDeviceAssets == null) {
			endDeviceAssets = new EObjectWithInverseResolvingEList<EndDeviceAsset>(EndDeviceAsset.class, this, CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS, MeteringPackage.END_DEVICE_ASSET__SERVICE_LOCATION);
		}
		return endDeviceAssets;
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
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServiceDeliveryPoints()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceAssets()).basicAdd(otherEnd, msgs);
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
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				return ((InternalEList<?>)getServiceDeliveryPoints()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS:
				return ((InternalEList<?>)getEndDeviceAssets()).basicRemove(otherEnd, msgs);
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
			case CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
				return isNeedsInspection();
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				return getServiceDeliveryPoints();
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				return getErpPersons();
			case CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD:
				return getAccessMethod();
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
				return getSiteAccessProblem();
			case CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS:
				return getEndDeviceAssets();
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
			case CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
				setNeedsInspection((Boolean)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				getServiceDeliveryPoints().addAll((Collection<? extends ServiceDeliveryPoint>)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD:
				setAccessMethod((String)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
				setSiteAccessProblem((String)newValue);
				return;
			case CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
				getEndDeviceAssets().addAll((Collection<? extends EndDeviceAsset>)newValue);
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
			case CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
				setNeedsInspection(NEEDS_INSPECTION_EDEFAULT);
				return;
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				getServiceDeliveryPoints().clear();
				return;
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD:
				setAccessMethod(ACCESS_METHOD_EDEFAULT);
				return;
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
				setSiteAccessProblem(SITE_ACCESS_PROBLEM_EDEFAULT);
				return;
			case CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
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
			case CustomersPackage.SERVICE_LOCATION__NEEDS_INSPECTION:
				return needsInspection != NEEDS_INSPECTION_EDEFAULT;
			case CustomersPackage.SERVICE_LOCATION__SERVICE_DELIVERY_POINTS:
				return serviceDeliveryPoints != null && !serviceDeliveryPoints.isEmpty();
			case CustomersPackage.SERVICE_LOCATION__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case CustomersPackage.SERVICE_LOCATION__ACCESS_METHOD:
				return ACCESS_METHOD_EDEFAULT == null ? accessMethod != null : !ACCESS_METHOD_EDEFAULT.equals(accessMethod);
			case CustomersPackage.SERVICE_LOCATION__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.SERVICE_LOCATION__SITE_ACCESS_PROBLEM:
				return SITE_ACCESS_PROBLEM_EDEFAULT == null ? siteAccessProblem != null : !SITE_ACCESS_PROBLEM_EDEFAULT.equals(siteAccessProblem);
			case CustomersPackage.SERVICE_LOCATION__END_DEVICE_ASSETS:
				return endDeviceAssets != null && !endDeviceAssets.isEmpty();
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
		result.append(" (needsInspection: ");
		result.append(needsInspection);
		result.append(", accessMethod: ");
		result.append(accessMethod);
		result.append(", siteAccessProblem: ");
		result.append(siteAccessProblem);
		result.append(')');
		return result.toString();
	}

} //ServiceLocationImpl
