/**
 */
package gluemodel.CIM.IEC61970.ControlArea;

import gluemodel.CIM.Element;

import gluemodel.CIM.IEC61970.Meas.AnalogValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Tie Meas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaPackage#getAltTieMeas()
 * @model annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='A prioritized measurement to be used for the tie flow as part of the control area specification.'"
 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation='A prioritized measurement to be used for the tie flow as part of the control area specification.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A prioritized measurement to be used for the tie flow as part of the control area specification.' Profile\040documentation='A prioritized measurement to be used for the tie flow as part of the control area specification.'"
 * @generated
 */
public interface AltTieMeas extends Element {
	/**
	 * Returns the value of the '<em><b>Analog Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.Meas.AnalogValue#getAltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analog Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analog Value</em>' reference.
	 * @see #setAnalogValue(AnalogValue)
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaPackage#getAltTieMeas_AnalogValue()
	 * @see gluemodel.CIM.IEC61970.Meas.AnalogValue#getAltTieMeas
	 * @model opposite="AltTieMeas"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The specific analog value used as a source.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The specific analog value used as a source.'"
	 * @generated
	 */
	AnalogValue getAnalogValue();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getAnalogValue <em>Analog Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analog Value</em>' reference.
	 * @see #getAnalogValue()
	 * @generated
	 */
	void setAnalogValue(AnalogValue value);

	/**
	 * Returns the value of the '<em><b>Tie Flow</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gluemodel.CIM.IEC61970.ControlArea.TieFlow#getAltTieMeas <em>Alt Tie Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tie Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Flow</em>' reference.
	 * @see #setTieFlow(TieFlow)
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaPackage#getAltTieMeas_TieFlow()
	 * @see gluemodel.CIM.IEC61970.ControlArea.TieFlow#getAltTieMeas
	 * @model opposite="AltTieMeas"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='The tie flow of the alternate measurements.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='The tie flow of the alternate measurements.'"
	 * @generated
	 */
	TieFlow getTieFlow();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getTieFlow <em>Tie Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tie Flow</em>' reference.
	 * @see #getTieFlow()
	 * @generated
	 */
	void setTieFlow(TieFlow value);

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
	 * @see gluemodel.CIM.IEC61970.ControlArea.ControlAreaPackage#getAltTieMeas_Priority()
	 * @model required="true"
	 *        annotation="http://iec.ch/TC57/2009/CIM-schema-cim14 Documentation='Priority of a measurement usage.   Lower numbers have first priority.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='Priority of a measurement usage.   Lower numbers have first priority.'"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link gluemodel.CIM.IEC61970.ControlArea.AltTieMeas#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // AltTieMeas
