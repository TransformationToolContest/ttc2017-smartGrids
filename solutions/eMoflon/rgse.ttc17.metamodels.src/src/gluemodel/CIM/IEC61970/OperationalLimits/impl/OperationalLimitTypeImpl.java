/**
 */
package gluemodel.CIM.IEC61970.OperationalLimits.impl;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimit;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitDirectionKind;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitType;
import gluemodel.CIM.IEC61970.OperationalLimits.OperationalLimitsPackage;

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
 * An implementation of the model object '<em><b>Operational Limit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitTypeImpl#getAcceptableDuration <em>Acceptable Duration</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.OperationalLimits.impl.OperationalLimitTypeImpl#getOperationalLimit <em>Operational Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalLimitTypeImpl extends IdentifiedObjectImpl implements OperationalLimitType {
	/**
	 * The default value of the '{@link #getAcceptableDuration() <em>Acceptable Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float ACCEPTABLE_DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAcceptableDuration() <em>Acceptable Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableDuration()
	 * @generated
	 * @ordered
	 */
	protected float acceptableDuration = ACCEPTABLE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final OperationalLimitDirectionKind DIRECTION_EDEFAULT = OperationalLimitDirectionKind.HIGH;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected OperationalLimitDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationalLimit() <em>Operational Limit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalLimit()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalLimit> operationalLimit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalLimitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationalLimitsPackage.Literals.OPERATIONAL_LIMIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAcceptableDuration() {
		return acceptableDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptableDuration(float newAcceptableDuration) {
		float oldAcceptableDuration = acceptableDuration;
		acceptableDuration = newAcceptableDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION, oldAcceptableDuration, acceptableDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(OperationalLimitDirectionKind newDirection) {
		OperationalLimitDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalLimit> getOperationalLimit() {
		if (operationalLimit == null) {
			operationalLimit = new EObjectWithInverseResolvingEList<OperationalLimit>(OperationalLimit.class, this, OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT, OperationalLimitsPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE);
		}
		return operationalLimit;
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationalLimit()).basicAdd(otherEnd, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				return ((InternalEList<?>)getOperationalLimit()).basicRemove(otherEnd, msgs);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
				return getAcceptableDuration();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
				return getDirection();
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				return getOperationalLimit();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
				setAcceptableDuration((Float)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
				setDirection((OperationalLimitDirectionKind)newValue);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				getOperationalLimit().clear();
				getOperationalLimit().addAll((Collection<? extends OperationalLimit>)newValue);
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
				setAcceptableDuration(ACCEPTABLE_DURATION_EDEFAULT);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				getOperationalLimit().clear();
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
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
				return acceptableDuration != ACCEPTABLE_DURATION_EDEFAULT;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
				return operationalLimit != null && !operationalLimit.isEmpty();
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
		result.append(" (acceptableDuration: ");
		result.append(acceptableDuration);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //OperationalLimitTypeImpl
