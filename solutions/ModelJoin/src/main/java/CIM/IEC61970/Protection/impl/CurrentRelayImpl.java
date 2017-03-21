/**
 */
package CIM.IEC61970.Protection.impl;

import CIM.IEC61970.Protection.CurrentRelay;
import CIM.IEC61970.Protection.ProtectionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Relay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl#getTimeDelay1 <em>Time Delay1</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl#getTimeDelay2 <em>Time Delay2</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl#getTimeDelay3 <em>Time Delay3</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl#isInverseTimeFlag <em>Inverse Time Flag</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl#getCurrentLimit3 <em>Current Limit3</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl#getCurrentLimit2 <em>Current Limit2</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.CurrentRelayImpl#getCurrentLimit1 <em>Current Limit1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentRelayImpl extends ProtectionEquipmentImpl implements CurrentRelay {
	/**
	 * The default value of the '{@link #getTimeDelay1() <em>Time Delay1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay1()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_DELAY1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeDelay1() <em>Time Delay1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay1()
	 * @generated
	 * @ordered
	 */
	protected float timeDelay1 = TIME_DELAY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeDelay2() <em>Time Delay2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay2()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_DELAY2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeDelay2() <em>Time Delay2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay2()
	 * @generated
	 * @ordered
	 */
	protected float timeDelay2 = TIME_DELAY2_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeDelay3() <em>Time Delay3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay3()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_DELAY3_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeDelay3() <em>Time Delay3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay3()
	 * @generated
	 * @ordered
	 */
	protected float timeDelay3 = TIME_DELAY3_EDEFAULT;

	/**
	 * The default value of the '{@link #isInverseTimeFlag() <em>Inverse Time Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverseTimeFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_TIME_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverseTimeFlag() <em>Inverse Time Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverseTimeFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean inverseTimeFlag = INVERSE_TIME_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLimit3() <em>Current Limit3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLimit3()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_LIMIT3_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentLimit3() <em>Current Limit3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLimit3()
	 * @generated
	 * @ordered
	 */
	protected float currentLimit3 = CURRENT_LIMIT3_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLimit2() <em>Current Limit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLimit2()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_LIMIT2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentLimit2() <em>Current Limit2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLimit2()
	 * @generated
	 * @ordered
	 */
	protected float currentLimit2 = CURRENT_LIMIT2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLimit1() <em>Current Limit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLimit1()
	 * @generated
	 * @ordered
	 */
	protected static final float CURRENT_LIMIT1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCurrentLimit1() <em>Current Limit1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLimit1()
	 * @generated
	 * @ordered
	 */
	protected float currentLimit1 = CURRENT_LIMIT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentRelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtectionPackage.Literals.CURRENT_RELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeDelay1() {
		return timeDelay1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDelay1(float newTimeDelay1) {
		float oldTimeDelay1 = timeDelay1;
		timeDelay1 = newTimeDelay1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.CURRENT_RELAY__TIME_DELAY1, oldTimeDelay1, timeDelay1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeDelay2() {
		return timeDelay2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDelay2(float newTimeDelay2) {
		float oldTimeDelay2 = timeDelay2;
		timeDelay2 = newTimeDelay2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.CURRENT_RELAY__TIME_DELAY2, oldTimeDelay2, timeDelay2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeDelay3() {
		return timeDelay3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDelay3(float newTimeDelay3) {
		float oldTimeDelay3 = timeDelay3;
		timeDelay3 = newTimeDelay3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.CURRENT_RELAY__TIME_DELAY3, oldTimeDelay3, timeDelay3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverseTimeFlag() {
		return inverseTimeFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseTimeFlag(boolean newInverseTimeFlag) {
		boolean oldInverseTimeFlag = inverseTimeFlag;
		inverseTimeFlag = newInverseTimeFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.CURRENT_RELAY__INVERSE_TIME_FLAG, oldInverseTimeFlag, inverseTimeFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentLimit3() {
		return currentLimit3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLimit3(float newCurrentLimit3) {
		float oldCurrentLimit3 = currentLimit3;
		currentLimit3 = newCurrentLimit3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT3, oldCurrentLimit3, currentLimit3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentLimit2() {
		return currentLimit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLimit2(float newCurrentLimit2) {
		float oldCurrentLimit2 = currentLimit2;
		currentLimit2 = newCurrentLimit2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT2, oldCurrentLimit2, currentLimit2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCurrentLimit1() {
		return currentLimit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLimit1(float newCurrentLimit1) {
		float oldCurrentLimit1 = currentLimit1;
		currentLimit1 = newCurrentLimit1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT1, oldCurrentLimit1, currentLimit1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY1:
				return getTimeDelay1();
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY2:
				return getTimeDelay2();
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY3:
				return getTimeDelay3();
			case ProtectionPackage.CURRENT_RELAY__INVERSE_TIME_FLAG:
				return isInverseTimeFlag();
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT3:
				return getCurrentLimit3();
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT2:
				return getCurrentLimit2();
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT1:
				return getCurrentLimit1();
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
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY1:
				setTimeDelay1((Float)newValue);
				return;
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY2:
				setTimeDelay2((Float)newValue);
				return;
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY3:
				setTimeDelay3((Float)newValue);
				return;
			case ProtectionPackage.CURRENT_RELAY__INVERSE_TIME_FLAG:
				setInverseTimeFlag((Boolean)newValue);
				return;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT3:
				setCurrentLimit3((Float)newValue);
				return;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT2:
				setCurrentLimit2((Float)newValue);
				return;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT1:
				setCurrentLimit1((Float)newValue);
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
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY1:
				setTimeDelay1(TIME_DELAY1_EDEFAULT);
				return;
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY2:
				setTimeDelay2(TIME_DELAY2_EDEFAULT);
				return;
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY3:
				setTimeDelay3(TIME_DELAY3_EDEFAULT);
				return;
			case ProtectionPackage.CURRENT_RELAY__INVERSE_TIME_FLAG:
				setInverseTimeFlag(INVERSE_TIME_FLAG_EDEFAULT);
				return;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT3:
				setCurrentLimit3(CURRENT_LIMIT3_EDEFAULT);
				return;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT2:
				setCurrentLimit2(CURRENT_LIMIT2_EDEFAULT);
				return;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT1:
				setCurrentLimit1(CURRENT_LIMIT1_EDEFAULT);
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
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY1:
				return timeDelay1 != TIME_DELAY1_EDEFAULT;
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY2:
				return timeDelay2 != TIME_DELAY2_EDEFAULT;
			case ProtectionPackage.CURRENT_RELAY__TIME_DELAY3:
				return timeDelay3 != TIME_DELAY3_EDEFAULT;
			case ProtectionPackage.CURRENT_RELAY__INVERSE_TIME_FLAG:
				return inverseTimeFlag != INVERSE_TIME_FLAG_EDEFAULT;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT3:
				return currentLimit3 != CURRENT_LIMIT3_EDEFAULT;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT2:
				return currentLimit2 != CURRENT_LIMIT2_EDEFAULT;
			case ProtectionPackage.CURRENT_RELAY__CURRENT_LIMIT1:
				return currentLimit1 != CURRENT_LIMIT1_EDEFAULT;
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
		result.append(" (timeDelay1: ");
		result.append(timeDelay1);
		result.append(", timeDelay2: ");
		result.append(timeDelay2);
		result.append(", timeDelay3: ");
		result.append(timeDelay3);
		result.append(", inverseTimeFlag: ");
		result.append(inverseTimeFlag);
		result.append(", currentLimit3: ");
		result.append(currentLimit3);
		result.append(", currentLimit2: ");
		result.append(currentLimit2);
		result.append(", currentLimit1: ");
		result.append(currentLimit1);
		result.append(')');
		return result.toString();
	}

} //CurrentRelayImpl
