/**
 */
package CIM.IEC61970.ControlArea.impl;

import CIM.IEC61970.ControlArea.AltGeneratingUnitMeas;
import CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit;
import CIM.IEC61970.ControlArea.ControlAreaPackage;

import CIM.IEC61970.Meas.AnalogValue;
import CIM.IEC61970.Meas.MeasPackage;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alt Generating Unit Meas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.ControlArea.impl.AltGeneratingUnitMeasImpl#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.impl.AltGeneratingUnitMeasImpl#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.impl.AltGeneratingUnitMeasImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AltGeneratingUnitMeasImpl extends ElementImpl implements AltGeneratingUnitMeas {
	/**
	 * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected ControlAreaGeneratingUnit controlAreaGeneratingUnit;

	/**
	 * The cached value of the '{@link #getAnalogValue() <em>Analog Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogValue()
	 * @generated
	 * @ordered
	 */
	protected AnalogValue analogValue;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltGeneratingUnitMeasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlAreaPackage.Literals.ALT_GENERATING_UNIT_MEAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaGeneratingUnit getControlAreaGeneratingUnit() {
		if (controlAreaGeneratingUnit != null && controlAreaGeneratingUnit.eIsProxy()) {
			InternalEObject oldControlAreaGeneratingUnit = (InternalEObject)controlAreaGeneratingUnit;
			controlAreaGeneratingUnit = (ControlAreaGeneratingUnit)eResolveProxy(oldControlAreaGeneratingUnit);
			if (controlAreaGeneratingUnit != oldControlAreaGeneratingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT, oldControlAreaGeneratingUnit, controlAreaGeneratingUnit));
			}
		}
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAreaGeneratingUnit basicGetControlAreaGeneratingUnit() {
		return controlAreaGeneratingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlAreaGeneratingUnit(ControlAreaGeneratingUnit newControlAreaGeneratingUnit, NotificationChain msgs) {
		ControlAreaGeneratingUnit oldControlAreaGeneratingUnit = controlAreaGeneratingUnit;
		controlAreaGeneratingUnit = newControlAreaGeneratingUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT, oldControlAreaGeneratingUnit, newControlAreaGeneratingUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlAreaGeneratingUnit(ControlAreaGeneratingUnit newControlAreaGeneratingUnit) {
		if (newControlAreaGeneratingUnit != controlAreaGeneratingUnit) {
			NotificationChain msgs = null;
			if (controlAreaGeneratingUnit != null)
				msgs = ((InternalEObject)controlAreaGeneratingUnit).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS, ControlAreaGeneratingUnit.class, msgs);
			if (newControlAreaGeneratingUnit != null)
				msgs = ((InternalEObject)newControlAreaGeneratingUnit).eInverseAdd(this, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS, ControlAreaGeneratingUnit.class, msgs);
			msgs = basicSetControlAreaGeneratingUnit(newControlAreaGeneratingUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT, newControlAreaGeneratingUnit, newControlAreaGeneratingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue getAnalogValue() {
		if (analogValue != null && analogValue.eIsProxy()) {
			InternalEObject oldAnalogValue = (InternalEObject)analogValue;
			analogValue = (AnalogValue)eResolveProxy(oldAnalogValue);
			if (analogValue != oldAnalogValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE, oldAnalogValue, analogValue));
			}
		}
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogValue basicGetAnalogValue() {
		return analogValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalogValue(AnalogValue newAnalogValue, NotificationChain msgs) {
		AnalogValue oldAnalogValue = analogValue;
		analogValue = newAnalogValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE, oldAnalogValue, newAnalogValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalogValue(AnalogValue newAnalogValue) {
		if (newAnalogValue != analogValue) {
			NotificationChain msgs = null;
			if (analogValue != null)
				msgs = ((InternalEObject)analogValue).eInverseRemove(this, MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs);
			if (newAnalogValue != null)
				msgs = ((InternalEObject)newAnalogValue).eInverseAdd(this, MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs);
			msgs = basicSetAnalogValue(newAnalogValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE, newAnalogValue, newAnalogValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				if (controlAreaGeneratingUnit != null)
					msgs = ((InternalEObject)controlAreaGeneratingUnit).eInverseRemove(this, ControlAreaPackage.CONTROL_AREA_GENERATING_UNIT__ALT_GENERATING_UNIT_MEAS, ControlAreaGeneratingUnit.class, msgs);
				return basicSetControlAreaGeneratingUnit((ControlAreaGeneratingUnit)otherEnd, msgs);
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				if (analogValue != null)
					msgs = ((InternalEObject)analogValue).eInverseRemove(this, MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, AnalogValue.class, msgs);
				return basicSetAnalogValue((AnalogValue)otherEnd, msgs);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				return basicSetControlAreaGeneratingUnit(null, msgs);
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				return basicSetAnalogValue(null, msgs);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				if (resolve) return getControlAreaGeneratingUnit();
				return basicGetControlAreaGeneratingUnit();
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				if (resolve) return getAnalogValue();
				return basicGetAnalogValue();
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
				return getPriority();
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				setControlAreaGeneratingUnit((ControlAreaGeneratingUnit)newValue);
				return;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				setAnalogValue((AnalogValue)newValue);
				return;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
				setPriority((Integer)newValue);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				setControlAreaGeneratingUnit((ControlAreaGeneratingUnit)null);
				return;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				setAnalogValue((AnalogValue)null);
				return;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__CONTROL_AREA_GENERATING_UNIT:
				return controlAreaGeneratingUnit != null;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE:
				return analogValue != null;
			case ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //AltGeneratingUnitMeasImpl
