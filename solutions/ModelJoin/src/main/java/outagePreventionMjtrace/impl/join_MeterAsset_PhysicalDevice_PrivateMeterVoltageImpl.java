/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61968.Metering.MeterAsset;

import COSEM.PhysicalDevice;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionJointarget.PrivateMeterVoltage;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.join_MeterAsset_PhysicalDevice_PrivateMeterVoltage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>join Meter Asset Physical Device Private Meter Voltage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.join_MeterAsset_PhysicalDevice_PrivateMeterVoltageImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.join_MeterAsset_PhysicalDevice_PrivateMeterVoltageImpl#getRight <em>Right</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.join_MeterAsset_PhysicalDevice_PrivateMeterVoltageImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class join_MeterAsset_PhysicalDevice_PrivateMeterVoltageImpl extends MinimalEObjectImpl.Container implements join_MeterAsset_PhysicalDevice_PrivateMeterVoltage {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected MeterAsset left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected PhysicalDevice right;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected PrivateMeterVoltage target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected join_MeterAsset_PhysicalDevice_PrivateMeterVoltageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset getLeft() {
		if (left != null && left.eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (MeterAsset)eResolveProxy(oldLeft);
			if (left != oldLeft) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__LEFT, oldLeft, left));
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterAsset basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(MeterAsset newLeft) {
		MeterAsset oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDevice getRight() {
		if (right != null && right.eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (PhysicalDevice)eResolveProxy(oldRight);
			if (right != oldRight) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__RIGHT, oldRight, right));
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDevice basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(PhysicalDevice newRight) {
		PhysicalDevice oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateMeterVoltage getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (PrivateMeterVoltage)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateMeterVoltage basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(PrivateMeterVoltage newTarget) {
		PrivateMeterVoltage oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__LEFT:
				setLeft((MeterAsset)newValue);
				return;
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__RIGHT:
				setRight((PhysicalDevice)newValue);
				return;
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__TARGET:
				setTarget((PrivateMeterVoltage)newValue);
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
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__LEFT:
				setLeft((MeterAsset)null);
				return;
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__RIGHT:
				setRight((PhysicalDevice)null);
				return;
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__TARGET:
				setTarget((PrivateMeterVoltage)null);
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
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__LEFT:
				return left != null;
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__RIGHT:
				return right != null;
			case OutagePreventionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_PRIVATE_METER_VOLTAGE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //join_MeterAsset_PhysicalDevice_PrivateMeterVoltageImpl
