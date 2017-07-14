/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Indicator Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind <em>Reset Kind</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFaultIndicatorInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Parameters of fault indicator asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Parameters of fault indicator asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Parameters of fault indicator asset.' Profile\040documentation='Parameters of fault indicator asset.'"
 * @generated
 */
public interface FaultIndicatorInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Reset Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorResetKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorResetKind
	 * @see #setResetKind(FaultIndicatorResetKind)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getFaultIndicatorInfo_ResetKind()
	 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Kind of reset mechanisim of this fault indicator.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Kind of reset mechanisim of this fault indicator.'"
	 * @generated
	 */
	FaultIndicatorResetKind getResetKind();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorInfo#getResetKind <em>Reset Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Kind</em>' attribute.
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.FaultIndicatorResetKind
	 * @see #getResetKind()
	 * @generated
	 */
	void setResetKind(FaultIndicatorResetKind value);

} // FaultIndicatorInfo
