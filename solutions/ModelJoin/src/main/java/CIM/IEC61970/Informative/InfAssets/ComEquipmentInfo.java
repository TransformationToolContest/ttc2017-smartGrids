/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61968.Metering.DeviceFunction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Equipment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.ComEquipmentInfo#getDeviceFunctions <em>Device Functions</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getComEquipmentInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of communicaiton equipment assets other than media (such as gateways, routers, controllers, etc.).'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of communicaiton equipment assets other than media (such as gateways, routers, controllers, etc.).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of communicaiton equipment assets other than media (such as gateways, routers, controllers, etc.).' Profile\040documentation='Properties of communicaiton equipment assets other than media (such as gateways, routers, controllers, etc.).'"
 * @generated
 */
public interface ComEquipmentInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Device Functions</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61968.Metering.DeviceFunction}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61968.Metering.DeviceFunction#getComEquipmentAsset <em>Com Equipment Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Functions</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getComEquipmentInfo_DeviceFunctions()
	 * @see CIM.IEC61968.Metering.DeviceFunction#getComEquipmentAsset
	 * @model opposite="ComEquipmentAsset"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='All device functions of this communication equipment asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='All device functions of this communication equipment asset.'"
	 * @generated
	 */
	EList<DeviceFunction> getDeviceFunctions();

} // ComEquipmentInfo
