/**
 */
package CIM.IEC61970.Informative.InfTypeAsset.impl;

import CIM.IEC61970.Informative.InfAssets.ElectricalInfo;
import CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;

import CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset;
import CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electrical Type Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.impl.ElectricalTypeAssetImpl#getElectricalInfos <em>Electrical Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricalTypeAssetImpl extends TypeAssetImpl implements ElectricalTypeAsset {
	/**
	 * The cached value of the '{@link #getElectricalInfos() <em>Electrical Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricalInfo> electricalInfos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalTypeAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfTypeAssetPackage.Literals.ELECTRICAL_TYPE_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalInfo> getElectricalInfos() {
		if (electricalInfos == null) {
			electricalInfos = new EObjectWithInverseResolvingEList.ManyInverse<ElectricalInfo>(ElectricalInfo.class, this, InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS, InfAssetsPackage.ELECTRICAL_INFO__ELECTRICAL_TYPE_ASSETS);
		}
		return electricalInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElectricalInfos()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS:
				return ((InternalEList<?>)getElectricalInfos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS:
				return getElectricalInfos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS:
				getElectricalInfos().clear();
				getElectricalInfos().addAll((Collection<? extends ElectricalInfo>)newValue);
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
			case InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS:
				getElectricalInfos().clear();
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
			case InfTypeAssetPackage.ELECTRICAL_TYPE_ASSET__ELECTRICAL_INFOS:
				return electricalInfos != null && !electricalInfos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElectricalTypeAssetImpl
