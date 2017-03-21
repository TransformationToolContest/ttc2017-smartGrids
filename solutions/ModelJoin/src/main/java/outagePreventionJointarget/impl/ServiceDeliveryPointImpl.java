/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outagePreventionJointarget.EnergyConsumer;
import outagePreventionJointarget.OutagePreventionJointargetPackage;
import outagePreventionJointarget.ServiceDeliveryPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Delivery Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.ServiceDeliveryPointImpl#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceDeliveryPointImpl extends MinimalEObjectImpl.Container implements ServiceDeliveryPoint {
	/**
	 * The cached value of the '{@link #getEnergyConsumer() <em>Energy Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyConsumer()
	 * @generated
	 * @ordered
	 */
	protected EnergyConsumer energyConsumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDeliveryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.SERVICE_DELIVERY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer getEnergyConsumer() {
		if (energyConsumer != null && energyConsumer.eIsProxy()) {
			InternalEObject oldEnergyConsumer = (InternalEObject)energyConsumer;
			energyConsumer = (EnergyConsumer)eResolveProxy(oldEnergyConsumer);
			if (energyConsumer != oldEnergyConsumer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionJointargetPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER, oldEnergyConsumer, energyConsumer));
			}
		}
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumer basicGetEnergyConsumer() {
		return energyConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergyConsumer(EnergyConsumer newEnergyConsumer) {
		EnergyConsumer oldEnergyConsumer = energyConsumer;
		energyConsumer = newEnergyConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER, oldEnergyConsumer, energyConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				if (resolve) return getEnergyConsumer();
				return basicGetEnergyConsumer();
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
			case OutagePreventionJointargetPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				setEnergyConsumer((EnergyConsumer)newValue);
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
			case OutagePreventionJointargetPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				setEnergyConsumer((EnergyConsumer)null);
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
			case OutagePreventionJointargetPackage.SERVICE_DELIVERY_POINT__ENERGY_CONSUMER:
				return energyConsumer != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceDeliveryPointImpl
