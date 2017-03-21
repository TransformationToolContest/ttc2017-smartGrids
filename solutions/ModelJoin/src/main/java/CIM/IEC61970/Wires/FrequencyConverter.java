/**
 */
package CIM.IEC61970.Wires;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.FrequencyConverter#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.FrequencyConverter#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.FrequencyConverter#getMaxP <em>Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.FrequencyConverter#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.FrequencyConverter#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.FrequencyConverter#getMinP <em>Min P</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getFrequencyConverter()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A device to convert from one frequency to another (e.g., frequency F1 to F2) comprises a pair of FrequencyConverter instances. One converts from F1 to DC, the other converts the DC to F2.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A device to convert from one frequency to another (e.g., frequency F1 to F2) comprises a pair of FrequencyConverter instances. One converts from F1 to DC, the other converts the DC to F2.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A device to convert from one frequency to another (e.g., frequency F1 to F2) comprises a pair of FrequencyConverter instances. One converts from F1 to DC, the other converts the DC to F2.' Profile\040documentation='A device to convert from one frequency to another (e.g., frequency F1 to F2) comprises a pair of FrequencyConverter instances. One converts from F1 to DC, the other converts the DC to F2.'"
 * @generated
 */
public interface FrequencyConverter extends RegulatingCondEq {
	/**
	 * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Mode</em>' attribute.
	 * @see #setOperatingMode(String)
	 * @see CIM.IEC61970.Wires.WiresPackage#getFrequencyConverter_OperatingMode()
	 * @model dataType="CIM.IEC61970.Wires.OperatingMode" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operating mode for the frequency converter'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operating mode for the frequency converter'"
	 * @generated
	 */
	String getOperatingMode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.FrequencyConverter#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Mode</em>' attribute.
	 * @see #getOperatingMode()
	 * @generated
	 */
	void setOperatingMode(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getFrequencyConverter_Frequency()
	 * @model dataType="CIM.IEC61970.Domain.Frequency" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Frequency on the AC side.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Frequency on the AC side.'"
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.FrequencyConverter#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Max P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max P</em>' attribute.
	 * @see #setMaxP(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getFrequencyConverter_MaxP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum active power on the DC side at which the frequence converter should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum active power on the DC side at which the frequence converter should operate.'"
	 * @generated
	 */
	float getMaxP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.FrequencyConverter#getMaxP <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max P</em>' attribute.
	 * @see #getMaxP()
	 * @generated
	 */
	void setMaxP(float value);

	/**
	 * Returns the value of the '<em><b>Max U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max U</em>' attribute.
	 * @see #setMaxU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getFrequencyConverter_MaxU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum voltage on the DC side at which the frequency converter should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum voltage on the DC side at which the frequency converter should operate.'"
	 * @generated
	 */
	float getMaxU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.FrequencyConverter#getMaxU <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max U</em>' attribute.
	 * @see #getMaxU()
	 * @generated
	 */
	void setMaxU(float value);

	/**
	 * Returns the value of the '<em><b>Min U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min U</em>' attribute.
	 * @see #setMinU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getFrequencyConverter_MinU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum voltage on the DC side at which the frequency converter should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum voltage on the DC side at which the frequency converter should operate.'"
	 * @generated
	 */
	float getMinU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.FrequencyConverter#getMinU <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min U</em>' attribute.
	 * @see #getMinU()
	 * @generated
	 */
	void setMinU(float value);

	/**
	 * Returns the value of the '<em><b>Min P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min P</em>' attribute.
	 * @see #setMinP(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getFrequencyConverter_MinP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum active power on the DC side at which the frequence converter should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum active power on the DC side at which the frequence converter should operate.'"
	 * @generated
	 */
	float getMinP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.FrequencyConverter#getMinP <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min P</em>' attribute.
	 * @see #getMinP()
	 * @generated
	 */
	void setMinP(float value);

} // FrequencyConverter
