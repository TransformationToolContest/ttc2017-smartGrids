/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61970.Wires.EnergyConsumer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.ref_EnergyConsumer_EnergyConsumer_EnergyConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Energy Consumer Energy Consumer Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.ref_EnergyConsumer_EnergyConsumer_EnergyConsumerImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.ref_EnergyConsumer_EnergyConsumer_EnergyConsumerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_EnergyConsumer_EnergyConsumer_EnergyConsumerImpl extends MinimalEObjectImpl.Container implements ref_EnergyConsumer_EnergyConsumer_EnergyConsumer {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EnergyConsumer source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.EnergyConsumer target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ref_EnergyConsumer_EnergyConsumer_EnergyConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EnergyConsumer)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EnergyConsumer newSource) {
		EnergyConsumer oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.EnergyConsumer getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outagePreventionJointarget.EnergyConsumer)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.EnergyConsumer basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.EnergyConsumer newTarget) {
		outagePreventionJointarget.EnergyConsumer oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__TARGET:
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
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__SOURCE:
				setSource((EnergyConsumer)newValue);
				return;
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__TARGET:
				setTarget((outagePreventionJointarget.EnergyConsumer)newValue);
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
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__SOURCE:
				setSource((EnergyConsumer)null);
				return;
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__TARGET:
				setTarget((outagePreventionJointarget.EnergyConsumer)null);
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
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__SOURCE:
				return source != null;
			case OutagePreventionMjtracePackage.REF_ENERGY_CONSUMER_ENERGY_CONSUMER_ENERGY_CONSUMER__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_EnergyConsumer_EnergyConsumer_EnergyConsumerImpl
