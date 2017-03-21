/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61970.LoadModel.ConformLoadGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.ref_ConformLoadGroup_ConformLoadGroup_LoadGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Conform Load Group Conform Load Group Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.ref_ConformLoadGroup_ConformLoadGroup_LoadGroupImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.ref_ConformLoadGroup_ConformLoadGroup_LoadGroupImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_ConformLoadGroup_ConformLoadGroup_LoadGroupImpl extends MinimalEObjectImpl.Container implements ref_ConformLoadGroup_ConformLoadGroup_LoadGroup {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ConformLoadGroup source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.ConformLoadGroup target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ref_ConformLoadGroup_ConformLoadGroup_LoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ConformLoadGroup)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformLoadGroup basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ConformLoadGroup newSource) {
		ConformLoadGroup oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.ConformLoadGroup getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outagePreventionJointarget.ConformLoadGroup)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.ConformLoadGroup basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.ConformLoadGroup newTarget) {
		outagePreventionJointarget.ConformLoadGroup oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET:
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
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE:
				setSource((ConformLoadGroup)newValue);
				return;
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET:
				setTarget((outagePreventionJointarget.ConformLoadGroup)newValue);
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
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE:
				setSource((ConformLoadGroup)null);
				return;
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET:
				setTarget((outagePreventionJointarget.ConformLoadGroup)null);
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
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__SOURCE:
				return source != null;
			case OutagePreventionMjtracePackage.REF_CONFORM_LOAD_GROUP_CONFORM_LOAD_GROUP_LOAD_GROUP__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_ConformLoadGroup_ConformLoadGroup_LoadGroupImpl
