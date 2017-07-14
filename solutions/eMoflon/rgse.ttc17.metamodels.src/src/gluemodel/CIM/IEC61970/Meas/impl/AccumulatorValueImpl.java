/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Meas.Accumulator;
import gluemodel.CIM.IEC61970.Meas.AccumulatorValue;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AccumulatorValueImpl#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.AccumulatorValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorValueImpl extends MeasurementValueImpl implements AccumulatorValue {
	/**
	 * The cached value of the '{@link #getAccumulator() <em>Accumulator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulator()
	 * @generated
	 * @ordered
	 */
	protected Accumulator accumulator;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccumulatorValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ACCUMULATOR_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator getAccumulator() {
		if (accumulator != null && accumulator.eIsProxy()) {
			InternalEObject oldAccumulator = (InternalEObject)accumulator;
			accumulator = (Accumulator)eResolveProxy(oldAccumulator);
			if (accumulator != oldAccumulator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR, oldAccumulator, accumulator));
			}
		}
		return accumulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator basicGetAccumulator() {
		return accumulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccumulator(Accumulator newAccumulator, NotificationChain msgs) {
		Accumulator oldAccumulator = accumulator;
		accumulator = newAccumulator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR, oldAccumulator, newAccumulator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccumulator(Accumulator newAccumulator) {
		if (newAccumulator != accumulator) {
			NotificationChain msgs = null;
			if (accumulator != null)
				msgs = ((InternalEObject)accumulator).eInverseRemove(this, MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES, Accumulator.class, msgs);
			if (newAccumulator != null)
				msgs = ((InternalEObject)newAccumulator).eInverseAdd(this, MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES, Accumulator.class, msgs);
			msgs = basicSetAccumulator(newAccumulator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR, newAccumulator, newAccumulator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ACCUMULATOR_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
				if (accumulator != null)
					msgs = ((InternalEObject)accumulator).eInverseRemove(this, MeasPackage.ACCUMULATOR__ACCUMULATOR_VALUES, Accumulator.class, msgs);
				return basicSetAccumulator((Accumulator)otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
				return basicSetAccumulator(null, msgs);
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
			case MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
				if (resolve) return getAccumulator();
				return basicGetAccumulator();
			case MeasPackage.ACCUMULATOR_VALUE__VALUE:
				return getValue();
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
			case MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
				setAccumulator((Accumulator)newValue);
				return;
			case MeasPackage.ACCUMULATOR_VALUE__VALUE:
				setValue((Integer)newValue);
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
			case MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
				setAccumulator((Accumulator)null);
				return;
			case MeasPackage.ACCUMULATOR_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case MeasPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
				return accumulator != null;
			case MeasPackage.ACCUMULATOR_VALUE__VALUE:
				return value != VALUE_EDEFAULT;
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

} //AccumulatorValueImpl
