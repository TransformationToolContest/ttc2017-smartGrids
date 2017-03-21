/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61970.Core.PowerSystemResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.ref_PowerSystemResource_PowerSystemResource_PowerSystemResources;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Power System Resource Power System Resource Power System Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesImpl extends MinimalEObjectImpl.Container implements ref_PowerSystemResource_PowerSystemResource_PowerSystemResources {
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
	protected ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PowerSystemResource)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.PowerSystemResource getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outagePreventionJointarget.PowerSystemResource)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__TARGET:
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
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__SOURCE:
				setSource((PowerSystemResource)newValue);
				return;
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__TARGET:
				setTarget((outagePreventionJointarget.PowerSystemResource)newValue);
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
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__SOURCE:
				setSource((PowerSystemResource)null);
				return;
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__TARGET:
				setTarget((outagePreventionJointarget.PowerSystemResource)null);
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
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__SOURCE:
				return source != null;
			case OutagePreventionMjtracePackage.REF_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCE_POWER_SYSTEM_RESOURCES__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_PowerSystemResource_PowerSystemResource_PowerSystemResourcesImpl
