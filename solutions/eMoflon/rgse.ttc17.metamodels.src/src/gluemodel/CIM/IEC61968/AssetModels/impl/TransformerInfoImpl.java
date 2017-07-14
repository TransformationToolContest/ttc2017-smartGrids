/**
 */
package gluemodel.CIM.IEC61968.AssetModels.impl;

import gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage;
import gluemodel.CIM.IEC61968.AssetModels.TransformerInfo;
import gluemodel.CIM.IEC61968.AssetModels.WindingInfo;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer;
import gluemodel.CIM.IEC61968.WiresExt.WiresExtPackage;

import gluemodel.CIM.IEC61970.Core.impl.IdentifiedObjectImpl;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel;

import gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage;
import gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.TransformerInfoImpl#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.TransformerInfoImpl#getWindingInfos <em>Winding Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.TransformerInfoImpl#getTransformerAssetModels <em>Transformer Asset Models</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.impl.TransformerInfoImpl#getTransformerAssets <em>Transformer Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerInfoImpl extends IdentifiedObjectImpl implements TransformerInfo {
	/**
	 * The cached value of the '{@link #getTransformers() <em>Transformers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformers()
	 * @generated
	 * @ordered
	 */
	protected EList<DistributionTransformer> transformers;

	/**
	 * The cached value of the '{@link #getWindingInfos() <em>Winding Infos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindingInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<WindingInfo> windingInfos;

	/**
	 * The cached value of the '{@link #getTransformerAssetModels() <em>Transformer Asset Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerAssetModel> transformerAssetModels;

	/**
	 * The cached value of the '{@link #getTransformerAssets() <em>Transformer Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformerAsset> transformerAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformerInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssetModelsPackage.Literals.TRANSFORMER_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DistributionTransformer> getTransformers() {
		if (transformers == null) {
			transformers = new EObjectWithInverseResolvingEList<DistributionTransformer>(DistributionTransformer.class, this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS, WiresExtPackage.DISTRIBUTION_TRANSFORMER__TRANSFORMER_INFO);
		}
		return transformers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WindingInfo> getWindingInfos() {
		if (windingInfos == null) {
			windingInfos = new EObjectWithInverseResolvingEList<WindingInfo>(WindingInfo.class, this, AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS, AssetModelsPackage.WINDING_INFO__TRANSFORMER_INFO);
		}
		return windingInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerAssetModel> getTransformerAssetModels() {
		if (transformerAssetModels == null) {
			transformerAssetModels = new EObjectWithInverseResolvingEList<TransformerAssetModel>(TransformerAssetModel.class, this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS, InfAssetModelsPackage.TRANSFORMER_ASSET_MODEL__TRANSFORMER_INFO);
		}
		return transformerAssetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformerAsset> getTransformerAssets() {
		if (transformerAssets == null) {
			transformerAssets = new EObjectWithInverseResolvingEList<TransformerAsset>(TransformerAsset.class, this, AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS, InfAssetsPackage.TRANSFORMER_ASSET__TRANSFORMER_INFO);
		}
		return transformerAssets;
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
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformers()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWindingInfos()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerAssetModels()).basicAdd(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformerAssets()).basicAdd(otherEnd, msgs);
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
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS:
				return ((InternalEList<?>)getTransformers()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS:
				return ((InternalEList<?>)getWindingInfos()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS:
				return ((InternalEList<?>)getTransformerAssetModels()).basicRemove(otherEnd, msgs);
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS:
				return ((InternalEList<?>)getTransformerAssets()).basicRemove(otherEnd, msgs);
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
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS:
				return getTransformers();
			case AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS:
				return getWindingInfos();
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS:
				return getTransformerAssetModels();
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS:
				return getTransformerAssets();
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
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS:
				getTransformers().clear();
				getTransformers().addAll((Collection<? extends DistributionTransformer>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS:
				getWindingInfos().clear();
				getWindingInfos().addAll((Collection<? extends WindingInfo>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS:
				getTransformerAssetModels().clear();
				getTransformerAssetModels().addAll((Collection<? extends TransformerAssetModel>)newValue);
				return;
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
				getTransformerAssets().addAll((Collection<? extends TransformerAsset>)newValue);
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
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS:
				getTransformers().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS:
				getWindingInfos().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS:
				getTransformerAssetModels().clear();
				return;
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS:
				getTransformerAssets().clear();
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
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMERS:
				return transformers != null && !transformers.isEmpty();
			case AssetModelsPackage.TRANSFORMER_INFO__WINDING_INFOS:
				return windingInfos != null && !windingInfos.isEmpty();
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSET_MODELS:
				return transformerAssetModels != null && !transformerAssetModels.isEmpty();
			case AssetModelsPackage.TRANSFORMER_INFO__TRANSFORMER_ASSETS:
				return transformerAssets != null && !transformerAssets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformerInfoImpl
