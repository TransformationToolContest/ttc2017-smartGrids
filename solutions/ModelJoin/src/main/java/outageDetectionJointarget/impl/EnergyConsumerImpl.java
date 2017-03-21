/**
 */
package outageDetectionJointarget.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import outageDetectionJointarget.EnergyConsumer;
import outageDetectionJointarget.Location;
import outageDetectionJointarget.OutageDetectionJointargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link outageDetectionJointarget.impl.EnergyConsumerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link outageDetectionJointarget.impl.EnergyConsumerImpl#getReachability <em>Reachability</em>}</li>
 *   <li>{@link outageDetectionJointarget.impl.EnergyConsumerImpl#getPowerA <em>Power A</em>}</li>
 *   <li>{@link outageDetectionJointarget.impl.EnergyConsumerImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyConsumerImpl extends MinimalEObjectImpl.Container implements EnergyConsumer {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getReachability() <em>Reachability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachability()
	 * @generated
	 * @ordered
	 */
	protected static final int REACHABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReachability() <em>Reachability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReachability()
	 * @generated
	 * @ordered
	 */
	protected int reachability = REACHABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerA() <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerA()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_A_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPowerA() <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerA()
	 * @generated
	 * @ordered
	 */
	protected double powerA = POWER_A_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutageDetectionJointargetPackage.Literals.ENERGY_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OutageDetectionJointargetPackage.ENERGY_CONSUMER__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionJointargetPackage.ENERGY_CONSUMER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReachability() {
		return reachability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReachability(int newReachability) {
		int oldReachability = reachability;
		reachability = newReachability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionJointargetPackage.ENERGY_CONSUMER__REACHABILITY, oldReachability, reachability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPowerA() {
		return powerA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerA(double newPowerA) {
		double oldPowerA = powerA;
		powerA = newPowerA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionJointargetPackage.ENERGY_CONSUMER__POWER_A, oldPowerA, powerA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OutageDetectionJointargetPackage.ENERGY_CONSUMER__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__REACHABILITY:
				return getReachability();
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__POWER_A:
				return getPowerA();
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__ID:
				return getID();
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
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__LOCATION:
				setLocation((Location)newValue);
				return;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__REACHABILITY:
				setReachability((Integer)newValue);
				return;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__POWER_A:
				setPowerA((Double)newValue);
				return;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__ID:
				setID((String)newValue);
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
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__LOCATION:
				setLocation((Location)null);
				return;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__REACHABILITY:
				setReachability(REACHABILITY_EDEFAULT);
				return;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__POWER_A:
				setPowerA(POWER_A_EDEFAULT);
				return;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__ID:
				setID(ID_EDEFAULT);
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
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__LOCATION:
				return location != null;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__REACHABILITY:
				return reachability != REACHABILITY_EDEFAULT;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__POWER_A:
				return powerA != POWER_A_EDEFAULT;
			case OutageDetectionJointargetPackage.ENERGY_CONSUMER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
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
		result.append(" (Reachability: ");
		result.append(reachability);
		result.append(", PowerA: ");
		result.append(powerA);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EnergyConsumerImpl
