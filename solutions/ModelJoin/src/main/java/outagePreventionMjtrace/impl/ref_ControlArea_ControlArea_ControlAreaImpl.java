/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61970.ControlArea.ControlArea;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.ref_ControlArea_ControlArea_ControlArea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Control Area Control Area Control Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.ref_ControlArea_ControlArea_ControlAreaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.ref_ControlArea_ControlArea_ControlAreaImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_ControlArea_ControlArea_ControlAreaImpl extends MinimalEObjectImpl.Container implements ref_ControlArea_ControlArea_ControlArea {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ControlArea source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.ControlArea target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ref_ControlArea_ControlArea_ControlAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ControlArea)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlArea basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ControlArea newSource) {
		ControlArea oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.ControlArea getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outagePreventionJointarget.ControlArea)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.ControlArea basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.ControlArea newTarget) {
		outagePreventionJointarget.ControlArea oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__TARGET:
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
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__SOURCE:
				setSource((ControlArea)newValue);
				return;
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__TARGET:
				setTarget((outagePreventionJointarget.ControlArea)newValue);
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
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__SOURCE:
				setSource((ControlArea)null);
				return;
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__TARGET:
				setTarget((outagePreventionJointarget.ControlArea)null);
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
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__SOURCE:
				return source != null;
			case OutagePreventionMjtracePackage.REF_CONTROL_AREA_CONTROL_AREA_CONTROL_AREA__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_ControlArea_ControlArea_ControlAreaImpl
