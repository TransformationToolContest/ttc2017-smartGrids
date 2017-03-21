/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Wires.Breaker;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.BreakerImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.impl.BreakerImpl#getInTransitTime <em>In Transit Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreakerImpl extends ProtectedSwitchImpl implements Breaker {
	/**
	 * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATED_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratedCurrent = RATED_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInTransitTime() <em>In Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTransitTime()
	 * @generated
	 * @ordered
	 */
	protected static final float IN_TRANSIT_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInTransitTime() <em>In Transit Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInTransitTime()
	 * @generated
	 * @ordered
	 */
	protected float inTransitTime = IN_TRANSIT_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.BREAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatedCurrent() {
		return ratedCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedCurrent(float newRatedCurrent) {
		float oldRatedCurrent = ratedCurrent;
		ratedCurrent = newRatedCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.BREAKER__RATED_CURRENT, oldRatedCurrent, ratedCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInTransitTime() {
		return inTransitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInTransitTime(float newInTransitTime) {
		float oldInTransitTime = inTransitTime;
		inTransitTime = newInTransitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.BREAKER__IN_TRANSIT_TIME, oldInTransitTime, inTransitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.BREAKER__RATED_CURRENT:
				return getRatedCurrent();
			case WiresPackage.BREAKER__IN_TRANSIT_TIME:
				return getInTransitTime();
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
			case WiresPackage.BREAKER__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
				return;
			case WiresPackage.BREAKER__IN_TRANSIT_TIME:
				setInTransitTime((Float)newValue);
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
			case WiresPackage.BREAKER__RATED_CURRENT:
				setRatedCurrent(RATED_CURRENT_EDEFAULT);
				return;
			case WiresPackage.BREAKER__IN_TRANSIT_TIME:
				setInTransitTime(IN_TRANSIT_TIME_EDEFAULT);
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
			case WiresPackage.BREAKER__RATED_CURRENT:
				return ratedCurrent != RATED_CURRENT_EDEFAULT;
			case WiresPackage.BREAKER__IN_TRANSIT_TIME:
				return inTransitTime != IN_TRANSIT_TIME_EDEFAULT;
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
		result.append(" (ratedCurrent: ");
		result.append(ratedCurrent);
		result.append(", inTransitTime: ");
		result.append(inTransitTime);
		result.append(')');
		return result.toString();
	}

} //BreakerImpl
