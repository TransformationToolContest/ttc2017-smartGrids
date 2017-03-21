/**
 */
package CIM.IEC61970.Wires;

import CIM.IEC61970.Core.ConductingEquipment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectifier Inverter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage <em>Min Compound Voltage</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getMinP <em>Min P</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getMaxU <em>Max U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getMaxP <em>Max P</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getCommutatingReactance <em>Commutating Reactance</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getCommutatingResistance <em>Commutating Resistance</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getMinU <em>Min U</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getBridges <em>Bridges</em>}</li>
 *   <li>{@link CIM.IEC61970.Wires.RectifierInverter#getCompoundResistance <em>Compound Resistance</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Bi-directional AC-DC conversion equipment that can be used to control DC current, DC voltage, DC power flow, or firing angle.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='Bi-directional AC-DC conversion equipment that can be used to control DC current, DC voltage, DC power flow, or firing angle.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Bi-directional AC-DC conversion equipment that can be used to control DC current, DC voltage, DC power flow, or firing angle.' Profile\040documentation='Bi-directional AC-DC conversion equipment that can be used to control DC current, DC voltage, DC power flow, or firing angle.'"
 * @generated
 */
public interface RectifierInverter extends ConductingEquipment {
	/**
	 * Returns the value of the '<em><b>Min Compound Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Compound Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Compound Voltage</em>' attribute.
	 * @see #setMinCompoundVoltage(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_MinCompoundVoltage()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Minimum compounded DC voltage'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Minimum compounded DC voltage'"
	 * @generated
	 */
	float getMinCompoundVoltage();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getMinCompoundVoltage <em>Min Compound Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Compound Voltage</em>' attribute.
	 * @see #getMinCompoundVoltage()
	 * @generated
	 */
	void setMinCompoundVoltage(float value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_MinP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum active power on the DC side at which the converter should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum active power on the DC side at which the converter should operate.'"
	 * @generated
	 */
	float getMinP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getMinP <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min P</em>' attribute.
	 * @see #getMinP()
	 * @generated
	 */
	void setMinP(float value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_MaxU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum voltage on the DC side at which the converter should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum voltage on the DC side at which the converter should operate.'"
	 * @generated
	 */
	float getMaxU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getMaxU <em>Max U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max U</em>' attribute.
	 * @see #getMaxU()
	 * @generated
	 */
	void setMaxU(float value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_OperatingMode()
	 * @model dataType="CIM.IEC61970.Wires.OperatingMode" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Operating mode for the converter.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Operating mode for the converter.'"
	 * @generated
	 */
	String getOperatingMode();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getOperatingMode <em>Operating Mode</em>}' attribute.
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
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_Frequency()
	 * @model dataType="CIM.IEC61970.Domain.Frequency" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Frequency on the AC side.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Frequency on the AC side.'"
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getFrequency <em>Frequency</em>}' attribute.
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
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_MaxP()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The maximum active power on the DC side at which the fconverter should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The maximum active power on the DC side at which the fconverter should operate.'"
	 * @generated
	 */
	float getMaxP();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getMaxP <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max P</em>' attribute.
	 * @see #getMaxP()
	 * @generated
	 */
	void setMaxP(float value);

	/**
	 * Returns the value of the '<em><b>Commutating Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commutating Reactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commutating Reactance</em>' attribute.
	 * @see #setCommutatingReactance(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_CommutatingReactance()
	 * @model dataType="CIM.IEC61970.Domain.Reactance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Commutating reactance at AC bus frequency.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Commutating reactance at AC bus frequency.'"
	 * @generated
	 */
	float getCommutatingReactance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getCommutatingReactance <em>Commutating Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commutating Reactance</em>' attribute.
	 * @see #getCommutatingReactance()
	 * @generated
	 */
	void setCommutatingReactance(float value);

	/**
	 * Returns the value of the '<em><b>Commutating Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commutating Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commutating Resistance</em>' attribute.
	 * @see #setCommutatingResistance(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_CommutatingResistance()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Commutating resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Commutating resistance.'"
	 * @generated
	 */
	float getCommutatingResistance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getCommutatingResistance <em>Commutating Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commutating Resistance</em>' attribute.
	 * @see #getCommutatingResistance()
	 * @generated
	 */
	void setCommutatingResistance(float value);

	/**
	 * Returns the value of the '<em><b>Rated U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated U</em>' attribute.
	 * @see #setRatedU(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_RatedU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Rectifier/inverter primary base voltage'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Rectifier/inverter primary base voltage'"
	 * @generated
	 */
	float getRatedU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getRatedU <em>Rated U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated U</em>' attribute.
	 * @see #getRatedU()
	 * @generated
	 */
	void setRatedU(float value);

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
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_MinU()
	 * @model dataType="CIM.IEC61970.Domain.Voltage" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The minimum voltage on the DC side at which the converter should operate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The minimum voltage on the DC side at which the converter should operate.'"
	 * @generated
	 */
	float getMinU();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getMinU <em>Min U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min U</em>' attribute.
	 * @see #getMinU()
	 * @generated
	 */
	void setMinU(float value);

	/**
	 * Returns the value of the '<em><b>Bridges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridges</em>' attribute.
	 * @see #setBridges(int)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_Bridges()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Number of bridges'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Number of bridges'"
	 * @generated
	 */
	int getBridges();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getBridges <em>Bridges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridges</em>' attribute.
	 * @see #getBridges()
	 * @generated
	 */
	void setBridges(int value);

	/**
	 * Returns the value of the '<em><b>Compound Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Resistance</em>' attribute.
	 * @see #setCompoundResistance(float)
	 * @see CIM.IEC61970.Wires.WiresPackage#getRectifierInverter_CompoundResistance()
	 * @model dataType="CIM.IEC61970.Domain.Resistance" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Compounding resistance.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Compounding resistance.'"
	 * @generated
	 */
	float getCompoundResistance();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Wires.RectifierInverter#getCompoundResistance <em>Compound Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Resistance</em>' attribute.
	 * @see #getCompoundResistance()
	 * @generated
	 */
	void setCompoundResistance(float value);

} // RectifierInverter
