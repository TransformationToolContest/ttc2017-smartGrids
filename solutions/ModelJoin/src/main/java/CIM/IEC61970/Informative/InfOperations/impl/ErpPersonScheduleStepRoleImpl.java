/**
 */
package CIM.IEC61970.Informative.InfOperations.impl;

import CIM.IEC61970.Informative.InfCommon.impl.RoleImpl;

import CIM.IEC61970.Informative.InfERPSupport.ErpPerson;
import CIM.IEC61970.Informative.InfERPSupport.InfERPSupportPackage;

import CIM.IEC61970.Informative.InfOperations.ErpPersonScheduleStepRole;
import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.SwitchingStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erp Person Schedule Step Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.ErpPersonScheduleStepRoleImpl#getSwitchingStep <em>Switching Step</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfOperations.impl.ErpPersonScheduleStepRoleImpl#getErpPerson <em>Erp Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErpPersonScheduleStepRoleImpl extends RoleImpl implements ErpPersonScheduleStepRole {
	/**
	 * The cached value of the '{@link #getSwitchingStep() <em>Switching Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchingStep()
	 * @generated
	 * @ordered
	 */
	protected SwitchingStep switchingStep;

	/**
	 * The cached value of the '{@link #getErpPerson() <em>Erp Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErpPerson()
	 * @generated
	 * @ordered
	 */
	protected ErpPerson erpPerson;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErpPersonScheduleStepRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfOperationsPackage.Literals.ERP_PERSON_SCHEDULE_STEP_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingStep getSwitchingStep() {
		if (switchingStep != null && switchingStep.eIsProxy()) {
			InternalEObject oldSwitchingStep = (InternalEObject)switchingStep;
			switchingStep = (SwitchingStep)eResolveProxy(oldSwitchingStep);
			if (switchingStep != oldSwitchingStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, oldSwitchingStep, switchingStep));
			}
		}
		return switchingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchingStep basicGetSwitchingStep() {
		return switchingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchingStep(SwitchingStep newSwitchingStep, NotificationChain msgs) {
		SwitchingStep oldSwitchingStep = switchingStep;
		switchingStep = newSwitchingStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, oldSwitchingStep, newSwitchingStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchingStep(SwitchingStep newSwitchingStep) {
		if (newSwitchingStep != switchingStep) {
			NotificationChain msgs = null;
			if (switchingStep != null)
				msgs = ((InternalEObject)switchingStep).eInverseRemove(this, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, SwitchingStep.class, msgs);
			if (newSwitchingStep != null)
				msgs = ((InternalEObject)newSwitchingStep).eInverseAdd(this, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, SwitchingStep.class, msgs);
			msgs = basicSetSwitchingStep(newSwitchingStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP, newSwitchingStep, newSwitchingStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson getErpPerson() {
		if (erpPerson != null && erpPerson.eIsProxy()) {
			InternalEObject oldErpPerson = (InternalEObject)erpPerson;
			erpPerson = (ErpPerson)eResolveProxy(oldErpPerson);
			if (erpPerson != oldErpPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON, oldErpPerson, erpPerson));
			}
		}
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErpPerson basicGetErpPerson() {
		return erpPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErpPerson(ErpPerson newErpPerson, NotificationChain msgs) {
		ErpPerson oldErpPerson = erpPerson;
		erpPerson = newErpPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON, oldErpPerson, newErpPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErpPerson(ErpPerson newErpPerson) {
		if (newErpPerson != erpPerson) {
			NotificationChain msgs = null;
			if (erpPerson != null)
				msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES, ErpPerson.class, msgs);
			if (newErpPerson != null)
				msgs = ((InternalEObject)newErpPerson).eInverseAdd(this, InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES, ErpPerson.class, msgs);
			msgs = basicSetErpPerson(newErpPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON, newErpPerson, newErpPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				if (switchingStep != null)
					msgs = ((InternalEObject)switchingStep).eInverseRemove(this, InfOperationsPackage.SWITCHING_STEP__ERP_PERSON_ROLE, SwitchingStep.class, msgs);
				return basicSetSwitchingStep((SwitchingStep)otherEnd, msgs);
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				if (erpPerson != null)
					msgs = ((InternalEObject)erpPerson).eInverseRemove(this, InfERPSupportPackage.ERP_PERSON__SWITCHING_STEP_ROLES, ErpPerson.class, msgs);
				return basicSetErpPerson((ErpPerson)otherEnd, msgs);
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				return basicSetSwitchingStep(null, msgs);
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				return basicSetErpPerson(null, msgs);
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				if (resolve) return getSwitchingStep();
				return basicGetSwitchingStep();
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				if (resolve) return getErpPerson();
				return basicGetErpPerson();
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				setSwitchingStep((SwitchingStep)newValue);
				return;
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)newValue);
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				setSwitchingStep((SwitchingStep)null);
				return;
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				setErpPerson((ErpPerson)null);
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
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__SWITCHING_STEP:
				return switchingStep != null;
			case InfOperationsPackage.ERP_PERSON_SCHEDULE_STEP_ROLE__ERP_PERSON:
				return erpPerson != null;
		}
		return super.eIsSet(featureID);
	}

} //ErpPersonScheduleStepRoleImpl
