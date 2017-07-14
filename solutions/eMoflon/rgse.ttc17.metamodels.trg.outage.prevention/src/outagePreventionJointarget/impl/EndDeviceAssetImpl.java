/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionJointarget.EndDeviceAsset;
import outagePreventionJointarget.OutagePreventionJointargetPackage;
import outagePreventionJointarget.ServiceDeliveryPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Device Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.EndDeviceAssetImpl#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndDeviceAssetImpl extends MinimalEObjectImpl.Container implements EndDeviceAsset {
	/**
	 * The cached value of the '{@link #getServiceDeliveryPoint() <em>Service Delivery Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDeliveryPoint()
	 * @generated
	 * @ordered
	 */
	protected ServiceDeliveryPoint serviceDeliveryPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndDeviceAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.END_DEVICE_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint getServiceDeliveryPoint() {
		if (serviceDeliveryPoint != null && serviceDeliveryPoint.eIsProxy()) {
			InternalEObject oldServiceDeliveryPoint = (InternalEObject)serviceDeliveryPoint;
			serviceDeliveryPoint = (ServiceDeliveryPoint)eResolveProxy(oldServiceDeliveryPoint);
			if (serviceDeliveryPoint != oldServiceDeliveryPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, serviceDeliveryPoint));
			}
		}
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDeliveryPoint basicGetServiceDeliveryPoint() {
		return serviceDeliveryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDeliveryPoint(ServiceDeliveryPoint newServiceDeliveryPoint) {
		ServiceDeliveryPoint oldServiceDeliveryPoint = serviceDeliveryPoint;
		serviceDeliveryPoint = newServiceDeliveryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, serviceDeliveryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				if (resolve) return getServiceDeliveryPoint();
				return basicGetServiceDeliveryPoint();
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
			case OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)newValue);
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
			case OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)null);
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
			case OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT:
				return serviceDeliveryPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //EndDeviceAssetImpl
