/**
 */
package rgse.ttc17.emoflon.tgg.task1.impl;

import gluemodel.COSEM.PhysicalDevice;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;

import outageDetectionJointarget.EnergyConsumer;

import rgse.ttc17.emoflon.tgg.task1.PhysicalDeviceToEnergyConsumer;
import rgse.ttc17.emoflon.tgg.task1.Task1Package;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Device To Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task1.impl.PhysicalDeviceToEnergyConsumerImpl#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task1.impl.PhysicalDeviceToEnergyConsumerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalDeviceToEnergyConsumerImpl extends AbstractCorrespondenceImpl
		implements PhysicalDeviceToEnergyConsumer {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PhysicalDevice source;

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
	protected PhysicalDeviceToEnergyConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Task1Package.Literals.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDevice getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (PhysicalDevice) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDevice basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PhysicalDevice newSource) {
		PhysicalDevice oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (EnergyConsumer) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__TARGET:
			if (resolve)
				return getTarget();
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
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__SOURCE:
			setSource((PhysicalDevice) newValue);
			return;
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__TARGET:
			setTarget((EnergyConsumer) newValue);
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
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__SOURCE:
			setSource((PhysicalDevice) null);
			return;
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__TARGET:
			setTarget((EnergyConsumer) null);
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
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__SOURCE:
			return source != null;
		case Task1Package.PHYSICAL_DEVICE_TO_ENERGY_CONSUMER__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PhysicalDeviceToEnergyConsumerImpl
