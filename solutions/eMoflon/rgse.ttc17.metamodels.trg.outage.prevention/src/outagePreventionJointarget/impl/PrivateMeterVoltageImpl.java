/**
 */
package outagePreventionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import outagePreventionJointarget.EndDeviceAsset;
import outagePreventionJointarget.OutagePreventionJointargetPackage;
import outagePreventionJointarget.PrivateMeterVoltage;
import outagePreventionJointarget.ServiceDeliveryPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Meter Voltage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outagePreventionJointarget.impl.PrivateMeterVoltageImpl#getServiceDeliveryPoint <em>Service Delivery Point</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PrivateMeterVoltageImpl#getID <em>ID</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PrivateMeterVoltageImpl#getVoltageA <em>Voltage A</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PrivateMeterVoltageImpl#getVoltageB <em>Voltage B</em>}</li>
 *   <li>{@link outagePreventionJointarget.impl.PrivateMeterVoltageImpl#getVoltageC <em>Voltage C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateMeterVoltageImpl extends AssetImpl implements PrivateMeterVoltage {
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
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageA() <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageA()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_A_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageA() <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageA()
	 * @generated
	 * @ordered
	 */
	protected double voltageA = VOLTAGE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageB() <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageB()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_B_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageB() <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageB()
	 * @generated
	 * @ordered
	 */
	protected double voltageB = VOLTAGE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltageC() <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageC()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_C_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVoltageC() <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageC()
	 * @generated
	 * @ordered
	 */
	protected double voltageC = VOLTAGE_C_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivateMeterVoltageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutagePreventionJointargetPackage.Literals.PRIVATE_METER_VOLTAGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, serviceDeliveryPoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT, oldServiceDeliveryPoint, serviceDeliveryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageA() {
		return voltageA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageA(double newVoltageA) {
		double oldVoltageA = voltageA;
		voltageA = newVoltageA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_A, oldVoltageA, voltageA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageB() {
		return voltageB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageB(double newVoltageB) {
		double oldVoltageB = voltageB;
		voltageB = newVoltageB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_B, oldVoltageB, voltageB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltageC() {
		return voltageC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageC(double newVoltageC) {
		double oldVoltageC = voltageC;
		voltageC = newVoltageC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_C, oldVoltageC, voltageC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT:
				if (resolve) return getServiceDeliveryPoint();
				return basicGetServiceDeliveryPoint();
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__ID:
				return getID();
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_A:
				return getVoltageA();
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_B:
				return getVoltageB();
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_C:
				return getVoltageC();
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
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)newValue);
				return;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__ID:
				setID((String)newValue);
				return;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_A:
				setVoltageA((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_B:
				setVoltageB((Double)newValue);
				return;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_C:
				setVoltageC((Double)newValue);
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
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT:
				setServiceDeliveryPoint((ServiceDeliveryPoint)null);
				return;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__ID:
				setID(ID_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_A:
				setVoltageA(VOLTAGE_A_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_B:
				setVoltageB(VOLTAGE_B_EDEFAULT);
				return;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_C:
				setVoltageC(VOLTAGE_C_EDEFAULT);
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
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT:
				return serviceDeliveryPoint != null;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_A:
				return voltageA != VOLTAGE_A_EDEFAULT;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_B:
				return voltageB != VOLTAGE_B_EDEFAULT;
			case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__VOLTAGE_C:
				return voltageC != VOLTAGE_C_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EndDeviceAsset.class) {
			switch (derivedFeatureID) {
				case OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT: return OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EndDeviceAsset.class) {
			switch (baseFeatureID) {
				case OutagePreventionJointargetPackage.END_DEVICE_ASSET__SERVICE_DELIVERY_POINT: return OutagePreventionJointargetPackage.PRIVATE_METER_VOLTAGE__SERVICE_DELIVERY_POINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", VoltageA: ");
		result.append(voltageA);
		result.append(", VoltageB: ");
		result.append(voltageB);
		result.append(", VoltageC: ");
		result.append(voltageC);
		result.append(')');
		return result.toString();
	}

} //PrivateMeterVoltageImpl
