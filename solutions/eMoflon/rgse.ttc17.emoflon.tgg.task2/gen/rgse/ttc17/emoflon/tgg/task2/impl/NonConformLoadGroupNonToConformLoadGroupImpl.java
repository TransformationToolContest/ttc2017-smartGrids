/**
 */
package rgse.ttc17.emoflon.tgg.task2.impl;

import gluemodel.CIM.IEC61970.LoadModel.NonConformLoadGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;

import rgse.ttc17.emoflon.tgg.task2.NonConformLoadGroupNonToConformLoadGroup;
import rgse.ttc17.emoflon.tgg.task2.Task2Package;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Conform Load Group Non To Conform Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.impl.NonConformLoadGroupNonToConformLoadGroupImpl#getSource <em>Source</em>}</li>
 *   <li>{@link rgse.ttc17.emoflon.tgg.task2.impl.NonConformLoadGroupNonToConformLoadGroupImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonConformLoadGroupNonToConformLoadGroupImpl extends AbstractCorrespondenceImpl
		implements NonConformLoadGroupNonToConformLoadGroup {
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
	protected NonConformLoadGroupNonToConformLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Task2Package.Literals.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConformLoadGroup getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (NonConformLoadGroup) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.NonConformLoadGroup getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (outagePreventionJointarget.NonConformLoadGroup) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__TARGET:
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
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__SOURCE:
			setSource((NonConformLoadGroup) newValue);
			return;
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__TARGET:
			setTarget((outagePreventionJointarget.NonConformLoadGroup) newValue);
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
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__SOURCE:
			setSource((NonConformLoadGroup) null);
			return;
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__TARGET:
			setTarget((outagePreventionJointarget.NonConformLoadGroup) null);
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
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__SOURCE:
			return source != null;
		case Task2Package.NON_CONFORM_LOAD_GROUP_NON_TO_CONFORM_LOAD_GROUP__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NonConformLoadGroupNonToConformLoadGroupImpl
