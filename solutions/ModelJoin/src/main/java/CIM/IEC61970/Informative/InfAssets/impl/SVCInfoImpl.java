/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.SVCInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVC Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SVCInfoImpl#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.SVCInfoImpl#getInductiveRating <em>Inductive Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SVCInfoImpl extends FACTSDeviceInfoImpl implements SVCInfo {
	/**
	 * The default value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitiveRating()
	 * @generated
	 * @ordered
	 */
	protected float capacitiveRating = CAPACITIVE_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected static final float INDUCTIVE_RATING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductiveRating()
	 * @generated
	 * @ordered
	 */
	protected float inductiveRating = INDUCTIVE_RATING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SVCInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getSVCInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapacitiveRating() {
		return capacitiveRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacitiveRating(float newCapacitiveRating) {
		float oldCapacitiveRating = capacitiveRating;
		capacitiveRating = newCapacitiveRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SVC_INFO__CAPACITIVE_RATING, oldCapacitiveRating, capacitiveRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInductiveRating() {
		return inductiveRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInductiveRating(float newInductiveRating) {
		float oldInductiveRating = inductiveRating;
		inductiveRating = newInductiveRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.SVC_INFO__INDUCTIVE_RATING, oldInductiveRating, inductiveRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.SVC_INFO__CAPACITIVE_RATING:
				return getCapacitiveRating();
			case InfAssetsPackage.SVC_INFO__INDUCTIVE_RATING:
				return getInductiveRating();
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
			case InfAssetsPackage.SVC_INFO__CAPACITIVE_RATING:
				setCapacitiveRating((Float)newValue);
				return;
			case InfAssetsPackage.SVC_INFO__INDUCTIVE_RATING:
				setInductiveRating((Float)newValue);
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
			case InfAssetsPackage.SVC_INFO__CAPACITIVE_RATING:
				setCapacitiveRating(CAPACITIVE_RATING_EDEFAULT);
				return;
			case InfAssetsPackage.SVC_INFO__INDUCTIVE_RATING:
				setInductiveRating(INDUCTIVE_RATING_EDEFAULT);
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
			case InfAssetsPackage.SVC_INFO__CAPACITIVE_RATING:
				return capacitiveRating != CAPACITIVE_RATING_EDEFAULT;
			case InfAssetsPackage.SVC_INFO__INDUCTIVE_RATING:
				return inductiveRating != INDUCTIVE_RATING_EDEFAULT;
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
		result.append(" (capacitiveRating: ");
		result.append(capacitiveRating);
		result.append(", inductiveRating: ");
		result.append(inductiveRating);
		result.append(')');
		return result.toString();
	}

} //SVCInfoImpl
