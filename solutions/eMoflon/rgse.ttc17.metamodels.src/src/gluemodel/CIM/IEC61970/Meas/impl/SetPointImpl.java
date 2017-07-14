/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Meas.Analog;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.SetPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.SetPointImpl#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.SetPointImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.SetPointImpl#getAnalog <em>Analog</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.SetPointImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.SetPointImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetPointImpl extends ControlImpl implements SetPoint {
	/**
	 * The default value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected float normalValue = NORMAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnalog() <em>Analog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalog()
	 * @generated
	 * @ordered
	 */
	protected Analog analog;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected float maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected float minValue = MIN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.SET_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormalValue() {
		return normalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalValue(float newNormalValue) {
		float oldNormalValue = normalValue;
		normalValue = newNormalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.SET_POINT__NORMAL_VALUE, oldNormalValue, normalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.SET_POINT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog getAnalog() {
		if (analog != null && analog.eIsProxy()) {
			InternalEObject oldAnalog = (InternalEObject)analog;
			analog = (Analog)eResolveProxy(oldAnalog);
			if (analog != oldAnalog) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.SET_POINT__ANALOG, oldAnalog, analog));
			}
		}
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analog basicGetAnalog() {
		return analog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalog(Analog newAnalog, NotificationChain msgs) {
		Analog oldAnalog = analog;
		analog = newAnalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.SET_POINT__ANALOG, oldAnalog, newAnalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalog(Analog newAnalog) {
		if (newAnalog != analog) {
			NotificationChain msgs = null;
			if (analog != null)
				msgs = ((InternalEObject)analog).eInverseRemove(this, MeasPackage.ANALOG__SET_POINT, Analog.class, msgs);
			if (newAnalog != null)
				msgs = ((InternalEObject)newAnalog).eInverseAdd(this, MeasPackage.ANALOG__SET_POINT, Analog.class, msgs);
			msgs = basicSetAnalog(newAnalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.SET_POINT__ANALOG, newAnalog, newAnalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(float newMaxValue) {
		float oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.SET_POINT__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(float newMinValue) {
		float oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.SET_POINT__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.SET_POINT__ANALOG:
				if (analog != null)
					msgs = ((InternalEObject)analog).eInverseRemove(this, MeasPackage.ANALOG__SET_POINT, Analog.class, msgs);
				return basicSetAnalog((Analog)otherEnd, msgs);
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
			case MeasPackage.SET_POINT__ANALOG:
				return basicSetAnalog(null, msgs);
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
			case MeasPackage.SET_POINT__NORMAL_VALUE:
				return getNormalValue();
			case MeasPackage.SET_POINT__VALUE:
				return getValue();
			case MeasPackage.SET_POINT__ANALOG:
				if (resolve) return getAnalog();
				return basicGetAnalog();
			case MeasPackage.SET_POINT__MAX_VALUE:
				return getMaxValue();
			case MeasPackage.SET_POINT__MIN_VALUE:
				return getMinValue();
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
			case MeasPackage.SET_POINT__NORMAL_VALUE:
				setNormalValue((Float)newValue);
				return;
			case MeasPackage.SET_POINT__VALUE:
				setValue((Float)newValue);
				return;
			case MeasPackage.SET_POINT__ANALOG:
				setAnalog((Analog)newValue);
				return;
			case MeasPackage.SET_POINT__MAX_VALUE:
				setMaxValue((Float)newValue);
				return;
			case MeasPackage.SET_POINT__MIN_VALUE:
				setMinValue((Float)newValue);
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
			case MeasPackage.SET_POINT__NORMAL_VALUE:
				setNormalValue(NORMAL_VALUE_EDEFAULT);
				return;
			case MeasPackage.SET_POINT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeasPackage.SET_POINT__ANALOG:
				setAnalog((Analog)null);
				return;
			case MeasPackage.SET_POINT__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case MeasPackage.SET_POINT__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
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
			case MeasPackage.SET_POINT__NORMAL_VALUE:
				return normalValue != NORMAL_VALUE_EDEFAULT;
			case MeasPackage.SET_POINT__VALUE:
				return value != VALUE_EDEFAULT;
			case MeasPackage.SET_POINT__ANALOG:
				return analog != null;
			case MeasPackage.SET_POINT__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case MeasPackage.SET_POINT__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
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
		result.append(" (normalValue: ");
		result.append(normalValue);
		result.append(", value: ");
		result.append(value);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(')');
		return result.toString();
	}

} //SetPointImpl
