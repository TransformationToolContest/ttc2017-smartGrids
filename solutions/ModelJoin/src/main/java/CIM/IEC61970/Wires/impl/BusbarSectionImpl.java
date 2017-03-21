/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Wires.BusbarSection;
import CIM.IEC61970.Wires.VoltageControlZone;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Busbar Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.BusbarSectionImpl#getVoltageControlZone <em>Voltage Control Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusbarSectionImpl extends ConnectorImpl implements BusbarSection {
	/**
	 * The cached value of the '{@link #getVoltageControlZone() <em>Voltage Control Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageControlZone()
	 * @generated
	 * @ordered
	 */
	protected VoltageControlZone voltageControlZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusbarSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.BUSBAR_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageControlZone getVoltageControlZone() {
		if (voltageControlZone != null && voltageControlZone.eIsProxy()) {
			InternalEObject oldVoltageControlZone = (InternalEObject)voltageControlZone;
			voltageControlZone = (VoltageControlZone)eResolveProxy(oldVoltageControlZone);
			if (voltageControlZone != oldVoltageControlZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, oldVoltageControlZone, voltageControlZone));
			}
		}
		return voltageControlZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageControlZone basicGetVoltageControlZone() {
		return voltageControlZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoltageControlZone(VoltageControlZone newVoltageControlZone, NotificationChain msgs) {
		VoltageControlZone oldVoltageControlZone = voltageControlZone;
		voltageControlZone = newVoltageControlZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, oldVoltageControlZone, newVoltageControlZone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageControlZone(VoltageControlZone newVoltageControlZone) {
		if (newVoltageControlZone != voltageControlZone) {
			NotificationChain msgs = null;
			if (voltageControlZone != null)
				msgs = ((InternalEObject)voltageControlZone).eInverseRemove(this, WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs);
			if (newVoltageControlZone != null)
				msgs = ((InternalEObject)newVoltageControlZone).eInverseAdd(this, WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs);
			msgs = basicSetVoltageControlZone(newVoltageControlZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE, newVoltageControlZone, newVoltageControlZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				if (voltageControlZone != null)
					msgs = ((InternalEObject)voltageControlZone).eInverseRemove(this, WiresPackage.VOLTAGE_CONTROL_ZONE__BUSBAR_SECTION, VoltageControlZone.class, msgs);
				return basicSetVoltageControlZone((VoltageControlZone)otherEnd, msgs);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				return basicSetVoltageControlZone(null, msgs);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				if (resolve) return getVoltageControlZone();
				return basicGetVoltageControlZone();
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				setVoltageControlZone((VoltageControlZone)newValue);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				setVoltageControlZone((VoltageControlZone)null);
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
			case WiresPackage.BUSBAR_SECTION__VOLTAGE_CONTROL_ZONE:
				return voltageControlZone != null;
		}
		return super.eIsSet(featureID);
	}

} //BusbarSectionImpl
