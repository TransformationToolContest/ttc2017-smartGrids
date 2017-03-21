/**
 */
package CIM.IEC61968.Customers.impl;

import CIM.IEC61968.Common.Status;

import CIM.IEC61968.Common.impl.OrganisationImpl;

import CIM.IEC61968.Customers.Customer;
import CIM.IEC61968.Customers.CustomerAgreement;
import CIM.IEC61968.Customers.CustomerKind;
import CIM.IEC61968.Customers.CustomersPackage;

import CIM.IEC61968.Metering.EndDeviceAsset;
import CIM.IEC61968.Metering.MeteringPackage;

import CIM.IEC61968.Work.Work;
import CIM.IEC61968.Work.WorkPackage;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.OutageNotification;
import CIM.IEC61970.Informative.InfOperations.PlannedOutage;
import CIM.IEC61970.Informative.InfOperations.TroubleTicket;

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
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getPlannedOutage <em>Planned Outage</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getEndDeviceAssets <em>End Device Assets</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getErpPersons <em>Erp Persons</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getOutageNotifications <em>Outage Notifications</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getPucNumber <em>Puc Number</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link CIM.IEC61968.Customers.impl.CustomerImpl#isVip <em>Vip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends OrganisationImpl implements Customer {
	/**
	 * The cached value of the '{@link #getPlannedOutage() <em>Planned Outage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedOutage()
	 * @generated
	 * @ordered
	 */
	protected PlannedOutage plannedOutage;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final CustomerKind KIND_EDEFAULT = CustomerKind.RESIDENTIAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CustomerKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTroubleTickets() <em>Trouble Tickets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTroubleTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<TroubleTicket> troubleTickets;

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
	 * The cached value of the '{@link #getOutageNotifications() <em>Outage Notifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageNotification> outageNotifications;

	/**
	 * The default value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNeed()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_NEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialNeed() <em>Special Need</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialNeed()
	 * @generated
	 * @ordered
	 */
	protected String specialNeed = SPECIAL_NEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPucNumber() <em>Puc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPucNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PUC_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPucNumber() <em>Puc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPucNumber()
	 * @generated
	 * @ordered
	 */
	protected String pucNumber = PUC_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

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
	 * The default value of the '{@link #isVip() <em>Vip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVip() <em>Vip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVip()
	 * @generated
	 * @ordered
	 */
	protected boolean vip = VIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedOutage getPlannedOutage() {
		if (plannedOutage != null && plannedOutage.eIsProxy()) {
			InternalEObject oldPlannedOutage = (InternalEObject)plannedOutage;
			plannedOutage = (PlannedOutage)eResolveProxy(oldPlannedOutage);
			if (plannedOutage != oldPlannedOutage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.CUSTOMER__PLANNED_OUTAGE, oldPlannedOutage, plannedOutage));
			}
		}
		return plannedOutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlannedOutage basicGetPlannedOutage() {
		return plannedOutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedOutage(PlannedOutage newPlannedOutage, NotificationChain msgs) {
		PlannedOutage oldPlannedOutage = plannedOutage;
		plannedOutage = newPlannedOutage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER__PLANNED_OUTAGE, oldPlannedOutage, newPlannedOutage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedOutage(PlannedOutage newPlannedOutage) {
		if (newPlannedOutage != plannedOutage) {
			NotificationChain msgs = null;
			if (plannedOutage != null)
				msgs = ((InternalEObject)plannedOutage).eInverseRemove(this, InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS, PlannedOutage.class, msgs);
			if (newPlannedOutage != null)
				msgs = ((InternalEObject)newPlannedOutage).eInverseAdd(this, InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS, PlannedOutage.class, msgs);
			msgs = basicSetPlannedOutage(newPlannedOutage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER__PLANNED_OUTAGE, newPlannedOutage, newPlannedOutage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceAsset> getEndDeviceAssets() {
		if (endDeviceAssets == null) {
			endDeviceAssets = new EObjectWithInverseResolvingEList<EndDeviceAsset>(EndDeviceAsset.class, this, CustomersPackage.CUSTOMER__END_DEVICE_ASSETS, MeteringPackage.END_DEVICE_ASSET__CUSTOMER);
		}
		return endDeviceAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomersPackage.CUSTOMER__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CustomerKind newKind) {
		CustomerKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TroubleTicket> getTroubleTickets() {
		if (troubleTickets == null) {
			troubleTickets = new EObjectWithInverseResolvingEList<TroubleTicket>(TroubleTicket.class, this, CustomersPackage.CUSTOMER__TROUBLE_TICKETS, InfOperationsPackage.TROUBLE_TICKET__CUSTOMER_DATA);
		}
		return troubleTickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErpPerson> getErpPersons() {
		if (erpPersons == null) {
			erpPersons = new EObjectWithInverseResolvingEList<ErpPerson>(ErpPerson.class, this, CustomersPackage.CUSTOMER__ERP_PERSONS, InfERPSupportPackage.ERP_PERSON__CUSTOMER_DATA);
		}
		return erpPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageNotification> getOutageNotifications() {
		if (outageNotifications == null) {
			outageNotifications = new EObjectWithInverseResolvingEList.ManyInverse<OutageNotification>(OutageNotification.class, this, CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS, InfOperationsPackage.OUTAGE_NOTIFICATION__CUSTOMER_DATAS);
		}
		return outageNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecialNeed() {
		return specialNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialNeed(String newSpecialNeed) {
		String oldSpecialNeed = specialNeed;
		specialNeed = newSpecialNeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER__SPECIAL_NEED, oldSpecialNeed, specialNeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPucNumber() {
		return pucNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPucNumber(String newPucNumber) {
		String oldPucNumber = pucNumber;
		pucNumber = newPucNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER__PUC_NUMBER, oldPucNumber, pucNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new EObjectWithInverseResolvingEList.ManyInverse<Work>(Work.class, this, CustomersPackage.CUSTOMER__WORKS, WorkPackage.WORK__CUSTOMERS);
		}
		return works;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new EObjectWithInverseResolvingEList<CustomerAgreement>(CustomerAgreement.class, this, CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS, CustomersPackage.CUSTOMER_AGREEMENT__CUSTOMER);
		}
		return customerAgreements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVip() {
		return vip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVip(boolean newVip) {
		boolean oldVip = vip;
		vip = newVip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomersPackage.CUSTOMER__VIP, oldVip, vip));
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
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				if (plannedOutage != null)
					msgs = ((InternalEObject)plannedOutage).eInverseRemove(this, InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS, PlannedOutage.class, msgs);
				return basicSetPlannedOutage((PlannedOutage)otherEnd, msgs);
			case CustomersPackage.CUSTOMER__END_DEVICE_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceAssets()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTroubleTickets()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getErpPersons()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageNotifications()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__WORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorks()).basicAdd(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
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
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				return basicSetPlannedOutage(null, msgs);
			case CustomersPackage.CUSTOMER__END_DEVICE_ASSETS:
				return ((InternalEList<?>)getEndDeviceAssets()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				return ((InternalEList<?>)getTroubleTickets()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				return ((InternalEList<?>)getErpPersons()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				return ((InternalEList<?>)getOutageNotifications()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
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
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				if (resolve) return getPlannedOutage();
				return basicGetPlannedOutage();
			case CustomersPackage.CUSTOMER__END_DEVICE_ASSETS:
				return getEndDeviceAssets();
			case CustomersPackage.CUSTOMER__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CustomersPackage.CUSTOMER__KIND:
				return getKind();
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				return getTroubleTickets();
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				return getErpPersons();
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				return getOutageNotifications();
			case CustomersPackage.CUSTOMER__SPECIAL_NEED:
				return getSpecialNeed();
			case CustomersPackage.CUSTOMER__PUC_NUMBER:
				return getPucNumber();
			case CustomersPackage.CUSTOMER__WORKS:
				return getWorks();
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case CustomersPackage.CUSTOMER__VIP:
				return isVip();
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
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				setPlannedOutage((PlannedOutage)newValue);
				return;
			case CustomersPackage.CUSTOMER__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
				getEndDeviceAssets().addAll((Collection<? extends EndDeviceAsset>)newValue);
				return;
			case CustomersPackage.CUSTOMER__STATUS:
				setStatus((Status)newValue);
				return;
			case CustomersPackage.CUSTOMER__KIND:
				setKind((CustomerKind)newValue);
				return;
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				getTroubleTickets().addAll((Collection<? extends TroubleTicket>)newValue);
				return;
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				getErpPersons().clear();
				getErpPersons().addAll((Collection<? extends ErpPerson>)newValue);
				return;
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				getOutageNotifications().clear();
				getOutageNotifications().addAll((Collection<? extends OutageNotification>)newValue);
				return;
			case CustomersPackage.CUSTOMER__SPECIAL_NEED:
				setSpecialNeed((String)newValue);
				return;
			case CustomersPackage.CUSTOMER__PUC_NUMBER:
				setPucNumber((String)newValue);
				return;
			case CustomersPackage.CUSTOMER__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
				return;
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case CustomersPackage.CUSTOMER__VIP:
				setVip((Boolean)newValue);
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
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				setPlannedOutage((PlannedOutage)null);
				return;
			case CustomersPackage.CUSTOMER__END_DEVICE_ASSETS:
				getEndDeviceAssets().clear();
				return;
			case CustomersPackage.CUSTOMER__STATUS:
				setStatus((Status)null);
				return;
			case CustomersPackage.CUSTOMER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				getTroubleTickets().clear();
				return;
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				getErpPersons().clear();
				return;
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				getOutageNotifications().clear();
				return;
			case CustomersPackage.CUSTOMER__SPECIAL_NEED:
				setSpecialNeed(SPECIAL_NEED_EDEFAULT);
				return;
			case CustomersPackage.CUSTOMER__PUC_NUMBER:
				setPucNumber(PUC_NUMBER_EDEFAULT);
				return;
			case CustomersPackage.CUSTOMER__WORKS:
				getWorks().clear();
				return;
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case CustomersPackage.CUSTOMER__VIP:
				setVip(VIP_EDEFAULT);
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
			case CustomersPackage.CUSTOMER__PLANNED_OUTAGE:
				return plannedOutage != null;
			case CustomersPackage.CUSTOMER__END_DEVICE_ASSETS:
				return endDeviceAssets != null && !endDeviceAssets.isEmpty();
			case CustomersPackage.CUSTOMER__STATUS:
				return status != null;
			case CustomersPackage.CUSTOMER__KIND:
				return kind != KIND_EDEFAULT;
			case CustomersPackage.CUSTOMER__TROUBLE_TICKETS:
				return troubleTickets != null && !troubleTickets.isEmpty();
			case CustomersPackage.CUSTOMER__ERP_PERSONS:
				return erpPersons != null && !erpPersons.isEmpty();
			case CustomersPackage.CUSTOMER__OUTAGE_NOTIFICATIONS:
				return outageNotifications != null && !outageNotifications.isEmpty();
			case CustomersPackage.CUSTOMER__SPECIAL_NEED:
				return SPECIAL_NEED_EDEFAULT == null ? specialNeed != null : !SPECIAL_NEED_EDEFAULT.equals(specialNeed);
			case CustomersPackage.CUSTOMER__PUC_NUMBER:
				return PUC_NUMBER_EDEFAULT == null ? pucNumber != null : !PUC_NUMBER_EDEFAULT.equals(pucNumber);
			case CustomersPackage.CUSTOMER__WORKS:
				return works != null && !works.isEmpty();
			case CustomersPackage.CUSTOMER__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case CustomersPackage.CUSTOMER__VIP:
				return vip != VIP_EDEFAULT;
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
		result.append(", specialNeed: ");
		result.append(specialNeed);
		result.append(", pucNumber: ");
		result.append(pucNumber);
		result.append(", vip: ");
		result.append(vip);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
