/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FACTS Device Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceInfo#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFACTSDeviceInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of FACTS device asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of FACTS device asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of FACTS device asset.' Profile\040documentation='Properties of FACTS device asset.'"
 * @generated
 */
public interface FACTSDeviceInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceKind
	 * @see #setKind(FACTSDeviceKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFACTSDeviceInfo_Kind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of FACTS device.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of FACTS device.'"
	 * @generated
	 */
	FACTSDeviceKind getKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceInfo#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FACTSDeviceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FACTSDeviceKind value);

} // FACTSDeviceInfo
