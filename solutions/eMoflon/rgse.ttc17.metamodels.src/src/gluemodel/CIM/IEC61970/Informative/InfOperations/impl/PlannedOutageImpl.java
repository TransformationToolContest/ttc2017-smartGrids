/**
 */
package gluemodel.CIM.IEC61970.Informative.InfOperations.impl;

import gluemodel.CIM.IEC61968.Common.impl.DocumentImpl;

import gluemodel.CIM.IEC61968.Customers.Customer;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.OutageKind;
import gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage;

import gluemodel.CIM.IEC61970.Outage.OutagePackage;
import gluemodel.CIM.IEC61970.Outage.OutageSchedule;

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
 * An implementation of the model object '<em><b>Planned Outage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PlannedOutageImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PlannedOutageImpl#getCustomerDatas <em>Customer Datas</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfOperations.impl.PlannedOutageImpl#getOutageSchedules <em>Outage Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlannedOutageImpl extends DocumentImpl implements PlannedOutage {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final OutageKind KIND_EDEFAULT = OutageKind.FORCED;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected OutageKind kind = KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getOutageSchedules() <em>Outage Schedules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageSchedule> outageSchedules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedOutageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.PLANNED_OUTAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(OutageKind newKind) {
		OutageKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.PLANNED_OUTAGE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customer> getCustomerDatas() {
		if (customerDatas == null) {
			customerDatas = new EObjectWithInverseResolvingEList<Customer>(Customer.class, this, InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS, CustomersPackage.CUSTOMER__PLANNED_OUTAGE);
		}
		return customerDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageSchedule> getOutageSchedules() {
		if (outageSchedules == null) {
			outageSchedules = new EObjectWithInverseResolvingEList<OutageSchedule>(OutageSchedule.class, this, InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES, OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE);
		}
		return outageSchedules;
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
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerDatas()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageSchedules()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				return ((InternalEList<?>)getCustomerDatas()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				return ((InternalEList<?>)getOutageSchedules()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.PLANNED_OUTAGE__KIND:
				return getKind();
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				return getCustomerDatas();
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				return getOutageSchedules();
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
			case InfOperationsPackage.PLANNED_OUTAGE__KIND:
				setKind((OutageKind)newValue);
				return;
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				getCustomerDatas().clear();
				getCustomerDatas().addAll((Collection<? extends Customer>)newValue);
				return;
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				getOutageSchedules().clear();
				getOutageSchedules().addAll((Collection<? extends OutageSchedule>)newValue);
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
			case InfOperationsPackage.PLANNED_OUTAGE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				getCustomerDatas().clear();
				return;
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				getOutageSchedules().clear();
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
			case InfOperationsPackage.PLANNED_OUTAGE__KIND:
				return kind != KIND_EDEFAULT;
			case InfOperationsPackage.PLANNED_OUTAGE__CUSTOMER_DATAS:
				return customerDatas != null && !customerDatas.isEmpty();
			case InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES:
				return outageSchedules != null && !outageSchedules.isEmpty();
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

} //PlannedOutageImpl
