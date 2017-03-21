/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.RecloserInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recloser Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.RecloserInfoImpl#getPhaseTripRating <em>Phase Trip Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.RecloserInfoImpl#isGroundTripNormalEnabled <em>Ground Trip Normal Enabled</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.RecloserInfoImpl#getGroundTripRating <em>Ground Trip Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.RecloserInfoImpl#getRecloseLockoutCount <em>Reclose Lockout Count</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.RecloserInfoImpl#isGroundTripCapable <em>Ground Trip Capable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecloserInfoImpl extends SwitchInfoImpl implements RecloserInfo {
	/**
	 * The default value of the '{@link #getPhaseTripRating() <em>Phase Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTripRating()
	 * @generated
	 * @ordered
	 */
	protected static final float PHASE_TRIP_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPhaseTripRating() <em>Phase Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseTripRating()
	 * @generated
	 * @ordered
	 */
	protected float phaseTripRating = PHASE_TRIP_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isGroundTripNormalEnabled() <em>Ground Trip Normal Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundTripNormalEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUND_TRIP_NORMAL_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroundTripNormalEnabled() <em>Ground Trip Normal Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundTripNormalEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean groundTripNormalEnabled = GROUND_TRIP_NORMAL_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroundTripRating() <em>Ground Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTripRating()
	 * @generated
	 * @ordered
	 */
	protected static final float GROUND_TRIP_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGroundTripRating() <em>Ground Trip Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundTripRating()
	 * @generated
	 * @ordered
	 */
	protected float groundTripRating = GROUND_TRIP_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecloseLockoutCount() <em>Reclose Lockout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseLockoutCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RECLOSE_LOCKOUT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecloseLockoutCount() <em>Reclose Lockout Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecloseLockoutCount()
	 * @generated
	 * @ordered
	 */
	protected int recloseLockoutCount = RECLOSE_LOCKOUT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isGroundTripCapable() <em>Ground Trip Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundTripCapable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUND_TRIP_CAPABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroundTripCapable() <em>Ground Trip Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroundTripCapable()
	 * @generated
	 * @ordered
	 */
	protected boolean groundTripCapable = GROUND_TRIP_CAPABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecloserInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getRecloserInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPhaseTripRating() {
		return phaseTripRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseTripRating(float newPhaseTripRating) {
		float oldPhaseTripRating = phaseTripRating;
		phaseTripRating = newPhaseTripRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING, oldPhaseTripRating, phaseTripRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGroundTripNormalEnabled() {
		return groundTripNormalEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundTripNormalEnabled(boolean newGroundTripNormalEnabled) {
		boolean oldGroundTripNormalEnabled = groundTripNormalEnabled;
		groundTripNormalEnabled = newGroundTripNormalEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED, oldGroundTripNormalEnabled, groundTripNormalEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGroundTripRating() {
		return groundTripRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundTripRating(float newGroundTripRating) {
		float oldGroundTripRating = groundTripRating;
		groundTripRating = newGroundTripRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING, oldGroundTripRating, groundTripRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecloseLockoutCount() {
		return recloseLockoutCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecloseLockoutCount(int newRecloseLockoutCount) {
		int oldRecloseLockoutCount = recloseLockoutCount;
		recloseLockoutCount = newRecloseLockoutCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT, oldRecloseLockoutCount, recloseLockoutCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGroundTripCapable() {
		return groundTripCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundTripCapable(boolean newGroundTripCapable) {
		boolean oldGroundTripCapable = groundTripCapable;
		groundTripCapable = newGroundTripCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE, oldGroundTripCapable, groundTripCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING:
				return getPhaseTripRating();
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED:
				return isGroundTripNormalEnabled();
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING:
				return getGroundTripRating();
			case InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT:
				return getRecloseLockoutCount();
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE:
				return isGroundTripCapable();
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
			case InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING:
				setPhaseTripRating((Float)newValue);
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED:
				setGroundTripNormalEnabled((Boolean)newValue);
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING:
				setGroundTripRating((Float)newValue);
				return;
			case InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT:
				setRecloseLockoutCount((Integer)newValue);
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE:
				setGroundTripCapable((Boolean)newValue);
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
			case InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING:
				setPhaseTripRating(PHASE_TRIP_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED:
				setGroundTripNormalEnabled(GROUND_TRIP_NORMAL_ENABLED_EDEFAULT);
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING:
				setGroundTripRating(GROUND_TRIP_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT:
				setRecloseLockoutCount(RECLOSE_LOCKOUT_COUNT_EDEFAULT);
				return;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE:
				setGroundTripCapable(GROUND_TRIP_CAPABLE_EDEFAULT);
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
			case InfAssetsPackage.RECLOSER_INFO__PHASE_TRIP_RATING:
				return phaseTripRating != PHASE_TRIP_RATING_EDEFAULT;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_NORMAL_ENABLED:
				return groundTripNormalEnabled != GROUND_TRIP_NORMAL_ENABLED_EDEFAULT;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_RATING:
				return groundTripRating != GROUND_TRIP_RATING_EDEFAULT;
			case InfAssetsPackage.RECLOSER_INFO__RECLOSE_LOCKOUT_COUNT:
				return recloseLockoutCount != RECLOSE_LOCKOUT_COUNT_EDEFAULT;
			case InfAssetsPackage.RECLOSER_INFO__GROUND_TRIP_CAPABLE:
				return groundTripCapable != GROUND_TRIP_CAPABLE_EDEFAULT;
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
		result.append(" (phaseTripRating: ");
		result.append(phaseTripRating);
		result.append(", groundTripNormalEnabled: ");
		result.append(groundTripNormalEnabled);
		result.append(", groundTripRating: ");
		result.append(groundTripRating);
		result.append(", recloseLockoutCount: ");
		result.append(recloseLockoutCount);
		result.append(", groundTripCapable: ");
		result.append(groundTripCapable);
		result.append(')');
		return result.toString();
	}

} //RecloserInfoImpl
