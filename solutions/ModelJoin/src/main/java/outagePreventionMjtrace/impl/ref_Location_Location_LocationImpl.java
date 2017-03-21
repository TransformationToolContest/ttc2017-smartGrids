/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61968.Common.Location;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.ref_Location_Location_Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Location Location Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.ref_Location_Location_LocationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.ref_Location_Location_LocationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_Location_Location_LocationImpl extends MinimalEObjectImpl.Container implements ref_Location_Location_Location {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Location source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.Location target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ref_Location_Location_LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.REF_LOCATION_LOCATION_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Location)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Location newSource) {
		Location oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.Location getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outagePreventionJointarget.Location)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.Location basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.Location newTarget) {
		outagePreventionJointarget.Location oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__TARGET:
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
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__SOURCE:
				setSource((Location)newValue);
				return;
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__TARGET:
				setTarget((outagePreventionJointarget.Location)newValue);
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
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__SOURCE:
				setSource((Location)null);
				return;
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__TARGET:
				setTarget((outagePreventionJointarget.Location)null);
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
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__SOURCE:
				return source != null;
			case OutagePreventionMjtracePackage.REF_LOCATION_LOCATION_LOCATION__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_Location_Location_LocationImpl
