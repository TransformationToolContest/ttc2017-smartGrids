/**
 */
package CIM.IEC61970.Meas.impl;

import CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import CIM.IEC61970.Meas.MeasPackage;
import CIM.IEC61970.Meas.ValueAliasSet;
import CIM.IEC61970.Meas.ValueToAlias;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value To Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Meas.impl.ValueToAliasImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CIM.IEC61970.Meas.impl.ValueToAliasImpl#getValueAliasSet <em>Value Alias Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueToAliasImpl extends IdentifiedObjectImpl implements ValueToAlias {
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
	 * The cached value of the '{@link #getValueAliasSet() <em>Value Alias Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAliasSet()
	 * @generated
	 * @ordered
	 */
	protected ValueAliasSet valueAliasSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueToAliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasPackage.Literals.VALUE_TO_ALIAS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.VALUE_TO_ALIAS__VALUE, oldValue, value));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET, oldValueAliasSet, valueAliasSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET, oldValueAliasSet, newValueAliasSet);
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
				msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__VALUES, ValueAliasSet.class, msgs);
			if (newValueAliasSet != null)
				msgs = ((InternalEObject)newValueAliasSet).eInverseAdd(this, MeasPackage.VALUE_ALIAS_SET__VALUES, ValueAliasSet.class, msgs);
			msgs = basicSetValueAliasSet(newValueAliasSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET, newValueAliasSet, newValueAliasSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
				if (valueAliasSet != null)
					msgs = ((InternalEObject)valueAliasSet).eInverseRemove(this, MeasPackage.VALUE_ALIAS_SET__VALUES, ValueAliasSet.class, msgs);
				return basicSetValueAliasSet((ValueAliasSet)otherEnd, msgs);
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
			case MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
				return basicSetValueAliasSet(null, msgs);
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
			case MeasPackage.VALUE_TO_ALIAS__VALUE:
				return getValue();
			case MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
				if (resolve) return getValueAliasSet();
				return basicGetValueAliasSet();
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
			case MeasPackage.VALUE_TO_ALIAS__VALUE:
				setValue((Integer)newValue);
				return;
			case MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)newValue);
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
			case MeasPackage.VALUE_TO_ALIAS__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
				setValueAliasSet((ValueAliasSet)null);
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
			case MeasPackage.VALUE_TO_ALIAS__VALUE:
				return value != VALUE_EDEFAULT;
			case MeasPackage.VALUE_TO_ALIAS__VALUE_ALIAS_SET:
				return valueAliasSet != null;
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

} //ValueToAliasImpl
