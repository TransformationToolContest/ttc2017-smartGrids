/**
 */
package CIM.IEC61970.Generation.Production;

import CIM.IEC61970.Core.PowerSystemResource;

import CIM.IEC61970.Wires.SynchronousMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Pump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPump#getSynchronousMachine <em>Synchronous Machine</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}</li>
 *   <li>{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPump()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A synchronous motor-driven pump, typically associated with a pumped storage plant'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A synchronous motor-driven pump, typically associated with a pumped storage plant'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A synchronous motor-driven pump, typically associated with a pumped storage plant' Profile\040documentation='A synchronous motor-driven pump, typically associated with a pumped storage plant'"
 * @generated
 */
public interface HydroPump extends PowerSystemResource {
	/**
	 * Returns the value of the '<em><b>Hydro Power Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Power Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Power Plant</em>' reference.
	 * @see #setHydroPowerPlant(HydroPowerPlant)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPump_HydroPowerPlant()
	 * @see CIM.IEC61970.Generation.Production.HydroPowerPlant#getHydroPumps
	 * @model opposite="HydroPumps"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro pump may be a member of a pumped storage plant or a pump for distributing water'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro pump may be a member of a pumped storage plant or a pump for distributing water'"
	 * @generated
	 */
	HydroPowerPlant getHydroPowerPlant();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Power Plant</em>' reference.
	 * @see #getHydroPowerPlant()
	 * @generated
	 */
	void setHydroPowerPlant(HydroPowerPlant value);

	/**
	 * Returns the value of the '<em><b>Synchronous Machine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Wires.SynchronousMachine#getHydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Machine</em>' reference.
	 * @see #setSynchronousMachine(SynchronousMachine)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPump_SynchronousMachine()
	 * @see CIM.IEC61970.Wires.SynchronousMachine#getHydroPump
	 * @model opposite="HydroPump"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The synchronous machine drives the turbine which moves the water from a low elevation to a higher elevation. The direction of machine rotation for pumping may or may not be the same as for generating.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The synchronous machine drives the turbine which moves the water from a low elevation to a higher elevation. The direction of machine rotation for pumping may or may not be the same as for generating.'"
	 * @generated
	 */
	SynchronousMachine getSynchronousMachine();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPump#getSynchronousMachine <em>Synchronous Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous Machine</em>' reference.
	 * @see #getSynchronousMachine()
	 * @generated
	 */
	void setSynchronousMachine(SynchronousMachine value);

	/**
	 * Returns the value of the '<em><b>Pump Disch At Min Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Disch At Min Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Disch At Min Head</em>' attribute.
	 * @see #setPumpDischAtMinHead(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPump_PumpDischAtMinHead()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The pumping discharge (m3/sec) under minimum head conditions, usually at full gate'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The pumping discharge (m3/sec) under minimum head conditions, usually at full gate'"
	 * @generated
	 */
	float getPumpDischAtMinHead();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpDischAtMinHead <em>Pump Disch At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Disch At Min Head</em>' attribute.
	 * @see #getPumpDischAtMinHead()
	 * @generated
	 */
	void setPumpDischAtMinHead(float value);

	/**
	 * Returns the value of the '<em><b>Pump Power At Min Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Power At Min Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Power At Min Head</em>' attribute.
	 * @see #setPumpPowerAtMinHead(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPump_PumpPowerAtMinHead()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The pumping power under minimum head conditions, usually at full gate.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The pumping power under minimum head conditions, usually at full gate.'"
	 * @generated
	 */
	float getPumpPowerAtMinHead();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMinHead <em>Pump Power At Min Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Power At Min Head</em>' attribute.
	 * @see #getPumpPowerAtMinHead()
	 * @generated
	 */
	void setPumpPowerAtMinHead(float value);

	/**
	 * Returns the value of the '<em><b>Pump Power At Max Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Power At Max Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Power At Max Head</em>' attribute.
	 * @see #setPumpPowerAtMaxHead(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPump_PumpPowerAtMaxHead()
	 * @model dataType="CIM.IEC61970.Domain.ActivePower" required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The pumping power under maximum head conditions, usually at full gate'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The pumping power under maximum head conditions, usually at full gate'"
	 * @generated
	 */
	float getPumpPowerAtMaxHead();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpPowerAtMaxHead <em>Pump Power At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Power At Max Head</em>' attribute.
	 * @see #getPumpPowerAtMaxHead()
	 * @generated
	 */
	void setPumpPowerAtMaxHead(float value);

	/**
	 * Returns the value of the '<em><b>Hydro Pump Op Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump <em>Hydro Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Pump Op Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Pump Op Schedule</em>' reference.
	 * @see #setHydroPumpOpSchedule(HydroPumpOpSchedule)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPump_HydroPumpOpSchedule()
	 * @see CIM.IEC61970.Generation.Production.HydroPumpOpSchedule#getHydroPump
	 * @model opposite="HydroPump"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The hydro pump has a pumping schedule over time, indicating when pumping is to occur.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The hydro pump has a pumping schedule over time, indicating when pumping is to occur.'"
	 * @generated
	 */
	HydroPumpOpSchedule getHydroPumpOpSchedule();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPump#getHydroPumpOpSchedule <em>Hydro Pump Op Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Pump Op Schedule</em>' reference.
	 * @see #getHydroPumpOpSchedule()
	 * @generated
	 */
	void setHydroPumpOpSchedule(HydroPumpOpSchedule value);

	/**
	 * Returns the value of the '<em><b>Pump Disch At Max Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pump Disch At Max Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pump Disch At Max Head</em>' attribute.
	 * @see #setPumpDischAtMaxHead(float)
	 * @see CIM.IEC61970.Generation.Production.ProductionPackage#getHydroPump_PumpDischAtMaxHead()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The pumping discharge (m3/sec) under maximum head conditions, usually at full gate'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The pumping discharge (m3/sec) under maximum head conditions, usually at full gate'"
	 * @generated
	 */
	float getPumpDischAtMaxHead();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.Generation.Production.HydroPump#getPumpDischAtMaxHead <em>Pump Disch At Max Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump Disch At Max Head</em>' attribute.
	 * @see #getPumpDischAtMaxHead()
	 * @generated
	 */
	void setPumpDischAtMaxHead(float value);

} // HydroPump
