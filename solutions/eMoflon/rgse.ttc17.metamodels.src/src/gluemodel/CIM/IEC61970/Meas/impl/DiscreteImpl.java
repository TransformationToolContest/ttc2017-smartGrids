/**
 */
package gluemodel.CIM.IEC61970.Meas.impl;

import gluemodel.CIM.IEC61970.Meas.Command;
import gluemodel.CIM.IEC61970.Meas.Discrete;
import gluemodel.CIM.IEC61970.Meas.DiscreteValue;
import gluemodel.CIM.IEC61970.Meas.MeasPackage;
import gluemodel.CIM.IEC61970.Meas.ValueAliasSet;

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
 * An implementation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.DiscreteImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.DiscreteImpl#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.DiscreteImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.DiscreteImpl#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.DiscreteImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Meas.impl.DiscreteImpl#getDiscreteValues <em>Discrete Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteImpl extends MeasurementImpl implements Discrete {
	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected int minValue = MIN_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Command command;

	/**
	 * The cached value of the '{@link #getDiscreteValues() <em>Discrete Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteValue> discreteValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.DISCRETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(int newMinValue) {
		int oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE__MIN_VALUE, oldMinValue, minValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.DISCRETE__VALUE_ALIAS_SET, oldValueAliasSet, valueAliasSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE__VALUE_ALIAS_SET, oldValueAliasSet, newValueAliasSet);
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
				msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs);
			if (newValueAliasSet != null)
				msgs = ((InternalEObject)newValueAliasSet).eInverseAdd(this, MeasPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs);
			msgs = basicSetValueAliasSet(newValueAliasSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE__VALUE_ALIAS_SET, newValueAliasSet, newValueAliasSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		int oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE__MAX_VALUE, oldMaxValue, maxValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE__NORMAL_VALUE, oldNormalValue, normalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getCommand() {
		if (command != null && command.eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject)command;
			command = (Command)eResolveProxy(oldCommand);
			if (command != oldCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.DISCRETE__COMMAND, oldCommand, command));
			}
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(Command newCommand, NotificationChain msgs) {
		Command oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE__COMMAND, oldCommand, newCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(Command newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, MeasPackage.COMMAND__DISCRETE, Command.class, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, MeasPackage.COMMAND__DISCRETE, Command.class, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.DISCRETE__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteValue> getDiscreteValues() {
		if (discreteValues == null) {
			discreteValues = new EObjectWithInverseResolvingEList<DiscreteValue>(DiscreteValue.class, this, MeasPackage.DISCRETE__DISCRETE_VALUES, MeasPackage.DISCRETE_VALUE__DISCRETE);
		}
		return discreteValues;
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
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				if (valueAliasSet != null)
					msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs);
				return basicSetValueAliasSet((ValueAliasSet)otherEnd, msgs);
			case MeasPackage.DISCRETE__COMMAND:
				if (command != null)
					msgs = ((InternalEObject)command).eInverseRemove(this, MeasPackage.COMMAND__DISCRETE, Command.class, msgs);
				return basicSetCommand((Command)otherEnd, msgs);
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiscreteValues()).basicAdd(otherEnd, msgs);
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
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				return basicSetValueAliasSet(null, msgs);
			case MeasPackage.DISCRETE__COMMAND:
				return basicSetCommand(null, msgs);
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				return ((InternalEList<?>)getDiscreteValues()).basicRemove(otherEnd, msgs);
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
			case MeasPackage.DISCRETE__MIN_VALUE:
				return getMinValue();
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				if (resolve) return getValueAliasSet();
				return basicGetValueAliasSet();
			case MeasPackage.DISCRETE__MAX_VALUE:
				return getMaxValue();
			case MeasPackage.DISCRETE__NORMAL_VALUE:
				return getNormalValue();
			case MeasPackage.DISCRETE__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				return getDiscreteValues();
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
			case MeasPackage.DISCRETE__MIN_VALUE:
				setMinValue((Integer)newValue);
				return;
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)newValue);
				return;
			case MeasPackage.DISCRETE__MAX_VALUE:
				setMaxValue((Integer)newValue);
				return;
			case MeasPackage.DISCRETE__NORMAL_VALUE:
				setNormalValue((Integer)newValue);
				return;
			case MeasPackage.DISCRETE__COMMAND:
				setCommand((Command)newValue);
				return;
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				getDiscreteValues().clear();
				getDiscreteValues().addAll((Collection<? extends DiscreteValue>)newValue);
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
			case MeasPackage.DISCRETE__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)null);
				return;
			case MeasPackage.DISCRETE__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case MeasPackage.DISCRETE__NORMAL_VALUE:
				setNormalValue(NORMAL_VALUE_EDEFAULT);
				return;
			case MeasPackage.DISCRETE__COMMAND:
				setCommand((Command)null);
				return;
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				getDiscreteValues().clear();
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
			case MeasPackage.DISCRETE__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case MeasPackage.DISCRETE__VALUE_ALIAS_SET:
				return valueAliasSet != null;
			case MeasPackage.DISCRETE__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case MeasPackage.DISCRETE__NORMAL_VALUE:
				return normalValue != NORMAL_VALUE_EDEFAULT;
			case MeasPackage.DISCRETE__COMMAND:
				return command != null;
			case MeasPackage.DISCRETE__DISCRETE_VALUES:
				return discreteValues != null && !discreteValues.isEmpty();
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
		result.append(" (minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", normalValue: ");
		result.append(normalValue);
		result.append(')');
		return result.toString();
	}

} //DiscreteImpl
