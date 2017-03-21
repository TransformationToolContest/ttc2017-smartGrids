/**
 */
package CIM.IEC61970.Protection.impl;

import CIM.IEC61970.Core.ConductingEquipment;
import CIM.IEC61970.Core.CorePackage;
import CIM.IEC61970.Core.Unit;

import CIM.IEC61970.Core.impl.EquipmentImpl;

import CIM.IEC61970.Protection.ProtectionEquipment;
import CIM.IEC61970.Protection.ProtectionPackage;

import CIM.IEC61970.Wires.ProtectedSwitch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl#getConductingEquipments <em>Conducting Equipments</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl#getHighLimit <em>High Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl#getRelayDelayTime <em>Relay Delay Time</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl#getProtectedSwitches <em>Protected Switches</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl#isPowerDirectionFlag <em>Power Direction Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.ProtectionEquipmentImpl#getLowLimit <em>Low Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionEquipmentImpl extends EquipmentImpl implements ProtectionEquipment {
	/**
	 * The cached value of the '{@link #getConductingEquipments() <em>Conducting Equipments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductingEquipments()
	 * @generated
	 * @ordered
	 */
	protected EList<ConductingEquipment> conductingEquipments;

	/**
	 * The default value of the '{@link #getHighLimit() <em>High Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighLimit() <em>High Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLimit()
	 * @generated
	 * @ordered
	 */
	protected float highLimit = HIGH_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The default value of the '{@link #getRelayDelayTime() <em>Relay Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelayDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final float RELAY_DELAY_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRelayDelayTime() <em>Relay Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelayDelayTime()
	 * @generated
	 * @ordered
	 */
	protected float relayDelayTime = RELAY_DELAY_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtectedSwitches() <em>Protected Switches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectedSwitch> protectedSwitches;

	/**
	 * The default value of the '{@link #isPowerDirectionFlag() <em>Power Direction Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPowerDirectionFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POWER_DIRECTION_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPowerDirectionFlag() <em>Power Direction Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPowerDirectionFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean powerDirectionFlag = POWER_DIRECTION_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowLimit() <em>Low Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowLimit() <em>Low Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowLimit = LOW_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionEquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtectionPackage.Literals.PROTECTION_EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConductingEquipment> getConductingEquipments() {
		if (conductingEquipments == null) {
			conductingEquipments = new EObjectWithInverseResolvingEList.ManyInverse<ConductingEquipment>(ConductingEquipment.class, this, ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS, CorePackage.CONDUCTING_EQUIPMENT__PROTECTION_EQUIPMENTS);
		}
		return conductingEquipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighLimit() {
		return highLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighLimit(float newHighLimit) {
		float oldHighLimit = highLimit;
		highLimit = newHighLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT, oldHighLimit, highLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtectionPackage.PROTECTION_EQUIPMENT__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(Unit newUnit, NotificationChain msgs) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtectionPackage.PROTECTION_EQUIPMENT__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, CorePackage.UNIT__PROTECTION_EQUIPMENTS, Unit.class, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, CorePackage.UNIT__PROTECTION_EQUIPMENTS, Unit.class, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.PROTECTION_EQUIPMENT__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRelayDelayTime() {
		return relayDelayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelayDelayTime(float newRelayDelayTime) {
		float oldRelayDelayTime = relayDelayTime;
		relayDelayTime = newRelayDelayTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME, oldRelayDelayTime, relayDelayTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectedSwitch> getProtectedSwitches() {
		if (protectedSwitches == null) {
			protectedSwitches = new EObjectResolvingEList<ProtectedSwitch>(ProtectedSwitch.class, this, ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES);
		}
		return protectedSwitches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPowerDirectionFlag() {
		return powerDirectionFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerDirectionFlag(boolean newPowerDirectionFlag) {
		boolean oldPowerDirectionFlag = powerDirectionFlag;
		powerDirectionFlag = newPowerDirectionFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG, oldPowerDirectionFlag, powerDirectionFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowLimit() {
		return lowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowLimit(float newLowLimit) {
		float oldLowLimit = lowLimit;
		lowLimit = newLowLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT, oldLowLimit, lowLimit));
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipments()).basicAdd(otherEnd, msgs);
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT:
				if (unit != null)
					msgs = ((InternalEObject)unit).eInverseRemove(this, CorePackage.UNIT__PROTECTION_EQUIPMENTS, Unit.class, msgs);
				return basicSetUnit((Unit)otherEnd, msgs);
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				return ((InternalEList<?>)getConductingEquipments()).basicRemove(otherEnd, msgs);
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT:
				return basicSetUnit(null, msgs);
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				return getConductingEquipments();
			case ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
				return getHighLimit();
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
				return getRelayDelayTime();
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				return getProtectedSwitches();
			case ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
				return isPowerDirectionFlag();
			case ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
				return getLowLimit();
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				getConductingEquipments().clear();
				getConductingEquipments().addAll((Collection<? extends ConductingEquipment>)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
				setHighLimit((Float)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT:
				setUnit((Unit)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
				setRelayDelayTime((Float)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				getProtectedSwitches().clear();
				getProtectedSwitches().addAll((Collection<? extends ProtectedSwitch>)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
				setPowerDirectionFlag((Boolean)newValue);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
				setLowLimit((Float)newValue);
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				getConductingEquipments().clear();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
				setHighLimit(HIGH_LIMIT_EDEFAULT);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT:
				setUnit((Unit)null);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
				setRelayDelayTime(RELAY_DELAY_TIME_EDEFAULT);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				getProtectedSwitches().clear();
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
				setPowerDirectionFlag(POWER_DIRECTION_FLAG_EDEFAULT);
				return;
			case ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
				setLowLimit(LOW_LIMIT_EDEFAULT);
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
			case ProtectionPackage.PROTECTION_EQUIPMENT__CONDUCTING_EQUIPMENTS:
				return conductingEquipments != null && !conductingEquipments.isEmpty();
			case ProtectionPackage.PROTECTION_EQUIPMENT__HIGH_LIMIT:
				return highLimit != HIGH_LIMIT_EDEFAULT;
			case ProtectionPackage.PROTECTION_EQUIPMENT__UNIT:
				return unit != null;
			case ProtectionPackage.PROTECTION_EQUIPMENT__RELAY_DELAY_TIME:
				return relayDelayTime != RELAY_DELAY_TIME_EDEFAULT;
			case ProtectionPackage.PROTECTION_EQUIPMENT__PROTECTED_SWITCHES:
				return protectedSwitches != null && !protectedSwitches.isEmpty();
			case ProtectionPackage.PROTECTION_EQUIPMENT__POWER_DIRECTION_FLAG:
				return powerDirectionFlag != POWER_DIRECTION_FLAG_EDEFAULT;
			case ProtectionPackage.PROTECTION_EQUIPMENT__LOW_LIMIT:
				return lowLimit != LOW_LIMIT_EDEFAULT;
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
		result.append(" (highLimit: ");
		result.append(highLimit);
		result.append(", relayDelayTime: ");
		result.append(relayDelayTime);
		result.append(", powerDirectionFlag: ");
		result.append(powerDirectionFlag);
		result.append(", lowLimit: ");
		result.append(lowLimit);
		result.append(')');
		return result.toString();
	}

} //ProtectionEquipmentImpl
