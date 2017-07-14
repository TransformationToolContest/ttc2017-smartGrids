/**
 */
package gluemodel.CIM.IEC61970.Wires.impl;

import gluemodel.CIM.IEC61970.Wires.SVCControlMode;
import gluemodel.CIM.IEC61970.Wires.StaticVarCompensator;
import gluemodel.CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl#getInductiveRating <em>Inductive Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Wires.impl.StaticVarCompensatorImpl#getSlope <em>Slope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticVarCompensatorImpl extends RegulatingCondEqImpl implements StaticVarCompensator {
	/**
	 * The default value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVCControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final SVCControlMode SVC_CONTROL_MODE_EDEFAULT = SVCControlMode.VOLTAGE;

	/**
	 * The cached value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVCControlMode()
	 * @generated
	 * @ordered
	 */
	protected SVCControlMode sVCControlMode = SVC_CONTROL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final float INDUCTIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected float inductiveRating = INDUCTIVE_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected float capacitiveRating = CAPACITIVE_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSetPoint()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTAGE_SET_POINT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageSetPoint()
	 * @generated
	 * @ordered
	 */
	protected float voltageSetPoint = VOLTAGE_SET_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected static final float SLOPE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected float slope = SLOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticVarCompensatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.STATIC_VAR_COMPENSATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVCControlMode getSVCControlMode() {
		return sVCControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSVCControlMode(SVCControlMode newSVCControlMode) {
		SVCControlMode oldSVCControlMode = sVCControlMode;
		sVCControlMode = newSVCControlMode == null ? SVC_CONTROL_MODE_EDEFAULT : newSVCControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE, oldSVCControlMode, sVCControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInductiveRating() {
		return inductiveRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInductiveRating(float newInductiveRating) {
		float oldInductiveRating = inductiveRating;
		inductiveRating = newInductiveRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING, oldInductiveRating, inductiveRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapacitiveRating() {
		return capacitiveRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacitiveRating(float newCapacitiveRating) {
		float oldCapacitiveRating = capacitiveRating;
		capacitiveRating = newCapacitiveRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING, oldCapacitiveRating, capacitiveRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVoltageSetPoint() {
		return voltageSetPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageSetPoint(float newVoltageSetPoint) {
		float oldVoltageSetPoint = voltageSetPoint;
		voltageSetPoint = newVoltageSetPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT, oldVoltageSetPoint, voltageSetPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSlope() {
		return slope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlope(float newSlope) {
		float oldSlope = slope;
		slope = newSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE, oldSlope, slope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				return getSVCControlMode();
			case WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				return getInductiveRating();
			case WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				return getCapacitiveRating();
			case WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				return getVoltageSetPoint();
			case WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				return getSlope();
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
			case WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				setSVCControlMode((SVCControlMode)newValue);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				setInductiveRating((Float)newValue);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				setCapacitiveRating((Float)newValue);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				setVoltageSetPoint((Float)newValue);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				setSlope((Float)newValue);
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
			case WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				setSVCControlMode(SVC_CONTROL_MODE_EDEFAULT);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				setInductiveRating(INDUCTIVE_RATING_EDEFAULT);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				setCapacitiveRating(CAPACITIVE_RATING_EDEFAULT);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				setVoltageSetPoint(VOLTAGE_SET_POINT_EDEFAULT);
				return;
			case WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				setSlope(SLOPE_EDEFAULT);
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
			case WiresPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
				return sVCControlMode != SVC_CONTROL_MODE_EDEFAULT;
			case WiresPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
				return inductiveRating != INDUCTIVE_RATING_EDEFAULT;
			case WiresPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
				return capacitiveRating != CAPACITIVE_RATING_EDEFAULT;
			case WiresPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
				return voltageSetPoint != VOLTAGE_SET_POINT_EDEFAULT;
			case WiresPackage.STATIC_VAR_COMPENSATOR__SLOPE:
				return slope != SLOPE_EDEFAULT;
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
		result.append(" (sVCControlMode: ");
		result.append(sVCControlMode);
		result.append(", inductiveRating: ");
		result.append(inductiveRating);
		result.append(", capacitiveRating: ");
		result.append(capacitiveRating);
		result.append(", voltageSetPoint: ");
		result.append(voltageSetPoint);
		result.append(", slope: ");
		result.append(slope);
		result.append(')');
		return result.toString();
	}

} //StaticVarCompensatorImpl
