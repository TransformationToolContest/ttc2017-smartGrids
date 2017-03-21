/**
 */
package outageDetectionMjtrace.impl;

import CIM.IEC61968.Metering.MeterAsset;

import COSEM.PhysicalDevice;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outageDetectionJointarget.EnergyConsumer;

import outageDetectionMjtrace.OutageDetectionMjtracePackage;
import outageDetectionMjtrace.join_MeterAsset_PhysicalDevice_EnergyConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>join Meter Asset Physical Device Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outageDetectionMjtrace.impl.join_MeterAsset_PhysicalDevice_EnergyConsumerImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link outageDetectionMjtrace.impl.join_MeterAsset_PhysicalDevice_EnergyConsumerImpl#getRight <em>Right</em>}</li>
 *   <li>{@link outageDetectionMjtrace.impl.join_MeterAsset_PhysicalDevice_EnergyConsumerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class join_MeterAsset_PhysicalDevice_EnergyConsumerImpl extends MinimalEObjectImpl.Container implements join_MeterAsset_PhysicalDevice_EnergyConsumer {
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
	protected EnergyConsumer target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected join_MeterAsset_PhysicalDevice_EnergyConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutageDetectionMjtracePackage.Literals.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT, oldLeft, left));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT, oldLeft, left));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT, oldRight, right));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT, oldRight, right));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (EnergyConsumer)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EnergyConsumer newTarget) {
		EnergyConsumer oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET:
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
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT:
				setLeft((MeterAsset)newValue);
				return;
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT:
				setRight((PhysicalDevice)newValue);
				return;
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET:
				setTarget((EnergyConsumer)newValue);
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
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT:
				setLeft((MeterAsset)null);
				return;
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT:
				setRight((PhysicalDevice)null);
				return;
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET:
				setTarget((EnergyConsumer)null);
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
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__LEFT:
				return left != null;
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__RIGHT:
				return right != null;
			case OutageDetectionMjtracePackage.JOIN_METER_ASSET_PHYSICAL_DEVICE_ENERGY_CONSUMER__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //join_MeterAsset_PhysicalDevice_EnergyConsumerImpl
