/**
 */
package gluemodel.CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection Equipment Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip <em>Phase Trip</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip <em>Ground Trip</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProtectionEquipmentInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of protection equipment asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of protection equipment asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of protection equipment asset.' Profile\040documentation='Properties of protection equipment asset.'"
 * @generated
 */
public interface ProtectionEquipmentInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Phase Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Trip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Trip</em>' attribute.
	 * @see #setPhaseTrip(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProtectionEquipmentInfo_PhaseTrip()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Actual phase trip for this type of relay, if applicable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Actual phase trip for this type of relay, if applicable.'"
	 * @generated
	 */
	float getPhaseTrip();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getPhaseTrip <em>Phase Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Trip</em>' attribute.
	 * @see #getPhaseTrip()
	 * @generated
	 */
	void setPhaseTrip(float value);

	/**
	 * Returns the value of the '<em><b>Ground Trip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Trip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Trip</em>' attribute.
	 * @see #setGroundTrip(float)
	 * @see gluemodel.CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getProtectionEquipmentInfo_GroundTrip()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.CurrentFlow" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Actual ground trip for this type of relay, if applicable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Actual ground trip for this type of relay, if applicable.'"
	 * @generated
	 */
	float getGroundTrip();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.Informative.InfAssets.ProtectionEquipmentInfo#getGroundTrip <em>Ground Trip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Trip</em>' attribute.
	 * @see #getGroundTrip()
	 * @generated
	 */
	void setGroundTrip(float value);

} // ProtectionEquipmentInfo
