/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TowerConstructionKind;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TowerInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tower Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TowerInfoImpl#getConstructionKind <em>Construction Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TowerInfoImpl extends StructureInfoImpl implements TowerInfo {
	/**
	 * The default value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected static final TowerConstructionKind CONSTRUCTION_KIND_EDEFAULT = TowerConstructionKind.SUSPENSION;

	/**
	 * The cached value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionKind()
	 * @generated
	 * @ordered
	 */
	protected TowerConstructionKind constructionKind = CONSTRUCTION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TowerInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTowerInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TowerConstructionKind getConstructionKind() {
		return constructionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionKind(TowerConstructionKind newConstructionKind) {
		TowerConstructionKind oldConstructionKind = constructionKind;
		constructionKind = newConstructionKind == null ? CONSTRUCTION_KIND_EDEFAULT : newConstructionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TOWER_INFO__CONSTRUCTION_KIND, oldConstructionKind, constructionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfAssetsPackage.TOWER_INFO__CONSTRUCTION_KIND:
				return getConstructionKind();
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
			case InfAssetsPackage.TOWER_INFO__CONSTRUCTION_KIND:
				setConstructionKind((TowerConstructionKind)newValue);
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
			case InfAssetsPackage.TOWER_INFO__CONSTRUCTION_KIND:
				setConstructionKind(CONSTRUCTION_KIND_EDEFAULT);
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
			case InfAssetsPackage.TOWER_INFO__CONSTRUCTION_KIND:
				return constructionKind != CONSTRUCTION_KIND_EDEFAULT;
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
		result.append(" (constructionKind: ");
		result.append(constructionKind);
		result.append(')');
		return result.toString();
	}

} //TowerInfoImpl
