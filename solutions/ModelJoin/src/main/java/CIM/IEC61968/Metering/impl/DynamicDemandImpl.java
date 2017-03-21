/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Metering.DemandKind;
import CIM.IEC61968.Metering.DynamicDemand;
import CIM.IEC61968.Metering.MeteringPackage;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.DynamicDemandImpl#getSubInterval <em>Sub Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.DynamicDemandImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.DynamicDemandImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicDemandImpl extends ElementImpl implements DynamicDemand {
	/**
	 * The default value of the '{@link #getSubInterval() <em>Sub Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float SUB_INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSubInterval() <em>Sub Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubInterval()
	 * @generated
	 * @ordered
	 */
	protected float subInterval = SUB_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERVAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected float interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DemandKind KIND_EDEFAULT = DemandKind.ROLLING_BLOCK;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DemandKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicDemandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.DYNAMIC_DEMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSubInterval() {
		return subInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubInterval(float newSubInterval) {
		float oldSubInterval = subInterval;
		subInterval = newSubInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL, oldSubInterval, subInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(float newInterval) {
		float oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.DYNAMIC_DEMAND__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemandKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DemandKind newKind) {
		DemandKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.DYNAMIC_DEMAND__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL:
				return getSubInterval();
			case MeteringPackage.DYNAMIC_DEMAND__INTERVAL:
				return getInterval();
			case MeteringPackage.DYNAMIC_DEMAND__KIND:
				return getKind();
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
			case MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL:
				setSubInterval((Float)newValue);
				return;
			case MeteringPackage.DYNAMIC_DEMAND__INTERVAL:
				setInterval((Float)newValue);
				return;
			case MeteringPackage.DYNAMIC_DEMAND__KIND:
				setKind((DemandKind)newValue);
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
			case MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL:
				setSubInterval(SUB_INTERVAL_EDEFAULT);
				return;
			case MeteringPackage.DYNAMIC_DEMAND__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case MeteringPackage.DYNAMIC_DEMAND__KIND:
				setKind(KIND_EDEFAULT);
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
			case MeteringPackage.DYNAMIC_DEMAND__SUB_INTERVAL:
				return subInterval != SUB_INTERVAL_EDEFAULT;
			case MeteringPackage.DYNAMIC_DEMAND__INTERVAL:
				return interval != INTERVAL_EDEFAULT;
			case MeteringPackage.DYNAMIC_DEMAND__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (subInterval: ");
		result.append(subInterval);
		result.append(", interval: ");
		result.append(interval);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //DynamicDemandImpl
