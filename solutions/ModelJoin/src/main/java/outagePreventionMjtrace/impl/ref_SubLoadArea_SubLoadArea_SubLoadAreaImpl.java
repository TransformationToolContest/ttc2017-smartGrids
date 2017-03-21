/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61970.LoadModel.SubLoadArea;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.ref_SubLoadArea_SubLoadArea_SubLoadArea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Sub Load Area Sub Load Area Sub Load Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.ref_SubLoadArea_SubLoadArea_SubLoadAreaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.ref_SubLoadArea_SubLoadArea_SubLoadAreaImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_SubLoadArea_SubLoadArea_SubLoadAreaImpl extends MinimalEObjectImpl.Container implements ref_SubLoadArea_SubLoadArea_SubLoadArea {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SubLoadArea source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.SubLoadArea target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ref_SubLoadArea_SubLoadArea_SubLoadAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SubLoadArea)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubLoadArea basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SubLoadArea newSource) {
		SubLoadArea oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.SubLoadArea getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outagePreventionJointarget.SubLoadArea)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.SubLoadArea basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.SubLoadArea newTarget) {
		outagePreventionJointarget.SubLoadArea oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__TARGET:
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
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__SOURCE:
				setSource((SubLoadArea)newValue);
				return;
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__TARGET:
				setTarget((outagePreventionJointarget.SubLoadArea)newValue);
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
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__SOURCE:
				setSource((SubLoadArea)null);
				return;
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__TARGET:
				setTarget((outagePreventionJointarget.SubLoadArea)null);
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
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__SOURCE:
				return source != null;
			case OutagePreventionMjtracePackage.REF_SUB_LOAD_AREA_SUB_LOAD_AREA_SUB_LOAD_AREA__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_SubLoadArea_SubLoadArea_SubLoadAreaImpl
