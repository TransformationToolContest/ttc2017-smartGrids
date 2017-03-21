/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Wires.LoadBreakSwitch;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Break Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.LoadBreakSwitchImpl#getRatedCurrent <em>Rated Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBreakSwitchImpl extends ProtectedSwitchImpl implements LoadBreakSwitch {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBreakSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.LOAD_BREAK_SWITCH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.LOAD_BREAK_SWITCH__RATED_CURRENT, oldRatedCurrent, ratedCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.LOAD_BREAK_SWITCH__RATED_CURRENT:
				return getRatedCurrent();
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
			case WiresPackage.LOAD_BREAK_SWITCH__RATED_CURRENT:
				setRatedCurrent((Float)newValue);
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
			case WiresPackage.LOAD_BREAK_SWITCH__RATED_CURRENT:
				setRatedCurrent(RATED_CURRENT_EDEFAULT);
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
			case WiresPackage.LOAD_BREAK_SWITCH__RATED_CURRENT:
				return ratedCurrent != RATED_CURRENT_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //LoadBreakSwitchImpl
