/**
 */
package gluemodel.CIM.IEC61970.LoadModel;

import gluemodel.CIM.IEC61970.Core.IdentifiedObject;

import gluemodel.CIM.IEC61970.Wires.EnergyConsumer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Response Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel <em>Exponent Model</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Models the characteristic response of the load demand due to to changes in system conditions such as voltage and frequency. This is not related to demand response.\n\nIf LoadResponseCharacteristic.exponentModel is True, the voltage exponents are specified and used as to calculate:\n\nActive power component = Pnominal * (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent\n\nReactive power component = Qnominal * (Voltage/cim:BaseVoltage.nominalVoltage)** cim:LoadResponseCharacteristic.qVoltageExponent\n\nWhere  * means \"multiply\" and ** is \"raised to power of\".'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Models the characteristic response of the load demand due to to changes in system conditions such as voltage and frequency. This is not related to demand response.\n\nIf LoadResponseCharacteristic.exponentModel is True, the voltage exponents are specified and used as to calculate:\n\nActive power component = Pnominal * (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent\n\nReactive power component = Qnominal * (Voltage/cim:BaseVoltage.nominalVoltage)** cim:LoadResponseCharacteristic.qVoltageExponent\n\nWhere  * means \"multiply\" and ** is \"raised to power of\".'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Models the characteristic response of the load demand due to to changes in system conditions such as voltage and frequency. This is not related to demand response.\n\nIf LoadResponseCharacteristic.exponentModel is True, the voltage exponents are specified and used as to calculate:\n\nActive power component = Pnominal * (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent\n\nReactive power component = Qnominal * (Voltage/cim:BaseVoltage.nominalVoltage)** cim:LoadResponseCharacteristic.qVoltageExponent\n\nWhere  * means \"multiply\" and ** is \"raised to power of\".' Profile\040documentation='Models the characteristic response of the load demand due to to changes in system conditions such as voltage and frequency. This is not related to demand response.\n\nIf LoadResponseCharacteristic.exponentModel is True, the voltage exponents are specified and used as to calculate:\n\nActive power component = Pnominal * (Voltage/cim:BaseVoltage.nominalVoltage) ** cim:LoadResponseCharacteristic.pVoltageExponent\n\nReactive power component = Qnominal * (Voltage/cim:BaseVoltage.nominalVoltage)** cim:LoadResponseCharacteristic.qVoltageExponent\n\nWhere  * means \"multiply\" and ** is \"raised to power of\".'"
 * @generated
 */
public interface LoadResponseCharacteristic extends IdentifiedObject {
	/**
	 * Returns the value of the '<em><b>Exponent Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent Model</em>' attribute.
	 * @see #setExponentModel(boolean)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_ExponentModel()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Indicates the exponential voltage dependency model (pVoltateExponent and qVoltageExponent) is to be used.   If false, the coeficient model (consisting of pConstantImpedance, pConstantCurrent, pConstantPower, qConstantImpedance, qConstantCurrent, and qConstantPower) is to be used.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Indicates the exponential voltage dependency model (pVoltateExponent and qVoltageExponent) is to be used.   If false, the coeficient model (consisting of pConstantImpedance, pConstantCurrent, pConstantPower, qConstantImpedance, qConstantCurrent, and qConstantPower) is to be used.'"
	 * @generated
	 */
	boolean isExponentModel();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#isExponentModel <em>Exponent Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent Model</em>' attribute.
	 * @see #isExponentModel()
	 * @generated
	 */
	void setExponentModel(boolean value);

	/**
	 * Returns the value of the '<em><b>PConstant Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PConstant Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PConstant Current</em>' attribute.
	 * @see #setPConstantCurrent(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_PConstantCurrent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Portion of active power load modeled as constant current. Used only if the useExponentModel is false.    This value is noralized against the sum of pZ, pI, and pP.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Portion of active power load modeled as constant current. Used only if the useExponentModel is false.    This value is noralized against the sum of pZ, pI, and pP.'"
	 * @generated
	 */
	float getPConstantCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PConstant Current</em>' attribute.
	 * @see #getPConstantCurrent()
	 * @generated
	 */
	void setPConstantCurrent(float value);

	/**
	 * Returns the value of the '<em><b>QConstant Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QConstant Impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QConstant Impedance</em>' attribute.
	 * @see #setQConstantImpedance(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_QConstantImpedance()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Portion of reactive power load modeled as constant impedance.  Used only if the useExponentModel is false.    This value is noralized against the sum of qZ, qI, and qP.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Portion of reactive power load modeled as constant impedance.  Used only if the useExponentModel is false.    This value is noralized against the sum of qZ, qI, and qP.'"
	 * @generated
	 */
	float getQConstantImpedance();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QConstant Impedance</em>' attribute.
	 * @see #getQConstantImpedance()
	 * @generated
	 */
	void setQConstantImpedance(float value);

	/**
	 * Returns the value of the '<em><b>QFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QFrequency Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QFrequency Exponent</em>' attribute.
	 * @see #setQFrequencyExponent(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_QFrequencyExponent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Exponent of per unit frequency effecting reactive power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exponent of per unit frequency effecting reactive power'"
	 * @generated
	 */
	float getQFrequencyExponent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QFrequency Exponent</em>' attribute.
	 * @see #getQFrequencyExponent()
	 * @generated
	 */
	void setQFrequencyExponent(float value);

	/**
	 * Returns the value of the '<em><b>PFrequency Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PFrequency Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PFrequency Exponent</em>' attribute.
	 * @see #setPFrequencyExponent(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_PFrequencyExponent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Exponent of per unit frequency effecting active power'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exponent of per unit frequency effecting active power'"
	 * @generated
	 */
	float getPFrequencyExponent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PFrequency Exponent</em>' attribute.
	 * @see #getPFrequencyExponent()
	 * @generated
	 */
	void setPFrequencyExponent(float value);

	/**
	 * Returns the value of the '<em><b>PConstant Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PConstant Impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PConstant Impedance</em>' attribute.
	 * @see #setPConstantImpedance(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_PConstantImpedance()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Portion of active power load modeled as constant impedance.  Used only if the useExponentModel is false.    This value is noralized against the sum of pZ, pI, and pP.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Portion of active power load modeled as constant impedance.  Used only if the useExponentModel is false.    This value is noralized against the sum of pZ, pI, and pP.'"
	 * @generated
	 */
	float getPConstantImpedance();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PConstant Impedance</em>' attribute.
	 * @see #getPConstantImpedance()
	 * @generated
	 */
	void setPConstantImpedance(float value);

	/**
	 * Returns the value of the '<em><b>QVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QVoltage Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QVoltage Exponent</em>' attribute.
	 * @see #setQVoltageExponent(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_QVoltageExponent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Exponent of per unit voltage effecting reactive power.   This model used only when \"useExponentModel\" is true.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exponent of per unit voltage effecting reactive power.   This model used only when \"useExponentModel\" is true.'"
	 * @generated
	 */
	float getQVoltageExponent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QVoltage Exponent</em>' attribute.
	 * @see #getQVoltageExponent()
	 * @generated
	 */
	void setQVoltageExponent(float value);

	/**
	 * Returns the value of the '<em><b>PVoltage Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PVoltage Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PVoltage Exponent</em>' attribute.
	 * @see #setPVoltageExponent(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_PVoltageExponent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Exponent of per unit voltage effecting real power.   This model used only when \"useExponentModel\" is true.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Exponent of per unit voltage effecting real power.   This model used only when \"useExponentModel\" is true.'"
	 * @generated
	 */
	float getPVoltageExponent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PVoltage Exponent</em>' attribute.
	 * @see #getPVoltageExponent()
	 * @generated
	 */
	void setPVoltageExponent(float value);

	/**
	 * Returns the value of the '<em><b>Energy Consumer</b></em>' reference list.
	 * The list contents are of type {@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer}.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Consumer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Consumer</em>' reference list.
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_EnergyConsumer()
	 * @see gluemodel.CIM.IEC61970.Wires.EnergyConsumer#getLoadResponse
	 * @model opposite="LoadResponse"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The set of loads that have the response characteristics.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The set of loads that have the response characteristics.'"
	 * @generated
	 */
	EList<EnergyConsumer> getEnergyConsumer();

	/**
	 * Returns the value of the '<em><b>QConstant Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QConstant Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QConstant Current</em>' attribute.
	 * @see #setQConstantCurrent(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_QConstantCurrent()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Portion of reactive power load modeled as constant current. Used only if the useExponentModel is false.    This value is noralized against the sum of qZ, qI, and qP.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Portion of reactive power load modeled as constant current. Used only if the useExponentModel is false.    This value is noralized against the sum of qZ, qI, and qP.'"
	 * @generated
	 */
	float getQConstantCurrent();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QConstant Current</em>' attribute.
	 * @see #getQConstantCurrent()
	 * @generated
	 */
	void setQConstantCurrent(float value);

	/**
	 * Returns the value of the '<em><b>PConstant Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PConstant Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PConstant Power</em>' attribute.
	 * @see #setPConstantPower(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_PConstantPower()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Portion of active power load modeled as constant power. Used only if the useExponentModel is false.    This value is noralized against the sum of pZ, pI, and pP.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Portion of active power load modeled as constant power. Used only if the useExponentModel is false.    This value is noralized against the sum of pZ, pI, and pP.'"
	 * @generated
	 */
	float getPConstantPower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PConstant Power</em>' attribute.
	 * @see #getPConstantPower()
	 * @generated
	 */
	void setPConstantPower(float value);

	/**
	 * Returns the value of the '<em><b>QConstant Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QConstant Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QConstant Power</em>' attribute.
	 * @see #setQConstantPower(float)
	 * @see gluemodel.CIM.IEC61970.LoadModel.LoadModelPackage#getLoadResponseCharacteristic_QConstantPower()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Portion of reactive power load modeled as constant power. Used only if the useExponentModel is false.    This value is noralized against the sum of qZ, qI, and qP.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Portion of reactive power load modeled as constant power. Used only if the useExponentModel is false.    This value is noralized against the sum of qZ, qI, and qP.'"
	 * @generated
	 */
	float getQConstantPower();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.LoadModel.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QConstant Power</em>' attribute.
	 * @see #getQConstantPower()
	 * @generated
	 */
	void setQConstantPower(float value);

} // LoadResponseCharacteristic
