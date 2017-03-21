/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Meas.Discrete;
import CIM.IEC61970.Meas.DiscreteValue;
import CIM.IEC61970.Meas.MeasPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.DiscreteValueImpl#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.DiscreteValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteValueImpl extends MeasurementValueImpl implements DiscreteValue {
	/**
	 * The cached value of the '{@link #getDiscrete() <em>Discrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrete()
	 * @generated
	 * @ordered
	 */
	protected Discrete discrete;

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
	protected DiscreteValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.DISCRETE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete getDiscrete() {
		if (discrete != null && discrete.eIsProxy()) {
			InternalEObject oldDiscrete = (InternalEObject)discrete;
			discrete = (Discrete)eResolveProxy(oldDiscrete);
			if (discrete != oldDiscrete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.DISCRETE_VALUE__DISCRETE, oldDiscrete, discrete));
			}
		}
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete basicGetDiscrete() {
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscrete(Discrete newDiscrete, NotificationChain msgs) {
		Discrete oldDiscrete = discrete;
		discrete = newDiscrete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE_VALUE__DISCRETE, oldDiscrete, newDiscrete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscrete(Discrete newDiscrete) {
		if (newDiscrete != discrete) {
			NotificationChain msgs = null;
			if (discrete != null)
				msgs = ((InternalEObject)discrete).eInverseRemove(this, MeasPackage.DISCRETE__DISCRETE_VALUES, Discrete.class, msgs);
			if (newDiscrete != null)
				msgs = ((InternalEObject)newDiscrete).eInverseAdd(this, MeasPackage.DISCRETE__DISCRETE_VALUES, Discrete.class, msgs);
			msgs = basicSetDiscrete(newDiscrete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE_VALUE__DISCRETE, newDiscrete, newDiscrete));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				if (discrete != null)
					msgs = ((InternalEObject)discrete).eInverseRemove(this, MeasPackage.DISCRETE__DISCRETE_VALUES, Discrete.class, msgs);
				return basicSetDiscrete((Discrete)otherEnd, msgs);
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				return basicSetDiscrete(null, msgs);
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				if (resolve) return getDiscrete();
				return basicGetDiscrete();
			case MeasPackage.DISCRETE_VALUE__VALUE:
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				setDiscrete((Discrete)newValue);
				return;
			case MeasPackage.DISCRETE_VALUE__VALUE:
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				setDiscrete((Discrete)null);
				return;
			case MeasPackage.DISCRETE_VALUE__VALUE:
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
			case MeasPackage.DISCRETE_VALUE__DISCRETE:
				return discrete != null;
			case MeasPackage.DISCRETE_VALUE__VALUE:
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

} //DiscreteValueImpl
