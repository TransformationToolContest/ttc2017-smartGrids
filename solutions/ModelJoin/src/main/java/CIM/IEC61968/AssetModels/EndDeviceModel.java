/**
 */
package CIM.IEC61968.AssetModels;

import CIM.IEC61968.Metering.EndDeviceAsset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61968.AssetModels.EndDeviceModel#getEndDeviceAssets <em>End Device Assets</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getEndDeviceModel()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Documentation for particular end device product model made by a manufacturer.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Documentation for particular end device product model made by a manufacturer.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Documentation for particular end device product model made by a manufacturer.' Profile\040documentation='Documentation for particular end device product model made by a manufacturer.'"
 * @generated
 */
public interface EndDeviceModel extends AssetModel {
	/**
	 * Returns the value of the '<em><b>End Device Assets</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.EndDeviceAsset}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceModel <em>End Device Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Device Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Device Assets</em>' reference list.
	 * @see CIM.IEC61968.AssetModels.AssetModelsPackage#getEndDeviceModel_EndDeviceAssets()
	 * @see CIM.IEC61968.Metering.EndDeviceAsset#getEndDeviceModel
	 * @model opposite="EndDeviceModel"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All end device assets being of this model.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All end device assets being of this model.'"
	 * @generated
	 */
	EList<EndDeviceAsset> getEndDeviceAssets();

} // EndDeviceModel
