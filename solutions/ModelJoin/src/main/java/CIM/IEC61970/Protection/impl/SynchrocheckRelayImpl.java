/**
 */
package CIM.IEC61970.Protection.impl;

import CIM.IEC61970.Protection.ProtectionPackage;
import CIM.IEC61970.Protection.SynchrocheckRelay;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchrocheck Relay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Protection.impl.SynchrocheckRelayImpl#getMaxVoltDiff <em>Max Volt Diff</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.SynchrocheckRelayImpl#getMaxFreqDiff <em>Max Freq Diff</em>}</li>
 *   <li>{@link CIM.IEC61970.Protection.impl.SynchrocheckRelayImpl#getMaxAngleDiff <em>Max Angle Diff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchrocheckRelayImpl extends ProtectionEquipmentImpl implements SynchrocheckRelay {
	/**
	 * The default value of the '{@link #getMaxVoltDiff() <em>Max Volt Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltDiff()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VOLT_DIFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxVoltDiff() <em>Max Volt Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltDiff()
	 * @generated
	 * @ordered
	 */
	protected float maxVoltDiff = MAX_VOLT_DIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxFreqDiff() <em>Max Freq Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFreqDiff()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_FREQ_DIFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxFreqDiff() <em>Max Freq Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFreqDiff()
	 * @generated
	 * @ordered
	 */
	protected float maxFreqDiff = MAX_FREQ_DIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAngleDiff() <em>Max Angle Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAngleDiff()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ANGLE_DIFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxAngleDiff() <em>Max Angle Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAngleDiff()
	 * @generated
	 * @ordered
	 */
	protected float maxAngleDiff = MAX_ANGLE_DIFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchrocheckRelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtectionPackage.Literals.SYNCHROCHECK_RELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxVoltDiff() {
		return maxVoltDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVoltDiff(float newMaxVoltDiff) {
		float oldMaxVoltDiff = maxVoltDiff;
		maxVoltDiff = newMaxVoltDiff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF, oldMaxVoltDiff, maxVoltDiff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxFreqDiff() {
		return maxFreqDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFreqDiff(float newMaxFreqDiff) {
		float oldMaxFreqDiff = maxFreqDiff;
		maxFreqDiff = newMaxFreqDiff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF, oldMaxFreqDiff, maxFreqDiff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxAngleDiff() {
		return maxAngleDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAngleDiff(float newMaxAngleDiff) {
		float oldMaxAngleDiff = maxAngleDiff;
		maxAngleDiff = newMaxAngleDiff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF, oldMaxAngleDiff, maxAngleDiff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
				return getMaxVoltDiff();
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
				return getMaxFreqDiff();
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
				return getMaxAngleDiff();
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
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
				setMaxVoltDiff((Float)newValue);
				return;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
				setMaxFreqDiff((Float)newValue);
				return;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
				setMaxAngleDiff((Float)newValue);
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
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
				setMaxVoltDiff(MAX_VOLT_DIFF_EDEFAULT);
				return;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
				setMaxFreqDiff(MAX_FREQ_DIFF_EDEFAULT);
				return;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
				setMaxAngleDiff(MAX_ANGLE_DIFF_EDEFAULT);
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
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
				return maxVoltDiff != MAX_VOLT_DIFF_EDEFAULT;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
				return maxFreqDiff != MAX_FREQ_DIFF_EDEFAULT;
			case ProtectionPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
				return maxAngleDiff != MAX_ANGLE_DIFF_EDEFAULT;
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
		result.append(" (maxVoltDiff: ");
		result.append(maxVoltDiff);
		result.append(", maxFreqDiff: ");
		result.append(maxFreqDiff);
		result.append(", maxAngleDiff: ");
		result.append(maxAngleDiff);
		result.append(')');
		return result.toString();
	}

} //SynchrocheckRelayImpl
