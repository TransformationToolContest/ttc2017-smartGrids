/**
 */
package CIM.IEC61970.Core.impl;

import CIM.IEC61970.Core.BaseVoltage;
import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.PhaseCode;
import CIM.IEC61970.Core.Terminal;

import CIM.IEC61970.Informative.InfAssets.ElectricalAsset;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfOperations.InfOperationsPackage;
import CIM.IEC61970.Informative.InfOperations.OutageStepPsrRole;

import CIM.IEC61970.Outage.ClearanceTag;
import CIM.IEC61970.Outage.OutagePackage;

import CIM.IEC61970.Protection.ProtectionEquipment;
import CIM.IEC61970.Protection.ProtectionPackage;

import CIM.IEC61970.StateVariables.StateVariablesPackage;
import CIM.IEC61970.StateVariables.SvStatus;

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
 * An implementation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Core.impl.ConductingEquipmentImpl#getProtectionEquipments <em>Protection Equipments</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConductingEquipmentImpl#getOutageStepRoles <em>Outage Step Roles</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConductingEquipmentImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConductingEquipmentImpl#getClearanceTags <em>Clearance Tags</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConductingEquipmentImpl#getSvStatus <em>Sv Status</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConductingEquipmentImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConductingEquipmentImpl#getElectricalAssets <em>Electrical Assets</em>}</li>
 *   <li>{@link CIM.IEC61970.Core.impl.ConductingEquipmentImpl#getTerminals <em>Terminals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductingEquipmentImpl extends EquipmentImpl implements ConductingEquipment {
	/**
	 * The cached value of the '{@link #getProtectionEquipments() <em>Protection Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionEquipment> protectionEquipments;

	/**
	 * The cached value of the '{@link #getOutageStepRoles() <em>Outage Step Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutageStepRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<OutageStepPsrRole> outageStepRoles;

	/**
	 * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseVoltage()
	 * @generated
	 * @ordered
	 */
	protected BaseVoltage baseVoltage;

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
	 * The cached value of the '{@link #getSvStatus() <em>Sv Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvStatus()
	 * @generated
	 * @ordered
	 */
	protected SvStatus svStatus;

	/**
	 * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.ABC;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected PhaseCode phases = PHASES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectricalAssets() <em>Electrical Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricalAsset> electricalAssets;

	/**
	 * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminals()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductingEquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONDUCTING_EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionEquipment> getProtectionEquipments() {
		if (protectionEquipments == null) {
			protectionEquipments = new EObjectWithInverseResolvingEList.ManyInverse<ProtectionEquipment>(ProtectionEquipment.class, this, CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS, ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS);
		}
		return protectionEquipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutageStepPsrRole> getOutageStepRoles() {
		if (outageStepRoles == null) {
			outageStepRoles = new EObjectWithInverseResolvingEList<OutageStepPsrRole>(OutageStepPsrRole.class, this, CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES, InfOperationsPackage.OUTAGE_STEP_PSR_ROLE__CONDUCTING_EQUIPMENT);
		}
		return outageStepRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage getBaseVoltage() {
		if (baseVoltage != null && baseVoltage.eIsProxy()) {
			InternalEObject oldBaseVoltage = (InternalEObject)baseVoltage;
			baseVoltage = (BaseVoltage)eResolveProxy(oldBaseVoltage);
			if (baseVoltage != oldBaseVoltage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, oldBaseVoltage, baseVoltage));
			}
		}
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage basicGetBaseVoltage() {
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseVoltage(BaseVoltage newBaseVoltage, NotificationChain msgs) {
		BaseVoltage oldBaseVoltage = baseVoltage;
		baseVoltage = newBaseVoltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseVoltage(BaseVoltage newBaseVoltage) {
		if (newBaseVoltage != baseVoltage) {
			NotificationChain msgs = null;
			if (baseVoltage != null)
				msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
			if (newBaseVoltage != null)
				msgs = ((InternalEObject)newBaseVoltage).eInverseAdd(this, CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
			msgs = basicSetBaseVoltage(newBaseVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClearanceTag> getClearanceTags() {
		if (clearanceTags == null) {
			clearanceTags = new EObjectWithInverseResolvingEList<ClearanceTag>(ClearanceTag.class, this, CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS, OutagePackage.CLEARANCE_TAG__CONDUCTING_EQUIPMENT);
		}
		return clearanceTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvStatus getSvStatus() {
		if (svStatus != null && svStatus.eIsProxy()) {
			InternalEObject oldSvStatus = (InternalEObject)svStatus;
			svStatus = (SvStatus)eResolveProxy(oldSvStatus);
			if (svStatus != oldSvStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS, oldSvStatus, svStatus));
			}
		}
		return svStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvStatus basicGetSvStatus() {
		return svStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSvStatus(SvStatus newSvStatus, NotificationChain msgs) {
		SvStatus oldSvStatus = svStatus;
		svStatus = newSvStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS, oldSvStatus, newSvStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvStatus(SvStatus newSvStatus) {
		if (newSvStatus != svStatus) {
			NotificationChain msgs = null;
			if (svStatus != null)
				msgs = ((InternalEObject)svStatus).eInverseRemove(this, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs);
			if (newSvStatus != null)
				msgs = ((InternalEObject)newSvStatus).eInverseAdd(this, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs);
			msgs = basicSetSvStatus(newSvStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS, newSvStatus, newSvStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseCode getPhases() {
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhases(PhaseCode newPhases) {
		PhaseCode oldPhases = phases;
		phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDUCTING_EQUIPMENT__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalAsset> getElectricalAssets() {
		if (electricalAssets == null) {
			electricalAssets = new EObjectWithInverseResolvingEList<ElectricalAsset>(ElectricalAsset.class, this, CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS, InfAssetsPackage.ELECTRICAL_ASSET__CONDUCTING_EQUIPMENT);
		}
		return electricalAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminals() {
		if (terminals == null) {
			terminals = new EObjectWithInverseResolvingEList<Terminal>(Terminal.class, this, CorePackage.CONDUCTING_EQUIPMENT__TERMINALS, CorePackage.TERMINAL__CONDUCTING_EQUIPMENT);
		}
		return terminals;
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
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtectionEquipments()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutageStepRoles()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				if (baseVoltage != null)
					msgs = ((InternalEObject)baseVoltage).eInverseRemove(this, CorePackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs);
				return basicSetBaseVoltage((BaseVoltage)otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClearanceTags()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				if (svStatus != null)
					msgs = ((InternalEObject)svStatus).eInverseRemove(this, StateVariablesPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs);
				return basicSetSvStatus((SvStatus)otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectricalAssets()).basicAdd(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminals()).basicAdd(otherEnd, msgs);
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
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				return ((InternalEList<?>)getProtectionEquipments()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				return ((InternalEList<?>)getOutageStepRoles()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				return basicSetBaseVoltage(null, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				return ((InternalEList<?>)getClearanceTags()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				return basicSetSvStatus(null, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS:
				return ((InternalEList<?>)getElectricalAssets()).basicRemove(otherEnd, msgs);
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return ((InternalEList<?>)getTerminals()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				return getProtectionEquipments();
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				return getOutageStepRoles();
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				if (resolve) return getBaseVoltage();
				return basicGetBaseVoltage();
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				return getClearanceTags();
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				if (resolve) return getSvStatus();
				return basicGetSvStatus();
			case CorePackage.CONDUCTING_EQUIPMENT__PHASES:
				return getPhases();
			case CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS:
				return getElectricalAssets();
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return getTerminals();
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
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				getProtectionEquipments().clear();
				getProtectionEquipments().addAll((Collection<? extends ProtectionEquipment>)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				getOutageStepRoles().clear();
				getOutageStepRoles().addAll((Collection<? extends OutageStepPsrRole>)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				getClearanceTags().clear();
				getClearanceTags().addAll((Collection<? extends ClearanceTag>)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				setSvStatus((SvStatus)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__PHASES:
				setPhases((PhaseCode)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS:
				getElectricalAssets().clear();
				getElectricalAssets().addAll((Collection<? extends ElectricalAsset>)newValue);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				getTerminals().clear();
				getTerminals().addAll((Collection<? extends Terminal>)newValue);
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
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				getProtectionEquipments().clear();
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				getOutageStepRoles().clear();
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				setBaseVoltage((BaseVoltage)null);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				getClearanceTags().clear();
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				setSvStatus((SvStatus)null);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS:
				getElectricalAssets().clear();
				return;
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				getTerminals().clear();
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
			case CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS:
				return protectionEquipments != null && !protectionEquipments.isEmpty();
			case CorePackage.CONDUCTING_EQUIPMENT__OUTAGE_STEP_ROLES:
				return outageStepRoles != null && !outageStepRoles.isEmpty();
			case CorePackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
				return baseVoltage != null;
			case CorePackage.CONDUCTING_EQUIPMENT__CLEARANCE_TAGS:
				return clearanceTags != null && !clearanceTags.isEmpty();
			case CorePackage.CONDUCTING_EQUIPMENT__SV_STATUS:
				return svStatus != null;
			case CorePackage.CONDUCTING_EQUIPMENT__PHASES:
				return phases != PHASES_EDEFAULT;
			case CorePackage.CONDUCTING_EQUIPMENT__ELECTRICAL_ASSETS:
				return electricalAssets != null && !electricalAssets.isEmpty();
			case CorePackage.CONDUCTING_EQUIPMENT__TERMINALS:
				return terminals != null && !terminals.isEmpty();
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
		result.append(" (phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //ConductingEquipmentImpl
