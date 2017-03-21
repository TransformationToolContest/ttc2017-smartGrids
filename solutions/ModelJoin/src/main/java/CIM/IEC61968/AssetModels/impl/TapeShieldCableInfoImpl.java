/**
 */
package CIM.IEC61968.AssetModels.impl;

import CIM.IEC61968.AssetModels.AssetModelsPackage;
import CIM.IEC61968.AssetModels.TapeShieldCableInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tape Shield Cable Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.TapeShieldCableInfoImpl#getTapeLap <em>Tape Lap</em>}</li>
 *   <li>{@link CIM.IEC61968.AssetModels.impl.TapeShieldCableInfoImpl#getTapeThickness <em>Tape Thickness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapeShieldCableInfoImpl extends CableInfoImpl implements TapeShieldCableInfo {
	/**
	 * The default value of the '{@link #getTapeLap() <em>Tape Lap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeLap()
	 * @generated
	 * @ordered
	 */
	protected static final float TAPE_LAP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTapeLap() <em>Tape Lap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeLap()
	 * @generated
	 * @ordered
	 */
	protected float tapeLap = TAPE_LAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTapeThickness() <em>Tape Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeThickness()
	 * @generated
	 * @ordered
	 */
	protected static final float TAPE_THICKNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTapeThickness() <em>Tape Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapeThickness()
	 * @generated
	 * @ordered
	 */
	protected float tapeThickness = TAPE_THICKNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapeShieldCableInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.TAPE_SHIELD_CABLE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTapeLap() {
		return tapeLap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapeLap(float newTapeLap) {
		float oldTapeLap = tapeLap;
		tapeLap = newTapeLap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP, oldTapeLap, tapeLap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTapeThickness() {
		return tapeThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapeThickness(float newTapeThickness) {
		float oldTapeThickness = tapeThickness;
		tapeThickness = newTapeThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS, oldTapeThickness, tapeThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
				return getTapeLap();
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
				return getTapeThickness();
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
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
				setTapeLap((Float)newValue);
				return;
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
				setTapeThickness((Float)newValue);
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
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
				setTapeLap(TAPE_LAP_EDEFAULT);
				return;
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
				setTapeThickness(TAPE_THICKNESS_EDEFAULT);
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
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_LAP:
				return tapeLap != TAPE_LAP_EDEFAULT;
			case AssetModelsPackage.TAPE_SHIELD_CABLE_INFO__TAPE_THICKNESS:
				return tapeThickness != TAPE_THICKNESS_EDEFAULT;
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
		result.append(" (tapeLap: ");
		result.append(tapeLap);
		result.append(", tapeThickness: ");
		result.append(tapeThickness);
		result.append(')');
		return result.toString();
	}

} //TapeShieldCableInfoImpl
