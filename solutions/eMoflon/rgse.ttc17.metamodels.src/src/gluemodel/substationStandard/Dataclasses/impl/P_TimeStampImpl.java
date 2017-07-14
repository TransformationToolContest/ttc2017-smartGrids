/**
 */
package gluemodel.substationStandard.Dataclasses.impl;

import gluemodel.substationStandard.Dataclasses.DataclassesPackage;
import gluemodel.substationStandard.Dataclasses.P_TimeStamp;
import gluemodel.substationStandard.Dataclasses.TimeQuality;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTime Stamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.P_TimeStampImpl#getSecondSinceEpoch <em>Second Since Epoch</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.P_TimeStampImpl#getFractionOfSecond <em>Fraction Of Second</em>}</li>
 *   <li>{@link gluemodel.substationStandard.Dataclasses.impl.P_TimeStampImpl#getTimeQuality <em>Time Quality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class P_TimeStampImpl extends MinimalEObjectImpl.Container implements P_TimeStamp {
	/**
	 * The default value of the '{@link #getSecondSinceEpoch() <em>Second Since Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondSinceEpoch()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_SINCE_EPOCH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecondSinceEpoch() <em>Second Since Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondSinceEpoch()
	 * @generated
	 * @ordered
	 */
	protected int secondSinceEpoch = SECOND_SINCE_EPOCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFractionOfSecond() <em>Fraction Of Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFractionOfSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int FRACTION_OF_SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFractionOfSecond() <em>Fraction Of Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFractionOfSecond()
	 * @generated
	 * @ordered
	 */
	protected int fractionOfSecond = FRACTION_OF_SECOND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeQuality() <em>Time Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeQuality()
	 * @generated
	 * @ordered
	 */
	protected TimeQuality timeQuality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected P_TimeStampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataclassesPackage.Literals.PTIME_STAMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondSinceEpoch() {
		return secondSinceEpoch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondSinceEpoch(int newSecondSinceEpoch) {
		int oldSecondSinceEpoch = secondSinceEpoch;
		secondSinceEpoch = newSecondSinceEpoch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.PTIME_STAMP__SECOND_SINCE_EPOCH, oldSecondSinceEpoch, secondSinceEpoch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFractionOfSecond() {
		return fractionOfSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFractionOfSecond(int newFractionOfSecond) {
		int oldFractionOfSecond = fractionOfSecond;
		fractionOfSecond = newFractionOfSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.PTIME_STAMP__FRACTION_OF_SECOND, oldFractionOfSecond, fractionOfSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeQuality getTimeQuality() {
		if (timeQuality != null && timeQuality.eIsProxy()) {
			InternalEObject oldTimeQuality = (InternalEObject)timeQuality;
			timeQuality = (TimeQuality)eResolveProxy(oldTimeQuality);
			if (timeQuality != oldTimeQuality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataclassesPackage.PTIME_STAMP__TIME_QUALITY, oldTimeQuality, timeQuality));
			}
		}
		return timeQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeQuality basicGetTimeQuality() {
		return timeQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeQuality(TimeQuality newTimeQuality) {
		TimeQuality oldTimeQuality = timeQuality;
		timeQuality = newTimeQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataclassesPackage.PTIME_STAMP__TIME_QUALITY, oldTimeQuality, timeQuality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataclassesPackage.PTIME_STAMP__SECOND_SINCE_EPOCH:
				return getSecondSinceEpoch();
			case DataclassesPackage.PTIME_STAMP__FRACTION_OF_SECOND:
				return getFractionOfSecond();
			case DataclassesPackage.PTIME_STAMP__TIME_QUALITY:
				if (resolve) return getTimeQuality();
				return basicGetTimeQuality();
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
			case DataclassesPackage.PTIME_STAMP__SECOND_SINCE_EPOCH:
				setSecondSinceEpoch((Integer)newValue);
				return;
			case DataclassesPackage.PTIME_STAMP__FRACTION_OF_SECOND:
				setFractionOfSecond((Integer)newValue);
				return;
			case DataclassesPackage.PTIME_STAMP__TIME_QUALITY:
				setTimeQuality((TimeQuality)newValue);
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
			case DataclassesPackage.PTIME_STAMP__SECOND_SINCE_EPOCH:
				setSecondSinceEpoch(SECOND_SINCE_EPOCH_EDEFAULT);
				return;
			case DataclassesPackage.PTIME_STAMP__FRACTION_OF_SECOND:
				setFractionOfSecond(FRACTION_OF_SECOND_EDEFAULT);
				return;
			case DataclassesPackage.PTIME_STAMP__TIME_QUALITY:
				setTimeQuality((TimeQuality)null);
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
			case DataclassesPackage.PTIME_STAMP__SECOND_SINCE_EPOCH:
				return secondSinceEpoch != SECOND_SINCE_EPOCH_EDEFAULT;
			case DataclassesPackage.PTIME_STAMP__FRACTION_OF_SECOND:
				return fractionOfSecond != FRACTION_OF_SECOND_EDEFAULT;
			case DataclassesPackage.PTIME_STAMP__TIME_QUALITY:
				return timeQuality != null;
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
		result.append(" (secondSinceEpoch: ");
		result.append(secondSinceEpoch);
		result.append(", fractionOfSecond: ");
		result.append(fractionOfSecond);
		result.append(')');
		return result.toString();
	}

} //P_TimeStampImpl
