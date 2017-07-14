/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Core.impl.ConductingEquipmentImpl;

import gluemodel.CIM.IEC61970.Wires.EnergySource;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getActivePower <em>Active Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getR <em>R</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getX <em>X</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getRn <em>Rn</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getVoltageMagnitude <em>Voltage Magnitude</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getVoltageAngle <em>Voltage Angle</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getXn <em>Xn</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.EnergySourceImpl#getX0 <em>X0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergySourceImpl extends ConductingEquipmentImpl implements EnergySource {
	/**
	 * The default value of the '{@link #getActivePower() <em>Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePower()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTIVE_POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActivePower() <em>Active Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePower()
	 * @generated
	 * @ordered
	 */
	protected float activePower = ACTIVE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final float R_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected float r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getRn() <em>Rn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRn()
	 * @generated
	 * @ordered
	 */
	protected static final float RN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRn() <em>Rn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRn()
	 * @generated
	 * @ordered
	 */
	protected float rn = RN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageMagnitude() <em>Voltage Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageMagnitude()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_MAGNITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageMagnitude() <em>Voltage Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageMagnitude()
	 * @generated
	 * @ordered
	 */
	protected float voltageMagnitude = VOLTAGE_MAGNITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected static final float R0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR0()
	 * @generated
	 * @ordered
	 */
	protected float r0 = R0_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageAngle() <em>Voltage Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAngle()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_ANGLE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageAngle() <em>Voltage Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageAngle()
	 * @generated
	 * @ordered
	 */
	protected float voltageAngle = VOLTAGE_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXn() <em>Xn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXn()
	 * @generated
	 * @ordered
	 */
	protected static final float XN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getXn() <em>Xn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXn()
	 * @generated
	 * @ordered
	 */
	protected float xn = XN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalVoltage()
	 * @generated
	 * @ordered
	 */
	protected float nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected static final float X0_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected float x0 = X0_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergySourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.ENERGY_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getActivePower() {
		return activePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePower(float newActivePower) {
		float oldActivePower = activePower;
		activePower = newActivePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__ACTIVE_POWER, oldActivePower, activePower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(float newR) {
		float oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRn() {
		return rn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRn(float newRn) {
		float oldRn = rn;
		rn = newRn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__RN, oldRn, rn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltageMagnitude() {
		return voltageMagnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageMagnitude(float newVoltageMagnitude) {
		float oldVoltageMagnitude = voltageMagnitude;
		voltageMagnitude = newVoltageMagnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE, oldVoltageMagnitude, voltageMagnitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR0() {
		return r0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR0(float newR0) {
		float oldR0 = r0;
		r0 = newR0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__R0, oldR0, r0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltageAngle() {
		return voltageAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageAngle(float newVoltageAngle) {
		float oldVoltageAngle = voltageAngle;
		voltageAngle = newVoltageAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE, oldVoltageAngle, voltageAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXn() {
		return xn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXn(float newXn) {
		float oldXn = xn;
		xn = newXn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__XN, oldXn, xn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNominalVoltage() {
		return nominalVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalVoltage(float newNominalVoltage) {
		float oldNominalVoltage = nominalVoltage;
		nominalVoltage = newNominalVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE, oldNominalVoltage, nominalVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX0() {
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX0(float newX0) {
		float oldX0 = x0;
		x0 = newX0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.ENERGY_SOURCE__X0, oldX0, x0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.ENERGY_SOURCE__ACTIVE_POWER:
				return getActivePower();
			case WiresPackage.ENERGY_SOURCE__R:
				return getR();
			case WiresPackage.ENERGY_SOURCE__X:
				return getX();
			case WiresPackage.ENERGY_SOURCE__RN:
				return getRn();
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
				return getVoltageMagnitude();
			case WiresPackage.ENERGY_SOURCE__R0:
				return getR0();
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
				return getVoltageAngle();
			case WiresPackage.ENERGY_SOURCE__XN:
				return getXn();
			case WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
				return getNominalVoltage();
			case WiresPackage.ENERGY_SOURCE__X0:
				return getX0();
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
			case WiresPackage.ENERGY_SOURCE__ACTIVE_POWER:
				setActivePower((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__R:
				setR((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__X:
				setX((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__RN:
				setRn((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
				setVoltageMagnitude((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__R0:
				setR0((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
				setVoltageAngle((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__XN:
				setXn((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
				setNominalVoltage((Float)newValue);
				return;
			case WiresPackage.ENERGY_SOURCE__X0:
				setX0((Float)newValue);
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
			case WiresPackage.ENERGY_SOURCE__ACTIVE_POWER:
				setActivePower(ACTIVE_POWER_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__R:
				setR(R_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__X:
				setX(X_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__RN:
				setRn(RN_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
				setVoltageMagnitude(VOLTAGE_MAGNITUDE_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__R0:
				setR0(R0_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
				setVoltageAngle(VOLTAGE_ANGLE_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__XN:
				setXn(XN_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
				setNominalVoltage(NOMINAL_VOLTAGE_EDEFAULT);
				return;
			case WiresPackage.ENERGY_SOURCE__X0:
				setX0(X0_EDEFAULT);
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
			case WiresPackage.ENERGY_SOURCE__ACTIVE_POWER:
				return activePower != ACTIVE_POWER_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__R:
				return r != R_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__X:
				return x != X_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__RN:
				return rn != RN_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
				return voltageMagnitude != VOLTAGE_MAGNITUDE_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__R0:
				return r0 != R0_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
				return voltageAngle != VOLTAGE_ANGLE_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__XN:
				return xn != XN_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
				return nominalVoltage != NOMINAL_VOLTAGE_EDEFAULT;
			case WiresPackage.ENERGY_SOURCE__X0:
				return x0 != X0_EDEFAULT;
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
		result.append(" (activePower: ");
		result.append(activePower);
		result.append(", r: ");
		result.append(r);
		result.append(", x: ");
		result.append(x);
		result.append(", rn: ");
		result.append(rn);
		result.append(", voltageMagnitude: ");
		result.append(voltageMagnitude);
		result.append(", r0: ");
		result.append(r0);
		result.append(", voltageAngle: ");
		result.append(voltageAngle);
		result.append(", xn: ");
		result.append(xn);
		result.append(", nominalVoltage: ");
		result.append(nominalVoltage);
		result.append(", x0: ");
		result.append(x0);
		result.append(')');
		return result.toString();
	}

} //EnergySourceImpl
