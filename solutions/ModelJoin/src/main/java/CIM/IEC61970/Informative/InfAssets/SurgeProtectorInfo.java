/**
 */
package CIM.IEC61970.Informative.InfAssets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surge Protector Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage <em>Nominal Design Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating <em>Max Current Rating</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSurgeProtectorInfo()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Properties of surge protector asset.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Properties of surge protector asset.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Properties of surge protector asset.' Profile\040documentation='Properties of surge protector asset.'"
 * @generated
 */
public interface SurgeProtectorInfo extends ElectricalInfo {
	/**
	 * Returns the value of the '<em><b>Nominal Design Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Design Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Design Voltage</em>' attribute.
	 * @see #setNominalDesignVoltage(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSurgeProtectorInfo_NominalDesignVoltage()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 * @generated
	 */
	float getNominalDesignVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getNominalDesignVoltage <em>Nominal Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Design Voltage</em>' attribute.
	 * @see #getNominalDesignVoltage()
	 * @generated
	 */
	void setNominalDesignVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Max Current Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Current Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Current Rating</em>' attribute.
	 * @see #setMaxCurrentRating(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSurgeProtectorInfo_MaxCurrentRating()
	 * @model dataType="CIM.IEC61970.Domain.CurrentFlow" required="true"
	 * @generated
	 */
	float getMaxCurrentRating();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxCurrentRating <em>Max Current Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Current Rating</em>' attribute.
	 * @see #getMaxCurrentRating()
	 * @generated
	 */
	void setMaxCurrentRating(float value);

	/**
	 * Returns the value of the '<em><b>Max Continous Operating Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Continous Operating Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Continous Operating Voltage</em>' attribute.
	 * @see #setMaxContinousOperatingVoltage(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSurgeProtectorInfo_MaxContinousOperatingVoltage()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 * @generated
	 */
	float getMaxContinousOperatingVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxContinousOperatingVoltage <em>Max Continous Operating Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Continous Operating Voltage</em>' attribute.
	 * @see #getMaxContinousOperatingVoltage()
	 * @generated
	 */
	void setMaxContinousOperatingVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Max Energy Absorption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Energy Absorption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Energy Absorption</em>' attribute.
	 * @see #setMaxEnergyAbsorption(float)
	 * @see CIM.IEC61970.Informative.InfAssets.InfAssetsPackage#getSurgeProtectorInfo_MaxEnergyAbsorption()
	 * @model required="true"
	 * @generated
	 */
	float getMaxEnergyAbsorption();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Informative.InfAssets.SurgeProtectorInfo#getMaxEnergyAbsorption <em>Max Energy Absorption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Energy Absorption</em>' attribute.
	 * @see #getMaxEnergyAbsorption()
	 * @generated
	 */
	void setMaxEnergyAbsorption(float value);

} // SurgeProtectorInfo
