/**
 */
package CIM.IEC61968.Metering.impl;

import CIM.IEC61968.Metering.IntervalReading;
import CIM.IEC61968.Metering.MeteringPackage;
import CIM.IEC61968.Metering.Reading;
import CIM.IEC61968.Metering.ReadingQuality;

import CIM.impl.ElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingQualityImpl#getIntervalReading <em>Interval Reading</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingQualityImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link CIM.IEC61968.Metering.impl.ReadingQualityImpl#getReading <em>Reading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingQualityImpl extends ElementImpl implements ReadingQuality {
	/**
	 * The cached value of the '{@link #getIntervalReading() <em>Interval Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalReading()
	 * @generated
	 * @ordered
	 */
	protected IntervalReading intervalReading;

	/**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected String quality = QUALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReading() <em>Reading</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading()
	 * @generated
	 * @ordered
	 */
	protected Reading reading;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingQualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.READING_QUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalReading getIntervalReading() {
		if (intervalReading != null && intervalReading.eIsProxy()) {
			InternalEObject oldIntervalReading = (InternalEObject)intervalReading;
			intervalReading = (IntervalReading)eResolveProxy(oldIntervalReading);
			if (intervalReading != oldIntervalReading) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.READING_QUALITY__INTERVAL_READING, oldIntervalReading, intervalReading));
			}
		}
		return intervalReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalReading basicGetIntervalReading() {
		return intervalReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalReading(IntervalReading newIntervalReading, NotificationChain msgs) {
		IntervalReading oldIntervalReading = intervalReading;
		intervalReading = newIntervalReading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_QUALITY__INTERVAL_READING, oldIntervalReading, newIntervalReading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalReading(IntervalReading newIntervalReading) {
		if (newIntervalReading != intervalReading) {
			NotificationChain msgs = null;
			if (intervalReading != null)
				msgs = ((InternalEObject)intervalReading).eInverseRemove(this, MeteringPackage.INTERVAL_READING__READING_QUALITIES, IntervalReading.class, msgs);
			if (newIntervalReading != null)
				msgs = ((InternalEObject)newIntervalReading).eInverseAdd(this, MeteringPackage.INTERVAL_READING__READING_QUALITIES, IntervalReading.class, msgs);
			msgs = basicSetIntervalReading(newIntervalReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_QUALITY__INTERVAL_READING, newIntervalReading, newIntervalReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(String newQuality) {
		String oldQuality = quality;
		quality = newQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_QUALITY__QUALITY, oldQuality, quality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reading getReading() {
		if (reading != null && reading.eIsProxy()) {
			InternalEObject oldReading = (InternalEObject)reading;
			reading = (Reading)eResolveProxy(oldReading);
			if (reading != oldReading) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.READING_QUALITY__READING, oldReading, reading));
			}
		}
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reading basicGetReading() {
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReading(Reading newReading, NotificationChain msgs) {
		Reading oldReading = reading;
		reading = newReading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_QUALITY__READING, oldReading, newReading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReading(Reading newReading) {
		if (newReading != reading) {
			NotificationChain msgs = null;
			if (reading != null)
				msgs = ((InternalEObject)reading).eInverseRemove(this, MeteringPackage.READING__READING_QUALITIES, Reading.class, msgs);
			if (newReading != null)
				msgs = ((InternalEObject)newReading).eInverseAdd(this, MeteringPackage.READING__READING_QUALITIES, Reading.class, msgs);
			msgs = basicSetReading(newReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.READING_QUALITY__READING, newReading, newReading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				if (intervalReading != null)
					msgs = ((InternalEObject)intervalReading).eInverseRemove(this, MeteringPackage.INTERVAL_READING__READING_QUALITIES, IntervalReading.class, msgs);
				return basicSetIntervalReading((IntervalReading)otherEnd, msgs);
			case MeteringPackage.READING_QUALITY__READING:
				if (reading != null)
					msgs = ((InternalEObject)reading).eInverseRemove(this, MeteringPackage.READING__READING_QUALITIES, Reading.class, msgs);
				return basicSetReading((Reading)otherEnd, msgs);
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
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				return basicSetIntervalReading(null, msgs);
			case MeteringPackage.READING_QUALITY__READING:
				return basicSetReading(null, msgs);
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
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				if (resolve) return getIntervalReading();
				return basicGetIntervalReading();
			case MeteringPackage.READING_QUALITY__QUALITY:
				return getQuality();
			case MeteringPackage.READING_QUALITY__READING:
				if (resolve) return getReading();
				return basicGetReading();
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
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				setIntervalReading((IntervalReading)newValue);
				return;
			case MeteringPackage.READING_QUALITY__QUALITY:
				setQuality((String)newValue);
				return;
			case MeteringPackage.READING_QUALITY__READING:
				setReading((Reading)newValue);
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
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				setIntervalReading((IntervalReading)null);
				return;
			case MeteringPackage.READING_QUALITY__QUALITY:
				setQuality(QUALITY_EDEFAULT);
				return;
			case MeteringPackage.READING_QUALITY__READING:
				setReading((Reading)null);
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
			case MeteringPackage.READING_QUALITY__INTERVAL_READING:
				return intervalReading != null;
			case MeteringPackage.READING_QUALITY__QUALITY:
				return QUALITY_EDEFAULT == null ? quality != null : !QUALITY_EDEFAULT.equals(quality);
			case MeteringPackage.READING_QUALITY__READING:
				return reading != null;
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
		result.append(" (quality: ");
		result.append(quality);
		result.append(')');
		return result.toString();
	}

} //ReadingQualityImpl
