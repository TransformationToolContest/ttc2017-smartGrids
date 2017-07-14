/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getStructureSupportInfos <em>Structure Support Infos</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getWeedRemovedDate <em>Weed Removed Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getFumigantName <em>Fumigant Name</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getFumigantAppliedDate <em>Fumigant Applied Date</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#isRemoveWeed <em>Remove Weed</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getHeight <em>Height</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getMaterialKind <em>Material Kind</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getMountingConnections <em>Mounting Connections</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of construction holding assets such as conductors, transformers, switchgear, etc.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of construction holding assets such as conductors, transformers, switchgear, etc.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of construction holding assets such as conductors, transformers, switchgear, etc.' Profile\040documentation='Properties of construction holding assets such as conductors, transformers, switchgear, etc.'"
 * @generated
 */
public interface StructureInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Structure Support Infos</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSecuredStructure <em>Secured Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Support Infos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Support Infos</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_StructureSupportInfos()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureSupportInfo#getSecuredStructure
	 * @model opposite="SecuredStructure"
	 * @generated
	 */
	EList<StructureSupportInfo> getStructureSupportInfos();

	/**
	 * Returns the value of the '<em><b>Weed Removed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weed Removed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weed Removed Date</em>' attribute.
	 * @see #setWeedRemovedDate(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_WeedRemovedDate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date weed were last removed.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date weed were last removed.'"
	 * @generated
	 */
	String getWeedRemovedDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getWeedRemovedDate <em>Weed Removed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weed Removed Date</em>' attribute.
	 * @see #getWeedRemovedDate()
	 * @generated
	 */
	void setWeedRemovedDate(String value);

	/**
	 * Returns the value of the '<em><b>Fumigant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fumigant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fumigant Name</em>' attribute.
	 * @see #setFumigantName(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_FumigantName()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Name of fumigant.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Name of fumigant.'"
	 * @generated
	 */
	String getFumigantName();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getFumigantName <em>Fumigant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fumigant Name</em>' attribute.
	 * @see #getFumigantName()
	 * @generated
	 */
	void setFumigantName(String value);

	/**
	 * Returns the value of the '<em><b>Fumigant Applied Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fumigant Applied Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fumigant Applied Date</em>' attribute.
	 * @see #setFumigantAppliedDate(String)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_FumigantAppliedDate()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date fumigant was last applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date fumigant was last applied.'"
	 * @generated
	 */
	String getFumigantAppliedDate();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getFumigantAppliedDate <em>Fumigant Applied Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fumigant Applied Date</em>' attribute.
	 * @see #getFumigantAppliedDate()
	 * @generated
	 */
	void setFumigantAppliedDate(String value);

	/**
	 * Returns the value of the '<em><b>Remove Weed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Weed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Weed</em>' attribute.
	 * @see #setRemoveWeed(boolean)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_RemoveWeed()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='True if weeds are to be removed around asset.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='True if weeds are to be removed around asset.'"
	 * @generated
	 */
	boolean isRemoveWeed();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#isRemoveWeed <em>Remove Weed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Weed</em>' attribute.
	 * @see #isRemoveWeed()
	 * @generated
	 */
	void setRemoveWeed(boolean value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_Height()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Visible height of structure above ground level for overhead construction (e.g., Pole or Tower) or below ground level for an underground vault, manhole, etc. Refer to associated DimensionPropertiesInfo for other types of dimensions.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Visible height of structure above ground level for overhead construction (e.g., Pole or Tower) or below ground level for an underground vault, manhole, etc. Refer to associated DimensionPropertiesInfo for other types of dimensions.'"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Material Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureMaterialKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureMaterialKind
	 * @see #setMaterialKind(StructureMaterialKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_MaterialKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Material this structure is made of.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Material this structure is made of.'"
	 * @generated
	 */
	StructureMaterialKind getMaterialKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getMaterialKind <em>Material Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.StructureMaterialKind
	 * @see #getMaterialKind()
	 * @generated
	 */
	void setMaterialKind(StructureMaterialKind value);

	/**
	 * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Voltage</em>' attribute.
	 * @see #setRatedVoltage(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_RatedVoltage()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Maximum rated voltage of the equipment that can be mounted on/contained within the structure.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Maximum rated voltage of the equipment that can be mounted on/contained within the structure.'"
	 * @generated
	 */
	float getRatedVoltage();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.StructureInfo#getRatedVoltage <em>Rated Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Voltage</em>' attribute.
	 * @see #getRatedVoltage()
	 * @generated
	 */
	void setRatedVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Mounting Connections</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos <em>Structure Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounting Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounting Connections</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getStructureInfo_MountingConnections()
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.MountingConnection#getStructureInfos
	 * @model opposite="StructureInfos"
	 * @generated
	 */
	EList<MountingConnection> getMountingConnections();

} // StructureInfo
