/**
 */
package rgse.ttc17.emoflon.tgg.task2.impl;

import gluemodel.CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;

import rgse.ttc17.emoflon.tgg.task2.PowerSystemResourceToPowerSystemResource;
import rgse.ttc17.emoflon.tgg.task2.Task2Package;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Resource To Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.impl.PowerSystemResourceToPowerSystemResourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.impl.PowerSystemResourceToPowerSystemResourceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerSystemResourceToPowerSystemResourceImpl extends AbstractCorrespondenceImpl
		implements PowerSystemResourceToPowerSystemResource {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PowerSystemResource source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.PowerSystemResource target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSystemResourceToPowerSystemResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Task2Package.Literals.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (PowerSystemResource) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PowerSystemResource newSource) {
		PowerSystemResource oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.PowerSystemResource getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (outagePreventionJointarget.PowerSystemResource) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.PowerSystemResource basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.PowerSystemResource newTarget) {
		outagePreventionJointarget.PowerSystemResource oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__TARGET:
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
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__SOURCE:
			setSource((PowerSystemResource) newValue);
			return;
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__TARGET:
			setTarget((outagePreventionJointarget.PowerSystemResource) newValue);
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
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__SOURCE:
			setSource((PowerSystemResource) null);
			return;
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__TARGET:
			setTarget((outagePreventionJointarget.PowerSystemResource) null);
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
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__SOURCE:
			return source != null;
		case Task2Package.POWER_SYSTEM_RESOURCE_TO_POWER_SYSTEM_RESOURCE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PowerSystemResourceToPowerSystemResourceImpl
