/**
 */
package outageDetectionMjtrace.impl;

import CIM.IEC61968.Common.PositionPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outageDetectionMjtrace.OutageDetectionMjtracePackage;
import outageDetectionMjtrace.ref_PositionPoint_PositionPoint_Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Position Point Position Point Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outageDetectionMjtrace.impl.ref_PositionPoint_PositionPoint_PositionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outageDetectionMjtrace.impl.ref_PositionPoint_PositionPoint_PositionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_PositionPoint_PositionPoint_PositionImpl extends MinimalEObjectImpl.Container implements ref_PositionPoint_PositionPoint_Position {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected PositionPoint source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outageDetectionJointarget.PositionPoint target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ref_PositionPoint_PositionPoint_PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutageDetectionMjtracePackage.Literals.REF_POSITION_POINT_POSITION_POINT_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPoint getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (PositionPoint)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionPoint basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(PositionPoint newSource) {
		PositionPoint oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outageDetectionJointarget.PositionPoint getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outageDetectionJointarget.PositionPoint)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outageDetectionJointarget.PositionPoint basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outageDetectionJointarget.PositionPoint newTarget) {
		outageDetectionJointarget.PositionPoint oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET:
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
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE:
				setSource((PositionPoint)newValue);
				return;
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET:
				setTarget((outageDetectionJointarget.PositionPoint)newValue);
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
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE:
				setSource((PositionPoint)null);
				return;
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET:
				setTarget((outageDetectionJointarget.PositionPoint)null);
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
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__SOURCE:
				return source != null;
			case OutageDetectionMjtracePackage.REF_POSITION_POINT_POSITION_POINT_POSITION__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_PositionPoint_PositionPoint_PositionImpl
