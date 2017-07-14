/**
 */
package gluemodel.CIM.IEC61968.Metering.impl;

import gluemodel.CIM.IEC61968.Metering.DeviceFunction;
import gluemodel.CIM.IEC61968.Metering.MeteringPackage;
import gluemodel.CIM.IEC61968.Metering.ReadingType;
import gluemodel.CIM.IEC61968.Metering.Register;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.RegisterImpl#getLeftDigitCount <em>Left Digit Count</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.RegisterImpl#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.RegisterImpl#getDeviceFunction <em>Device Function</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.Metering.impl.RegisterImpl#getRightDigitCount <em>Right Digit Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterImpl extends IdentifiedObjectImpl implements Register {
	/**
	 * The default value of the '{@link #getLeftDigitCount() <em>Left Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftDigitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_DIGIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeftDigitCount() <em>Left Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftDigitCount()
	 * @generated
	 * @ordered
	 */
	protected int leftDigitCount = LEFT_DIGIT_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadingType() <em>Reading Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingType()
	 * @generated
	 * @ordered
	 */
	protected ReadingType readingType;

	/**
	 * The cached value of the '{@link #getDeviceFunction() <em>Device Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFunction()
	 * @generated
	 * @ordered
	 */
	protected DeviceFunction deviceFunction;

	/**
	 * The default value of the '{@link #getRightDigitCount() <em>Right Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightDigitCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_DIGIT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRightDigitCount() <em>Right Digit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightDigitCount()
	 * @generated
	 * @ordered
	 */
	protected int rightDigitCount = RIGHT_DIGIT_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeteringPackage.Literals.REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLeftDigitCount() {
		return leftDigitCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftDigitCount(int newLeftDigitCount) {
		int oldLeftDigitCount = leftDigitCount;
		leftDigitCount = newLeftDigitCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.REGISTER__LEFT_DIGIT_COUNT, oldLeftDigitCount, leftDigitCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType getReadingType() {
		if (readingType != null && readingType.eIsProxy()) {
			InternalEObject oldReadingType = (InternalEObject)readingType;
			readingType = (ReadingType)eResolveProxy(oldReadingType);
			if (readingType != oldReadingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.REGISTER__READING_TYPE, oldReadingType, readingType));
			}
		}
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType basicGetReadingType() {
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadingType(ReadingType newReadingType, NotificationChain msgs) {
		ReadingType oldReadingType = readingType;
		readingType = newReadingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.REGISTER__READING_TYPE, oldReadingType, newReadingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingType(ReadingType newReadingType) {
		if (newReadingType != readingType) {
			NotificationChain msgs = null;
			if (readingType != null)
				msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__REGISTER, ReadingType.class, msgs);
			if (newReadingType != null)
				msgs = ((InternalEObject)newReadingType).eInverseAdd(this, MeteringPackage.READING_TYPE__REGISTER, ReadingType.class, msgs);
			msgs = basicSetReadingType(newReadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.REGISTER__READING_TYPE, newReadingType, newReadingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFunction getDeviceFunction() {
		if (deviceFunction != null && deviceFunction.eIsProxy()) {
			InternalEObject oldDeviceFunction = (InternalEObject)deviceFunction;
			deviceFunction = (DeviceFunction)eResolveProxy(oldDeviceFunction);
			if (deviceFunction != oldDeviceFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeteringPackage.REGISTER__DEVICE_FUNCTION, oldDeviceFunction, deviceFunction));
			}
		}
		return deviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFunction basicGetDeviceFunction() {
		return deviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceFunction(DeviceFunction newDeviceFunction, NotificationChain msgs) {
		DeviceFunction oldDeviceFunction = deviceFunction;
		deviceFunction = newDeviceFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeteringPackage.REGISTER__DEVICE_FUNCTION, oldDeviceFunction, newDeviceFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceFunction(DeviceFunction newDeviceFunction) {
		if (newDeviceFunction != deviceFunction) {
			NotificationChain msgs = null;
			if (deviceFunction != null)
				msgs = ((InternalEObject)deviceFunction).eInverseRemove(this, MeteringPackage.DEVICE_FUNCTION__REGISTERS, DeviceFunction.class, msgs);
			if (newDeviceFunction != null)
				msgs = ((InternalEObject)newDeviceFunction).eInverseAdd(this, MeteringPackage.DEVICE_FUNCTION__REGISTERS, DeviceFunction.class, msgs);
			msgs = basicSetDeviceFunction(newDeviceFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.REGISTER__DEVICE_FUNCTION, newDeviceFunction, newDeviceFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRightDigitCount() {
		return rightDigitCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightDigitCount(int newRightDigitCount) {
		int oldRightDigitCount = rightDigitCount;
		rightDigitCount = newRightDigitCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT, oldRightDigitCount, rightDigitCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeteringPackage.REGISTER__READING_TYPE:
				if (readingType != null)
					msgs = ((InternalEObject)readingType).eInverseRemove(this, MeteringPackage.READING_TYPE__REGISTER, ReadingType.class, msgs);
				return basicSetReadingType((ReadingType)otherEnd, msgs);
			case MeteringPackage.REGISTER__DEVICE_FUNCTION:
				if (deviceFunction != null)
					msgs = ((InternalEObject)deviceFunction).eInverseRemove(this, MeteringPackage.DEVICE_FUNCTION__REGISTERS, DeviceFunction.class, msgs);
				return basicSetDeviceFunction((DeviceFunction)otherEnd, msgs);
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
			case MeteringPackage.REGISTER__READING_TYPE:
				return basicSetReadingType(null, msgs);
			case MeteringPackage.REGISTER__DEVICE_FUNCTION:
				return basicSetDeviceFunction(null, msgs);
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
			case MeteringPackage.REGISTER__LEFT_DIGIT_COUNT:
				return getLeftDigitCount();
			case MeteringPackage.REGISTER__READING_TYPE:
				if (resolve) return getReadingType();
				return basicGetReadingType();
			case MeteringPackage.REGISTER__DEVICE_FUNCTION:
				if (resolve) return getDeviceFunction();
				return basicGetDeviceFunction();
			case MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT:
				return getRightDigitCount();
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
			case MeteringPackage.REGISTER__LEFT_DIGIT_COUNT:
				setLeftDigitCount((Integer)newValue);
				return;
			case MeteringPackage.REGISTER__READING_TYPE:
				setReadingType((ReadingType)newValue);
				return;
			case MeteringPackage.REGISTER__DEVICE_FUNCTION:
				setDeviceFunction((DeviceFunction)newValue);
				return;
			case MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT:
				setRightDigitCount((Integer)newValue);
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
			case MeteringPackage.REGISTER__LEFT_DIGIT_COUNT:
				setLeftDigitCount(LEFT_DIGIT_COUNT_EDEFAULT);
				return;
			case MeteringPackage.REGISTER__READING_TYPE:
				setReadingType((ReadingType)null);
				return;
			case MeteringPackage.REGISTER__DEVICE_FUNCTION:
				setDeviceFunction((DeviceFunction)null);
				return;
			case MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT:
				setRightDigitCount(RIGHT_DIGIT_COUNT_EDEFAULT);
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
			case MeteringPackage.REGISTER__LEFT_DIGIT_COUNT:
				return leftDigitCount != LEFT_DIGIT_COUNT_EDEFAULT;
			case MeteringPackage.REGISTER__READING_TYPE:
				return readingType != null;
			case MeteringPackage.REGISTER__DEVICE_FUNCTION:
				return deviceFunction != null;
			case MeteringPackage.REGISTER__RIGHT_DIGIT_COUNT:
				return rightDigitCount != RIGHT_DIGIT_COUNT_EDEFAULT;
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
		result.append(" (leftDigitCount: ");
		result.append(leftDigitCount);
		result.append(", rightDigitCount: ");
		result.append(rightDigitCount);
		result.append(')');
		return result.toString();
	}

} //RegisterImpl
