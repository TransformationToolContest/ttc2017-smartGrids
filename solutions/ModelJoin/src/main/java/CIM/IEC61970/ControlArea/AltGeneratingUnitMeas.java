/**
 */
package CIM.IEC61970.ControlArea;

import CIM.Element;

import CIM.IEC61970.Meas.AnalogValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Generating Unit Meas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getAltGeneratingUnitMeas()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A prioritized measurement to be used for the generating unit in the control area specificaiton.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A prioritized measurement to be used for the generating unit in the control area specificaiton.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A prioritized measurement to be used for the generating unit in the control area specificaiton.' Profile\040documentation='A prioritized measurement to be used for the generating unit in the control area specificaiton.'"
 * @generated
 */
public interface AltGeneratingUnitMeas extends Element {
	/**
	 * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Area Generating Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Area Generating Unit</em>' reference.
	 * @see #setControlAreaGeneratingUnit(ControlAreaGeneratingUnit)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getAltGeneratingUnitMeas_ControlAreaGeneratingUnit()
	 * @see CIM.IEC61970.ControlArea.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas
	 * @model opposite="AltGeneratingUnitMeas"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The control aread generating unit to which the prioritized measurement assignment is applied.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The control aread generating unit to which the prioritized measurement assignment is applied.'"
	 * @generated
	 */
	ControlAreaGeneratingUnit getControlAreaGeneratingUnit();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Area Generating Unit</em>' reference.
	 * @see #getControlAreaGeneratingUnit()
	 * @generated
	 */
	void setControlAreaGeneratingUnit(ControlAreaGeneratingUnit value);

	/**
	 * Returns the value of the '<em><b>Analog Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CIM.IEC61970.Meas.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Value</em>' reference.
	 * @see #setAnalogValue(AnalogValue)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getAltGeneratingUnitMeas_AnalogValue()
	 * @see CIM.IEC61970.Meas.AnalogValue#getAltGeneratingUnit
	 * @model opposite="AltGeneratingUnit"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The specific analog value used as a source.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The specific analog value used as a source.'"
	 * @generated
	 */
	AnalogValue getAnalogValue();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analog Value</em>' reference.
	 * @see #getAnalogValue()
	 * @generated
	 */
	void setAnalogValue(AnalogValue value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see CIM.IEC61970.ControlArea.ControlAreaPackage#getAltGeneratingUnitMeas_Priority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Priority of a measurement usage.   Lower numbers have first priority.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Priority of a measurement usage.   Lower numbers have first priority.'"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link CIM.IEC61970.ControlArea.AltGeneratingUnitMeas#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // AltGeneratingUnitMeas
