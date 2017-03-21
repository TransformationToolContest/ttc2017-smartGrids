/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.StringMeasurement;
import CIM.IEC61970.Meas.StringMeasurementValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Measurement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.StringMeasurementValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.StringMeasurementValueImpl#getStringMeasurement <em>String Measurement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringMeasurementValueImpl extends MeasurementValueImpl implements StringMeasurementValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStringMeasurement() <em>String Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringMeasurement()
	 * @generated
	 * @ordered
	 */
	protected StringMeasurement stringMeasurement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringMeasurementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.STRING_MEASUREMENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.STRING_MEASUREMENT_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMeasurement getStringMeasurement() {
		if (stringMeasurement != null && stringMeasurement.eIsProxy()) {
			InternalEObject oldStringMeasurement = (InternalEObject)stringMeasurement;
			stringMeasurement = (StringMeasurement)eResolveProxy(oldStringMeasurement);
			if (stringMeasurement != oldStringMeasurement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT, oldStringMeasurement, stringMeasurement));
			}
		}
		return stringMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringMeasurement basicGetStringMeasurement() {
		return stringMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringMeasurement(StringMeasurement newStringMeasurement, NotificationChain msgs) {
		StringMeasurement oldStringMeasurement = stringMeasurement;
		stringMeasurement = newStringMeasurement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT, oldStringMeasurement, newStringMeasurement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringMeasurement(StringMeasurement newStringMeasurement) {
		if (newStringMeasurement != stringMeasurement) {
			NotificationChain msgs = null;
			if (stringMeasurement != null)
				msgs = ((InternalEObject)stringMeasurement).eInverseRemove(this, MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs);
			if (newStringMeasurement != null)
				msgs = ((InternalEObject)newStringMeasurement).eInverseAdd(this, MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs);
			msgs = basicSetStringMeasurement(newStringMeasurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT, newStringMeasurement, newStringMeasurement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				if (stringMeasurement != null)
					msgs = ((InternalEObject)stringMeasurement).eInverseRemove(this, MeasPackage.STRING_MEASUREMENT__STRING_MEASUREMENT_VALUES, StringMeasurement.class, msgs);
				return basicSetStringMeasurement((StringMeasurement)otherEnd, msgs);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				return basicSetStringMeasurement(null, msgs);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__VALUE:
				return getValue();
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				if (resolve) return getStringMeasurement();
				return basicGetStringMeasurement();
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__VALUE:
				setValue((String)newValue);
				return;
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				setStringMeasurement((StringMeasurement)newValue);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				setStringMeasurement((StringMeasurement)null);
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
			case MeasPackage.STRING_MEASUREMENT_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MeasPackage.STRING_MEASUREMENT_VALUE__STRING_MEASUREMENT:
				return stringMeasurement != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //StringMeasurementValueImpl
