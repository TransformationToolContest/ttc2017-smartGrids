/**
 */
package outagePreventionMjtrace.impl;

import CIM.IEC61968.Metering.ServiceDeliveryPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionMjtrace.OutagePreventionMjtracePackage;
import outagePreventionMjtrace.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ref Service Delivery Point Service Delivery Point Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionMjtrace.impl.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointImpl#getSource <em>Source</em>}</li>
 *   <li>{@link outagePreventionMjtrace.impl.ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointImpl extends MinimalEObjectImpl.Container implements ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPoint {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ServiceDeliveryPoint source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected outagePreventionJointarget.ServiceDeliveryPoint target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionMjtracePackage.Literals.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ServiceDeliveryPoint)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ServiceDeliveryPoint newSource) {
		ServiceDeliveryPoint oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.ServiceDeliveryPoint getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (outagePreventionJointarget.ServiceDeliveryPoint)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outagePreventionJointarget.ServiceDeliveryPoint basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(outagePreventionJointarget.ServiceDeliveryPoint newTarget) {
		outagePreventionJointarget.ServiceDeliveryPoint oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__TARGET:
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
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__SOURCE:
				setSource((ServiceDeliveryPoint)newValue);
				return;
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__TARGET:
				setTarget((outagePreventionJointarget.ServiceDeliveryPoint)newValue);
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
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__SOURCE:
				setSource((ServiceDeliveryPoint)null);
				return;
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__TARGET:
				setTarget((outagePreventionJointarget.ServiceDeliveryPoint)null);
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
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__SOURCE:
				return source != null;
			case OutagePreventionMjtracePackage.REF_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT_SERVICE_DELIVERY_POINT__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //ref_ServiceDeliveryPoint_ServiceDeliveryPoint_ServiceDeliveryPointImpl
