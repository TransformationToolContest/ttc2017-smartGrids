/**
 */
package CIM.IEC61970.Informative.InfTypeAsset;

import CIM.IEC61970.Informative.InfAssets.ElectricalInfo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Type Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfTypeAsset.ElectricalTypeAsset#getElectricalInfos <em>Electrical Infos</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getElectricalTypeAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Generic TypeAsset for all types of component in the network that have electrical characteristics.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Generic TypeAsset for all types of component in the network that have electrical characteristics.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Generic TypeAsset for all types of component in the network that have electrical characteristics.' Profile\040documentation='Generic TypeAsset for all types of component in the network that have electrical characteristics.'"
 * @generated
 */
public interface ElectricalTypeAsset extends TypeAsset {
	/**
	 * Returns the value of the '<em><b>Electrical Infos</b></em>' reference list.
	 * The list contents are of type {@link CIM.IEC61970.Informative.InfAssets.ElectricalInfo}.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalTypeAssets <em>Electrical Type Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electrical Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Infos</em>' reference list.
	 * @see CIM.IEC61970.Informative.InfTypeAsset.InfTypeAssetPackage#getElectricalTypeAsset_ElectricalInfos()
	 * @see CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalTypeAssets
	 * @model opposite="ElectricalTypeAssets"
	 * @generated
	 */
	EList<ElectricalInfo> getElectricalInfos();

} // ElectricalTypeAsset
