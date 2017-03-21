/**
 */
package CIM.IEC61970.Generation.Production.impl;

import CIM.IEC61970.Core.impl.CurveImpl;

import CIM.IEC61970.Generation.Production.ProductionPackage;
import CIM.IEC61970.Generation.Production.Reservoir;
import CIM.IEC61970.Generation.Production.TargetLevelSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Level Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.TargetLevelScheduleImpl#getReservoir <em>Reservoir</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.TargetLevelScheduleImpl#getHighLevelLimit <em>High Level Limit</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.impl.TargetLevelScheduleImpl#getLowLevelLimit <em>Low Level Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetLevelScheduleImpl extends CurveImpl implements TargetLevelSchedule {
	/**
	 * The cached value of the '{@link #getReservoir() <em>Reservoir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservoir()
	 * @generated
	 * @ordered
	 */
	protected Reservoir reservoir;

	/**
	 * The default value of the '{@link #getHighLevelLimit() <em>High Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLevelLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float HIGH_LEVEL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHighLevelLimit() <em>High Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighLevelLimit()
	 * @generated
	 * @ordered
	 */
	protected float highLevelLimit = HIGH_LEVEL_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowLevelLimit() <em>Low Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLevelLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float LOW_LEVEL_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowLevelLimit() <em>Low Level Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowLevelLimit()
	 * @generated
	 * @ordered
	 */
	protected float lowLevelLimit = LOW_LEVEL_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetLevelScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductionPackage.Literals.TARGET_LEVEL_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir getReservoir() {
		if (reservoir != null && reservoir.eIsProxy()) {
			InternalEObject oldReservoir = (InternalEObject)reservoir;
			reservoir = (Reservoir)eResolveProxy(oldReservoir);
			if (reservoir != oldReservoir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, oldReservoir, reservoir));
			}
		}
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir basicGetReservoir() {
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservoir(Reservoir newReservoir, NotificationChain msgs) {
		Reservoir oldReservoir = reservoir;
		reservoir = newReservoir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, oldReservoir, newReservoir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservoir(Reservoir newReservoir) {
		if (newReservoir != reservoir) {
			NotificationChain msgs = null;
			if (reservoir != null)
				msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs);
			if (newReservoir != null)
				msgs = ((InternalEObject)newReservoir).eInverseAdd(this, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs);
			msgs = basicSetReservoir(newReservoir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, newReservoir, newReservoir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHighLevelLimit() {
		return highLevelLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighLevelLimit(float newHighLevelLimit) {
		float oldHighLevelLimit = highLevelLimit;
		highLevelLimit = newHighLevelLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT, oldHighLevelLimit, highLevelLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowLevelLimit() {
		return lowLevelLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowLevelLimit(float newLowLevelLimit) {
		float oldLowLevelLimit = lowLevelLimit;
		lowLevelLimit = newLowLevelLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT, oldLowLevelLimit, lowLevelLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				if (reservoir != null)
					msgs = ((InternalEObject)reservoir).eInverseRemove(this, ProductionPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs);
				return basicSetReservoir((Reservoir)otherEnd, msgs);
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				return basicSetReservoir(null, msgs);
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				if (resolve) return getReservoir();
				return basicGetReservoir();
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
				return getHighLevelLimit();
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
				return getLowLevelLimit();
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				setReservoir((Reservoir)newValue);
				return;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
				setHighLevelLimit((Float)newValue);
				return;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
				setLowLevelLimit((Float)newValue);
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				setReservoir((Reservoir)null);
				return;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
				setHighLevelLimit(HIGH_LEVEL_LIMIT_EDEFAULT);
				return;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
				setLowLevelLimit(LOW_LEVEL_LIMIT_EDEFAULT);
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
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
				return reservoir != null;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
				return highLevelLimit != HIGH_LEVEL_LIMIT_EDEFAULT;
			case ProductionPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
				return lowLevelLimit != LOW_LEVEL_LIMIT_EDEFAULT;
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
		result.append(" (highLevelLimit: ");
		result.append(highLevelLimit);
		result.append(", lowLevelLimit: ");
		result.append(lowLevelLimit);
		result.append(')');
		return result.toString();
	}

} //TargetLevelScheduleImpl
