/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitSet;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitImpl#getType <em>Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitImpl#getOperationalLimitType <em>Operational Limit Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalLimitImpl extends IdentifiedObjectImpl implements OperationalLimit {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitSet()
	 * @generated
	 * @ordered
	 */
	protected OperationalLimitSet operationalLimitSet;

	/**
	 * The cached value of the '{@link #getOperationalLimitType() <em>Operational Limit Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimitType()
	 * @generated
	 * @ordered
	 */
	protected OperationalLimitType operationalLimitType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.OPERATIONAL_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet getOperationalLimitSet() {
		if (operationalLimitSet != null && operationalLimitSet.eIsProxy()) {
			InternalEObject oldOperationalLimitSet = (InternalEObject)operationalLimitSet;
			operationalLimitSet = (OperationalLimitSet)eResolveProxy(oldOperationalLimitSet);
			if (operationalLimitSet != oldOperationalLimitSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, oldOperationalLimitSet, operationalLimitSet));
			}
		}
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitSet basicGetOperationalLimitSet() {
		return operationalLimitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalLimitSet(OperationalLimitSet newOperationalLimitSet, NotificationChain msgs) {
		OperationalLimitSet oldOperationalLimitSet = operationalLimitSet;
		operationalLimitSet = newOperationalLimitSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, oldOperationalLimitSet, newOperationalLimitSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalLimitSet(OperationalLimitSet newOperationalLimitSet) {
		if (newOperationalLimitSet != operationalLimitSet) {
			NotificationChain msgs = null;
			if (operationalLimitSet != null)
				msgs = ((InternalEObject)operationalLimitSet).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
			if (newOperationalLimitSet != null)
				msgs = ((InternalEObject)newOperationalLimitSet).eInverseAdd(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
			msgs = basicSetOperationalLimitSet(newOperationalLimitSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET, newOperationalLimitSet, newOperationalLimitSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitType getOperationalLimitType() {
		if (operationalLimitType != null && operationalLimitType.eIsProxy()) {
			InternalEObject oldOperationalLimitType = (InternalEObject)operationalLimitType;
			operationalLimitType = (OperationalLimitType)eResolveProxy(oldOperationalLimitType);
			if (operationalLimitType != oldOperationalLimitType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE, oldOperationalLimitType, operationalLimitType));
			}
		}
		return operationalLimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitType basicGetOperationalLimitType() {
		return operationalLimitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalLimitType(OperationalLimitType newOperationalLimitType, NotificationChain msgs) {
		OperationalLimitType oldOperationalLimitType = operationalLimitType;
		operationalLimitType = newOperationalLimitType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE, oldOperationalLimitType, newOperationalLimitType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalLimitType(OperationalLimitType newOperationalLimitType) {
		if (newOperationalLimitType != operationalLimitType) {
			NotificationChain msgs = null;
			if (operationalLimitType != null)
				msgs = ((InternalEObject)operationalLimitType).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs);
			if (newOperationalLimitType != null)
				msgs = ((InternalEObject)newOperationalLimitType).eInverseAdd(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs);
			msgs = basicSetOperationalLimitType(newOperationalLimitType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE, newOperationalLimitType, newOperationalLimitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				if (operationalLimitSet != null)
					msgs = ((InternalEObject)operationalLimitSet).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_SET__OPERATIONAL_LIMIT_VALUE, OperationalLimitSet.class, msgs);
				return basicSetOperationalLimitSet((OperationalLimitSet)otherEnd, msgs);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				if (operationalLimitType != null)
					msgs = ((InternalEObject)operationalLimitType).eInverseRemove(this, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitType.class, msgs);
				return basicSetOperationalLimitType((OperationalLimitType)otherEnd, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				return basicSetOperationalLimitSet(null, msgs);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				return basicSetOperationalLimitType(null, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE:
				return getType();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				if (resolve) return getOperationalLimitSet();
				return basicGetOperationalLimitSet();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				if (resolve) return getOperationalLimitType();
				return basicGetOperationalLimitType();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE:
				setType((String)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				setOperationalLimitSet((OperationalLimitSet)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				setOperationalLimitType((OperationalLimitType)newValue);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				setOperationalLimitSet((OperationalLimitSet)null);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				setOperationalLimitType((OperationalLimitType)null);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_SET:
				return operationalLimitSet != null;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE:
				return operationalLimitType != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OperationalLimitImpl
