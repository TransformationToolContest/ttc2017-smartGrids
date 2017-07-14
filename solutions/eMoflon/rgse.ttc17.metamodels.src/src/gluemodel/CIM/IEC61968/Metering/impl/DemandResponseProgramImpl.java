/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Common.DateTimeInterval;

import gluemodel.CIM.IEC61968.Customers.CustomerAgreement;
import gluemodel.CIM.IEC61968.Customers.CustomersPackage;

import gluemodel.CIM.IEC61968.Metering.DemandResponseProgram;
import gluemodel.CIM.IEC61968.Metering.EndDeviceControl;
import gluemodel.CIM.IEC61968.Metering.EndDeviceGroup;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

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
 * An implementation of the model object '<em><b>Demand Response Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl#getValidityInterval <em>Validity Interval</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl#getEndDeviceGroups <em>End Device Groups</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.DemandResponseProgramImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemandResponseProgramImpl extends IdentifiedObjectImpl implements DemandResponseProgram {
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
	 * The cached value of the '{@link #getValidityInterval() <em>Validity Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityInterval()
	 * @generated
	 * @ordered
	 */
	protected DateTimeInterval validityInterval;

	/**
	 * The cached value of the '{@link #getEndDeviceGroups() <em>End Device Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceGroup> endDeviceGroups;

	/**
	 * The cached value of the '{@link #getEndDeviceControls() <em>End Device Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceControl> endDeviceControls;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemandResponseProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.DEMAND_RESPONSE_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerAgreement> getCustomerAgreements() {
		if (customerAgreements == null) {
			customerAgreements = new EObjectWithInverseResolvingEList<CustomerAgreement>(CustomerAgreement.class, this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS, CustomersPackage.CUSTOMER_AGREEMENT__DEMAND_RESPONSE_PROGRAM);
		}
		return customerAgreements;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, oldValidityInterval, validityInterval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL, oldValidityInterval, validityInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceGroup> getEndDeviceGroups() {
		if (endDeviceGroups == null) {
			endDeviceGroups = new EObjectWithInverseResolvingEList<EndDeviceGroup>(EndDeviceGroup.class, this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS, MeteringPackage.END_DEVICE_GROUP__DEMAND_RESPONSE_PROGRAM);
		}
		return endDeviceGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceControl> getEndDeviceControls() {
		if (endDeviceControls == null) {
			endDeviceControls = new EObjectWithInverseResolvingEList<EndDeviceControl>(EndDeviceControl.class, this, MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS, MeteringPackage.END_DEVICE_CONTROL__DEMAND_RESPONSE_PROGRAM);
		}
		return endDeviceControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE, oldType, type));
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomerAgreements()).basicAdd(otherEnd, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceGroups()).basicAdd(otherEnd, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceControls()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				return ((InternalEList<?>)getCustomerAgreements()).basicRemove(otherEnd, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				return ((InternalEList<?>)getEndDeviceGroups()).basicRemove(otherEnd, msgs);
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				return ((InternalEList<?>)getEndDeviceControls()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				return getCustomerAgreements();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				if (resolve) return getValidityInterval();
				return basicGetValidityInterval();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				return getEndDeviceGroups();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				return getEndDeviceControls();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
				return getType();
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				getCustomerAgreements().addAll((Collection<? extends CustomerAgreement>)newValue);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)newValue);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				getEndDeviceGroups().clear();
				getEndDeviceGroups().addAll((Collection<? extends EndDeviceGroup>)newValue);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				getEndDeviceControls().addAll((Collection<? extends EndDeviceControl>)newValue);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
				setType((String)newValue);
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				getCustomerAgreements().clear();
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				setValidityInterval((DateTimeInterval)null);
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				getEndDeviceGroups().clear();
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				getEndDeviceControls().clear();
				return;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__CUSTOMER_AGREEMENTS:
				return customerAgreements != null && !customerAgreements.isEmpty();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__VALIDITY_INTERVAL:
				return validityInterval != null;
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_GROUPS:
				return endDeviceGroups != null && !endDeviceGroups.isEmpty();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__END_DEVICE_CONTROLS:
				return endDeviceControls != null && !endDeviceControls.isEmpty();
			case MeteringPackage.DEMAND_RESPONSE_PROGRAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DemandResponseProgramImpl
