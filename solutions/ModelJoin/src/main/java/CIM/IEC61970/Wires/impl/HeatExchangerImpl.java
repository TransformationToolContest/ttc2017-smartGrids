/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Core.impl.EquipmentImpl;

import CIM.IEC61970.Wires.HeatExchanger;
import CIM.IEC61970.Wires.PowerTransformer;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Heat Exchanger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.HeatExchangerImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeatExchangerImpl extends EquipmentImpl implements HeatExchanger {
	/**
	 * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerTransformer()
	 * @generated
	 * @ordered
	 */
	protected PowerTransformer powerTransformer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeatExchangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.HEAT_EXCHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer getPowerTransformer() {
		if (powerTransformer != null && powerTransformer.eIsProxy()) {
			InternalEObject oldPowerTransformer = (InternalEObject)powerTransformer;
			powerTransformer = (PowerTransformer)eResolveProxy(oldPowerTransformer);
			if (powerTransformer != oldPowerTransformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER, oldPowerTransformer, powerTransformer));
			}
		}
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerTransformer basicGetPowerTransformer() {
		return powerTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerTransformer(PowerTransformer newPowerTransformer, NotificationChain msgs) {
		PowerTransformer oldPowerTransformer = powerTransformer;
		powerTransformer = newPowerTransformer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER, oldPowerTransformer, newPowerTransformer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerTransformer(PowerTransformer newPowerTransformer) {
		if (newPowerTransformer != powerTransformer) {
			NotificationChain msgs = null;
			if (powerTransformer != null)
				msgs = ((InternalEObject)powerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER, PowerTransformer.class, msgs);
			if (newPowerTransformer != null)
				msgs = ((InternalEObject)newPowerTransformer).eInverseAdd(this, WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER, PowerTransformer.class, msgs);
			msgs = basicSetPowerTransformer(newPowerTransformer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER, newPowerTransformer, newPowerTransformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER:
				if (powerTransformer != null)
					msgs = ((InternalEObject)powerTransformer).eInverseRemove(this, WiresPackage.POWER_TRANSFORMER__HEAT_EXCHANGER, PowerTransformer.class, msgs);
				return basicSetPowerTransformer((PowerTransformer)otherEnd, msgs);
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
			case WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER:
				return basicSetPowerTransformer(null, msgs);
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
			case WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER:
				if (resolve) return getPowerTransformer();
				return basicGetPowerTransformer();
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
			case WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)newValue);
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
			case WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER:
				setPowerTransformer((PowerTransformer)null);
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
			case WiresPackage.HEAT_EXCHANGER__POWER_TRANSFORMER:
				return powerTransformer != null;
		}
		return super.eIsSet(featureID);
	}

} //HeatExchangerImpl
