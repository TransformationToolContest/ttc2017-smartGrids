/**
 */
package CIM.IEC61970.Informative.InfAssets.impl;

import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import CIM.IEC61970.Informative.InfAssets.UndergroundStructureInfo;
import CIM.IEC61970.Informative.InfAssets.UndergroundStructureKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underground Structure Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.UndergroundStructureInfoImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.UndergroundStructureInfoImpl#isHasVentilation <em>Has Ventilation</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.UndergroundStructureInfoImpl#getSealingWarrantyExpiresDate <em>Sealing Warranty Expires Date</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.impl.UndergroundStructureInfoImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UndergroundStructureInfoImpl extends StructureInfoImpl implements UndergroundStructureInfo {
	/**
	 * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected String material = MATERIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasVentilation() <em>Has Ventilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasVentilation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_VENTILATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasVentilation() <em>Has Ventilation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasVentilation()
	 * @generated
	 * @ordered
	 */
	protected boolean hasVentilation = HAS_VENTILATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSealingWarrantyExpiresDate() <em>Sealing Warranty Expires Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealingWarrantyExpiresDate()
	 * @generated
	 * @ordered
	 */
	protected static final String SEALING_WARRANTY_EXPIRES_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSealingWarrantyExpiresDate() <em>Sealing Warranty Expires Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealingWarrantyExpiresDate()
	 * @generated
	 * @ordered
	 */
	protected String sealingWarrantyExpiresDate = SEALING_WARRANTY_EXPIRES_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final UndergroundStructureKind KIND_EDEFAULT = UndergroundStructureKind.TRENCH;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected UndergroundStructureKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndergroundStructureInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getUndergroundStructureInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(String newMaterial) {
		String oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__MATERIAL, oldMaterial, material));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasVentilation() {
		return hasVentilation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasVentilation(boolean newHasVentilation) {
		boolean oldHasVentilation = hasVentilation;
		hasVentilation = newHasVentilation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__HAS_VENTILATION, oldHasVentilation, hasVentilation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSealingWarrantyExpiresDate() {
		return sealingWarrantyExpiresDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSealingWarrantyExpiresDate(String newSealingWarrantyExpiresDate) {
		String oldSealingWarrantyExpiresDate = sealingWarrantyExpiresDate;
		sealingWarrantyExpiresDate = newSealingWarrantyExpiresDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__SEALING_WARRANTY_EXPIRES_DATE, oldSealingWarrantyExpiresDate, sealingWarrantyExpiresDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndergroundStructureKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(UndergroundStructureKind newKind) {
		UndergroundStructureKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__MATERIAL:
				return getMaterial();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__HAS_VENTILATION:
				return isHasVentilation();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__SEALING_WARRANTY_EXPIRES_DATE:
				return getSealingWarrantyExpiresDate();
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__KIND:
				return getKind();
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
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__MATERIAL:
				setMaterial((String)newValue);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__HAS_VENTILATION:
				setHasVentilation((Boolean)newValue);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__SEALING_WARRANTY_EXPIRES_DATE:
				setSealingWarrantyExpiresDate((String)newValue);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__KIND:
				setKind((UndergroundStructureKind)newValue);
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
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__MATERIAL:
				setMaterial(MATERIAL_EDEFAULT);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__HAS_VENTILATION:
				setHasVentilation(HAS_VENTILATION_EDEFAULT);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__SEALING_WARRANTY_EXPIRES_DATE:
				setSealingWarrantyExpiresDate(SEALING_WARRANTY_EXPIRES_DATE_EDEFAULT);
				return;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__KIND:
				setKind(KIND_EDEFAULT);
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
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__MATERIAL:
				return MATERIAL_EDEFAULT == null ? material != null : !MATERIAL_EDEFAULT.equals(material);
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__HAS_VENTILATION:
				return hasVentilation != HAS_VENTILATION_EDEFAULT;
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__SEALING_WARRANTY_EXPIRES_DATE:
				return SEALING_WARRANTY_EXPIRES_DATE_EDEFAULT == null ? sealingWarrantyExpiresDate != null : !SEALING_WARRANTY_EXPIRES_DATE_EDEFAULT.equals(sealingWarrantyExpiresDate);
			case InfAssetsPackage.UNDERGROUND_STRUCTURE_INFO__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (material: ");
		result.append(material);
		result.append(", hasVentilation: ");
		result.append(hasVentilation);
		result.append(", sealingWarrantyExpiresDate: ");
		result.append(sealingWarrantyExpiresDate);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //UndergroundStructureInfoImpl
