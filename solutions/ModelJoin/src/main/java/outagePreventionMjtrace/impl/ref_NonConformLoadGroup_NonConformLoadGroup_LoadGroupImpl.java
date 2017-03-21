/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61970.LoadModel.NonConformLoadGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Non Conform Load Group Non Conform Load Group Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupImpl extends MinimalEObjectImpl.Container implements ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroup {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected NonConformLoadGroup source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.NonConformLoadGroup target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (NonConformLoadGroup)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(NonConformLoadGroup newSource) {
		NonConformLoadGroup oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.NonConformLoadGroup getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outagePreventionJointarget.NonConformLoadGroup)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.NonConformLoadGroup basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.NonConformLoadGroup newTarget) {
		outagePreventionJointarget.NonConformLoadGroup oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET:
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
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE:
				setSource((NonConformLoadGroup)newValue);
				return;
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET:
				setTarget((outagePreventionJointarget.NonConformLoadGroup)newValue);
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
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE:
				setSource((NonConformLoadGroup)null);
				return;
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET:
				setTarget((outagePreventionJointarget.NonConformLoadGroup)null);
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
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE:
				return source != null;
			case OutagePreventionMjtracePackage.REF_NON_CONFORM_LOAD_GROUP_NON_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_NonConformLoadGroup_NonConformLoadGroup_LoadGroupImpl
