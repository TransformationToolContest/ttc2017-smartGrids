/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssetModels;

import gluemodel.CIM.IEC61968.AssetModels.AssetModel;

import gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Asset Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssetModels.ElectricalAssetModel#getElectricalInfos <em>Electrical Infos</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getElectricalAssetModel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation for a type of ElectricalAsset of a particular product model made by a manufacturer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation for a type of ElectricalAsset of a particular product model made by a manufacturer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation for a type of ElectricalAsset of a particular product model made by a manufacturer.' Profile\040documentation='Documentation for a type of ElectricalAsset of a particular product model made by a manufacturer.'"
 * @generated
 */
public interface ElectricalAssetModel extends AssetModel {
	/**
	 * Returns the value of the '<em><b>Electrical Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssetModels <em>Electrical Asset Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electrical Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssetModels.InfAssetModelsPackage#getElectricalAssetModel_ElectricalInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssetModels
	 * @model opposite="ElectricalAssetModels"
	 * @generated
	 */
	EList<ElectricalInfo> getElectricalInfos();

} // ElectricalAssetModel
