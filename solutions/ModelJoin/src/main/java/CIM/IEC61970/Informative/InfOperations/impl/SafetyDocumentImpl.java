/**
 */
package CIM.IEC61970.Informative.InfOperations.impl;

import CIM.IEC61968.Common.impl.DocumentImpl;

import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.SafetyDocument;
import CIM.IEC61970.Informative.InfOperations.SwitchingStep;

import CIM.IEC61970.Outage.ClearanceTag;
import CIM.IEC61970.Outage.OutagePackage;

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
 * An implementation of the model object '<em><b>Safety Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.SafetyDocumentImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.SafetyDocumentImpl#getClearanceTags <em>Clearance Tags</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.SafetyDocumentImpl#getScheduleSteps <em>Schedule Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyDocumentImpl extends DocumentImpl implements SafetyDocument {
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
	 * The cached value of the '{@link #getClearanceTags() <em>Clearance Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearanceTags()
	 * @generated
	 * @ordered
	 */
	protected EList<ClearanceTag> clearanceTags;

	/**
	 * The cached value of the '{@link #getScheduleSteps() <em>Schedule Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchingStep> scheduleSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.SAFETY_DOCUMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, powerSystemResource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource);
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
				msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS, PowerSystemResource.class, msgs);
			if (newPowerSystemResource != null)
				msgs = ((InternalEObject)newPowerSystemResource).eInverseAdd(this, CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS, PowerSystemResource.class, msgs);
			msgs = basicSetPowerSystemResource(newPowerSystemResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE, newPowerSystemResource, newPowerSystemResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClearanceTag> getClearanceTags() {
		if (clearanceTags == null) {
			clearanceTags = new EObjectWithInverseResolvingEList<ClearanceTag>(ClearanceTag.class, this, InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS, OutagePackage.CLEARANCE_TAG__SAFETY_DOCUMENT);
		}
		return clearanceTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchingStep> getScheduleSteps() {
		if (scheduleSteps == null) {
			scheduleSteps = new EObjectWithInverseResolvingEList<SwitchingStep>(SwitchingStep.class, this, InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS, InfOperationsPackage.SWITCHING_STEP__SAFETY_DOCUMENT);
		}
		return scheduleSteps;
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
			case InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE:
				if (powerSystemResource != null)
					msgs = ((InternalEObject)powerSystemResource).eInverseRemove(this, CorePackage.POWER_SYSTEM_RESOURCE__SAFETY_DOCUMENTS, PowerSystemResource.class, msgs);
				return basicSetPowerSystemResource((PowerSystemResource)otherEnd, msgs);
			case InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClearanceTags()).basicAdd(otherEnd, msgs);
			case InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScheduleSteps()).basicAdd(otherEnd, msgs);
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
			case InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE:
				return basicSetPowerSystemResource(null, msgs);
			case InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS:
				return ((InternalEList<?>)getClearanceTags()).basicRemove(otherEnd, msgs);
			case InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS:
				return ((InternalEList<?>)getScheduleSteps()).basicRemove(otherEnd, msgs);
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
			case InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE:
				if (resolve) return getPowerSystemResource();
				return basicGetPowerSystemResource();
			case InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS:
				return getClearanceTags();
			case InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS:
				return getScheduleSteps();
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
			case InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)newValue);
				return;
			case InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS:
				getClearanceTags().clear();
				getClearanceTags().addAll((Collection<? extends ClearanceTag>)newValue);
				return;
			case InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS:
				getScheduleSteps().clear();
				getScheduleSteps().addAll((Collection<? extends SwitchingStep>)newValue);
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
			case InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE:
				setPowerSystemResource((PowerSystemResource)null);
				return;
			case InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS:
				getClearanceTags().clear();
				return;
			case InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS:
				getScheduleSteps().clear();
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
			case InfOperationsPackage.SAFETY_DOCUMENT__POWER_SYSTEM_RESOURCE:
				return powerSystemResource != null;
			case InfOperationsPackage.SAFETY_DOCUMENT__CLEARANCE_TAGS:
				return clearanceTags != null && !clearanceTags.isEmpty();
			case InfOperationsPackage.SAFETY_DOCUMENT__SCHEDULE_STEPS:
				return scheduleSteps != null && !scheduleSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SafetyDocumentImpl
