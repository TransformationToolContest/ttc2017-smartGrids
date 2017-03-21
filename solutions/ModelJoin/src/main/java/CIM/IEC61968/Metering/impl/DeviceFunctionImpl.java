/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Assets.impl.AssetFunctionImpl;

import CIM.IEC61968.Metering.DeviceFunction;
import CIM.IEC61968.Metering.EndDeviceAsset;
import CIM.IEC61968.Metering.EndDeviceEvent;
import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.Register;

import CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

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
 * An implementation of the model object '<em><b>Device Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.DeviceFunctionImpl#getComEquipmentAsset <em>Com Equipment Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.DeviceFunctionImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.DeviceFunctionImpl#getEndDeviceAsset <em>End Device Asset</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.DeviceFunctionImpl#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.DeviceFunctionImpl#getRegisters <em>Registers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceFunctionImpl extends AssetFunctionImpl implements DeviceFunction {
	/**
	 * The cached value of the '{@link #getComEquipmentAsset() <em>Com Equipment Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComEquipmentAsset()
	 * @generated
	 * @ordered
	 */
	protected ComEquipmentInfo comEquipmentAsset;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean disabled = DISABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndDeviceAsset() <em>End Device Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceAsset()
	 * @generated
	 * @ordered
	 */
	protected EndDeviceAsset endDeviceAsset;

	/**
	 * The cached value of the '{@link #getEndDeviceEvents() <em>End Device Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDeviceEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EndDeviceEvent> endDeviceEvents;

	/**
	 * The cached value of the '{@link #getRegisters() <em>Registers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<Register> registers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.DEVICE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComEquipmentInfo getComEquipmentAsset() {
		if (comEquipmentAsset != null && comEquipmentAsset.eIsProxy()) {
			InternalEObject oldComEquipmentAsset = (InternalEObject)comEquipmentAsset;
			comEquipmentAsset = (ComEquipmentInfo)eResolveProxy(oldComEquipmentAsset);
			if (comEquipmentAsset != oldComEquipmentAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET, oldComEquipmentAsset, comEquipmentAsset));
			}
		}
		return comEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComEquipmentInfo basicGetComEquipmentAsset() {
		return comEquipmentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComEquipmentAsset(ComEquipmentInfo newComEquipmentAsset, NotificationChain msgs) {
		ComEquipmentInfo oldComEquipmentAsset = comEquipmentAsset;
		comEquipmentAsset = newComEquipmentAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET, oldComEquipmentAsset, newComEquipmentAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComEquipmentAsset(ComEquipmentInfo newComEquipmentAsset) {
		if (newComEquipmentAsset != comEquipmentAsset) {
			NotificationChain msgs = null;
			if (comEquipmentAsset != null)
				msgs = ((InternalEObject)comEquipmentAsset).eInverseRemove(this, InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS, ComEquipmentInfo.class, msgs);
			if (newComEquipmentAsset != null)
				msgs = ((InternalEObject)newComEquipmentAsset).eInverseAdd(this, InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS, ComEquipmentInfo.class, msgs);
			msgs = basicSetComEquipmentAsset(newComEquipmentAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET, newComEquipmentAsset, newComEquipmentAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		boolean oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.DEVICE_FUNCTION__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceAsset getEndDeviceAsset() {
		if (endDeviceAsset != null && endDeviceAsset.eIsProxy()) {
			InternalEObject oldEndDeviceAsset = (InternalEObject)endDeviceAsset;
			endDeviceAsset = (EndDeviceAsset)eResolveProxy(oldEndDeviceAsset);
			if (endDeviceAsset != oldEndDeviceAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET, oldEndDeviceAsset, endDeviceAsset));
			}
		}
		return endDeviceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndDeviceAsset basicGetEndDeviceAsset() {
		return endDeviceAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDeviceAsset(EndDeviceAsset newEndDeviceAsset, NotificationChain msgs) {
		EndDeviceAsset oldEndDeviceAsset = endDeviceAsset;
		endDeviceAsset = newEndDeviceAsset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET, oldEndDeviceAsset, newEndDeviceAsset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDeviceAsset(EndDeviceAsset newEndDeviceAsset) {
		if (newEndDeviceAsset != endDeviceAsset) {
			NotificationChain msgs = null;
			if (endDeviceAsset != null)
				msgs = ((InternalEObject)endDeviceAsset).eInverseRemove(this, MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS, EndDeviceAsset.class, msgs);
			if (newEndDeviceAsset != null)
				msgs = ((InternalEObject)newEndDeviceAsset).eInverseAdd(this, MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS, EndDeviceAsset.class, msgs);
			msgs = basicSetEndDeviceAsset(newEndDeviceAsset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET, newEndDeviceAsset, newEndDeviceAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndDeviceEvent> getEndDeviceEvents() {
		if (endDeviceEvents == null) {
			endDeviceEvents = new EObjectWithInverseResolvingEList<EndDeviceEvent>(EndDeviceEvent.class, this, MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS, MeteringPackage.END_DEVICE_EVENT__DEVICE_FUNCTION);
		}
		return endDeviceEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Register> getRegisters() {
		if (registers == null) {
			registers = new EObjectWithInverseResolvingEList<Register>(Register.class, this, MeteringPackage.DEVICE_FUNCTION__REGISTERS, MeteringPackage.REGISTER__DEVICE_FUNCTION);
		}
		return registers;
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
			case MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET:
				if (comEquipmentAsset != null)
					msgs = ((InternalEObject)comEquipmentAsset).eInverseRemove(this, InfAssetsPackage.COM_EQUIPMENT_INFO__DEVICE_FUNCTIONS, ComEquipmentInfo.class, msgs);
				return basicSetComEquipmentAsset((ComEquipmentInfo)otherEnd, msgs);
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET:
				if (endDeviceAsset != null)
					msgs = ((InternalEObject)endDeviceAsset).eInverseRemove(this, MeteringPackage.END_DEVICE_ASSET__DEVICE_FUNCTIONS, EndDeviceAsset.class, msgs);
				return basicSetEndDeviceAsset((EndDeviceAsset)otherEnd, msgs);
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndDeviceEvents()).basicAdd(otherEnd, msgs);
			case MeteringPackage.DEVICE_FUNCTION__REGISTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegisters()).basicAdd(otherEnd, msgs);
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
			case MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET:
				return basicSetComEquipmentAsset(null, msgs);
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET:
				return basicSetEndDeviceAsset(null, msgs);
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS:
				return ((InternalEList<?>)getEndDeviceEvents()).basicRemove(otherEnd, msgs);
			case MeteringPackage.DEVICE_FUNCTION__REGISTERS:
				return ((InternalEList<?>)getRegisters()).basicRemove(otherEnd, msgs);
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
			case MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET:
				if (resolve) return getComEquipmentAsset();
				return basicGetComEquipmentAsset();
			case MeteringPackage.DEVICE_FUNCTION__DISABLED:
				return isDisabled();
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET:
				if (resolve) return getEndDeviceAsset();
				return basicGetEndDeviceAsset();
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS:
				return getEndDeviceEvents();
			case MeteringPackage.DEVICE_FUNCTION__REGISTERS:
				return getRegisters();
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
			case MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET:
				setComEquipmentAsset((ComEquipmentInfo)newValue);
				return;
			case MeteringPackage.DEVICE_FUNCTION__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET:
				setEndDeviceAsset((EndDeviceAsset)newValue);
				return;
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS:
				getEndDeviceEvents().clear();
				getEndDeviceEvents().addAll((Collection<? extends EndDeviceEvent>)newValue);
				return;
			case MeteringPackage.DEVICE_FUNCTION__REGISTERS:
				getRegisters().clear();
				getRegisters().addAll((Collection<? extends Register>)newValue);
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
			case MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET:
				setComEquipmentAsset((ComEquipmentInfo)null);
				return;
			case MeteringPackage.DEVICE_FUNCTION__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET:
				setEndDeviceAsset((EndDeviceAsset)null);
				return;
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS:
				getEndDeviceEvents().clear();
				return;
			case MeteringPackage.DEVICE_FUNCTION__REGISTERS:
				getRegisters().clear();
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
			case MeteringPackage.DEVICE_FUNCTION__COM_EQUIPMENT_ASSET:
				return comEquipmentAsset != null;
			case MeteringPackage.DEVICE_FUNCTION__DISABLED:
				return disabled != DISABLED_EDEFAULT;
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_ASSET:
				return endDeviceAsset != null;
			case MeteringPackage.DEVICE_FUNCTION__END_DEVICE_EVENTS:
				return endDeviceEvents != null && !endDeviceEvents.isEmpty();
			case MeteringPackage.DEVICE_FUNCTION__REGISTERS:
				return registers != null && !registers.isEmpty();
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
		result.append(" (disabled: ");
		result.append(disabled);
		result.append(')');
		return result.toString();
	}

} //DeviceFunctionImpl
