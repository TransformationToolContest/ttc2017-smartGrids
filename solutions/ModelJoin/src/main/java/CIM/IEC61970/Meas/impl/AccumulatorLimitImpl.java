/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Meas.AccumulatorLimit;
import CIM.IEC61970.Meas.AccumulatorLimitSet;
import CIM.IEC61970.Meas.MeasPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.AccumulatorLimitImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.AccumulatorLimitImpl#getLimitSet <em>Limit Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorLimitImpl extends LimitImpl implements AccumulatorLimit {
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
	 * The cached value of the '{@link #getLimitSet() <em>Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitSet()
	 * @generated
	 * @ordered
	 */
	protected AccumulatorLimitSet limitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccumulatorLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.ACCUMULATOR_LIMIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ACCUMULATOR_LIMIT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorLimitSet getLimitSet() {
		if (limitSet != null && limitSet.eIsProxy()) {
			InternalEObject oldLimitSet = (InternalEObject)limitSet;
			limitSet = (AccumulatorLimitSet)eResolveProxy(oldLimitSet);
			if (limitSet != oldLimitSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET, oldLimitSet, limitSet));
			}
		}
		return limitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorLimitSet basicGetLimitSet() {
		return limitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimitSet(AccumulatorLimitSet newLimitSet, NotificationChain msgs) {
		AccumulatorLimitSet oldLimitSet = limitSet;
		limitSet = newLimitSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET, oldLimitSet, newLimitSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitSet(AccumulatorLimitSet newLimitSet) {
		if (newLimitSet != limitSet) {
			NotificationChain msgs = null;
			if (limitSet != null)
				msgs = ((InternalEObject)limitSet).eInverseRemove(this, MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS, AccumulatorLimitSet.class, msgs);
			if (newLimitSet != null)
				msgs = ((InternalEObject)newLimitSet).eInverseAdd(this, MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS, AccumulatorLimitSet.class, msgs);
			msgs = basicSetLimitSet(newLimitSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET, newLimitSet, newLimitSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
				if (limitSet != null)
					msgs = ((InternalEObject)limitSet).eInverseRemove(this, MeasPackage.ACCUMULATOR_LIMIT_SET__LIMITS, AccumulatorLimitSet.class, msgs);
				return basicSetLimitSet((AccumulatorLimitSet)otherEnd, msgs);
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
			case MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
				return basicSetLimitSet(null, msgs);
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
			case MeasPackage.ACCUMULATOR_LIMIT__VALUE:
				return getValue();
			case MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
				if (resolve) return getLimitSet();
				return basicGetLimitSet();
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
			case MeasPackage.ACCUMULATOR_LIMIT__VALUE:
				setValue((Integer)newValue);
				return;
			case MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
				setLimitSet((AccumulatorLimitSet)newValue);
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
			case MeasPackage.ACCUMULATOR_LIMIT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
				setLimitSet((AccumulatorLimitSet)null);
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
			case MeasPackage.ACCUMULATOR_LIMIT__VALUE:
				return value != VALUE_EDEFAULT;
			case MeasPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
				return limitSet != null;
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

} //AccumulatorLimitImpl
