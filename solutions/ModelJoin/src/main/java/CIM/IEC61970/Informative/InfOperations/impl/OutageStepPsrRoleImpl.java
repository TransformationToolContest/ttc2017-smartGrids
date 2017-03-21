/**
 */
package CIM.IEC61970.Informative.InfOperations.impl;

import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.CorePackage;

import CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.OutageStep;
import CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outage Step Psr Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepPsrRoleImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.OutageStepPsrRoleImpl#getOutageStep <em>Outage Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutageStepPsrRoleImpl extends RoleImpl implements OutageStepPsrRole {
	/**
	 * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipment()
	 * @generated
	 * @ordered
	 */
	protected ConductingEquipment conductingEquipment;

	/**
	 * The cached value of the '{@link #getOutageStep() <em>Outage Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageStep()
	 * @generated
	 * @ordered
	 */
	protected OutageStep outageStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutageStepPsrRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.OUTAGE_STEP_PSR_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment getConductingEquipment() {
		if (conductingEquipment != null && conductingEquipment.eIsProxy()) {
			InternalEObject oldConductingEquipment = (InternalEObject)conductingEquipment;
			conductingEquipment = (ConductingEquipment)eResolveProxy(oldConductingEquipment);
			if (conductingEquipment != oldConductingEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT, oldConductingEquipment, conductingEquipment));
			}
		}
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment basicGetConductingEquipment() {
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConductingEquipment(ConductingEquipment newConductingEquipment, NotificationChain msgs) {
		ConductingEquipment oldConductingEquipment = conductingEquipment;
		conductingEquipment = newConductingEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT, oldConductingEquipment, newConductingEquipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConductingEquipment(ConductingEquipment newConductingEquipment) {
		if (newConductingEquipment != conductingEquipment) {
			NotificationChain msgs = null;
			if (conductingEquipment != null)
				msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES, ConductingEquipment.class, msgs);
			if (newConductingEquipment != null)
				msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES, ConductingEquipment.class, msgs);
			msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT, newConductingEquipment, newConductingEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageStep getOutageStep() {
		if (outageStep != null && outageStep.eIsProxy()) {
			InternalEObject oldOutageStep = (InternalEObject)outageStep;
			outageStep = (OutageStep)eResolveProxy(oldOutageStep);
			if (outageStep != oldOutageStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP, oldOutageStep, outageStep));
			}
		}
		return outageStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutageStep basicGetOutageStep() {
		return outageStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutageStep(OutageStep newOutageStep, NotificationChain msgs) {
		OutageStep oldOutageStep = outageStep;
		outageStep = newOutageStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP, oldOutageStep, newOutageStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutageStep(OutageStep newOutageStep) {
		if (newOutageStep != outageStep) {
			NotificationChain msgs = null;
			if (outageStep != null)
				msgs = ((InternalEObject)outageStep).eInverseRemove(this, InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES, OutageStep.class, msgs);
			if (newOutageStep != null)
				msgs = ((InternalEObject)newOutageStep).eInverseAdd(this, InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES, OutageStep.class, msgs);
			msgs = basicSetOutageStep(newOutageStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP, newOutageStep, newOutageStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				if (conductingEquipment != null)
					msgs = ((InternalEObject)conductingEquipment).eInverseRemove(this, CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES, ConductingEquipment.class, msgs);
				return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				if (outageStep != null)
					msgs = ((InternalEObject)outageStep).eInverseRemove(this, InfOperationsPackage.OUTAGE_STEP__CONDUCTING_EQUIPMENT_ROLES, OutageStep.class, msgs);
				return basicSetOutageStep((OutageStep)otherEnd, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				return basicSetConductingEquipment(null, msgs);
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				return basicSetOutageStep(null, msgs);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				if (resolve) return getConductingEquipment();
				return basicGetConductingEquipment();
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				if (resolve) return getOutageStep();
				return basicGetOutageStep();
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)newValue);
				return;
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				setOutageStep((OutageStep)newValue);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				setConductingEquipment((ConductingEquipment)null);
				return;
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				setOutageStep((OutageStep)null);
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
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT:
				return conductingEquipment != null;
			case InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__OUTAGE_STEP:
				return outageStep != null;
		}
		return super.eIsSet(featureID);
	}

} //OutageStepPsrRoleImpl
