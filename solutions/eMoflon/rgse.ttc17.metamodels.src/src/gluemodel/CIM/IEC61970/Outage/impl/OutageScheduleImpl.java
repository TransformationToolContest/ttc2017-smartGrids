/**
 */
package gluemodel.CIM.IEC61970.Outage.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import gluemodel.CIM.IEC61970.Core.impl.IrregularIntervalScheduleImpl;

import gluemodel.CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import gluemodel.CIM.IEC61970.Informative.InfOperations.PlannedOutage;

import gluemodel.CIM.IEC61970.Outage.OutagePackage;
import gluemodel.CIM.IEC61970.Outage.OutageSchedule;
import gluemodel.CIM.IEC61970.Outage.SwitchingOperation;

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
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Outage.impl.OutageScheduleImpl#getPlannedOutage <em>Planned Outage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Outage.impl.OutageScheduleImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Outage.impl.OutageScheduleImpl#getSwitchingOperations <em>Switching Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageScheduleImpl extends IrregularIntervalScheduleImpl implements OutageSchedule {
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
	 * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystemResource()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource powerSystemResource;

	/**
	 * The cached value of the '{@link #getSwitchingOperations() <em>Switching Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingOperation> switchingOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePackage.Literals.OUTAGE_SCHEDULE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE, oldPlannedOutage, plannedOutage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE, oldPlannedOutage, newPlannedOutage);
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
				msgs = ((InternalEObject)plannedOutage).eInverseRemove(this, InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES, PlannedOutage.class, msgs);
			if (newPlannedOutage != null)
				msgs = ((InternalEObject)newPlannedOutage).eInverseAdd(this, InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES, PlannedOutage.class, msgs);
			msgs = basicSetPlannedOutage(newPlannedOutage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE, newPlannedOutage, newPlannedOutage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource getPowerSystemResource() {
		if (powerSystemResource != null && powerSystemResource.eIsProxy()) {
			InternalEObject oldPowerSystemResource = (InternalEObject)powerSystemResource;
			powerSystemResource = (PowerSystemResource)eResolveProxy(oldPowerSystemResource);
			if (powerSystemResource != oldPowerSystemResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, powerSystemResource));
			}
		}
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetPowerSystemResource() {
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSystemResource(PowerSystemResource newPowerSystemResource, NotificationChain msgs) {
		PowerSystemResource oldPowerSystemResource = powerSystemResource;
		powerSystemResource = newPowerSystemResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSystemResource(PowerSystemResource newPowerSystemResource) {
		if (newPowerSystemResource != powerSystemResource) {
			NotificationChain msgs = null;
			if (powerSystemResource != null)
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE, newPowerSystemResource, newPowerSystemResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchingOperation> getSwitchingOperations() {
		if (switchingOperations == null) {
			switchingOperations = new EObjectWithInverseResolvingEList<SwitchingOperation>(SwitchingOperation.class, this, OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS, OutagePackage.SWITCHING_OPERATION__OUTAGE_SCHEDULE);
		}
		return switchingOperations;
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				if (plannedOutage != null)
					msgs = ((InternalEObject)plannedOutage).eInverseRemove(this, InfOperationsPackage.PLANNED_OUTAGE__OUTAGE_SCHEDULES, PlannedOutage.class, msgs);
				return basicSetPlannedOutage((PlannedOutage)otherEnd, msgs);
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__OUTAGE_SCHEDULE, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSwitchingOperations()).basicAdd(otherEnd, msgs);
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				return basicSetPlannedOutage(null, msgs);
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				return ((InternalEList<?>)getSwitchingOperations()).basicRemove(otherEnd, msgs);
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				if (resolve) return getPlannedOutage();
				return basicGetPlannedOutage();
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				return getSwitchingOperations();
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				setPlannedOutage((PlannedOutage)newValue);
				return;
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
				return;
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				getSwitchingOperations().clear();
				getSwitchingOperations().addAll((Collection<? extends SwitchingOperation>)newValue);
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				setPlannedOutage((PlannedOutage)null);
				return;
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
				return;
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				getSwitchingOperations().clear();
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
			case OutagePackage.OUTAGE_SCHEDULE__PLANNED_OUTAGE:
				return plannedOutage != null;
			case OutagePackage.OUTAGE_SCHEDULE__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
			case OutagePackage.OUTAGE_SCHEDULE__SWITCHING_OPERATIONS:
				return switchingOperations != null && !switchingOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutageScheduleImpl
