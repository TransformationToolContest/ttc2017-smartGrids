/**
 */
package CIM.IEC61970.Wires.impl;

import CIM.IEC61970.Wires.Fuse;
import CIM.IEC61970.Wires.WiresPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.impl.FuseImpl#getRatingCurrent <em>Rating Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuseImpl extends SwitchImpl implements Fuse {
	/**
	 * The default value of the '{@link #getRatingCurrent() <em>Rating Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final float RATING_CURRENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRatingCurrent() <em>Rating Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingCurrent()
	 * @generated
	 * @ordered
	 */
	protected float ratingCurrent = RATING_CURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiresPackage.Literals.FUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRatingCurrent() {
		return ratingCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatingCurrent(float newRatingCurrent) {
		float oldRatingCurrent = ratingCurrent;
		ratingCurrent = newRatingCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiresPackage.FUSE__RATING_CURRENT, oldRatingCurrent, ratingCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WiresPackage.FUSE__RATING_CURRENT:
				return getRatingCurrent();
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
			case WiresPackage.FUSE__RATING_CURRENT:
				setRatingCurrent((Float)newValue);
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
			case WiresPackage.FUSE__RATING_CURRENT:
				setRatingCurrent(RATING_CURRENT_EDEFAULT);
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
			case WiresPackage.FUSE__RATING_CURRENT:
				return ratingCurrent != RATING_CURRENT_EDEFAULT;
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
		result.append(" (ratingCurrent: ");
		result.append(ratingCurrent);
		result.append(')');
		return result.toString();
	}

} //FuseImpl
