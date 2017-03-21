/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.ControlArea.AltGeneratingUnitMeas;
import CIM.IEC61970.ControlArea.AltTieMeas;
import CIM.IEC61970.ControlArea.ControlAreaPackage;

import CIM.IEC61970.Meas.Analog;
import CIM.IEC61970.Meas.AnalogValue;
import CIM.IEC61970.Meas.MeasPackage;

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
 * An implementation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.AnalogValueImpl#getAltGeneratingUnit <em>Alt Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.AnalogValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.AnalogValueImpl#getAltTieMeas <em>Alt Tie Meas</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.AnalogValueImpl#getAnalog <em>Analog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogValueImpl extends MeasurementValueImpl implements AnalogValue {
	/**
	 * The cached value of the '{@link #getAltGeneratingUnit() <em>Alt Generating Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltGeneratingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<AltGeneratingUnitMeas> altGeneratingUnit;

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
	 * The cached value of the '{@link #getAltTieMeas() <em>Alt Tie Meas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltTieMeas()
	 * @generated
	 * @ordered
	 */
	protected EList<AltTieMeas> altTieMeas;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ANALOG_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AltGeneratingUnitMeas> getAltGeneratingUnit() {
		if (altGeneratingUnit == null) {
			altGeneratingUnit = new EObjectWithInverseResolvingEList<AltGeneratingUnitMeas>(AltGeneratingUnitMeas.class, this, MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT, ControlAreaPackage.ALT_GENERATING_UNIT_MEAS__ANALOG_VALUE);
		}
		return altGeneratingUnit;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AltTieMeas> getAltTieMeas() {
		if (altTieMeas == null) {
			altTieMeas = new EObjectWithInverseResolvingEList<AltTieMeas>(AltTieMeas.class, this, MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS, ControlAreaPackage.ALT_TIE_MEAS__ANALOG_VALUE);
		}
		return altTieMeas;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.ANALOG_VALUE__ANALOG, oldAnalog, analog));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG_VALUE__ANALOG, oldAnalog, newAnalog);
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
				msgs = ((InternalEObject)analog).eInverseRemove(this, MeasPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs);
			if (newAnalog != null)
				msgs = ((InternalEObject)newAnalog).eInverseAdd(this, MeasPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs);
			msgs = basicSetAnalog(newAnalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ANALOG_VALUE__ANALOG, newAnalog, newAnalog));
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
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAltGeneratingUnit()).basicAdd(otherEnd, msgs);
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAltTieMeas()).basicAdd(otherEnd, msgs);
			case MeasPackage.ANALOG_VALUE__ANALOG:
				if (analog != null)
					msgs = ((InternalEObject)analog).eInverseRemove(this, MeasPackage.ANALOG__ANALOG_VALUES, Analog.class, msgs);
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
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				return ((InternalEList<?>)getAltGeneratingUnit()).basicRemove(otherEnd, msgs);
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				return ((InternalEList<?>)getAltTieMeas()).basicRemove(otherEnd, msgs);
			case MeasPackage.ANALOG_VALUE__ANALOG:
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
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				return getAltGeneratingUnit();
			case MeasPackage.ANALOG_VALUE__VALUE:
				return getValue();
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				return getAltTieMeas();
			case MeasPackage.ANALOG_VALUE__ANALOG:
				if (resolve) return getAnalog();
				return basicGetAnalog();
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
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				getAltGeneratingUnit().clear();
				getAltGeneratingUnit().addAll((Collection<? extends AltGeneratingUnitMeas>)newValue);
				return;
			case MeasPackage.ANALOG_VALUE__VALUE:
				setValue((Float)newValue);
				return;
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				getAltTieMeas().clear();
				getAltTieMeas().addAll((Collection<? extends AltTieMeas>)newValue);
				return;
			case MeasPackage.ANALOG_VALUE__ANALOG:
				setAnalog((Analog)newValue);
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
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				getAltGeneratingUnit().clear();
				return;
			case MeasPackage.ANALOG_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				getAltTieMeas().clear();
				return;
			case MeasPackage.ANALOG_VALUE__ANALOG:
				setAnalog((Analog)null);
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
			case MeasPackage.ANALOG_VALUE__ALT_GENERATING_UNIT:
				return altGeneratingUnit != null && !altGeneratingUnit.isEmpty();
			case MeasPackage.ANALOG_VALUE__VALUE:
				return value != VALUE_EDEFAULT;
			case MeasPackage.ANALOG_VALUE__ALT_TIE_MEAS:
				return altTieMeas != null && !altTieMeas.isEmpty();
			case MeasPackage.ANALOG_VALUE__ANALOG:
				return analog != null;
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

} //AnalogValueImpl
