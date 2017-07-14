/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.IrregularIntervalSchedule;
import gluemodel.CIM.IEC61970.Core.IrregularTimePoint;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Irregular Time Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IrregularTimePointImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IrregularTimePointImpl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IrregularTimePointImpl#getIntervalSchedule <em>Interval Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.IrregularTimePointImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IrregularTimePointImpl extends ElementImpl implements IrregularTimePoint {
	/**
	 * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
	protected float value1 = VALUE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue2() <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue2() <em>Value2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
	protected float value2 = VALUE2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntervalSchedule() <em>Interval Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalSchedule()
	 * @generated
	 * @ordered
	 */
	protected IrregularIntervalSchedule intervalSchedule;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected float time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IrregularTimePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IRREGULAR_TIME_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue1() {
		return value1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue1(float newValue1) {
		float oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IRREGULAR_TIME_POINT__VALUE1, oldValue1, value1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue2() {
		return value2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue2(float newValue2) {
		float oldValue2 = value2;
		value2 = newValue2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IRREGULAR_TIME_POINT__VALUE2, oldValue2, value2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularIntervalSchedule getIntervalSchedule() {
		if (intervalSchedule != null && intervalSchedule.eIsProxy()) {
			InternalEObject oldIntervalSchedule = (InternalEObject)intervalSchedule;
			intervalSchedule = (IrregularIntervalSchedule)eResolveProxy(oldIntervalSchedule);
			if (intervalSchedule != oldIntervalSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE, oldIntervalSchedule, intervalSchedule));
			}
		}
		return intervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IrregularIntervalSchedule basicGetIntervalSchedule() {
		return intervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalSchedule(IrregularIntervalSchedule newIntervalSchedule, NotificationChain msgs) {
		IrregularIntervalSchedule oldIntervalSchedule = intervalSchedule;
		intervalSchedule = newIntervalSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE, oldIntervalSchedule, newIntervalSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalSchedule(IrregularIntervalSchedule newIntervalSchedule) {
		if (newIntervalSchedule != intervalSchedule) {
			NotificationChain msgs = null;
			if (intervalSchedule != null)
				msgs = ((InternalEObject)intervalSchedule).eInverseRemove(this, CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs);
			if (newIntervalSchedule != null)
				msgs = ((InternalEObject)newIntervalSchedule).eInverseAdd(this, CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs);
			msgs = basicSetIntervalSchedule(newIntervalSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE, newIntervalSchedule, newIntervalSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(float newTime) {
		float oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IRREGULAR_TIME_POINT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				if (intervalSchedule != null)
					msgs = ((InternalEObject)intervalSchedule).eInverseRemove(this, CorePackage.IRREGULAR_INTERVAL_SCHEDULE__TIME_POINTS, IrregularIntervalSchedule.class, msgs);
				return basicSetIntervalSchedule((IrregularIntervalSchedule)otherEnd, msgs);
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
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				return basicSetIntervalSchedule(null, msgs);
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
			case CorePackage.IRREGULAR_TIME_POINT__VALUE1:
				return getValue1();
			case CorePackage.IRREGULAR_TIME_POINT__VALUE2:
				return getValue2();
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				if (resolve) return getIntervalSchedule();
				return basicGetIntervalSchedule();
			case CorePackage.IRREGULAR_TIME_POINT__TIME:
				return getTime();
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
			case CorePackage.IRREGULAR_TIME_POINT__VALUE1:
				setValue1((Float)newValue);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__VALUE2:
				setValue2((Float)newValue);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				setIntervalSchedule((IrregularIntervalSchedule)newValue);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__TIME:
				setTime((Float)newValue);
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
			case CorePackage.IRREGULAR_TIME_POINT__VALUE1:
				setValue1(VALUE1_EDEFAULT);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__VALUE2:
				setValue2(VALUE2_EDEFAULT);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				setIntervalSchedule((IrregularIntervalSchedule)null);
				return;
			case CorePackage.IRREGULAR_TIME_POINT__TIME:
				setTime(TIME_EDEFAULT);
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
			case CorePackage.IRREGULAR_TIME_POINT__VALUE1:
				return value1 != VALUE1_EDEFAULT;
			case CorePackage.IRREGULAR_TIME_POINT__VALUE2:
				return value2 != VALUE2_EDEFAULT;
			case CorePackage.IRREGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				return intervalSchedule != null;
			case CorePackage.IRREGULAR_TIME_POINT__TIME:
				return time != TIME_EDEFAULT;
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
		result.append(" (value1: ");
		result.append(value1);
		result.append(", value2: ");
		result.append(value2);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //IrregularTimePointImpl
