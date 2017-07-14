/**
 */
package gluemodel.CIM.IEC61968.AssetModels;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tape Shield Cable Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getTapeShieldCableInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Tape shield cable data.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Tape shield cable data.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Tape shield cable data.' Profile\040documentation='Tape shield cable data.'"
 * @generated
 */
public interface TapeShieldCableInfo extends CableInfo {
	/**
	 * Returns the value of the '<em><b>Tape Lap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tape Lap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tape Lap</em>' attribute.
	 * @see #setTapeLap(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getTapeShieldCableInfo_TapeLap()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.PerCent" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Percentage of the tape shield width that overlaps in each wrap, typically 10% to 25%.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Percentage of the tape shield width that overlaps in each wrap, typically 10% to 25%.'"
	 * @generated
	 */
	float getTapeLap();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo#getTapeLap <em>Tape Lap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tape Lap</em>' attribute.
	 * @see #getTapeLap()
	 * @generated
	 */
	void setTapeLap(float value);

	/**
	 * Returns the value of the '<em><b>Tape Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tape Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tape Thickness</em>' attribute.
	 * @see #setTapeThickness(float)
	 * @see gluemodel.CIM.IEC61968.AssetModels.AssetModelsPackage#getTapeShieldCableInfo_TapeThickness()
	 * @model dataType="gluemodel.CIM.IEC61970.Domain.Length" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Thickness of the tape shield, before wrapping.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Thickness of the tape shield, before wrapping.'"
	 * @generated
	 */
	float getTapeThickness();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61968.AssetModels.TapeShieldCableInfo#getTapeThickness <em>Tape Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tape Thickness</em>' attribute.
	 * @see #getTapeThickness()
	 * @generated
	 */
	void setTapeThickness(float value);

} // TapeShieldCableInfo
