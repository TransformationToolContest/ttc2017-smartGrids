/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets.impl;

import gluemodel.CIM.IEC61968.Assets.impl.AssetImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.TapChangerAssetModel;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TapChangerAsset;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap Changer Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.impl.TapChangerAssetImpl#getTapChangerAssetModel <em>Tap Changer Asset Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerAssetImpl extends AssetImpl implements TapChangerAsset {
	/**
	 * The cached value of the '{@link #getTapChangerAssetModel() <em>Tap Changer Asset Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTapChangerAssetModel()
	 * @generated
	 * @ordered
	 */
	protected TapChangerAssetModel tapChangerAssetModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TapChangerAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfAssetsPackage.eINSTANCE.getTapChangerAsset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerAssetModel getTapChangerAssetModel() {
		if (tapChangerAssetModel != null && tapChangerAssetModel.eIsProxy()) {
			InternalEObject oldTapChangerAssetModel = (InternalEObject)tapChangerAssetModel;
			tapChangerAssetModel = (TapChangerAssetModel)eResolveProxy(oldTapChangerAssetModel);
			if (tapChangerAssetModel != oldTapChangerAssetModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL, oldTapChangerAssetModel, tapChangerAssetModel));
			}
		}
		return tapChangerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TapChangerAssetModel basicGetTapChangerAssetModel() {
		return tapChangerAssetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTapChangerAssetModel(TapChangerAssetModel newTapChangerAssetModel, NotificationChain msgs) {
		TapChangerAssetModel oldTapChangerAssetModel = tapChangerAssetModel;
		tapChangerAssetModel = newTapChangerAssetModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL, oldTapChangerAssetModel, newTapChangerAssetModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTapChangerAssetModel(TapChangerAssetModel newTapChangerAssetModel) {
		if (newTapChangerAssetModel != tapChangerAssetModel) {
			NotificationChain msgs = null;
			if (tapChangerAssetModel != null)
				msgs = ((InternalEObject)tapChangerAssetModel).eInverseRemove(this, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS, TapChangerAssetModel.class, msgs);
			if (newTapChangerAssetModel != null)
				msgs = ((InternalEObject)newTapChangerAssetModel).eInverseAdd(this, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS, TapChangerAssetModel.class, msgs);
			msgs = basicSetTapChangerAssetModel(newTapChangerAssetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL, newTapChangerAssetModel, newTapChangerAssetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL:
				if (tapChangerAssetModel != null)
					msgs = ((InternalEObject)tapChangerAssetModel).eInverseRemove(this, InfAssetModelsPackage.TAP_CHANGER_ASSET_MODEL__TAP_CHANGER_ASSETS, TapChangerAssetModel.class, msgs);
				return basicSetTapChangerAssetModel((TapChangerAssetModel)otherEnd, msgs);
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
			case InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL:
				return basicSetTapChangerAssetModel(null, msgs);
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
			case InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL:
				if (resolve) return getTapChangerAssetModel();
				return basicGetTapChangerAssetModel();
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
			case InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL:
				setTapChangerAssetModel((TapChangerAssetModel)newValue);
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
			case InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL:
				setTapChangerAssetModel((TapChangerAssetModel)null);
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
			case InfAssetsPackage.TAP_CHANGER_ASSET__TAP_CHANGER_ASSET_MODEL:
				return tapChangerAssetModel != null;
		}
		return super.eIsSet(featureID);
	}

} //TapChangerAssetImpl
