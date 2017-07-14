/**
 */
package gluemodel.CIM.IEC61970.Core.impl;

import gluemodel.CIM.IEC61970.Core.CorePackage;
import gluemodel.CIM.IEC61970.Core.RegularIntervalSchedule;
import gluemodel.CIM.IEC61970.Core.RegularTimePoint;

import gluemodel.CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Time Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.RegularTimePointImpl#getIntervalSchedule <em>Interval Schedule</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.RegularTimePointImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.RegularTimePointImpl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Core.impl.RegularTimePointImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegularTimePointImpl extends ElementImpl implements RegularTimePoint {
	/**
	 * The cached value of the '{@link #getIntervalSchedule() <em>Interval Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalSchedule()
	 * @generated
	 * @ordered
	 */
	protected RegularIntervalSchedule intervalSchedule;

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
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularTimePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REGULAR_TIME_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularIntervalSchedule getIntervalSchedule() {
		if (intervalSchedule != null && intervalSchedule.eIsProxy()) {
			InternalEObject oldIntervalSchedule = (InternalEObject)intervalSchedule;
			intervalSchedule = (RegularIntervalSchedule)eResolveProxy(oldIntervalSchedule);
			if (intervalSchedule != oldIntervalSchedule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE, oldIntervalSchedule, intervalSchedule));
			}
		}
		return intervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularIntervalSchedule basicGetIntervalSchedule() {
		return intervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalSchedule(RegularIntervalSchedule newIntervalSchedule, NotificationChain msgs) {
		RegularIntervalSchedule oldIntervalSchedule = intervalSchedule;
		intervalSchedule = newIntervalSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE, oldIntervalSchedule, newIntervalSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalSchedule(RegularIntervalSchedule newIntervalSchedule) {
		if (newIntervalSchedule != intervalSchedule) {
			NotificationChain msgs = null;
			if (intervalSchedule != null)
				msgs = ((InternalEObject)intervalSchedule).eInverseRemove(this, CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS, RegularIntervalSchedule.class, msgs);
			if (newIntervalSchedule != null)
				msgs = ((InternalEObject)newIntervalSchedule).eInverseAdd(this, CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS, RegularIntervalSchedule.class, msgs);
			msgs = basicSetIntervalSchedule(newIntervalSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE, newIntervalSchedule, newIntervalSchedule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REGULAR_TIME_POINT__VALUE1, oldValue1, value1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REGULAR_TIME_POINT__VALUE2, oldValue2, value2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REGULAR_TIME_POINT__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				if (intervalSchedule != null)
					msgs = ((InternalEObject)intervalSchedule).eInverseRemove(this, CorePackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS, RegularIntervalSchedule.class, msgs);
				return basicSetIntervalSchedule((RegularIntervalSchedule)otherEnd, msgs);
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
			case CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE:
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
			case CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				if (resolve) return getIntervalSchedule();
				return basicGetIntervalSchedule();
			case CorePackage.REGULAR_TIME_POINT__VALUE1:
				return getValue1();
			case CorePackage.REGULAR_TIME_POINT__VALUE2:
				return getValue2();
			case CorePackage.REGULAR_TIME_POINT__SEQUENCE_NUMBER:
				return getSequenceNumber();
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
			case CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				setIntervalSchedule((RegularIntervalSchedule)newValue);
				return;
			case CorePackage.REGULAR_TIME_POINT__VALUE1:
				setValue1((Float)newValue);
				return;
			case CorePackage.REGULAR_TIME_POINT__VALUE2:
				setValue2((Float)newValue);
				return;
			case CorePackage.REGULAR_TIME_POINT__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
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
			case CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				setIntervalSchedule((RegularIntervalSchedule)null);
				return;
			case CorePackage.REGULAR_TIME_POINT__VALUE1:
				setValue1(VALUE1_EDEFAULT);
				return;
			case CorePackage.REGULAR_TIME_POINT__VALUE2:
				setValue2(VALUE2_EDEFAULT);
				return;
			case CorePackage.REGULAR_TIME_POINT__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
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
			case CorePackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE:
				return intervalSchedule != null;
			case CorePackage.REGULAR_TIME_POINT__VALUE1:
				return value1 != VALUE1_EDEFAULT;
			case CorePackage.REGULAR_TIME_POINT__VALUE2:
				return value2 != VALUE2_EDEFAULT;
			case CorePackage.REGULAR_TIME_POINT__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
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
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(')');
		return result.toString();
	}

} //RegularTimePointImpl
