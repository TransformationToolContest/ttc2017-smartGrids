/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import gluemodel.CIM.IEC61968.Assets.Asset;

import gluemodel.CIM.IEC61970.Core.ConductingEquipment;
import gluemodel.CIM.IEC61970.Core.PhaseCode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getPhaseCode <em>Phase Code</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#isIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getElectricalInfos <em>Electrical Infos</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalAsset()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='An asset that has (or can have) a role in the electrical network.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='An asset that has (or can have) a role in the electrical network.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An asset that has (or can have) a role in the electrical network.' Profile\040documentation='An asset that has (or can have) a role in the electrical network.'"
 * @generated
 */
public interface ElectricalAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Phase Code</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Core.PhaseCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #setPhaseCode(PhaseCode)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalAsset_PhaseCode()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='If \'isConnected\' is true, then this is the as-built phase(s) that the asset is associatied with.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='If \'isConnected\' is true, then this is the as-built phase(s) that the asset is associatied with.'"
	 * @generated
	 */
	PhaseCode getPhaseCode();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getPhaseCode <em>Phase Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Code</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Core.PhaseCode
	 * @see #getPhaseCode()
	 * @generated
	 */
	void setPhaseCode(PhaseCode value);

	/**
	 * Returns the value of the '<em><b>Is Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Connected</em>' attribute.
	 * @see #setIsConnected(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalAsset_IsConnected()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if the asset is physically connected to electrical network (as opposed to being in a warehouse, being refurbished, etc.). Note that this attribute is not intended to imply energization status and/or whether the asset is actually being used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if the asset is physically connected to electrical network (as opposed to being in a warehouse, being refurbished, etc.). Note that this attribute is not intended to imply energization status and/or whether the asset is actually being used.'"
	 * @generated
	 */
	boolean isIsConnected();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#isIsConnected <em>Is Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Connected</em>' attribute.
	 * @see #isIsConnected()
	 * @generated
	 */
	void setIsConnected(boolean value);

	/**
	 * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Core.ConductingEquipment#getElectricalAssets <em>Electrical Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducting Equipment</em>' reference.
	 * @see #setConductingEquipment(ConductingEquipment)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalAsset_ConductingEquipment()
	 * @see gluemodel.CIM.IEC61970.Core.ConductingEquipment#getElectricalAssets
	 * @model opposite="ElectricalAssets"
	 * @generated
	 */
	ConductingEquipment getConductingEquipment();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalAsset#getConductingEquipment <em>Conducting Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conducting Equipment</em>' reference.
	 * @see #getConductingEquipment()
	 * @generated
	 */
	void setConductingEquipment(ConductingEquipment value);

	/**
	 * Returns the value of the '<em><b>Electrical Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssets <em>Electrical Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electrical Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getElectricalAsset_ElectricalInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.ElectricalInfo#getElectricalAssets
	 * @model opposite="ElectricalAssets"
	 * @generated
	 */
	EList<ElectricalInfo> getElectricalInfos();

} // ElectricalAsset
