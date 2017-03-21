/**
 */
package CIM.IEC61970.Generation.GenerationDynamics.impl;

import CIM.IEC61970.Generation.GenerationDynamics.DrumBoiler;
import CIM.IEC61970.Generation.GenerationDynamics.GenerationDynamicsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drum Boiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.GenerationDynamics.impl.DrumBoilerImpl#getDrumBoilerRating <em>Drum Boiler Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrumBoilerImpl extends FossilSteamSupplyImpl implements DrumBoiler {
	/**
	 * The default value of the '{@link #getDrumBoilerRating() <em>Drum Boiler Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrumBoilerRating()
	 * @generated
	 * @ordered
	 */
	protected static final float DRUM_BOILER_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDrumBoilerRating() <em>Drum Boiler Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrumBoilerRating()
	 * @generated
	 * @ordered
	 */
	protected float drumBoilerRating = DRUM_BOILER_RATING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrumBoilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationDynamicsPackage.Literals.DRUM_BOILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDrumBoilerRating() {
		return drumBoilerRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrumBoilerRating(float newDrumBoilerRating) {
		float oldDrumBoilerRating = drumBoilerRating;
		drumBoilerRating = newDrumBoilerRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING, oldDrumBoilerRating, drumBoilerRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING:
				return getDrumBoilerRating();
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
			case GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING:
				setDrumBoilerRating((Float)newValue);
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
			case GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING:
				setDrumBoilerRating(DRUM_BOILER_RATING_EDEFAULT);
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
			case GenerationDynamicsPackage.DRUM_BOILER__DRUM_BOILER_RATING:
				return drumBoilerRating != DRUM_BOILER_RATING_EDEFAULT;
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
		result.append(" (drumBoilerRating: ");
		result.append(drumBoilerRating);
		result.append(')');
		return result.toString();
	}

} //DrumBoilerImpl
