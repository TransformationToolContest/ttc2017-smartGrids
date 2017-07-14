/**
 */
package gluemodel.CIM.IEC61968.AssetModels;

import gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel;

import gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getWindingInfos <em>Winding Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssetModels <em>Transformer Asset Models</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.TransformerInfo#getTransformerAssets <em>Transformer Assets</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getTransformerInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Set of transformer data, from an equipment library.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Set of transformer data, from an equipment library.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Set of transformer data, from an equipment library.' Profile\040documentation='Set of transformer data, from an equipment library.'"
 * @generated
 */
public interface TransformerInfo extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Transformers</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformers</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getTransformerInfo_Transformers()
	 * @see gluemodel.CIM.IEC61968.WiresExt.DistributionTransformer#getTransformerInfo
	 * @model opposite="TransformerInfo"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All transformers that can be described with this transformer data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All transformers that can be described with this transformer data.'"
	 * @generated
	 */
	EList<DistributionTransformer> getTransformers();

	/**
	 * Returns the value of the '<em><b>Winding Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getTransformerInfo_WindingInfos()
	 * @see gluemodel.CIM.IEC61968.AssetModels.WindingInfo#getTransformerInfo
	 * @model opposite="TransformerInfo"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Data for all the windings described by this transformer data.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Data for all the windings described by this transformer data.'"
	 * @generated
	 */
	EList<WindingInfo> getWindingInfos();

	/**
	 * Returns the value of the '<em><b>Transformer Asset Models</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Asset Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Asset Models</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getTransformerInfo_TransformerAssetModels()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.TransformerAssetModel#getTransformerInfo
	 * @model opposite="TransformerInfo"
	 * @generated
	 */
	EList<TransformerAssetModel> getTransformerAssetModels();

	/**
	 * Returns the value of the '<em><b>Transformer Assets</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo <em>Transformer Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Assets</em>' reference list.
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getTransformerInfo_TransformerAssets()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.TransformerAsset#getTransformerInfo
	 * @model opposite="TransformerInfo"
	 * @generated
	 */
	EList<TransformerAsset> getTransformerAssets();

} // TransformerInfo
