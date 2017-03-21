/**
 */
package CIM.IEC61970.Informative.InfAssets;

import CIM.IEC61970.Informative.InfWork.Crew;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.ToolInfo#getCrew <em>Crew</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.ToolInfo#getLastCalibrationDate <em>Last Calibration Date</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getToolInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of tool assets.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of tool assets.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of tool assets.' Profile\040documentation='Properties of tool assets.'"
 * @generated
 */
public interface ToolInfo extends AssetInfo {
	/**
	 * Returns the value of the '<em><b>Crew</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Informative.InfWork.Crew#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' reference.
	 * @see #setCrew(Crew)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getToolInfo_Crew()
	 * @see CIM.IEC61970.Informative.InfWork.Crew#getTools
	 * @model opposite="Tools"
	 * @generated
	 */
	Crew getCrew();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.ToolInfo#getCrew <em>Crew</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' reference.
	 * @see #getCrew()
	 * @generated
	 */
	void setCrew(Crew value);

	/**
	 * Returns the value of the '<em><b>Last Calibration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Calibration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Calibration Date</em>' attribute.
	 * @see #setLastCalibrationDate(String)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getToolInfo_LastCalibrationDate()
	 * @model dataType="CIM.IEC61970.Domain.AbsoluteDate" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Date the tool was last caibrated, if applicable.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Date the tool was last caibrated, if applicable.'"
	 * @generated
	 */
	String getLastCalibrationDate();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.ToolInfo#getLastCalibrationDate <em>Last Calibration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Calibration Date</em>' attribute.
	 * @see #getLastCalibrationDate()
	 * @generated
	 */
	void setLastCalibrationDate(String value);

} // ToolInfo
