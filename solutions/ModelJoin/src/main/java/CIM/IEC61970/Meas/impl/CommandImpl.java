/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Meas.Command;
import CIM.IEC61970.Meas.Discrete;
import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.ValueAliasSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.CommandImpl#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.CommandImpl#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.CommandImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.CommandImpl#getDiscrete <em>Discrete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends ControlImpl implements Command {
	/**
	 * The default value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected static final int NORMAL_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected int normalValue = NORMAL_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueAliasSet() <em>Value Alias Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAliasSet()
	 * @generated
	 * @ordered
	 */
	protected ValueAliasSet valueAliasSet;

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
	 * The cached value of the '{@link #getDiscrete() <em>Discrete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscrete()
	 * @generated
	 * @ordered
	 */
	protected Discrete discrete;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNormalValue() {
		return normalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalValue(int newNormalValue) {
		int oldNormalValue = normalValue;
		normalValue = newNormalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.COMMAND__NORMAL_VALUE, oldNormalValue, normalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAliasSet getValueAliasSet() {
		if (valueAliasSet != null && valueAliasSet.eIsProxy()) {
			InternalEObject oldValueAliasSet = (InternalEObject)valueAliasSet;
			valueAliasSet = (ValueAliasSet)eResolveProxy(oldValueAliasSet);
			if (valueAliasSet != oldValueAliasSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.COMMAND__VALUE_ALIAS_SET, oldValueAliasSet, valueAliasSet));
			}
		}
		return valueAliasSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueAliasSet basicGetValueAliasSet() {
		return valueAliasSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAliasSet(ValueAliasSet newValueAliasSet, NotificationChain msgs) {
		ValueAliasSet oldValueAliasSet = valueAliasSet;
		valueAliasSet = newValueAliasSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.COMMAND__VALUE_ALIAS_SET, oldValueAliasSet, newValueAliasSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAliasSet(ValueAliasSet newValueAliasSet) {
		if (newValueAliasSet != valueAliasSet) {
			NotificationChain msgs = null;
			if (valueAliasSet != null)
				msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs);
			if (newValueAliasSet != null)
				msgs = ((InternalEObject)newValueAliasSet).eInverseAdd(this, MeasPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs);
			msgs = basicSetValueAliasSet(newValueAliasSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.COMMAND__VALUE_ALIAS_SET, newValueAliasSet, newValueAliasSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.COMMAND__VALUE, oldValue, value));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.COMMAND__DISCRETE, oldDiscrete, discrete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.COMMAND__DISCRETE, oldDiscrete, newDiscrete);
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
				msgs = ((InternalEObject)discrete).eInverseRemove(this, MeasPackage.DISCRETE__COMMAND, Discrete.class, msgs);
			if (newDiscrete != null)
				msgs = ((InternalEObject)newDiscrete).eInverseAdd(this, MeasPackage.DISCRETE__COMMAND, Discrete.class, msgs);
			msgs = basicSetDiscrete(newDiscrete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.COMMAND__DISCRETE, newDiscrete, newDiscrete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				if (valueAliasSet != null)
					msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__COMMANDS, ValueAliasSet.class, msgs);
				return basicSetValueAliasSet((ValueAliasSet)otherEnd, msgs);
			case MeasPackage.COMMAND__DISCRETE:
				if (discrete != null)
					msgs = ((InternalEObject)discrete).eInverseRemove(this, MeasPackage.DISCRETE__COMMAND, Discrete.class, msgs);
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
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				return basicSetValueAliasSet(null, msgs);
			case MeasPackage.COMMAND__DISCRETE:
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
			case MeasPackage.COMMAND__NORMAL_VALUE:
				return getNormalValue();
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				if (resolve) return getValueAliasSet();
				return basicGetValueAliasSet();
			case MeasPackage.COMMAND__VALUE:
				return getValue();
			case MeasPackage.COMMAND__DISCRETE:
				if (resolve) return getDiscrete();
				return basicGetDiscrete();
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
			case MeasPackage.COMMAND__NORMAL_VALUE:
				setNormalValue((Integer)newValue);
				return;
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)newValue);
				return;
			case MeasPackage.COMMAND__VALUE:
				setValue((Integer)newValue);
				return;
			case MeasPackage.COMMAND__DISCRETE:
				setDiscrete((Discrete)newValue);
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
			case MeasPackage.COMMAND__NORMAL_VALUE:
				setNormalValue(NORMAL_VALUE_EDEFAULT);
				return;
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)null);
				return;
			case MeasPackage.COMMAND__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeasPackage.COMMAND__DISCRETE:
				setDiscrete((Discrete)null);
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
			case MeasPackage.COMMAND__NORMAL_VALUE:
				return normalValue != NORMAL_VALUE_EDEFAULT;
			case MeasPackage.COMMAND__VALUE_ALIAS_SET:
				return valueAliasSet != null;
			case MeasPackage.COMMAND__VALUE:
				return value != VALUE_EDEFAULT;
			case MeasPackage.COMMAND__DISCRETE:
				return discrete != null;
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
		result.append(')');
		return result.toString();
	}

} //CommandImpl
